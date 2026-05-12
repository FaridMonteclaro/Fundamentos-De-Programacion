package Fundamentos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CostoObraMientras 
{
    public static void main(String[] args) throws IOException 
{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double tmanodeobra = 0, tmateriales = 0, tservicios = 0, tmaquinaria = 0;
        double vmmanodeobra = 0, vmateriales = 0, vservicios = 0, vmaquinaria = 0;
        double insumo;

        int nmanodeobra = 0, nmateriales = 0, nservicios = 0, nmaquinaria = 0;
        int costo, op = 0;

        char seguir;

        while (op != 5) {

            insumo = tmanodeobra + tmateriales + tservicios + tmaquinaria;
            costo = nmanodeobra + nmateriales + nservicios + nmaquinaria;

            System.out.println("------------------------------------");
            System.out.println("Resumen actual");
            System.out.println("Insumo de Mano de Obra = " + tmanodeobra + " conceptos " + nmanodeobra);
            System.out.println("Insumo de Materiales = " + tmateriales + " conceptos " + nmateriales);
            System.out.println("Insumo de Servicios = " + tservicios + " conceptos " + nservicios);
            System.out.println("Insumo de Maquinaria = " + tmaquinaria + " conceptos " + nmaquinaria);
            System.out.println("Total de Insumo de la Obra = " + insumo + " conceptos " + costo);
            System.out.println("------------------------------------");
            System.out.println("Menu de opciones");
            System.out.println("1.- Mano de Obra");
            System.out.println("2.- Materiales");
            System.out.println("3.- Servicios");
            System.out.println("4.- Maquinaria");
            System.out.println("5.- Salida");
            System.out.print("Seleccione una opcion: ");
            op = Integer.parseInt(br.readLine());

            switch (op) {
                case 1:
                    do {
                        nmanodeobra++;
                        System.out.println("Seccion de Mano de Obra");
                        System.out.print("Valor del concepto: ");
                        vmmanodeobra = Double.parseDouble(br.readLine());
                        tmanodeobra += vmmanodeobra;

                        System.out.print("Desea seguir? (s/n): ");
                        seguir = br.readLine().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;

                case 2:
                    do {
                        nmateriales++;
                        System.out.println("Seccion de Materiales");
                        System.out.print("Valor del concepto: ");
                        vmateriales = Double.parseDouble(br.readLine());
                        tmateriales += vmateriales;

                        System.out.print("Desea seguir? (s/n): ");
                        seguir = br.readLine().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;

                case 3:
                    do {
                        nservicios++;
                        System.out.println("Seccion de Servicios");
                        System.out.print("Valor del concepto: ");
                        vservicios = Double.parseDouble(br.readLine());
                        tservicios += vservicios;

                        System.out.print("Desea seguir? (s/n): ");
                        seguir = br.readLine().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;

                case 4:
                    do {
                        nmaquinaria++;
                        System.out.println("Seccion de Maquinaria");
                        System.out.print("Valor del concepto: ");
                        vmaquinaria = Double.parseDouble(br.readLine());
                        tmaquinaria += vmaquinaria;

                        System.out.print("Desea seguir? (s/n): ");
                        seguir = br.readLine().charAt(0);
                    } while (seguir == 's' || seguir == 'S');
                    break;

                case 5:
                    System.out.println("Salida");
                    break;

                default:
                    System.out.println("Opcion desconocida");
            }
        }
    }
}
