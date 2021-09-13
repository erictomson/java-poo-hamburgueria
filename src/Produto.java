// Classe Produto herda Classe Object

public class Produto {
    // Atributos da classe Produto
    // Características de um produto
    // Produtos possíveis: sanduiche, batata, salada, refrigerante
    private String nome; // exemplo: Cheddar
    private String tipo; // exemplo: sanduiche
    private String tamanho; // 300ml, 500ml, único
    private double valor; // R$ 18,00

    // Construtor: define o estado inicial da classe => valores iniciais dos atributos
    // Construtor de inicialização
    public Produto() {
        this.setNome("");
        this.setTipo("");
        this.setTamanho("");
        this.setValor(0.0);
    }

    // Construtor de atribuição
    // Sobrecarga de método => método Construtor da classe Produto
    public Produto(String nome, String tipo, String tamanho, double valor) {
        this.setNome(nome); //Big Mac
        this.setTipo(tipo); //sanduiche
        this.setTamanho(tamanho); //único
        this.setValor(valor);
    }

    // Getters e Setters dos atributos da classe Produto
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
