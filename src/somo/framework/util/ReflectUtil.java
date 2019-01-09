package somo.framework.util;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.lang.reflect.*;
import javax.servlet.http.*;
import oracle.jdbc.driver.*;

import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.prop.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 *  자바 리플렉션을 이용하여 다양한 데이터의 변환,추출 작업을 위한 유틸리티 메소드를 제공한다.
 *  상속을 허락하지 않고, static 타입의 메소드를 가진다.
 */
public final class ReflectUtil{

  /**
   * DM --> 0, or null
   * input Parameter인 DataModel과 VO의 Member Value를 초기화 한다.
   * Class A extend AbstractDM {
   *      String      ID;
   *      String      Name;
   *      Integer     Order;
   *  }   --> ID, Name, Order값을 초기화 한다.
   * @param   Object dm Instance
   * @return  none
   */
  public static void initDataModel(Object dm){
    String typeName = null;
    java.lang.reflect.Field[] names = null;

    try{
      names = dm.getClass().getFields();
      for(int i = 0; i < names.length; i++){
        typeName = names[i].getType().getName();
        if(typeName.equals("java.lang.String")){
          names[i].set(dm, "");
        } else if(typeName.equals("java.lang.Double")){
          names[i].set(dm, new Double(0));
        } else if(typeName.equals("java.lang.Long")){
          names[i].set(dm, new Long(0));
        } else if(typeName.equals("java.lang.Integer")){
          names[i].set(dm, new Integer(0));
        }
      } // end for
    } catch(IllegalAccessException e){
      SysException se = new SysException(e);
      LogManager.getInstance().log(se);
      throw se;
    }

  }

  /**
   * Request --> DM
   * Request Parameter의 Value를 DataModel(VO)를 찾아서 Assign한다.
   *
   * @param   iHttpServletRequest ireq Request Instance,
   * @param   Object dm instance
   * @return  Request Parameter의 Value를 dm의 Member변수이름과
   *                   같은 것을 찾아 자동 Assign한다.
   */
  public static void setDMFromReq(HttpServletRequest ireq, Object dm){
    String strTypeName = null;
    String temp[] = null;
    String reqStr = null;
    String reqValue = null;
    Double d = null;

    java.lang.reflect.Field[] targetF = null;

    try{
      initDataModel(dm);
      targetF = dm.getClass().getDeclaredFields();

      for(int i = 0; i < targetF.length; i++){
        //DataModel의 Member변수명을 가지고 온다.
        reqStr = targetF[i].getName();

        reqValue = ireq.getParameter(reqStr);
        // 해당 Member변수명의 Parameter값을 가지고 온다.
        if(!reqValue.equals("")){
          // 같은이름의 Parameter Name의 값이 있는가?
          temp = ireq.getParameterValues(reqStr);
          if(temp.length > 1){
            reqValue = "";
            for(int j = 0; j < temp.length; j++){
              reqValue = reqValue + "$" + temp[i];
            }
          }

          strTypeName = targetF[i].getType().getName();
          if(strTypeName.equals("java.lang.String")){
            targetF[i].set(dm, reqValue);
          } else{
            d = new Double(Integer.parseInt(reqValue));
            if(strTypeName.equals("java.lang.Double")){
              targetF[i].set(dm, d);
            } else if(strTypeName.equals("java.lang.Long")){
              targetF[i].set(dm, new Long(d.longValue()));
            } else if(strTypeName.equals("java.lang.Integer")){
              targetF[i].set(dm, new Integer(d.intValue()));
            }
          } // end if
        }
      } // outer for
    } catch(IllegalAccessException e){
      e.printStackTrace();
    }
  }

