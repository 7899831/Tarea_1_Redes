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

   
    
    $Nombres = separadorNombres($nombre);
    print_r (json_encode ($Nombres));
    
?>