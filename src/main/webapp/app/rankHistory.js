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
	  series: [{
	    name: '班级排名',
	    data: []
	  }]
	};

	var vm = new Vue({
	  el: '#app',
	  data: {
	    options: options
	  },
	  beforeCreate:function(){
//		  var self = this;
		  axios.get('score/rankHistory?studentId=TSZ150405070Q')
		  	.then(function(response){
				rankHistory = response.data.result.list;
				var rankArray = [];
				var dateArray = [];
				rankHistory.forEach(function(item,index,array){
					rankArray.push(item.class_rank);
					dateArray.push(item.examDate);
				});
				options.series[0].data = rankArray;
				options.xAxis.categories = dateArray;
			})
			.catch(function(error){
				alert(error);
			});
	  },
	  methods: {
	  	updateCredits: function() {
	    	var chart = this.$refs.highcharts.chart;
	      chart.credits.update({
	        style: {
	          color: '#' + (Math.random() * 0xffffff | 0).toString(16)
	        }
	      });
	    }
	  }
	});

}
