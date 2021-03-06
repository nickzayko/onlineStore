<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%--<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%--<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>--%>
<html lang="en">

<head>
    <title>Registration page</title>
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

<%--@elvariable id="userDTO" type="by.teachmeskills.onlinestore.dto.UserDTO"--%>
<form:form action="/registration/save" modelAttribute="userDTO" method="post">
    <form:input path="loginUserDTO" type="text" placeholder="login"/>
    <form:errors path="loginUserDTO"/>


    <form:input path="passwordUserDTO" type="password" placeholder="password"/>
    <form:errors path="passwordUserDTO"/>


    <form:input path="firstNameUserDTO" type="text" placeholder="firstName"/>
    <form:errors path="firstNameUserDTO"/>


    <form:input path="lastNameUserDTO" type="text" placeholder="lastName"/>
    <form:errors path="lastNameUserDTO"/>


    <form:input path="emailUserDTO" type="email" placeholder="email"/>
    <form:errors path="emailUserDTO"/>


    <form:input path="sexUserDTO" type="text" placeholder="sex"/>
    <form:errors path="sexUserDTO"/>


    <form:input path="dateOfBirthUserDTO" type="date" placeholder="dateOfBirth"/>
    <form:errors path="dateOfBirthUserDTO"/>


    <form:input path="telephoneNumberUserDTO" type="text" placeholder="telephoneNumber"/>
    <form:errors path="telephoneNumberUserDTO"/>


    <form:input path="countryUserDTO" type="text" placeholder="country"/>
    <form:errors path="countryUserDTO"/>


    <form:input path="regionUserDTO" type="text" placeholder="region"/>
    <form:errors path="regionUserDTO"/>


    <form:input path="cityUserDTO" type="text" placeholder="city"/>
    <form:errors path="cityUserDTO"/>

    <form:input path="streetUserDTO" type="text" placeholder="street"/>
    <form:errors path="streetUserDTO"/>


    <form:input path="buildNumberUserDTO" type="text" placeholder="buildNumber"/>
    <form:errors path="buildNumberUserDTO"/>


    <input type="submit" value="Save">
    <input type="reset" value="Reset">
</form:form>

<button><a href="/"/>Return to main page </button>







</body>
</html>