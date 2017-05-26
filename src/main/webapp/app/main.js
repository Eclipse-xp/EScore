window.onload=function(){
	
	var idPool = [];//cache the student ids that have been filtered
	// register the grid component
	Vue.component('demo-grid', {
	  el: 'grid-template',
	  props: {
	    data: Array,
	    columns: Array,
	    filterKey: String
	  },
	  data: function () {
	    var sortOrders = {}
	    this.columns.forEach(function (key) {
	      sortOrders[key] = 1;
	    })
	    return {
	      sortKey: '',
	      sortOrders: sortOrders,
	      columnMap:{
	    	  name: "姓名",
	    	  power: "分数"
	      }
	    }
	  },
	  computed: {
	    filteredData: function () {
	    	idPool = [];
	      	var sortKey = this.sortKey;
	      	var filterKey = this.filterKey && this.filterKey.toLowerCase();
	      	var order = this.sortOrders[sortKey] || 1;
	      	var data = this.data;
	      	if (filterKey) {
	        data = data.filter(function (row) {
	          return Object.keys(row).some(function (key) {
	        	var keyArray = filterKey.split(" ");
	        	var flag = false;
	        	keyArray.forEach(function(item,index,array){
	        		flag = flag || String(row[key]).toLowerCase().indexOf(item) > -1;
				});
				if (flag) {
					idPool.push(row["student_id"]);
				}
	            return flag;
	          })
	        })
	      }
	      if (sortKey) {
	        data = data.slice().sort(function (a, b) {
	          a = a[sortKey];
	          b = b[sortKey];
	          return (a === b ? 0 : a > b ? 1 : -1) * order;
	        })
	      }
	      return data
	    }
	  },
	  filters: {//may be used for text formatting
	    capitalize: function (str) {
	    	var columnMap={
	    			name: "姓名",
	    			class_rank: "班级名次",
	    			math:"数学",
	    			chinese:"语文",
	    			english:"英语",
	    			physics:"物理",
	    			chemistry:"化学",
	    			biology:"生物"
	    	}
	    	return columnMap[str]
	    }
	  },
	  methods: {//will rerender every time
	    sortBy: function (key) {
	      this.sortKey = key;
	      this.sortOrders[key] = this.sortOrders[key] * -1;
	    },
	    toRankHistory: function(entry,key){
	    	if(key === "name"){
	    		location.href = "rankHistory.html?studentIds="+entry["student_id"];
	    	}
	    }
	  }
	});

	// bootstrap the demo
	var demo = new Vue({
	  el: '#demo',
	  data: {
	    searchQuery: '',
	    gridColumns: ['name', 'class_rank','math','chinese','english','physics','chemistry','biology'],
	    gridData:[]
	  },
	  created: function(){
		  var self = this;
		  axios.get('score/list?classId=TSZ1506&examDate=2017-02-24')
		  	.then(function(response){
				scoreList = response.data.result.list;
//				self.$set('gridData',scoreList);
				self.gridData = scoreList;
			})
			.catch(function(error){
				alert(error);
			});
	   },
	   methods:{
	   	compareThem: function(){
	    	location.href = "rankHistory.html?studentIds="+idPool;
	    }
	   }
	});
};