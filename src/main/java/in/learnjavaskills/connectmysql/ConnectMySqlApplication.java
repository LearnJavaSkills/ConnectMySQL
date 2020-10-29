package in.learnjavaskills.connectmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.learnjavaskills.connectmysql.dao.UsersRepository;
import in.learnjavaskills.connectmysql.dto.Users;

@SpringBootApplication
public class ConnectMySqlApplication 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConnectMySqlApplication.class, args);
		UsersRepository userRepository = context.getBean(UsersRepository.class);
		
		userRepository.save(
				Users.builder()
					 .firstname("Imran")
					 .lastname("Shaikh")
					 .build());
		
	}
}
