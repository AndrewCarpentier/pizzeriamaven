<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 06/11/2018
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter une pizza</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
    <form action="addpizza" method="post">
        <div class="form-row">
            <div class="col">
                <input type="text" name="libelle" class="form-control" placeholder="Nom de la pizza">
            </div>
            <div class="col-1">
                <input type="text" name="reference" class="form-control" placeholder="Reference : P + 3 premiere lettre pizza">
            </div>
            <div class="col-1">
                <input type="text" name="prix" class="form-control" placeholder="Prix de la pizza">
            </div>
            <div class="col-7">
                <input type="text" name="urlImage" class="form-control" placeholder="URL redirigeant vers une image pizza">
            </div>
            <div class="col-1">
                <button type="submit" class="btn btn-primary mb-2">Submit</button>
            </div>
        </div>
    </form>
</body>
</html>
