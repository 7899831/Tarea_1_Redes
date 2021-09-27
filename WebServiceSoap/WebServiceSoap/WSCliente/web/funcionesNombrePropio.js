$(function () {
    $("#frmClienteNombre").bind("submit", function () {
        return Create();
    });
    function Create() {
        $.ajax({
            url: 'clientenombre.do',
            type: 'POST',
            data: {
                nomcom: $("#txtNombreCompleto").val()
            },
            success: function (responseText) {
            }
        });
    }
    List();
    function List() {
        $.ajax({
            url: 'clientenombre.do',
            data: {},
            type: 'GET',
            dataType: 'json',
            success: function (respJson) {
                $("#tblListNombre").html("");
                $("#tblListNombre").html(
                        "<thead>" +
                        "<tr>" +
                        "</tr>" +
                        "</thead>" +
                        "<tbody>" +
                        "</tbody>"
                        );
                for (var i in respJson) {
                    var nombrecompleto = respJson[i];
                    k=0;
                    $("#tblListNombre tbody").append(
                            "<tr>" +
                            "<td>"+ "<strong>" + "Nombres" + "</strong>" +"</td>" +
                            "</tr>"
                            );
                    for (var j in nombrecompleto){
                        var dato = nombrecompleto[j];
                        if(k===1){
                            for (var k in dato){
                                var objeto = dato[k];
                                $("#tblListNombre tbody").append(
                                    "<tr>" +
                                    "<td>" + objeto + "</td>" +
                                    "</tr>"
                                );
                            }   
                        }
                        k++;
                    }
                    $("#tblListNombre tbody").append(
                            "<tr>" +
                            "<td>"+ "<strong>" + "Apellidos" + "</strong>" +"</td>" +
                            "</tr>"
                            );
                    k=0;
                    for (var j in nombrecompleto){
                        var dato = nombrecompleto[j];
                        if(k===0){
                            for (var k in dato){
                                var objeto = dato[k];
                                $("#tblListNombre tbody").append(
                                    "<tr>" +
                                    "<td>" + objeto + "</td>" +
                                    "</tr>"
                                );
                            }
                        }
                        k++;
                    }
                }
            }
        });
    }
});