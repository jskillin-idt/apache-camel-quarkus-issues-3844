package org.acme;

import io.quarkus.arc.Arc;
import io.quarkus.arc.InstanceHandle;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ExampleTest {

	@Test
	public void test() throws Exception {
		for (InstanceHandle<BeanThing> bean : Arc.container().listAll(BeanThing.class)) {
			bean.get().configure();
		}
	}

}