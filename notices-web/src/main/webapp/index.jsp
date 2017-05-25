<%--
  Created by IntelliJ IDEA.
  User: vertiavo
  Date: 18.05.17
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/cover_page.css">
</head>
<body>

<div class="site-wrapper">
    <div class="site-wrapper-inner">
        <div class="cover-container">
            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Notices</h3>

                    <ul class="nav masthead-nav">
                        <li class="active">
                            <a href="index.jsp">Home page</a>
                        </li>

                        <li>
                            <a href="category/category_list.xhtml">Categories</a>
                        </li>

                        <li>
                            <a href="notice/notice_list.xhtml">Notices</a>
                        </li>

                        <li>
                            <a href="author/author_list.xhtml">Authors</a>
                        </li>

                        <li>
                            <a href="#">Sign in</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">Welcome in our notices website.</h1>

                <p class="lead">To watch categories list and decide, in which you are interested most, click "Categories" tab.<br>
                    To browse through notices, click "Notices" tab.<br>

                    <small>
                        <br>In case of any questions or problems, you can contact us by clicking button below.
                    </small>

                </p>

                <p class="lead"><a class="btn btn-lg btn-info" href="#">Contact us</a></p>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>© 2017 M&P Team</p>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="js/bootstrap.js"></script>
<script src="js/jquery-3.2.1.js"></script>
</body>
</html>
