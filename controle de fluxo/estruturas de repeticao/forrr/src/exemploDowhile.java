import java.util.Random;
public class exemploDowhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
                //executa ate que alguem atenda
            System.out.println("telefone tocando ");
        }while(tocando());

        System.out.println("Âlo!!....");
        
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ? " + atendeu);
        //negando ato de continuar tocando
        return atendeu;
    }
}