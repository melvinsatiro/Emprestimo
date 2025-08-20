import java.util.Scanner;


public class Emprestimo {
    public static void main(String[] args) {
       System.out.println("Digite o valor do empréstimo:");
       Scanner scanner = new Scanner(System.in);

       double valor = scanner.nextDouble();

       if(valor >=1000 && valor <=5000) {
           System.out.println("Valor R$"+ valor +" está dentro do intervalo permitido");

       }else {
           System.out.println("O valor  R$"+ valor +", não está dentro do intervalo permitido para empréstimo. ");
       }
       scanner.close();
    }

}
