<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="GQ" class="GoogleQuery" scope="page"></jsp:useBean>
<%

if(request.getParameter("btn_check")!=null){
	GoogleQuery mis=new GoogleQuery();
	mis.setSearchKeyword("nccu+mis");//要用+連結,可能因為url關係
	//PrintHI phi=new PrintHI();
	//String shi=phi.printHi();
	//request.setAttribute("SuccessMsg", (mis.query()).toString());
	//RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
	//rd.forward(request,response);
	out.println(mis.getSearchKeyword());
	out.println(mis.query());
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beat Google Test 3</title>
</head>
<body>
<h1>Hello world h1</h1>
<h2>Hello world h2</h2>
<p>Click <a href ="https://www.google.com/?client=safari&channel=mac_bm">here</a> to go to google</p>
<div style="color:#DB4182">This line has Color:#DB4182</div>
<br><br><br>
<form action="/action_page.php" method="get">
<label for="key">Your Keyword:</label>
<input type="text" name="key">
<input type="submit" value="Submit">
</form>
<form method="post" class="form-horizontal">
<input type="submit" name="btn_check" class="btn btn_check" value="Check">
</form>

</body>
</html>