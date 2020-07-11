<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>用户管理</title>
<link href="../css/css.css" rel="stylesheet" type="text/css" />
</head>

<body><!-- #BeginLibraryItem "/Library/topbanner.lbi" -->
<link href="../css/css.css" rel="stylesheet" type="text/css" />
<div id="logo"><img src="../images/top.jpg" width="1002" height="258" /></div>
<!-- #EndLibraryItem --><table width="1002" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="rightimg"><!-- #BeginLibraryItem "/Library/left3.lbi" -->
<link href="../css/css.css" rel="stylesheet" type="text/css" />
<div id="left2">
      <p><a href="queryall.do" target="_self" >用户管理</a></p>
      <p><a href="All.do" target="_self">员工管理</a></p>
      <p><a href="update.do" target="_self">分配人员</a></p>
      <p ><a href="../login.jsp" target="_self">退出系统</a></p>
</div><!-- #EndLibraryItem --><div id="right">
        <p>您现在的位置 &gt;&gt; 用户管理 &gt;&gt; 用户列表</p>
        <h1>用户详细信息:</h1>
	    
	    <form id="form1" name="form1" method="post" action="personadd.do">
          <table width="700" border="0" cellpadding="0" cellspacing="0" class="table">
            <tr>
              <td width="15%" class="tdcolor">用户名称</td>
              <td class="tdcolor">用户密码</td>
              <td class="tdcolor">用户角色</td>
              <td class="tdcolor">真实姓名</td>
              <td class="tdcolor">入职时间</td>
              <td class="tdcolor">职位信息</td>
              <td class="tdcolor">&nbsp;</td>
            </tr>
             <c:forEach items="${emps.data}" var="all" >
            <tr>
             <td>${all.employeeName}</td>
            <td>${all.password}</td>
            <td>${all.role.roleDesc}</td>
            <td>${all.realName}</td>
            <td><fmt:formatDate value="${all.enrolldate}" pattern="yyyy-MM-dd" /></td>
            <td>${all.duty}</td>
            </tr>
            </c:forEach>
            
          </table>
	      <p>
            <label>
            <input name="Submit" type="submit" class="menu3" value="添加人员" />
            </label>
          </p>
        </form>
        <center>
					<a>共${emps.lastPage }页</a>
						<a
							href="${pageContext.request.contextPath }/admin/queryall.do?pageNo=${emps.firstPage}&pageSize=${emps.pageSize}">首页</a>
						<a
							href="${pageContext.request.contextPath }/admin/queryall.do?pageNo=${emps.previousPage}&pageSize=${emps.pageSize}">上一页</a>
						<a
							href="${pageContext.request.contextPath }/admin/queryall.do?pageNo=${emps.nextPage}&pageSize=${emps.pageSize}">下一页</a>
						<a 
						    href="${pageContext.request.contextPath }/admin/queryall.do?pageNo=${emps.lastPage}&pageSize=${emps.pageSize}">末页</a>
						<a>第${emps.pageNo }页</a>
						<a>共${emps.totalRecords }条记录</a>
						<a>共${emps.lastPage }页</a>
						</center>
	    <p>&nbsp;</p>
</div></td></tr>
</table>
<!-- #BeginLibraryItem "/Library/bottom.lbi" --><div id="bottom"><img src="../images/button.jpg" width="1002" height="17" /></div><!-- #EndLibraryItem --></body>
</html>
