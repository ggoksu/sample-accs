package demo;

import java.util.Optional;
import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

	public static final Optional<String> host;
    public static final Optional<String> port;
    public static final Properties props = new Properties();

    static {
        host = Optional.ofNullable(System.getenv("HOSTNAME"));
        port = Optional.ofNullable(System.getenv("PORT"));
    }

	public static void main(String[] args) {
		props.setProperty("server.address", host.orElse("localhost"));
        props.setProperty("server.port", port.orElse("8080"));
        SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(props);
		app.run(args);
	}
}