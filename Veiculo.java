public class Veiculo {
    public String modelo;
    public String marca;
    public int anoFabricacao;
    public double valorMercado;
    public String placa;
    public String tipoCombustivel;

    public String getModelo() {
        this.modelo = modelo;
        return modelo;
    }

    public String getMarca() {
        this.marca = marca;
        return marca;
    }

    public int getAnofabricacao() {
        this.anoFabricacao = anoFabricacao;
        return anoFabricacao;
    }

    public void setValordeMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getPlaca() {
        this.placa = placa;
        return placa;
    }

    public String getTipocombustivel() {
        return tipoCombustivel;
    }

    public double getImposto() {
        // Carros com mais de 20 anos são isentos (ou seja, impostoé zero)
        // Carros movidos a gasolina, diesel e flex devem pagar 4% do valor de mercado como imposto
        // Demais combustíveis: imposto é 3% do valor de mercado

    }

    static void imprimir(String modelo, String marca, int anoFabricacao, double valorMercado, String placa, String tipoCombustivel) {
        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(anoFabricacao);
        System.out.println(valorMercado);
        System.out.println(placa);
        System.out.println(tipoCombustivel);
    }

}
