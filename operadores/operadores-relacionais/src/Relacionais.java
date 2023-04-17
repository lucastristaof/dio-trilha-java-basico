public class Relacionais {
    public static void main(String[] args) throws Exception {
            String nome1 = "Lucas";
            String nome2 = "Lucas";

            String nome3 = "Lucas";
            String nome4 = new String("Lucas");


            System.out.println(nome1 == nome2);
            System.out.println(nome3 == nome4);//da errado
            //Quando se trata de objetos usamos o "equals"
            System.out.println(nome3.equals(nome4));
        
        
            
            int numero1 = 1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;

            if(numero1 < numero2){
                System.out.println("A nossa condição é verdadeira");
            }
            System.out.println("numeroUM é igual a numeroDois? " + simNao);
            
            simNao = numero1!= numero2;

            System.out.println("numeroUM é diferente a numeroDois? " + simNao);

            simNao = numero1 > numero2;

            System.out.println("numeroUM é maior que numeroDois? " + simNao);

    }
}
