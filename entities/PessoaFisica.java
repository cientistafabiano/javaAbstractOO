package entities;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude;
	//overload
	public PessoaFisica() {
		super();
	}
	//constructor
	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	//getters and setters	
	public Double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double imposto() {
		double impostoBasico;
		if (getRendaAnual() < 20000.0) {
			impostoBasico = getRendaAnual() * 0.15;
		} else {
			impostoBasico = getRendaAnual() * 0.25;
		}
		if (gastoSaude > 0) {
			impostoBasico -= getGastoSaude() * 0.5;
			if (impostoBasico < 0) {
				impostoBasico = 0.0;
			}
		}
		return impostoBasico;
	}
}