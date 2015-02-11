'use strict';
var mainIndexVar = angular.module('mainIndexApp', []);

mainIndexVar.controller('initController',
    function($scope) {
        console.log('init ...');
        $scope.message = "Rana Das";
    }
);

mainIndexVar.controller('userController',
    function ($scope, $http) {
        console.log('in userController!!')
    }
);

$(document).ready(function () {
    console.log("in document.ready!");
});
