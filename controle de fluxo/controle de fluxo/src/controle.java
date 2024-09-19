public class controle {
    public static void main(String[] args) throws Exception {
      double saldo =25.0;
      double valorSolicitado = 28.0;
      
      if (valorSolicitado < saldo){
        saldo =saldo -valorSolicitado;
       

       }else
       System.out.println("saldo insuficiente! " + saldo);
       System.out.println(saldo);
    }
}
