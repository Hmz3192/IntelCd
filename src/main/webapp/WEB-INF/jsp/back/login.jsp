<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2018/2/24
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path"
       scope="page"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">

    <title> 智慧生活-智慧钥匙包 </title>


    <!-- Bootstrap CSS -->
    <link href="${path}/static/back/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="${path}/static/back/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="${path}/static/back/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="${path}/static/back/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="${path}/static/back/css/style.css" rel="stylesheet">
    <link href="${path}/static/back/css/style-responsive.css" rel="stylesheet" />
</head>

<body class="login-img3-body">

<div class="container">

    <form class="login-form" action="${path}/login" method="post">
        <div class="login-wrap">
            <p style="font-size: 30px;color: black">智慧钥匙包后台管理</p>
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_profile"></i></span>
                <input type="text"  name="account" class="form-control" placeholder="用户名" autofocus>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" name="password"class="form-control" placeholder="密码">
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> 记住我
                <span class="pull-right"> <a href="#"> 忘记密码?</a></span>
            </label>
            <input type="submit" class="btn btn-primary btn-lg btn-block" value="登录">
            <button class="btn btn-info btn-lg btn-block" type="submit">注册</button>
        </div>
    </form>

</div>


</body>
</html>
