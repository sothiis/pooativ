public class Veiculo {
    public String modelo;
    public String marca;
    public int anoFabricacao;
    public double valorMercado;
    public String placa;
    public String tipoCombustivel;

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnofabricacao() {
        return anoFabricacao;
    }

    public void setValordeMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipocombustivel() {
        return tipoCombustivel;
    }

    public double calcularImposto() {
        // Carros com mais de 20 anos são isentos (ou seja, impostoé zero)
        // Carros movidos a gasolina, diesel e flex devem pagar4% do valor de mercado como imposto
        // Demais combustíveis: imposto é 3% do valor de mercado

    }

    public String imprimir() {

    }

}
