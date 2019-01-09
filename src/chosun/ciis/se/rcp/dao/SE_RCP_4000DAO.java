/***************************************************************************************************
 * ���ϸ� : SE_RCP_4000DAO.java
 * ��� : �Աݰ���-�������Աݵ��
 * �ۼ����� : 2009-05-08
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
public class SE_RCP_4000DAO {
	
	public SE_RCP_4000_MDataSet se_rcp_4000_m(SE_RCP_4000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4000_MDataSet ds = (SE_RCP_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4010_LDataSet se_rcp_4010_l(SE_RCP_4010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4010_LDataSet ds = (SE_RCP_4010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4020_LDataSet se_rcp_4020_l(SE_RCP_4020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4020_LDataSet ds = (SE_RCP_4020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4030_LDataSet se_rcp_4030_l(SE_RCP_4030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4030_LDataSet ds = (SE_RCP_4030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4040_ADataSet se_rcp_4040_a(SE_RCP_4040_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4040_ADataSet ds = (SE_RCP_4040_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_4050_ADataSet se_rcp_4050_a(SE_RCP_4050_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_4050_ADataSet ds = (SE_RCP_4050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
