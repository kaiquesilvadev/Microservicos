# Microservices com Java

Bem-vindo ao repositório **Microservices com Java**! Este projeto tem como objetivo explorar e exemplificar a arquitetura de microservices utilizando a linguagem Java. O foco principal deste repositório não é implementar lógicas de negócios complexas, mas sim entender e praticar os conceitos fundamentais da arquitetura de microservices de maneira clara e objetiva.

## Objetivo

O objetivo deste repositório é fornecer exemplos práticos , testar e implementar microservices em Java, facilitando o entendimento e a aplicação desses conceitos em projetos reais.  desafios e melhores práticas para trabalhar com microservices.

## Serviços e Componentes

1. **auth-server**
   - Implementação de um servidor de autenticação.
   - Comunicação com o gateway para autenticação e liberação de CSRF.
   - [Ver diretório auth-server](./auth-server)

2. **hr-api-gateway-zuul**
   - API Gateway para rotear e filtrar requisições.
   - [Ver diretório hr-api-gateway-zuul](./hr-api-gateway-zuul)

3. **hr-config-server**
   - Servidor de configuração centralizada utilizando Spring Cloud Config.
   - [Ver diretório hr-config-server](./hr-config-server)

4. **hr-eureka-server**
   - Servidor Eureka para serviço de descoberta.
   - [Ver diretório hr-eureka-server](./hr-eureka-server)

5. **hr-payroll**
   - Serviço de folha de pagamento.
   - [Ver diretório hr-payroll](./hr-payroll)

6. **hr-user**
   - Serviço de gerenciamento de usuários com funcionalidade de login.
   - [Ver diretório hr-user](./hr-user)

7. **hr-worker**
   - Serviço de gerenciamento de trabalhadores com Actuator para atualização de configurações em runtime.
   - [Ver diretório hr-worker](./hr-worker)

## Visão Geral do Sistema

![Visão Geral do Sistema](https://github.com/kaiquesilvadev/Microsservicos/blob/main/img/Vis%C3%A3o%20geral%20do%20sistema.png)

Esta imagem apresenta uma visão geral da arquitetura do sistema, destacando a interação entre os diferentes componentes e serviços. Aqui estão algumas das principais funcionalidades e componentes representados:

- **API Gateway:** Representado como o ponto de entrada para todas as solicitações do cliente. Ele roteia as solicitações para os serviços apropriados e também pode realizar funções de autenticação, autorização, monitoramento e logging.
  
- **Serviços de Microservices:** Os serviços individuais implementam diferentes partes da lógica de negócios. Eles são independentes, escaláveis e podem ser desenvolvidos, implantados e dimensionados independentemente uns dos outros.

- **Banco de Dados:** Representado como um componente central que armazena os dados necessários para o funcionamento do sistema. Pode incluir bancos de dados relacionais, NoSQL, cache de dados e outros sistemas de armazenamento.

- **Servidor de Configuração:** Responsável por armazenar e fornecer as configurações do sistema para os serviços. Ele permite uma configuração centralizada e dinâmica dos serviços, facilitando a manutenção e a escalabilidade do sistema.

- **Servidor de Autenticação e Autorização:** Gerencia o processo de autenticação e autorização dos usuários, garantindo que apenas usuários autorizados tenham acesso aos recursos protegidos.

Esta imagem fornece uma visão geral visual do sistema, ajudando a compreender a interação e a arquitetura geral do sistema de microservices.

## Autenticação e Autorização

![Autenticação e Autorização](https://github.com/kaiquesilvadev/Microsservicos/blob/main/img/Autentica%C3%A7%C3%A3o%20e%20Autoriza%C3%A7%C3%A3o.png)

Esta imagem apresenta um diagrama ilustrativo do processo de autenticação e autorização dentro do sistema. Aqui estão algumas informações destacadas:

- **Fluxo de Autenticação:** O processo pelo qual um usuário envia suas credenciais para o sistema e é verificado como um usuário válido.
  
- **Fluxo de Autorização:** Como o sistema determina quais recursos um usuário autenticado tem permissão para acessar.

- **Componentes Envolvidos:** Quais serviços ou componentes estão envolvidos no processo de autenticação e autorização, como o servidor de autenticação, o banco de dados de usuários, entre outros.

Essa imagem fornece uma visão geral visual do processo de autenticação e autorização dentro do sistema, ajudando a entender como o sistema controla o acesso aos recursos protegidos.

## Modelo Conceitual

![Modelo Conceitual](https://github.com/kaiquesilvadev/Microsservicos/blob/main/img/Modelo%20conceitual.png)

Esta imagem apresenta um modelo conceitual da arquitetura do sistema, mostrando os principais componentes e suas interações. Aqui estão algumas informações destacadas:

- **Entidades e Relacionamentos:** As principais entidades de negócios e seus relacionamentos dentro do sistema.
  
- **Módulos e Componentes:** Como o sistema é dividido em módulos e componentes, cada um responsável por uma parte específica da lógica de negócios.

- **Interfaces e Interações:** Como os diferentes componentes interagem entre si e com os usuários externos.

Essa imagem fornece uma representação visual do modelo conceitual do sistema, ajudando a entender sua estrutura e organização geral.

