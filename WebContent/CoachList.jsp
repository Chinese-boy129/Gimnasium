
<%@page import="javax.smartcardio.ATR"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		
		<link rel="stylesheet" href="/Gymnasium/css/CoachList.css" />
	</head>
	<body>
		
	
		<div><p style="width: 100%;background: black;font-size: 20px;height: 30px;line-height: 30px;color: white;">
	   	私人教练</p></div>
	<div class="coach">
	   
	   	<div><a href="javascript: showcoach(${1 });">
	   	<img alt="" src="images/coach01.jpg" style="width: 300px;height: 400px;"></a></div>
	   	<div><a href="javascript: showcoach(${2 });">
	   	<img alt="" src="images/coach02.jpg" style="width: 300px;height: 400px;"></a></div>
	   	<div><a href="javascript: showcoach(${3 });">
	   	<img alt="" src="images/coach03.jpg" style="width: 300px;height: 400px;"></a></div>
	   	
   </div>
</html>

                        
                        
                       <%--  <div class="layui-card-body layui-table-body layui-table-main">
                            <table class="layui-table layui-form">
                                <thead>
                                  <tr>
                                    
                                    <th>ID</th>
                                    <th>教练名称</th>
                                    <th>操作</th>
                                   </tr>
                                </thead>
                                <tbody>
                             <c:forEach items="${list }" var="coach">
                                  <tr>
                                    
                                    <td><img alt="" src="images/coach01.jpg"></td>
                                    <td>${coach.c_name }</td>
                                   
                                  
                                    <td class="td-manage">
                                      
                                      <a title="编辑"  onclick="xadmin.open('编辑','/hagen_dazs02/PrepareAdminUpdate?id=${music.id }',600,400)" href="javascript:;">
                                        <i class="layui-icon">&#xe642;</i>
                                      </a>
                                      <a title="删除"  href="javascript:deleteAdmin(${music.id });">
                                        <i class="layui-icon">&#xe640;</i>
                                      </a>
                                    </td>
                                  </tr>
                            </c:forEach>
                                </tbody>
                            </table>
                        </div> --%>
                     
    </body>
    <script>
      
       function showcoach(id,img){
    	   
    		window.location.href="/Gymnasium/ShowCoachServlet?id="+id;
    		
    	   
       }

      
    </script>
</html>