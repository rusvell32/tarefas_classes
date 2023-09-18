public class Garrafa {

    private String cor1;
    private String cor;
    private String quantidade;
    private boolean aberto;

    /**
     * Método que diz a cor da garrafa
     *
     * @return retorna a cor da garrafa
     *
     * @deprecated
     * @see String getCor(String cor)
     */
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public boolean getaberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getCor1() {
        return cor1;
    }

    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }


}
