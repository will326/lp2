import java.util.Scanner;

public class Calculadora {
        int variavel1, variavel2;
        
     
        public void soma(){
		System.out.println("A soma dos dois números são : " + (this.variavel1 + this.variavel2));

        }
        public void subtracao(){
		System.out.println("A subtração dos dois números são : " + (this.variavel1 - this.variavel2));

        }
        public void multiplicacao(){
		System.out.println("A multiplicação dos dois números são : " + (this.variavel1 * this.variavel2));

        }
        public void divisao(){
		System.out.println("A divisão dos dois números são : " + (this.variavel1 / this.variavel2));

        }
        
    public static void main(String[] args) {
             
             
             Calculadora cb1 = new Calculadora();
             Calculadora cb2 = new Calculadora();
             Calculadora cb3 = new Calculadora();
             Scanner input = new Scanner( System.in );
             
		System.out.println( "Digite um valor1: ");
		cb1.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		cb1.variavel2 = input.nextInt();
                
    cb1.soma();
		cb1.subtracao();
		cb1.multiplicacao();
		cb1.divisao();
		
		System.out.println( "Digite um valor1: ");
		cb2.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		cb2.variavel2 = input.nextInt();
                
    cb2.soma();
		cb2.subtracao();
		cb2.multiplicacao();
		cb2.divisao();

		System.out.println( "Digite um valor1: ");
		cb3.variavel1 = input.nextInt();
		System.out.println( "Digite um valor2: ");
		cb3.variavel2 = input.nextInt();
		
		cb3.soma();
		cb3.subtracao();
		cb3.multiplicacao();
		cb3.divisao();
             
             
         }
             
}
