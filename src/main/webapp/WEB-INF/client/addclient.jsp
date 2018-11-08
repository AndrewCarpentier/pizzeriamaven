<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 07/11/2018
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un client</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

    <form action="addclient" method="post">
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="numClient">Numero Client</label>
                <input type="text" class="form-control" name="numClient" id="numClient" placeholder="numero client">
            </div>
            <div class="form-group col-md-5">
                <label for="nom">Nom</label>
                <input type="text" class="form-control" name="nom" id="nom" placeholder="nom">
            </div>
            <div class="form-group col-md-5">
                <label for="prenom">Prenom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" placeholder="prenom">
            </div>
        </div>
        <div class="form-group">
            <label for="adresse">Addresse</label>
            <input type="text" class="form-control" name="adresse" id="adresse" placeholder="1234 Main St">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="telFixe">Telephone fixe</label>
                <input type="text" class="form-control" name="telFixe" id="telFixe" placeholder="03 21 54 69 50">
            </div>
            <div class="form-group col-md-6">
                <label for="telPortable">Telephone portable</label>
                <input type="text" class="form-control" name="telPortable" id="telPortable" placeholder="06 21 40 83 59">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="dateNaissance">Date de naissance</label>
                <input type="text" class="form-control" name="dateNaissance" id="dateNaissance" placeholder="YYYY-MM-DD">
            </div>
            <div class="form-group col-md-6">
                <label for="email">Email</label>
                <input type="text" class="form-control" name="email" id="email" placeholder="exemple@exemple.com">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Valider</button>
    </form>

</body>
</html>
