package Fundamentos;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Prob_5_1_Mientras {
    public static void main(String[] args) {
        String opc;
        int num, ciclo;
        double suma, resultado, sumapromedio;
        double[] calif = new double[3];

        opc = "S";
        num = 0;
        sumapromedio = 0;

        while (opc.equalsIgnoreCase("S")) {
            num++;
            suma = 0;

            for (ciclo = 0; ciclo < 3; ciclo++) {
                calif[ciclo] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        "Ingresa la calificación del parcial " + (ciclo + 1) + " del alumno " + num + ":"
                    )
                );
                suma += calif[ciclo];
            }

            resultado = suma / 3;

            if (resultado >= 7) {
                JOptionPane.showMessageDialog(
                    null,
                    "El alumno número " + num + " su promedio es " + resultado + " y acreditó la materia"
                );
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "El alumno número " + num + " su promedio es " + resultado + " y no acreditó la materia"
                );
            }

            sumapromedio += resultado;

            opc = JOptionPane.showInputDialog("¿Deseas capturar otro alumno? (S/N):");
        }

        if (num > 0) {
            JOptionPane.showMessageDialog(
                null,
                "El promedio del grupo de " + num + " alumnos es: " + (sumapromedio / num)
            );
        } else {
            JOptionPane.showMessageDialog(null, "No se capturaron alumnos");
            }
        }
    }
}
