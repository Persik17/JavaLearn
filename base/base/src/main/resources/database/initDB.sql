CREATE TABLE IF NOT EXISTS users
(
    id bigint PRIMARY KEY,
    first_name VARCHAR(200),
    last_name VARCHAR(255),
    email VARCHAR(40)
);
CREATE SEQUENCE clients_id_seq START WITH 1 INCREMENT BY 1;
