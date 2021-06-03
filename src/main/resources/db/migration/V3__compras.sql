DROP TABLE IF EXISTS compras;
CREATE TABLE compras
(
    id SERIAL PRIMARY KEY,
    fk_id_cliente INT NOT NULL,
    fk_id_producto INT NOT NULL,
    amount INT NOT NULL,
    buy_date DATE NOT NULL,
    FOREIGN KEY (fk_id_cliente) REFERENCES clientes(id),
    FOREIGN KEY (fk_id_producto) REFERENCES productos(id)
);

INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','2', '3', '2020-02-20');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','5', '2', '2020-02-22');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','6', '1', '2020-03-03');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','8', '2', '2020-03-10');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','1', '2', '2020-03-15');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','2', '3', '2020-03-15');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','3', '1', '2020-03-15');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','10', '2', '2020-04-29');
INSERT INTO compras (fk_id_cliente, fk_id_producto, amount, buy_date ) VALUES ('1','2', '3', '2020-05-03');