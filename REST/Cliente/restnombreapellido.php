<?php

    $nombre = $_POST['nombre'];
     
    function separadorNombres($name){
        $arreglo = explode(" ", $name);
        $largo = sizeof($arreglo);
        
        for ($i = 0; $i < $largo-2; $i++) {
                $nombres[$i] = $arreglo[$i]; 
                }
                $nombre["nombre"] = implode(" ", $nombres); 
                $apellidos[0] = $arreglo[$largo-2];
                $apellidos[1] = $arreglo[$largo-1];
                $nombre["apellido"] = implode(" ", $apellidos);
        
        return $nombre;
    }
    
    print_r (json_encode (separadorNombres($nombre)));

?>