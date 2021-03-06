<!DOCTYPE html>
<html data-ng-app="angIndexApp">
<head>
    <meta charset="utf-8">
    <title>Angular welcome</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/main.css">

</head>
<body class="container">


<div data-ng-controller="help">
    <div id="messages" class="alert alert-success" data-ng-show="messages" data-ng-bind="messages"></div>
    <div data-ng-show="progress.active()" style="color: red; font-size: 50px;">Sending&hellip;</div>

    <form name="helpForm" novalidate role="form">
        <div class="form-group">
            <label for="name">Your Name </label>
            <span class="label label-danger" data-ng-show="submitted && helpForm.name.$error.required">Required!</span>
            <input type="text" id="name" name="name" data-ng-model="name" class="form-control" required/>
        </div>

        <div class="form-group">
            <label for="email">Your E-mail address</label>
            <span class="label label-danger" data-ng-show="submitted && helpForm.email.$error.required">Required!</span>
            <span class="label label-danger" data-ng-show="submitted && helpForm.$error.email">Invalid email!</span>
            <input type="email" id="email" name="email" data-ng-model="email" class="form-control" required/>
        </div>

        <div class="form-group">
            <label for="subjectList">What is the nature of your request?</label>
            <span class="label label-danger"
                  data-ng-show="submitted && helpForm.subjectList.$error.required">Required!</span>
            <select name="subjectList" data-ng-model="subjectList" id="subjectList"
                    data-ng-options="id as value for (id, value) in subjectListOptions" class="form-control" required>
                <option value=""></option>
            </select>
        </div>

        <div class="form-group">
            <label for="url">URL of Relevant Page</label>
            <span class="label label-danger" data-ng-show="submitted && helpForm.$error.url">Invalid URL format!</span>
            <input type="url" id="url" name="url" data-ng-model="url" class="form-control"/>
        </div>

        <div class="form-group">
            <label for="comments">Description</label>
            <span class="label label-danger" id="comments"
                  data-ng-show="submitted && helpForm.comments.$error.required">Required!</span>
            <textarea name="comments" data-ng-model="comments" class="form-control" required></textarea>
        </div>

        <button data-ng-disabled="progress.active()" data-ng-click="submit(helpForm)" class="btn btn-default">Submit
        </button>
    </form>
</div>


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.11/angular.min.js"></script>
<script src="/js/promise-tracker.js"></script>
<script src="/js/promise-tracker-http-interceptor.js"></script>

<script src="/js/welcome.js"></script>
</body>
</html>