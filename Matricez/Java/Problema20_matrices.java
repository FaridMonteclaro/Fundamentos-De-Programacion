package Fundamentos;
import java.util.*;

public class Problema20_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.print("Sumando A: ");
        String aStr = sc.nextLine().toUpperCase();
        System.out.print("Sumando B: ");
        String bStr = sc.nextLine().toUpperCase();
        // Convertir a dígitos numéricos (0-15)
        int[] a = convertirDigitos(aStr);
        int[] b = convertirDigitos(bStr);
        int maxLen = Math.max(a.length, b.length);
        int[] res = new int[maxLen + 1];
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int digA = (i < a.length) ? a[a.length - 1 - i] : 0;
            int digB = (i < b.length) ? b[b.length - 1 - i] : 0;
            int suma = digA + digB + carry;
            res[res.length - 1 - i] = suma % base;
            carry = suma / base;
        }
        res[0] = carry;
        // Imprimir resultado (sin ceros a la izquierda)
        System.out.print("Resultado: ");
        boolean inicio = false;
        for (int d : res) {
            if (d != 0) inicio = true;
            if (inicio) System.out.print(digitToChar(d));
        }
        System.out.println();
    }
    static int[] convertirDigitos(String s) {
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') d[i] = c - '0';
            else d[i] = 10 + (c - 'A');
        }
        return d;
    }
    static char digitToChar(int d) {
        if (d < 10) return (char)('0' + d);
        else return (char)('A' + d - 10);
    }
}
