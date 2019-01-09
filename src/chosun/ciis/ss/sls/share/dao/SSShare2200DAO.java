/***************************************************************************************************
* 파일명 : SSShare2200DAO.java
* 기능 : 판매국메인 처리를 위한 DAO
* 작성일자 : 2004-04-21
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
 * 판매국메인 위한 DAO
 */
public class SSShare2200DAO {

    /**
     * 판매국메인-초기화면
     * @param dm SS_L_MAIN_INITDM 객체
     * @return SS_L_MAIN_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_MAIN_INITDataSet selectMainInit(SS_L_MAIN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MAIN_INITDataSet ds = (SS_L_MAIN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 판매국메인-달력-월별일정 조회
     * @param SS_L_MONTH_SCHEDM 객체
     * @return SS_L_MONTH_SCHEDataSet 객체
     * @throws AppException
     */
    public SS_L_MONTH_SCHEDataSet selectMonthScheList(SS_L_MONTH_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MONTH_SCHEDataSet ds = (SS_L_MONTH_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 판매국메인-달력-일별일정 조회
     * @param SS_L_DAY_SCHEDM 객체
     * @return SS_L_DAY_SCHEDataSet 객체
     * @throws AppException
     */
    public SS_L_DAY_SCHEDataSet selectDayScheList(SS_L_DAY_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_DAY_SCHEDataSet ds = (SS_L_DAY_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
	* 판매국메인-공지사항-상세
	* @param SS_S_ANNCDM 객체
	* @return SS_S_ANNCDataSet 객체
	* @throws AppException
	*/
	public SS_S_ANNCDataSet selectAnncDetail(SS_S_ANNCDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_ANNCDataSet ds = (SS_S_ANNCDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* 판매국메인-공지사항-다운로드
	* @param SS_S_INFOEXG_DWLOADDM 객체
	* @return SS_S_INFOEXG_DWLOADDataSet 객체
	* @throws AppException
	*/
	public SS_S_INFOEXG_DWLOADDataSet dwloadAnnc(SS_S_INFOEXG_DWLOADDM dm) throws AppException {
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
     * 판매국메인-실시간공지-목록
     * @param dm SS_L_ANNCSLSDM
     * @return SS_L_ANNCSLSDataSet
    * @throws AppException
    */
    public SS_L_ANNCSLSDataSet selectAnncslsList(SS_L_ANNCSLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ANNCSLSDataSet ds = (SS_L_ANNCSLSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 판매국메인-실시간공지-상세
     * @param dm SS_S_ANNCSLSDM
     * @return SS_S_ANNCSLSDataSet
    * @throws AppException
    */
    public SS_S_ANNCSLSDataSet selectAnncslsDetail(SS_S_ANNCSLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ANNCSLSDataSet ds = (SS_S_ANNCSLSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
