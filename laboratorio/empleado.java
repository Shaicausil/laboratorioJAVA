package laboratorio;

import javax.swing.*;

public class empleado {
    public static void main(String[] args) {

        int codPago;

        double bonificacion=0, descuento=0;
        double salarioActual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));

        do {
            String pago = "Ingrese su categoria\n\n";
            pago += "1. Categoria 1\n";
            pago += "2. Categoria 2\n";
            pago += "3. Categoria 3\n";
            pago += "4. Categoria 4\n";
            pago += "5. Salir";

            codPago = Integer.parseInt(JOptionPane.showInputDialog(pago));
            if (codPago==5) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
            }

            switch (codPago) {
                case 1:
                    bonificacion= salarioActual * 0.15;
                    descuento = salarioActual * 0.02;
                    break;
                case 2:
                    bonificacion= salarioActual * 0.10;
                    descuento = salarioActual * 0.015;
                    break;
                case 3:
                    bonificacion= salarioActual * 0.8;
                    descuento = salarioActual * 0.01;
                    break;
                case 4:
                    bonificacion= salarioActual * 0;
                    descuento = salarioActual * 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    continue;
            }

            double salarioFinal = salarioActual - descuento + bonificacion;
            JOptionPane.showMessageDialog(null, "Su Bonificacion por categoria es: $" +bonificacion+
                    "\nSu descuento es de: $" +descuento+ "\nUsted recibira: $" + salarioFinal);

        } while (true);

    }

}
