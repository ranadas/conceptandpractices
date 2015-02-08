/**
 * Created by rdas on 28/01/2015.
 */
'use strict';
//http://blogs.msmvps.com/deborahk/angularjs-101-ways-to-create-a-controller-actually-8/

var rosterApp = angular.module('rosterApp', ['ngSanitize', 'ngAnimate']);
rosterApp.controller('rosterController', ['$scope', function ($scope) {

    console.log('INit angular module');
    $scope.newPlayer = {};


    $scope.players = [
        {"firstname":"John", "lastname":"Doe", "age":"15", "position":"center", "email":"john@doe.com"},
        {"firstname":"Jack", "lastname":"Black", "age":"16", "position":"point guard", "email":"jack@black.com"},
        {"firstname":"Randall", "lastname":"Good", "age":"15", "position":"forward", "email":"r@good.com"}
    ];
    $scope.addPlayer = function() {
        $scope.players.push($scope.newPlayer);
        $scope.newPlayer = {};
    };

    $scope.removePlayer = function(player) {
        if(confirm("Are you sure?")) {
            $scope.players.splice($scope.players.indexOf(player), 1);
        }
    };


}]);
