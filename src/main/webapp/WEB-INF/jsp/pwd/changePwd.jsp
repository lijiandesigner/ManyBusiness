<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <center>
        <table width="200" border="1">
          <tr>
            <th scope="col">序号</th>
            <th scope="col">ID</th>
            <th scope="col">姓名</th>
            <th scope="col">密码</th>
            <th scope="col">年龄</th>
          </tr>
          <c:forEach begin="0" step="1" items="${userList}" var="list" varStatus="userlist">
          <tr>
            <td>dd</td>
            <td>fdf</td>
            <td>ff</td>
            <td>ddd</td>
            <td>cc</td>
          </tr>
          </c:forEach>
        </table>
        <p>一共${page.pages}页</p>
        <a href="userList?page=${page.firstPage}">第一页</a>
        <a href="userList?page=${page.nextPage}">下一页</a>
        <a href="userList?page=${page.prePage}">上一页</a>
        <a href="userList?page=${page.lastPage}">最后页</a>
    </center>
  </body>
</html>