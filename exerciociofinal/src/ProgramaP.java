/*
autor - rusvell32
 */
public class ProgramaP {

    public static void main (String args[]) {

        /**
         * @param args
         */
        Garrafa garrafa1 = new Garrafa();
        garrafa1.setAberto(true);
        garrafa1.setCor("azul");
        garrafa1.setQuantidade("500 ml");
        garrafa1.getCor();
        garrafa1.setCor1("vermelho");
        garrafa1.getCor1();


        System.out.println(garrafa1.getCor());
        System.out.println(garrafa1.getQuantidade());
        System.out.println(garrafa1.getaberto());
        System.out.println(garrafa1.getCor1());

        /**
         * @deprecated
         */

        

    }
}
