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
                            <a href="index.jsp">Strona główna</a>
                        </li>

                        <li>
                            <a href="category/category_list.xhtml">Kategorie</a>
                        </li>

                        <li>
                            <a href="notice/notice_list.xhtml">Ogłoszenia</a>
                        </li>

                        <li>
                            <a href="author/author_list.xhtml">Autorzy</a>
                        </li>

                        <li>
                            <a href="#">Zaloguj się</a>
                        </li>

                        <li>
                            <a href="#">Kontakt</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">Witaj w naszej bazie ogłoszeń.</h1>

                <p class="lead">By obejrzeć listę kategorii i wybrać, która Cię interesuje, kliknij zakładkę "Kategorie".<br>
                    W celu przeszukania bazy ogłoszeń wybierz zakładkę "Ogłoszenia".<br>

                    <small>
                        <br>W razie problemów lub jakichkolwiek pytań kliknij poniżej by uzyskać pomoc
                    </small>

                </p>

                <p class="lead"><a class="btn btn-lg btn-info" href="#">Dowiedz się więcej</a></p>
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
