<!DOCTYPE html>
<html ng-app="angMenuApp">
<head>
    <meta charset="utf-8">
    <title>Angular INDEXy</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/navmenu.css" rel="stylesheet">
</head>
<body>

<div id="main" ng-app>
    <!-- The navigation menu will get the value of the "active" variable as a class.
         The $event.preventDefault() stops the page from jumping when a link is clicked. -->

    <nav class="{{active}}" ng-click="$event.preventDefault()">

        <!-- When a link in the menu is clicked, we set the active variable -->

        <a href="#" class="home" ng-click="active='home'">Home</a>
        <a href="#" class="projects" ng-click="active='projects'">Projects</a>
        <a href="#" class="services" ng-click="active='services'">Services</a>
        <a href="#" class="contact" ng-click="active='contact'">Contact</a>
    </nav>

    <!-- ng-show will show an element if the value in the quotes is truthful,
         while ng-hide does the opposite. Because the active variable is not set
         initially, this will cause the first paragraph to be visible. -->

    <p ng-hide="active">Please click a menu item</p>
    <p ng-show="active">You chose <b>{{active}}</b></p>
</div>

<div ng-controller="restDate">
    <p>Date from backend is {{date}}</p>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.min.js"></script>

<script src="/js/ang-navmenu.js"></script>
</body>
</html>