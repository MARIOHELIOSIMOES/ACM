#ACM - API de Monitoramento da Qualidade da Água
Este projeto é uma API desenvolvida em Java com o framework Spring Boot, destinada ao acesso e manipulação de dados relacionados ao Transmissor Indicador Analisador (AIT) da estação de tratamento de água ETA de Mogi Mirim. A API consulta uma tabela no banco de dados SQL Server que armazena dados sobre parâmetros químicos monitorados na água, como turbidez, cloro, fluor e pH, importantes para garantir a qualidade da água tratada.

##Funcionalidades
*Consulta de dados de AIT (Transmissor Indicador Analisador).
*Monitoramento em tempo real de parâmetros químicos da água.
*Integração com um banco de dados SQL Server para extração de informações históricas e em tempo real.
##Tecnologias Utilizadas
*Java 11: Linguagem de programação principal do projeto.
*Spring Boot: Framework para construção da API REST.
*Spring Data JPA: Para mapeamento objeto-relacional (ORM) e operações no banco de dados.
*SQL Server: Banco de dados utilizado para armazenar os dados dos analisadores.
*Maven: Ferramenta de gerenciamento de dependências e build do projeto.
*H2 Database: Banco de dados em memória para testes.
*JUnit 5: Framework de testes para garantir a qualidade do código.
##Estrutura do Projeto
*src/main/java: Contém o código-fonte da aplicação.
**controllers: Define os endpoints da API.
**services: Lógica de negócios e manipulação de dados.
**repositories: Interface para operações com o banco de dados usando Spring Data JPA.
*src/main/resources: Contém arquivos de configuração da aplicação.
*src/test/java: Testes unitários e de integração.
##Configuração
Pré-requisitos
*Java 11 ou superior
*Maven para gerenciamento de dependências
*SQL Server configurado e com os dados de AIT.

