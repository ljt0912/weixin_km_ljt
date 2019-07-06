<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>借阅列表</title>
<style type="text/css">
	.item:hover{
		background-color: #aaa;
	}
</style>
</head>
<body>
	<div>
		<button onclick="document.location.href='/library/index'">返回首页</button>
		<div style="height:30px;"></div>
	</div>
	<c:forEach items="${debitList.items }" var="item">
	<div class="item">
		<img src="/images/${item.book.image }" style="width:50px;height:50px;" />
		${item.book.name }
		 	<a href="/library/debit/remove/${item.book.id }" style="float: right;">删除</a>
		</div>
	</c:forEach>
	<div>
		<div style="height:50px;"></div>
		<button onclick="document.location.href='/library/debit/debitBook'">确认借阅</button>
	</div>
</body>
</html>