FROM mysql:5.7.15

MAINTAINER me

ENV MYSQL_DATABASE=item \
    MYSQL_ROOT_PASSWORD=root

ADD item.sql /docker-entrypoint-initdb.d

EXPOSE 3306