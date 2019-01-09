package oz.uds.procedure;

import oz.uds.*;
import oz.uds.basic.DefaultUserDataStore;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Hashtable;
import java.sql.*;
import oracle.jdbc.driver.OracleTypes;


public class ProcedureUDS extends DefaultUserDataStore{

    Connection con = null;
    CallableStatement cstmt = null;
    String finalCommand;
    Vector param;
    Vector paramName;
    Vector paramType;
    Hashtable ht;

    int refNumOfOutput;
    int numOfOutput;

    static{
        log = true;
        setLogOut_File("udslog.txt");
    }
    protected String getODiv(){
        return "@";
    }
    protected String getPDiv(){
        return ".";
    }
    protected String getQDiv(){
        return ",";
    }

    protected int getType(String p){
        if(p.equals("ARRAY"))
            return java.sql.Types.ARRAY;
        else if(p.equals("BIGINT"))
            return java.sql.Types.BIGINT;
        else if(p.equals("BINARY"))
            return java.sql.Types.BINARY;
        else if(p.equals("BIT"))
            return java.sql.Types.BIT;
        else if(p.equals("BLOB"))
            return java.sql.Types.BLOB;
        else if(p.equals("CHAR"))
            return java.sql.Types.CHAR;
        else if(p.equals("DATE"))
            return java.sql.Types.DATE;
        else if(p.equals("DECIMAL"))
            return java.sql.Types.DECIMAL;
        else if(p.equals("DISTINCT"))
            return java.sql.Types.DISTINCT;
        else if(p.equals("DOUBLE"))
            return java.sql.Types.DOUBLE;
        else if(p.equals("FLOAT"))
            return java.sql.Types.FLOAT;
        else if(p.equals("INTEGER"))
            return java.sql.Types.INTEGER;
        else if(p.equals("JAVA_OBJECT"))
            return java.sql.Types.JAVA_OBJECT;
        else if(p.equals("LONGVARBINARY"))
            return java.sql.Types.LONGVARBINARY;
        else if(p.equals("LONGVARCHAR"))
            return java.sql.Types.LONGVARCHAR;
        else if(p.equals("NULL"))
            return java.sql.Types.NULL;
        else if(p.equals("NUMERIC"))
            return java.sql.Types.NUMERIC;
        else if(p.equals("OTHER"))
            return java.sql.Types.OTHER;
        else if(p.equals("REAL"))
            return java.sql.Types.REAL;
        else if(p.equals("REF"))
            return java.sql.Types.REF;
        else if(p.equals("SMALLINT"))
            return java.sql.Types.SMALLINT;
        else if(p.equals("STRUCT"))
            return java.sql.Types.STRUCT;
        else if(p.equals("TIME"))
            return java.sql.Types.TIME;
        else if(p.equals("TIMESTAMP"))
            return java.sql.Types.TIMESTAMP;
        else if(p.equals("TINYINT"))
            return java.sql.Types.TINYINT;
        else if(p.equals("VARBINARY"))
            return java.sql.Types.VARBINARY;
        else if(p.equals("VARCHAR"))
            return java.sql.Types.VARCHAR;
        else
            return -1;
    }



    public void init() throws OZUserDataStoreException {
        if(log)log("############### init ##################");
/*
        CommonRsc commonRsc = new CommonRsc();
        con = commonRsc.getConnection();
*/
        
        System.out.println("param:"+param);
   
    }

    public void freeResultSet(ResultSet rst) {
    }

