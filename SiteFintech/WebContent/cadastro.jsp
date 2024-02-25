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
    <link rel="stylesheet" href="assets/css/cadastro.css">
</head>
<body class="bg-dark">
    <!-- texto cabeçalho início -->
    <header class="container.fluid bg-light">
        <div class="logo Container.fluid text-center">
            <a href="../../index.jsp" class="logo-link"><img src="assets/img/logo_my_Finance-removebg-preview.png"alt="Logo My Finance"></a>
        </div>
    </header>
    <!-- texto cabeçalho início -->
    <main class="mb-5">
        <!-- Login com as redes sociais início -->
	<c:if test="${not empty msg}">
	<div class="alert text-center alert-primary"> ${msg}</div>
	</c:if>
	<c:if test="${not empty erro}">
	<div class="alert text-center alert-danger"> ${erro}</div>
	</c:if>
        <div class="container text-center text-light">
            <h2>Cadastre-se também com suas redes sociais</h2>
            <a href="https://www.facebook.com/?stype=lo&jlou=Aff5aRMLvZub-xiNtOYbFu-lwowtRs9vGBnqVawmDYN-t2qu0T2klhDU2fzcwBJzwCnFgPHLY_yJnP944ZVX_Yg_Kzc94UAYbUly17KyQaD2BA&smuh=23681&lh=Ac-JPePI8dvxY-FKv4E" target="_blank">
                <i class="fa-brands fa-facebook"></i>
            </a>  
            <a href="https://www.instagram.com" target="_blank">
                <i class="fa-brands fa-instagram"></i>
            <a href="">
                
            </a>
            <a href="https://twitter.com" target="_blank">
                <i class="fa-brands fa-twitter"></i>
            </a>
            <a href="https://www.tiktok.com/pt-BR/" target="_blank">
                <i class="fa-brands fa-tiktok"></i> 
            </a>
            <a href="https://github.com" target="_blank">
                <i class="fa-brands fa-github"></i>
            </a>
            <a href="https://www.linkedin.com/login/pt" target="_blank">
                <i class="fa-brands fa-linkedin"></i>
            </a>
        </div>
        <!-- Login com as redes sociais início -->

            <!-- Formulário de cadastro início -->
        <form class="form needs-validation" action="cadastro" method="post" novalidate>
        <input type="hidden" value="cadastrar" name="acao"/>
            <div class="container text-light">
                <div class="mb-3 email">
                    <label for="exampleInputEmail1" class="form-label">Endereço de E-mail</label>
                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="aaaaaa@aaa.com" required autofocus>
                    <i class="fa-solid fa-envelope icon"></i>
                    <div class="validation invalid-feedback">E-mail incorreto</div>
                    <div class="validation valid-feedback">E-mail valido</div>
                </div>
                
                <div class="mb-3">
                    <label for="nome" class="form-label">Digite seu nome e Sobrenome</label>
                    <input type="text" name="nome" class="form-control" placeholder="Ex: Paulo" required>
                    <i class="fa-solid fa-user-tie icon"></i>
                    <div class="validation invalid-feedback">Necessário o preenchimento do campo</div>
                    <div class="validation valid-feedback">Preenchido</div>
                  </div>
                  
                  <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Digite seu usuario</label>
                    <input type="text" name="apelido" class="form-control" placeholder="Ex: Paulo" required>
                    <i class="fa-solid fa-user-tie icon"></i>
                    <div class="validation invalid-feedback">Necessário o preenchimento do campo</div>
                    <div class="validation valid-feedback">Preenchido</div>
                  </div>
                  
                  <div class="mb-3">
                    <label for="exampleInputPassword2" class="form-label">Digite seu CPF</label>
                    <input type="text" name="cpf" class="form-control" id="exampleInputPassword2" placeholder="Ex: 41321125880" minLength="11" maxLength="11" required>
                    <i class="fa-solid fa-user icon"></i>
                    <div class="validation invalid-feedback">Necessário o preenchimento do campo</div>
                    <div class="validation valid-feedback">Preenchido</div>
                  </div>
                  
                  <div class="mb-3">
                    <label for="exampleInputPassword8" class="form-label">Digite sua profissão</label>
                    <input type="text" name="profissao" class="form-control" placeholder="Ex: Paulo" required>
                    <i class="fa-solid fa-user-tie icon"></i>
                    <div class="validation invalid-feedback">Necessário o preenchimento do campo</div>
                    <div class="validation valid-feedback">Preenchido</div>
                  </div>
                  
                  <div class="mb-3">
                    <label for="exampleInputPassword9" class="form-label">Digite seu salario</label>
                    <input type="number" name="salario" class="form-control" placeholder="Ex: Paulo" required>
                    <i class="fa-solid fa-user-tie icon"></i>
                    <div class="validation invalid-feedback">Necessário o preenchimento do campo</div>
                    <div class="validation valid-feedback">Preenchido</div>
                  </div>
                  
                  <div class="mb-3">
                    <label for="exampleInputPassword3" class="form-label">Data em que está sendo realizado o cadastro</label>
                    <input type="date" name="DtCadastro" class="form-control" id="exampleInputPassword3" required>
                    <i class="fa-solid fa-cake-candles icon"></i>
                    <div class="validation invalid-feedback">Necessário inserir a data de nascimento!</div>
                    <div class="validation valid-feedback">Data inserida corretamente</div>
                </div> 
                
                <div class="mb-3">
                    <label for="exampleInputPassword4" class="form-label">Senha</label>
                    <input type="password" name="senha" class="form-control" id="exampleInputPassword4" placeholder="***************************************" required>
                    <i class="fa-solid fa-key icon"></i>
                    <c:if test="${not empty Invalida}">
                    <div class="validation valid-feedback"> ${Invalida}</div>
                    </c:if>
                    <div class="validation invalid-feedback">Necessário uma senha</div>
                    <div class="validation valid-feedback">Senha valida</div>
                    
                </div>   
                <div class="mb-3">
                  <label for="exampleInputPassword5" class="form-label">Confirme sua Senha</label>
                  <input type="password" name="confirmaSenha" class="form-control" id="exampleInputPassword5" placeholder="***************************************" required>
                  <i class="fa-solid fa-lock-open icon"></i>
                  <c:if test="${not empty err}">
                  <div class="validation valid-feedback"> ${erro}</div>
                  </c:if>
                  <div class="validation invalid-feedback">Necessário uma senha</div>
                  <div class="validation valid-feedback">Senha valida</div>
                </div>
                
                <div class="mb-3 form-checks">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1" name="exampleCheck1" required>
                  <label class="form-check-label" for="exampleCheck1">Clique para confirmar</label>
                  <div class="invalid-feedback">Necessário aceitar os termos de uso</div>
                  <div class="valid-feedback">Checado</div>
                </div>
                
                <button type="submit" class="btn btn-primary">Cadastrar</button>
                
            </div>
        </form>
        <!-- Formulário de cadastro fim -->
    </main> 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <script src="assets/javaScript/validation.js"></script>
</body>
</html>

<!-- obs: A responsividade dessa página foi feita com @media -->