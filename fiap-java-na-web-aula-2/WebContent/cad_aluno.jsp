<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="aluno" class="br.com.fiap.bean.AlunoBean" scope="page">
	<!-- Se o nome do parametro for igual não precisa do param, 
	e pode usar asterisco para fazer automaticamente todas os properties -->
	<jsp:setProperty name="aluno" property="*"/>
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro do aluno</title>
	</head>
	<body>
		Olá <jsp:getProperty property="nome" name="aluno"/>
	</body>
</html>