<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 06/11/2018
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<nav aria-label="breadcrumb">
    <ol class="m-3 w-25 breadcrumb">
        <li class="breadcrumb-item"><a href="clients">Clients</a></li>
        <li class="breadcrumb-item active" aria-current="page">pizza</li>
        <li class="breadcrumb-item active"><a href="addpizza">Ajouter une pizza</a></li>
    </ol>
</nav>

<div class="container-fluid">
    <div class="card-columns">
        <c:forEach items="${pizza}" var="pizza">
            <div class="card" style="width: 100%; display: inline-block; ">
                <div class="embed-responsive embed-responsive-16by9">
                    <img class="embed-responsive-item card-img-top" src="${pizza.urlImage}" alt="${pizza.libelle}">
                </div>
                <div class="card-body">
                    <h5 class="card-title">${pizza.libelle}</h5>
                    <a href="detailpizza?id=${pizza.id}" class="btn btn-primary">Detail pizza</a>
                    <a href="modifierpizza?id=${pizza.id}" class="btn btn-primary">Modifier la pizza</a>
                    <a href="deletepizza?id=${pizza.id}" class="btn btn-primary">Supprimer la pizza</a>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
