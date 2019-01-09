/***************************************************************************************************
* 파일명 : SSExtn1000DAO.java
* 기능 : 확장신청을 위한 DAO
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSExtn1000DAO {
    /**
     * 확장현황-신청현황 초기화면
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_XTN_INITDataSet init(SS_L_RDR_XTN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_XTN_INITDataSet ds = (SS_L_RDR_XTN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-신청현황 확장자소속 목록
     * @param dm SS_L_EXTNBLNGCDDM
     * @return SS_L_EXTNBLNGCDDataSet
     * @throws AppException
     */
    public SS_L_EXTNBLNGCDDataSet selectExtnBlngCodeList(SS_L_EXTNBLNGCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTNBLNGCDDataSet ds = (SS_L_EXTNBLNGCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-신청현황 확장신청 목록
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_RDR_EXTNDataSet selectRdrExtnList(SS_L_RDR_EXTNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_EXTNDataSet ds = (SS_L_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-신청현황 확장신청 상세
     * @param dm SS_S_RDR_EXTNDM
     * @return SS_S_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_S_RDR_EXTNDataSet selectRdrExtnDetail(SS_S_RDR_EXTNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_EXTNDataSet ds = (SS_S_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-신청현황 확장신청 목록
     * @param dm SS_L_ON_RDR_EXTNDM
     * @return SS_L_ON_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_ON_RDR_EXTNDataSet selectOnlineExtnList(SS_L_ON_RDR_EXTNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_ON_RDR_EXTNDataSet ds = (SS_L_ON_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-신청현황 온라인 확장신청 상세
     * @param  dm SS_S_ON_RDR_EXTNDM
     * @return ds SS_S_ON_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_S_ON_RDR_EXTNDataSet selectOnlineExtnDetail(SS_S_ON_RDR_EXTNDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_S_ON_RDR_EXTNDataSet ds = (SS_S_ON_RDR_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 확장현황-제휴확장현황 초기화면
     * @param dm SS_L_RDR_JM_EXTN_INITDM
     * @return SS_L_RDR_JM_EXTN_INITDataSet
     * @throws AppException
     */
    public SS_L_RDR_JM_EXTN_INITDataSet jminit(SS_L_RDR_JM_EXTN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_JM_EXTN_INITDataSet ds = (SS_L_RDR_JM_EXTN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
