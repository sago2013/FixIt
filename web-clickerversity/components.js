angular.module('components', [])

.directive("teacherLogin", function(){
     return {
       restric:'E',
       templateUrl: "teacher-login.html"
     };
   })

.directive("studentLogin", function(){
     return {
       restrict:'E',
       templateUrl: "student-login.html"
     };
   })
.directive("tabs", function() {
         return {
           restrict: "E",
           templateUrl: "tabs.html",
           controller: function() {
             this.tab = 1;

             this.isSet = function(checkTab) {
               return this.tab === checkTab;
             };

             this.setTab = function(activeTab) {
               this.tab = activeTab;
             };
           },
           controllerAs: "tab"
         };
       });
