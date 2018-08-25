$(document).ready(function () {
    LlenarCampos();
});

function LlenarCampos(){
    FillList(5, $("#sltTipoVehiculo"));
    FillList(4, $("#sltCombustible"));
    FillList(3, $("#sltTransmision"));
    FillTarifa();
}
function FillTarifa(){
     $.ajax({
        type: 'GET',
        url: "http://localhost:8080/ShareCar/webresources/Parameters/FindType/",
        dataType: "json",
        success: function (data) {
            $.each(data, function (i, contact) {
                $("#sltTarifa").append(
                    "<option value='" + contact.idDataType + "'>" + contact.nombreDataType + "</option>");
            });
        }
    });
}
function FillList(idDataMaster, control) {
    $.ajax({
        type: 'GET',
        url: "http://localhost:8080/ShareCar/webresources/Parameters/FindType/" + idDataMaster,
        dataType: "json",
        success: function (data) {
            $.each(data, function (i, contact) {
                $(control).append(
                        "<option value='" + contact.idDataType + "'>" + contact.nombreDataType + "</option>");
            });
        }
    });
}
;