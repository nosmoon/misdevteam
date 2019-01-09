/***************************************************************************************************
 * ���ϸ� : PL_RCP_3000DAO.java
 * ��� : �Աݰ���-�Ա���ǥ��ȸ
 * �ۼ����� : 2009.04.24
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
public class PL_RCP_3000DAO {
	
    /**
     * ��ȸ
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
