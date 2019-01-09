/***************************************************************************************************
 * 파일명 : SSBrinfo1000DAO.java
 * 기능 : 지국Info-지국찾기를 위한 DAO
 * 작성일자 : 2004-02-27
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-지국찾기를 위한 DAO
 */
public class SSBrinfo1000DAO {

    /**
     * 지국Info-지국찾기-초기화면
     * @param dm SS_L_BO_SRCH_INITDM 객체
     * @return SS_L_BO_SRCH_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_BO_SRCH_INITDataSet selectInitList(SS_L_BO_SRCH_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_SRCH_INITDataSet ds = (SS_L_BO_SRCH_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국찾기-목록
     * @param dm SS_L_BO_SRCH2DM 객체
     * @return SS_L_BO_SRCH2DataSet 객체
     * @throws AppException
     */
    public SS_L_BO_SRCH2DataSet selectBoSrchList(SS_L_BO_SRCH2DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_SRCH2DataSet ds = (SS_L_BO_SRCH2DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국우편번호-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_JUSO_BO_INITDataSet initBoZip(SS_L_JUSO_BO_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_JUSO_BO_INITDataSet ds = (SS_L_JUSO_BO_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-지국우편번호-목록
     * @param dm SS_L_JUSO_BODM
     * @return SS_L_JUSO_BODataSet
     * @throws AppException
     */
    public SS_L_JUSO_BODataSet selectBoZipList(SS_L_JUSO_BODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_JUSO_BODataSet ds = (SS_L_JUSO_BODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}