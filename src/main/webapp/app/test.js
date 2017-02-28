window.onload=function(){
	var app = new Vue({
		el: '#app',
		data: {
			message: 'Hello Vue!'
		}
	});
	
	var app2 = new Vue({
		el: '#app-2',
		data:{
			message: new Date()
		}
	});
	
	var app4 = new Vue({
		  el: '#app-4',
		  data: {
		    todos: [
		      { seen: true, text: 'Learn JavaScript' },
		      { seen: false, text: 'Learn Vue' },
		      { seen: true, text: 'Build something awesome' }
		    ]
		  }
	});
	
	var app5 = new Vue({
		  el: '#app-5',
		  data: {
		    message: 'Hello Vue.js!'
		  },
		  methods: {
		    reverseMessage: function () {
		      this.message = this.message.split('').reverse().join('')
		    }
		  }
	});
	
	var app6 = new Vue({
		  el: '#app-6',
		  data: {
		    message: 'Hello Vue!'
		  }
	});
	
	Vue.component('todo-item', {
		  props: ['todo'],
		  template: '<li>{{ todo.text }}</li>'
		})
	var app7 = new Vue({
		  el: '#app-7',
		  data: {
		    groceryList: [
		      { text: 'Vegetables' },
		      { text: 'Cheese' },
		      { text: 'Whatever else humans are supposed to eat' }
		    ]
		  }
	});
	
	
};