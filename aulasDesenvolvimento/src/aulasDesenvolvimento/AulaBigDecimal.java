package aulasDesenvolvimento;

import java.math.BigDecimal;

public class AulaBigDecimal {
	
	//Utilizando sem String ele tem uma imprecisão do double, verifique a saída no console
	//private BigDecimal preco = new BigDecimal(22.3);
	//private BigDecimal precoComImposto = new BigDecimal(20.9);
	
	//Utilizando String ele já traz os valores exatos para o bigdecimal, verifique a saída no console
	private BigDecimal preco = new BigDecimal("22.3");
	private BigDecimal precoComImposto = new BigDecimal("20.9");
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public BigDecimal getPrecoComImposto() {
		return precoComImposto;
	}
	public void setPrecoComImposto(BigDecimal precoComImposto) {
		this.precoComImposto = precoComImposto;
	}
	
	
	
	
	

}
