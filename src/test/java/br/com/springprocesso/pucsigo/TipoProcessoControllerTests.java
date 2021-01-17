package br.com.springprocesso.pucsigo;
import br.com.springprocesso.pucsigo.controller.TipoProcessoController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class TipoProcessoControllerTests {

	@Autowired
	private TipoProcessoController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}