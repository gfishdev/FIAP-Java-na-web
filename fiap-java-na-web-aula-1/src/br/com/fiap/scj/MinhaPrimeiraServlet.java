package br.com.fiap.scj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinhaPrimeiraServlet extends HttpServlet {
	private static final long serialVersionUID = 1701830156840732811L;

	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp)
					throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		out.append("<h1>Minha primeira Servlet</h1>");
		
		/**
		 * TODO Quest�o de Prova 
		 * TODO Sess�o tem um tempo de expira��o
		 */
		HttpSession session = req.getSession(true);
		int id = Integer.parseInt(session.getAttribute("id").toString());
		out.append("Seu id session � " + ++id);
		session.setAttribute("id", id);
		
		/** 
		 * TODO Quest�o de prova 
		 */
		// req.getRequestDispatcher("/sucesso").forward(req, resp);
		// req.getRequestDispatcher("/sucesso").include(req, resp);
		// resp.sendRedirect("sucesso");
	}	
}
