// *** OBJETO ***
// 1) Atributos: características, propriedades
// 2) Métodos: comportamentos, ações
// 3) Eventos: vemos depois

public class Combo {
    // Atributos da classe Combo
    // Produtos que vão compor este combo
    // Atributos estão ENCAPSULADOS
    private String sanduiche;
    private String batata;
    private String salada;
    private String refrigerante;

    // Construtor de Inicialização da classe Combo
    // Definir estado inicial do objeto para vazio/nulo/zero
    public Combo() {
        this.setSanduiche("");
        this.setBatata("");
        this.setSalada("");
        this.setRefrigerante("");
    }

    // Construtor de Atribuição
    // Sobrecarga de método: mesmo nome e modificador de acesso, com assinatura diferente
    // Definir estado inicial do objeto com valores passados por parâmetro
    public Combo(String sanduiche, String batata, String salada, String refrigerante) {
        this.setSanduiche(sanduiche);
        this.setBatata(batata);
        this.setSalada(salada);
        this.setRefrigerante(refrigerante);
    }

    public Combo(String sanduiche, String refrigerante) {
        this.setSanduiche(sanduiche);
        this.setRefrigerante(refrigerante);
    }

    // Javabeans
    // Getters e Setters da classe Combo
    public String getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
