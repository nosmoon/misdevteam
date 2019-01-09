/***************************************************************************************************
 * 파일명 : SSReader1100DAO.java
 * 기능 : 독자현황-독자불편을 위한 DAO
 * 작성일자 : 2004-01-12
 * 작성자 : 고윤홍
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-독자불편를 위한 DAO
 */
public class SSReader11100DAO {

    /**
     * 독자현황-독자불편 초기화
     * @param dm SS_L_RDR_DSCT_INITDM 객체
     * @return SS_L_RDR_DSCT_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_RDR_DSCT_INITDataSet mo_selectInitList(SS_L_RDR_DSCT_INITDM dm) throws AppException { //모바일
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * 독자현황-독자불편 조회
     * @param dm SS_MO_L_RDR_DSCTDM 객체
     * @return SS_MO_L_RDR_DSCTDataSet 객체
     * @throws AppException
     */
    public SS_MO_L_RDR_DSCTDataSet mo_selectRdrDsctList(SS_MO_L_RDR_DSCTDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_RDR_DSCTDataSet ds = (SS_MO_L_RDR_DSCTDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * 독자현황-독자불편 상세
     * @param dm SS_S_RDR_DSCTDM 객체
     * @return SS_S_RDR_DSCTDataSet 객체
     * @throws AppException
     */
    public SS_S_RDR_DSCTDataSet mo_selectRdrDsctDetail(SS_S_RDR_DSCTDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}