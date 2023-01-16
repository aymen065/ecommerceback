package com.eCommerce.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import com.eCommerce.app.Entities.Advertiser;
import com.eCommerce.app.Entities.Bill;
import com.eCommerce.app.Entities.Campaign;
import com.eCommerce.app.Entities.Category;
import com.eCommerce.app.Entities.Influencer;
import com.eCommerce.app.Entities.Offer;
import com.eCommerce.app.Entities.Product;
import com.eCommerce.app.Entities.Type;
import com.eCommerce.app.Entities.UserApp;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	CommandLineRunner run (RepositoryRestConfiguration rrc) {
		return args -> {
			rrc.exposeIdsFor(Influencer.class);
			rrc.exposeIdsFor(Advertiser.class);
			rrc.exposeIdsFor(UserApp.class);
			rrc.exposeIdsFor(Campaign.class);
			rrc.exposeIdsFor(Offer.class);
			rrc.exposeIdsFor(Product.class);
			rrc.exposeIdsFor(Category.class);
			rrc.exposeIdsFor(Type.class);
			rrc.exposeIdsFor(Bill.class);

			
			


			

			
		};
	}
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}
}
