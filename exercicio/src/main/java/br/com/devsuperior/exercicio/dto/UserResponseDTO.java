package br.com.devsuperior.exercicio.dto;

import br.com.devsuperior.exercicio.entities.User;

public record UserResponseDTO (Long id, String name, String password) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getName(), user.getPassword());
    }
}
