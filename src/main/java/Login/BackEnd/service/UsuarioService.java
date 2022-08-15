package Login.BackEnd.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import Login.BackEnd.controller.dto.UsuarioRegistroDTO;
import Login.BackEnd.model.Usuario;


public interface UsuarioService extends UserDetailsService{

	Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	List<Usuario> listarUsuarios();
	
}
