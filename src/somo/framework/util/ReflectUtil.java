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
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  �ڹ� ���÷����� �̿��Ͽ� �پ��� �������� ��ȯ,���� �۾��� ���� ��ƿ��Ƽ �޼ҵ带 �����Ѵ�.
 *  ����� ������� �ʰ�, static Ÿ���� �޼ҵ带 ������.
 */
public final class ReflectUtil{

  /**
   * DM --> 0, or null
   * input Parameter�� DataModel�� VO�� Member Value�� �ʱ�ȭ �Ѵ�.
   * Class A extend AbstractDM {
   *      String      ID;
   *      String      Name;
   *      Integer     Order;
   *  }   --> ID, Name, Order���� �ʱ�ȭ �Ѵ�.
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
   * Request Parameter�� Value�� DataModel(VO)�� ã�Ƽ� Assign�Ѵ�.
   *
   * @param   iHttpServletRequest ireq Request Instance,
   * @param   Object dm instance
   * @return  Request Parameter�� Value�� dm�� Member�����̸���
   *                   ���� ���� ã�� �ڵ� Assign�Ѵ�.
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
        //DataModel�� Member�������� ������ �´�.
        reqStr = targetF[i].getName();

        reqValue = ireq.getParameter(reqStr);
        // �ش� Member�������� Parameter���� ������ �´�.
        if(!reqValue.equals("")){
          // �����̸��� Parameter Name�� ���� �ִ°�?
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
   * Request Parameter�� Value�� ������ �ϰ��  �� DataModel�� ���� �ִ´�.
   * @param   iHttpServletRequest ireq : Request Instance
   * @param   Object[] dm : dm�� Array
   * @return  Request Parameter�� Value�� dm�� Member�����̸���
   *            ���� ���� ã�� �ڵ� Assign�Ѵ�.
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
      // DM�� Length���� �۾��� �Ѵ�.
      for(int i = 0; i < dms.length; i++){
        //Ư�� DataModel�� ������ �´�.
        targetF = dms[i].getClass().getDeclaredFields();
        for(int j = 0; j < targetF.length; j++){
          //DataModel�� Member�������� ������ �´�.
          reqStr = targetF[j].getName();
          // �ش� Member�������� Parameter���� ������ �´�.
          if(ireq.getParameterValues(reqStr).length <= 1){
            reqValue = ireq.getParameter(reqStr);
          } else{
            temp = ireq.getParameterValues(reqStr);
            // ������ ""�� Setting�� �Ѵ�.
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
   * Prepared Statement���� '?'�� ġȯ�ϴ�  ���ڰ��� �����Ѵ�.
   * @param pt	(Properties)
   * @return N/A
   */
  public static void setPStmtParam(Properties pt, PreparedStatement pStmt){
    //Properties�� ���� �����Ͽ� �ִ´�.
    Enumeration enum1 = pt.propertyNames();
    String strKey = new String();
    String strIndexKey = new String();
    String strKeyValue = new String();
    String strPosition = new String();

    int index;

    /*
     * Properties�� Enum�Ͽ� ���������� prepared statement�� '?'��
     * �����Ͽ� �ش�. ���� int�� String�� ������ �Ǿ� �����Ƿ� �� �� ��
     * �þ ��� ��� �߰��ϸ� �ɰ���.
     * (Value.Type)
     * pt.setProperty("1.CHAR.IN","TEST");
     */
    while(enum1.hasMoreElements()){
      strKey = (String)enum1.nextElement(); //Keyname�� ���´�.
      strKeyValue = pt.getProperty(strKey); //KeyValue�� ���´�.
      index = strKey.indexOf("."); //���� KeyName���� '.'�� ã�´�.
      strPosition = strKey.substring(0, index); //Keyname���� '.'������ ���� ã�´�.
      strIndexKey = strKey.substring(index + 1, strKey.length()); //keyname���� '.'������ ���� ã�´�.
      strIndexKey.toUpperCase(); //"��� ���ڸ� �빮�ڷ� ġȯ�Ѵ�.

      try{
        if(strIndexKey.equals("INT")){ // Int���� �����Ѵ�.
          double val;
          if(strKeyValue.equals("")){
            val = 0;
          } else{
            val = Double.parseDouble(strKeyValue);
          }
          pStmt.setDouble(Integer.parseInt(strPosition), val);
        } else if(strIndexKey.equals("CHAR") || //String Value���� �����Ѵ�.
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
   * Stored Procedure�� input parameter ���� Setting�Ѵ�.
   * @param   rs        : Column�� ������ ������ �ִ� ResultSet
   * @param   dm : dm(VO)�� Instance
   * @return  callableStatement�� ���� Setting�Ѵ�.
   *
   */
  public static Properties setOracleProcParam(Object dm,
                                              CallableStatement cStmt,
                                              ResultSet rs){
    int index;
    int position = 1; // MSSQL�� Return Parameter�� Default�� �����ǰ� ORACLE�� ����.

    int columnDataType;
    int columnInOutType;

    // out put Parameter�� ������ ���� ���� �κ�
    // pt . KEY     -> targetF�� Column���� ������ �ִ� ��������� ��ġ
    // pt . Value   -> Stored Procedure�� Parameter Position
    Properties pt = new Properties();
    Double d = new Double(0);
    Long l = new Long(0);
    Integer n = new Integer(0);

    String columnName = "";
    String columnFullName = "";
    String columnValue = "";
    String columnType = "";

    try{
      // ����Ǿ��� Stored Procedure�� Column �Ӽ��� ������ �´�.
      while(rs.next()){
        columnFullName = rs.getString("COLUMN_NAME");
        index = columnFullName.indexOf("_");
        columnName = columnFullName.substring(index + 1,
                                              columnFullName.length());
        columnInOutType = rs.getInt("COLUMN_TYPE");
        columnDataType = rs.getInt("DATA_TYPE");
        columnValue = "";
        // MSSQL�� Position�� 0�� RETURN VALUE�� Default�� ������.
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
              // .C --> CURSOR�� ���Ѵ�.
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
   * Stored Procedure�� input parameter ���� Setting�Ѵ�.
   * @param   rs        : Column�� ������ ������ �ִ� ResultSet
   * @param   dm : dm(VO)�� Instance
   * @return  callableStatement�� ���� Setting�Ѵ�.
   *
   */
  public static Properties setMssqlProcParam(Object dm,
                                         CallableStatement cStmt, ResultSet rs){
    int index;
    int position = 0; // MSSQL�� Return Parameter�� Default�� �����ǰ� ORACLE�� ����.

    int columnDataType;
    int columnInOutType;

    // out put Parameter�� ������ ���� ���� �κ�
    // pt . KEY     -> targetF�� Column���� ������ �ִ� ��������� ��ġ
    // pt . Value   -> Stored Procedure�� Parameter Position
    Properties pt = new Properties();
    Double d = new Double(0);
    Long l = new Long(0);
    Integer n = new Integer(0);

    String columnName = "";
    String columnFullName = "";
    String columnValue = "";
    String columnType = "";

    try{
      // ����Ǿ��� Stored Procedure�� Column �Ӽ��� ������ �´�.
      while(rs.next()){
        columnFullName = rs.getString("COLUMN_NAME");
        index = columnFullName.indexOf("_");
        columnName = columnFullName.substring(index + 1,
                                              columnFullName.length());
        columnInOutType = rs.getInt("COLUMN_TYPE");
        columnDataType = rs.getInt("DATA_TYPE");
        columnValue = "";
        // MSSQL�� Position�� 0�� RETURN VALUE�� Default�� ������.
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
              // .C --> CURSOR�� ���Ѵ�.
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
   * Properties ��ü�� �̿��Ͽ� key ������ ��� �̸� �̿��Ͽ� ResultSet, CallableStatement ��ü�κ��� DM ��ü�� OUT Ÿ���� ���� �����Ѵ�.
   * @param pt KEY ������ ������ Propertis ��ü
   * @param dm ���� ������ DM Ÿ�� ��ü
   * @param rs DB Access ��������� ������ ResultSet ��ü
   * @param cStmt DB Access�� ������ CallableStatement ��ü
   */
  public static void setOutputParam(Properties pt, Object dm,
                                    ResultSet rs, CallableStatement cStmt){
    String strKey = ""; // �� "COLUMNNAME", "COLUMNNAME.C",....
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
        strKey = (String)enum1.nextElement(); //Keyname�� ���´�.
        index = strKey.indexOf(".");
        if(index > 0){
          strCursor = strKey.substring(index + 1, strKey.length());
          //strKey      = strKey.substring(0,index);
        } else{
          strCursor = "";
        }
        strKeyValue = pt.getProperty(strKey); //KeyValue�� ���´�.
        if(strCursor.equals("C")){
         // rs = (ResultSet)((weblogic.jdbc.rmi.SerialCallableStatement)cStmt).getCursor(Integer.parseInt(strKeyValue));
          rs = (ResultSet) ((OracleCallableStatement)cStmt).getCursor(Integer.parseInt(strKeyValue));
          //m_result = new DBResultSet(rs);
        } else{
          // Numeric�� ��� cStmt.getDouble�� �����͸� ������ ���� VO�� DataType�� �°�
          // ��ȯ�� ��Ų��.
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
   * ResultSet�� �����͸� vo ��ü�� ��ȯ�Ѵ�.
   * Single Row�� ��� �ش� �Ѵ�.
   * @param   Object vo : Single Row�� ������� Value Object�� Instance
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

    int colPos = 1; //Į�� Ÿ���� �ľ��� �÷� ��ġ
    int nType = 0; //Į�� Ÿ��
    String strColName = ""; //Į�� ��
    int ColumnCnt = 0;
    Field targetF = null;

    try{
      ColumnCnt = rsmd.getColumnCount();
      if(rs.next()){
        //1. ���ڵ峻�� Į������ ��ŭ ��ȯ.
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

        } //for - Į��������ŭ ��ȯ

      } //end if
      return;
    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    }
  }

  /**���� ��� �޼ҵ�
   * ResultSet Ư�� ���ڵ��� �� Column ���� vo�� ������ �̸��� ������ �����Ѵ�.
   * ResultSet���� scolPos���� ã�� targetF�� ������ �Ѵ�.
   * (��)  ResultSet�� scolPos�� �ִ� �ڷḦ Set�Ѵ�
   *
   * @param 	tragetF  SQL���� ���� ����� ������� VO�� ��� ����
   * @param 	rs       SQL���� ���� ����� ��� �ִ� ResultSet
   * @param 	scolPos  �ϳ��� �࿡�� rs�� Column�� ������� ��ġ
   * @param 	dm       SQL���� ���� ����� ������� VO
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

      //���� ���� Setting �Ѵ�.
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
   * ResultSet�� �����͸� ArrayList�� ��ȯ�Ѵ�.
   * ���� ���� ����� ResultSet�� ����� �ϳ��� ���ڵ� �� �Ű����� vo ��ü�� ����� ���,
   * ���ڵ� �ο츸ŭ vo ��ü�� ����� ArrayList�� �����Ѵ�.
   * @param  : Object vo : Select SQL ������ Column �� name�� ���� ��� ������ ���� VO
   */
  public static void setArrayListFromRS(ResultSet rs, Object vo, ArrayList al){
    int colPos = 1; //Į�� Ÿ���� �ľ��� �÷� ��ġ
    int nType = 0; //Į�� Ÿ��
    String strColName = ""; //Į�� ��
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
        // Vo���� �ʱ�ȭ ��ų��.
        RecordCnt++;
        //1. ���ڵ峻�� Į������ ��ŭ ��ȯ.
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
        } //for - Į��������ŭ ��ȯ
        al.add(vo);     //VO Element�� �ִ´�.
      } //while - ���ڵ� ������ŭ ��ȯ

    } catch(SQLException se){
      se.printStackTrace();
      throw new SysException(se);
    } catch(Exception e){
      e.printStackTrace();
      throw new SysException(e);
    }
  }
}