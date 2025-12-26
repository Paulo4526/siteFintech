<h1 align="center">💰 Site Fintech</h1>

<p align="center">
  Aplicação <strong>Java Web</strong> desenvolvida com <strong>JSP, Servlets e JDBC</strong>,
  simulando um sistema financeiro (Fintech), com foco em arquitetura MVC,
  persistência em banco de dados e boas práticas de desenvolvimento backend.
</p>

<hr/>

<h2>📦 Visão Geral do Projeto</h2>
<p>
O <strong>Site Fintech</strong> é uma aplicação web tradicional baseada em Java EE,
onde o usuário interage através de páginas JSP, enquanto a lógica de negócio
é processada por <strong>Servlets</strong>, e o acesso ao banco de dados é realizado
via <strong>JDBC</strong>, utilizando o padrão de projeto <strong>DAO</strong>.
</p>

<p>
Este projeto demonstra conceitos fundamentais utilizados em aplicações corporativas
Java Web antes da popularização de frameworks como Spring MVC.
</p>

<hr/>

<h2>🏗️ Arquitetura da Aplicação</h2>

<pre>
siteFintech
├── src
│   ├── controller        (Servlets)
│   ├── dao               (Data Access Object)
│   ├── model             (Entidades)
│   ├── factory           (Conexão com banco)
│   └── util              (Utilitários)
│
├── WebContent
│   ├── jsp               (Views)
│   ├── css               (Estilos)
│   ├── js                (Scripts)
│   └── WEB-INF
│       └── web.xml
</pre>

<p>
A aplicação segue o padrão <strong>MVC (Model–View–Controller)</strong>:
</p>

<ul>
  <li><strong>Model</strong>: Classes de domínio e entidades</li>
  <li><strong>View</strong>: Páginas JSP</li>
  <li><strong>Controller</strong>: Servlets</li>
</ul>

<hr/>

<h2>🛠️ Tecnologias Utilizadas</h2>

<ul>
  <li>☕ Java (JDK 8+)</li>
  <li>🌐 JSP (JavaServer Pages)</li>
  <li>🧩 Servlets</li>
  <li>🗄️ JDBC (Java Database Connectivity)</li>
  <li>📦 Apache Tomcat</li>
  <li>🗃️ Banco de Dados Relacional (SQL)</li>
  <li>🎨 HTML5, CSS3 e JavaScript</li>
</ul>

<hr/>

<h2>📚 Bibliotecas e APIs</h2>

<ul>
  <li><code>javax.servlet</code> — API de Servlets</li>
  <li><code>javax.servlet.jsp</code> — JSP</li>
  <li><code>java.sql</code> — JDBC</li>
  <li>Driver JDBC do banco de dados</li>
</ul>

<hr/>

<h2>🧠 Conceitos Aplicados (Detalhado)</h2>

<h3>🔹 Servlets</h3>
<ul>
  <li>Recebem requisições HTTP (GET / POST)</li>
  <li>Controlam o fluxo da aplicação</li>
  <li>Encaminham dados para JSPs</li>
  <li>Funcionam como camada Controller (MVC)</li>
</ul>

<hr/>

<h3>🔹 JSP (JavaServer Pages)</h3>
<ul>
  <li>Camada de visualização da aplicação</li>
  <li>Renderização dinâmica de dados</li>
  <li>Uso de Expression Language (EL)</li>
  <li>Separação entre lógica e apresentação</li>
</ul>

<hr/>

<h3>🔹 JDBC (Acesso ao Banco de Dados)</h3>
<ul>
  <li>Conexão direta com banco de dados relacional</li>
  <li>Execução de SQL nativo</li>
  <li>PreparedStatement para segurança</li>
  <li>Mapeamento manual de ResultSet</li>
</ul>

<hr/>

<h3>🔹 DAO (Data Access Object)</h3>
<ul>
  <li>Encapsula regras de acesso a dados</li>
  <li>Centraliza operações CRUD</li>
  <li>Reduz acoplamento entre Servlets e banco</li>
  <li>Facilita manutenção e evolução</li>
</ul>

<hr/>

<h3>🔹 Factory de Conexão</h3>
<ul>
  <li>Responsável por criar conexões JDBC</li>
  <li>Centraliza configurações do banco</li>
  <li>Evita repetição de código</li>
</ul>

<hr/>

<h3>🔹 MVC (Model–View–Controller)</h3>
<ul>
  <li>Separação clara de responsabilidades</li>
  <li>Facilidade de manutenção</li>
  <li>Organização de código</li>
  <li>Padrão amplamente usado em aplicações Java Web</li>
</ul>

<hr/>

<h2>📌 Funcionalidades Simuladas</h2>

<ul>
  <li>Cadastro de usuários</li>
  <li>Autenticação</li>
  <li>Operações financeiras simuladas</li>
  <li>Persistência em banco de dados</li>
  <li>Navegação entre páginas JSP</li>
</ul>

<hr/>

<h2>🎯 Aplicabilidade no Mercado</h2>

<ul>
  <li>Manutenção de sistemas legados Java</li>
  <li>Compreensão profunda do ecossistema Java Web</li>
  <li>Base sólida para frameworks modernos (Spring MVC)</li>
  <li>Projetos corporativos tradicionais</li>
</ul>

<hr/>

<p align="center">
  Desenvolvido por <strong>Paulo Bueno</strong><br/>
  Java Web • JSP • Servlets • JDBC • DAO
</p>
