insert into user (login, email, first_name, last_name, activity) values ('carrie', 'bradshw@city.pl', 'Vera', 'Wang', 'ACTIVE');
insert into user (login, email, first_name, last_name, activity) values ('beatles', 'the@beatles.mu', 'John', 'Lennon', 'ACTIVE');
insert into user (login, email, first_name, last_name, activity) values ('exlog', 'example@email.com', 'John', 'Doe', 'ACTIVE');
insert into user (login, email, first_name, last_name, activity) values ('gringo', 'boso@swiat.io', 'Wojciech', 'Cejrowski', 'INACTIVE');

insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values ('2017-07-21', null, 'carr', 'volkswagen', 'BIG', 'pink', 'metal', 'car', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values (null, '2017-08-22', 'handbag', 'pretty handbag left in the bus 144', 'SMALL', 'pink', 'leather', 'fashion', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values ('2017-07-29', null, 'book', 'alice in wonderland 1st edition', 'SMALL', 'light blue', 'paper', 'books', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values (null, '2017-08-21', 'wedding ring', 'inscription forever', 'VERYSMALL', 'gold', 'metal', 'jewelry', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values (null, '2017-09-01', 'buff', 'original lady buff', 'SMALL', 'yellow', 'merino wool', 'clothing', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values ('2017-09-07', null, 'snorkelling mask', 'mask and tube', 'MEDIUM', 'transaprent, blue', 'plastic', 'sports gear', null, 'ACTIVE');
insert into item (lost_date, found_date, name, description, size, color, material, category, photoURL, is_active) values (null, '2017-09-07', 'hat', 'ugly fedora', 'MEDIUM', 'black', 'unknown', 'accessories', null, 'ACTIVE');

insert into request (user_id, item_id, status, user_comment, rating) values (1, 2, 'ACCEPTED', null, 4);
insert into request (user_id, item_id, status, user_comment, rating) values (1, 4, 'INACTIVE', null, null);
insert into request (user_id, item_id, status, user_comment, rating) values (2, 4, 'PENDING', null, null);
insert into request (user_id, item_id, status, user_comment, rating) values (2, 5, 'PENDING', null, null);
insert into request (user_id, item_id, status, user_comment, rating) values (2, 7, 'PENDING', null, null);
insert into request (user_id, item_id, status, user_comment, rating) values (3, 5, 'PENDING', null, null);
