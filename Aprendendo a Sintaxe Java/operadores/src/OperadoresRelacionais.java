public class OperadoresRelacionais {

    public static void main(String[] args) {
        String nomeUm = "Cosmo";
        String nomeDois = new String("Cosmo");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa é verdadeira");
        }

        System.out.println("numeorUm é iglual a o numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeorUm é diferente do numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeorUm é maior que numeroDois? " + simNao);


    }
    
}
