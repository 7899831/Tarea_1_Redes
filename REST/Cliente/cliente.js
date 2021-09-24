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
            url:'restrut.php',
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
        url:'restnombreapellido.php',
        type: 'post',
        dataType:'json',
        data:{
            nombre:$('#nombre').val(),
        }
    }).done(
        function(data){
            $(".Salida").empty();
            $('#Salida').append(data.nombre);
        },
        function(data){
            $(".Salida2").empty();
            $('#Salida2').append(data.apellido);
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



