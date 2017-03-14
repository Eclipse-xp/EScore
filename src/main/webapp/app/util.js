function getRequest() {
   var url = location.search;
   var theRequest = new Object();
   if (url.indexOf("?") != -1) {
      var str = url.substr(1);
      strs = str.split("&");
      for(var i = 0; i < strs.length; i ++) {
    	  var array = strs[i].split("=");
//         theRequest[array[0]]=unescape(array[1]);
    	  theRequest[array[0]]=array[1];
      }
   }
   return theRequest;
}