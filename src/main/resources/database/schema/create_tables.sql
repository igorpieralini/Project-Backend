CREATE TABLE IF NOT EXISTS funcionario (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    cargo VARCHAR(255),
    email VARCHAR(255),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS usuario (
      id BIGINT NOT NULL AUTO_INCREMENT,
      email VARCHAR(255),
      senha VARCHAR(255),
      PRIMARY KEY(id)
  );
