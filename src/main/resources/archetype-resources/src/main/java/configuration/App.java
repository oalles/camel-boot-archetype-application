package ${package}.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
public class App {

	private static Logger LOG = LoggerFactory.getLogger(App.class);

	@Autowired
	CamelContext camelContext;

	public static void main(String... args) {

		ApplicationContext applicationContext = new SpringApplication(App.class)
				.run(args);

		// String[] beanNames = applicationContext.getBeanDefinitionNames();
		// Arrays.sort(beanNames);
		// for (String beanName : beanNames) {
		// LOG.debug("Bean: {}", beanName);
		// }

		CamelSpringBootApplicationController applicationController = applicationContext
				.getBean(CamelSpringBootApplicationController.class);
		applicationController.blockMainThread();
	}
}
