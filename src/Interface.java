public class Interface {
    String desenho;
    String letrasErradas;
    String status;

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(int indice) {
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
                        "|           /|\n" +
                        "|           \n" +
                        "|______________";
                break;

            case 5:
                this.desenho = "   ___________\n" +
                              " /           |\n" +
                              "/            O\n" +
                              "|           /|\n" +
                              "|           /\\n" +
                              "|______________";
                break;
            case 6:
                this.desenho = "   ___________\n" +
                              " /           |\n" +
                              "/            O\n" +
                              "|           /|\\n" +
                              "|           /\\\n" +
                              "|______________";
                break;


        }
    }

        @Override
        public String toString() {
            return  desenho +
                    "\n\n" +
                    this.letrasErradas +
                    "\n\n" +
                    this.status;
        }


    }

