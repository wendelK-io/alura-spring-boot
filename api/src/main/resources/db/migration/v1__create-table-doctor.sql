create table doctors(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    street varchar(100) not null,
    neighborhood varchar(100) not null,
    number varchar(20) not null,
    city varchar(100) not null,
    state VARCHAR(2) not null,
    zipcode varchar(9) not null,

    primary key(id)

);