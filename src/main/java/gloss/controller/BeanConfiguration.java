package gloss.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gloss.beans.LipGloss;
import gloss.beans.Manufacturer;

@Configuration
public class BeanConfiguration {
	

	
	@Bean
	public LipGloss lipGloss() {
		LipGloss bean = new LipGloss("Pink Punch", 25);
		return bean;
	}
	
	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer("Maybelline", "BabyLips");
		return bean;
	}
}
