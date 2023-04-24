import java.util.Scanner;
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        while(true){
            System.out.println("Qual o seu nome?");
            nome = scan.next();
            if (nome.equals("0")) break;
            
            System.out.println("Qual a sua idade?");
            idade = scan.nextInt();
        }

        }
}
