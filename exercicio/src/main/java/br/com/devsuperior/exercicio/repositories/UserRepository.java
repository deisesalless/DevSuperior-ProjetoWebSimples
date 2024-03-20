package br.com.devsuperior.exercicio.repositories;

import br.com.devsuperior.exercicio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
