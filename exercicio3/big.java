import java.util.Scanner;
public class Big {
    
    public static void main(String[] args) {
        String numero1;
        String numero2;
        int i, j, k;
        int n1[] = new int[30];
        int n2[] = new int[30];
        int resul[] = new int[30];
        int test [] = new int [30];
        int tamanho, tamanho2;
        int vai = 0;
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Escreva o primeiro numero: ");
        numero1 = input.next();
       
        System.out.print("Escreva o segundo numero: ");
        numero2 = input.next();
        
        tamanho = numero1.length();
        tamanho2 = numero2.length();
        // Convertendo String numero1 para VETOR n1 []
            for ( i= tamanho , j= 0 ; i>0 ; i--, j++ ){
                n1[30-i] = Character.getNumericValue(numero1.charAt(j));
                System.out.print("n1: " + n1[j]);
                
            }
         
            
            // Convertendo String numero2 para VETOR n2 []
             for ( i= tamanho , j= 0 ; i>0 ; i--, j++ ){
                n2[30-i] = Character.getNumericValue(numero1.charAt(j));
             
            }
  
             
           
    //somando

       
        for (i = 29; i >= 0; i--) {
            if (resul[i] + n1[i] + n2[i] >= 10) {
                resul[i] -= 10;
 
            }
            else
                resul[i] +=n1[i] + n2[i] ;
            
        }
        
        //imprimindo soma
        System.out.print("Soma: ");
        for (k = 0; k <= 29; k++){
            if (resul[k]==0);
            System.out.print(resul[k] );
        }
       
        System.out.println(" ");

        //multiplicando
        /* for(i=0; i<=29; i++){
            resul[i] = -1;
        }
        for (i = 29; i >= 0; i--) {
            resul[i] = (n11[i] * n22[i]);
            if (resul[i] > 9) {
                resul[i - 1] = (resul[i] + 1);
                resul[i] -= 10;
            }
        }

        //imprimindo multiplicação
        System.out.print("Multiplicação: ");
        for (k = 0; k < 29; k++){
            if (resul[k]>0)
            System.out.print(resul[k]);
               
        }

        
       */
        
    }

}
