DROP TABLE IF EXISTS productos;
CREATE TABLE productos
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR NOT NULL,
    wear_type VARCHAR,
    price INTEGER NOT NULL
);