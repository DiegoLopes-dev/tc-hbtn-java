package workflow;

public class Video{

    public Video() {
    }

    public Video(String arquivo, FormatoVideo formato) {
        this.arquivo = arquivo;
        this.formato = formato;
    }

    String arquivo;
    FormatoVideo formato;
}