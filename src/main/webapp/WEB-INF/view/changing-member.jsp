<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head> <meta charset="UTF-8" /> </head>
<body>
<h2>Изменение данных участника</h2>
<br>

<%--@elvariable id="member" type=""--%>
<form:form action="saveMember" modelAttribute="member">

    <form:hidden path="id"/>

    Фамилия <form:input path="firstName"/>
    <br><br>
    Имя <form:input path="secondName"/>
    <br><br>
    Отчество <form:input path="lastName"/>
    <br><br>
    Дата рождения <form:input path="dateOfBirth"/>
    <br><br>
    Университет <form:input path="university"/>
    <br><br>
    Курс <form:input path="course"/>
    <br><br>
    Факультет <form:input path="faculty"/>
    <br><br>
    Номер группы <form:input path="numberOfTheGroup"/>
    <br><br>
    Социальные сети <form:input path="socialNetworks"/>
    <br><br>
    <input type="submit" value="Заполнить"/>



</form:form>

</body>
</html>

