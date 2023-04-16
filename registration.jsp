<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create</title>
</head>
<body>
<h2>create New Registration</h2>



<form action="save" method="post">
      <pre>
      name<input type="text" name="name"/>
      city<input type="text" name="city"/>
      email<input type="email" name="email"/>
      mobile<input type="mobile" name="mobile"/>
      <input type="submit" value="save"/> 
      </pre>
</form>

<%
  if(request.getAttribute("error")!=null)
  out.println(request.getAttribute("msg"));
%>

</body>
</html>
