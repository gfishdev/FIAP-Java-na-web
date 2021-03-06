package br.com.fiap.scj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formularioservlet")
public class FormularioServlet extends HttpServlet{

	private static final long serialVersionUID = -755116070470384495L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("Name");
		String email = req.getParameter("Email");
		String message = req.getParameter("Message");
		
		try{
			BufferedWriter writer = null;
			File logFile = new File("C:/WorkspaceGuilhermeRodrigues/fiap-java-na-web-aula-1/arquivos/informacoes-"+name+".txt");
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write("Name: " + name);
			writer.newLine();
		    writer.write("E-mail: " + email);
		    writer.newLine();
		    writer.write("Message: " + message);
		    writer.close();
		    resp.getWriter().append("<h1>Enviado com sucesso!</h1>");
		} catch (IOException e) {
			resp.getWriter().append("<h1>Ocorreu um erro na sua requisição, tente novamente mais tarde!</h1>");
			e.printStackTrace();
		}
	}

}
