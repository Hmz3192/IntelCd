<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2018/2/23
  Time: 14:13
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
    <!-- full calendar css-->
    <link href="${path}/static/back/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
    <link href="${path}/static/back/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="${path}/static/back/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="${path}/static/back/css/owl.carousel.css" type="text/css">
    <link href="${path}/static/back/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
    <link rel="stylesheet" href="${path}/static/back/css/fullcalendar.css">
    <link href="${path}/static/back/css/widgets.css" rel="stylesheet">
    <link href="${path}/static/back/css/style.css" rel="stylesheet">
    <link href="${path}/static/back/css/style-responsive.css" rel="stylesheet" />
    <link href="${path}/static/back/css/xcharts.min.css" rel=" stylesheet">
    <link href="${path}/static/back/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
</head>

<body>
<!-- container section start -->
<section id="container" class="">


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
    <!--sidebar end-->

    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <!--overview start-->
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-laptop"></i> 首页面板</h3>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box blue-bg">
                        <i class="fa fa-cloud-download"></i>
                        <div class="count">6.674</div>
                        <div class="title">APP下载</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->


                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box dark-bg">
                        <i class="fa fa-thumbs-o-up"></i>
                        <div class="count">4.362</div>
                        <div class="title">好评</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->

                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box green-bg">
                        <i class="fa fa-cubes"></i>
                        <div class="count">1.426</div>
                        <div class="title">网站流量</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->
            </div><!--/.row-->
            <div class="row">
                <div class="col-md-6 portlets">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2><strong>日历</strong></h2>
                            <div class="panel-actions">
                                <a href="#" class="wminimize"><i class="fa fa-chevron-up"></i></a>
                                <a href="#" class="wclose"><i class="fa fa-times"></i></a>
                            </div>

                        </div><br><br><br>
                        <div class="panel-body">
                            <!-- Widget content -->
                            <!-- Below line produces calendar. I am using FullCalendar plugin. -->
                            <div id="calendar"></div>

                        </div>
                    </div>

                </div>

                <div class="col-md-4 portlets">
                    <!-- Widget -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="pull-left">留言</div>
                            <div class="widget-icons pull-right">
                                <a href="#" class="wminimize"><i class="fa fa-chevron-up"></i></a>
                                <a href="#" class="wclose"><i class="fa fa-times"></i></a>
                            </div>
                            <div class="clearfix"></div>
                        </div>

                        <div class="panel-body">
                            <!-- Widget content -->
                            <div class="padd sscroll">

                                <ul class="chats">

                                    <!-- Chat by us. Use the class "by-me". -->
                                    <li class="by-me">
                                        <!-- Use the class "pull-left" in avatar -->
                                        <div class="avatar pull-left">
                                            <img src="${path}/static/back/img/user.jpg" alt=""/>
                                        </div>

                                        <div class="chat-content">
                                            <!-- In meta area, first include "name" and then "time" -->
                                            <div class="chat-meta">人员管理员 <span class="pull-right">3 小时前</span></div>
                                            今天人员编辑已完成。
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>

                                    <!-- Chat by other. Use the class "by-other". -->
                                    <li class="by-other">
                                        <!-- Use the class "pull-right" in avatar -->
                                        <div class="avatar pull-right">
                                            <img src="${path}/static/back/img/user22.png" alt=""/>
                                        </div>

                                        <div class="chat-content">
                                            <!-- In the chat meta, first include "time" then "name" -->
                                            <div class="chat-meta">2 小时前 <span class="pull-right">系统管理员</span></div>
                                            系统debug已完成，正常使用.
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>

                                    <li class="by-me">
                                        <div class="avatar pull-left">
                                            <img src="${path}/static/back/img/user.jpg" alt=""/>
                                        </div>

                                        <div class="chat-content">
                                            <div class="chat-meta">钥匙管理员 <span class="pull-right">4 小时前</span></div>
                                            钥匙审查已完成。
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>

                                    <li class="by-other">
                                        <!-- Use the class "pull-right" in avatar -->
                                        <div class="avatar pull-right">
                                            <img src="${path}/static/back/img/user22.png" alt=""/>
                                        </div>

                                        <div class="chat-content">
                                            <!-- In the chat meta, first include "time" then "name" -->
                                            <div class="chat-meta">1 小时前 <span class="pull-right">系统管理员</span></div>
                                            系统审查再次完成。
                                            <div class="clearfix"></div>
                                        </div>
                                    </li>

                                </ul>

                            </div>
                            <!-- Widget footer -->
                            <div class="widget-foot">

                                <form class="form-inline">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="再次输入你的留言...">
                                    </div>
                                    <button type="submit" class="btn btn-info">发送</button>
                                </form>


                            </div>
                        </div>


                    </div>
                </div>

            </div>
            <!-- project team & activity start -->
            <div class="row">
                <div class="col-lg-8">
                    <!--Project Activity start-->
                    <section class="panel">
                        <div class="panel-body progress-panel">
                            <div class="row">
                                <div class="col-lg-8 task-progress pull-left">
                                    <h1>每日要完成的事</h1>
                                </div>
                                <div class="col-lg-4">
                                <span class="profile-ava pull-right">
                                        <img alt="" class="simple" src="${path}/static/back/img/avatar1_small.jpg">
                                        系统管理员
                                </span>
                                </div>
                            </div>
                        </div>
                        <table class="table table-hover personal-task">
                            <tbody>
                            <tr>
                                <td>今日</td>
                                <td>
                                    钥匙审查
                                </td>
                                <td>
                                    <span class="badge bg-important">完成</span>
                                </td>
                                <td>
                                    <span class="profile-ava">
                                        <img alt="" class="simple" src="${path}/static/back/img/avatar1_small.jpg">
                                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td>昨天</td>
                                <td>
                                    人员审查
                                </td>
                                <td>
                                    <span class="badge bg-success">完成</span>
                                </td>
                                <td>
                                    <div id="work-progress2"></div>
                                </td>
                            </tr>
                            <tr>
                                <td>21-10-14</td>
                                <td>
                                    人员增加
                                </td>
                                <td>
                                    <span class="badge bg-success">完成</span>
                                </td>
                                <td>
                                    <div id="work-progress3"></div>
                                </td>
                            </tr>
                            <tr>
                                <td>22-10-14</td>
                                <td>
                                    商家管理
                                </td>
                                <td>
                                    <span class="badge bg-primary">未完成</span>
                                </td>
                                <td>
                                      <span class="profile-ava">
                                        <img alt="" class="simple" src="${path}/static/back/img/avatar1_small.jpg">
                                      </span>
                                </td>
                            </tr>
                            <tr>
                                <td>24-10-14</td>
                                <td>
                                    增加商家
                                </td>
                                <td>
                                    <span class="badge bg-info">完成</span>
                                </td>
                                <td>
                                    <div id="work-progress4"></div>
                                </td>
                            </tr>
                            <tr>
                                <td>28-10-14</td>
                                <td>
                                    增加商家
                                </td>
                                <td>
                                    <span class="badge bg-primary">未完成</span>
                                </td>
                                <td>
                                    <div id="work-progress5"></div>
                                </td>
                            </tr>
                            <tr>
                                <td>Last week</td>
                                <td>
                                   权限管理
                                </td>
                                <td>
                                    <span class="badge bg-primary">未完成</span>
                                </td>
                                <td>
                                    <div id="work-progress1"></div>
                                </td>
                            </tr>
                            <tr>
                                <td>last month</td>
                                <td>
                                    增加角色
                                </td>
                                <td>
                                    <span class="badge bg-success">未完成</span>
                                </td>
                                <td>
                                      <span class="profile-ava">
                                        <img alt="" class="simple" src="${path}/static/back/img/avatar1_small.jpg">
                                      </span>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </section>
                    <!--Project Activity end-->
                </div>
            </div><br><br>
            </div>
            <!-- project team & activity end -->

        </section>
    </section>
    <!--main content end-->
