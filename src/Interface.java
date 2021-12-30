public class Interface {
    String desenho;
    String letrasErradas;
    String status;

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public String getLetrasErradas() {
        return letrasErradas;
    }

    public void setLetrasErradas(String letrasErradas) {
        this.letrasErradas = letrasErradas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "   ___________\n" +
                " /           |\n" +
                "/            O\n" +
                "|           /|\\\t\n" +
                "|           / \\\n" +
                "|______________" +
                "\n\n" +
                this.letrasErradas +
                "\n\n" +
                this.status;
    }



}
