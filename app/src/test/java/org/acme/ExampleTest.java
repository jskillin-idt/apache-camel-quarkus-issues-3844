package org.acme;

import io.quarkus.arc.Arc;
import io.quarkus.arc.InstanceHandle;
import io.quarkus.test.junit.QuarkusTest;
import org.apache.camel.CamelContext;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ExampleTest {

	@Test
	public void test() throws Exception {
		try (InstanceHandle<CamelContext> instanceHandle = Arc.container().instance(CamelContext.class)) {
			CamelContext camelContext = instanceHandle.get();
			for (ExampleRouteBuilder exampleRouteBuilder : camelContext.getRegistry().findByType(ExampleRouteBuilder.class)) {
				System.out.println(exampleRouteBuilder);
				exampleRouteBuilder.configure();
			}

		}
	}

}