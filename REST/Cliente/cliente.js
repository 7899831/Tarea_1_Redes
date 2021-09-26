$('#verificar').click(regresarRut);
$('#separar').click(regresarNombre); 
$('#limpiarRut').click(limpiarRut);
$('#limpiarNombre').click(limpiarNombre);

function regresarRut(){
    if ($('#rut').val() === "" || $('#verificador').val() === ""){
        $(".salida").empty();
    }

    else{
        $.ajax({
            url:"../Servidor/public/api/rut.php",
            type: 'post',
            dataType:'json',
            data:{
                rut:$('#rut').val(),
                verificador:$('#verificador').val()
            }
        }).done(
            function(data){
                $(".salida").empty();
                $('#salida').append(data);
            }
        );
    }
}

function regresarNombre(){
    $.ajax({
        url: "../Servidor/public/api/nombre.php",
        type: 'post',
        dataType:'json',
        data:{
            nombre:$('#nombre').val(),
        }
    }).done(
        function(data){
            $(".Salida").empty();
            const lista = data.nombres.map((user) => `<li>${user}</li>`);
            $('#Salida').append(lista);
            },
        function(data){
            $(".Salida2").empty();
            const lista = data.apellidos.map((user) => `<li>${user}</li>`);
            $('#Salida2').append(lista);
        }
    );
}

function limpiarRut(){

    $('#rut').val('');
    $('#verificador').val('');
    $(".salida").empty();
}

function limpiarNombre(){
  
    $('#nombre').val('');
    $(".Salida").empty();
    $(".Salida2").empty();
}



