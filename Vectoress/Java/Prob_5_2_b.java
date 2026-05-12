package Fundamentos;
import javax.swing.JOptionPane;

public class Prob_5_2_b 
{
    public static void main(String[] args)
  {
        int generados, num, naleatorio, ciclop, cicloh, aux;
        boolean movimiento;
        int[] datos = new int[10];
        String salida;

        generados = 0;
        num = 0;

        while (num < 10) {
            naleatorio = (int)(Math.random() * 41);
            generados++;

            if (naleatorio % 2 == 0) {
                datos[num] = naleatorio;
                num++;
            }
        }

        salida = "De " + generados + " números generados, este es el arreglo con los 10 elementos pares:\n";
        for (int i = 0; i < 10; i++) {
            salida += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, salida);

        ciclop = 1;
        movimiento = true;

        while (ciclop < 10 && movimiento) {
            movimiento = false;

            for (cicloh = 0; cicloh < 9; cicloh++) {
                if (datos[cicloh] > datos[cicloh + 1]) {
                    aux = datos[cicloh];
                    datos[cicloh] = datos[cicloh + 1];
                    datos[cicloh + 1] = aux;
                    movimiento = true;
                }
            }

            ciclop++;

            salida = "Pasada " + (ciclop - 1) + ":\n";
            for (int i = 0; i < 10; i++) {
                salida += datos[i] + " ";
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }
}
