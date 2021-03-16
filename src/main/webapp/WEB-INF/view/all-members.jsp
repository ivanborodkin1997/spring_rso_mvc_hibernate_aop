<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head> <meta charset="UTF-8" /> </head>
<body>

<h2>Все участники</h2>
<br>

<table style="border-collapse: collapse">
    <tr>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Фамилия</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Имя</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Отчество</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Дата рождения</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Университет</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Курс</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Факультет</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Номер группы</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Социальные сети</th>
        <th style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">Операции</th>
    </tr>
    <c:forEach var="mem" items="${allMembs}" >
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="memId" value="${mem.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteMember">
            <c:param name="memId" value="${mem.id}"/>
        </c:url>
        <tr>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.firstName}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.secondName}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid #800080; text-align: center; font-size: 100%;">${mem.lastName}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.dateOfBirth}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.university}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.course}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.faculty}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.numberOfTheGroup}</td>
            <td style="width: 50px; padding: 7px 0; border: 1px solid purple; text-align: center; font-size: 100%;">${mem.socialNetworks}</td>
            <td>
                <input type="button" value="Изменить данные"
                onclick="window.location.href = '${updateButton}'"/>
            </td>
            <td>
                <input type="button" value="Удалить"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</table>
<br>

</body>
</html>
