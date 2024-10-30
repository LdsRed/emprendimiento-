use joyas;


create table producto (
id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre varchar(40) NOT NULL,
descripcion varchar(100) NOT NULL,
precio decimal NOT NULL,
stock boolean NOT NULL,
cantidad int NOT NULL,
categoria varchar(40) NOT NULL
);


create table usuario(
id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre varchar(40) NOT NULL,
email varchar(40) NOT NULL,
direccion varchar(40) NOT NULL,
rol enum('usuario','admin')
);


create table pedido(
id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
usuarioID int,
fecha DATE NOT NULL, 
total DECIMAL(10, 2) NOT NULL,
FOREIGN KEY (usuarioID) REFERENCES usuario(id) ON DELETE CASCADE ON UPDATE CASCADE
);

create table detalle_pedido (
id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
pedido_id int,
producto_id int, 
cantidad int NOT NULL,
precio_unitario DECIMAL(10, 2) NOT NULL,
FOREIGN KEY (pedido_id) REFERENCES pedido(id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (producto_id) REFERENCES producto(id) ON DELETE RESTRICT ON UPDATE CASCADE
);
