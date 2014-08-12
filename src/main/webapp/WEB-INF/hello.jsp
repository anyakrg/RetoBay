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

        <link href="css/bootstrap-3.1.1.min.css" rel="stylesheet">
        <link href="css/lollies.min.css" rel="stylesheet">
        <link href="css/custom.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv-3.7.0.js"></script>
        <script src="js/respond-1.4.2.js"></script>
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
                                <li class="active"><a href="#">Nav Item 1</a></li>
                                <li><a href="#">Nav Item 2</a></li>
                                <li><a href="#">Nav Item 3</a></li>
                                <li><a href="#">Nav Item 4</a></li>
                                <li><a href="#">Nav Item 5</a></li>
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

                <h2>Hello! ${nickName} </h2>
                <h2> Please ckeck inbox at ${email} </h2>

            </div>
        </div>
    </div>


    <div class="footer-block">42
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
    <script src="js/jquery-1.7.2.min.js"></script>
    <script src="js/bootstrap-3.1.1.min.js"></script>
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
    <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
    <script src="js/lollies.min.js"></script>
    <script src="js/custom.js"></script>
    </body>
    </html>
</fmt:bundle>