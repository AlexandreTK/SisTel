package br.gov.cultura.DitelAdm.model.faturasV3;
// Generated 29/08/2016 10:12:50 by Hibernate Tools 4.3.4.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoriachamada MODEL: Padrão FEBRABAN v3
 */
@Entity
@Table(name = "categoria_chamada", catalog = "dbditel")
public class Categoriachamada implements java.io.Serializable {

	private Integer idCategoriaChamada;
	private int codCatChamada;
	private String sigla;
	private String descricao;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Chamadas> chamadases = new HashSet(0);
	
	public Categoriachamada() {
	}

	public Categoriachamada(int codCatChamada, String sigla, String descricao) {
		this.codCatChamada = codCatChamada;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Categoriachamada(int codCatChamada, String sigla, String descricao, Set<Chamadas> chamadases) {
		this.codCatChamada = codCatChamada;
		this.sigla = sigla;
		this.descricao = descricao;
		this.chamadases = chamadases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_categoriaChamada", unique = true, nullable = false)
	public Integer getIdCategoriaChamada() {
		return this.idCategoriaChamada;
	}

	public void setIdCategoriaChamada(Integer idCategoriaChamada) {
		this.idCategoriaChamada = idCategoriaChamada;
	}

	@Column(name = "codCatChamada", nullable = false)
	public int getCodCatChamada() {
		return this.codCatChamada;
	}

	public void setCodCatChamada(int codCatChamada) {
		this.codCatChamada = codCatChamada;
	}

	@Column(name = "sigla", nullable = false, length = 3)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "descricao", nullable = false, length = 25)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriachamada")
	public Set<Chamadas> getChamadases() {
		return this.chamadases;
	}

	public void setChamadases(Set<Chamadas> chamadases) {
		this.chamadases = chamadases;
	}

}
