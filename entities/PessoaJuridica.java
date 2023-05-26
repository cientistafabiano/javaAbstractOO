package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer nFuncionario;

	//overload
	public PessoaJuridica() {
		super();
	}
	//constructor
	public PessoaJuridica(String name, Double rendaAnual, Integer nFuncionario) {
		super(name, rendaAnual);
		this.nFuncionario = nFuncionario;
	}
	//getters and setters
	public Integer getnFuncionario() {
		return nFuncionario;
	}
	public void setnFuncionario(Integer nFuncionario) {
		this.nFuncionario = nFuncionario;
	}
		
	
	@Override
	public double imposto() {
		double impostoBasico;
		if (getnFuncionario() > 10) {
			impostoBasico = super.getRendaAnual() * 0.14;
		} else {
			impostoBasico = super.getRendaAnual() * 0.16;
		}
		return impostoBasico;
	}	
}