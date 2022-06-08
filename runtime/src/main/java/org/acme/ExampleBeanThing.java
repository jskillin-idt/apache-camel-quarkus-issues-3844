package org.acme;

import java.util.List;
import org.acme.config.ExampleConfig;

public class ExampleBeanThing implements BeanThing {
  private final List<ExampleConfig> exampleConfigs;

  public ExampleBeanThing(List<ExampleConfig> exampleConfigs) {
    this.exampleConfigs = exampleConfigs;
  }

  @Override
  public void configure() {
    // NullPointerException since exampleConfigs will be null
    for (ExampleConfig buildItem : exampleConfigs) {
      System.out.println(buildItem);
    }
  }
}
