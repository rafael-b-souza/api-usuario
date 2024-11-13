package br.edu.utfpr.api_usuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.api_usuario.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