  /**
   * Request --> DMs
   * Request Parameter의 Value가 여러개 일경우  각 DataModel에 값을 넣는다.
   * @param   iHttpServletRequest ireq : Request Instance
   * @param   Object[] dm : dm의 Array
   * @return  Request Parameter의 Value를 dm의 Member변수이름과
   *            같은 것을 찾아 자동 Assign한다.
   */
  public static void setDMsFromReq(HttpServletRequest ireq, Object[] dms){
    String typeName = null;
    String temp[] = null;
    String reqStr = null;
    String reqValue = null;
    String strTypeName = null;
    Double d = null;

    java.lang.reflect.Field[] targetF = null;

    try{
      // DM의 Length별로 작업을 한다.
      for(int i = 0; i < dms.length; i++){
        //특정 DataModel을 가지고 온다.
        targetF = dms[i].getClass().getDeclaredFields();
        for(int j = 0; j < targetF.length; j++){
          //DataModel의 Member변수명을 가지고 온다.
          reqStr = targetF[j].getName();
          // 해당 Member변수명의 Parameter값을 가지고 온다.
          if(ireq.getParameterValues(reqStr).length <= 1){
            reqValue = ireq.getParameter(reqStr);
          } else{
            temp = ireq.getParameterValues(reqStr);
            // 없으면 ""로 Setting을 한다.
            reqValue = temp[i];
          }
          strTypeName = targetF[j].getType().getName();
          if(strTypeName.equals("java.lang.String")){
            targetF[j].set(dms[i], reqValue);
          } else{
            d = new Double(Integer.parseInt(reqValue));
            if(strTypeName.equals("java.lang.Double")){
              targetF[j].set(dms[i], d);
            } else if(strTypeName.equals("java.lang.Long")){
              targetF[j].set(dms[i], new Long(d.longValue()));
            } else if(strTypeName.equals("java.lang.Integer")){
              targetF[j].set(dms[i], new Integer(d.intValue()));
            }
          } // end if
        } // innder for

      } // outer for
    } catch(IllegalAccessException e){
      e.printStackTrace();
    }
  }

  /**
   * Properties --> PreparedStatement Parameter (?)
   * Prepared Statement에서 '?'로 치환하는  인자값을 셋팅한다.
   * @param pt	(Properties)
   * @return N/A
   */
  public static void setPStmtParam(Properties pt, PreparedStatement pStmt){
    //Properties의 값을 분해하여 넣는다.
    Enumeration enum1 = pt.propertyNames();
    String strKey = new String();
    String strIndexKey = new String();
    String strKeyValue = new String();
    String strPosition = new String();

    int index;

    /*
     * Properties를 Enum하여 순차적으로 prepared statement의 '?'를
     * 셋팅하여 준다. 현재 int와 String만 셋팅이 되어 있으므로 향 후 더
     * 늘어날 경우 계속 추가하면 될것임.
     * (Value.Type)
     * pt.setProperty("1.CHAR.IN","TEST");
     */
    while(enum1.hasMoreElements()){
      strKey = (String)enum1.nextElement(); //Keyname을 얻어온다.
      strKeyValue = pt.getProperty(strKey); //KeyValue를 얻어온다.
      index = strKey.indexOf("."); //얻어온 KeyName에서 '.'를 찾는다.
      strPosition = strKey.substring(0, index); //Keyname에서 '.'이전의 값을 찾는다.
      strIndexKey = strKey.substring(index + 1, strKey.length()); //keyname에서 '.'이후의 값을 찾는다.
      strIndexKey.toUpperCase(); //"모든 문자를 대문자로 치환한다.

      try{
        if(strIndexKey.equals("INT")){ // Int값을 셋팅한다.
          double val;
          if(strKeyValue.equals("")){
            val = 0;
          } else{
            val = Double.parseDouble(strKeyValue);
          }
          pStmt.setDouble(Integer.parseInt(strPosition), val);
        } else if(strIndexKey.equals("CHAR") || //String Value값을 셋팅한다.
                  strIndexKey.equals("VARCHAR2") ||
                  strIndexKey.equals("VARCHAR")){
          pStmt.setString(Integer.parseInt(strPosition), strKeyValue);
        }
      } catch(SQLException e){
        throw new SysException(e);
      }
    }
  }

