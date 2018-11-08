<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 06/11/2018
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

    <ul class=" m-3 w-25 p-3 list-group">
        <li class="list-group-item">Detail Client avec l'id : ${client.id}</li>

        <li class="list-group-item list-group-item-primary">Numero Client : ${client.numClient}</li>
        <li class="list-group-item list-group-item-secondary">Nom : ${client.nom}</li>
        <li class="list-group-item list-group-item-success">Prenom : ${client.prenom}</li>
        <li class="list-group-item list-group-item-danger">Adresse : ${client.adresse}</li>
        <li class="list-group-item list-group-item-warning">Tel Fixe : ${client.telFixe}</li>
        <li class="list-group-item list-group-item-info">Tel Fixe : ${client.telFixe}</li>
        <li class="list-group-item list-group-item-info">Tel Portable : ${client.telPortable}</li>
        <li class="list-group-item list-group-item-light">Date de naissance : ${client.dateNaissance}</li>
        <li class="list-group-item list-group-item-dark">Email : ${client.email}</li>
    </ul>
    <a href="clients"><button type="button" class="m-3 btn btn-outline-primary">Retour clients</button></a>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
