CREATE TABLE livros(
  titulo VARCHAR (50) NOT NULL,
  edicao VARCHAR (50) NOT NULL,
  paginas INT NOT NULL,
  genero VARCHAR (100) NOT NULL,
  autor VARCHAR (50) NOT NULL,
  id_livro INT NOT NULL,
  PRIMARY KEY (id_livro)
  )
      INSERT INTO livros (titulo, edicao,paginas, genero, autor, id_livro)
     VALUES ('Jogos Vorazes', '1', '400', 'Ação', 'Suzanne Collins', '123');
     SELECT * from livros
     
  CREATE TABLE clientes(
    nome VARCHAR (50) NOT NULL,
    CPF VARCHAR (11) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR (11) NOT NULL,
    cidade VARCHAR (200) NOT NULL,
    PRIMARY KEY (cpf)
    )
     
     INSERT INTO clientes (nome, CPF, idade, email, cidade)
     VALUES ('Beatriz', '12345678990', '16', 'b@gmail.com', 'Biguaçu');
     SELECT * FROM clientes
     
    CREATE TABLE edicao(
      ano INT NOT NULL,
      locall VARCHAR (100) NOT NULL,
      PRIMARY KEY (locall)
      )
       INSERT INTO edicao(ano, locall)
       VALUES('2012', 'São Paulo');
       SELECT * FROM edicao
     
      CREATE TABLE genero(
        romance VARCHAR (20) NOT NULL,
        misterio VARCHAR (20) NOT NULL,
        terror VARCHAR (20) NOT NULL,
        biografia VARCHAR (20) NOT NULL,
        aventura VARCHAR (20) NOT NULL,
        genero_id INT NOT NULL, 
        id_livro INT NOT NULL,
        FOREIGN KEY (id_livro) REFERENCES livros(id_livro)
        )
        insert into genero(romance, misterio, terror, biografia, aventura, genero_id, id_livro)
        VALUES ('romance', 'misterio', 'terror', 'biografia', 'aventura', '123456', '123');
        SELECT * FROM genero
        
        CREATE TABLE email(
          nome_usuario VARCHAR (50) NOT NULL,
          senha VARCHAR (50) NOT NULL,
          cpf VARCHAR (11) NOT NULL,
          FOREIGN KEY (cpf) REFERENCES clientes(cpf)
          )
          INSERT INTO email(nome_usuario, senha, cpf)
          VALUES ('amanda', 'avestruz', '12345678990');
          SELECT * FROM email
         
          
          CREATE TABLE endereco(
            rua VARCHAR (50) NOT NULL,
            cidade VARCHAR (50) not NULL,
            numero_casa INT NOT NULL,
            PRIMARY KEY (numero_casa)
            )
            INSERT INTO endereco(rua, cidade, numero_casa)
            VALUES ('Nossa Senhora de Fátima', 'São Pedro', '45');
            SELECT * FROM endereco

    
     
 	 CREATE TABLE empregado(
 	 nome_empregado VARCHAR (50) NOT NULL, 
 	 idade INT NOT NULL,
  	salario DECIMAL (6,2),
  	id_empregado serial,
 	 PRIMARY KEY (id_empregado)
  	)
    INSERT INTO empregado(nome_empregado, idade, salario, id_empregado)
    VALUES ('Alfredo', 35, 2500.00, '53');
    SELECT * FROM empregado
  
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
   
   INSERT INTO empresa(cep, CNPJ, patrimonio, horas_semanais, tipo, endereco_empresa, id_empresa)
    VALUES ('89798', '54678902', 90000.00, '20:30', 'Alimentícia', 'Rua Aparecida,123', '45');
            SELECT * FROM empresa 
            
    CREATE TABLE empresa_empregado(
      id_empregado serial,
      id_empresa serial,
      foreign key (id_empregado)
      REFERENCES empregado(id_empregado),
      FOREIGN KEY (id_empresa)
      REFERENCES empresa(id_empresa)
      )
      
            
      
    
    
    