  /**
   * DM --> CallableStatement Parameter (?) for ORACLE
   * Stored Procedure의 input parameter 값을 Setting한다.
   * @param   rs        : Column의 정보를 가지고 있는 ResultSet
   * @param   dm : dm(VO)의 Instance
   * @return  callableStatement의 값을 Setting한다.
   *
   */
  public static Properties setOracleProcParam(Object dm,
                                              CallableStatement cStmt,
                                              ResultSet rs){
    int index;
    int position = 1; // MSSQL은 Return Parameter가 Default로 생성되고 ORACLE은 없다.

    int columnDataType;
    int columnInOutType;

    // out put Parameter를 가지고 오기 위한 부분
    // pt . KEY     -> targetF의 Column명을 가지고 있는 멤버변수의 위치
    // pt . Value   -> Stored Procedure의 Parameter Position
    Properties pt = new Properties();
    Double d = new Double(0);
    Long l = new Long(0);
    Integer n = new Integer(0);

    String columnName = "";
    String columnFullName = "";
    String columnValue = "";
    String columnType = "";

    try{
      // 저장되어진 Stored Procedure의 Column 속성을 가지고 온다.
      while(rs.next()){
        columnFullName = rs.getString("COLUMN_NAME");
        index = columnFullName.indexOf("_");
        columnName = columnFullName.substring(index + 1,
                                              columnFullName.length());
        columnInOutType = rs.getInt("COLUMN_TYPE");
        columnDataType = rs.getInt("DATA_TYPE");
        columnValue = "";
        // MSSQL은 Position의 0이 RETURN VALUE가 Default로 잡힌다.
        if(position > 0){
          String strPosition = Integer.toString(position);
          java.lang.reflect.Field obj = dm.getClass().getField(
              columnName.toLowerCase());

          switch(columnDataType){
            case Types.VARCHAR:
            case Types.CHAR:
              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                cStmt.setString(position,
                                (String)obj.get(dm));
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "VARCHAR/CHAR ";
              break;
            case Types.DOUBLE:
            case Types.REAL:
            case Types.FLOAT:
            case Types.DECIMAL:
            case Types.NUMERIC:

              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                if(obj.getType().getName().equals(
                    "java.lang.Double")){
                  d = (Double)obj.get(dm);
                  cStmt.setDouble(position, d.doubleValue());
                } else if(obj.getType().getName().equals(
                    "java.lang.Long")){
                  l = (Long)obj.get(dm);
                  cStmt.setDouble(position, l.doubleValue());
                } else if(obj.getType().getName().equals(
                    "java.lang.Integer")){
                  n = (Integer)obj.get(dm);
                  cStmt.setDouble(position, n.doubleValue());
                }
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "NUMERIC.DOUBLE,REAL,FLOAT ";
              break;
            case Types.BIGINT:
            case Types.SMALLINT:
            case Types.TINYINT:
            case Types.INTEGER:
              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                n = (Integer)obj.get(dm);
                cStmt.setInt(position, n.intValue()); ;
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "SMALLINT,TINYINT,INTEGER";
              break;

            default:
              cStmt.registerOutParameter(position,
                                         OracleTypes.CURSOR);
              // .C --> CURSOR를 뜻한다.
              pt.setProperty(columnName + ".C", strPosition);
              columnType = "Default Unknown Data Type";
              break;
          } // switch
        } // end if

        position = position + 1;
      } // end while

    } catch(IllegalAccessException ie){
      ie.printStackTrace();
      throw new SysException(ie);
    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    } catch(NoSuchFieldException e){
      e.printStackTrace();
      throw new SysException(e);
    } finally{
      return pt;
    }
  }

