import java.sql.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        //atribuição, cada tipo de dado tem uma forma de atribuição
        String nome = "Lucas";
        int idade = 22;
        double peso = 62.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        /*Date dataNascimento = new Date();*/
        
        
        //Aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double result = (10 * 7) + (20/4);

        //Adição em String é concatenação

        String nomeCompleto = "Lucas " + "Tristão";

        
        //Operadores Unários
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        //Caso queira manter o número sempre negativo por exemplo...
        numero = - numero;
        System.out.println(numero);

        //Ou transformá-lo em positivo novamente
        numero = numero * -1;
        System.out.println(numero);

        //Incremento de Número/x repetição:
        int number = 5;
        number++;
        System.out.println(number);
        
        
        System.out.println(number++);//primeiro o número é mostrado e depois incrementado
        System.out.println(number);//o número é mostrado já com o incremento
        
        number--;

        System.out.println(number);
        System.out.println(++number);
        System.out.println(number);
        
        //LEMBRAR DAS REGRAS DE PRECEDENCIA DE EXECUÇÃO

        //Boolean
        boolean variavel = true;//variável declarada como true
        System.out.println(variavel);//println da variável
        System.out.println(!variavel);//println da variável invertida
        System.out.println(variavel);//println da variável

        variavel = !variavel;//inverção do valor da variável
        System.out.println(variavel);//println da variável com o novo valor


        //Operador Ternário
        //Estrutura de sintaxe: 'Estrutura condicional' ? 'caso condição seja true' : 'caso seja false'

        int a,b;
        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
           resultado = "Verdadeiro";
        else
           resultado = "Falso";
        System.out.println(resultado);

        resultado = a==b ? "Verdadeirissimo" : "Falsíssimo";
        System.out.println(resultado);

        //verifica se a afiração é verdadeira ou falsa
    }
}
