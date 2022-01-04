public class Interface {
    String desenho;
    String letrasErradas;
    String status;


    public void atualizaInterface(char letra){
        //Se a letra estiver na palavra ou nao, esta função que atualiza o status, os acertos e o desenho do boneco
        //Acho que a lógica de controle do jogo em si nao deve estar nessa classe, mas nao sei tambem se deve estar na classe principal

    }

    private void setLetrasErradas(String letrasErradas) {
        //cada vez que o jogador errar a letra, ela aparece em uma lista
        this.letrasErradas = letrasErradas;
    }

    private void setStatus(String status) {
        //inicialmente o status vai receber a quantidade de letras da palavra sorteada
        //a cada tentativa do jogador, será substituido o traço pela letra nas posições em que ela existir na palavra

        this.status = status;

    }

    private void setDesenho(int indice) {
        switch (indice) {
            case 1:
                this.desenho = "   ___________\n" +
                        " /           |\n" +
                        "/            O\n" +
                        "|           \n" +
                        "|           \n" +
                        "|______________";
                break;

            case 2:
                this.desenho = "   ___________\n" +
                        " /           |\n" +
                        "/            O\n" +
                        "|           /\n" +
                        "|           \n" +
                        "|______________";
                break;

            case 3:
                this.desenho = "   ___________\n" +
                        " /           |\n" +
                        "/            O\n" +
                        "|           /|\n" +
                        "|           \n" +
                        "|______________";
                break;

            case 4:
                this.desenho = "   ___________\n" +
                        " /           |\n" +
                        "/            O\n" +
                        "|           /|\\\n" +
                        "|           \n" +
                        "|______________";
                break;

            case 5:
                this.desenho = "   ___________\n" +
                              " /           |\n" +
                              "/            O\n" +
                              "|           /|\\ \n" +
                              "|           /\n" +
                              "|______________";
                break;
            case 6:
                this.desenho = "   ___________\n" +
                              " /           |\n" +
                              "/            O\n" +
                              "|           /|\\\n" +
                              "|           / \\\n" +
                              "|______________";
                break;


        }
    }

        @Override
        public String toString() {
            return  desenho +
                    "\n\n" +
                    "Tentativas Incorretas: " + this.letrasErradas +
                    "\n\n" +
                    "Status das Tentativas: " + this.status;
        }


    }

