# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            integer auto_increment not null,
  name                          varchar(255),
  location                      varchar(255),
  email                         varchar(255),
  number                        integer,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists user;

