<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html ng-app="indexApp">
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <title>title of index</title>

    <script>
    </script>
</head>
<body>

<div ng-controller="initController">
    <h4> ${msg} {{message}}</h4>
</div>

<div ng-controller="userController">
    Time : {{dataFromGet| date:'yyyy-MM-dd HH:mm:ss'}}
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.min.js"></script>

<%--<script type="text/javascript" src="./js/app__js__"></script>--%>
<script src="/js/index.js"></script>

</body>
</html>
