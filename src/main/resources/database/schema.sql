-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE USERS (id INT NOT NULL, name VARCHAR, password VARCHAR, PRIMARY KEY (id));

-- changeset liquibase:2
INSERT INTO USERS (id, name, password) VALUES (1, 'root', 'root');
COMMIT;