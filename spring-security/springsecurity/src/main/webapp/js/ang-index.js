'use strict';
var angIndexApp = angular.module('angIndexApp', []);

angIndexApp.controller('BookCtrl', function ($scope) {
    $scope.books = [
        {'name': 'Effective Java', 'author': 'Joshua Bloch'},
        {'name': 'Year without Pants', 'author': 'Scott Berkun'},
        { 'name': 'Confessions of public speaker', 'author': 'Scott Berkun'},
        {'name': 'JavaScript Good Parts', 'author': 'Douglas Crockford'}
    ];
});


angIndexApp.controller('personController', function ($scope) {
    $scope.firstName = "John";
    $scope.lastName = "Doe";
    $scope.userName = "skube";
});