    public ResultSet getResultSet(String cmd) throws OZUserDataStoreException{
    	
        int i;
        String	tmp;
        String alias_name = "salesdept";
        //cmd = cmd.trim().toLowerCase();
        cmd = cmd.trim();
        
        //System.out.println("cmd:"+cmd);
        
        //System.out.println(cmd.indexOf("@@"));

        if(cmd.indexOf("@@") > -1){
            alias_name = cmd.substring(0, cmd.indexOf("@@"));
            //cmd = cmd.substring(cmd.indexOf("@") + 1, cmd.length() - cmd.indexOf("@call") - 1);
            cmd = cmd.substring(cmd.indexOf("@@") + 2, cmd.length());
        }

        //System.out.println("alias_name:" + alias_name);
        System.out.println("cmd:" + cmd);        
        
        if(log)log("############### OZ - MAKE DB CONNECTION ##################");
        //System.out.println("con:"+con);
        
        if (con == null) {
	        
        	CommonRsc commonRsc = new CommonRsc();
        	con = commonRsc.getConnection(alias_name);
       
	        if (con == null) {
	        	if (log)
	        		log("con is null");
	        	throw new OZUserDataStoreException("cannot connect to server");
	        }
        }
        
        if(log)log("############### getResultSet ##################");

        if (cmd.substring(0,4).equals("call")){

          param = new Vector();
          paramName = new Vector();
          paramType = new Vector();
          ht = new Hashtable();
          Vector paramNameRe = new Vector();
          Vector paramTypeRe = new Vector();
          ResultSet rs1 = null; // for Common Variable ResultSet
          ResultSet rs2 = null; // for Cursor ResultSet

          boolean[] refFlag = null;
          refNumOfOutput=0;
          numOfOutput=0;

          finalCommand = new String("{");

          try{

              String command = cmd.substring(0, cmd.indexOf("(") + 1);
              finalCommand += command;
              tmp = cmd.substring(cmd.indexOf("(")+1,cmd.lastIndexOf(")"));

              StringTokenizer st = new StringTokenizer(tmp, getQDiv());
              String tm = null;

              while (st.hasMoreTokens()) {
                  tm = (String) st.nextToken().trim();
                  if (tm.substring(0, 1).equals("@")) {
                      param.add(tm.substring(1));
                      finalCommand += "?,";
                  }
                  else
                      finalCommand += tm + ",";
              }

              numOfOutput = param.size();

              refFlag = new boolean[numOfOutput];    // Kind of Output Chk ( RefCursor or Common type Variable)

              for (i = 0; i < numOfOutput; i++) {
                  StringTokenizer pst = new StringTokenizer( (String) param.elementAt(i), getPDiv());
                  paramName.addElement(pst.nextToken().trim());
                  paramType.addElement(pst.nextToken().trim());
              }

              finalCommand = finalCommand.substring(0,finalCommand.length()-1);
              finalCommand += ")}";
              //System.out.println("finalCommand:" +finalCommand);
          }
          catch(Exception e){
              e.printStackTrace();
              if (log)
                  log(e.toString());
              throw new OZUserDataStoreException("Error");
          }

          Vector col = new Vector();
          Vector data = new Vector();

          try {
              if (log)
                  log("finalCommand=" + finalCommand);
              cstmt = con.prepareCall(finalCommand);

              for (i = 1; i <= numOfOutput; i++) { // When paramType is CURSOR.
                  if ( ( (String) paramType.elementAt(i - 1)).equals("CURSOR")) {
                      refNumOfOutput++; //REF CURSOR Type Output Count
                      cstmt.registerOutParameter(i, OracleTypes.CURSOR);
                      refFlag[i - 1] = true;

                  }else { // When paramType isn't CURSOR.
                      cstmt.registerOutParameter(i, getType( (String) paramType.elementAt(i - 1)));
                      refFlag[i - 1] = false;
                  }
              }

              cstmt.execute();

              if ( (numOfOutput - refNumOfOutput) > 0) { //When there is Common VARAIABLE Type Resultset
                  for (i = 1; i <= numOfOutput; i++) {
                      if (refFlag[i - 1] != true) {
                          col.addElement(paramName.elementAt(i - 1));
                          try {
                              if (cstmt.getString(i).equals(null) ||
                                  cstmt.getString(i).length() == 0)
                                  data.addElement(" ");
                              else
                                  data.addElement(cstmt.getString(i));
                          }
                          catch (Exception ex_data) {
                              data.addElement(" ");
                          }
                          paramNameRe.addElement(paramName.elementAt(i - 1));
                          paramTypeRe.addElement(paramType.elementAt(i - 1));
                      }
                  }
                  rs1 = new PrcdResultSet(col, data, paramNameRe, paramTypeRe);
              }

            //[2004.03.xx] by ssofree, cursor type resultset을 미리 member 변수로 담는다.
            if (refNumOfOutput>0){                    //When there is REF CURSOR type Resultset
                for(i=1;i<=numOfOutput;i++){
                   if (refFlag[i-1] == true ){
                      rs2 = (ResultSet)cstmt.getObject(i);
                      ht.put(String.valueOf(i),rs2);
                   }
                }
            }

            /*
            else{
              if (refNumOfOutput>0){                    //When there is REF CURSOR type Resultset
                for(i=1;i<=numOfOutput;i++){
                   if (refFlag[i-1] != false ){
                      rs = (ResultSet)cstmt.getObject(i);
                   }
                }
              }
            }
            */
          }
          catch(Exception e){
            e.printStackTrace();
            throw new OZUserDataStoreException(e.getMessage());
          }
          finally{

/*
        	  close();

        	  try{
                  if(cstmt != null)
                      cstmt.close();
              }
              catch(Exception e){
                  e.printStackTrace();
                  if(log)log(e.toString());
                  throw new OZUserDataStoreException(e.getMessage());
              }
*/              
          }
          return rs1;
        }
//----------------------------------------------------------------------------------------// when function is called
        else if(cmd.substring(0,1).equals("@")){
           return callfunction(cmd);
        }
//-----------------------------------------------------------------------------// when RefCusor is opened
        else{
          ResultSet rs = null;
          StringTokenizer stOpen = new StringTokenizer(cmd, " ");
          String openCmd1 = stOpen.nextToken().trim();
          String openCmd = stOpen.nextToken().trim();
          try{
            if (openCmd1.equals("open")){
            //System.out.println(openCmd1+":"+openCmd);
              if (refNumOfOutput>0){                    //When there is REF CURSOR type Resultset
                /* by ssofree
                cstmt = con.prepareCall(finalCommand);
                for(i=1;i<=numOfOutput;i++){                                 // When paramType is CURSOR.
                   if(((String)paramType.elementAt(i-1)).equals("CURSOR")){
                      cstmt.registerOutParameter(i, OracleTypes.CURSOR);
                   }
                   else{                                                     // When paramType isn't CURSOR.
                      cstmt.registerOutParameter(i, getType((String)paramType.elementAt(i-1)));
                   }
                }
                cstmt.execute();
                */
                for (i=1; i<= numOfOutput; i++){
                  if(openCmd.equals((String)paramName.elementAt(i-1))&&((String)paramType.elementAt(i-1)).equals("CURSOR")){
                      //rs = (ResultSet)cstmt.getObject(i);
                      rs = (ResultSet) ht.get(String.valueOf(i));
                  }
                }
              }
            }
            return rs;
          }
          catch(Exception e){
            e.printStackTrace();
            throw new OZUserDataStoreException("Error   " + e.getMessage());
          }
        }
    }

