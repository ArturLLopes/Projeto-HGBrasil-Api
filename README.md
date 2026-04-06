# 🌦️ Projeto HG Brasil API

![Java](https://img.shields.io/badge/Java-17+-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)

API REST desenvolvida com **Spring Boot** para consumo e exposição de dados meteorológicos da **HG Brasil**, utilizando boas práticas de arquitetura, cache, API Gateway e versionamento.

---

## 📌 Objetivo

Este projeto foi criado com foco em:

- Praticar integração com APIs externas
- Aplicar boas práticas de desenvolvimento backend
- Demonstrar uso de ferramentas do mercado (Apigee, cache, geração de modelos)
- Servir como projeto de portfólio

---

## 🧠 Arquitetura

Controller → Service → Connector → API Externa  
                        ↓  
                      Cache  

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- RestTemplate
- Lombok
- jsonschema2pojo
- Ehcache
- Apigee (API Gateway)
- Maven
- Git / GitHub

---

## 🌍 Integração com API HG Brasil

GET https://api.hgbrasil.com/weather

Parâmetros:
- key
- city_name

---

## ⚙️ Implementação

### Connector
Responsável por consumir a API externa usando RestTemplate.

### jsonschema2pojo
Geração automática de modelos Java a partir do JSON.

### Cache (Ehcache)
Melhora performance e reduz chamadas externas.

### Apigee
Gerenciamento de API, segurança e CORS.

---

## 📡 Endpoint

GET /clima?cidade=Rio de Janeiro

Exemplo de resposta:

{
  "cidade": "Rio de Janeiro",
  "temperatura": 28,
  "max": 30,
  "min": 22,
  "data": "2026-03-31"
}

---

## 🧪 Execução

git clone https://github.com/ArturLLopes/Projeto-HGBrasil-Api.git  
cd Projeto-HGBrasil-Api  
mvn clean install  
mvn spring-boot:run  

---

## 🔄 Versionamento

- Commits semânticos
- Branches organizadas

---



## 👨‍💻 Autor

Artur Lopes

