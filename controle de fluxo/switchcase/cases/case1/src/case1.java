public class case1 {
    public static void main(String[] args) throws Exception {
        String plano = "B";
        switch (plano) {
            case  "T": {
                System.out.println("5Gb, Youtube");
                break;
            }
            case "M": {
                System.out.println("Whatssapp, Instagram gratis");
                break;
            }
            case  "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
                
             
            default:
                throw new AssertionError();
       
    }
}
}