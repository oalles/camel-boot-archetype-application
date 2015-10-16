package ${package};

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringDelegatingTestContextLoader;
import org.apache.camel.test.spring.CamelSpringJUnit4ClassRunner;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.StopWatch;

@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfiguration.class }, loader = CamelSpringDelegatingTestContextLoader.class)
@MockEndpoints
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
// @DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class SomeTests extends AbstractJUnit4SpringContextTests {

	// dependency: camel-spring-javaconfig
	private static Logger LOG = LoggerFactory.getLogger(SomeTests.class);

	@Autowired
	private CamelContext camelContext;

	@EndpointInject(uri = "mock:test")
	private MockEndpoint mock;

	private StopWatch stopWatch = new StopWatch(getClass().getSimpleName());

	@Before
	public void beforeTest() throws Exception {

		mock.reset();
	}

	@After
	public void afterTest() {
		// for (Route route : camelContext.getRoutes()) {
		// try {
		// camelContext.stopRoute(route.getId());
		// } catch (Exception e) {
		// LOG.error("Exception trying to stop de routes",
		// e);
		// }
		// }
	}
}