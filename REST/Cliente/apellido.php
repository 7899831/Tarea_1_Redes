<?php

$nombre = $_POST['nombre'];

function separadorApellidos($name){
        $arreglo = explode(" ", $name);
        $largo = sizeof($arreglo);
        $apellidos = [];
        $apellidos[0] = $arreglo[$largo-2];
        $apellidos[1] = $arreglo[$largo-1];

        return $apellidos;
    }

    $Apellidos = separadorApellidos($nombre);
    print_r (json_encode ($Apellidos));
?>