<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="description" content="spring angular js index">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/favicon.ico" />

    <title>Angular - index</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.css"/>
    <link rel="stylesheet" href="css/main.css"/>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.js"></script>
</head>
<body ng-app>
    Using hosted libs from https://cdnjs.com/
    <p>
        ${message}
    </p>

    <p>Enter some text: <input type="text" ng-model="myname"></p>

    <p>Hello {{myname}}!!</p>

    <div id="parent">
        <img src="<c:url value="/simgs/anglogo.png"/>" style="width: 50%; height: 50%"/>
    </div>
</body>
</html>
