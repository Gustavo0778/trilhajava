
import java.util.Locale;
import java.util.Scanner;



public class sobremim1 {
    public static void main(String[] args)  {
        
      Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

     
      System.out.println("Digite seu nome : ");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome : ");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade : ");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura : ");
      Double altura = scanner.nextDouble();
       

      System.out.println("Ola me chamo :" +nome + " " +sobrenome);
      System.out.println("Tenho " +idade + " anos");
      System.out.println("tenho : " +altura +" de altura");
      


    }
}
