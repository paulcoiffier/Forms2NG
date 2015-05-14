/**
 * Created by paulcoiffier on 11/12/2014.
 */

angular.module('myApp')
    .directive('loading', function () {
        return {
            restrict: 'E',
            replace: true,
            template: '<div class="loading"><img src="img/loading_anim.gif" width="40px"/>Veuillez patienter...</div>',
            link: function (scope, element, attr) {
                scope.$watch('loading', function (val) {
                    if (val)
                        $(element).show();
                    else
                        $(element).hide();
                });
            }
        }
    })

    .controller('formController', function ($scope, $routeParams, formsService, $sce) {
        /** Panel Accordion */
        $scope.server = "37.187.120.63";
        $scope.oneAtATime = true;
        $scope.formName = $routeParams.formName;
        $scope.loading = true;
        /** Block selectionné pour affichage des informations */
        $scope.selectedBlockName = "";

        /** Statut du panel accordion */
        $scope.status = {
            isFirstOpen: true,
            isFirstDisabled: false
        };

        /** Stats sur le FORMS */
        var promise = formsService.getStatsForForms($scope.server, $scope.formName);
        promise.then(function (resultat) {
            $scope.formStats = resultat;
        }, function (reason) {
            /**$scope.showAlertErrorNetwork();**/
            alert("Erreur réseau 'getStatsForForms' : " + reason);
        });

        /** Liste des BLOCKS du FORMS */
        var promise = formsService.getBlocksForForms($scope.server, $scope.formName);
        promise.then(function (resultat) {
            $scope.blocks = resultat;
            $scope.loading = false;
        }, function (reason) {
            alert("Erreur réseau 'getBlocksForForms' : " + reason);
        });

        /** Triggers pour un BLOCKS FORMS */
        //if ($scope.selectedBlockName.length > 0) {

        //}


        /** Affichage des informations sur un block */
        $scope.getBlockInfos = function ($blockObject) {
            $scope.selectedBlockName = $blockObject;
            /** Appel service pour infos sur le block */
            var promise = formsService.getBlockByName($scope.server, $scope.formName, $scope.selectedBlockName);
            promise.then(function (resultat) {
                $scope.currentBlockData = resultat;
            }, function (reason) {
                alert("Erreur réseau 'getBlockInfos' : " + reason);
            });

            /** Liste des triggers */
            var promise = formsService.getTriggersForFormsBlock($scope.server, $scope.formName, $scope.selectedBlockName);
            promise.then(function (resultat) {
                $scope.triggersForBlock = resultat;
            }, function (reason) {
                alert("Erreur réseau 'getTriggersForFormsBlock' : " + reason);
            });


        }

    });