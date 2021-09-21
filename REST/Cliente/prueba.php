<?php
    $nombre = $_POST['nombre'];
     
    function separadorNombres($name){
        $arreglo = explode(" ", $name);
        $largo = sizeof($arreglo);
        $nombres[] = [];
        
        for ($i = 0; $i < $largo-2; $i++) {
                $nombres[$i] = $arreglo[$i]; 
                }
        
        return $nombres;
    }

   function separadorApellidos($name){
        $arreglo = explode(" ", $name);
        $largo = sizeof($name);
        $apellidos = [];
        $apellidos[0] = $arreglo[$largo-2];
        $apellidos[1] = $arreglo[$largo-1];

        return $apellidos;

    }
    
    $Nombres = separadorNombres($nombre);
    
    print_r (json_encode ($Nombres));
    
    /*$Apellidos = separadorApellidos($nombreCompleto);*/
    /*echo json_encode($Apellidos);*/

?>