public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice sempre inicia com 0
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}