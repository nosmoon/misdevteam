/***************************************************************************************************
 * 파일명 : PL_RCP_3000DAO.java
 * 기능 : 입금관리-입금전표조회
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
public class PL_RCP_3000DAO {
	
    /**
     * 조회
     * @param PL_RCP_3010_LDM
     * @return PL_RCP_3010_LDataSet
     */
    public PL_RCP_3010_LDataSet pl_rcp_3010_l(PL_RCP_3010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3010_LDataSet ds = (PL_RCP_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
