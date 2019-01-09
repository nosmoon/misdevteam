/***************************************************************************************************
 * ���ϸ� : PL_RCP_1000DAO.java
 * ��� : �Աݰ���-�Աݵ�ϰ���
 * �ۼ����� : 2009.04.15
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
public class PL_RCP_1000DAO {
	
    /**
     * ����
     * @param PL_RCP_1000_MDM
     * @return PL_RCP_1000_MDataSet
     */
    public PL_RCP_1000_MDataSet pl_rcp_1000_m(PL_RCP_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1000_MDataSet ds = (PL_RCP_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RCP_1010_LDM
     * @return PL_RCP_1010_LDataSet
     */
    public PL_RCP_1010_LDataSet pl_rcp_1010_l(PL_RCP_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1010_LDataSet ds = (PL_RCP_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_RCP_1020_LDM
     * @return PL_RCP_1020_LDataSet
     */
    public PL_RCP_1020_LDataSet pl_rcp_1020_l(PL_RCP_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1020_LDataSet ds = (PL_RCP_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ݹ׸���������ȸ
     * @param PL_RCP_1030_LDM
     * @return PL_RCP_1030_LDataSet
     */
    public PL_RCP_1030_LDataSet pl_rcp_1030_l(PL_RCP_1030_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1030_LDataSet ds = (PL_RCP_1030_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_RCP_1040_ADM
     * @return PL_RCP_1040_ADataSet
     */
    public PL_RCP_1040_ADataSet pl_rcp_1040_a(PL_RCP_1040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1040_ADataSet ds = (PL_RCP_1040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
