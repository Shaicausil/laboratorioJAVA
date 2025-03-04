package laboratorio;

import javax.swing.*;

public class practica {
    public static void main(String[] args) {
        int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInter = 0;

        String Usuario = JOptionPane.showInputDialog("Ingrese el nombre del comensal");
        double factura = 0;
        double contador = 0;
        double contadorTipicos = 0;
        double contadorCarta = 0;
        double contadorInter = 0;


        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Tipico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opcion\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1.Frijoles\n";
                        menuTipico += "2. Sopa de verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opcion\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                factura += 12000;
                                contador++;
                                contadorTipicos++;

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado una Sopa de Verduras, el costo es de $" + 8000);
                                factura += 8000;
                                contador++;
                                contadorTipicos++;

                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir " +
                                "el menu tipico, de lo contrario regresara al menu principal"));
                        if (codMenuTipico != 1) {
                            codMenuTipico = 3;
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    do {
                        String menuCarta = "MENU A LA CARTA \n\n";
                        menuCarta += "1.Ensalada Cesar\n";
                        menuCarta += "2. Lomo de cerdo a la mostaza\n";
                        menuCarta += "3. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opcion\n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codMenuCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Ensalada Cesar, el costo es de $" + 38000);
                                factura += 38000;
                                contador++;
                                contadorCarta++;

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Lomo de cerdo a la mostaza, el costo es de $" + 42000);
                                factura += 42000;
                                contador++;
                                contadorCarta++;

                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir " +
                                "el menu carta, de lo contrario regresara al menu principal"));
                        if (codMenuCarta != 1) {
                            codMenuCarta = 3;
                        }
                    } while (codMenuCarta != 3);
                    break;

                case 3:

                    do {

                        String menuInter = "MENU A LA CARTA \n\n";
                        menuInter += "1.Sushi\n";
                        menuInter += "2. Fondue\n";
                        menuInter += "3. Regresar\n\n";
                        menuInter += "Por favor seleccione una opcion\n";
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));

                        switch (codMenuInter) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sushi, el costo es de $" + 62000);
                                factura += 62000;
                                contador++;
                                contadorInter++;

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plat de Fondue, el costo es de $" + 45000);
                                factura += 45000;
                                contador++;
                                contadorInter++;

                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir " +
                                "el menu internacional, de lo contrario regresara al menu principal"));
                        if (codMenuInter != 1) {
                            codMenuInter = 3;
                        }
                    } while (codMenuInter != 3);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Salio del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un " + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);


        String msj = "********** FACTURA **********\n";
        msj += "Cliente: " + Usuario + "\n";
        msj += "---------------------------------\n";
        msj += "Platos solicitados: " + (int) contador + "\n";
        msj += " - Platos Típicos: " + (int) contadorTipicos + "\n";
        msj += " - Platos a la Carta: " + (int) contadorCarta + "\n";
        msj += " - Platos Internacionales: " + (int) contadorInter + "\n";
        msj += "---------------------------------\n";
        msj += "Total a pagar: $" + (int) factura + "\n";
        msj += "********************************";

        JOptionPane.showMessageDialog(null, msj, "Factura de Compra", JOptionPane.INFORMATION_MESSAGE);

    }
}