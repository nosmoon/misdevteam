/***************************************************************************************************
 * 파일명 : SE_RCP_1500DAO.java
 * 기능 : 입금관리-입금정정
 * 작성일자 : 2009-05-04
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.rcp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */
public class SE_RCP_1500DAO {
	
	public SE_RCP_1500_MDataSet se_rcp_1500_m(SE_RCP_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1500_MDataSet ds = (SE_RCP_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1510_LDataSet se_rcp_1510_l(SE_RCP_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1510_LDataSet ds = (SE_RCP_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1520_LDataSet se_rcp_1520_l(SE_RCP_1520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1520_LDataSet ds = (SE_RCP_1520_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1530_LDataSet se_rcp_1530_l(SE_RCP_1530_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1530_LDataSet ds = (SE_RCP_1530_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1540_ADataSet se_rcp_1540_a(SE_RCP_1540_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1540_ADataSet ds = (SE_RCP_1540_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1550_ADataSet se_rcp_1550_a(SE_RCP_1550_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1550_ADataSet ds = (SE_RCP_1550_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}
