
package aulaloop;

import java.util.Scanner;


public class AulaLoop {

    
    public static void main(String[] args) {
        
        int cont, idade, contMaior,contMenor;
        cont= 0; contMaior=0; contMenor=0;
        Scanner ler = new Scanner(System.in);
        while ( cont <3 ){
                System.out.println(" Qual sua idade?");
                idade = ler.nextInt();
        if (idade >=18){
            contMaior++;
        }else {
            contMenor++;
        }
        cont++;
        }
        System.out.println(" Na sala  possui " + contMaior+" maiores de idade");
        System.out.println(" E também possui " + contMenor+" menores de idade");
        }
            
        }
    
    
