public class Aluno {
	String nome, numeroMatricula;
        int idade;
        
     
        public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
                System.out.println("Numero matrícula: " + this.numeroMatricula);
                System.out.println("Numero idade: " + this.idade);
        }
        
         public static void main(String[] args) {
             Aluno cb1 = new Aluno ();
             Aluno cb2 = new Aluno ();
             Aluno cb3 = new Aluno ();
             Aluno cb4 = new Aluno ();
             
             cb1.nome = "Wil";
             cb1.numeroMatricula = "111";
             cb1.idade = 16;
             
             cb2.nome = "Will";
             cb2.numeroMatricula = "222";
             cb2.idade = 16;
             
             cb3.nome = "Willl";
             cb3.numeroMatricula = "333";
             cb3.idade = 16;
             
             cb4.nome = "Willll";
             cb4.numeroMatricula = "444";
             cb4.idade = 16;
             
             	cb1.imprimirDadosCadastrais();
             	cb2.imprimirDadosCadastrais();
             	cb3.imprimirDadosCadastrais();
             	cb4.imprimirDadosCadastrais();
       }
