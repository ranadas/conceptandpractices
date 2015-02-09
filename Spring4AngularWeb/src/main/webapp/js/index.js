'use strict';
var indexAppVar = angular.module('indexApp', []);

indexAppVar.controller('initController',
    function($scope) {
        console.log('init ...');
        $scope.message = "Rana Das";
    }
);

indexAppVar.controller('userController',
    function ($scope, $http) {
        console.log('in userController!!')
        $scope.dataFromGet = "before calling ";
        $http.get('showdate').
            success(function(data, status, headers, config) {
                console.log('type of data from backend : ' + typeof data);
                console.log("After GET: data from Controller:" + data + "\nand Status: " + status);
                $scope.dataFromGet = data;
            });
    });

$(document).ready(function () {
    console.log("in document.ready!");
//    $.get("showdate.json", function (data, status) {
//        console.log("Data: " + data + "\nand Status: " + status);
//    });

});
