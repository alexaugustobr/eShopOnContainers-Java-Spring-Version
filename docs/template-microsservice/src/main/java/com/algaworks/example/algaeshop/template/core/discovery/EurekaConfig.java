package com.algaworks.example.algaeshop.template.core.discovery;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Profile;

@Profile("eureka")
@EnableDiscoveryClient
public class EurekaConfig {
}
