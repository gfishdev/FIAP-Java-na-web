package br.com.fiap.mbean;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CardapioMBean {
	private String nome;
	
	private BigDecimal valor;
	
	private Tipo tipoSelecionado;
	
	public Tipo[] getTipos() {
        return Tipo.values();
    }
	
	private enum Tipo {
		SOBREMESA,
		PRATO_PRINCIPAL
	}
	
	public void salvar() {
		// System.out.println(this);
		// return "sucesso?faces-redirect=true";
		 FacesContext.getCurrentInstance().addMessage(null, 
			 	new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O seu coisa acabou de dar sucesso!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Tipo getTipoSelecionado() {
		return tipoSelecionado;
	}

	public void setTipoSelecionado(Tipo tipoSelecionado) {
		this.tipoSelecionado = tipoSelecionado;
	}

	@Override
	public String toString() {
		return "CardapioMBean [nome=" + nome + ", valor=" + valor + ", tipoSelecionado=" + tipoSelecionado + "]";
	}
	
	
}
