package candidatura;


public class ImprimindoCandidatosSlelecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
                String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
                
                System.out.println("Imprimindo a lista de candidatos informado no indice do elemento");

                for(int indice = 0; indice < candidatos.length; indice++) {
                    System.out.println("O candidato de n" + (indice+1) + " é o " + candidatos[indice]);
                }

    }
}