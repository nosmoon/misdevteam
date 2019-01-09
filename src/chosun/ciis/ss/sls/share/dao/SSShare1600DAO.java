/***************************************************************************************************
* ���ϸ� : SSShare1600DAO.java
* ��� : �������� �Խ��� �Ź��� ó���� ���� DAO
* �ۼ����� : 2003-12-18
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
* ��������-�Խ��� �Ź��� ���� DAO
*/
public class SSShare1600DAO {

	/**
	* �������� �Խ��� �Ź��� ����Ʈ ��ȸ
	* @param SS_L_INFOEXG_INITDM ��ü
	* @return SS_L_INFOEXG_INITDataSet ��ü
	* @throws AppException
	*/

	public SS_L_INFOEXG_INITDataSet selectInitList(SS_L_INFOEXG_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_INFOEXG_INITDataSet ds = (SS_L_INFOEXG_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� �Խ��� �Ź��� ����Ʈ ��ȸ
	* @param SS_L_INFOEXG_SRCHDM ��ü
	* @return SS_L_INFOEXG_SRCHDataSet ��ü
	* @throws AppException
	*/

	public SS_L_INFOEXG_SRCHDataSet selectSrchList(SS_L_INFOEXG_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_INFOEXG_SRCHDataSet ds = (SS_L_INFOEXG_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* �������� �Խ��� �Ź��� ��� �ʱ�ȭ��
	* @param SS_L_INFOEXG_SAVE_INITDM ��ü
	* @return SS_L_INFOEXG_SAVE_INITDataSet ��ü
	* @throws AppException
	*/

	public SS_L_INFOEXG_SAVE_INITDataSet writeInfoexg(SS_L_INFOEXG_SAVE_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* �������� �Խ��� �Ź��� ���
	* @param SS_I_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean insertInfoexg(SS_I_INFOEXGDM dm) throws AppException{
    	boolean ret = false;
       	// ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // �ӽ� ����
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
               	cstmt.setTimestamp(9, dm.regdt);
               	cstmt.setString(10, dm.makepersid);
               	cstmt.setString(11, dm.makepersnm);
               	cstmt.setString(12, dm.email);
               	cstmt.setString(13, dm.hmpg);
               	cstmt.setString(14, dm.titl);
               	cstmt.setString(15, dm.cont1);
               	cstmt.setString(16, dm.cont2);
               	cstmt.setString(17, dm.cont3);
               	cstmt.setString(18, dm.cont4);
               	cstmt.setString(19, dm.cont5);
               	cstmt.setString(20, dm.deptcd);
               	cstmt.setString(21, dm.deptnm);
				cstmt.setString(22, dm.rmsgdept);
				cstmt.setString(23, dm.rmsgarea);
				cstmt.setString(24, dm.rmsgexttcd);
               	cstmt.setString(25, dm.filenm);
               	cstmt.setString(26, dm.filesize);
               	cstmt.setBytes(27, "1010".getBytes());  // �ӽ� ����Ʈ �迭
               	cstmt.setString(28, dm.incmgpers);
               	cstmt.registerOutParameter(29, Types.VARCHAR);
               	// ����
               	cstmt.execute();
               	// ���
               	SS_I_INFOEXGDataSet ds = (SS_I_INFOEXGDataSet)dm.createDataSetObject();
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
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
            	try{
            		manager.m_conn.rollback();
            	}catch(SQLException se){
            		throw new SysException(se);
            	}
            	manager.disConnection();
            	throw new SysException(e);
			}
		}else{
        	DBManager manager = new DBManager("Oracle");
           	SS_I_INFOEXGDataSet ds = (SS_I_INFOEXGDataSet) manager.executeCall(dm);
           	if(!"".equals(ds.errcode)){
               	throw new AppException(ds.errcode, ds.errmsg);
           	}else{
               	ret = true;
          	}
       	}
       	return ret;
	}

	/**
	* �������� �Խ��� �Ź��� ����
	* @param SS_U_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean updateInfoexg(SS_U_INFOEXGDM dm) throws AppException{
    	boolean ret = false;
       	// ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // �ӽ� ����
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
				cstmt.setString(7, dm.makepersid);
				cstmt.setString(8, dm.makepersnm);
				cstmt.setString(9, dm.email);
				cstmt.setString(10, dm.hmpg);
				cstmt.setString(11, dm.titl);
				cstmt.setString(12, dm.cont1);
				cstmt.setString(13, dm.cont2);
				cstmt.setString(14, dm.cont3);
				cstmt.setString(15, dm.cont4);
				cstmt.setString(16, dm.cont5);
				cstmt.setString(17, dm.rmsgdept);
				cstmt.setString(18, dm.rmsgarea);
				cstmt.setString(19, dm.rmsgexttcd);
				cstmt.setString(20, dm.filenm);
				cstmt.setString(21, dm.filesize);
				cstmt.setBytes(22, "1010".getBytes());  // �ӽ� ����Ʈ �迭
				cstmt.setString(23, dm.chgpers);
				cstmt.registerOutParameter(24, Types.VARCHAR);
               	// ����
               	cstmt.execute();
               	// ���
               	SS_U_INFOEXGDataSet ds = (SS_U_INFOEXGDataSet)dm.createDataSetObject();
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
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
            	try{
            		manager.m_conn.rollback();
            	}catch(SQLException se){
            		throw new SysException(se);
            	}
            	manager.disConnection();
            	throw new SysException(e);
			}
		}else{
        	DBManager manager = new DBManager("Oracle");
           	SS_U_INFOEXGDataSet ds = (SS_U_INFOEXGDataSet) manager.executeCall(dm);
           	if(!"".equals(ds.errcode)){
               	throw new AppException(ds.errcode, ds.errmsg);
           	}else{
               	ret = true;
          	}
       	}
       	return ret;
	}

	/**
	* �������� �Խ��� �Ź��� ����
	* @param SS_D_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean deleteInfoexg(SS_D_INFOEXGDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_INFOEXGDataSet ds = (SS_D_INFOEXGDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	* �������� �Խ��� �Ź��� ������ ��ȸ
	* @param SS_S_INFOEXGDM
	* @return �������� �Խ��� �Ź��� ������ DataSet
	* @throws AppException
	*/

	public SS_S_INFOEXGDataSet selectInfoexgDetail(SS_S_INFOEXGDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
				throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� �Խ��� �Ź��� �亯���
	* @param SS_I_INFOEXG_ANSWERDM
	* @return boolean
	* @throws AppException
	*/

	public boolean insertAnswerInfoexg(SS_I_INFOEXG_ANSWERDM dm) throws AppException{
    	boolean ret = false;
       	// ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // �ӽ� ����
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
                   cstmt.setString(4, dm.seq);
                   cstmt.setLong(5, dm.answergrp);
                   cstmt.setLong(6, dm.answerseq);
                   cstmt.setLong(7, dm.answerlevl);
                   cstmt.setString(8, dm.notifrdt);
                   cstmt.setString(9, dm.notitodt);
                   cstmt.setTimestamp(10, dm.regdt);
                   cstmt.setString(11, dm.makepersid);
                   cstmt.setString(12, dm.makepersnm);
                   cstmt.setString(13, dm.email);
                   cstmt.setString(14, dm.hmpg);
                   cstmt.setString(15, dm.titl);
                   cstmt.setString(16, dm.cont1);
                   cstmt.setString(17, dm.cont2);
                   cstmt.setString(18, dm.cont3);
                   cstmt.setString(19, dm.cont4);
                   cstmt.setString(20, dm.cont5);
                   cstmt.setString(21, dm.deptcd);
                   cstmt.setString(22, dm.deptnm);
                   cstmt.setString(23, dm.rmsgdept);
                   cstmt.setString(24, dm.rmsgarea);
                   cstmt.setString(25, dm.rmsgexttcd);
                   cstmt.setString(26, dm.filenm);
                   cstmt.setString(27, dm.filesize);
                   cstmt.setBytes(28, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(29, dm.incmgpers);
                   cstmt.registerOutParameter(30, Types.VARCHAR);
               	// ����
               	cstmt.execute();
               	// ���
               	SS_I_INFOEXG_ANSWERDataSet ds = (SS_I_INFOEXG_ANSWERDataSet)dm.createDataSetObject();
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
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
            	try{
            		manager.m_conn.rollback();
            	}catch(SQLException se){
            		throw new SysException(se);
            	}
            	manager.disConnection();
            	throw new SysException(e);
			}
		}else{
        	DBManager manager = new DBManager("Oracle");
           	SS_I_INFOEXG_ANSWERDataSet ds = (SS_I_INFOEXG_ANSWERDataSet) manager.executeCall(dm);
           	if(!"".equals(ds.errcode)){
               	throw new AppException(ds.errcode, ds.errmsg);
           	}else{
               	ret = true;
          	}
       	}
       	return ret;
	}

	/**
	* �������� �Խ��� �Ź��� �ٿ�ε�
	* @param SS_S_INFOEXG_DWLOADDM
	* @return �������� �Խ��� �������� �ٿ�ε� DataSet
	* @throws AppException
	*/

	public SS_S_INFOEXG_DWLOADDataSet dwloadInfoexg(SS_S_INFOEXG_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INFOEXG_DWLOADDataSet ds = (SS_S_INFOEXG_DWLOADDataSet)manager.executeCall(dm);
        // ����ũ�⸸ŭ byte[] ����
        ds.filecont = new byte[Integer.parseInt(ds.filesize)];
        if(!"".equals(ds.errcode)){
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
      	   		//������(ep1)
      	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
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

	/**
	* �������� �Խ��� �Ź��� ��õ
	* @param SS_U_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean recomInfoexg(SS_U_INFOEXG_RECOMDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_INFOEXG_RECOMDataSet ds = (SS_U_INFOEXG_RECOMDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}
}
