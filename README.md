# Spring Resources

**Spring Resources** é um repositório experimental criado para explorar e testar recursos do **Spring Framework**, utilizando **Kotlin** na **JVM 17**. O objetivo é servir como um ambiente de experimentação e aprendizado com módulos e funcionalidades do ecossistema Spring.

## 📃 Visão Geral

Este projeto permite ao desenvolvedor praticar conceitos e componentes do Spring como injeção de dependência, controle de contexto, web controllers, beans, configurações reativas e muito mais, usando uma linguagem moderna e concisa: **Kotlin**.

## 🚀 Tecnologias Utilizadas

* **Kotlin** (JVM 17)
* **Spring Boot**
* **Spring Framework (Core, Web, Context)**
* **Gradle Kotlin DSL**

## 🎨 Possibilidades de Exploração

* Criação de APIs REST simples
* Teste de beans e scopes
* Utilização de profiles
* Componentes reativos (WebFlux, se habilitado)
* Integração com banco de dados (se desejado)
* Propriedades customizadas e configuração modular

## 🚩 Como Executar Localmente

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/rnsiqueira/spring-resources.git
   cd spring-resources
   ```

2. **Execute com Gradle**:

   ```bash
   ./gradlew bootRun
   ```

3. **Acesse a aplicação**:

   ```
   http://localhost:8080
   ```

## 🛋️ Estrutura do Projeto

* `src/main/kotlin/` – Código-fonte Kotlin
* `src/test/kotlin/` – Testes unitários e de integração
* `resources/application.yml` – Configurações Spring Boot
* `build.gradle.kts` – Configuração do projeto com Gradle Kotlin DSL

## 📄 Licença

Este projeto está licenciado para fins educacionais e experimentação. É recomendado para desenvolvedores que desejam praticar ou validar funcionalidades do Spring com Kotlin.

## 🤝 Contribuições

Pull requests e sugestões são bem-vindos! Sinta-se à vontade para clonar, testar e compartilhar ideias.

## 📢 Contato

Projeto experimental mantido por [Rafael N. Siqueira](https://github.com/rnsiqueira).
