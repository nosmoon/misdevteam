/***************************************************************************************************
 * 파일명 : PL_RCP_3300DAO.java
 * 기능 : 입금관리-담보설정현황
 * 작성일자 : 2009.04.27
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
public class PL_RCP_3300DAO {
	
    /**
     * 메인
     * @param PL_RCP_3300_MDM
     * @return PL_RCP_3300_MDataSet
     */
    public PL_RCP_3300_MDataSet pl_rcp_3300_m(PL_RCP_3300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3300_MDataSet ds = (PL_RCP_3300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_RCP_3310_LDM
     * @return PL_RCP_3310_LDataSet
     */
    public PL_RCP_3310_LDataSet pl_rcp_3310_l(PL_RCP_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3310_LDataSet ds = (PL_RCP_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
