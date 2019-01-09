/***************************************************************************************************
 * 파일명 : SSExtn2100DAO.java
 * 기능 :
 * 작성일자 : 2009-05-20
 * 작성자 : 권정윤
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
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * 확장현황-본사확장을 위한 DAO
 */
public class SSExtn2500DAO {
    
    /**
     * 확장현황-단체확장-확장자 업로드
     * @param dm SS_I_EXTN_PATYRDRDM
     * @return SS_I_EXTN_PATYRDRDataSet
     * @throws AppException
     */
    public SS_I_EXTN_PATYRDR_NEWDataSet uploadExtn(SS_I_EXTN_PATYRDR_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_EXTN_PATYRDR_NEWDataSet ds = (SS_I_EXTN_PATYRDR_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 확장현황-단체확장-확장자 조회
     * @param dm SS_L_EXTN_PATYDM
     * @return SS_L_EXTN_PATYDataSet
     * @throws AppException
     */
    public SS_L_EXTN_PATY_NEWDataSet getUserInfo(SS_L_EXTN_PATY_NEWDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_EXTN_PATY_NEWDataSet ds = (SS_L_EXTN_PATY_NEWDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
