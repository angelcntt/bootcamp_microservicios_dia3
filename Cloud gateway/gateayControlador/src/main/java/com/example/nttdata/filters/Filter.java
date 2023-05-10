package com.example.nttdata.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class Filter {
		Logger log = LoggerFactory.getLogger(getClass());
		
		@Bean
		@Order(-1)
		// chain son los filtros y exchange el siguiente paso a realizar 
		public GlobalFilter a() {
			return (exchange,chain)->{
				
				log.info("Primer pre filter");
				//then para el post filter
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
						log.info("Tercer post filter");
				}));
			};
		}
		
		//recordar que el primer post filter que se ejecuta es aquel cuyo filtro tiene mayor valor en este caso 0
		
		@Bean
		@Order(0)
		// chain son los filtros y exchange el siguiente paso a realizar 
		public GlobalFilter b() {
			return (exchange,chain)->{
				
				log.info("Segundo pre filter");
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
					log.info("Segundo post filter");
			}));
			};
		}
		
		@Bean
		@Order(1)
		// chain son los filtros y exchange el siguiente paso a realizar 
		public GlobalFilter c() {
			return (exchange,chain)->{
				
				log.info("Tercer pre filter");
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
					log.info("Primer post filter");
			}));
			};
		}
}
