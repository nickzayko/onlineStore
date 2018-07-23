package by.teachmeskills.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;


@SpringBootApplication
public class OnlineStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreApplication.class, args);
	}

//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory() {
//		return new HibernateJpaSessionFactoryBean();
//	}

//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
//		HibernateJpaSessionFactoryBean fact = new HibernateJpaSessionFactoryBean();
//		fact.setEntityManagerFactory(emf);
//		return fact;
//	}

	@Bean
	public HibernateExceptionTranslator hibernateExceptionTranslator(){
		return new HibernateExceptionTranslator();
	}


//	@Autowired
//	EntityManager entityManager;
//
//	@Bean
//	public SessionFactory sessionFactory(@Qualifier("entityManagerFactory") EntityManagerFactory emf) {
//		return emf.unwrap(SessionFactory.class);
//	}


}

