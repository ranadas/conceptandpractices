'use strict';
var mainIndexVar = angular.module('mainIndexApp', ['ngRoute']);

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


/**
* Configure the Routes
*/
mainIndexVar.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        // Home
        .when("/", {templateUrl: "/partials/home.html", controller: "PageCtrl"})
        // Pages
        .when("/about", {templateUrl: "/partials/about.html", controller: "PageCtrl"})
        .when("/faq", {templateUrl: "/partials/faq.html", controller: "PageCtrl"})
        .when("/pricing", {templateUrl: "/partials/pricing.html", controller: "PageCtrl"})
        .when("/services", {templateUrl: "/partials/services.html", controller: "PageCtrl"})
        .when("/contact", {templateUrl: "/partials/contact.html", controller: "PageCtrl"})
        // Blog
        .when("/blog", {templateUrl: "/partials/blog.html", controller: "BlogCtrl"})
        .when("/blog/post", {templateUrl: "/partials/blog_item.html", controller: "BlogCtrl"})
        // else 404
        .otherwise("/404", {templateUrl: "/partials/404.html", controller: "PageCtrl"});
}]);
