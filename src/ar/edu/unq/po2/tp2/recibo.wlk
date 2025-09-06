
import empleado.*
import empresa.*
class Recibo{
    var property nombre
    var property direccion
    var property fechaEmision
    var property sueldoBruto
    var property sueldoNeto

    method conceptos(){
        return "nombre: " + self.nombre() + " direccion: " + self.direccion() + " fecha emision: " + self.fechaEmision() + " sueldo bruto: " + self.sueldoBruto() + " sueldo neto: " + self.sueldoNeto()
    }
}