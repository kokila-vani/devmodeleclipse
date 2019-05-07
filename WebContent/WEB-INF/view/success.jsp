<%@ page import="java.util.*,com.demo.stm.model.Sandhiya"%>
<html>

<body>
	<%
		List<Sandhiya> students = (List<Sandhiya>) request.getAttribute("students");
	%>
	<h1>Here is a list</h1>
	<table border="1">
		<thead>
			<th>FirstName</th>
			<th>Age</th>
			<th colspan="2">Action</th>
		</thead>
		<%
			for (Sandhiya temp : students) {
		%>
		<tr>
			<td><%=temp.getFirstName() %></td>
			<td><%=temp.getAge() %></td>
			<td><a href="http://localhost:8080/Demo/editStudent?id=<%=temp.getId() %>"><button>Edit</button></a></td>
			<td><a href="http://localhost:8080/Demo/deleteStudent?id=<%=temp.getId() %>"><button>Delete</button></a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>