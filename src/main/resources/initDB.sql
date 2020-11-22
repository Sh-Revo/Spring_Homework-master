create table if not exists company
(
	company_id serial primary key,
	company_name varchar(50)
);
alter table company owner to postgres;

create table if not exists product(
	product_id serial primary key,
	product_name varchar(35),
	product_price int,
	company_id int, 
	foreign key(company_id) references company(company_id)
);
alter table product owner to postgres;

create table if not exists role_table
(
	role_id serial primary key,
	role_name varchar(50)
);
alter table role_table owner to postgres;

create table if not exists user_table
(
	user_id serial primary key,
	user_email varchar(50),
	user_password varchar(20),
	user_firstName varchar(30),
	user_lastName varchar(30),
	role_id int,
	foreign key(role_id) references role_table(role_id)
);
alter table user_table owner to postgres;

