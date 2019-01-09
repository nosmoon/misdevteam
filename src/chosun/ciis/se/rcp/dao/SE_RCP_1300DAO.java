/***************************************************************************************************
 * 파일명 : SE_RCP_1300DAO.java
 * 기능 : 입금관리-대체입금등록
 * 작성일자 : 2009-04-29
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
public class SE_RCP_1300DAO {
	
	public SE_RCP_1300_MDataSet se_rcp_1300_m(SE_RCP_1300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1300_MDataSet ds = (SE_RCP_1300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1310_LDataSet se_rcp_1310_l(SE_RCP_1310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1310_LDataSet ds = (SE_RCP_1310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1320_LDataSet se_rcp_1320_l(SE_RCP_1320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1320_LDataSet ds = (SE_RCP_1320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1330_LDataSet se_rcp_1330_l(SE_RCP_1330_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1330_LDataSet ds = (SE_RCP_1330_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1340_ADataSet se_rcp_1340_a(SE_RCP_1340_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1340_ADataSet ds = (SE_RCP_1340_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1350_ADataSet se_rcp_1350_a(SE_RCP_1350_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1350_ADataSet ds = (SE_RCP_1350_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
