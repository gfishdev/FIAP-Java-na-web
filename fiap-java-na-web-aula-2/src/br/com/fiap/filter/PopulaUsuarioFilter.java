package br.com.fiap.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.fiap.bean.UsuarioSessaoBean;

@WebFilter(filterName = "PopulaUsuarioFilter", urlPatterns = { "/*" })
public class PopulaUsuarioFilter implements Filter {

	private UsuarioSessaoBean usuario = new UsuarioSessaoBean();

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) req;
		r.getSession(true);
		Date agora = new Date();
		if (usuario.getPrimeiroAcesso() == null)
			usuario.setPrimeiroAcesso(agora);
		usuario.setUltimoAcesso(agora);
		r.setAttribute("usuario", usuario);

		chain.doFilter(req, resp);
	}
}
