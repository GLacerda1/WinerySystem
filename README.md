# WinerySystem

## Gabriel Lacerda Araujo

# Winery System (SOAP Web Services)

Este projeto demonstra a criação e o consumo de serviços web SOAP utilizando **Java + Maven + JAX-WS**.

A proposta é simular um sistema de vinícola com funcionalidades básicas como:
- consulta de vinhos 
- realização de pedidos  
- alertas de estoque  

---

## Estrutura do Projeto

O repositório está dividido em três projetos Maven:

### WinerySys (Publisher)
Responsável por **publicar os serviços SOAP**.

#### Serviços:

**WineStockService**
- `getMenu()` → retorna uma lista de vinhos  
- `placeOrder(String name, int quantity)` → confirma o pedido  

**WineWarningService**
- `sendWarn()` → retorna aviso de estoque insuficiente  

---

### WineStockClient (Consumer)

Cliente que consome o serviço de estoque.

- Executa o método `getMenu()`
- Exibe o menu de vinhos no console

---

### WineOrderClient (Consumer)

Cliente responsável por:
- realizar pedidos (`placeOrder`)
- consumir alertas (`sendWarn`)

---

## Tecnologias Utilizadas

- Java 17
- Maven  
- JAX-WS (SOAP)  
- Jakarta EE
