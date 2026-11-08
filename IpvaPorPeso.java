package entidades;

public class IpvaPorPeso implements Ipva {

	@Override
	public Double calcularIpva(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return veiculo.getPeso() * 0.05;
	}

}
