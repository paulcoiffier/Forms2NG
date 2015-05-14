angular.module('myApp')
    .factory("formsService", function ($http, $q) {

        var service = {
            getStatsForForms: function (server, $formsName) {
                var deffered = $q.defer();
                $http.get('http://' + server + ':8080/forms2ng/rest/forms/stats/' + $formsName)
                    .success(function (data) {
                        deffered.resolve(data);
                    }).error(function (data, status, header, config) {
                        deffered.reject("error");
                    })
                return deffered.promise;
            },
            getBlocksForForms: function (server, $formsName) {
                var deffered = $q.defer();
                $http.get('http://' + server + ':8080/forms2ng/rest/forms/blocks/' + $formsName)
                    .success(function (data) {
                        deffered.resolve(data);
                    }).error(function (data, status, header, config) {
                        deffered.reject("error");
                    })
                return deffered.promise;
            },
            getTriggersForFormsBlock: function (server, $formsName, $blocName) {
                var deffered = $q.defer();
                $http.get('http://' + server + ':8080/forms2ng/rest/forms/triggersforblock/' + $formsName + "/" + $blocName)
                    .success(function (data) {
                        deffered.resolve(data);
                    }).error(function (data, status, header, config) {
                        deffered.reject("error");
                    })
                return deffered.promise;
            },
            getBlockByName: function (server, $formsName, $blocName) {
                var deffered = $q.defer();
                $http.get('http://' + server + ':8080/forms2ng/rest/blocks/' + $formsName + "/" + $blocName)
                    .success(function (data) {
                        deffered.resolve(data);
                    }).error(function (data, status, header, config) {
                        deffered.reject("error");
                    })
                return deffered.promise;
            }
        }

        return service;

    });