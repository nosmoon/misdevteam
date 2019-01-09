/***************************************************************************************************
 * 파일명 : SSBrinfo1200DAO.java
 * 기능 : 지국Info-지국장정보을 위한 DAO
 * 작성일자 : 2004-02-09
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-지국장정보를 위한 DAO
 */
public class SSBrinfo1200DAO {

    /**
     * 지국Info-지국장정보 초기화
     * @param dm SS_L_BO_HEAD_INITDM 객체
     * @return SS_L_BO_HEAD_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_BO_HEAD_INITDataSet selectInitList(SS_L_BO_HEAD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_HEAD_INITDataSet ds = (SS_L_BO_HEAD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국장정보 조회
     * @param dm SS_L_BO_HEADDM 객체
     * @return SS_L_BO_HEADDataSet 객체
     * @throws AppException
     */
    public SS_L_BO_HEADDataSet selectBoheadList(SS_L_BO_HEADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_HEADDataSet ds = (SS_L_BO_HEADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국장정보 상세
     * @param dm SS_S_BO_HEADDM 객체
     * @return SS_S_BO_HEADDataSet 객체
     * @throws AppException
     */
    public SS_S_BO_HEADDataSet selectBoheadDetail(SS_S_BO_HEADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_HEADDataSet ds = (SS_S_BO_HEADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국장정보 사진
     * @param prn String
     * @return byte[]
     * @throws AppException
     */
    public byte[] selectBoheadSajin(String prn) throws AppException {
        byte[] sajin = null;
        try{
            DBManager manager = new DBManager("Oracle");
            manager.getConnection();
            Statement stmt = manager.m_conn.createStatement();
            String blobQuery = "SELECT SAJGJSAJIN, SASIZE FROM ST_JGJSAJIN WHERE SAJUMINNO = '"+prn+"' FOR UPDATE";
            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

            if (rset.next()) {
                int size = rset.getInt(2);//사진크기
                sajin = new byte[size];
                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);

                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
      	   		//레진용(ep1)
      	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                
                InputStream is = oracle_blob.getBinaryStream();
                // 파일로부터 읽어서 BLOB 에 WRITE 한다.
                int b;
                int count = 0;
                while( (b = is.read()) != -1 ) {
                    sajin[count++] = (byte)b;
                }
                is.close();
            }

            stmt.close();
            manager.disConnection();
        }catch(SQLException sqle){
            throw new AppException("[SSBrinfo1200DAO.selectBoheadSajin()]","[SSBrinfo1200DAO.selectBoheadSajin()] 지국상사진정보를 얻을 수 없습니다.");
        }catch(IOException ioe){
            throw new AppException("[SSBrinfo1200DAO.selectBoheadSajin()]","[SSBrinfo1200DAO.selectBoheadSajin()] 지국상사진정보를 얻을 수 없습니다.");
        }catch(Exception e){
        e.printStackTrace();
        }

        return sajin;
    }

    /**
     * 지국Info-지국장정보 수정
     * @param dm SS_S_BO_HEADDM 객체
     * @return SS_S_BO_HEADDataSet 객체
     * @throws AppException
     */
	public boolean updateBohead(SS_U_BO_HEADDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_U_BO_HEADDataSet ds = (SS_U_BO_HEADDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

    /**
     * 지국Info-지국장정보-지국장소견-목록
     * @param dm SS_L_BO_HEADIDEADM
     * @return SS_L_BO_HEADIDEADataSet
     * @throws AppException
     */
    public SS_L_BO_HEADIDEADataSet selectBoheadIdeaList(SS_L_BO_HEADIDEADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_HEADIDEADataSet ds = (SS_L_BO_HEADIDEADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국장정보-지국장소견-상세
     * @param dm SS_S_BO_HEADIDEADM
     * @return SS_S_BO_HEADIDEADataSet
     * @throws AppException
     */
    public SS_S_BO_HEADIDEADataSet selectBoheadIdeaDetail(SS_S_BO_HEADIDEADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BO_HEADIDEADataSet ds = (SS_S_BO_HEADIDEADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국장정보-지국장소견-등록,수정,삭제
     * @param dm SS_A_BO_HEADIDEADM
     * @return SS_A_BO_HEADIDEADataSet
     * @throws AppException
     */
    public SS_A_BO_HEADIDEADataSet accessBoheadIdea(SS_A_BO_HEADIDEADM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_A_BO_HEADIDEADataSet ds = (SS_A_BO_HEADIDEADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}