/***************************************************************************************************
 * 파일명 : SE_RCP_1400DAO.java
 * 기능 : 입금관리-외환입금등록
 * 작성일자 : 2009-04-30
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
public class SE_RCP_1400DAO {
	
	public SE_RCP_1400_MDataSet se_rcp_1400_m(SE_RCP_1400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1400_MDataSet ds = (SE_RCP_1400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1410_LDataSet se_rcp_1410_l(SE_RCP_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1410_LDataSet ds = (SE_RCP_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1420_LDataSet se_rcp_1420_l(SE_RCP_1420_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1420_LDataSet ds = (SE_RCP_1420_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1430_LDataSet se_rcp_1430_l(SE_RCP_1430_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1430_LDataSet ds = (SE_RCP_1430_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1440_ADataSet se_rcp_1440_a(SE_RCP_1440_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1440_ADataSet ds = (SE_RCP_1440_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_RCP_1450_ADataSet se_rcp_1450_a(SE_RCP_1450_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_RCP_1450_ADataSet ds = (SE_RCP_1450_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
