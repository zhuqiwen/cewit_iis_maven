
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Management</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <h1>CEWiT IIS: User Management</h1>
    <hr/>

    <h3>All users <a href="/admin/users/add" type="button" class="btn btn-primary btn-sm">Add</a></h3>

    <c:if test="${empty userList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>No user so far, please<a href="/admin/users/add" type="button" class="btn btn-primary btn-sm">add</a>
        </div>
    </c:if>


    <%--if userList not empty--%>
    <c:if test="${!empty userList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>ID</th>
                <th>Nick Name</th>
                <th>First Name</th>
                <th>Password</th>
                <th>Operation</th>
            </tr>

            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.nickname}</td>
                    <td>${user.firstName} ${user.lastName}</td>
                    <td>${user.password}</td>
                    <td>
                        <a href="/admin/users/show/${user.id}" type="button" class="btn btn-sm btn-success">Detail</a>
                        <a href="/admin/users/update/${user.id}" type="button" class="btn btn-sm btn-warning">Modify</a>
                        <a href="/admin/users/delete/${user.id}" type="button" class="btn btn-sm btn-danger">Add</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>






<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
