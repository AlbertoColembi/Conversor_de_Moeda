# Conversor de Moedas

## Visão Geral

Este projeto é um aplicativo de linha de comando em Java que realiza conversões de moedas em tempo real, utilizando a API ExchangeRate. O programa permite que o usuário selecione diferentes pares de moedas e quantidades para realizar a conversão. Ele é ideal para aprender sobre chamadas de API e manipulação de JSON com Java.

## Funcionalidades

O projeto oferece as seguintes funcionalidades:
1. **Converter Dólar para Kwanza (USD/AOA)**
2. **Converter Kwanza para Dólar (AOA/USD)**
3. **Converter Euro para Won Sul-Coreano (EUR/KRW)**
4. **Converter Won Sul-Coreano para Euro (KRW/EUR)**
5. **Converter Real para Peso Chileno (BRL/CLP)**
6. **Converter Peso Chileno para Real (CLP/BRL)**

## Estrutura do Projeto

### Pacotes e Classes

O projeto é dividido em pacotes e classes da seguinte forma:

- **ao.myinterprise.module**
  - **Conversor**: Classe principal que lida com as conversões de moeda. Inclui métodos para realizar requisições HTTP à API ExchangeRate e processar a resposta JSON.
  - **RestCode**: Classe responsável por exibir o menu e capturar a entrada do usuário para selecionar e executar as conversões.
  - **Current**: Registro (record) que representa a estrutura da resposta JSON com informações da taxa de conversão e o resultado da conversão.
  
- **ao.myinterprise.principal**
  - **Main**: Classe com o método `main` para iniciar a aplicação.

## Pré-requisitos

- Java JDK 11 ou superior (para suporte ao `HttpClient` e `HttpRequest`)
- Biblioteca **Gson** para manipulação de JSON (importada do Google)
- Chave de API válida do ExchangeRate (https://www.exchangerate-api.com/)

## Configuração

1. **Obtenha uma Chave de API**: Cadastre-se na [ExchangeRate API](https://www.exchangerate-api.com/) e obtenha uma chave de API gratuita.
2. **Instale a Biblioteca Gson**: Adicione a biblioteca `Gson` ao seu projeto para parsear o JSON. Se estiver usando um gerenciador de dependências como Maven, adicione a dependência ao arquivo `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```
3. **Configure a URL da API**: Certifique-se de atualizar o valor da variável `endereco` na classe `Conversor` com a sua chave de API.

## Como Executar

### Passo a Passo

1. Compile o projeto e todas as suas dependências.
2. Execute a classe `Main` na linha de comando para iniciar a aplicação:
    ```shell
    java ao.myinterprise.principal.Main
    ```
3. Siga as instruções do menu para escolher as opções de conversão e insira os valores desejados.

### Exemplo de Uso

Ao iniciar o programa, o usuário verá o seguinte menu:

```
========================================================================
  Bem-vindo ao App que te ajuda saber como está o câmbio do dia :)
                                Menu                                     
                                
[1] Converter de Dólar para Kwanza
[2] Converter de Kwanza para Dólar 
[3] Converter de Euro para Won
[4] Converter de Won para Euro
[5] Converter de Real para Peso
[6] Converter de Peso para Real
[7] Sair
=========================================================================
```

Após escolher uma opção, o usuário será solicitado a inserir a quantidade de moeda para converter. O programa exibirá a taxa de câmbio atual e o resultado da conversão.

## Explicação das Classes e Métodos

### `Conversor`

Esta é a classe central que contém os métodos de conversão de moedas. Cada método realiza uma chamada HTTP para a API ExchangeRate usando o `HttpClient` do Java e processa o resultado.

- **Métodos de Conversão**: Cada método de conversão (`ConvertDollarToKwz`, `convertKwzToDollar`, etc.) cria uma requisição para um par de moedas específico e exibe o valor convertido.
- **Gson**: O JSON retornado pela API é convertido para um objeto `Current` usando o `Gson`, que facilita o acesso aos valores de taxa de câmbio e de conversão.

### `RestCode`

Essa classe é responsável pela interface de linha de comando. Ela exibe o menu para o usuário, captura a entrada e chama o método de conversão adequado na classe `Conversor`.

- **Método `execut()`**: Gera o menu e solicita ao usuário a escolha da conversão e a quantidade desejada.
  
### `Current`

Este é um `record` que representa os dados de resposta da API ExchangeRate, contendo `conversion_rate` (taxa de conversão) e `conversion_result` (resultado da conversão).

### `Main`

Classe principal do programa que contém o método `main` e inicializa o aplicativo chamando `RestCode.execut()`.

## Exemplo de Saída

Ao selecionar a opção de conversão e inserir o valor, o programa retornará uma resposta similar a esta:

```
Tendo em conta o câmbio entre as moedas que é 675.4, então o resultado da conversão de 10 é 6754.0
```

## Tratamento de Erros

O programa está preparado para lidar com exceções comuns, como:
- **IOException**: Erros de rede ao conectar-se com a API.
- **InterruptedException**: Exceções lançadas pelo cliente HTTP.

## Melhorias Futuras

- **Suporte a Mais Moedas**: Adicionar mais pares de moedas e permitir ao usuário inserir as moedas de interesse.
- **Persistência de Dados**: Armazenar o histórico de conversões realizadas.
- **Interface Gráfica**: Integrar uma interface gráfica para facilitar o uso.

## Licença

Este projeto é livre para uso pessoal e acadêmico.
