'use strict';
var angMenuApp = angular.module('angMenuApp', []);

angMenuApp.controller('BookCtrl', function ($scope) {
    $scope.books = [
        {'name': 'Effective Java', 'author': 'Joshua Bloch'},
        {'name': 'Year without Pants', 'author': 'Scott Berkun'},
        { 'name': 'Confessions of public speaker', 'author': 'Scott Berkun'},
        {'name': 'JavaScript Good Parts', 'author': 'Douglas Crockford'}
    ];


});


angMenuApp.controller('restDate', function ($scope, $http) {

    console.log(' in dest date');
    $scope.date = 'some date';

//    $http.get('/showdate').
//        success(function(data, status, headers, config) {
//            console.log('data : '+data + ', status : '+status);
////            $scope.date = data;
//        }).
//        error(function(data, status, headers, config) {
//            console.log('data : '+data + ', status : '+status);
//        });




});

angMenuApp.module('hello', []).controller('home', function($scope, $http) {
    $http.get('/resource/').success(function(data) {
        $scope.greeting = data;
    })
});




//angMenuApp.controller('postDate', function($scope, $http){
//    $http.post('/someUrl', {msg:'hello word!'}).
//        success(function(data, status, headers, config) {
//            // this callback will be called asynchronously
//            // when the response is available
//        }).
//        error(function(data, status, headers, config) {
//            // called asynchronously if an error occurs
//            // or server returns response with an error status.
//        });
//});

//function restDate($scope, $http) {
//    $http.get('/getdate').
//        success(function(data) {
//            $scope.date = data;
//        });
//}
