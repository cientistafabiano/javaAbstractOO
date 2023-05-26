package entities;

public abstract class Contribuinte {
	private String name;
	private Double rendaAnual;	
	//methods abstract
	public abstract double imposto();		
	//overload
	public Contribuinte() {
	}
	//constructor
	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	/*public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(getName());
		sb.append(": $ ");
		sb.append(String.format("%.2f", getRendaAnual()));

		return sb.toString();
	}*/
}