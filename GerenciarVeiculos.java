import java.util.ArrayList;

public class GerenciarVeiculos {
    
    private ArrayList<Veiculo> listaVeiculos;

    
    public GerenciarVeiculos(){
        listaVeiculos = new ArrayList<>();
    }
    
    public void adicionar(veiculo A) {
        // Adiciona o veículo ao ArrayList
        add(Object);

    }

    public boolean remover(String placa) {
        // Busca o veiculo que possui a placa dada, removendo-o e retornando true.
        // Caso não encontre a placa, retorna false.
    }

    public Veiculo buscarPorPlaca(String Placa) {
        // Busca o veiculo pela placa, retornando-o caso encontre.
        // Se não encontrar retorna null

    public String listarVeiculos() {
        // Lista todos os veículos da lista
        // Colocando os dados em uma String e depois retornando-a
    }

    public double obterValorImposto(String placa) {
        // Busca um veículo pela placa passada, e então retorna o valor do imposto para
        // esse veículo.
        // Se nãoencontrar a placa, retorna -1;

    }
    public String listarVeiculoPorCombustivel(String tipoCombuString) {
        // Lista todos os carros da quesejam movidos pelo combustível dado
        // Colocando os dados em uma String e depois retornando-a
    }

}
