
package ec.edu.intsuperior.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-IVAN
 */
public class Coordinador {
  
    public void menuPrincipal(){
       int op; 
       do{
        op= Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion:\n"
                + "1.- Crear punto\n"
                + "2.- Asignar coordenadas\n"
                + "3.- Imprimir\n"
                + "4.- Salir"));
        switch (op){
            case 1: JOptionPane.showMessageDialog(null, "opcion para crear puntos");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Asignar coordenadas" );
                break;
            case 3: JOptionPane.showMessageDialog(null, "Imprimir");
                break;
            case 4: JOptionPane.showConfirmDialog(null, "salir");
                break;
        }
       }while (op!=0);
        }
    }