  /**
   * DM --> CallableStatement Parameter (?) for MSSQL
   * Stored Procedure의 input parameter 값을 Setting한다.
   * @param   rs        : Column의 정보를 가지고 있는 ResultSet
   * @param   dm : dm(VO)의 Instance
   * @return  callableStatement의 값을 Setting한다.
   *
   */
  public static Properties setMssqlProcParam(Object dm,
                                         CallableStatement cStmt, ResultSet rs){
    int index;
    int position = 0; // MSSQL은 Return Parameter가 Default로 생성되고 ORACLE은 없다.

    int columnDataType;
    int columnInOutType;

    // out put Parameter를 가지고 오기 위한 부분
    // pt . KEY     -> targetF의 Column명을 가지고 있는 멤버변수의 위치
    // pt . Value   -> Stored Procedure의 Parameter Position
    Properties pt = new Properties();
    Double d = new Double(0);
    Long l = new Long(0);
    Integer n = new Integer(0);

    String columnName = "";
    String columnFullName = "";
    String columnValue = "";
    String columnType = "";

    try{
      // 저장되어진 Stored Procedure의 Column 속성을 가지고 온다.
      while(rs.next()){
        columnFullName = rs.getString("COLUMN_NAME");
        index = columnFullName.indexOf("_");
        columnName = columnFullName.substring(index + 1,
                                              columnFullName.length());
        columnInOutType = rs.getInt("COLUMN_TYPE");
        columnDataType = rs.getInt("DATA_TYPE");
        columnValue = "";
        // MSSQL은 Position의 0이 RETURN VALUE가 Default로 잡힌다.
        if(position > 0){
          String strPosition = Integer.toString(position);
          java.lang.reflect.Field obj = dm.getClass().getField(
              columnName.toLowerCase());

          switch(columnDataType){
            case Types.VARCHAR:
            case Types.CHAR:
              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                cStmt.setString(position,
                                (String)obj.get(dm));
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "VARCHAR/CHAR ";
              break;
            case Types.DOUBLE:
            case Types.REAL:
            case Types.FLOAT:
            case Types.DECIMAL:
            case Types.NUMERIC:

              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                if(obj.getType().getName().equals(
                    "java.lang.Double")){
                  d = (Double)obj.get(dm);
                  cStmt.setDouble(position, d.doubleValue());
                } else if(obj.getType().getName().equals(
                    "java.lang.Long")){
                  l = (Long)obj.get(dm);
                  cStmt.setDouble(position, l.doubleValue());
                } else if(obj.getType().getName().equals(
                    "java.lang.Integer")){
                  n = (Integer)obj.get(dm);
                  cStmt.setDouble(position, n.doubleValue());
                }
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "NUMERIC.DOUBLE,REAL,FLOAT ";
              break;
            case Types.BIGINT:
            case Types.SMALLINT:
            case Types.TINYINT:
            case Types.INTEGER:
              if(columnInOutType ==
                 java.sql.DatabaseMetaData.procedureColumnIn){
                n = (Integer)obj.get(dm);
                cStmt.setInt(position, n.intValue()); ;
              } else{
                cStmt.registerOutParameter(position,
                                           columnDataType);
                pt.setProperty(columnName, strPosition);
              }
              columnType = "SMALLINT,TINYINT,INTEGER";
              break;

            default:
              cStmt.registerOutParameter(position,
                                         OracleTypes.CURSOR);
              // .C --> CURSOR를 뜻한다.
              pt.setProperty(columnName + ".C", strPosition);
              columnType = "Default Unknown Data Type";
              break;
          } // switch
        } // end if

        position = position + 1;
      } // end while

    } catch(IllegalAccessException ie){
      ie.printStackTrace();
      throw new SysException(ie);
    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    } catch(NoSuchFieldException e){
      e.printStackTrace();
      throw new SysException(e);
    } finally{
      return pt;
    }
  }

  /**
   * Properties 객체를 이용하여 key 정보를 얻고 이를 이용하여 ResultSet, CallableStatement 객체로부터 DM 객체에 OUT 타입의 값을 설정한다.
   * @param pt KEY 정보를 포함한 Propertis 객체
   * @param dm 값이 설정될 DM 타입 객체
   * @param rs DB Access 결과정보를 포함한 ResultSet 객체
   * @param cStmt DB Access를 수행한 CallableStatement 객체
   */
  public static void setOutputParam(Properties pt, Object dm,
                                    ResultSet rs, CallableStatement cStmt){
    String strKey = ""; // 예 "COLUMNNAME", "COLUMNNAME.C",....
    String strCursor = "";
    String strKeyValue = "";
    String temp = "";

    int intKey;
    int index;
    java.lang.reflect.Field targetF = null;
    Double d = null;

    Enumeration enum1 = pt.propertyNames();

    try{
      while(enum1.hasMoreElements()){
        strKey = (String)enum1.nextElement(); //Keyname을 얻어온다.
        index = strKey.indexOf(".");
        if(index > 0){
          strCursor = strKey.substring(index + 1, strKey.length());
          //strKey      = strKey.substring(0,index);
        } else{
          strCursor = "";
        }
        strKeyValue = pt.getProperty(strKey); //KeyValue를 얻어온다.
        if(strCursor.equals("C")){
         // rs = (ResultSet)((weblogic.jdbc.rmi.SerialCallableStatement)cStmt).getCursor(Integer.parseInt(strKeyValue));
          rs = (ResultSet) ((OracleCallableStatement)cStmt).getCursor(Integer.parseInt(strKeyValue));
          //m_result = new DBResultSet(rs);
        } else{
          // Numeric일 경우 cStmt.getDouble로 데이터를 가지고 오고 VO의 DataType에 맞게
          // 변환을 시킨다.
          targetF = dm.getClass().getField(strKey.toLowerCase());
          if(targetF.getType().getName().equals("java.lang.String")){
            temp = cStmt.getString(Integer.parseInt(strKeyValue));
            if(temp == null)
              temp = "";
            targetF.set(dm, temp);
          } else{
            d = new Double(cStmt.getDouble(Integer.parseInt(
                strKeyValue)));
            if(targetF.getType().getName().equals(
                "java.lang.Double")){
              targetF.set(dm, d);
            } else if(targetF.getType().getName().equals(
                "java.lang.Long")){

              targetF.set(dm, new Long(d.longValue()));
            } else if(targetF.getType().getName().equals(
                "java.lang.Integer")){
              targetF.set(dm, new Integer(d.intValue()));
            }
          }
        }
      } // while

    } catch(IllegalAccessException ie){
      ie.printStackTrace();
      throw new SysException(ie);
    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    } catch(NoSuchFieldException e){
      e.printStackTrace();
      throw new SysException(e);
    }
  }



