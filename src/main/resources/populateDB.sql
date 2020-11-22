--insert product
INSERT INTO public.product(product_name, product_price, company_id) VALUES ('Water',15, 1);
INSERT INTO public.product(product_name, product_price, company_id) VALUES ('Bread',10, 2);
INSERT INTO public.product(product_name, product_price, company_id) VALUES ('Milk',25, 3);

--insert company
INSERT INTO public.company(company_name) VALUES ('Pepsi');
INSERT INTO public.company(company_name) VALUES ('KyivXleb');
INSERT INTO public.company(company_name) VALUES ('Ferma');

--insert role_table
INSERT INTO public.role_table(role_name) VALUES ('Admin');
INSERT INTO public.role_table(role_name) VALUES ('User');

--insert user_table
INSERT INTO public.user_table(user_email, user_password, user_firstname, user_lastname, role_id) VALUES ('vova@gmail.com', '123vova123', 'Vova', 'Vinov', 1);
INSERT INTO public.user_table(user_email, user_password, user_firstname, user_lastname, role_id) VALUES ('oleg@i.ua', 'oleg1234', 'Oleg', 'Ioniuskiu', 2);
INSERT INTO public.user_table(user_email, user_password, user_firstname, user_lastname, role_id) VALUES ('alex@i.ua', 'alex1234', 'Alex', 'Alekhin', 2);
INSERT INTO public.user_table(user_email, user_password, user_firstname, user_lastname, role_id) VALUES ('nadya@i.ua', 'nadya1234', 'Nadya', 'Kolseeva', 2);