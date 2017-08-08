<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3>Lista de fatorial de 1 a 10</h3>
<%
	int fat = 1;
	for (int n = 1; n <= 10; n++) {
		fat *= n;
%>
<!--
Imprime s� texto, por isso n�o imprime tag 
<c:out value="<p> O fatorial de ${n} � igual a ${fat}" />
-->
<p>
	O fatorial de
	<%=n%>
	� igual a
	<%=fat%>.
</p>
<%
	}
%>