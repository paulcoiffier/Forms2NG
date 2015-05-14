/**
 * Created by paulcoiffier on 11/12/2014.
 */
angular.module("myApp", ['ngRoute','ui.bootstrap','ngSanitize']).config(function ($routeProvider) {

    $routeProvider.when('/index', {
        templateUrl: 'js/templates/accueil.html',
        controller: 'menuController'

    }).when('/toto', {
        templateUrl: 'index.html',
        controller: 'menuController'

    }).when('/form/:formName', {
        templateUrl: 'js/templates/viewForm.html',
        controller: 'formController'

    }).otherwise({
        redirectTo: '/index'
    })
});