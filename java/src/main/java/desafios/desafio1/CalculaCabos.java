package desafios.desafio1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CalculaCabos {
	
	private static final int QUANTIADE_CASAS_DECIMAIS = 2;
	private static final String QUANTIDADE_PARTES_PONTE = "2";
	private static final String QUANTIDADE_DE_CABOS_POR_HASTE = "5";
	
	private List<BigDecimal> partesHastes;
	private List<BigDecimal> partesPonte;
	private Ponte ponte;
	
	public CalculaCabos(Ponte ponte) {
		this.ponte = ponte;
		
		this.partesHastes = new ArrayList<>();
		this.partesPonte = new ArrayList<>();
	}

	public BigDecimal calcularMetrosDeCabos() {
		calcularEspacosEntreCabos();		
		return calcularTotalDeCabos();
	}

	private void calcularEspacosEntreCabos() {
		preencherPartesHastes(this.ponte);		
		preencherEspacoPonte(this.ponte);
	}

	private BigDecimal calcularTotalDeCabos() {
		BigDecimal total = BigDecimal.ZERO;
		for(int i = 0; i < 5; i++) {
			BigDecimal cabo = new BigDecimal(Math.sqrt(partesHastes.get(i).pow(2).add(partesPonte.get(i).pow(2)).doubleValue()));						
			total = total.add(cabo);
		}
		
		return total.multiply(new BigDecimal("4")).setScale(QUANTIADE_CASAS_DECIMAIS, RoundingMode.UP);
	}

	private void preencherEspacoPonte(Ponte ponte) {
		BigDecimal meioDaPonte = calcularMeioDaPonte(ponte);
		BigDecimal espacoPontes = calcularEspacoEntreCabosNaPonte(meioDaPonte);
		for(int i = 1; i < 6; i++) {
			partesPonte.add(espacoPontes.multiply(new BigDecimal(i)));
		}
	}

	private void preencherPartesHastes(Ponte ponte) {
		BigDecimal espacoHastes = calcularEspacoEntreHastes(ponte);
		for(int i = 1; i < 6; i++) {
			partesHastes.add(espacoHastes.multiply(new BigDecimal(i)));
		}
	}

	private BigDecimal calcularEspacoEntreCabosNaPonte(BigDecimal meioDaPonte) {
		return meioDaPonte.divide(new BigDecimal(QUANTIDADE_DE_CABOS_POR_HASTE));
	}

	private BigDecimal calcularEspacoEntreHastes(Ponte ponte) {
		return ponte.getAlturaHaste().divide(new BigDecimal(QUANTIDADE_DE_CABOS_POR_HASTE));
	}

	private BigDecimal calcularMeioDaPonte(Ponte ponte) {
		return ponte.getComprimento().divide(new BigDecimal(QUANTIDADE_PARTES_PONTE));
	}

}
