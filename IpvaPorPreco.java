package entidades;

public class IpvaPorPreco implements Ipva{

	@Override
	public Double calcularIpva(Veiculo veiculo) {
		return veiculo.getPrecoFipe() * veiculo.aliquota();
	}

}
