package com.exercicio.farmacia10.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.exercicio.farmacia10.model.UserLogin;
import com.exercicio.farmacia10.model.Usuario;
import com.exercicio.farmacia10.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	//Cadastrar senha criptografada no banco de dados
	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		
		usuario.setSenha(senhaEncoder);
		
		return repository.save(usuario);
	}
	
	//Realizar login e retonar os atributos do classe UserLogin
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())){ //Compara senha criptografada do banco de dados com a senha informada pelo usuário
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();//Concatena o nome de usuário e senha separados por 2 pontos
				
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII"))); //Faz a criptografia e encoda em bytes
				
				String authHeader = "Basic " + new String(encodedAuth); //Concatena a palavra Basic com a variável encodedAuth em formato de String
				
				user.get().setToken(authHeader); //O primeiro get() é devido o uso do Optional
				user.get().setNome(usuario.get().getNome());
				
				return user;
			}
		}
		return null;
	}
	
}
