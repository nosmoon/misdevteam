/***************************************************************************************************
 * ���ϸ� : SE_RCP_1700DAO.java
 * ��� : �Աݰ���-����������ȯ��
 * �ۼ����� : 2009-05-14
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */
public class SE_RCP_1700DAO {
	
	public SE_RCP_1700_MDataSet se_rcp_1700_m(SE_RCP_1700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1700_MDataSet ds = (SE_RCP_1700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1710_LDataSet se_rcp_1710_l(SE_RCP_1710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1710_LDataSet ds = (SE_RCP_1710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1720_LDataSet se_rcp_1720_l(SE_RCP_1720_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1720_LDataSet ds = (SE_RCP_1720_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1730_LDataSet se_rcp_1730_l(SE_RCP_1730_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1730_LDataSet ds = (SE_RCP_1730_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1740_ADataSet se_rcp_1740_a(SE_RCP_1740_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1740_ADataSet ds = (SE_RCP_1740_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1750_ADataSet se_rcp_1750_a(SE_RCP_1750_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1750_ADataSet ds = (SE_RCP_1750_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
