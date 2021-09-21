$('#verificar').click(regresarRut);
$('#separar').click(regresarNombrecompleto); 

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

function regresarApellido(){
    $.ajax({
        url:'apellido.php',
        type: 'post',
        dataType:'json',
        data:{
            nombre:$('#nombre').val(),
        }
    }).done(
        function(data){
            $('#Salida2').append(data);
            $('#nombre').val('');
        }
    );
}

function regresarNombrecompleto(){
    regresarNombre();
    regresarApellido();
}