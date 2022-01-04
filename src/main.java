import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static boolean ValidaEntrada(String entrada){
        boolean aceita;
        if (entrada.length() != 1){
            aceita = false;
        }else {
            aceita = true;
        }
        return  aceita;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Interface GameInterface = new Interface();

        //GameInterface.setDesenho(1);
        //GameInterface.setDesenho(1);
        //GameInterface.setDesenho(1);
        //System.out.println(GameInterface);

        //Leitura do Arquivo de texto com as palavras para o jogo
        ReadFile arquivo = new ReadFile();
        Random gerador = new Random();
        String palavra = arquivo.conteudo.get(gerador.nextInt(275501));
        System.out.println("A palavra é: " + palavra);

        //Entrada de dados do Jogador
        Scanner entrada = new Scanner(System.in);
        String chuteDoUsuario = entrada.next();
        // TODO: 29/12/2021 - tem que fazer uma validação da entrada para que seja somente uma letra

        //Se a letra estiver em alguma posição da palavra, cntabiliar um acerto
        //Se a letra nao estiver em nenhum posição da palavra, contabilizar um erro


        for (int i = 0; i < palavra.length() ; i++) {
            boolean pertence = true;

            char[] letra = palavra.toCharArray(); // método interessante de transformar uma string em char array

            //char letra = palavra.charAt(i);

            //System.out.println("Letra: " + letra + " // " + "Chute: " + chuteDoUsuario.charAt(0));

            if (chuteDoUsuario.charAt(0) == letra[i]) {
                pertence = true;

                // TODO: 29/12/2021 - deve registrar as posições em que a letra digitada foi encontrada

            }else{
                pertence = false;
                // TODO: 29/12/2021 - verifica se já é a ultima peça do boneco ou adiciona mais uma peça do boneco
            }
            System.out.println(pertence);
        }

    }
}
