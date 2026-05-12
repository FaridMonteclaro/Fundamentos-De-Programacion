package Fundamentos;
import javax.swing.JOptionPane;

public class Matrices_Mientras_b
    {
     public static void main(String[] args) {
       
        int op;
        boolean AA, BB;
        double[] A = new double[4];
        double[] B = new double[4];
        double[] C = new double[4];
        String menu, salida;

        op = 0;
        AA = false;
        BB = false;

        while (op != 6) {
            menu = "Menú de Opciones Operaciones de Matrices\n"
                 + "1.- Agregar elementos matriz A\n"
                 + "2.- Agregar elementos matriz B\n"
                 + "3.- Suma de matrices\n"
                 + "4.- Resta de matrices\n"
                 + "5.- Multiplicación de matrices\n"
                 + "6.- Salida\n\n"
                 + "¿Qué opción deseas?";

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
            A[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 1,1 de la matriz A:"));
            A[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 1,2 de la matriz A:"));
            A[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 2,1 de la matriz A:"));
            A[3] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 2,2 de la matriz A:"));
            AA = true;
                 break;

                case 2:
            B[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 1,1 de la matriz B:"));
            B[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 1,2 de la matriz B:"));
            B[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 2,1 de la matriz B:"));
            B[3] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para la posición 2,2 de la matriz B:"));
            BB = true;
                break;

                case 3:
                    if (AA && BB) {
                        for (int i = 0; i < 4; i++) {
                            C[i] = A[i] + B[i];
                        }

                        salida = "La suma de las dos matrices es:\n";
                        salida += "| " + C[0] + "  " + C[1] + " |\n";
                        salida += "| " + C[2] + "  " + C[3] + " |";

                        JOptionPane.showMessageDialog(null, salida);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, una de las dos matrices o las dos no tienen datos");
                    }
                    break;

                case 4:
                    if (AA && BB) {
                        for (int i = 0; i < 4; i++) {
                            C[i] = A[i] - B[i];
                        }

                        salida = "La resta de las dos matrices es:\n";
                        salida += "| " + C[0] + "  " + C[1] + " |\n";
                        salida += "| " + C[2] + "  " + C[3] + " |";

                        JOptionPane.showMessageDialog(null, salida);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, una de las dos matrices o las dos no tienen datos");
                    }
                    break;

                case 5:
                    if (AA && BB) {
                        C[0] = (A[0] * B[0]) + (A[1] * B[2]);
                        C[1] = (A[0] * B[1]) + (A[1] * B[3]);
                        C[2] = (A[2] * B[0]) + (A[3] * B[2]);
                        C[3] = (A[2] * B[1]) + (A[3] * B[3]);

                        salida = "La multiplicación de las dos matrices es:\n";
                        salida += "| " + C[0] + "  " + C[1] + " |\n";
                        salida += "| " + C[2] + "  " + C[3] + " |";

                        JOptionPane.showMessageDialog(null, salida);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, una de las dos matrices o las dos no tienen datos");
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Adiós, que tengas un buen día");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No existe esta opción");
                    break;
            }
        }
    }
}
