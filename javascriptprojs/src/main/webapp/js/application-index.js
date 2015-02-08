

$(document).ready(function() {
    
    console.log(' here1');      
    function viewModel() {
       console.log(' here in view model');
        this.dayOfWeek = ko.observable('Sunday');
        this.activity = ko.observable('rest');
    };    
    
    ko.applyBindings(new viewModel()); 
});
