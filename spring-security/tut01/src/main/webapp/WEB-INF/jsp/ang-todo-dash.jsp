<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head ng-app="rosterApp">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="description" content="spring angular js index">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/favicon.ico"/>

    <title>Angular - Dashboard</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.css"/>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/animate.css/2.0/animate.min.css">
    <link rel="stylesheet" href="css/main.css"/>

</head>
<body ng-controller="rosterCtrl" class="container">

<div class="page-header"><h1>Team Roster <small>Basketball</small></h1></div>

<h4>New Player</h4>
<form class="form-inline" role="form" ng-submit="addPlayer()">
    <div class="form-group">
        <label class="sr-only" for="firstname">First name</label>
        <input type="text" ng-model="newPlayer.firstname" class="form-control" id="firstname" placeholder="Enter first name">
    </div>
    <div class="form-group">
        <label class="sr-only" for="lastname">Last name</label>
        <input type="text" ng-model="newPlayer.lastname" class="form-control" id="lastname" placeholder="Enter last name">
    </div>
    <div class="form-group">
        <label class="sr-only" for="age">Age</label>
        <input type="number" ng-model="newPlayer.age" class="form-control" id="age" placeholder="Enter age">
    </div>
    <div class="form-group">
        <label class="sr-only" for="email">Email</label>
        <input type="email" ng-model="newPlayer.email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
        <select class="form-control" ng-model="newPlayer.position">
            <option value="point guard">Point guard</option>
            <option value="shooting guard">Shooting guard</option>
            <option value="wing">Wing</option>
            <option value="forward">Forward</option>
            <option value="center">Center</option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Add</button>
</form>

<hr />

<table ng-cloak class="table table-hover table-condensed" ng-show="players.length">
    <thead><tr>
        <th><a href="" ng-click="predicate='firstname'; reverse=!reverse">
            First Name <span ng-class="{'glyphicon glyphicon-chevron-down': predicate=='firstname' && reverse, 'glyphicon glyphicon-chevron-up': predicate=='firstname' && !reverse}"></span></a>
        </th>
        <th><a href="" ng-click="predicate='lastname'; reverse=!reverse">
            Last Name <span ng-class="{'glyphicon glyphicon-chevron-down': predicate=='lastname' && reverse, 'glyphicon glyphicon-chevron-up': predicate=='lastname' && !reverse}"></span></a>
        </th>
        <th>Age</th>
        <th>Position</a></th>
        <th>Email</a></th>
        <th></th>
    </tr></thead>
    <tr ng-repeat="player in players | orderBy:predicate:reverse" class="player">
        <td>{{player.firstname}}</td>
        <td>{{player.lastname}}</td>
        <td>{{player.age}}</td>
        <td>{{player.position | uppercase}}</td>
        <td ng-bind-html="player.email | linky"></td>
        <td>
            <button class="btn btn-danger" ng-click="removePlayer(player)"><span class="glyphicon glyphicon-remove"></span> Remove</button>
        </td>
    </tr>
</table>

<div class="alert alert-info" ng-hide="players.length" ng-cloak>
    <strong>No players on the roster.</strong> Please add players. :)
</div>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular-route.js"></script>
<script src="http://code.angularjs.org/1.2.0rc1/angular-animate.min.js"></script>
<script src="http://code.angularjs.org/1.2.0rc1/angular-sanitize.min.js"></script>

<script src="/js/app.js"></script>
<%--<script src="/js/controllers.js"></script>--%>
<%--<script src="/js/services.js"></script>--%>

</body>
</html>
