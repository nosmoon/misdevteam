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
public class SSReader2000DAO {

    /**
     * 독자현황-독자불편 초기화
     * @param dm SS_L_RDR_DSCT_INITDM 객체
     * @return SS_L_RDR_DSCT_INITDataSet 객체
     * @throws AppException
     */
    public SS_L_RDR_DSCTSTAT_INITDataSet initDsctstat(SS_L_RDR_DSCTSTAT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCTSTAT_INITDataSet ds = (SS_L_RDR_DSCTSTAT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_RDR_DSCTSTATDataSet selectDsctstat(SS_L_RDR_DSCTSTATDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCTSTATDataSet ds = (SS_L_RDR_DSCTSTATDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}