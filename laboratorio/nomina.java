package laboratorio;

import javax.swing.*;

public class nomina {
    public static void main(String[] args) {

        int codNomina;
        double descuento = 0;
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));

        do {
            String nomina = "Ingrese su estrato social\n\n";
            nomina += "1. Estrato 1 y 2\n";
            nomina += "2. Estrato 3 y 4\n";
            nomina += "3. Estrato 5\n";
            nomina += "4. Estrato 6\n";
            nomina += "5. Salir";

            codNomina = Integer.parseInt(JOptionPane.showInputDialog(nomina));

            if (codNomina == 5) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            switch (codNomina) {
                case 1:
                    descuento = salario * 0.02;
                    break;
                case 2:
                    descuento = salario * 0.04;
                    break;
                case 3:
                    descuento = salario * 0.08;
                    break;
                case 4:
                    descuento = salario * 0.1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    continue;
            }

            double salarioFinal = salario - descuento;
            JOptionPane.showMessageDialog(null, "Su descuento para el ahorro es: $" + descuento +
                    "\nUsted recibirá: $" + salarioFinal);

        } while (true);
    }
}