</section>
<!-- container section start -->

<!-- javascripts -->
<script src="${path}/static/back/js/jquery.js"></script>
<script src="${path}/static/back/js/jquery-ui-1.10.4.min.js"></script>
<script src="${path}/static/back/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${path}/static/back/js/jquery-ui-1.9.2.custom.min.js"></script>
<!-- bootstrap -->
<script src="${path}/static/back/js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="${path}/static/back/js/jquery.scrollTo.min.js"></script>
<script src="${path}/static/back/js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- charts scripts -->
<script src="${path}/static/back/assets/jquery-knob/js/jquery.knob.js"></script>
<script src="${path}/static/back/js/jquery.sparkline.js" type="text/javascript"></script>
<script src="${path}/static/back/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
<script src="${path}/static/back/js/owl.carousel.js" ></script>
<!-- jQuery full calendar -->
<<script src="${path}/static/back/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
<script src="${path}/static/back/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
<!--script for this page only-->
<script src="${path}/static/back/js/calendar-custom.js"></script>
<script src="${path}/static/back/js/jquery.rateit.min.js"></script>
<!-- custom select -->
<script src="${path}/static/back/js/jquery.customSelect.min.js" ></script>
<script src="${path}/static/back/assets/chart-master/Chart.js"></script>

<!--custome script for all page-->
<script src="${path}/static/back/js/scripts.js"></script>
<!-- custom script for this page-->
<script src="${path}/static/back/js/sparkline-chart.js"></script>
<script src="${path}/static/back/js/easy-pie-chart.js"></script>
<script src="${path}/static/back/js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${path}/static/back/js/jquery-jvectormap-world-mill-en.js"></script>
<script src="${path}/static/back/js/xcharts.min.js"></script>
<script src="${path}/static/back/js/jquery.autosize.min.js"></script>
<script src="${path}/static/back/js/jquery.placeholder.min.js"></script>
<script src="${path}/static/back/js/gdp-data.js"></script>
<script src="${path}/static/back/js/morris.min.js"></script>
<script src="${path}/static/back/js/sparklines.js"></script>
<script src="${path}/static/back/js/charts.js"></script>
<script src="${path}/static/back/js/jquery.slimscroll.min.js"></script>
<script>

    //knob
    $(function() {
        $(".knob").knob({
            'draw' : function () {
                $(this.i).val(this.cv + '%')
            }
        })
    });

    //carousel
    $(document).ready(function() {
        $("#owl-slider").owlCarousel({
            navigation : true,
            slideSpeed : 300,
            paginationSpeed : 400,
            singleItem : true

        });
    });

    //custom select box

    $(function(){
        $('select.styled').customSelect();
    });

    /* ---------- Map ---------- */
    $(function(){
        $('#map').vectorMap({
            map: 'world_mill_en',
            series: {
                regions: [{
                    values: gdpData,
                    scale: ['#000', '#000'],
                    normalizeFunction: 'polynomial'
                }]
            },
            backgroundColor: '#eef3f7',
            onLabelShow: function(e, el, code){
                el.html(el.html()+' (GDP - '+gdpData[code]+')');
            }
        });
    });



</script>

</body>
</html>

