<%@page import="com.z3un3un.utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String id = request.getParameter("id");
String pw = request.getParameter("pw");
if(request.getParameter("save_check") != null){
	 CookieManager.makeCookie(response, "userId", id, 3600);
	 //response.sendRedirect("login.jsp");
}

if(true){ //비번 아이디 맞으면
	out.print("<h2>로그인 성공<h2>");
} else {
	String script =
			"<script type='test/javascript'>"
			+"alert('id/pw를 확인해주세요.');"
			+"history.go(-1)"
			+"</script>";
			out.print(script);
}


%>

</body>
</html>