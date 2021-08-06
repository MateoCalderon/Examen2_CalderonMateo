
package test;

import dominio.Discapacidad;
import dominio.Jubilado;
import dominio.Patronal1;
import dominio.Patronal2;
import dominio.Vejez;
import java.util.Scanner;


public class TestSeguro {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Jubilado jubilado=null;
        Vejez vejez = new Vejez();
        Discapacidad disca = new Discapacidad();
        Patronal1 patro1 = new Patronal1();
        Patronal2 patro2 = new Patronal2();
        String cedula,nombre;
        int anio=0;
        double salario;
        int op=0;
        int op1=0;
        System.out.println("Bienvenido al Instituto de Seguridad Social ");
        do
        {
           System.out.println("Porfavor llene los siguientes datos, recuerde que para finalizar ingrese <<salir>> en la opcion nombre ");
           System.out.print("-Nombre: ");
           nombre=entrada.next();
           if(nombre.equals("salir")){
               break;
           }else{
           System.out.print("-Cedula: ");
           cedula=entrada.next();
           System.out.print("-Salario base: ");
           salario=entrada.nextDouble();
           System.out.print("-Anios de aporte: ");
           anio=entrada.nextInt();
           jubilado = new Jubilado(salario,anio,cedula, nombre);
           System.out.println("Que jubilacion es la que tiene?");
           System.out.println("1) Jubilacion de vejez\n2) Jubilacion de discapacidad\n3) Jubilacion patronal");
           System.out.println("-Seleccione la opcion correspondiente a su jubilacion:");
           op=entrada.nextInt();
        
           switch(op){
            case 1:
            System.out.println("Usted esta jubilado por vejez");
            vejez.metodoPension();
                break;
            case 2:
            System.out.println("Usted esta jubilado por discapacidad");
            disca.metodoPension();
                break;
            case 3:
            System.out.println("Usted esta jubilado patronalmente");
            System.out.println("1) Privado\n2) Publico");
            System.out.println("-Seleccione la opcion correspondiente a su jubilacion patronal:");
            op1=entrada.nextInt();
            switch(op1){
            case 1:
            System.out.println("Usted esta jubilado privadamente");
            patro1.metodoPension();
                break;
            case 2:
            System.out.println("Usted esta jubilado publicamente");
            patro2.metodoPension();
                break;
            }
            break;   
        }
           }     
        }while(nombre.equals("salir"));
    }
}
