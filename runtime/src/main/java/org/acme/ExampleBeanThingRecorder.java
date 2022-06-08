package org.acme;

import io.quarkus.runtime.annotations.Recorder;
import java.util.List;
import java.util.function.Supplier;
import org.acme.config.ExampleConfig;

@Recorder
public class ExampleBeanThingRecorder {
  public Supplier<ExampleBeanThing> getExampleBeanThingSupplier(
      final List<ExampleConfig> exampleConfigs) {
    return () -> new ExampleBeanThing(exampleConfigs);
  }
}
