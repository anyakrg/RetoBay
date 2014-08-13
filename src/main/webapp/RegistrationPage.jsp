<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link rel="shortcut icon" type="image/x-icon" href="favicon.png"/>
    <link href="fonts/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <%--<link href="css/bootstrap-3.1.1.min.css" rel="stylesheet">--%>

    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>


    <link href="css/lollies.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="/js/html5shiv-3.7.0.js"></script>
    <script src="/js/respond-1.4.2.js"></script>
    <![endif]-->
</head>
<body>

<header id="main-header">
    <div class="container">

        <div class="row">
            <div class="col-md-6 headerMatch">
                <!-- LOGO -->
                <div id="logo"><a href="/"><img src="img/logo.png"/></a></div>
            </div>
            <div class="col-md-6 headerMatch">
                <!-- MASTHEAD -->
                <div id="masthead-container">
                    <div id="masthead">
                        <!-- SOCIAL MEDIA
                        <div class="socialmedia">
                            <a href="" target="_blank" ><img src="img/icons/facebook.png" /></a>
                            <a href="" target="_blank" ><img src="img/icons/twitter.png" /></a>
                            <a href="" target="_blank" ><img src="img/icons/youtube.png" /></a>
                            <a href="" target="_blank" ><img src="img/icons/instagram.png" /></a>
                        </div>
                        -->
                        <!-- CALL TO ACTION -->
                        <!--<div class="call"><h1>Lorem ipsum 1800123123</h1><p>Consectetur adipiscing elit</p></div>-->
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>

<nav id="main-nav">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <!-- NAVIGATION -->
                <div class="navbar navbar-default" role="navigation">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav nav-justified">
                            <li><a href="login">LOGIN</a></li>
                            <li class="active"><a href="register">REGISTER!</a></li>
                                <%--<li><a href="#">Nav Item 3</a></li>--%>
                                <%--<li><a href="#">Nav Item 4</a></li>--%>
                                <%--<li><a href="#">Nav Item 5</a></li>--%>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Nav Item 6 <b
                                        class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li class="dropdown-header">Nav header</li>
                                    <li><a href="#">Separated link</a></li>
                                    <li><a href="#">One more separated link</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
</nav>
<div class="content-block">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-md-offset-5">
            <form action="${pageContext.request.contextPath}/register" method="post">
                <h2 class="form-signin-heading">Hello! New User :) </h2>
                <input type="login" name="login" class="form-control" placeholder="${login}" required autofocus>
                <input type="email" name="email" class="form-control" placeholder="${email}" required>
                <input type="password" name="password" class="form-control" placeholder="password" required>
                <input type="repassword" name="repassword" class="form-control" placeholder="Confirm Password" required>
                <div class="radio" >
                    <label>
                        <input type="radio" name="gender" value="M" required > Male
                    </label>
                    <label>
                        <input type="radio" name="gender" value="F" required > Female
                    </label>
                </div>
                <input type="hidden" name="action" value="register">
                <input type="checkbox" name="legal" value="legal" id="page" required> I'm 18 years old and agree with the Terms of Use and Privacy Policy.
                <p></p>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Complete Registration!</button>
            </form>
            </div>
        </div>
    </div>
</div>


<div class="footer-block">

</div>

<div class="copyright-block">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12 left">
                &copy; 2014 Catharina.
            </div>
            <div class="col-md-6 col-sm-6 right hidephone">
                Proin | Metus | Vulputate | Curabitur
            </div>
        </div>
    </div>
</div>

<!-- SCRIPTS -->
<%--<script src="js/jquery-1.7.2.min.js"></script>--%>

<%--<script src="js/bootstrap-3.1.1.min.js"></script>--%>

<script src="plugins/backstretch/backstretch-2.0.4.min.js"></script>
<script src="plugins/camera-slider/camera-slider-1.3.4.min.js"></script>
<script src="plugins/camera-slider/easing-1.3.min.js"></script>
<script src="plugins/fancybox/fancybox-1.3.4.pack.js"></script>
<script src="plugins/fancybox/klass-1.0.min.js"></script>
<script src="plugins/fancybox/photoswipe-3.0.5.min.js"></script>
<script src="plugins/hover-animations/transform2d.min.js"></script>
<script src="plugins/hover-animations/hover-animations-1.0.min.js"></script>
<script src="plugins/match-height/match-height-0.5.1.min.js"></script>
<script src="plugins/validation/validation-2.2.min.js"></script>
<%--<script src="http://maps.google.com/maps/api/js?sensor=false"></script>--%>
<script src="js/lollies.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>
</fmt:bundle>