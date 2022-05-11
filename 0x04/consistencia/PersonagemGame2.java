public class PersonagemGame2 {
    private int saudeAtual;
    private String nome;
    private String status;

    public String getStatus() {
        return status;
    }

    public PersonagemGame2(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.nome = nome;

    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual > 0){
            status = "vivo";
        }else {
            status = "morto";
        }
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){

        }else{
            this.nome = nome;
        }


    }
    public void tomarDano(int quantidadeDeDano){
        if(saudeAtual - quantidadeDeDano >= 0){
            this.setSaudeAtual(saudeAtual - quantidadeDeDano);
        } else {
            this.setSaudeAtual(0);
        }
    }
    public void receberCura(int quantidadeDeCura){
        if(saudeAtual + quantidadeDeCura <= 100){
            this.setSaudeAtual(saudeAtual + quantidadeDeCura);
        }else {
            this.setSaudeAtual(100);
        }
    }
}