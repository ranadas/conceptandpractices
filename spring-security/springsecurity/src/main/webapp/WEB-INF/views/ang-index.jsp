<!DOCTYPE html>
<html ng-app="angIndexApp">
<head>
    <meta charset="utf-8">
    <title>Angular INDEXy</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="css/custom.css" rel="stylesheet">--%>
</head>
<body>


<div class="container"
     ng-init="books=[{'name': 'Effective Java', 'author':'Joshua Bloch'},{'name': 'Year without Pants', 'author':'Scott Berkun'},{ 'name':'Confessions of public speaker','author':'Scott Berkun'},{'name':'JavaScript Good Parts','author':'Douglas Crockford'}]">
    <h4>Your Online Bookshop</h4>

    <input type="search" ng-model="criteria">

    <ul class="unstyled">
        <li ng-repeat="abook in books | filter:criteria | orderBy :'name'">
            <span>{{abook.name}} written by {{abook.author|uppercase}}</span>
        </li>
    </ul>
</div>

<br/><br/>

<div class="container" ng-controller="BookCtrl">
    <ul class="unstyled">
        <li ng-repeat="book in books | orderBy :'name'">
            <span>{{book.name}} written by {{book.author}}</span>
        </li>
    </ul>
</div>

<div ng-app="" ng-controller="personController">

    First Name: <input type="text" ng-model="firstName"><br>
    Last Name: <input type="text" ng-model="lastName"><br>
    <br>
    Full Name: {{firstName + " " + lastName}}

</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.min.js"></script>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular-resource.min.js"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular-cookies.min.js"></script>--%>

<%--<script src="js/config.js"></script>--%>
<script src="/js/ang-index.js"></script>
</body>
</html>