package br.gov.cultura.DitelAdm.model.faturasV3;
// Generated 29/08/2016 10:12:50 by Hibernate Tools 4.3.4.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fatura generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "fatura", catalog = "diteladmdev")
public class Fatura implements java.io.Serializable {

	private Integer idFatura;
	private Cliente cliente;
	private int numFatura;
	private Date dataEmissao;
	private String indConta;
	private String mesRef;
	private Date dataVenc;
	private String codBarra;
	private String codCobranca;
	private String descriCobranca;
	private String bancoCobranca;
	private String agenciaCobranca;
	private String ccCobranca;
	private String fisco;
	private Date dataGeraArquivo;
	private String versaoFormato;
	private String campoLivreOp;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Trailler> traillers = new HashSet(0);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Enderecos> enderecoses = new HashSet(0);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Notafiscal> notafiscals = new HashSet(0);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Resumo> resumos = new HashSet(0);

	public Fatura() {
	}

	public Fatura(Cliente cliente, int numFatura, Date dataEmissao, String indConta, String mesRef, Date dataVenc,
			String codCobranca, String descriCobranca, Date dataGeraArquivo, String versaoFormato) {
		this.cliente = cliente;
		this.numFatura = numFatura;
		this.dataEmissao = dataEmissao;
		this.indConta = indConta;
		this.mesRef = mesRef;
		this.dataVenc = dataVenc;
		this.codCobranca = codCobranca;
		this.descriCobranca = descriCobranca;
		this.dataGeraArquivo = dataGeraArquivo;
		this.versaoFormato = versaoFormato;
	}

	public Fatura(Cliente cliente, int numFatura, Date dataEmissao, String indConta, String mesRef, Date dataVenc,
			String codBarra, String codCobranca, String descriCobranca, String bancoCobranca, String agenciaCobranca,
			String ccCobranca, String fisco, Date dataGeraArquivo, String versaoFormato, String campoLivreOp,
			Set<Trailler> traillers, Set<Enderecos> enderecoses, Set<Notafiscal> notafiscals, Set<Resumo> resumos) {
		this.cliente = cliente;
		this.numFatura = numFatura;
		this.dataEmissao = dataEmissao;
		this.indConta = indConta;
		this.mesRef = mesRef;
		this.dataVenc = dataVenc;
		this.codBarra = codBarra;
		this.codCobranca = codCobranca;
		this.descriCobranca = descriCobranca;
		this.bancoCobranca = bancoCobranca;
		this.agenciaCobranca = agenciaCobranca;
		this.ccCobranca = ccCobranca;
		this.fisco = fisco;
		this.dataGeraArquivo = dataGeraArquivo;
		this.versaoFormato = versaoFormato;
		this.campoLivreOp = campoLivreOp;
		this.traillers = traillers;
		this.enderecoses = enderecoses;
		this.notafiscals = notafiscals;
		this.resumos = resumos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_fatura", unique = true, nullable = false)
	public Integer getIdFatura() {
		return this.idFatura;
	}

	public void setIdFatura(Integer idFatura) {
		this.idFatura = idFatura;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_codCliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "numFatura", nullable = false)
	public int getNumFatura() {
		return this.numFatura;
	}

	public void setNumFatura(int numFatura) {
		this.numFatura = numFatura;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataEmissao", nullable = false, length = 10)
	public Date getDataEmissao() {
		return this.dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@Column(name = "indConta", nullable = false, length = 25)
	public String getIndConta() {
		return this.indConta;
	}

	public void setIndConta(String indConta) {
		this.indConta = indConta;
	}

	@Column(name = "mesRef", nullable = false, length = 16777215)
	public String getMesRef() {
		return this.mesRef;
	}

	public void setMesRef(String mesRef) {
		this.mesRef = mesRef;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataVenc", nullable = false, length = 10)
	public Date getDataVenc() {
		return this.dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	@Column(name = "codBarra", length = 16777215)
	public String getCodBarra() {
		return this.codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	@Column(name = "codCobranca", nullable = false, length = 16777215)
	public String getCodCobranca() {
		return this.codCobranca;
	}

	public void setCodCobranca(String codCobranca) {
		this.codCobranca = codCobranca;
	}

	@Column(name = "descriCobranca", nullable = false, length = 20)
	public String getDescriCobranca() {
		return this.descriCobranca;
	}

	public void setDescriCobranca(String descriCobranca) {
		this.descriCobranca = descriCobranca;
	}

	@Column(name = "bancoCobranca", length = 16777215)
	public String getBancoCobranca() {
		return this.bancoCobranca;
	}

	public void setBancoCobranca(String bancoCobranca) {
		this.bancoCobranca = bancoCobranca;
	}

	@Column(name = "agenciaCobranca", length = 16777215)
	public String getAgenciaCobranca() {
		return this.agenciaCobranca;
	}

	public void setAgenciaCobranca(String agenciaCobranca) {
		this.agenciaCobranca = agenciaCobranca;
	}

	@Column(name = "ccCobranca", length = 16777215)
	public String getCcCobranca() {
		return this.ccCobranca;
	}

	public void setCcCobranca(String ccCobranca) {
		this.ccCobranca = ccCobranca;
	}

	@Column(name = "fisco", length = 35)
	public String getFisco() {
		return this.fisco;
	}

	public void setFisco(String fisco) {
		this.fisco = fisco;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataGeraArquivo", nullable = false, length = 10)
	public Date getDataGeraArquivo() {
		return this.dataGeraArquivo;
	}

	public void setDataGeraArquivo(Date dataGeraArquivo) {
		this.dataGeraArquivo = dataGeraArquivo;
	}

	@Column(name = "versaoFormato", nullable = false, length = 4)
	public String getVersaoFormato() {
		return this.versaoFormato;
	}

	public void setVersaoFormato(String versaoFormato) {
		this.versaoFormato = versaoFormato;
	}

	@Column(name = "campoLivreOp", length = 25)
	public String getCampoLivreOp() {
		return this.campoLivreOp;
	}

	public void setCampoLivreOp(String campoLivreOp) {
		this.campoLivreOp = campoLivreOp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatura")
	public Set<Trailler> getTraillers() {
		return this.traillers;
	}

	public void setTraillers(Set<Trailler> traillers) {
		this.traillers = traillers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatura")
	public Set<Enderecos> getEnderecoses() {
		return this.enderecoses;
	}

	public void setEnderecoses(Set<Enderecos> enderecoses) {
		this.enderecoses = enderecoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatura")
	public Set<Notafiscal> getNotafiscals() {
		return this.notafiscals;
	}

	public void setNotafiscals(Set<Notafiscal> notafiscals) {
		this.notafiscals = notafiscals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatura")
	public Set<Resumo> getResumos() {
		return this.resumos;
	}

	public void setResumos(Set<Resumo> resumos) {
		this.resumos = resumos;
	}

}
