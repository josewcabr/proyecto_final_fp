DROP TABLE IF EXISTS clientes;
CREATE TABLE clientes
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    phone VARCHAR NOT NULL
);

INSERT INTO clientes (name, last_name, phone) VALUES ('Jose', 'Cabrera Rojas', '123-4567');
INSERT INTO clientes (name, last_name, phone) VALUES ('Rosa', 'Perez Alba', '121-3141');
INSERT INTO clientes (name, last_name, phone) VALUES ('Alberto', 'Fuentes Gazca', '213-1415');