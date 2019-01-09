/***************************************************************************************************
 * ���ϸ� : PL_RCP_3500DAO.java
 * ��� : �Աݰ���-��������Ȳ
 * �ۼ����� : 2009.04.28
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
public class PL_RCP_3500DAO {
	
    /**
     * ����
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
     * ��ȸ(��1)
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
     * ��ȸ(��2)
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
