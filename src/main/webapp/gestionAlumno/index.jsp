<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <!--TODO HACER UN NAV-->
        <!--TODO HACER RESPONSIVO-->
        <div class="container">
            <form action="UsuarioLogin" method="post">
                <div class="form-group" align="center">
                    <img class="img-circle" id="img_logo" src="http://bootsnipp.com/img/logo.jpg"><!--TODO CHANGE IMAGE-->
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                    </button>
                </div>
                <div class="form-group">
                    <i class="material-icons">&#xE60E;</i><!--TODO-->
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required> <!--VALIDAR-->
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required> <!--VALIDAR INPUTS-->
                </div>
                <div class="form-group">
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input">
                            Check me out
                        </label>
                    </div>

                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </div>
            </form>
        </div>
        
        <!--TODO HACER UN FOOTER-->
    </body>
</html>
