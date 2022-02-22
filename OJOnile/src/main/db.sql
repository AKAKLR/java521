
create database if not exists oj_database;

use oj_database;

drop table if exists oj_table;
create table oj_table (
    id int primary key auto_increment,
    title varchar(50),
    level varchar(50),
    description varchar(4096),
    templateCode varchar(4096),
    testCode varchar(4096)
);