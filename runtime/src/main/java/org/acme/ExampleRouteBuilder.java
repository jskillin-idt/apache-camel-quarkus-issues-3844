package org.acme;

import java.util.List;
import org.acme.config.ExampleConfig;
import org.apache.camel.builder.RouteBuilder;

public class ExampleRouteBuilder extends RouteBuilder {
  private final List<ExampleConfig> exampleConfigs;

  public ExampleRouteBuilder(List<ExampleConfig> exampleConfigs) {
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
