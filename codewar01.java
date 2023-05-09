public class codewar01 {
    public static void main(String[]args){
        //A bomba mais próxima fica a 50 milhas
        //O carro faz em média 25 milhas por galão de gasolina
        //Restão dois galões

        boolean possivel = false;

        double milhas=25;
        double galao=2;
        if (milhas*galao >= 50){
            possivel = true;
        } else {
            possivel = false;
        }

        System.out.println(possivel);




    }
}
