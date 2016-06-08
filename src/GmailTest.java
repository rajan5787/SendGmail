
import org.junit.Test;

public class GmailTest {

	@Test
	public void testSendDirecto() {
		Gmail.send(
				"login", "rajandpipaliya@gmail.com",
				"password", "*********",
				"to", "rajandp36@gmail.com",
				"cc", "rajandp36@gmail.com",
				"bcc", "rajandp36@gmail.com",
				"subject", "prueba de email",
				"body", "<h1>Esto es una prueba de envio de correos</h1><p>exitosa!!</p>"
		);
	}
	
	@Test
	public void testConfigYSend() {
		//Esto quizas en el archivo de configuracion
		Gmail.config(
				"username", "rajandpipaliya@gmail.com", //alias de login
				"pass", "*********", //alias de password
				"to", "rajandp36@gmail.com",
				"cc", "rajandp36@gmail.com",
				"bcc", "rajandp36@gmail.com"
		);
		//esto en donde se envia el correo previamente ya configurado los parametros
		Gmail.send(
				"title", "prueba de email",//alias de subject
				"msg", "<h1>Esto es una prueba de envio de correos</h1><p>exitosa!!</p>"
		);
	}
}