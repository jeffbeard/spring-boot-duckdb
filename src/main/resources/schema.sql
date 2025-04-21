CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO users (id, name, email) VALUES (1, 'John Doe', 'john.doe@example.com');
INSERT INTO users (id, name, email) VALUES (2, 'Jane Smith', 'jane.smith@example.com');