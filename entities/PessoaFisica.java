package entities;

public class PessoaFisica extends Pessoa {
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
		if (super.getRendaAnual() < 20000.0) {
			return 0.15;
		} else {
			return 0.25;
		}
		//if (gastoSaude > 0) {
		//	return super.getRendaAnual() - gastoSaude * 0.5;
		//}
	}
}