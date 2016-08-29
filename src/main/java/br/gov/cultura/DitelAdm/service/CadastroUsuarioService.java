package br.gov.cultura.DitelAdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cultura.DitelAdm.model.Usuario;
import br.gov.cultura.DitelAdm.repository.Usuarios;
import br.gov.cultura.DitelAdm.repository.filtro.CadastroFiltroPesquisa;

@Service
public class CadastroUsuarioService {

	@Autowired
	private Usuarios usuarios;

	public void salvar(Usuario usuario) {
		usuarios.save(usuario);
	}

	public void excluir(Long id) {
		usuarios.delete(id);
	}

	public List<Usuario> filtrar(CadastroFiltroPesquisa filtro) {
		String nome = filtro.getNome() == null ? "%" : filtro.getNome();
		return usuarios.findByNomeUsuarioContaining(nome);
	}
}