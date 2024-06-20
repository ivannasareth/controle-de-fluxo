import java.util.Scanner;

public class Contador{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o primeiro número");
    int primeiroNumero = scanner.nextInt();
    System.out.println("Entre com o segundo número");
    int segundoNumero = scanner.nextInt();

    try {
        contar (primeiroNumero, segundoNumero); 
    }
        
        catch (ParametrosInvalidosException e ) {
        System.out.println(e.getMessage());
     }  

}// fim main

static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
	if(primeiroNumero >= segundoNumero){
	   throw new ParametrosInvalidosException(); 
	}
  int contagem = segundoNumero - primeiroNumero;
  for(int i = 1; i <=contagem; i++ ){
	System.out.println("imprimindo o número " + i);
  }
  }// fim metodo contar

}// fim classe