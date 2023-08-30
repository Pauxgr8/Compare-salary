
package pkg2.comparar.salarios;

public class cTrabajador {
    // declara variables (obligatorio)
     private String Nombre ;
     private double Cant_Horas ;
     private double Precio_Hora ;
     private double Salario ; 
    
    // declara constructores
    //(obligatorio)(por lo general se crean 2) (crear objetos en memoria)
    //  Constructor que no recibe datos
    public cTrabajador() {
    }
    
    // Constructor que recibe datos 
    public cTrabajador(String Nombre, double Cant_Horas, double Precio_Hora) {
        this.Nombre = Nombre;
        this.Cant_Horas = Cant_Horas;
        this.Precio_Hora = Precio_Hora;
        this.Salario = 0;
    }

   // Getters ( obtener) y Setters (asignar valor, la variable oculta recibir el valor)
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCant_Horas() {
        return Cant_Horas;
    }

    public void setCant_Horas(double Cant_Horas) {
        this.Cant_Horas = Cant_Horas;
    }

    public double getPrecio_Hora() {
        return Precio_Hora;
    }

    public void setPrecio_Hora(double Precio_Hora) {
        this.Precio_Hora = Precio_Hora;
    }

    public double getSalario() {
        return Salario;
    }

//    public void setSalario(double Salario) {
//        this.Salario = Salario;

   // Define métodos y eventos (por el momento solo métodos)
        public void CalcularSalario()
         {
        Salario = Precio_Hora * Cant_Horas ;
         }
    
    
}

