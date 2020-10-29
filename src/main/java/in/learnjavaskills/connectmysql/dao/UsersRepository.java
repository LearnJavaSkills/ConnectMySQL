package in.learnjavaskills.connectmysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.learnjavaskills.connectmysql.dto.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {}
