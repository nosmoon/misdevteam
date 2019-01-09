/***************************************************************************************************
 * 파일명 : SE_RCP_1200DAO.java
 * 기능 : 입금관리-입금등록
 * 작성일자 : 2009-04-22
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
public class SE_RCP_1200DAO {
	
	public SE_RCP_1200_MDataSet se_rcp_1200_m(SE_RCP_1200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1200_MDataSet ds = (SE_RCP_1200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1210_LDataSet se_rcp_1210_l(SE_RCP_1210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1210_LDataSet ds = (SE_RCP_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1220_LDataSet se_rcp_1220_l(SE_RCP_1220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1220_LDataSet ds = (SE_RCP_1220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1230_LDataSet se_rcp_1230_l(SE_RCP_1230_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1230_LDataSet ds = (SE_RCP_1230_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1240_ADataSet se_rcp_1240_a(SE_RCP_1240_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1240_ADataSet ds = (SE_RCP_1240_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1250_ADataSet se_rcp_1250_a(SE_RCP_1250_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1250_ADataSet ds = (SE_RCP_1250_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
