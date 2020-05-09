Docker setup
```
docker run --name mysql -v mysql:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=lavish -e MYSQL_PASSWORD=password -e MYSQL_DATABASE=mme -d mysql:latest
```