<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
    integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/cards.css">
    <title>Proventos</title>
</head>
<body class="bg-dark">
    <!-- inicio cabeçalho -->
    <header class="grid fixed-top">
        <div class="logo">
            <a href="home.jsp" class="logo-link"><img src="assets/img/logo_my_Finance-removebg-preview.png"alt="Logo My Finance"></a>
        </div>
        <nav class="navbar nav">
                <div class="container-fluid">
                  <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                  </button>
                  <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
                    <div class="offcanvas-header">
                      <h5 class="offcanvas-title" id="offcanvasNavbarLabel">MENU</h5>
                      <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                      <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                        <li class="nav-item">
                          <a class="nav-link" href="construcao.jsp">Serviços</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="finanças.jsp">Finanças</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="investimento.jsp">Investimentos</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="construcao.jsp">Sair</a>
                      </li>
                      </ul>
                    </div>
                  </div>
                </div>
              </nav>
        </nav>
    </header>
    <!-- fim cabeçalho -->7
    <!-- <form action="" class="add-card" id="add-card">
      <label for="nomePlanilha" class="nomePlanilha">Nome da nova Planilha</label>
      <input type="text" class="nomePlanilha" nome="titulo" id="box-style" placeholder="Nome da nova planilha">
      <input type="submit" class="button" id="submit" value="Adicionar Planilha">
    </form> -->
    <!-- início cards -->
    <section class="container-fluid text-center text-light" id="cardElement">
          <div class="row">
            <div class="col-6 mt-5">CADASTRAR PROVENTOS</p>
              <a href="cadProventos.jsp"><img src="assets/img/PLANILHA.jpg" class="border-light border border-3 rounded figure" alt="GASTOS"></a>
            </div>

            <div class="col-6 mt-5"><p>MEUS PROVENTOS</p>
              <a href="cadProv?acao=listar"><img src="assets/img/PLANILHA.jpg" class="border-light border border-3 rounded figure" alt="PROVENTOS/LUCRO"></a>
            </div>
          </div>
        </div>
    </section>
    <!-- fim cards -->

    

    <!-- início rodapé -->
    <footer class="container-fluid">
        <div class="d-flex flex-md-row flex-column mb-3">
          <div class="contato d-flex flex-column mb-3">
            <div class="container text-center text-dark">
              <p><i class="fa-solid fa-phone"></i>Telefone para Contato <a href="te:0800 99665 2255">(+55 0800 99665-2255)</a></p>
            </div>
            <div class="container text-center text-dark">
              <p><i class="fa-solid fa-envelopes-bulk"></i>Email: fiap@fiap.com.br</p>
            </div>
          </div>
  
          <div class="icon container text-center">
              <h2 class="text-dark mb-2">Acesse nossas redes sociais</h2>
              <a href="https://www.facebook.com/?stype=lo&jlou=Aff5aRMLvZub-xiNtOYbFu-lwowtRs9vGBnqVawmDYN-t2qu0T2klhDU2fzcwBJzwCnFgPHLY_yJnP944ZVX_Yg_Kzc94UAYbUly17KyQaD2BA&smuh=23681&lh=Ac-JPePI8dvxY-FKv4E" target="_blank">
                  <i class="fa-brands fa-facebook"></i>
              </a>  
              <a href="https://www.instagram.com" target="_blank">
                  <i class="fa-brands fa-instagram"></i>
                  
              </a>
              <a href="https://twitter.com" target="_blank">
                  <i class="fa-brands fa-twitter"></i>
              </a>
              <a href="https://www.linkedin.com/login/pt" target="_blank">
                  <i class="fa-brands fa-linkedin"></i>
              </a>
          </div>
        </div>
        <h4 class="text-center text-dark"><i class="fa-regular fa-copyright"></i>MyFinance.L.T.D.A</h4>
      </footer>
    <!-- fim rodapé -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
        crossorigin="anonymous"></script>
    <script src="assets/javaScript/main.js"></script>
</body>
</html>