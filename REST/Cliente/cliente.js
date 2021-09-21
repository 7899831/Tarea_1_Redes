$('#verificar').click(regresarRut);
$('#separar').click(regresarNombre); 

function regresarRut(){
    $.ajax({
        url:'rest.php',
        type: 'post',
        dataType:'json',
        data:{
            rut:$('#rut').val(),
            verificador:$('#verificador').val()
        }
    }).done(
        function(data){
            $('#salida').append(data);
            $('#rut').val('');
            $('#verificador').val('');
        }
    );
}

function regresarNombre(){
    $.ajax({
        url:'prueba.php',
        type: 'post',
        dataType:'json',
        data:{
            nombre:$('#nombre').val(),
        }
    }).done(
        function(data){
            $('#Salida').append(data);
            $('#nombre').val('');
        }
    );
}