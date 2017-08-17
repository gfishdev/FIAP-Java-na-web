<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
<sx:head />
</head>
<body>
	<s:property value="mensagem" />
	<s:form action="/cadastrarAluno" namespace="/aluno" method="post"
		enctype="multipart/form-data">
		<s:textfield name="aluno.nome" label="Nome" />
		<s:textfield name="aluno.rg" label="RG" />
		<s:textfield name="aluno.email" label="E-mail" />
		<sx:datetimepicker
			name="aluno.dataNasc"
			label="Format (dd-MMM-yyyy)"
			displayFormat="dd-MMM-yyyy" value="%{'today'}" />
		<s:submit />
	</s:form>
</body>
</html>