'use strict';
var angIndexApp = angular.module('angIndexApp', ['ajoslin.promise-tracker']);


angIndexApp.controller('help', function ($scope, $http, $log, promiseTracker, $timeout) {

//    $scope.subjectListOptions = {
//        'bug': 'Report a Bug',
//        'account': 'Account Problems',
//        'mobile': 'Mobile',
//        'user': 'Report a Malicious User',
//        'other': 'Other'
//    };

    $http.get('subjects.json').
        success(function(data, status, headers, config) {
            console.log("After GET: data from Controller:" + data + "\nand Status: " + status);
            $scope.subjectListOptions = data;
        });

    // Inititate the promise tracker to track form submissions.
    $scope.progress = promiseTracker();


    // Form submit handler.
    $scope.submit = function(form) {
        // Trigger validation flag.
        $scope.submitted = true;

        // If form is invalid, return and let AngularJS show validation errors.
        if (form.$invalid) {
            return;
        }

        // Default values for the request.
        var config = {
            params : {
                'callback' : 'JSON_CALLBACK',
                'name' : $scope.name,
                'email' : $scope.email,
                'subjectList' : $scope.subjectList,
                'url' : $scope.url,
                'comments' : $scope.comments
            },
        };

        var $promise = $http.post('welcome').
            success(function (data, status, headers, config) {
                console.log('type of data from backend : ' + typeof data);
                console.log("After GET: data from Controller:" + data + "\nand Status: " + status);
                $scope.dataFromGet = data;
                if (data.status == 'OK') {
                    $log.info('SUCCESS : '+ data);
                } else {
                    $log.error(data);
                }
            });

        // Perform JSONP request.
//        var $promise = $http.jsonp('welcome', config)
//            .success(function(data, status, headers, config) {
//                if (data.status == 'OK') {
//                    $scope.name = null;
//                    $scope.email = null;
//                    $scope.subjectList = null;
//                    $scope.url = null;
//                    $scope.comments = null;
//                    $scope.messages = 'Your form has been sent!';
//                    $scope.submitted = false;
//                } else {
//                    $scope.messages = 'Oops, we received your request, but there was an error processing it.';
//                    $log.error(data);
//                }
//            })
//            .error(function(data, status, headers, config) {
//                $scope.progress = data;
//                $scope.messages = 'There was a network error. Try again later.';
//                $log.error(data);
//            })
//            .finally(function() {
//                // Hide status messages after three seconds.
//                $timeout(function() {
//                    $scope.messages = null;
//                }, 3000);
//            });
//
        // Track the request and show its progress to the user.
        $scope.progress.addPromise($promise);
    };



});