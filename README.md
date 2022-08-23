<div align = "center">
  <img width="600" alt="Projetotudo de bom" src="https://user-images.githubusercontent.com/90014122/184505066-7cf779f3-2bc6-4d85-b28c-d14f88e1edd4.png">
  <br>
</div>


<h1>Objetivo</h1>
<p>Criar uma API utilizando a linguagem Java para Cadastrar clientes, produto e entregar o histórico dos pedidos</p>
<h2>ENTREGAS MÍNIMAS</h2>

<h3>Back-end:</h3>
<ul>
<li>Cadastro de clientes</li>
<li>Listagem de clientes</li>
<li>Atualização de clientes</li>
<li>Deletar clientes</li>
<li>Histórico de transações entre contas</li>
<li>Controle de estoque</li>
<li>Medicamentos genéricos contêm 20% de desconto.</li>
</ul>
<h3>Gerais:</h3>
<ul>
<li>O código deve ser entregue em um repositório no Github.</li>
<li>A API deve conter todos os Métodos GET, PUT, POST, DELETE</li>
<li>Liste os endpoints no README.md</li>
<li>Testes automatizados, podem ser testes unitários ou testes de integração.</li>
 </ul>
<h3>CRITÉRIOS DE AVALIAÇÃO</h3>
 
<p>Documentação da Aplicação</p>

<h2>Descrição ENDPOINTS</h2>
<div>
<p>O programa é divide entre os endpoints das 3 entidades, cliente, pedido, produto
<p>Cliente, os campos para criação de um novo cliente são:</p>
<p>nome, cpf, email, tel</p>
<ul>
<li>POST: http://localhost:8080/client</li>
<li>GET: http://localhost:8080/client</li>
<li>DELETE: http://localhost:8080/client/{id do cliente}</li>
<li>PUT: http://localhost:8080/client/{id do clinte}</li>
</ul>
<p>Pedido, o campo para criação de um novo pedido é:</p>
<p>id_cliente</p>
 <ul>
 <li>POST: http://localhost:8080/pedido</li>
 <li>GET: http://localhost:8080/pedido</li>
 </ul>
 
<p>Produto, os campos para criação de um novo pedido são:</p>
<p>id_pedido, nome, desc_produto, preco_produto, generico_produto</p>
<ul>
<li>POST: http://localhost:8080/produto</li>
<li>GET: http://localhost:8080/produto</li>
</ul>
</div>
 
</div>
<h3>Tecnologias utilizadas</h3>
<div style="display: inline_block"><br>
  <img align="center" alt="kath-Java" height="50" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  <img align="center" alt="kath-Java" height="50" width="70"  src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
  <img align="center" alt="kath-Java" height="50" width="90" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg" />
 </div>
