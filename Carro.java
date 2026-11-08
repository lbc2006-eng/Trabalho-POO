package entidades;

public class Carro extends Veiculo {

	public Carro(String modelo, Double precoFipe, Double peso, Pessoa dono, Ipva estrategiaIpva) {
		super(modelo, precoFipe, peso, dono, estrategiaIpva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double aliquota() {
		// TODO Auto-generated method stub
		return 0.04;
	}

	


}
