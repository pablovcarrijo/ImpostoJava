package model.entities;

public abstract class MainClass {

	protected Double renda;
	protected String name;
	
	public MainClass(String name, Double renda) {
		this.renda = renda;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getRenda() {
		return this.renda;
	}
	
	public abstract Double calcImposto();
}