  /**
   * ResultSet --> VO
   * ResultSet의 데이터를 vo 객체로 변환한다.
   * Single Row일 경우 해당 한다.
   * @param   Object vo : Single Row를 가지고올 Value Object의 Instance
   * @return  none
   */
  public static void setVOFromRS(ResultSet rs, Object vo) throws Exception{

    if(rs == null){
      return;
    }

    ResultSetMetaData rsmd = rs.getMetaData();

    if(rsmd == null){
      return;
    }

    int colPos = 1; //칼럼 타입을 파악할 컬럼 위치
    int nType = 0; //칼럼 타입
    String strColName = ""; //칼럼 명
    int ColumnCnt = 0;
    Field targetF = null;

    try{
      ColumnCnt = rsmd.getColumnCount();
      if(rs.next()){
        //1. 레코드내의 칼럼갯수 만큼 순환.
        for(colPos = 1; colPos <= ColumnCnt; colPos++){
          nType = rsmd.getColumnType(colPos);
          strColName = rsmd.getColumnName(colPos).toLowerCase();
          try{
            targetF = vo.getClass().getField(strColName);
            setData(targetF, nType, rs, colPos, vo);
          } catch(NoSuchFieldException e){
            e.printStackTrace();
            throw new SysException(e);
          }

        } //for - 칼럼갯수만큼 순환

      } //end if
      return;
    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    }
  }

