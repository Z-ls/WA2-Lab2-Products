DROP TABLE IF EXISTS products;
CREATE TABLE products
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    price       FLOAT(53)    NOT NULL,
    description VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS profiles;
CREATE TABLE profiles
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name  VARCHAR(20) NOT NULL,
    email      VARCHAR(20) NOT NULL,
    password   VARCHAR(20) NOT NULL,
    salt       VARCHAR(20) NOT NULL
);

INSERT INTO products (name, price, description)
VALUES ('Product 1', 10.00, 'Description 1');
INSERT INTO products (name, price, description)
VALUES ('Product 2', 20.00, 'Description 2');
INSERT INTO products (name, price, description)
VALUES ('Product 3', 30.00, 'Description 3');
INSERT INTO products (name, price, description)
VALUES ('Product 4', 40.00, 'Description 4');
INSERT INTO products (name, price, description)
VALUES ('Product 5', 50.00, 'Description 5');

INSERT INTO profiles (first_name, last_name, email, password, salt)
VALUES ('John', 'Doe', 'Johndoe@gmail.com
', 'password', 'salt');
INSERT INTO profiles (first_name, last_name, email, password, salt)
VALUES ('Jane', 'Doe', 'Janedoe@gmail.com', 'password', 'salt');
