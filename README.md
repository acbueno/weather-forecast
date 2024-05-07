# Weather Forecast

Este é um projeto de exemplo que consome uma API de previsão do tempo e fornece informações sobre o clima de uma determinada cidade.

## Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/Java-11-blue)
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
- ![RestTemplate](https://img.shields.io/badge/RestTemplate-2.5.4-yellow)
- ![Jackson](https://img.shields.io/badge/Jackson-2.12.4-purple)
- ![Lombok](https://img.shields.io/badge/Lombok-1.18.20-orange)
- ![OpenAPI](https://img.shields.io/badge/OpenAPI-1.5.10-blue)

## Funcionalidades

- Consulta da previsão do tempo atual de uma cidade específica.
- Consulta da previsão do tempo para os próximos dias de uma cidade específica.
- Suporte para várias cidades.

## Como Executar o Projeto

1. Clone o repositório do projeto:
   ```sh
   git clone https://github.com/acbueno/weather-forecast.git
   ```
2. Navegue até o diretório do projeto:
    ```sh
    cd weather-forecast
3. Execute o projeto com o Maven:
    ```sh
    mvn spring-boot:run
    ```
## Acesse a API de previsão do tempo:
  - Para obter a previsão do tempo atual de uma cidade específica, faça uma requisição GET para /api/weather/current/{city}.
  - Para obter a previsão do tempo para os próximos dias de uma cidade específica, faça uma requisição GET para /api/weather/forecast/{city}.

## Documentação da API
  A documentação da API pode ser acessada em /swagger-ui.html, após iniciar o servidor.
## Configurações
  As configurações da API, como a chave de acesso à API de previsão do tempo, podem ser modificadas no arquivo application.properties.

## Contribuindo
  Sinta-se à vontade para contribuir com o projeto enviando pull requests ou reportando issues.
  




  
