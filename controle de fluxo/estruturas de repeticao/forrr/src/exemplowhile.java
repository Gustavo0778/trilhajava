import java.util.concurrent.ThreadLocalRandom;;

public class exemplowhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while ( mesada > 0) {
            
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce do valor : "  +valorDoce + "Adicionado ao carinho");
            mesada = mesada - valorDoce;

                       
        }
        System.out.println("Mesada :" +mesada);
        System.out.println("Luciane  gastou tdo em dotche");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
