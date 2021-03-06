<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>

<h2>Все участники</h2>
<br>

<table style="border-collapse: collapse">
    <tr>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Фамилия</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Имя</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Отчество</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Дата рождения</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Университет</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Курс</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Факультет</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Номер группы</th>
        <th style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">Социальные сети</th>
    </tr>
    <c:forEach items="${allMembs}" var="mem">
        <tr>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.firstName}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.secondName}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.lastName}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.dateOfBirth}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.university}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.course}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.faculty}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.numberOfTheGroup}</td>
            <td style="width: 150px; padding: 20px 0; border: 5px solid purple; text-align: center; font-size: 150%;">${mem.socialNetworks}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
