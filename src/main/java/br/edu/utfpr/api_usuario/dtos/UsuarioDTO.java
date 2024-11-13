package br.edu.utfpr.api_usuario.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioDTO(

    Long id,

    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    String nome,

    @NotNull(message = "Email não pode ser nulo")
    @Email(message = "Email deve ser válido")
    String email,

    @NotNull(message = "Password não pode ser nulo")
    @Size(min = 6, max = 10, message = "Password deve ter entre 6 e 10 caracteres")
    String password

) {}
