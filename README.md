### Shorthand commands

#### Default

```shell
$ java -jar hazel-cast-cache-0.0.1-SNAPSHOT.jar --server.port=8080 --hazelcast.port=5701
$ java -jar hazel-cast-cache-0.0.1-SNAPSHOT.jar --server.host=8081 --hazelcast.port=5702
```

#### Run with separate MariaDB docker image

- REQUIREMENTS
    - Change spring config to MariaDB

```shell
$ docker run --detach --name some-mariadb -p 3306:3306 --env MARIADB_USER=example-user --env MARIADB_PASSWORD=my_cool_secret --env MARIADB_ROOT_PASSWORD=my-secret-pw  mariadb:latest
$ docker exec -it some-mariadb bash
$ mariadb -u root -p
> my-secret-pw
$mariadb CREATE DATABASE sfnvm;
$mariadb GRANT ALL PRIVILEGES ON sfnvm.* TO 'root'@'localhost';
$mariadb FLUSH PRIVILEGES;
```

#### Run with docker compose

- REQUIREMENTS
    - Change spring config to MariaDB

```shell
$ docker-compose build
$ docker-compose up
```