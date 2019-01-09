/***************************************************************************************************
* 파일명 : SE_BNS_2100DAO.java
* 기능 : 판촉물관리 - 판촉물 입금등록
* 작성일자 : 2009-05-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.bns.dao;

import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_BNS_2100DAO {
	
	public SE_BNS_2100_MDataSet se_bns_2100_m(SE_BNS_2100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2100_MDataSet ds = (SE_BNS_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BNS_2110_LDataSet se_bns_2110_l(SE_BNS_2110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2110_LDataSet ds = (SE_BNS_2110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BNS_2120_LDataSet se_bns_2120_l(SE_BNS_2120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2120_LDataSet ds = (SE_BNS_2120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BNS_2130_LDataSet se_bns_2130_l(SE_BNS_2130_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2130_LDataSet ds = (SE_BNS_2130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BNS_2140_ADataSet se_bns_2140_a(SE_BNS_2140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2140_ADataSet ds = (SE_BNS_2140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BNS_2150_ADataSet se_bns_2150_a(SE_BNS_2150_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BNS_2150_ADataSet ds = (SE_BNS_2150_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
