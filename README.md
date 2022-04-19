### Shorthand commands

```shell
$ docker run --detach --name some-mariadb -p 3306:3306 --env MARIADB_USER=example-user --env MARIADB_PASSWORD=my_cool_secret --env MARIADB_ROOT_PASSWORD=my-secret-pw  mariadb:latest
$ docker exec -it some-mariadb bash
$ mariadb -u root -p
> my-secret-pw
$mariadb CREATE DATABASE sfnvm;
$mariadb GRANT ALL PRIVILEGES ON sfnvm.* TO 'root'@'localhost';
$mariadb FLUSH PRIVILEGES;
```