public class exemploforemarray {
    public static void main(String[] args) {
       String alunos [] = {"Felipe ", " Jonas ", " Julia ", " Marcos"} ;
        // em array indice inicia em 0
        for ( int x = 0; x < alunos.length ; x++){
        System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
         
        // abaixo forma abreviada
        /*for (String aluno : alunos){
            System.out.println("nome do aluno e: " +aluno);*/
       }
    }
} 

