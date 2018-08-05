<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<html lang="en">

<head>
    <title>Start page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
            integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
            crossorigin="anonymous"></script>
</head>

<body>

<%--@elvariable id="user" type="by.teachmeskills.onlinestore.entity.User"--%>
<form:form modelAttribute="user" action="/authorization" method="post">
    <form:input path="name" type="text" placeholder="name"/>
    <form:input path="password" type="password" placeholder="password"/>
    <input type="submit" value="save"/>
</form:form>

<form action="/getUserByName" method="post">
    <input  name="name" type="text" placeholder="name"/>
    <input type="submit" value="find/?????"/>
</form>

<div>${result}</div>



<%--<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">--%>
    <%--<!--<a class="navbar-brand" href="#">Online-</a>-->--%>
    <%--<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"--%>
            <%--aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">--%>
        <%--<span class="navbar-toggler-icon"></span>--%>
    <%--</button>--%>
    <%--<div class="collapse navbar-collapse" id="navbarCollapse">--%>
        <%--<ul class="navbar-nav mr-auto">--%>
            <%--<li class="nav-item active">--%>
                <%--<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>--%>
            <%--</li>--%>
            <%--<li class="nav-item">--%>
                <%--<a class="nav-link" href="#">Link</a>--%>
            <%--</li>--%>
            <%--<li class="nav-item">--%>
                <%--<a class="nav-link disabled" href="#">Disabled</a>--%>
            <%--</li>--%>
        <%--</ul>--%>


        <%--<div class="form-inline">--%>
            <%--&lt;%&ndash;@elvariable id="user" type="by.teachmeskills.onlinestore.entity.User"&ndash;%&gt;--%>
            <%--<springForm:form action="/authorization" method="post" modelAttribute="user"--%>
                             <%--class="form-inline mt-2 mt-md-0">--%>
                <%--<springForm:input path="login" class="form-control mr-sm-2" type="text" placeholder="Login"--%>
                                  <%--aria-label="Login"/>--%>
                <%--<springForm:input path="password" class="form-control mr-sm-2" type="password" placeholder="Password"--%>
                                  <%--aria-label="Password"/>--%>
                <%--<springForm:button class="btn btn-outline-success my-2 my-sm-0" type="submit">Log in</springForm:button>--%>
            <%--</springForm:form>--%>
            <%--<div class="form-inline mt-2 mt-md-0">--%>
                <%--<button class="btn btn-outline-success">Registration</button>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</nav>--%>



<%--</div>--%>



</body>
</html>