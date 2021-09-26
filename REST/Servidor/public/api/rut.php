<?php
    $rut = $_POST['rut'];
    $verificador = $_POST['verificador'];

    function dv($r){
        $s=1;
        $m=0;
        for(;$r!=0;$r/=10)
		{
            $s=($s+$r%10*(9-$m++%6))%11;
        }
        return chr($s?$s+47:75);
    }

    if (dv($rut) == $verificador){
        $respuesta = "Dígito verificador válido";
        echo json_encode($respuesta);
    }

    else{
        $respuesta = "Dígito verificador no válido";  

        echo json_encode($respuesta);
    }


?>
