
package pkg2.comparar.salarios;

import javax.swing.JOptionPane;

public class CompararSalarios {

    public static void main(String[] args) {
        cTrabajador TrabajadorUno = new cTrabajador() ;
        cTrabajador TrabajadorDos = new cTrabajador();
        
        // procesa el TrabajadorUno
        TrabajadorUno.setNombre(JOptionPane.showInputDialog("Digite el nombre del primer trabajador: "));
        TrabajadorUno.setCant_Horas(Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de horas: ")));
        TrabajadorUno.setPrecio_Hora(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio por hora: ")));
        TrabajadorUno.CalcularSalario();
        TrabajadorUno.getSalario();
        JOptionPane.showMessageDialog(null, TrabajadorUno.getSalario());
    
        // procesa el TrabajadorDOs
        TrabajadorDos.setNombre(JOptionPane.showInputDialog("Digite el nombre del segundo trabajador: "));
        TrabajadorDos.setCant_Horas(Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de horas: ")));
        TrabajadorDos.setPrecio_Hora(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio por hora: ")));
        TrabajadorDos.CalcularSalario();
        TrabajadorDos.getSalario();
        JOptionPane.showMessageDialog(null, TrabajadorDos.getSalario()); 
        
        
        if (TrabajadorUno.getSalario() > TrabajadorDos.getSalario())
        {JOptionPane.showMessageDialog(null, "El primer salario es mayor");}
        else
            {JOptionPane.showMessageDialog(null, "El segundo salario es mayor");}
        
        
    }
    
}
