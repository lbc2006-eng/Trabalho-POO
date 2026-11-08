package entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorVeiculos {

	private List<Veiculo> veiculos = new ArrayList<>();
	
	public void adicionarVeiculo(Veiculo...veiculos) {
		Collections.addAll(this.veiculos, veiculos);
	}
	
	public boolean removerVeiculoPorModelo(String modelo) {
	    Veiculo veiculo = buscarPorModelo(modelo);
	    if (veiculo != null) {
	        this.veiculos.remove(veiculo);
	        return true;
	    }
	    return false;
	}
	
	public void ordenarPorPreco() {
	    this.veiculos.sort(Comparator.comparingDouble(Veiculo::getPrecoFipe));
	}
	
	public Veiculo buscarPorModelo(String modelo) {
	    for (Veiculo v : this.veiculos) {
	        if (v.getModelo().equalsIgnoreCase(modelo)) {
	            return v; 
	        }
	    }
	    return null;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

}

