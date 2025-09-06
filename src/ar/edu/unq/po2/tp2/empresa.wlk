import recibo.*
import empleado.*
class Empresa{

    var property nombre
    var property cuit
    var property empleados

    method montoTotalSueldosNeto(){
        return empleados.sum{empleado => empleado.sueldoNeto()}
    }
    
    method montoTotalSueldosBruto(){
        return empleados.sum{empleado => empleado.sueldoBruto()}
    }

    method montoTotalRetenciones(){
        return empleados.sum{empleado => empleado.retenciones()}
    }

    method liquidacionDeHaberes(){
        empleados.forEach{empleado => empleado.liquidacion()}
    }

}

