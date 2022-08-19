# Catalog-Service

## Docker
.env 
```
PORT=8080
DATABASE_URL=jdbc:mysql://host.docker.internal:3306/catalogdb
DATABASE_USERNAME=catalogdb
DATABASE_PASSWORD=catalogdb
```
- `docker build -t catalog-service .`
- running `docker run -p 8002:8080 --env-file ./.env catalog-service`