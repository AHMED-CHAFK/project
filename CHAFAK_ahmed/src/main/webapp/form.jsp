<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />

      <meta name="keywords" content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
      <meta name="author" content="Codedthemes" />
      <!-- Favicon icon -->

      <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
      <!-- Google font-->
      <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,700" rel="stylesheet">
      <!-- Required Fremwork -->
      <link rel="stylesheet" type="text/css" href="assets/css/bootstrap/css/bootstrap.min.css">
      <!-- waves.css -->
      <link rel="stylesheet" href="assets/pages/waves/css/waves.min.css" type="text/css" media="all">
      <!-- themify-icons line icon -->
      <link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">
      <!-- ico font -->
      <link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">
      <!-- Font Awesome -->
      <link rel="stylesheet" type="text/css" href="assets/icon/font-awesome/css/font-awesome.min.css">
      <!-- Style.css -->
      <link rel="stylesheet" type="text/css" href="assets/css/style.css">
      <script type="text/javascript" src="assets/js/jquery/jquery.min.js "></script>
<script type="text/javascript" src="assets/js/jquery-ui/jquery-ui.min.js "></script>
<script type="text/javascript" src="assets/js/popper.js/popper.min.js"></script>
<script type="text/javascript" src="assets/js/bootstrap/js/bootstrap.min.js "></script>
<!-- waves js -->
<script src="assets/pages/waves/js/waves.min.js"></script>
<!-- jquery slimscroll js -->
<script type="text/javascript" src="assets/js/jquery-slimscroll/jquery.slimscroll.js"></script>
<script type="text/javascript" src="assets/js/common-pages.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="main-body">
                                <div class="page-wrapper">

                                    <!-- Page body start -->
                                    <div class="page-body">
                        <div class="row">
                        <div class="col-sm-12">
                           <div class="card">
                                                    <div class="card-header">
                                                        <h5>Ajouter Etudiant</h5>
                                                    </div>
                                                    <div class="card-block">
                                                        <h4 class="sub-title">Veuillez saisir les donnees de votre Etudiant: </h4>
                                                        <form action="inscription" method="post">
                                                            <div class="form-group row">
                                                                <label class="col-sm-2 col-form-label">Nom</label>
                                                                <div class="col-sm-10">
                                                                    <input type="text" name="nom" class="form-control">
                                                                </div>
                                                            </div>
                                                            
                                                             <div class="form-group row">
                                                                <label class="col-sm-2 col-form-label">Prenom</label>
                                                                <div class="col-sm-10">
                                                                    <input type="text" name="prenom" class="form-control">
                                                                </div>
                                                            </div>
                                                            
                                                             <div class="form-group row">
                                                                <label class="col-sm-2 col-form-label">Email</label>
                                                                <div class="col-sm-10">
                                                                    <input type="text" name="email" class="form-control">
                                                                </div>
                                                            </div>
                                                            
                                                             <div class="form-group row">
                                                                <label class="col-sm-2 col-form-label">Mot de passe</label>
                                                                <div class="col-sm-10">
                                                                    <input type="password" name="mdp" class="form-control">
                                                                </div>
                                                            </div>
                                                            <div class="form-group row">
                                                          	  <div class="col-sm-10">
                                                          			<button type="submit" class="btn waves-effect waves-light btn-primary"><i class="icofont icofont-user-alt-3"></i>Ajouter Votre Etudiant</button>
                                                                </div></div>                               
                                                         </form>  
                                                    </div>
                                                </div>
                        
                        
                        </div></div>
                        </div>

</body>
</html>