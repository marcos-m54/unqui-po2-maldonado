import recibo.*
import empresa.*

class Empleado{

    var property nombre
    var property direccion
    var property estadoCivil
    var property fechaNac
    var property sueldoBasico
    var property recibos = #{}
    var property dineroEnCuenta

    method edad(){
        const hoy = new Date()
        return fechaNac.year() - hoy.year() //aprox
    }

    method nuevoRecibohaber(){
        const fechaHoy = new Date()
        return new Recibo(nombre = self.nombre(), direccion = self.direccion(), fechaEmision = fechaHoy, sueldoBruto = self.sueldoBruto(), sueldoNeto = self.sueldoNeto())
    }

    method liquidacion(){
        recibos.add(self.nuevoRecibohaber())
        self.dineroEnCuenta(self.dineroEnCuenta() + self.sueldoNeto())
    }

    method tieneConyuge(){
        return estadoCivil.equals("casado")
    }

    method sueldoBruto()
    method sueldoNeto()
    method retenciones()

}

class EmpleadoPermanente inherits Empleado{

    var property cantHijos
    var property antiguedad

    override method sueldoBruto(){
        return sueldoBasico + self.montoSalarioFamiliar()
    }

    override method sueldoNeto(){
        return self.sueldoBruto() - self.retenciones()

    }

    override method retenciones(){
        return self.montoPorObraSocial() + self.montoAportes()
    }

    method montoSalarioFamiliar(){
        return self.montoAsignacionPorHijo() + self.montoAsignacionPorConyuge() + self.montoPorAntiguedad()
    }

    method montoAsignacionPorHijo(){
        return cantHijos * 150
    }
    
    method montoAsignacionPorConyuge(){
        return if (self.tieneConyuge()) 100 else 0
    } 

    method montoPorAntiguedad(){
        return 50 * antiguedad
    }

    method montoPorObraSocial(){
        return (self.sueldoBruto() * 0.1) + 20 * cantHijos
    }

    method montoAportes(){
        return self.sueldoBruto() * 0.15
    }


}

class EmpleadoTemporario inherits Empleado{

    var property fechaFinDesignacion
    var property cantidadHorasExtras
    var property tieneMasDe50AñosAporte

    override method sueldoBruto(){
        return self.sueldoBasico() + self.montoPorHorasExtras()
    }

    override method sueldoNeto(){
        return self.sueldoBruto() - self.retenciones()
    }

    override method retenciones(){
        return self.montoPorObraSocial() + self.montoAportes()
    }

    method montoPorHorasExtras(){
        return 40 * self.cantidadHorasExtras()
    }

    method montoAportes(){
        return if (self.tieneMasDe50AñosAporte()) (self.sueldoBruto() * 0.1 ) + (5 * cantidadHorasExtras) + 25 else 25
    }

    method montoPorObraSocial(){
        return self.sueldoBruto() * 0.1
    }

}

class EmpleadoContratado inherits Empleado{
    
    var property numeroDeContrato
    var property medioDePago

    override method sueldoBruto(){
        return self.sueldoBasico() 
    }

    override method sueldoNeto(){
        return self.sueldoBruto() - self.retenciones()
    }

    override method retenciones(){
        return 50
    }

}


