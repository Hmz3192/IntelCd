<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2018/2/23
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path"
       scope="page"/>
<!DOCTYPE html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title> 智慧生活-智慧钥匙包 </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS -->

    <link rel="stylesheet" href="${path}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${path}/static/css/owl.carousel.css">
    <link rel="stylesheet" href="${path}/static/css/owl.theme.css">
    <link rel="stylesheet" href="${path}/static/css/animate.css">
    <link rel="stylesheet" href="${path}/static/css/main.css">
    <link rel="stylesheet" href="${path}/static/css/responsive.css">


    <!-- Js -->
    <script src="${path}/static/js/vendor/modernizr-2.6.2.min.js"></script>
    <script src="${path}/static/js/vendor/jquery-1.10.2.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
    <script src="${path}/static/js/bootstrap.min.js"></script>
    <script src="${path}/static/js/owl.carousel.min.js"></script>
    <script src="${path}/static/js/wow.min.js"></script>
    <script src="${path}/static/js/main.js"></script>
    <script>
        new WOW(
        ).init();
    </script>

</head>
<body>




<header>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <div class="app-showcase wow fadeInDown" data-wow-delay=".5s">
                    <img src="${path}/static/images/iphone.png" alt="">
                </div>

            </div>
            <div class="col-md-6 col-sm-6">
                <div class="block wow fadeInRight" data-wow-delay="1s">
                    <a class="logo" href="#">
                        <img src="${path}/static/images/logo.png" alt="">
                    </a>
                    <br>
                    <a class="logo" href="#">
                        <img src="${path}/static/images/logo_han.png" alt="">
                    </a>
                    <h2>让智慧成为可能.</br>智慧管理我们的生活</h2>
                    <p>让你用简单的方法跟踪生活中的每一件事。</p>
                    <div class="download-btn">
                        <a href="#" class="andriod">
                            <img src="${path}/static/images/andriod-button.png" alt="">
                        </a>
                        <a href="#" class="apple">
                            <img src="${path}/static/images/apple-button.png" alt="">
                        </a>
                    </div>

                </div>
            </div>
        </div>
    </div>
</header>






<section id="service">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="title wow pulse" data-wow-delay=".5s">
                    <h2>让生活中的工具更简单</h2>
                    <p>
                        我们的平台是用来帮助人们一天一天地取得成功的。
                    </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-sm-4">
                <div class="block wow fadeInLeft" data-wow-delay=".7s">
                    <img src="${path}/static/images/clock.png" alt="">
                    <h3>远程控制开门</h3>
                    <p>
                        远程控制开门，让智慧家居进入我们的视野
                    </p>
                </div>
            </div>
            <div class="col-md-4 col-sm-4">
                <div class="block wow fadeInLeft" data-wow-delay=".9s">
                    <img src="${path}/static/images/calender.png" alt="">
                    <h3>商家入驻</h3>
                    <p>
                        智慧钥匙包提供商家入驻平台，让商家可以把自己的商品放到平台上，供顾客选择
                    </p>
                </div>
            </div>
            <div class="col-md-4 col-sm-4">
                <div class="block wow fadeInLeft" data-wow-delay="1.1s">
                    <img src="${path}/static/images/user.png" alt="">
                    <h3>钥匙包社交</h3>
                    <p>
                        我们智慧钥匙包提供的社交功能，与钥匙包以及商城相结合，让钥匙包和商城更加便利
                    </p>
                </div>
            </div>
        </div>
    </div>
</section>



<section id="showcase">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="block text-center wow fadeInUp" data-wow-delay=".5s">
                    <img src="${path}/static/images/showcase-img.png" alt="">

                </div>
            </div>
        </div>
    </div>
</section>
<section id="feature">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="title wow pulse" data-wow-delay=".5s">
                    <h2>帮助顾客有一个更好的美好生活体验</h2>
                    <p>
                        每位顾客都值得有一个更好的生活方式
                    </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <div class="block">
                    <div class="media wow fadeInDown" data-wow-delay=".5s">
                        <img class="media-object pull-left" src="${path}/static/images/item-4.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">智慧开锁</h4>
                            <p>智慧钥匙包提供Wifi和蓝牙的远程连接，顾客可以任意选择开门方式。</p>
                        </div>
                    </div>
                    <div class="media wow fadeInDown" data-wow-delay=".8s">
                        <img class="media-object pull-left" src="${path}/static/images/item-2.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">聊天群组</h4>
                            <p>智慧钥匙包提供的聊天社交功能帮助我们更好的亲近家人朋友。</p>
                        </div>
                    </div>
                    <div class="media wow fadeInDown" data-wow-delay="1.1s">
                        <img class="media-object pull-left" src="${path}/static/images/item-3.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">聊天功能</h4>
                            <p>商城提供的聊天全面，包括视屏，语音，文件传送，发送位置等功能。</p>
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-6 col-sm-6">
                <div class="block">
                    <div class="media wow fadeInDown" data-wow-delay="1.4s">
                        <img class="media-object pull-left" src="${path}/static/images/item-1.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">开门记录</h4>
                            <p>从现在开始我们能知道自己家门每次的开门记录，再也不担心不知道自己的开门记录。</p>
                        </div>
                    </div>
                    <div class="media wow fadeInDown" data-wow-delay="1.7s">
                        <img class="media-object pull-left" src="${path}/static/images/item-5.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">定时开门密码</h4>
                            <p>智慧钥匙包同样提供开门密码功能，用户可以选择密码有效时间。</p>
                        </div>
                    </div>
                    <div class="media wow fadeInDown" data-wow-delay="1.9s">
                        <img class="media-object pull-left" src="${path}/static/images/item-6.png" alt="Image">
                        <div class="media-body">
                            <h4 class="media-heading">商家入驻</h4>
                            <P>智慧钥匙包提供商家入驻平台，商家可以把自己的商品放到平台上推销。</P>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>


<section id="testimonial">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="block">
                    <div id="owl-example" class="owl-carousel">
                        <div>
                            <h5>
                                “客户第一：关注客户的关注点,为客户提供建议和资讯,帮助客户成长”
                            </h5>
                        </div>
                        <div>
                            <h5>
                                “团队合作：共享共担，以小我完成大我”
                            </h5>
                        </div>
                        <div>
                            <h5>
                                “拥抱变化：突破自我，迎接变化”
                            </h5>
                        </div>
                        <div>
                            <h5>
                                “诚信：诚实正直，信守承诺”
                            </h5>
                        </div>
                        <div>
                            <h5>
                                “激情：永不言弃，乐观向上”
                            </h5>
                        </div>
                        <div>
                            <h5>
                                “敬业：以专业的态度和平常的心态做非凡的事情”
                            </h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">
                                <img src="${path}/static/images/footer-logo.png" alt="">
                            </a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse text-center" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav ">
                                <li><a href="#">下载</a></li>
                                <li><a href="#">支持</a></li>
                            </ul>
                            <div class="social-link pull-right">
                                <ul>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-facebook"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-twitter"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>

                        </div><!-- /.navbar-collapse -->

                    </div><!-- /.container-fluid -->
                </nav>
            </div>
        </div>
    </div>
</footer>
</body>
</html>

