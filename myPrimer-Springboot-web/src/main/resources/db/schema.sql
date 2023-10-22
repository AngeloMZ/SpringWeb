CRETATE TABLE IF NOT EXIST libros(
    id int PRIMARY KEY AUTO_INCREMENT, 
    titulo varchar(100) not null, 
    autor varchar(100) not null, 
    editorial varchar(50) not null, 
    fecha date not null, 
    tematica varchar(50 ) not null
);

create table if not exits usuario(
    id int primary key AUTO_INCREMENT,
    usuario varchar(30) nto null unique, 
    password varchar(30) not null
);