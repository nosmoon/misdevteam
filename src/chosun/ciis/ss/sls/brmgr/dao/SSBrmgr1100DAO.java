/***************************************************************************************************
 * 파일명 : SSBrmgr1100DAO.java
 * 기능 : 지국경영-마일리지현황 위한 DAO
 * 작성일자 : 2004-03-12
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;

/**
 * 지국경영-마일리지현황 위한 DAO
 */
public class SSBrmgr1100DAO {

    /**
     * 지국경영-마일리지현황 초기화
     * @param dm SS_L_MIGLLMMTCLOS_INITDM 객체
     * @return SS_L_MIGLLMMTCLOS_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_MIGLLMMTCLOS_INITDataSet selectInitList(SS_L_MIGLLMMTCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLLMMTCLOS_INITDataSet ds = (SS_L_MIGLLMMTCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국경영-마일리지현황 조회
     * @param dm SS_L_MIGLLMMTCLOSDM 객체
     * @return SS_L_MIGLLMMTCLOSDataSet 객체
     * @throws AppException
     */
    public SS_L_MIGLLMMTCLOSDataSet selectMigllmmtclosList(SS_L_MIGLLMMTCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLLMMTCLOSDataSet ds = (SS_L_MIGLLMMTCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 지국경영-마일리지현황 상세
     * @param dm SS_L_MILGPAYDM 객체
     * @return SS_L_MILGPAYDataSet 객체
     * @throws AppException
     */
    public SS_L_MILGPAYDataSet selectMilgpayDetail(SS_L_MILGPAYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MILGPAYDataSet ds = (SS_L_MILGPAYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}