/***************************************************************************************************
 * 파일명 : PL_RCP_3100DAO.java
 * 기능 : 입금관리-수납별입금명세서
 * 작성일자 : 2009.04.24
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */
public class PL_RCP_3100DAO {
	
    /**
     * 메인
     * @param PL_RCP_3100_MDM
     * @return PL_RCP_3100_MDataSet
     */
    public PL_RCP_3100_MDataSet pl_rcp_3100_m(PL_RCP_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3100_MDataSet ds = (PL_RCP_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RCP_3110_LDM
     * @return PL_RCP_3110_LDataSet
     */
    public PL_RCP_3110_LDataSet pl_rcp_3110_l(PL_RCP_3110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3110_LDataSet ds = (PL_RCP_3110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
