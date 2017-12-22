<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>hello JSP</h3>
<h3>this is h3</h3>

<%!
public int add(int a, int b)
{
	return a+b;
}
%>

 <%
int j=1;
int k=2;
int l=j+k;	
%>

<%
  k = add(5,3);
%>

<br><br>
The valus of L is : <%=k %>

<%for(int i=0; i<5; i++) { 
%>

<br> the new value of i is <%=i %>
<%} %>


</body>
</html>