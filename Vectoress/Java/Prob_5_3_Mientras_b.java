package Fundamentos;
import javax.swing.JOptionPane;

public class Prob_5_3_Mientras_b
{
    public static void main(String[] args) 
{
        int pos, ciclo, parcial;
        String[] nombre = new String[5];
        String auxnombre;
        double[] calificaciones = new double[15];
        double resultado, promedio, sumapromedio;
        double aux1, aux2, aux3;
        String salida;

        pos = 0;

        for (ciclo = 0; ciclo < 5; ciclo++) {
            nombre[ciclo] = JOptionPane.showInputDialog("Introduce el nombre del alumno " + (ciclo + 1) + ":");

            for (parcial = 1; parcial <= 3; parcial++) {
                calificaciones[pos] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        "Calificación del parcial " + parcial + " del alumno " + nombre[ciclo] + ":"
                    )
                );
                pos++;
            }
        }

        for (ciclo = 0; ciclo < 5; ciclo++) {
            pos = 0;

            for (int j = 0; j < 4; j++) {
                if (nombre[j].compareToIgnoreCase(nombre[j + 1]) > 0) {
                    auxnombre = nombre[j];
                    nombre[j] = nombre[j + 1];
                    nombre[j + 1] = auxnombre;

                    aux1 = calificaciones[pos];
                    aux2 = calificaciones[pos + 1];
                    aux3 = calificaciones[pos + 2];

                    calificaciones[pos] = calificaciones[pos + 3];
                    calificaciones[pos + 1] = calificaciones[pos + 4];
                    calificaciones[pos + 2] = calificaciones[pos + 5];

                    calificaciones[pos + 3] = aux1;
                    calificaciones[pos + 4] = aux2;
                    calificaciones[pos + 5] = aux3;
                }
                pos += 3;
            }
        }

        pos = 0;
        sumapromedio = 0;
        salida = "ALUMNOS ORDENADOS CON SUS CALIFICACIONES:\n\n";

        for (ciclo = 0; ciclo < 5; ciclo++) {
            resultado = (calificaciones[pos] + calificaciones[pos + 1] + calificaciones[pos + 2]) / 3;

            salida += nombre[ciclo] + "   "
                    + calificaciones[pos] + "   "
                    + calificaciones[pos + 1] + "   "
                    + calificaciones[pos + 2] + "   "
                    + "Promedio: " + resultado + "\n";

            sumapromedio += resultado;
            pos += 3;
        }

        promedio = sumapromedio / 5;
        salida += "\nEl promedio general es " + promedio;

        JOptionPane.showMessageDialog(null, salida);
    }
}
