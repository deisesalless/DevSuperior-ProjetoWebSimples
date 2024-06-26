package br.com.devsuperior.exercicio.services;

import br.com.devsuperior.exercicio.dto.UserRequestDTO;
import br.com.devsuperior.exercicio.dto.UserResponseDTO;
import br.com.devsuperior.exercicio.entities.User;
import br.com.devsuperior.exercicio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}
