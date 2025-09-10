import recibo.*
import empleado.*
class Empresa{

    var property nombre
    var property cuit
    var property empleados

    method montoTotalSueldosNetos(){
        return empleados.sum{empleado => empleado.sueldoNeto()}
    }
    
    method montoTotalSueldosBrutos(){
        return empleados.sum{empleado => empleado.sueldoBruto()}
    }

    method montoTotalRetenciones(){
        return empleados.sum{empleado => empleado.retenciones()}
    }

    method pagoDeHaberes(){
        empleados.forEach{empleado => empleado.liquidacion()}
    }

}

