angular.module('myApp')
    .factory("menuService", function ($http, $q) {

        var service = {
            getFormsMenuListe: function (server) {
                var deffered = $q.defer();
                $http.get('http://37.187.120.63:8080/forms2ng/rest/menu/')
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