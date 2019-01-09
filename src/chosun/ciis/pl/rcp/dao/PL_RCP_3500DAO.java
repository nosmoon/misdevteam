/***************************************************************************************************
 * 파일명 : PL_RCP_3500DAO.java
 * 기능 : 입금관리-보증금현황
 * 작성일자 : 2009.04.28
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
public class PL_RCP_3500DAO {
	
    /**
     * 메인
     * @param PL_RCP_3500_MDM
     * @return PL_RCP_3500_MDataSet
     */
    public PL_RCP_3500_MDataSet pl_rcp_3500_m(PL_RCP_3500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3500_MDataSet ds = (PL_RCP_3500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회(텝1)
     * @param PL_RCP_3510_LDM
     * @return PL_RCP_3510_LDataSet
     */
    public PL_RCP_3510_LDataSet pl_rcp_3510_l(PL_RCP_3510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3510_LDataSet ds = (PL_RCP_3510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회(텝2)
     * @param PL_RCP_3520_LDM
     * @return PL_RCP_3520_LDataSet
     */
    public PL_RCP_3520_LDataSet pl_rcp_3520_l(PL_RCP_3520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3520_LDataSet ds = (PL_RCP_3520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
