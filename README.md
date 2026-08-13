# PDV - Sistema de Ponto de Venda

## Descrição
Sistema de Ponto de Venda (PDV) desenvolvido em Java 11, com arquitetura modular e preparado para integração com banco de dados.

## Requisitos
- Java 11 JDK (x86)
- Maven 3.6+
- MySQL 5.7+ (para persistência de dados)

## Estrutura do Projeto

```
com.pdv/
├── pom.xml                           # Configuração Maven
├── README.md                         # Este arquivo
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/pdv/
│   │   │       ├── Main.java         # Classe principal
│   │   │       ├── model/            # Modelos de dados
│   │   │       │   ├── Produto.java
│   │   │       │   ├── Venda.java
│   │   │       │   └── ItemVenda.java
│   │   │       └── util/             # Utilitários
│   │   │           └── DatabaseUtil.java
│   │   └── resources/
│   │       └── logback.xml           # Configuração de logging
│   └── test/
│       └── java/
│           └── com/pdv/model/
│               └── ProdutoTest.java
└── logs/                             # Diretório de logs
```

## Configuração

### 1. Clonar ou extrair o projeto
```bash
cd d:\FontesJava\PDV\com.pdv
```

### 2. Instalar dependências
```bash
mvn clean install
```

### 3. Compilar o projeto
```bash
mvn compile
```

### 4. Executar testes
```bash
mvn test
```

### 5. Executar a aplicação
```bash
mvn exec:java -Dexec.mainClass="com.pdv.Main"
```

### 6. Criar JAR executável
```bash
mvn package
java -jar target/pdv-system-1.0.0-jar-with-dependencies.jar
```

## Configuração do Banco de Dados

Para usar o banco de dados, edite o arquivo `src/main/java/com/pdv/util/DatabaseUtil.java`:

```java
private static final String DB_URL = "jdbc:mysql://localhost:3306/pdv_db";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "sua_senha";
```

## Arquitetura

- **Model**: Classes de domínio (Produto, Venda, ItemVenda)
- **Util**: Classes utilitárias (DatabaseUtil)
- **Main**: Classe de inicialização

## Dependências Principais

- **SLF4J + Logback**: Logging
- **MySQL Connector**: Conectividade com banco de dados
- **JUnit**: Framework de testes

## Próximos Passos

- [ ] Implementar camada de acesso a dados (DAO)
- [ ] Criar serviços de negócio
- [ ] Desenvolver interface gráfica (Swing ou JavaFX)
- [ ] Implementar relatórios
- [ ] Adicionar validações

## Autor
PDV System v1.0.0

## Licença
MIT
