<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head ng-app="rosterApp">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="description" content="spring angular js index">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/favicon.ico"/>

    <title>Angular - Secured Dashboard</title>
    <title>${title}</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.css"/>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/animate.css/2.0/animate.min.css">
    <link rel="stylesheet" href="/css/main.css"/>

</head>
<body ng-controller="rosterCtrl" class="container">

${message}



<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular-route.js"></script>
<script src="http://code.angularjs.org/1.2.0rc1/angular-animate.min.js"></script>
<script src="http://code.angularjs.org/1.2.0rc1/angular-sanitize.min.js"></script>

<script src="/js/app.js"></script>

</body>
</html>
