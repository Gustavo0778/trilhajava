public class usuario {
    public static void main(String[] args) throws Exception{
        smarttv smarttv = new smarttv();

        smarttv.mudarCanal(13);
        System.out.println("canal atual : " + smarttv.canal);
         
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();
       

        System.out.println("Tv ligada ? "+smarttv.ligada);
        System.out.println("Canal atual? "+smarttv.canal);
        System.out.println("Volume atual? "+smarttv.volume);
        System.err.println("Volume atual : "+ smarttv.volume);
        smarttv.ligar();
        System.err.println("Tv ligada?- novo status " +smarttv.ligada);
        
        smarttv.desligar();
        System.err.println("Tv ligada?- novo status " +smarttv.ligada);



    
    }
}
