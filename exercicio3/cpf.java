import java.util.Scanner;
public class cpf {
    
       
    
    public static void main(String[] args) {
        int cpf[] = new int[11];
        int peso[] = new int[11];
        int mult[] = new int[11];
        int i, j, soma=0;
        String cpfs;
        int p = 2;
        int x = 0,y = 0;
        
        
       // Inserindo Valores para a STRING cpfs
            Scanner input = new Scanner ( System.in);
            System.out.println( "Digite os -- 9 ( NOVE ) -- primeiros digitos do seu CPF : ");
                cpfs = input.next();
                
                if (cpfs.length() !=9){
                    System.out.println( "Digite os -- 9 ( NOVE ) -- primeiros digitos do seu CPF : ");
                        cpfs = input.next();
                }
                
              
       // Convertendo String para VETOR cpf []
            for ( i=8; i>=0; i--){
                cpf[i] = Character.getNumericValue(cpfs.charAt(i));
            }
            
            
        // peso
            for ( i=8; i >=0; i--){
                peso[i] = p;
                p++;
        }
           
        // Multiplicando vetores
           
            for ( i = 8; i >=0; i--){
                mult [i] = peso[i] * cpf[i];
            }
                
        // Somando vetorees da multiplicaçao 
                
            for ( i = 0; i <=8; i++){
            soma += mult[i];
            }
        // Condiçoes de x
                if ((soma % 11)<2){
                 x = 0;
                }
             
             else {
                 x = ( 11 - (soma % 11) ) ;
             }
              
        
        //calculos para y
        
        // peso
            p = 2;
            for ( i=0; i <=8; i++){
                peso[i] = p;
                p++;
        }
           
        // Multiplicando vetores
           mult[i] = 0;
            for ( i=0; i <=8; i++){
                mult [i] = peso[i] * cpf[i];
            }
                
        // Somando vetorees da multiplicaçao 
            soma = 0;
            for ( i = 0; i <=8; i++){
            soma += mult[i];
            }
        // Condiçoes de y
                if ((soma % 11)<2){
                 y = 0;
                }
             
             else {
                 y = ( 11 - (soma % 11) ) ;
             }
        // imprimindo Cpf
         System.out.println("CPF completo : " + cpfs + x + y);
    }
    
}
