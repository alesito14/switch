import java.util.Scanner;

public class casos{
    public static void main(String[] args){

        int dia = 7;
        String nombredia;
Scanner Scanner = new Scanner (System.in);
dia = Scanner.nextInt();

        switch (dia){

            case 1: nombredia = "lunes";
            break;
            case 2: nombredia = "martes";
            break;
            case 3: nombredia = "miercoles";
            break;
            case 4: nombredia = "jueves";
            break;
            case 5: nombredia = "viernes";
            break;
            case 6: nombredia = "sabado";
            break;
            case 7: nombredia = "domingo";
            break;
            default: nombredia = "numero de dia invalido";
            break;
        }

        System.out.println("el dia seleccionado es: " + nombredia);
    }
}