$(function () {
    $("#frmClienteRut").bind("submit", function () {
        return Create();
    });
    function Create() {
        $.ajax({
            url: 'cliente.do',
            type: 'POST',
            data: {
                digiRut: $("#txtDigitoRut").val(),
                veriRut: $("#txtVerificadorRut").val()
            },
            success: function (responseText) {
            }
        });
    }
    List();
    function List() {
        $.ajax({
            url: 'cliente.do',
            data: {},
            type: 'GET',
            dataType: 'json',
            success: function (respJson) {
                $("#tblListRut").html("");
                $("#tblListRut").html(
                        "<thead>" +
                        "<tr>" +
                        "<th>DigitosRut</th>" +
                        "<th>VerificadorRut</th>" +
                        "<th>Validación</th>" +
                        "</tr>" +
                        "</thead>" +
                        "<tbody>" +
                        "</tbody>"
                        );
                for (var i in respJson) {
                    var rut = respJson[i];
                    $("#tblListRut tbody").append(
                            "<tr>" +
                            "<td>" + rut.digitosRut + "</td>" +
                            "<td>" + rut.verificadorRut + "</td>" +
                            "<td>" + rut.comparadorRut + "</td>" +
                            "</tr>"
                            );
                }
            }
        });
    }
});