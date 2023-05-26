package entities;

public class PessoaJuridica extends Pessoa {
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
		// TODO Auto-generated method stub
		return 0;
	}	
}