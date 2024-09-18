package model.entities;

public class PessoaFisica extends MainClass{

	private Double gastosMedico;
	
	public PessoaFisica(String name, Double renda, Double gastosMedico) {
		super(name, renda);
		this.gastosMedico = gastosMedico;
	}
	
	@Override
	public Double calcImposto() {
		Double imposto = 0.0;
		if(renda <= 20000) {
			imposto = ((float)15/100 * renda) - ((float)50/100 * gastosMedico);
		}
		else if(renda > 20000){
			imposto = ((float)25/100 * renda) - ((float)50/100 * gastosMedico);;
		}
		return imposto;
		
	}

}
