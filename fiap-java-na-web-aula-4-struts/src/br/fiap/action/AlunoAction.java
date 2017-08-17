package br.fiap.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.fiap.bean.Aluno;

@Namespace("/aluno")
public class AlunoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1045331989438116786L;
	
	
	private Aluno aluno;
	private List<Aluno> alunos;
	private String mensagem;

	public AlunoAction() {
		aluno = new Aluno();
		this.alunos = new ArrayList<>();
	}

	@Action(value = "/cadastrarAluno", results = { @Result(name = "success", location = "/alunos.jsp"),
			@Result(name = "error", location = "/erro.jsp") })

	public String cadastrarAluno() {
		System.out.println(this.aluno);
		this.alunos.add(this.aluno);
		System.out.println(this.alunos.size());
		this.mensagem = "Aluno cadastrado";
		return SUCCESS;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
