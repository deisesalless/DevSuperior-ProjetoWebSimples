package br.com.devsuperior.exercicio.dto;

import br.com.devsuperior.exercicio.entities.User;

public record UserResponseDTO (Long id, String username, String password) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getUsername(), user.getPassword());
    }
}
