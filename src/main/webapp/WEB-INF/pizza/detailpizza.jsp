<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 06/11/2018
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail pizza</title>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<nav aria-label="breadcrumb">
    <ol class="m-3 w-25 breadcrumb">
        <li class="breadcrumb-item"><a href="clients">Clients</a></li>
        <li class="breadcrumb-item"><a href="pizza">Pizza</a></li>
        <li class="breadcrumb-item active" aria-current="page">${pizza.libelle}</li>
    </ol>
</nav>

<div class="row">
    <div class="col-3 mx-auto">
        <!--Card-->
        <div class="card card-cascade card-ecommerce wider">

            <!--Card image-->
            <div class="view view-cascade overlay">
                <img class="card-img-top" src="${pizza.urlImage}" alt="${pizza.libelle}">
                <a>
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <!--/.Card image-->
            <!--Card content-->
            <div class="card-body card-body-cascade text-center">
                <!--Category & Title-->
                <h5>[${pizza.reference}]</h5>
                <h4 class="card-title"><strong><a href="">${pizza.libelle}</a></strong></h4>

               <!--Description
                <p class="card-text">Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates.
                </p>-->

                <!--Card footer-->
                <div class="card-footer">
                    <span class="float-left">${pizza.prix}€</span>
                </div>
            </div>
            <!--/.Card content-->
        </div>
        <!--/.Card-->
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
