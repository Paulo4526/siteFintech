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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/home.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body class="bg-dark">
    <!-- início <menu></menu> -->
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
    <!-- fim <menu></menu> -->

    <!-- início carrosel -->
    <section class="noticias container">
        <h2>Notícias</h2>
        <div class="carrosel border-light border border-3 rounded">
            <div id="carouselExampleCaptions" class="carousel slide">
                <div class="carousel-indicators">
                  <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                  <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                  <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <a target="_blank" href="https://www.infomoney.com.br/mercados/ibovespa-hoje-bolsa-de-valores-ao-vivo-04072023/">
                        <img src="assets/img/pexels-lukas-590041.jpg" class="d-block w-100" alt="">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                      <p>Ibovespa hoje cai com sabatina de Galípolo e reforma tributária no Congresso</p>
                    </div>
                  </div>
                  <div class="carousel-item">
                    <a target="_blank" href="https://www.infomoney.com.br/mercados/trade-hoje-ibovespa-segue-em-tendencia-de-alta-mira-os-124-mil-pontos-mas-tem-forte-resistencia-a-frente/">
                        <img src="assets/img/pexels-burak-the-weekender-186461.jpg" class="d-block w-100" alt="">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                      <p class="text-light">Acompanhe o que movimenta a Bolsa</p>
                    </div>
                  </div>
                  <div class="carousel-item">
                    <a target="_blank" href="https://g1.globo.com/politica/noticia/2023/07/04/lira-busca-legado-economico-ao-articular-aprovacao-da-reforma-tributaria-na-camara.ghtml">
                        <img src="assets/img/pexels-nappy-935979.jpg" class="d-block w-100" alt="...">
                    </a>
                    <div class="carousel-caption d-none d-md-block">
                      <p>Lira busca legado econômico ao articular aprovação da reforma tributária na Câmara</p>
                    </div>
                  </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Next</span>
                </button>
              </div>
        </div>

    </section>
    <!-- fim carrosel -->
   <hr>
   <!-- início cards -->
    <section class="container cards">
        
        <div class="row">
            <div class="col-3 "><p>SERVIÇOS</p><a href="construcao.jsp"><img src="assets/img/serviços.jpg" alt="Serviços" class="figure border-light border border-3 rounded"></a></div>
            <div class="col-3"><p>FINANÇAS</p><a href="finanças.jsp"><img src="assets/img/finance.jpg" alt="Finanças" class="figure border-light border border-3 rounded "></a></div>
            <div class="col-3"><p>INVESTIMENTOS</p><a href="investimento.jsp"><img src="assets/img/investimentos.jpg" alt="Investimentos" class="figure border-light border border-3 rounded "></a></div>
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
</body>
</html>