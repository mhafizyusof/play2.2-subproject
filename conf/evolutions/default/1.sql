# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table accounts (
  id                        bigint auto_increment not null,
  display                   varchar(255),
  emails                    varchar(255),
  is_active                 tinyint(1) default 0,
  constraint pk_accounts primary key (id))
;

create table articles (
  id                        bigint auto_increment not null,
  title                     varchar(255) not null,
  content                   longtext not null,
  category_id               bigint,
  author_id                 bigint,
  created                   datetime,
  published                 datetime,
  constraint pk_articles primary key (id))
;

create table categories (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  display                   varchar(255),
  description               longtext,
  constraint pk_categories primary key (id))
;

alter table articles add constraint fk_articles_category_1 foreign key (category_id) references categories (id) on delete restrict on update restrict;
create index ix_articles_category_1 on articles (category_id);
alter table articles add constraint fk_articles_author_2 foreign key (author_id) references accounts (id) on delete restrict on update restrict;
create index ix_articles_author_2 on articles (author_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table accounts;

drop table articles;

drop table categories;

SET FOREIGN_KEY_CHECKS=1;