    protected ResultSet callfunction(String fcmd) throws OZUserDataStoreException{

       StringTokenizer st = new StringTokenizer(fcmd, getODiv());
       Vector param = new Vector();
       Vector paramName = new Vector();
       Vector paramType = new Vector();
       String finalCommand = new String("{?");

       try{
          param.add(st.nextToken().trim());

          String command = ((String)st.nextToken().trim());
          finalCommand += command;
          finalCommand += "}";

          StringTokenizer pst = new StringTokenizer((String) param.elementAt(0), getPDiv());
          paramName.add(pst.nextToken().trim());
          paramType.add(pst.nextToken().trim());
       }
       catch(Exception e){
            e.printStackTrace();
            throw new OZUserDataStoreException("Error   " + e.getMessage());
       }

       //CallableStatement cstmt = null;
       Vector col = new Vector();
       Vector data = new Vector();
       ResultSet rstf;

       try{
         if(log)log(finalCommand);
         cstmt = con.prepareCall(finalCommand);

         if(((String)paramType.elementAt(0)).equals("CURSOR")){
           cstmt.registerOutParameter(1, OracleTypes.CURSOR);
           cstmt.executeQuery();
           rstf = (ResultSet)cstmt.getObject(1);
           return rstf;
         }
         else{   // When paramType isn't CURSOR.
           cstmt.registerOutParameter(1, getType((String) paramType.elementAt(0)));
           cstmt.executeQuery();
           col.addElement(paramName.elementAt(0));
           data.addElement(cstmt.getString(1));
         }
       }
       catch(Exception e){
           if(log)log("Error1: " + e);
           throw new OZUserDataStoreException(e.getMessage());
       }
       finally{
/*
    	   close();    	   
    	   
           try{
               if(cstmt != null)
                   cstmt.close();
           }
           catch(Exception e){
               if(log)log("Error2: " + e);
           }
*/           
       }
       rstf = new PrcdResultSet(col, data, paramName, paramType);
       return rstf;
    }

    public Object getRawData(String command) throws OZUserDataStoreException{
        return null;
    }

    public void close(){
        if(log)log("############### close ##################");
/*
        if(con != null)
            try {
                con.close();
            } catch (java.sql.SQLException se) {
            // error message
                if(log)log("error occured in closing connection");
            }
*/            
        System.out.println("### Close ###");
        try{
            if (cstmt != null) {
                cstmt.close();
                //System.out.println("close");
            }
        }catch(SQLException e){
            // error message
            if (log)
                log("error occured in closing statement");
        }
        if(con != null)
            try {
                CommonRsc.freeConnection(con);
            }catch (java.sql.SQLException se) {
                // error message
                if (log)
                    log("error occured in closing connection");
            }
           
    }
}
