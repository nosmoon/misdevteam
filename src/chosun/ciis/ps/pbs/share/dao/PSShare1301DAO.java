/***************************************************************************************************
 * ���ϸ� : PSShare1301DAO.java
 * ��� : �������� �Խ��� ���� ó���� ���� DAO
 * �ۼ����� : 2004-02-24
 * �ۼ��� : ����ǥ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

import java.sql.*;
import java.io.*;

//import oracle.jdbc.driver.*;
import oracle.sql.*;
import oracle.jdbc.*;

//import weblogic.jdbc.vendor.oracle.*;

/**
 * ��������-�Խ��� �Ǹű� ���� DAO
 */
public class PSShare1301DAO {

    /**
     * �������� �Խ��� �Ǹű� ����Ʈ ��ȸ
     * @param PS_L_INFOEXG_INITDM ��ü
     * @return PS_L_INFOEXG_INITDataSet ��ü
     * @author CRM ���Ǳ���
     */

    public PS_L_INFOEXG_INITDataSet selectInitList(PS_L_INFOEXG_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� �Խ��� �Ǹű� ����Ʈ ��ȸ
     * @param PS_L_INFOEXG_SRCHDM ��ü
     * @return PS_L_INFOEXG_SRCHDataSet ��ü
     * @author CRM ���Ǳ���
     */

    public PS_L_INFOEXG_SRCHDataSet selectSrchList(PS_L_INFOEXG_SRCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_INFOEXG_SRCHDataSet ds = (PS_L_INFOEXG_SRCHDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� �Խ��� ���
     * @param PS_I_INFOEXGDM
     * @return boolean
     * @author CRM ���Ǳ���
     */

    public boolean insertInfoexg(PS_I_INFOEXGDM dm) throws AppException {
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               long tempSeq;     // �ӽ� ����
               byte[] tempCont;    // �ӽ� ÷������ ����
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // �Ķ���� ����
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.clsf);
                   cstmt.setLong(4, dm.answergrp);
                   cstmt.setLong(5, dm.answerseq);
                   cstmt.setLong(6, dm.answerlevl);
                   cstmt.setString(7, dm.notifrdt);
                   cstmt.setString(8, dm.notitodt);
                   cstmt.setString(9, dm.makepersnm);
                   cstmt.setString(10, dm.email);
                   cstmt.setString(11, dm.hmpg);
                   cstmt.setString(12, dm.titl);
                   cstmt.setString(13, dm.cont1);
                   cstmt.setString(14, dm.cont2);
                   cstmt.setString(15, dm.cont3);
                   cstmt.setString(16, dm.cont4);
                   cstmt.setString(17, dm.cont5);
                   cstmt.setString(18, dm.rmsgdept);
                   cstmt.setString(19, dm.rmsgexttcd);
                   cstmt.setString(20, dm.cmpycd);
                   cstmt.setString(21, dm.cmpynm);
                   cstmt.setString(22, dm.filenm);
                   cstmt.setString(23, dm.filesize);
                   cstmt.setBytes(24, "1010".getBytes());
                   cstmt.setString(25, dm.incmgpers);
                   cstmt.registerOutParameter(26, Types.INTEGER);

                   // ����
                   cstmt.execute();
                   // ���
                   PS_I_INFOEXGDataSet ds = (PS_I_INFOEXGDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �������� ��´�.
                   tempSeq = ds.getSeq();
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//������(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	                       
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (Exception e) {
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
            ret = true;
        }else{
            DBManager manager = new DBManager("Oracle");
               PS_I_INFOEXGDataSet ds = (PS_I_INFOEXGDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
       }
/*
        DBManager manager = new DBManager("Oracle");
        manager.getConnection();

        try {
            manager.m_conn.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("ex1 : " + ex);
        }

        PS_I_INFOEXGDataSet ds = (PS_I_INFOEXGDataSet) manager.executeCall(dm, false);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {

            long seq = ds.getSeq();

            String filenm = dm.getFilenm();
            String filepath = dm.getFilepath();

            if (filenm == null || filenm.equals("")) {
                return true;
            } else {
                File fileup = null;
                FileInputStream in = null;
                OutputStream outstream = null;
                ResultSet rset = null;
                Statement stmt = null;
                OracleThinBlob blob = null;

                try {
                    String query = "SELECT filecont FROM TACOM_INFOEXG WHERE seq='" + seq + "' FOR UPDATE";
                    stmt = manager.m_conn.createStatement();
                    rset = stmt.executeQuery(query);

                    if (rset.next()) {

                        blob = (OracleThinBlob) rset.getBlob(1);

                        fileup = new File(filepath);
                        in = new FileInputStream(fileup);
                        outstream = blob.getBinaryOutputStream();

                        byte[] buffer = new byte[10 * 1024];
                        int nread = 0;

                        while ( (nread = in.read(buffer)) != -1)
                            outstream.write(buffer, 0, nread);
                            //inputStream.close();
                    }
                } catch (FileNotFoundException ex1) {
                    throw new SysException(ex1);
                } catch (SQLException ex2) {
                    throw new SysException(ex2);
                } catch (IOException ex3) {
                    throw new SysException(ex3);
                } catch (Exception ex4) {
                    throw new SysException(ex4);
                } finally {
                    try {
                        outstream.close(); } catch (IOException ex5) {}
                    try {
                        in.close(); } catch (IOException ex6) {}
                    try {
                        stmt.close(); } catch (SQLException sql1) {}
                    try {
                        rset.close(); } catch (SQLException sql2) {}
                    manager.disConnection();
                }
            }
            return true;
        }
    }
*/

    /**
     * �������� �Խ��� ����
     * @param PS_U_INFOEXGDM
     * @return boolean
     * @author CRM ���Ǳ���
     */

    public boolean updateInfoexg(PS_U_INFOEXGDM dm) throws AppException {
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               long tempSeq;     // �ӽ� ����
               byte[] tempCont;    // �ӽ� ÷������ ����
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // �Ķ���� ����
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.clsf);
                   cstmt.setLong(4, dm.seq);
                   cstmt.setString(5, dm.notifrdt);
                   cstmt.setString(6, dm.notitodt);
                   cstmt.setString(7, dm.email);
                   cstmt.setString(8, dm.hmpg);
                   cstmt.setString(9, dm.titl);
                   cstmt.setString(10, dm.cont1);
                   cstmt.setString(11, dm.cont2);
                   cstmt.setString(12, dm.cont3);
                   cstmt.setString(13, dm.cont4);
                   cstmt.setString(14, dm.cont5);
                   cstmt.setString(15, dm.filenm);
                   cstmt.setString(16, dm.filesize);
                   cstmt.setBytes(17, "1010".getBytes());
                   cstmt.setString(18, dm.incmgpers);
                   cstmt.setString(19, dm.cmpycd);
                   cstmt.setString(20, dm.rmsgexttcd);

                   // ����
                   cstmt.execute();
                   // ���
                   PS_U_INFOEXGDataSet ds = (PS_U_INFOEXGDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �������� ��´�.
                   tempSeq = dm.getSeq();
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//������(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	                       
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (Exception e) {
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
            ret = true;
        }else{
            DBManager manager = new DBManager("Oracle");
               PS_U_INFOEXGDataSet ds = (PS_U_INFOEXGDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
    }
/*
        DBManager manager = new DBManager("Oracle");
        manager.getConnection();

        try {
            manager.m_conn.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("ex1 : " + ex);
        }

        PS_U_INFOEXGDataSet ds = (PS_U_INFOEXGDataSet) manager.executeCall(dm, false);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {

            long seq = dm.getSeq();

            String filenm = dm.getFilenm();
            String filepath = dm.getFilepath();

            if (filenm == null || filenm.equals("")) {
                return true;
            } else {
                File fileup = null;
                FileInputStream in = null;
                OutputStream outstream = null;
                ResultSet rset = null;
                Statement stmt = null;
                OracleThinBlob blob = null;

                try {
                    String query = "SELECT filecont FROM TACOM_INFOEXG WHERE seq='" + seq + "' FOR UPDATE";
                    stmt = manager.m_conn.createStatement();
                    rset = stmt.executeQuery(query);

                    if (rset.next()) {

                        blob = (OracleThinBlob) rset.getBlob(1);

                        fileup = new File(filepath);
                        in = new FileInputStream(fileup);
                        outstream = blob.getBinaryOutputStream();

                        byte[] buffer = new byte[10 * 1024];
                        int nread = 0;

                        while ( (nread = in.read(buffer)) != -1)
                            outstream.write(buffer, 0, nread);
                            //inputStream.close();
                    }
                } catch (FileNotFoundException ex1) {
                    throw new SysException(ex1);
                } catch (SQLException ex2) {
                    throw new SysException(ex2);
                } catch (IOException ex3) {
                    throw new SysException(ex3);
                } catch (Exception ex4) {
                    throw new SysException(ex4);
                } finally {
                    try {
                        outstream.close(); } catch (IOException ex5) {}
                    try {
                        in.close(); } catch (IOException ex6) {}
                    try {
                        stmt.close(); } catch (SQLException sql1) {}
                    try {
                        rset.close(); } catch (SQLException sql2) {}
                    manager.disConnection();
                }
            }
            return true;
        }

    }
*/
    /**
     * �������� �Խ��� ����
     * @param PS_D_INFOEXGDM
     * @return boolean
     * @author CRM ���Ǳ���
     */

    public boolean deleteInfoexg(PS_D_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_INFOEXGDataSet ds = (PS_D_INFOEXGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }

    /**
     * �������� �Խ��� �Ǹű� ������ ��ȸ
     * @param PS_S_INFOEXGDM
     * @return PS_S_INFOEXGDataSet
     * @author CRM ���Ǳ���
     */

    public PS_S_INFOEXGDataSet selectInfoexgDetail(PS_S_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_INFOEXGDataSet ds = (PS_S_INFOEXGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������� �Խ��� �Ǹű� �亯���
     * @param PS_I_INFOEXG_ANSWERDM
     * @return boolean
     * @author CRM ���Ǳ���
     */

    public boolean insertAnswerInfoexg(PS_I_INFOEXG_ANSWERDM dm) throws AppException {
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               long tempSeq;     // �ӽ� ����
               byte[] tempCont;    // �ӽ� ÷������ ����
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // �Ķ���� ����
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.clsf);
                   cstmt.setLong(4, dm.answergrp);
                   cstmt.setLong(5, dm.answerseq);
                   cstmt.setLong(6, dm.answerlevl);
                   cstmt.setString(7, dm.notifrdt);
                   cstmt.setString(8, dm.notitodt);
                   cstmt.setString(9, dm.makepersnm);
                   cstmt.setString(10, dm.email);
                   cstmt.setString(11, dm.hmpg);
                   cstmt.setString(12, dm.titl);
                   cstmt.setString(13, dm.cont1);
                   cstmt.setString(14, dm.cont2);
                   cstmt.setString(15, dm.cont3);
                   cstmt.setString(16, dm.cont4);
                   cstmt.setString(17, dm.cont5);
                   cstmt.setString(18, dm.cmpycd);
                   cstmt.setString(19, dm.cmpynm);
                   cstmt.setString(20, dm.filenm);
                   cstmt.setString(21, dm.filesize);
                   cstmt.setBytes(22,"1010".getBytes());
                   cstmt.setString(23, dm.incmgpers);
                   cstmt.registerOutParameter(24, Types.INTEGER);

                   // ����
                   cstmt.execute();
                   // ���
                   PS_I_INFOEXG_ANSWERDataSet ds = (PS_I_INFOEXG_ANSWERDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �������� ��´�.
                   tempSeq = ds.getSeq();
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//������(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	                       
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (Exception e) {
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
            ret = true;
        }else{
            DBManager manager = new DBManager("Oracle");
               PS_I_INFOEXG_ANSWERDataSet ds = (PS_I_INFOEXG_ANSWERDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
       }
/*
        DBManager manager = new DBManager("Oracle");
        manager.getConnection();

        try {
            manager.m_conn.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("ex1 : " + ex);
        }

        PS_I_INFOEXG_ANSWERDataSet ds = (PS_I_INFOEXG_ANSWERDataSet) manager.executeCall(dm, false);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {

            long seq = ds.getSeq();

            String filenm = dm.getFilenm();
            String filepath = dm.getFilepath();

            if (filenm == null || filenm.equals("")) {
                return true;
            } else {
                File fileup = null;
                FileInputStream in = null;
                OutputStream outstream = null;
                ResultSet rset = null;
                Statement stmt = null;
                OracleThinBlob blob = null;

                try {
                    String query = "SELECT filecont FROM TACOM_INFOEXG WHERE seq='" + seq + "' FOR UPDATE";
                    stmt = manager.m_conn.createStatement();
                    rset = stmt.executeQuery(query);

                    if (rset.next()) {

                        blob = (OracleThinBlob) rset.getBlob(1);

                        fileup = new File(filepath);
                        in = new FileInputStream(fileup);
                        outstream = blob.getBinaryOutputStream();

                        byte[] buffer = new byte[10 * 1024];
                        int nread = 0;

                        while ( (nread = in.read(buffer)) != -1)
                            outstream.write(buffer, 0, nread);
                            //inputStream.close();
                    }
                } catch (FileNotFoundException ex1) {
                    throw new SysException(ex1);
                } catch (SQLException ex2) {
                    throw new SysException(ex2);
                } catch (IOException ex3) {
                    throw new SysException(ex3);
                } catch (Exception ex4) {
                    throw new SysException(ex4);
                } finally {
                    try {
                        outstream.close(); } catch (IOException ex5) {}
                    try {
                        in.close(); } catch (IOException ex6) {}
                    try {
                        stmt.close(); } catch (SQLException sql1) {}
                    try {
                        rset.close(); } catch (SQLException sql2) {}
                    manager.disConnection();
                }
            }
            return true;
        }
    }
*/
    /**
     * �������� �Խ��� �Ǹű� �ٿ�ε�
     * @param PS_S_INFOEXG_DWLOADDM
     * @return PS_S_INFOEXG_DWLOADDataSet
     * @author CRM ���Ǳ���
     */
/*
    public PS_S_INFOEXG_DWLOADDataSet dwloadInfoexg(PS_S_INFOEXG_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_INFOEXG_DWLOADDataSet ds = (PS_S_INFOEXG_DWLOADDataSet) manager.executeCall(dm);
        // ����ũ�⸸ŭ byte[] ����
        ds.filecont = new byte[Integer.parseInt(ds.filesize)];
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }

        try {
            manager = new DBManager("Oracle");
            manager.getConnection();
            manager.m_conn.setAutoCommit(false);
            Statement stmt = manager.m_conn.createStatement();
            String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+dm.seq+"' FOR UPDATE";
            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
            if (rset.next()) {
                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
                InputStream is = oracle_blob.getBinaryStream();
                // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                int b;
                int count = 0;
                while( (b = is.read()) != -1 ) {
                    ds.filecont[count++] = (byte)b;
                }
                is.close();
            }
            stmt.close();
            manager.disConnection();
        } catch (Exception e) {
            manager.disConnection();
            throw new SysException(e);
        }
        return ds;
    }
*/

/**
 * �������� �Խ��� �������� �ٿ�ε�
 * @param PS_S_INFOEXG_DWLOADDM
 * @return PS_S_INFOEXG_DWLOADDataSet
 * @author CRM ���Ǳ���
 */

public PS_S_INFOEXG_DWLOADDataSet dwloadInfoexg(PS_S_INFOEXG_DWLOADDM dm) throws AppException {
    DBManager manager = new DBManager("Oracle");
    PS_S_INFOEXG_DWLOADDataSet ds = (PS_S_INFOEXG_DWLOADDataSet) manager.executeCall(dm);
    if (!"".equals(ds.errcode)) {
        throw new AppException(ds.errcode, ds.errmsg);
    }
    return ds;
}

    /**
     * �������� �Խ��� �Ǹű� ��õ
     * @param PS_U_INFOEXGDM
     * @return boolean
     * @author CRM ���Ǳ���
     */

    public boolean recomInfoexg(PS_U_INFOEXG_RECOMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_INFOEXG_RECOMDataSet ds = (PS_U_INFOEXG_RECOMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
}
