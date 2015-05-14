
angular.module("myApp", ['ngRoute','ui.bootstrap']).config(function ($routeProvider) {
    $routeProvider.when('/index', {
        templateUrl: 'index.html',
        controller: 'menuController'

    }).when('/toto', {
        templateUrl: 'index.html',
        controller: 'menuController'

    }).when('/form', {
        templateUrl: 'js/templates/viewForm.html',
        controller: 'menuController'

    }).otherwise({
        redirectTo: '/index'
    })
});