/**
 * Created by paulcoiffier on 11/12/2014.
 */

angular.module('myApp')
    .controller('menuController', function ($scope, $location, menuService) {
        $scope.server = "37.187.120.63";

        var promise = menuService.getFormsMenuListe($scope.server);
        promise.then(function (resultat) {
            $scope.menus = resultat;
        }, function (reason) {
            /**$scope.showAlertErrorNetwork();**/
            alert("Erreur réseau : " + reason);
        });
    })