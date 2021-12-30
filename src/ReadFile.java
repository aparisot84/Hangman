import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    ArrayList<String> conteudo = new ArrayList<>();

    public ReadFile() throws FileNotFoundException {
        try {
            File Arquivo = new File("/home/ubuntu/Documentos/Hangman/brazilian");
            Scanner leitura = new Scanner(Arquivo);
            while (leitura.hasNextLine()) {
                String dados = leitura.nextLine();
                this.conteudo.add(dados);
            }
            leitura.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }
}