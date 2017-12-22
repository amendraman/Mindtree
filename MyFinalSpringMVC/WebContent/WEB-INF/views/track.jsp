<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
		
		.borderclass,th,tr,td{
			background-color: #f9f9f9;
			margin: 40px;
			border: 2px solid black;
			padding:20px;
		}
		.some{
			margin: 40px;
			font-size: 20px;
			background-color: #2d8cpe;
		}
	</style>

</head>
<body>

<h2 align="center" class="some">All lead details</h2>
	
	<form class="borderclass" modelAttribute="leads">
		<c:if test="${!empty minds }">
		</c:if>
		
		<table align="center">
			<div class="some">
				<tr>
					<th>Lead id</th>
					<th>Lead name</th>
				</tr>
			</div>
			
			<c:forEach items="${xyz }" var="x">
				<tr>
					<td>
						<c:out value="${x.lid }"></c:out>
					</td>
					<td>
						<c:out value="${x.lname }"></c:out>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>