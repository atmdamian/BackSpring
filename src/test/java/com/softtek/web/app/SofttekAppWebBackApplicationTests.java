package com.softtek.web.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import com.google.gson.Gson;
import com.softtek.web.app.controller.UsuarioController;
import com.softtek.web.app.entity.producto.Producto;
import com.softtek.web.app.entity.usuario.Usuario;
import com.softtek.web.app.jms.Receiver;
import com.softtek.web.app.jms.Sender;
import com.softtek.web.app.response.ResponseMethod;
import com.softtek.web.app.service.UsuarioService;
import com.softtek.web.app.service.producto.ProductoService;

@SpringBootTest
class SofttekAppWebBackApplicationTests {
	private static Logger LOGGER = LoggerFactory.getLogger(SofttekAppWebBackApplicationTests.class);

	@Mock
	UsuarioService usuarioService;

	@Mock
	ProductoService productoService;

	@InjectMocks
	private UsuarioController usuarioController;

	@Mock
	private Sender sender;

	@Mock
	private Receiver receiver;

	/*@Test
	@DirtiesContext
	public void saveTest() {
		LOGGER.info("TEST UNITARIO SAVE PERSIST");
		Usuario usuario = new Usuario();
		usuario.setNombre("TEST");
		usuario.setUsuario("test");
		usuario.setPw("test");
		usuarioService.save(usuario);
	}

	@Test
	@DirtiesContext
	public void finadAllTest() {
		LOGGER.info("TEST UNITARIO FINDALL");
		usuarioService.findAll();
	}

	@Test
	@DirtiesContext
	public void finadAllFindByUsuario() {
		LOGGER.info("TEST UNITARIO FINDBYUSUARIO");
		List<Usuario> usuarios = usuarioService.findByUsuario("DAMIAN");
		usuarios.stream().forEach(list -> {
			assertEquals("DAMIAN", list.getNombre());

		});

	}

	@Test
	public void agregarUsuarioTest() {
		Gson g = new Gson();
		Usuario usuario = new Usuario();

		usuario.setNombre("TEST");
		usuario.setUsuario("test");
		usuario.setPw("test");

		ResponseEntity<?> httpResponse = usuarioController.agregarUsuario(usuario);

		LOGGER.info("STATUS CODE " + httpResponse.getStatusCode());
		LOGGER.info("BODY " + httpResponse.getBody());
		LOGGER.info("CODE " + httpResponse.getStatusCodeValue());
		LOGGER.info("CLASS " + httpResponse.getClass());
		LOGGER.info("HEADERS " + httpResponse.getHeaders());

		ResponseMethod response = g.fromJson((String) httpResponse.getBody(), ResponseMethod.class);

		Assert.assertEquals(httpResponse.getStatusCodeValue(), 200);
		Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals("GUARDADO CORRECTAMENTE", response.getMensaje());
		Assert.assertEquals("200", response.getEstatus());
	}

	@Test
	public void obtenerUsuarioTest() {
		List<Usuario> usuarios = usuarioController.obtenerUsuarios();
		Assert.assertNotNull(usuarios);
	}

	@Test
	@DirtiesContext
	public void finadAllProductoTest() {
		LOGGER.info("TEST UNITARIO FINDALLPRODUCTO");
		List<Producto> productos = this.productoService.findAll();
		Assert.assertNotNull(productos);
	}*/

	@Test
	public void testReceive() throws Exception {
		sender.send("Hello Spring JMS ActiveMQ!");

		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		assertThat(receiver.getLatch().getCount()).isEqualTo(0);
	}
}
