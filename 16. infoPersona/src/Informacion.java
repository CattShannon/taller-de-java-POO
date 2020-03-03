/*
16 ...Ejercicio 16
*/
import javax.swing.JOptionPane;
import allConstants.Constantes;

public class Informacion {

    static final String VALOR_INICIAL_IN_DATOS = "Entrada de datos...";

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ", VALOR_INICIAL_IN_DATOS);
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos: ", VALOR_INICIAL_IN_DATOS);
        char sexo = JOptionPane.showInputDialog("Ingrese \nH - Hombre   --   M - Mujer :", VALOR_INICIAL_IN_DATOS).charAt(0);
        int  edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ", VALOR_INICIAL_IN_DATOS));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso: ", VALOR_INICIAL_IN_DATOS));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura: ", VALOR_INICIAL_IN_DATOS));
        Persona persona1 = new Persona(nombre, apellidos, edad, sexo, peso, estatura);
        Persona persona2 = new Persona(nombre, apellidos, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Juanca");
        persona3.setApellidos("Canto Lopez");
        persona3.setEdad(17);
        persona3.setSexo('Z');
        persona3.setPeso(0);
        persona3.setEstatura(0);

        JOptionPane.showMessageDialog(null, persona1.toString(), "Informacion de persona 1", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona2.toString(), "Informacion de persona 2", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, persona3.toString(), "Informacion de persona 3", JOptionPane.INFORMATION_MESSAGE);
    }

}