  /**내부 사용 메소드
   * ResultSet 특정 레코드의 각 Column 값을 vo의 동일한 이름의 변수에 저장한다.
   * ResultSet에서 scolPos에서 찾아 targetF에 저장을 한다.
   * (예)  ResultSet의 scolPos에 있는 자료를 Set한다
   *
   * @param 	tragetF  SQL문에 대한 결과를 담기위한 VO의 멤버 변수
   * @param 	rs       SQL문에 대한 결과를 담고 있는 ResultSet
   * @param 	scolPos  하나의 행에서 rs의 Column을 가지고올 위치
   * @param 	dm       SQL문에 대한 결과를 담기위한 VO
   * @return 	true or false
   */
  public static boolean setData(Field targetF, int nType, ResultSet rs,
                                int scolPos,
                                Object vo) throws SQLException{
    String strValue = "";
    String strTypeName = "";
    double d = 0;
    long l = 0;
    int n = 0;
    Double dd = null;

    java.sql.Date dt = null;
    Time time = null;
    Timestamp timestamp = null;
    byte[] bt = null;
    ByteArrayInputStream bais = null;

    try{
      switch(nType){
        case Types.VARBINARY:
        case Types.BINARY:
          bt = rs.getBytes(scolPos);
          if(bt == null){
            strValue = "";
          } else{
            strValue = new String(bt);
          }
          break;

        case Types.LONGVARCHAR:
          bais = (ByteArrayInputStream)rs.getAsciiStream(scolPos);
          bt = new byte[bais.available()];
          bais.read(bt);
          strValue = new String(bt);
          break;

        case Types.VARCHAR:
        case Types.CHAR:
          strValue = rs.getString(scolPos);
          if(strValue == null)
            strValue = "";
          break;

        case Types.DOUBLE:
        case Types.REAL:
        case Types.FLOAT:
          d = rs.getDouble(scolPos);
          strValue = new Double(d).toString();
          break;

        case Types.SMALLINT:
        case Types.TINYINT:
        case Types.INTEGER:
          n = rs.getInt(scolPos);
          strValue = new Integer(n).toString();
          break;

        case Types.BIGINT:
          l = rs.getLong(scolPos);
          strValue = new Long(l).toString();
          break;

        case Types.DECIMAL:
        case Types.NUMERIC:
          d = rs.getDouble(scolPos);
          strValue = new Long((long)d).toString();
          break;

        case Types.TIME:
          time = rs.getTime(scolPos);
          if(time == null)
            time = new Time(0);
          strValue = time.toString();
          break;

        case Types.TIMESTAMP:
          timestamp = rs.getTimestamp(scolPos);
          if(timestamp == null)
            timestamp = new Timestamp(0);
          strValue = timestamp.toString();
          break;

        case Types.DATE:
          dt = rs.getDate(scolPos);
          if(dt == null)
            dt = new java.sql.Date(0);
          strValue = dt.toString();
          break;

        default:
          strValue = rs.getString(scolPos);
          if(strValue == null)
            strValue = "";
          break;
      } //switch

      //실제 값을 Setting 한다.
      strTypeName = targetF.getType().getName();
      if(strTypeName.equals("java.lang.String")){
        targetF.set(vo, strValue);
      } else{
        dd = new Double(Integer.parseInt(strValue));
        if(strTypeName.equals("java.lang.Double")){
          targetF.set(vo, dd);
        } else if(strTypeName.equals("java.lang.Long")){
          targetF.set(vo, new Long(dd.longValue()));
        } else if(strTypeName.equals("java.lang.Integer")){
          targetF.set(vo, new Integer(dd.intValue()));
        }
      } // end if
      return true;
    } catch(Exception e){ //end try
      return false;
    }
  }

  /**
   * ResultSet --> ArrayList
   * ResultSet의 데이터를 ArrayList로 변환한다.
   * 쿼리 실행 결과인 ResultSet의 결과를 하나의 레코드 당 매개변수 vo 객체를 만들어 담고,
   * 레코드 로우만큼 vo 객체를 만들어 ArrayList에 저장한다.
   * @param  : Object vo : Select SQL 문장의 Column 과 name이 같은 멤버 변수를 가진 VO
   */
  public static void setArrayListFromRS(ResultSet rs, Object vo, ArrayList al){
    int colPos = 1; //칼럼 타입을 파악할 컬럼 위치
    int nType = 0; //칼럼 타입
    String strColName = ""; //칼럼 명
    int ColumnCnt = 0;
    int RecordCnt = 0;
    Field targetF = null;

    try{

      ResultSetMetaData rsmd = rs.getMetaData();

      if(rsmd == null){
        throw new SysException();
      }

      ColumnCnt = rsmd.getColumnCount();
      while(rs.next()){
        vo = vo.getClass().newInstance();
        // Vo값을 초기화 시킬다.
        RecordCnt++;
        //1. 레코드내의 칼럼갯수 만큼 순환.
        for(colPos = 1; colPos <= ColumnCnt; colPos++){
          nType = rsmd.getColumnType(colPos);
          strColName = rsmd.getColumnName(colPos).toLowerCase();
          try{
            targetF = vo.getClass().getField(strColName);
            setData(targetF, nType, rs, colPos, vo);
          } catch(NoSuchFieldException e){
            e.printStackTrace();
            throw new SysException(e);
          }
        } //for - 칼럼갯수만큼 순환
        al.add(vo);     //VO Element를 넣는다.
      } //while - 레코드 갯수만큼 순환

    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    } catch(Exception e){
      e.printStackTrace();
      throw new SysException(e);
    }
  }
}