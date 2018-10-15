var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "main.htm",
    })
    .when("/userdet", {
    	  templateUrl : "userDetdsply.html",
          controller : "myCtrl"
    })
    .when("/userreg", {
    	templateUrl : "userReg.html",
        controller : "regCtrl"
    });
});

app.controller("regCtrl", function ($scope,$http) {
		 
	  $scope.regsubmit = function() {
		             
           var data = $scope.data;
           
			 // alert(data.userName);
			   var config = {
		                headers : {
		                    'Content-Type': 'application/json;charset=utf-8;'
		                }
		            } 
			  
			  /*$http.post('http://localhost:8080/api/userdet/createuser', data, config).success(function (data) {
	            
	            	
	                $scope.PostDataResponse = "Created Succesfully";
	                
	                alert ($scope.PostDataResponse);
	            })
	            */
			   $http.post('http://localhost:8080/api/userdet/createuser', data, config)
			   .then(
			       function(response){
			    	     // $scope.myForm.$setPristine();
			    	   $scope.PostDataResponse = "Created Succesfully";
			    	  // document.location.href = '/paris.htm';
			    	   //$window.location.href = '/adminpag.html';
			       }, 
			       function(response){
			         // failure callback
			       }
			    );
	        };

	    });

app.controller("myCtrl", function ($scope, $http,$window) {
	  $scope.myVar = false;
	 $scope.formsubmit = function() {
		 
		 $scope.myVar = $scope.myVar = true;
		 var baseUrl ='http://localhost:8080/api/userdet/user/'+$scope.firstName +'/'+$scope.lastName;
		// alert(baseUrl);
		 //alert(myVarw);
		  $http.get(baseUrl).
	        then(function(response) {
	        					
	          // $scope.userDetailsLst = response.data;
	        	if(response.data.userRole != 'Admin'){
	        		$scope.userDetailsLst = response.data;
	        	}else {
	        		$window.location.href = '/adminpag.html';	
	        	}
	        	
	        	       
	        });
	   
	   
	 }
});