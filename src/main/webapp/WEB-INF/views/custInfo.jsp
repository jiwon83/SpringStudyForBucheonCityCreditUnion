<%@ page import="com.sample.simple.domain.customer.dto.response.CustomerResponseDto" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>고객 정보</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 2rem;
            background-color: #f9f9f9;
        }
        h1 {
            color: #333;
        }
        table {
            border-collapse: collapse;
            width: 400px;
            background: white;
            box-shadow: 0 0 5px rgba(0,0,0,0.1);
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: left;
        }
        th {
            background: #f1f1f1;
            width: 120px;
        }
    </style>
</head>
<body>

<h1>고객 정보</h1>

<%
    Object customerObj = request.getAttribute("customer");
    if (customerObj != null) {
        CustomerResponseDto customer = (CustomerResponseDto) customerObj;
%>
<table>
    <tr>
        <th>고객 ID</th>
        <td><%= customer.id() %></td>
    </tr>
    <tr>
        <th>이름</th>
        <td><%= customer.name() %></td>
    </tr>
    <tr>
        <th>이메일</th>
        <td><%= customer.email() %></td>
    </tr>
</table>
<%
} else {
%>
<p>고객 정보를 찾을 수 없습니다.</p>
<%
    }
%>

</body>
</html>
