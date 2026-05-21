package Fundamentos;
public class Problema23_matrices {
    public static void main(String[] args) {
        char[] arr1 = {'1','5','3','8','6','2'};
        char[] arr2 = {'4','0','1'};
        procesar(arr1);
        procesar(arr2);
    }
    static void procesar(char[] arr) {
        String cad = new String(arr);
        int num = Integer.parseInt(cad);
        System.out.println("La cadena es " + cad);
        System.out.println("Convertido a número y multiplicado por 2 es " + (num * 2));
    }
}
