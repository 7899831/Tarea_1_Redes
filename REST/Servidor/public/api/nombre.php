<?php
     $nombre = $_POST['nombre'];

    function separadorNombres($name){
        $arreglo = explode(" ", $name);
        $largo = sizeof($arreglo);

        for ($i = 0; $i < $largo-2; $i++) {
            $nombres[$i] = $arreglo[$i]; 
            }
            $apellidos[0] = $arreglo[$largo-2];
            $apellidos[1] = $arreglo[$largo-1];
            $nombreCompleto["nombres"] = $nombres;
            $nombreCompleto["apellidos"] = $apellidos;
    
            return $nombreCompleto;
}   

    
    
    print_r (json_encode (separadorNombres($nombre)));


?>