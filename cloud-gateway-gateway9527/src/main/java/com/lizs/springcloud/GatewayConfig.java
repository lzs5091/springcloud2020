package com.lizs.springcloud;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_lizs", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();

    }

}
