package gloss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import gloss.beans.LipGloss;
import gloss.beans.Manufacturer;
import gloss.controller.BeanConfiguration;
import gloss.repository.LipGlossRepository;

@SpringBootApplication
public class LipGlossApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LipGlossApplication.class, args);
	}
	
	@Autowired
	LipGlossRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		LipGloss lg = appContext.getBean("lipGloss", LipGloss.class);
		lg.setColorName("My Pink");
		lg.setColorNumber(01);
		repo.save(lg);
		
		LipGloss a = new LipGloss("Grape Vine", 20);
		Manufacturer ma = new Manufacturer();
		ma.setLine("BabyLips");
		ma.setName("Maybelline");
		a.setManufacturer(ma);
		
		LipGloss b = new LipGloss("Beam of Blush", 125);
		Manufacturer mb = new Manufacturer("Crystal BabyLips", "Maybelline");
		b.setManufacturer(mb);
		repo.save(b);
		
		List<LipGloss> all = repo.findAll();
		for (LipGloss gloss : all) {
			System.out.println(gloss.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	
		
}		
		



