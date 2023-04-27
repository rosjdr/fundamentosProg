package desafios.desafio1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ponte {

	
	private BigDecimal comprimento;
	private BigInteger hastes;
	private BigDecimal alturaHastes;

	public Ponte(BigDecimal comprimento) {		
		
		this.comprimento = validarComprimento(comprimento);
		this.hastes = new BigInteger("4");
		this.alturaHastes = this.comprimento.divide(new BigDecimal("20"));
	}

	private BigDecimal validarComprimento(BigDecimal comprimento) {
		if(
			comprimento.compareTo(new BigDecimal("2.00")) == -1 ||
			comprimento.compareTo(new BigDecimal("4.00")) == 1)
			throw new IllegalArgumentException("Comprimento da Ponte deve estar entre 2 e 4.");
		return comprimento;
	}
	
	public BigDecimal getComprimento() {
		return this.comprimento;
	}

	public BigDecimal getAlturaHaste() {
		return this.alturaHastes;
	}

}
