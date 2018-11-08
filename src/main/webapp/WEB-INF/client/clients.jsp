<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 06/11/2018
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<nav aria-label="breadcrumb">
    <ol class="w-100 breadcrumb">
        <li class="breadcrumb-item"><a href="pizza">Pizza</a></li>
        <li class="breadcrumb-item active" aria-current="page">Clients</li>
        <li class="breadcrumb-item"><a href="addclient">Ajouter un client</a></li>
    </ol>
</nav>

    <table class="table table-striped">
        <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Numero Client</th>
            <th scope="col">Nom</th>
            <th scope="col">Prenom</th>
            <th scope="col">Adresse</th>
            <th scope="col">Tel Fixe</th>
            <th scope="col">Tel Portable</th>
            <th scope="col">Date de naissance</th>
            <th scope="col">Email</th>
            <th>Voir client</th>
            <th>Modifier client</th>
            <th>Supprimer client</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${client}" var="client">
                <tr>
                    <td scope="row">${client.id}</td>
                    <td>${client.numClient}</td>
                    <td>${client.nom}</td>
                    <td>${client.prenom}</td>
                    <td>${client.adresse}</td>
                    <td>${client.telFixe}</td>
                    <td>${client.telPortable}</td>
                    <td>${client.dateNaissance}</td>
                    <td>${client.email}</td>
                    <td><a href="client?id=${client.id}">Voir client</a></td>
                    <td><a href="modifierclient?id=${client.id}">Modifier client</a></td>
                    <td><a href="deleteclient?id=${client.id}">Supprimer Client</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
