PROBLEMA ( ******Você estava acampando com seus amigos longe de casa, mas quando chega a hora de voltar,
você percebe que o combustível está acabando e a bomba mais próxima fica a 50 milhas de distância! 
    Você sabe que, em média, seu carro roda cerca de 25 milhas por galão. Restam 2 galões.
Considerando esses fatores, escreva uma função que diga se é possível chegar à bomba ou não.
A função deve retornar true se for possível e false se não.******)


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
