/***************************************************************************************************
* 파일명 : SSShare1600DAO.java
* 기능 : 정보공유 게시판 신문고 처리를 위한 DAO
* 작성일자 : 2003-12-18
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
* 정보공유-게시판 신문고 위한 DAO
*/
public class SSShare1600DAO {

	/**
	* 정보공유 게시판 신문고 리스트 조회
	* @param SS_L_INFOEXG_INITDM 객체
	* @return SS_L_INFOEXG_INITDataSet 객체
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
	* 정보공유 게시판 신문고 리스트 조회
	* @param SS_L_INFOEXG_SRCHDM 객체
	* @return SS_L_INFOEXG_SRCHDataSet 객체
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
	* 정보공유 게시판 신문고 등록 초기화면
	* @param SS_L_INFOEXG_SAVE_INITDM 객체
	* @return SS_L_INFOEXG_SAVE_INITDataSet 객체
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
	* 정보공유 게시판 신문고 등록
	* @param SS_I_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean insertInfoexg(SS_I_INFOEXGDM dm) throws AppException{
    	boolean ret = false;
       	// 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // 임시 순번
           	byte[] tempCont;    // 임시 첨부파일 내용
           	tempCont = dm.filecont;
           	DBManager manager = null;
           	try {
               	manager = new DBManager("Oracle");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	// 파라미터 설정
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
               	cstmt.setBytes(27, "1010".getBytes());  // 임시 바이트 배열
               	cstmt.setString(28, dm.incmgpers);
               	cstmt.registerOutParameter(29, Types.VARCHAR);
               	// 실행
               	cstmt.execute();
               	// 결과
               	SS_I_INFOEXGDataSet ds = (SS_I_INFOEXGDataSet)dm.createDataSetObject();
               	ds.getValues(cstmt);

               	if(!"".equals(ds.errcode)){
               	    throw new AppException(ds.errcode, ds.errmsg);
               	}
               	// 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
               	tempSeq = ds.getSeq();
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               	String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
               	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

               	if (rset.next()) {
                   	weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                   	BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
          	   		//레진용(ep1)
          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	                   	
                   	OutputStream os = oracle_blob.getBinaryOutputStream();
                   	// 파일로부터 읽어서 BLOB 에 WRITE 한다.
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
	* 정보공유 게시판 신문고 수정
	* @param SS_U_INFOEXGDM
	* @return boolean
	* @throws AppException
	*/

	public boolean updateInfoexg(SS_U_INFOEXGDM dm) throws AppException{
    	boolean ret = false;
       	// 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // 임시 순번
           	byte[] tempCont;    // 임시 첨부파일 내용
           	tempCont = dm.filecont;
           	DBManager manager = null;
           	try {
               	manager = new DBManager("Oracle");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	// 파라미터 설정
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
				cstmt.setBytes(22, "1010".getBytes());  // 임시 바이트 배열
				cstmt.setString(23, dm.chgpers);
				cstmt.registerOutParameter(24, Types.VARCHAR);
               	// 실행
               	cstmt.execute();
               	// 결과
               	SS_U_INFOEXGDataSet ds = (SS_U_INFOEXGDataSet)dm.createDataSetObject();
               	ds.getValues(cstmt);

               	if(!"".equals(ds.errcode)){
               	    throw new AppException(ds.errcode, ds.errmsg);
               	}
               	// 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
               	tempSeq = ds.getSeq();
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               	String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
               	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

               	if (rset.next()) {
                   	weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                   	BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
          	   		//레진용(ep1)
          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	                   	
                   	OutputStream os = oracle_blob.getBinaryOutputStream();
                   	// 파일로부터 읽어서 BLOB 에 WRITE 한다.
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
	* 정보공유 게시판 신문고 삭제
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
	* 정보공유 게시판 신문고 상세정보 조회
	* @param SS_S_INFOEXGDM
	* @return 정보공유 게시판 신문고 상세정보 DataSet
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
	* 정보공유 게시판 신문고 답변등록
	* @param SS_I_INFOEXG_ANSWERDM
	* @return boolean
	* @throws AppException
	*/

	public boolean insertAnswerInfoexg(SS_I_INFOEXG_ANSWERDM dm) throws AppException{
    	boolean ret = false;
       	// 첨부파일이 존재할 경우 첨부파일의 내용을 임시로 저장한다.
       	if (dm.filecont != null && dm.filecont.length != 0) {
           	String tempSeq;     // 임시 순번
           	byte[] tempCont;    // 임시 첨부파일 내용
           	tempCont = dm.filecont;
           	DBManager manager = null;
           	try {
               	manager = new DBManager("Oracle");
               	manager.getConnection();
               	manager.m_conn.setAutoCommit(false);
               	CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               	// 파라미터 설정
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
                   cstmt.setBytes(28, "1010".getBytes());  // 임시 바이트 배열
                   cstmt.setString(29, dm.incmgpers);
                   cstmt.registerOutParameter(30, Types.VARCHAR);
               	// 실행
               	cstmt.execute();
               	// 결과
               	SS_I_INFOEXG_ANSWERDataSet ds = (SS_I_INFOEXG_ANSWERDataSet)dm.createDataSetObject();
               	ds.getValues(cstmt);

               	if(!"".equals(ds.errcode)){
               	    throw new AppException(ds.errcode, ds.errmsg);
               	}
               	// 첨부파일 내용을 제외한 데이터를 등록하고 순번값을 얻는다.
               	tempSeq = ds.getSeq();
               	// BLOB 구하기
               	Statement stmt = manager.m_conn.createStatement();
               	String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
               	OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

               	if (rset.next()) {
                   	weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                   	BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
          	   		//레진용(ep1)
          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                   	OutputStream os = oracle_blob.getBinaryOutputStream();
                   	// 파일로부터 읽어서 BLOB 에 WRITE 한다.
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
	* 정보공유 게시판 신문고 다운로드
	* @param SS_S_INFOEXG_DWLOADDM
	* @return 정보공유 게시판 공지사항 다운로드 DataSet
	* @throws AppException
	*/

	public SS_S_INFOEXG_DWLOADDataSet dwloadInfoexg(SS_S_INFOEXG_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INFOEXG_DWLOADDataSet ds = (SS_S_INFOEXG_DWLOADDataSet)manager.executeCall(dm);
        // 파일크기만큼 byte[] 생성
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
      	   		//레진용(ep1)
      	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                InputStream is = oracle_blob.getBinaryStream();
                // 파일로부터 읽어서 BLOB 에 WRITE 한다.
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
	* 정보공유 게시판 신문고 추천
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
