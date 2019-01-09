package oz.uds.procedure;

import java.sql.Connection;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.Properties;
import java.util.Vector;
import java.sql.*;
import java.io.InputStream;

import oz.dm.ConnMgr;
//import oz.util.SortProperties;
//import oz.server.connpool.PoolManager;
import oz.framework.db.PoolManager;

public class CommonRsc {

    private static boolean connFromPool = false;
    private static String alias = null;

    public Connection getConnection(String alias_name){

        String fileName = "conn.properties";
        Properties prop = getPropertiesFromClassPath(fileName);
        
//        System.out.println("prop:"+prop);
        
//        alias = prop.getProperty("alias");
//        String alias_file_path = prop.getProperty("alias_file_path");
        
        System.out.println("alias:"+alias_name);
        
        alias = alias_name;
        
        if(prop == null){
            try{
                connFromPool = true;
                Object[] rtn = oz.server.ResourceManager.getInstance().getPoolManager().getConnectionByAlias(alias_name);
                return (Connection) rtn[0];
            }catch(Exception e){
            	e.printStackTrace();
            	return null;
            }
        }else{
            DriverManager dm = null;
            Connection con = null;
            String jdbcName = (String) prop.getProperty("jdbc");

            try {
                Class.forName(jdbcName.trim());
            }catch (java.lang.ClassNotFoundException e2) {
                System.out.println("Error: ClassNotFoundException in CommonRsc");
            }

            try {
                if (prop.containsKey("url")) {
                    String url = (String) prop.get("url");
                    if (prop.containsKey("user") &&
                        prop.containsKey("password")) {
                        String user = (String) prop.get("user");
                        String pwd = (String) prop.get("password");
                        con = dm.getConnection(url, user, pwd);

                    }else {
                        con = dm.getConnection(url);
                    }
                    
                    //System.out.println("con:"+con);
                    
                    return con;
                    

                    
                }else {
                    System.out.println("Error: Not able to get connection information to DB Server");
                    return null;
                }

            }catch (SQLException e) {
                System.out.println("Error: 3");
                return null;
            }
        	
        }
        	
/*        
        try{
            connFromPool = true;
            Object[] rtn = oz.server.ResourceManager.getInstance().getPoolManager().getConnectionByAlias(alias_name);
            return (Connection) rtn[0];
            /*if (alias != null && alias_file_path != null) {
                //get connection using oz.dm.ConnMgr
                Object[] rtn = new ConnMgr().getConnectionByAlias(alias, alias_file_path);
                return (Connection) rtn[0];

            }else if (alias != null && alias_file_path == null) {
                //get connection from Connection Pool
                connFromPool = true;
                Object[] rtn = oz.server.ResourceManager.getInstance().getPoolManager().getConnectionByAlias(alias);
                return (Connection) rtn[0];

            }else if(prop.containsKey("jdbc")){
                //make connection directly
                DriverManager dm = null;
                Connection con = null;
                String jdbcName = (String) prop.getProperty("jdbc");

                try {
                    Class.forName(jdbcName.trim());
                }catch (java.lang.ClassNotFoundException e2) {
                    System.out.println("Error: ClassNotFoundException in CommonRsc");
                }

                try {
                    if (prop.containsKey("url")) {
                        String url = (String) prop.get("url");
                        if (prop.containsKey("user") &&
                            prop.containsKey("password")) {
                            String user = (String) prop.get("user");
                            String pwd = (String) prop.get("password");
                            con = dm.getConnection(url, user, pwd);

                        }else {
                            con = dm.getConnection(url);
                        }
                        return con;

                    }else {
                        System.out.println("Error: Not able to get connection information to DB Server");
                        return null;
                    }

                }catch (SQLException e) {
                    System.out.println("Error: 3");
                    return null;
                }

            }else{
                System.out.println("ERROR: can not find alias = '" + alias + "' or alias_file_path = '" + alias_file_path + "'");
                return null;
                //ERROR
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
*/        
    }

    public static void freeConnection(Connection con) throws SQLException{
        if(con != null){
        	
        	System.out.println("freecon_alias:"+alias);
        	
            if(alias != null){
                if (connFromPool) {
                    oz.server.ResourceManager.getInstance().getPoolManager().
                        freeConnectionByAlias(alias, con,"");
                }else {
                    new ConnMgr().freeConnectionByAlias(alias, con,"");
                }
            }else{
                con.close();
            }
        }
    }

    private Properties getPropertiesFromClassPath(String fileName){

        try{
            InputStream in = getClass().getResourceAsStream("/" + fileName);
            //System.out.println("Try to get '" + fileName + "' from CLASSPATH...");

            /*
            if (in == null) {
                //ERROR
                System.out.println("Can't find '/" + fileName + "'.");
                return null;
            }
			*/
            if (in != null) {
            	System.out.println(fileName + " is found. loading...");	
                
            	Properties rtn = new Properties();
                
                rtn.load(in);
                return rtn;            	
            }
            
            return null;

        }catch (Exception e) {
            //ERROR
           System.out.println("Can't find '" + fileName + "' in CLASSPATH. " + e.getMessage());
           return null;
       }

    }

}
