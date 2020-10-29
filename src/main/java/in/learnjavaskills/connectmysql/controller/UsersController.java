package in.learnjavaskills.connectmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.learnjavaskills.connectmysql.dao.UsersRepository;
import in.learnjavaskills.connectmysql.dto.Users;

@RestController
public class UsersController
{
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping("allUsers")
	public List<Users> getAllUsers()
	{
		return usersRepository.findAll();
	}
}
