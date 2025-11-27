#  💼 Projeto Observer -- Spring Boot 3.5.7

Este projeto demonstra a implementação do **Design Pattern Padrão: Observer**, utilizando **Spring Boot 3.5.7**.  
O padrão Observer permite que eventos sejam disparados e múltiplos "observadores" reajam automaticamente.

---

### 📊 Status do Projeto
<!-- ![Status](https://img.shields.io/badge/status-em%20andamento-yellow) -->
<h3 align="center">✅ Concluído ✅</h3>
<!-- <h3 align="center">🚧🚧 Em construção!  👷 🧱🚧</h3> -->

# 🚀 Como Executar o Projeto

## ✅ Pré-requisitos

- **Java 23+**
- **Maven 3.9+**
- **VS Code** com as extensões _Spring Initializr_ e _Java Pack_
- **Git** instalado

---

## ▶️ Passo a Passo para Executar

### 1️⃣ Clone o repositório
```bash
git clone git@github.com:Lucas-Ed/Observer.git
```

### 2️⃣ Entre na pasta do projeto
```bash
cd observer
```

### 3️⃣ Limpe e baixe as dependências
```bash
mvn clean install
```

### 4️⃣ Execute a aplicação
```bash
mvn spring-boot:run
```

### 5️⃣ Interação com o usuário
Ao rodar o projeto, o console exibirá:

```
Digite seu pedido:
Criando pedido: PED-001
[LOG] Pedido criado: PED-001
Enviando e-mail sobre o pedido: PED-001
Pedido enviado à empresa com sucesso!
```

Isso demonstra o funcionamento do **padrão Observer**, onde diferentes ouvintes (listeners) respondem ao mesmo evento.

---

# 🧱 Arquitetura do Projeto

```
📦 src/main/java/com/example/observerdemo/
 ┣ 📄 ObserverDemoApplication.java
 ┣ 📂 event/
 ┃   ┗ 📄 PedidoCriadoEvent.java
 ┣ 📂 listener/
 ┃   ┣ 📄 NotificarEmailListener.java
 ┃   ┗ 📄 LogPedidoListener.java
 ┗ 📂 service/
     ┗ 📄 PedidoService.java
```

---

# 👨‍💻 Autores

<table>
<tr>
  <td align="center">
      <a href="https://github.com/Lucas-Ed">
        <img src="https://avatars.githubusercontent.com/u/30055762?v=4" width="100px;" alt="Lucas"/>
        <br /><sub><b>Lucas Eduardo</b></sub>
      </a><br />
      <a href="https://www.instagram.com/lucas.eduardo007/">@lucas.eduardo007</a>
    </td>

  <td align="center">
      <a href="https://github.com/TiagoBertoline">
        <img src="https://avatars.githubusercontent.com/u/183771495?v=4" width="100px;" alt="Tiago"/>
        <br /><sub><b>Tiago Bertoline</b></sub>
      </a>
    </td>

  <td align="center">
      <a href="https://github.com/mobmaz">
        <img src="https://avatars.githubusercontent.com/u/183776246?v=4" width="100px;" alt="Marcos"/>
        <br /><sub><b>Marcos Zambom</b></sub>
      </a><br />
      <a href="https://www.instagram.com/m.zambom">@m.zambom</a>
    </td>
</tr>
</table>

---

## :memo: Licença
Projeto criado para fins de estudo sobre **Design Patterns em Java com Spring Boot**.

### 💚 Feito com dedicação e café ☕
