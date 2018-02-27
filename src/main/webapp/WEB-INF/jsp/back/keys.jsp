<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2018/2/23
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
    <link href="${path}/static/back/css/font-awesome.min.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="${path}/static/back/css/style.css" rel="stylesheet">
    <link href="${path}/static/back/css/style-responsive.css" rel="stylesheet" />

</head>

<body>
<!-- container section start -->
<section id="container" class="">
    <!--header start-->
    <header class="header dark-bg">
        <div class="toggle-nav">
            <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
        </div>

        <!--logo start-->
        <a href="${path}/back" class="logo">智能钥匙包 <span class="lite">后台管理</span></a>
        <!--logo end-->

        <div class="nav search-row" id="top_menu">
            <!--  search form start -->
            <ul class="nav top-menu">
                <li>
                    <form class="navbar-form">
                        <input class="form-control" placeholder="Search" type="text">
                    </form>
                </li>
            </ul>
            <!--  search form end -->
        </div>

        <div class="top-nav notification-row">
            <!-- notificatoin dropdown start-->
            <ul class="nav pull-right top-menu">

                <!-- task notificatoin start -->
                <li id="task_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <span class="icon-task-l"></span>
                        <span class="badge bg-important">6</span>
                    </a>
                    <ul class="dropdown-menu extended tasks-bar">
                        <div class="notify-arrow notify-arrow-blue"></div>
                        <li>
                            <p class="blue">You have 6 pending letter</p>
                        </li>
                        <li>
                            <a href="#">
                                <div class="task-info">
                                    <div class="desc">Design PSD </div>
                                    <div class="percent">90%</div>
                                </div>
                                <div class="progress progress-striped">
                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                                        <span class="sr-only">90% Complete (success)</span>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <div class="task-info">
                                    <div class="desc">
                                        Project 1
                                    </div>
                                    <div class="percent">30%</div>
                                </div>
                                <div class="progress progress-striped">
                                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
                                        <span class="sr-only">30% Complete (warning)</span>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <div class="task-info">
                                    <div class="desc">Digital Marketing</div>
                                    <div class="percent">80%</div>
                                </div>
                                <div class="progress progress-striped">
                                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                        <span class="sr-only">80% Complete</span>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <div class="task-info">
                                    <div class="desc">Logo Designing</div>
                                    <div class="percent">78%</div>
                                </div>
                                <div class="progress progress-striped">
                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%">
                                        <span class="sr-only">78% Complete (danger)</span>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <div class="task-info">
                                    <div class="desc">Mobile App</div>
                                    <div class="percent">50%</div>
                                </div>
                                <div class="progress progress-striped active">
                                    <div class="progress-bar"  role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%">
                                        <span class="sr-only">50% Complete</span>
                                    </div>
                                </div>

                            </a>
                        </li>
                        <li class="external">
                            <a href="#">See All Tasks</a>
                        </li>
                    </ul>
                </li>
                <!-- task notificatoin end -->
                <!-- inbox notificatoin start-->
                <li id="mail_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-envelope-l"></i>
                        <span class="badge bg-important">5</span>
                    </a>
                    <ul class="dropdown-menu extended inbox">
                        <div class="notify-arrow notify-arrow-blue"></div>
                        <li>
                            <p class="blue">You have 5 new messages</p>
                        </li>
                        <li>
                            <a href="#">
                                <span class="photo"><img alt="avatar" src="${path}/static/back/img/avatar-mini.jpg"></span>
                                <span class="subject">
                                    <span class="from">Greg  Martin</span>
                                    <span class="time">1 min</span>
                                    </span>
                                <span class="message">
                                        I really like this admin panel.
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="photo"><img alt="avatar" src="${path}/static/back/img/avatar-mini2.jpg"></span>
                                <span class="subject">
                                    <span class="from">Bob   Mckenzie</span>
                                    <span class="time">5 mins</span>
                                    </span>
                                <span class="message">
                                     Hi, What is next project plan?
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="photo"><img alt="avatar" src="${path}/static/back/img/avatar-mini3.jpg"></span>
                                <span class="subject">
                                    <span class="from">Phillip   Park</span>
                                    <span class="time">2 hrs</span>
                                    </span>
                                <span class="message">
                                        I am like to buy this Admin Template.
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="photo"><img alt="avatar" src="${path}/static/back/img/avatar-mini4.jpg"></span>
                                <span class="subject">
                                    <span class="from">Ray   Munoz</span>
                                    <span class="time">1 day</span>
                                    </span>
                                <span class="message">
                                        Icon fonts are great.
                                    </span>
                            </a>
                        </li>
                        <li>
                            <a href="#">See all messages</a>
                        </li>
                    </ul>
                </li>
                <!-- inbox notificatoin end -->
                <!-- alert notification start-->
                <li id="alert_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                        <i class="icon-bell-l"></i>
                        <span class="badge bg-important">7</span>
                    </a>
                    <ul class="dropdown-menu extended notification">
                        <div class="notify-arrow notify-arrow-blue"></div>
                        <li>
                            <p class="blue">You have 4 new notifications</p>
                        </li>
                        <li>
                            <a href="#">
                                <span class="label label-primary"><i class="icon_profile"></i></span>
                                Friend Request
                                <span class="small italic pull-right">5 mins</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="label label-warning"><i class="icon_pin"></i></span>
                                John location.
                                <span class="small italic pull-right">50 mins</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="label label-danger"><i class="icon_book_alt"></i></span>
                                Project 3 Completed.
                                <span class="small italic pull-right">1 hr</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="label label-success"><i class="icon_like"></i></span>
                                Mick appreciated your work.
                                <span class="small italic pull-right"> Today</span>
                            </a>
                        </li>
                        <li>
                            <a href="#">See all notifications</a>
                        </li>
                    </ul>
                </li>
                <!-- alert notification end-->
                <!-- user login dropdown start-->
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="${path}/static/back/img/avatar1_small.jpg">
                            </span>
                        <span class="username">系统管理员</span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu extended logout">
                        <div class="log-arrow-up"></div>
                        <li class="eborder-top">
                            <a href="#"><i class="icon_profile"></i> 个人资料</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_chat_alt"></i> 留言箱</a>
                        </li>
                        <li>
                            <a href="${path}/logout"><i class="icon_key_alt"></i> 退出</a>

                        </li>
                    </ul>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->

    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu">
                <li class="active">
                    <a class="" href="${path}/back">
                        <i class="icon_house_alt"></i>
                        <span>首页</span>
                    </a>
                </li>
                <shiro:hasAnyRoles name="钥匙管理员,系统管理员">
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="icon_document_alt"></i>
                            <span>钥匙管理</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="${path}/keys">钥匙列表</a></li>
                            <li><a class="" href="${path}/addkey">新增钥匙</a></li>
                        </ul>
                    </li>
                </shiro:hasAnyRoles>
                <shiro:hasAnyRoles name="人员管理员,系统管理员">
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="icon_desktop"></i>
                            <span>人员管理</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="${path}/man">用户管理</a></li>
                            <li><a class="" href="${path}/group">群组管理</a></li>
                            <!--<li><a class="" href="grids.html">Grids</a></li>-->
                        </ul>
                    </li>
                </shiro:hasAnyRoles>
                <shiro:hasAnyRoles name="商家管理员,系统管理员">
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="icon_genius"></i>
                            <span>商家管理</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="${path}/shop">商家管理</a></li>
                            <li><a class="" href="${path}/addshop">新增商家</a></li>
                            <!--<li><a class="" href="grids.html">Grids</a></li>-->
                        </ul>
                    </li>
                </shiro:hasAnyRoles>
                <shiro:hasAnyRoles name="权限管理员,系统管理员">
                    <li class="sub-menu">
                        <a href="javascript:;" class="">
                            <i class="icon_table"></i>
                            <span>权限管理</span>
                            <span class="menu-arrow arrow_carrot-right"></span>
                        </a>
                        <ul class="sub">
                            <li><a class="" href="${path}/role">角色管理</a></li>
                            <li><a class="" href="${path}/permission">权限管理</a></li>

                        </ul>
                    </li>
                </shiro:hasAnyRoles>
                <shiro:hasRole name="系统管理员">
                    <li>
                        <a class="" href="${path}/chart">
                            <i class="icon_piechart"></i>
                            <span>使用情况</span>
                        </a>
                    </li>
                </shiro:hasRole>
                <li class="sub-menu">
                    <a href="${path}/mes" class="">
                        <i class="icon_documents_alt"></i>
                        <span>留言管理</span>
                    </a>
                </li>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>

    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <table class="table table-striped table-advance table-hover">
                            <tbody>
                            <tr>
                                <th><i class="icon_profile"></i>  用户序号</th>
                                <th><i class="icon_calendar"></i>  门序号</th>
                                <th><i class="icon_mail_alt"></i>  门名称</th>
                                <th><i class="icon_pin_alt"></i>  门位置</th>
                                <th><i class="icon_pin_alt"></i>  经度值</th>
                                <th><i class="icon_pin_alt"></i>  纬度值</th>
                                <th><i class="icon_mobile"></i>  蓝牙配对号</th>
                                <th><i class="icon_mobile"></i>  添加时间</th>
                                <th><i class="icon_mobile"></i>  门类型</th>
                                <th><i class="icon_cogs"></i>  Action</th>
                            </tr>
                            <tr class="success">
                                <td>111</td>
                                <td>1</td>
                                <td>观园小区3栋3单元301</td>
                                <td>观园小区3栋3单元301</td>
                                <td>17.34563</td>
                                <td>-235.32445</td>
                                <td>64:CC:2E:F4:35:C8</td>
                                <td>18-01-24 12:03:23</td>
                                <td>类型一</td>
                                <td>
                                    <div class="btn-group">
                                        <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                        <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                        <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr class="danger">
                                <td>111</td>
                                <td>2</td>
                                <td>观园小区2栋3单元401</td>
                                <td>观园小区2栋3单元401</td>
                                <td>17.34563</td>
                                <td>-235.32445</td>
                                <td>64:CC:2E:F4:35:C8</td>
                                <td>18-01-24 12:03:23</td>
                                <td>类型二</td>
                                <td>
                                    <div class="btn-group">
                                        <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                        <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                        <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr class="danger">
                                <td>112</td>
                                <td>3</td>
                                <td>观园小区1栋2单元201</td>
                                <td>观园小区1栋2单元201</td>
                                <td>17.34563</td>
                                <td>-235.32445</td>
                                <td>64:CC:2E:F4:35:C8</td>
                                <td>18-01-24 12:03:23</td>
                                <td>类型三</td>
                                <td>
                                    <div class="btn-group">
                                        <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                        <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                        <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                    </div>
                                </td>
                            </tr>
                            <tr class="warning">
                                <td>113</td>
                                <td>4</td>
                                <td>观园小区4栋1单元201</td>
                                <td>观园小区4栋1单元201</td>
                                <td>17.34563</td>
                                <td>-235.32445</td>
                                <td>64:CC:2E:F4:35:C8</td>
                                <td>18-01-24 12:03:23</td>
                                <td>类型三</td>
                                <td>
                                    <div class="btn-group">
                                        <a class="btn btn-primary" href="#"><i class="icon_plus_alt2"></i></a>
                                        <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a>
                                        <a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a>
                                    </div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </section>
                </div>
            </div>
            <!-- page end-->
        </section>
    </section>
    <!--main content end-->
</section>
<!-- container section end -->
<!-- javascripts -->
<script src="${path}/static/back/js/jquery.js"></script>
<script src="${path}/static/back/js/bootstrap.min.js"></script>
<!-- nicescroll -->
<script src="${path}/static/back/js/jquery.scrollTo.min.js"></script>
<script src="${path}/static/back/js/jquery.nicescroll.js" type="text/javascript"></script>
<!--custome script for all page-->
<script src="${path}/static/back/js/scripts.js"></script>


</body>
</html>

