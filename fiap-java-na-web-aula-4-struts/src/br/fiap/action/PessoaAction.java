package br.fiap.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.fiap.bean.Pessoa;

@Namespace("/pessoa")
public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = -6903411240905425017L;
	private Pessoa pessoa;
	private String mensagem;

	public PessoaAction() {
		pessoa = new Pessoa();
	}

	@Action(value = "/cadastrar", results = { @Result(name = "success", location = "/sucesso.jsp"),
			@Result(name = "error", location = "/erro.jsp") })

	public String cadastrar() {
		System.out.println(this.pessoa);
		this.mensagem = "Tudo certo com seu cadastro";
		return SUCCESS;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
