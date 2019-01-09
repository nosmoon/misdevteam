/***************************************************************************************************
 * 파일명 : SE_RCP_1100DAO.java
 * 기능 : (가상계좌)입금전환
 * 작성일자 : 2009-04-15
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
public class SE_RCP_1100DAO {
	
	public SE_RCP_1100_MDataSet se_rcp_1100_m(SE_RCP_1100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1100_MDataSet ds = (SE_RCP_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1110_LDataSet se_rcp_1110_l(SE_RCP_1110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1110_LDataSet ds = (SE_RCP_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1120_LDataSet se_rcp_1120_l(SE_RCP_1120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1120_LDataSet ds = (SE_RCP_1120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1130_ADataSet se_rcp_1130_a(SE_RCP_1130_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1130_ADataSet ds = (SE_RCP_1130_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_RCP_1140_ADataSet se_rcp_1140_a(SE_RCP_1140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1140_ADataSet ds = (SE_RCP_1140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
