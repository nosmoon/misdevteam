/***************************************************************************************************
 * 파일명 : SE_BOI_2500DAO.java
 * 기능 : 해약관리 - 정리구좌입금
 * 작성일자 : 2009-05-28
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_2500DAO {
	
	public SE_BOI_2500_MDataSet se_boi_2500_m(SE_BOI_2500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2500_MDataSet ds = (SE_BOI_2500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2510_LDataSet se_boi_2510_l(SE_BOI_2510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2510_LDataSet ds = (SE_BOI_2510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2520_LDataSet se_boi_2520_l(SE_BOI_2520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2520_LDataSet ds = (SE_BOI_2520_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2530_LDataSet se_boi_2530_l(SE_BOI_2530_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2530_LDataSet ds = (SE_BOI_2530_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2540_ADataSet se_boi_2540_a(SE_BOI_2540_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2540_ADataSet ds = (SE_BOI_2540_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_2550_ADataSet se_boi_2550_a(SE_BOI_2550_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_2550_ADataSet ds = (SE_BOI_2550_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
