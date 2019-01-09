/***************************************************************************************************
 * ���ϸ� : PL_COM_1100DAO.java
 * ��� : �������-��ü�˻��˾�
 * �ۼ����� : 2009.02.17
 * �ۼ��� : ����
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.pl.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */
public class PL_COM_1100DAO {
	
    /**
     * ����
     * @param PL_COM_1100_MDM
     * @return PL_COM_1100_MDataSet
     */
    public PL_COM_1100_MDataSet pl_com_1100_m(PL_COM_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1100_MDataSet ds = (PL_COM_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ��ȸ
     * @param PL_COM_1110_LDM
     * @return PL_COM_1110_LDataSet
     */
	public PL_COM_1110_LDataSet pl_com_1110_l(PL_COM_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1110_LDataSet ds = (PL_COM_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * 1����ȸ
     * @param PL_COM_1120_SDM
     * @return PL_COM_1120_SDataSet
     */
	public PL_COM_1120_SDataSet pl_com_1120_s(PL_COM_1120_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1120_SDataSet ds = (PL_COM_1120_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
