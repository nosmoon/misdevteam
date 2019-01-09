/***************************************************************************************************
 * ���ϸ� : PL_RCP_1100DAO.java
 * ��� : �Աݰ���-�Աݹ�ȯó��
 * �ۼ����� : 2009.04.23
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
public class PL_RCP_1100DAO {
	
    /**
     * ����
     * @param PL_RCP_1100_MDM
     * @return PL_RCP_1100_MDataSet
     */
    public PL_RCP_1100_MDataSet pl_rcp_1100_m(PL_RCP_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1100_MDataSet ds = (PL_RCP_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_RCP_1110_LDM
     * @return PL_RCP_1110_LDataSet
     */
    public PL_RCP_1110_LDataSet pl_rcp_1110_l(PL_RCP_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1110_LDataSet ds = (PL_RCP_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����ȸ
     * @param PL_RCP_1120_LDM
     * @return PL_RCP_1120_LDataSet
     */
    public PL_RCP_1120_LDataSet pl_rcp_1120_l(PL_RCP_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1120_LDataSet ds = (PL_RCP_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �����ݹ׸���������ȸ
     * @param PL_RCP_1130_LDM
     * @return PL_RCP_1130_LDataSet
     */
    public PL_RCP_1130_LDataSet pl_rcp_1130_l(PL_RCP_1130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1130_LDataSet ds = (PL_RCP_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����/����
     * @param PL_RCP_1140_ADM
     * @return PL_RCP_1140_ADataSet
     */
    public PL_RCP_1140_ADataSet pl_rcp_1140_a(PL_RCP_1140_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_RCP_1140_ADataSet ds = (PL_RCP_1140_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
