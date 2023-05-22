package desafios.desafio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculaCabosTest {

	@Test
	public void deveRetornarUmaExcecaoParaComprimentoDaPonteForaDoLimiteDe2E4() {
		assertThrows(IllegalArgumentException.class, () -> new Ponte(new BigDecimal("1.5")));
		assertThrows(IllegalArgumentException.class, () -> new Ponte(new BigDecimal("4.5")));
	}
	
	@Test
	public void alturaDasHastesDeveSerAVigesimaPartedoComprimentoDaPonte() {		
		Ponte ponte = new Ponte(new BigDecimal("3"));
		assertEquals(new BigDecimal("3").divide(new BigDecimal("20")), ponte.getAlturaHaste());
	}
	
	@Test
	public void testaCalculoDaQuantidadeDeCabosDaPonte() {		
		Ponte ponte = new Ponte(new BigDecimal("4"));
		CalculaCabos cc = new CalculaCabos(ponte);
		
		BigDecimal meioDaPonte = ponte.getComprimento().divide(new BigDecimal("2"));
		List<BigDecimal> partesHastes = new ArrayList<>();
		List<BigDecimal> partesPonte = new ArrayList<>();
		
		BigDecimal espacoHastes = ponte.getAlturaHaste().divide(new BigDecimal("5"));
		for(int i = 1; i < 6; i++) {
			partesHastes.add(espacoHastes.multiply(new BigDecimal(i)));
		}
		
		BigDecimal espacoPontes = meioDaPonte.divide(new BigDecimal("5"));
		for(int i = 1; i < 6; i++) {
			partesPonte.add(espacoPontes.multiply(new BigDecimal(i)));
		}
		
		BigDecimal total = BigDecimal.ZERO;
		for(int i = 0; i < 5; i++) {
			BigDecimal cabo = new BigDecimal(Math.sqrt(partesHastes.get(i).pow(2).add(partesPonte.get(i).pow(2)).doubleValue()));						
			total = total.add(cabo);
		}
		
		total = total.multiply(new BigDecimal("4"));
		
		assertEquals(total.setScale(2, RoundingMode.UP) , cc.calcularMetrosDeCabos());
	}
	
	
	
}
