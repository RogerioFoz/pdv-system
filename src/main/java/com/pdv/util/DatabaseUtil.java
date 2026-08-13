package com.pdv.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe utilitária para operações com banco de dados
 */
public class DatabaseUtil {
    
    private static final Logger logger = LoggerFactory.getLogger(DatabaseUtil.class);
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pdv_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    public static void conectar() {
        logger.info("Tentando conectar ao banco de dados...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            logger.info("Driver JDBC carregado com sucesso");
        } catch (ClassNotFoundException e) {
            logger.error("Erro ao carregar driver JDBC", e);
        }
    }
    
    public static String getDbUrl() {
        return DB_URL;
    }
    
    public static String getDbUser() {
        return DB_USER;
    }
    
    public static String getDbPassword() {
        return DB_PASSWORD;
    }
}
