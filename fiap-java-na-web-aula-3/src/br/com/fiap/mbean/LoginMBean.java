package br.com.fiap.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginMBean {

	private String boasvindas = "Olá, bem-vindo!";
	private String login;
	private String senha;

	public String getBoasvindas() {
		return boasvindas;
	}

	public void setBoasvindas(String boasvindas) {
		this.boasvindas = boasvindas;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void logar() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "LoginMBean [boasvindas=" + boasvindas + ", login=" + login + ", senha=" + senha + "]";
	}

}
