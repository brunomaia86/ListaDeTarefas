package br.com.caelum.tarefa.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

@Entity
public class Cliente {
	@NotNull
	private String nome;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataNascimento;
	@Id
	@NotNull
	private String cpf;
	private String rg;
	private String sexo;
	private String email;
	private String estadoCivil;
	private String cep;
	private String endereco;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;
	private String telefoneRecidencial;
	private String telefoneCelular;
	private Boolean portadorDeficiencia;
	private int pessoasResponsaveis;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefoneRecidencial() {
		return telefoneRecidencial;
	}
	public void setTelefoneRecidencial(String telefoneRecidencial) {
		this.telefoneRecidencial = telefoneRecidencial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public Boolean getPortadorDeficiencia() {
		return portadorDeficiencia;
	}
	public void setPortadorDeficiencia(Boolean portadorDeficiencia) {
		this.portadorDeficiencia = portadorDeficiencia;
	}
	public int getPessoasResponsaveis() {
		return pessoasResponsaveis;
	}
	public void setPessoasResponsaveis(int pessoasResponsaveis) {
		this.pessoasResponsaveis = pessoasResponsaveis;
	}
	
}
