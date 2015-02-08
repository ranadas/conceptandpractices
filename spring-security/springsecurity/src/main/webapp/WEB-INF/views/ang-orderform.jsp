<!DOCTYPE html>
<html ng-app="orderFormApp">
<head>
    <meta charset="utf-8">
    <title>Angular ORDEr fORM</title>
    <%--<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="/css/orderform.css" rel="stylesheet">
</head>
<body>

<form ng-app ng-controller="OrderFormController">
    <h4>Services</h4>

    <ul>
        <!-- Loop through the services array, assign a click handler, and set or
            remove the "active" css class if needed -->
        <li ng-repeat="service in services" ng-click="toggleActive(service)" ng-class="{active:service.active}">
            <!-- Notice the use of the currency filter, it will format the price -->
            {{service.name}} <span>{{service.price | currency:'&euro;'}}</span>
        </li>
    </ul>

    <div class="total">
        <!-- Calculate the total price of all chosen services. Format it as currency. -->
        Total: <span>{{total() | currency:'&euro;'}}</span>
    </div>

</form>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.min.js"></script>

<script src="/js/ang-orderform.js"></script>
</body>
</html>