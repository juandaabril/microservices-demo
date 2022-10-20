# microservice-demo (work in progress)
A simple example of microservices based in the [eShopOnContainers](https://github.com/dotnet-architecture/eShopOnContainers) project.

## General Architecture


## Hexagonal Architecture


## Services
|Service|Status|Stack|
|-----|-----|-----|
|[api-gateway](src/api-gateway)|[![api-gateway](https://github.com/juandaabril/microservices-demo/actions/workflows/api-gateway.yml/badge.svg)](https://github.com/juandaabril/microservices-demo/actions/workflows/api-gateway.yml)|Java/SpringBoot|
|[basket-service](src/basket-service)|x|Typescript/Node/mongodb|
|[catalog-service](src/catalog-service)|[![catalog-service](https://github.com/juandaabril/microservices-demo/actions/workflows/catalog-service.yml/badge.svg)](https://github.com/juandaabril/microservices-demo/actions/workflows/catalog-service.yml)|Java/SpringBoot/Postgresql|
|[user-service](src/user-service)|x|Java/SpringBoot/Webflux/Postgresql|
|[ordering-service](src/ordering-service)|x|Go/Postgresql|

## Kubernetes deployment


## Docker deployment
