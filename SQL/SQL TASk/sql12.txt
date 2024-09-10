/* Create table about the people and what they do here */
CREATE TABLE movies
    (id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT,
    year INTEGER, 
    baget INTEGER,
    production TEXT);

insert into movies (title, year, baget, production) values ("Bahubali 2",2017, 350, "Arka Media Works");

insert into movies (title, year, baget, production) values ("Bahubali 1",2015, 250, "Arka Media Works");


insert into movies (title, year, baget, production) values ("Vakeel saab",2021, 90, "Sri Venkateswara Creations");

insert into movies (title, year, baget, production) values ("Khaidi No 150",2017, 50, "Konidela Production Company");

insert into movies (title, year, baget, production) values ("ala vaikunthapurramuloo",2020, 120, "Geetha Arts & Haarika & Hassine Creation");

insert into movies (title, year, baget, production) values ("sarileru neekevvaru",2020, 75, "Sri Venkateswara Creations");


insert into movies (title, year, baget, production) values ("F2",2019, 70, "Sri Venkateswara Creations");



insert into movies (title, year, baget, production) values ("sahho",2019, 250, "UV Creations");

insert into movies (title, year, baget, production) values ("Attarintiki Dared",2013, 75, "Sri Venkateswara Cine Chitra");


insert into movies (title, year, baget, production) values ("Gabbar Singh",2012, 65, "Parameswara Art");

insert into movies (title, year, baget, production) values ("Magadheera",2009, 35, "Geetha Arts ");

insert into movies (title, year, baget, production) values ("Rangasthalam",2018, 60, "Mythri Movie Makers");

insert into movies (title, year, baget, production) values ("Janatha Garage",2016, 105, "Mythri Movie Makers ");

insert into movies (title, year, baget, production) values ("Bharat Ane Nenu",2018, 65, "DVV creation ");

insert into movies (title, year, baget, production) values ("agnyaathavaasi",2018, 70, " Haarika & Hassine Creation");

CREATE TABLE movies_collection
    (id1 INTEGER PRIMARY KEY AUTOINCREMENT,
    heroid INTEGER,
    movie_id INTEGER,
    Box_office INTEGER, 
    year INTEGER
    );

insert into movies_collection (movie_id, heroid, Box_office, year) values (1,3,1036,2017);

insert into movies_collection (movie_id, heroid, Box_office, year) values (2,3,536,2015);

insert into movies_collection (movie_id, heroid, Box_office, year) values (3,1,186,2021);

insert into movies_collection (movie_id, heroid, Box_office, year) values (4,4,102,2017);

insert into movies_collection (movie_id, heroid, Box_office, year) values (5,7,536,2020);

insert into movies_collection (movie_id, heroid, Box_office, year) values (6,2,90,2020);

insert into movies_collection (movie_id, heroid, Box_office, year) values (7,8,100,2019);

insert into movies_collection (movie_id, heroid, Box_office, year) values (8,3,260,2019);

insert into movies_collection (movie_id, heroid, Box_office, year) values (9,1,76,2013);

insert into movies_collection (movie_id, heroid, Box_office, year) values (10,1,75,2012);

insert into movies_collection (movie_id, heroid, Box_office, year) values (11,5,60,2009);

insert into movies_collection (movie_id, heroid, Box_office, year) values (12,5,150,2018);

insert into movies_collection (movie_id, heroid, Box_office, year) values (13,6,86,2016);

insert into movies_collection (movie_id, heroid, Box_office, year) values (14,2,90,2018);
insert into movies_collection (movie_id, heroid, Box_office, year) values (15,0,80,2018);

CREATE TABLE hero (
    id_hero INTEGER PRIMARY KEY AUTOINCREMENT,
    Name TEXT,
    Star_title TEXT
    );
insert into hero (Name,Star_title) values ("Pawan kaylan","Power star");

insert into hero (Name,Star_title) values ("Mahesh Babu","Super star");

insert into hero (Name,Star_title) values ("Prabas","Rebal star");

insert into hero (Name,Star_title) values ("Chirajeevi","Mega star");

insert into hero (Name,Star_title) values ("Ram charan","Mega Power star");

insert into hero (Name,Star_title) values ("jr NTR","A1 star");

insert into hero (Name,Star_title) values ("Allu arjun","Icon star");

insert into hero (Name,Star_title) values ("Vekatesh","Victroy");
insert into hero (Name,Star_title) values ("Varun tej","Mega prices");

SELECT movies.title, movies.year, movies.baget , movies_collection.Box_office  
    FROM movies
    LEFT OUTER JOIN movies_collection
    ON movies.id = movies_collection.movie_id;


select hero.Name, hero.Star_title, movies_collection.Box_office
from hero
left outer join movies_collection
on hero.id_hero = movies_collection.heroid;
