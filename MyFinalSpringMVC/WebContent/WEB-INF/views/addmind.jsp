<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Mind</title>
</head>
<body>

	<h3>Welome , Enter the Mind Details</h3>
	<form method="post" action="save" modelattribute="a">
		<table>
			<tr>
				<td><label path="mindname">Mind Name</label></td>td>
				<td colspan="2"><input type="text" path="mindname" value="$(aObject.mindname)"></td>
			</tr>
			<tr>
				<td><label path="trackname">Track Name</label></td>td>
				<td colspan="2"><input type="text" path="trackname" value="$(aObject.trackname)"></td>
			</tr>
			<tr>
				<td><label path="leadname">Lead Name</label></td>td>
				<td colspan="2"><input type="text" path="leadname" value="$(aObject.leadname)"></td>
			</tr>
			<tr>
				<td><label path="mindid">Mind Id</label></td>td>
				<td colspan="2"><input type="text" path="mindid" value="$(aObject.mindid)"></td>
			</tr>
			<tr>
				<td><label path="lead">Lead ID</label></td>td>
				<td colspan="2"><input type="text" path="leadid" value="$(aObject.leadid)"></td>
			</tr>
			<tr>
				<td><label path="trackid">track Id</label></td>td>
				<td colspan="2"><input type="text" path="trackid" value="$(aObject.trackid)"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" action="save"/></td>
				
			</tr>
		</table>
	</form>
</body>
</html>