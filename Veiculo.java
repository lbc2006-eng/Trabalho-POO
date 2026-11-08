package entidades;

public abstract class Veiculo {

	private String modelo;
	private Double precoFipe;
	private Double peso;
	private Pessoa dono;
	private Ipva estrategiaIpva;

	public Veiculo(String modelo, Double precoFipe, Double peso, Pessoa dono, Ipva estrategiaIpva) {
		super();
		this.modelo = modelo;
		this.precoFipe = precoFipe;
		this.peso = peso;
		this.dono = dono;
		this.setEstrategiaIpva(estrategiaIpva);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecoFipe() {
		return precoFipe;
	}

	public void setPrecoFipe(Double precoFipe) {
		this.precoFipe = precoFipe;
	}
	
	public abstract Double aliquota();

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", precoFipe=" + precoFipe + ", peso=" + peso + ", dono=" + dono + "]";
	}

	public Ipva getEstrategiaIpva() {
		return estrategiaIpva;
	}

	public void setEstrategiaIpva(Ipva estrategiaIpva) {
		this.estrategiaIpva = estrategiaIpva;
	}
	
	public Double getValorIpva(Ipva calculador) {
	    return calculador.calcularIpva(this);
	}

}