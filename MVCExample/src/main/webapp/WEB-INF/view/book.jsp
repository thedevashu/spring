
<%@page import="java.util.List"%>
<%@page import="com.study.entity.BookEntity"%>
<html>

<body>
<%String bid = (String)request.getAttribute("bookid"); 
BookEntity bk = (BookEntity)request.getAttribute("book");

%>
<b><ol>Book id=<%=bk.getId() %> Book name=<%=bk.getBname() %> Book Cost=<%=bk.getBcost() %></ol></b>

<pre>
<h3>Want to delete a book?</h3>
<form action="/delete" method="post">
<select name="bname">
<%
List<String> l = (List<String>)request.getAttribute("books");
for(String bname:l){
%>
<option><%=bname%></option>
<%}%>
</select>
<input type="submit" value="delete">

</form>
</pre>
</body>
</html>