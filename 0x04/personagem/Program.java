public class Program {
    public static void main(String[] args) {
        PersonagemGame2 personagem1 = new PersonagemGame2();
        PersonagemGame2 personagem2 = new PersonagemGame2();

        personagem1.nome = "Sonic";
        personagem1.saudeAtual = 10;

        personagem2.nome = "Mario";
        personagem2.saudeAtual = 100;

        System.out.printf("Nome: %s - Saude: %d\n", personagem1.nome, personagem1.saudeAtual);
        System.out.printf("Nome: %s - Saude: %d\n", personagem2.nome, personagem2.saudeAtual);
    }
}