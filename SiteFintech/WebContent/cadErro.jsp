<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
    <title>Praticando Bootstrap</title>
    <link rel="stylesheet" href="assets/css/respondeCad.css">
</head>
<body class="bg-dark">
    <!-- texto cabe�alho in�cio -->
    <header class="container.fluid bg-light">
        <div class="logo Container.fluid text-center">
            <a href="cadastro.jsp" class="logo-link"><img src="assets/img/logo_my_Finance-removebg-preview.png"alt="Logo My Finance"></a>
        </div>
    </header>
    <!-- texto cabe�alho in�cio -->
    <main class="mb-5">
        <!-- Login com as redes sociais in�cio -->
		<h1 class="error">Erro ao se Cadastrar!</h1>
		<p>Infelizmente voc� n�o conseguiu realizar seu cadastro! Verifique seu Email e CPF, caso ja esteja cadastrado entre em contato conosco! Clique <a href="cadastro.jsp">aqui</a> para tentar novamente!</p>
        <!-- Login com as redes sociais in�cio -->

    </main> 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <script src="assets/javaScript/validation.js"></script>
</body>
</html>

<!-- obs: A responsividade dessa p�gina foi feita com @media -->