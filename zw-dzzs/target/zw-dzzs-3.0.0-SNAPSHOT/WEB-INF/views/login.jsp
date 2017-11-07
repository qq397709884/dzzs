<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html class="login-bg">
<head>
    <%@ include file="/WEB-INF/commons/meta.jsp" %>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>登录</title>
    <%@ include file="/WEB-INF/views/include/http-header.jsp" %>
    <link rel="stylesheet" href="${ctx}/scripts/iCheck/square/blue.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>东湖高新电子证书管理平台</b> </a>
    </div>
    <div class="login-box-body">
        <p class="login-box-msg">输入用户名和密码登录</p>
        <div id="error" class="alert alert-danger alert-dismissible" style="display: none">
            <h4 style="margin-bottom: 0px;"><i class="fa fa-exclamation-triangle"></i></h4>
        </div>

        <div class="form-group has-feedback">
            <input class="form-control" type="text" id="username" name="username" placeholder="用户名">
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
        </div>
        <div class="form-group has-feedback">
            <input class="form-control" type="password" name="password" id="password" placeholder="密码">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="row">
            <div class="col-xs-4">
                <input type="button" class="btn btn-danger btn-block btn-flat" onclick="login()" value="登录"/>
            </div>
        </div>

    </div>
</div>
<%@ include file="/WEB-INF/views/include/http-script.jsp" %>
<script src="${ctx}/scripts/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
        $('#username').focus();
    });

    var login = function () {
        var username = $("#username").val();
        var password = $("#password").val();
        alert(password);
        $.ajax({
            type: "POST",
            url: ${ctx}+"/login",
            contentType:"application/x-www-form-urlencoded",
            data: {"username": username, "password": password},
            dataType: "json",
            success: function (result) {
                if (result.code == 0) {//登录成功
                    parent.location.href = '/';
                } else {
//                    $("#error").attr("display", "")
//                            .text(result.msg);
                    alert("登录失败" + result.data)
                }
            }
        });
    }
</script>
</body>
</html>