/***************************************************************************************************
 * ���ϸ� : PL_RCP_3200DAO.java
 * ��� : �Աݰ���-���꺰�Աݸ���
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
public class PL_RCP_3200DAO {
	
    /**
     * ����
     * @param PL_RCP_3200_MDM
     * @return PL_RCP_3200_MDataSet
     */
    public PL_RCP_3200_MDataSet pl_rcp_3200_m(PL_RCP_3200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3200_MDataSet ds = (PL_RCP_3200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RCP_3210_LDM
     * @return PL_RCP_3210_LDataSet
     */
    public PL_RCP_3210_LDataSet pl_rcp_3210_l(PL_RCP_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_3210_LDataSet ds = (PL_RCP_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
