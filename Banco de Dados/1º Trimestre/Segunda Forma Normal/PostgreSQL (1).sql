CREATE TABLE empregado(
  nome_empregado VARCHAR (50) NOT NULL, 
  idade INT NOT NULL,
  salario DECIMAL (6,2),
  id_empregado serial,
  PRIMARY KEY (id_empregado)
  )
  
  CREATE TABLE empresa(
    cep VARCHAR(8) NOT NULL,
    CNPJ VARCHAR (14) NOT NULL,
    patrimonio DECIMAL (11,2) NOT NULL,
    horas_semanais TIME NOT NULL,
    tipo VARCHAR (50) NOT NULL,
    endereco_empresa VARCHAR (200) NOT NULL,
    id_empresa serial,
    PRIMARY KEY (id_empresa)
    )
    
    CREATE TABLE empresa_empregado(
      id_empregado serial,
      id_empresa serial,
      foreign key (id_empregado)
      REFERENCES empregado(id_empregado),
      FOREIGN KEY (id_empresa)
      REFERENCES empresa(id_empresa)
      )
      
    
    
    