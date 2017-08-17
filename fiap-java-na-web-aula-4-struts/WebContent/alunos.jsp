<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos</title>
<sx:head />
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>RG</th>
				<th>Email</th>
				<th>Data de Nasc.</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="alunos" status="a">
				<tr>
					<td><s:property value="#a.nome"></s:property></td>
					<td><s:property value="#a.rg"></s:property></td>
					<td><s:property value="#a.email"></s:property></td>
					<td><s:property value="#a.dataNascimento"></s:property></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>