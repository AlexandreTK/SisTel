package br.gov.cultura.DitelAdm.model;
// Generated 17/08/2016 19:31:54 by Hibernate Tools 4.3.4.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

/**
 * Dispositivo generated by hbm2java
 */
@Entity
@Table(name = "dispositivo", catalog = "diteladmdev")
public class Dispositivo implements java.io.Serializable {

	private Integer idDispositivo;
	private String numeroSerieDispositivo;
	private String marcaDispositivo;
	private String modeloDispositivo;
	private String imeiDispositivo;
	private String macDispositivo;
	private String tipoDispositivo;
	private BigDecimal valorDispositivo;
	private String patrimonioDispositivo;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Set<AlocacaoLinhaDispositivo> alocacaoLinhaDispositivos = new HashSet(0);

	public Dispositivo() {
	}

	public Dispositivo(String numeroSerieDispositivo, String marcaDispositivo, String modeloDispositivo,
			String tipoDispositivo, BigDecimal valorDispositivo) {
		this.numeroSerieDispositivo = numeroSerieDispositivo;
		this.marcaDispositivo = marcaDispositivo;
		this.modeloDispositivo = modeloDispositivo;
		this.tipoDispositivo = tipoDispositivo;
		this.valorDispositivo = valorDispositivo;
	}

	public Dispositivo(String numeroSerieDispositivo, String marcaDispositivo, String modeloDispositivo,
			String imeiDispositivo, String macDispositivo, String tipoDispositivo, BigDecimal valorDispositivo,
			String patrimonioDispositivo, Set<AlocacaoLinhaDispositivo> alocacaoLinhaDispositivos) {
		this.numeroSerieDispositivo = numeroSerieDispositivo;
		this.marcaDispositivo = marcaDispositivo;
		this.modeloDispositivo = modeloDispositivo;
		this.imeiDispositivo = imeiDispositivo;
		this.macDispositivo = macDispositivo;
		this.tipoDispositivo = tipoDispositivo;
		this.valorDispositivo = valorDispositivo;
		this.patrimonioDispositivo = patrimonioDispositivo;
		this.alocacaoLinhaDispositivos = alocacaoLinhaDispositivos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDispositivo", unique = true, nullable = false)
	public Integer getIdDispositivo() {
		return this.idDispositivo;
	}

	public void setIdDispositivo(Integer idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	@Column(name = "numeroSerieDispositivo", nullable = false)
	@Size(min=5,message="Verifique o numero de serie!")
	@NotEmpty(message="Numero de serie e obrigatório!")
	public String getNumeroSerieDispositivo() {
		return this.numeroSerieDispositivo;
	}

	public void setNumeroSerieDispositivo(String numeroSerieDispositivo) {
		this.numeroSerieDispositivo = numeroSerieDispositivo;
	}

	@Column(name = "marcaDispositivo", nullable = false)
	@NotEmpty(message="Marca e obrigatorio!")
	@Size(max = 100, message = "Maximo de 100 caracteres para marca do dispositivo!")
	public String getMarcaDispositivo() {
		return this.marcaDispositivo;
	}

	public void setMarcaDispositivo(String marcaDispositivo) {
		this.marcaDispositivo = marcaDispositivo;
	}

	@Column(name = "modeloDispositivo", nullable = false)
	@NotEmpty(message="Modelo do dispositivo e obrigatorio!")
	@Size(max = 100, message = "Maximo de 30 caracteres para modelo do dispositivo!")
	public String getModeloDispositivo() {
		return this.modeloDispositivo;
	}

	public void setModeloDispositivo(String modeloDispositivo) {
		this.modeloDispositivo = modeloDispositivo;
	}

	@Column(name = "imeiDispositivo")
	@Size(min=5,message="Verifique o numero IMEI!")
	@NotEmpty(message="Numero IMEI e obrigatório!")
	public String getImeiDispositivo() {
		return this.imeiDispositivo;
	}

	public void setImeiDispositivo(String imeiDispositivo) {
		this.imeiDispositivo = imeiDispositivo;
	}

	@Column(name = "macDispositivo")
	@Size(min=5,message="Verifique o numero MAC!")
	@NotEmpty(message="Numero MAC e obrigatório!")
	public String getMacDispositivo() {
		return this.macDispositivo;
	}

	public void setMacDispositivo(String macDispositivo) {
		this.macDispositivo = macDispositivo;
	}

	@Column(name = "tipoDispositivo", nullable = false)
	public String getTipoDispositivo() {
		return this.tipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

	@Column(name = "valorDispositivo", nullable = false, precision = 10)
	@NotNull(message="Valor e obrigatorio!")
	@DecimalMin(value = "0.01", message = "Valor minimo de R$0,01!" )
	@DecimalMax(value = "9999999.99", message ="Valor ultrapassa valor maximo!")
	@NumberFormat(pattern="#,##0.00")
	public BigDecimal getValorDispositivo() {
		return this.valorDispositivo;
	}

	public void setValorDispositivo(BigDecimal valorDispositivo) {
		this.valorDispositivo = valorDispositivo;
	}

	@Column(name = "patrimonioDispositivo")
	@Size(min=5,message="Verifique o numero do Patrimonio!")
	@NotEmpty(message="Numero do Patrimonio e obrigatório!")
	public String getPatrimonioDispositivo() {
		return this.patrimonioDispositivo;
	}

	public void setPatrimonioDispositivo(String patrimonioDispositivo) {
		this.patrimonioDispositivo = patrimonioDispositivo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dispositivo")
	public Set<AlocacaoLinhaDispositivo> getAlocacaoLinhaDispositivos() {
		return this.alocacaoLinhaDispositivos;
	}

	public void setAlocacaoLinhaDispositivos(Set<AlocacaoLinhaDispositivo> alocacaoLinhaDispositivos) {
		this.alocacaoLinhaDispositivos = alocacaoLinhaDispositivos;
	}

}