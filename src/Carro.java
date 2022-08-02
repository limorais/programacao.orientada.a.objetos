//criando uma classe
public class Carro {
    //gerando atributos da classe
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //get and set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {

        return capacidadeTanque;
    }

    //calculando o total do tanque de acordo com o valor do combustivel
    Double totalValorTanque(Double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}
