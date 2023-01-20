
package lab1p2_diegoandino;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab1P2_DiegoAndino {
    
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) throws ParseException {
        
         int opcion;
        
        do{
            System.out.println("1 <- Ejercicio 1");
            System.out.println("2 <- Ejercicio 2");
            System.out.println("3 <- Ejercicio 3");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero de discos: ");
                    int discos = leer.nextInt();
                    
                    Torres(discos, 1, 2, 3);
                    break;
//------------------------------------------------------------------------------
                case 2:
                    System.out.println("Ingrese una cadena dividida por comas: ");
                    String lista = leer.next();

                    
                    String division[] = lista.split(",");
                    System.out.println(division);
                     
                    SimpleDateFormat ForDate1 = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat ForDate2 = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat ForDate3 = new SimpleDateFormat("dd/MM/yy");
                     
                    
                    for (int i = 0; i < division.length; i++) {
                        if (division[i].charAt(2) == '/'){
                            Date date = ForDate1.parse(division[i]);
                            System.out.println(date);
                        }
                        if (division[i].charAt(2) == '-'){
                            Date date = ForDate2.parse(division[i]);
                            System.out.println(date);
                        }
   
                    }
                     
                     
                    break;
//------------------------------------------------------------------------------
                case 3:
                    System.out.println("Ingrese el valor de k: ");
                    int k = leer.nextInt();
                    
                    double respuesta =4 *Sumatoria(0,0,k);
                    
                    System.out.println(respuesta);
                    
                    break;
                
                
            }

            
        }while(opcion != 0 );
        
       
    }
    public static void Torres (int discos, int origen, int auxiliar, int destino){
        if (discos == 1) {
            System.out.println("move disco " + discos + " de " + origen + " a " + destino); 
            discos++;


        }
        else{
            
            Torres(discos-1, origen, destino, auxiliar );
            System.out.println("move disco " + discos + " de " + origen + " a " + destino );
            Torres(discos-1, auxiliar, origen, destino );
            discos++;  

        }  
    }//Fin metodo 
    
   public static double Sumatoria(double res, int n, int k){
       double expo = Math.pow(-1,n);
       res += expo / ((2 * n) + 1);
       
       if(k == n){
           return res;
       }
       else{
         return Sumatoria(res, n+1, k);  
       }
    }
    
    //public static int valFecha ( String x){
        
       // int z;
      //  SimpleDateFormat ForDate1 = new SimpleDateFormat("dd/MM/yyyy");
       // if (x.) {
            
       // }
        
     //return z;   
   // }
    
    
}
