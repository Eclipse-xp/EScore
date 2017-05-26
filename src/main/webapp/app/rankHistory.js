window.onload = function(){
	Vue.use(VueHighcharts);

	var options = {
	  title: {
	    text: '排名历史趋势图',
	    x: -20 //center
	  },
	  subtitle: {
	    text: 'EScore',
	    x: -20
	  },
	  xAxis: {
	    categories: []
	  },
	  yAxis: {
		reversed: true,
	    title: {
	      text: '名次'
	    },
	    plotLines: [{
	      value: 0,
	      width: 1,
	      color: '#808080'
	    }]
	  },
	  tooltip: {
	    valueSuffix: ''
	  },
	  legend: {
	    layout: 'vertical',
	    align: 'right',
	    verticalAlign: 'middle',
	    borderWidth: 0
	  },
	  series: []
	  // series: new Array()
	};

	var vm = new Vue({
	  el: '#app',
	  data: {
	    options: options
	  },
	  beforeCreate:function(){
//		  var self = this;
		  var request = getRequest();
		  var studentId = request['studentIds'];
		  axios.get('score/rankHistory?studentIds=' + studentId)
		  	.then(function(response){
				rankHistory = response.data.result.list;//all history(maybe include many guys)
				var xCategories = [];
				rankHistory.forEach(function(personData,index,array){//data of each man include {name:"",history[{class_rank:"",examDate:""},...]}
					var rankArray = [];
					var dateArray = [];
					options.series.push({});
					options.series[index].name = personData.name;

					personData.history.forEach(function(item,hindex,array2){//prepare line configuration for one person
						rankArray.push(item.class_rank);					
						dateArray.push(item.examDate);						
					});
					options.series[index].data = rankArray;
					xCategories = xCategories.length >= dateArray.length?xCategories:dateArray;
					options.xAxis.categories = xCategories;
				});
			})
			.catch(function(error){
				alert(error);
			});
	  },
	  methods: {
	  	
	  }
	});

}
