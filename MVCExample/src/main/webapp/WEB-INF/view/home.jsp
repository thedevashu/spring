<%@page import= "java.util.List"%>
<html>

<body>
<form action="/showbook" method="post">
<select name="bname">
<%String user = (String)request.getAttribute("user");
System.out.println(user);
List<String> l = (List<String>)request.getAttribute("bookid");
for(String bname:l){
%>
<option><%=bname%></option>
<%}%>
</select>
<input type="submit" value="check">
<h1>Welcome <%=user%></h1>
</form>
<br><br><br>

</body>
</html>