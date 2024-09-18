package model.entities;

public class PessoaJuridica extends MainClass{

	private Integer funcionarios;
	
	public PessoaJuridica(String name, Double renda, Integer funcionarios) {
		super(name, renda);
		this.funcionarios = funcionarios;
		this.name = name;
	}

	@Override
	public Double calcImposto() {
		Double imposto = 0.0;
		
		if(funcionarios > 10) {
			imposto = renda * (float)14/100;
		}
		else {
			imposto = renda * (float)16/100;
		}
		
		return imposto;
		
	}

	
	
}
