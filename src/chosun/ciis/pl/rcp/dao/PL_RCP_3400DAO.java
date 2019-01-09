/***************************************************************************************************
 * ���ϸ� : PL_RCP_3400DAO.java
 * ��� : �Աݰ���-�̼��϶�ǥ
 * �ۼ����� : 2009.04.27
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */
public class PL_RCP_3400DAO {
	
    /**
     * ����
     * @param PL_RCP_3400_MDM
     * @return PL_RCP_3400_MDataSet
     */
    public PL_RCP_3400_MDataSet pl_rcp_3400_m(PL_RCP_3400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3400_MDataSet ds = (PL_RCP_3400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RCP_3410_LDM
     * @return PL_RCP_3410_LDataSet
     */
    public PL_RCP_3410_LDataSet pl_rcp_3410_l(PL_RCP_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3410_LDataSet ds = (PL_RCP_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
