package entidades;

public class Caminhao extends Veiculo {

	public Caminhao(String modelo, Double precoFipe, Double peso, Pessoa dono, Ipva estrategiaIpva) {
		super(modelo, precoFipe, peso, dono, estrategiaIpva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double aliquota() {
		// TODO Auto-generated method stub
		return 0.01;
	}
}
