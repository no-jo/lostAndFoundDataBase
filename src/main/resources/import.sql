insert into user (login, email, first_name, last_name, activity) values ('carrie', 'bradshw@city.pl', 'Vera', 'Wang', 'ACTIVE');

insert into item (date_lost, date_found, name, description, size, color, material, category, photoURL) values ('2017-07-21', null, 'carr', 'volkswagen', 'BIG', 'pink', 'metal', 'car', null);
insert into item (date_lost, date_found, name, description, size, color, material, category, photoURL) values (null, '2017-08-22', 'handbag', 'pretty handbag left in the bus 144', 'SMALL', 'pink', 'leather', 'fashion', null);
insert into item (date_lost, date_found, name, description, size, color, material, category, photoURL) values ('2017-07-29', null, 'book', 'alice in wonderland 1st edition', 'SMALL', 'light blue', 'paper', 'books', null);
insert into item (date_lost, date_found, name, description, size, color, material, category, photoURL) values (null, '2017-08-21', 'wedding ring', 'inscription forever', 'VERYSMALL', 'gold', 'metal', 'jewelry', null);

insert into request (user_id, item_id, status, user_comment, rating) values (1, 1, 'PENDING', null, null);
