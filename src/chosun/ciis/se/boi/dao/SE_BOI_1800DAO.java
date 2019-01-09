/***************************************************************************************************
 * 파일명 : SE_BOI_1800DAO.java
 * 기능 : 해약관리 - 환불처리
 * 작성일자 : 2009-05-22
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
public class SE_BOI_1800DAO {
	
	public SE_BOI_1800_MDataSet se_boi_1800_m(SE_BOI_1800_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1800_MDataSet ds = (SE_BOI_1800_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1810_LDataSet se_boi_1810_l(SE_BOI_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1810_LDataSet ds = (SE_BOI_1810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1820_LDataSet se_boi_1820_l(SE_BOI_1820_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1820_LDataSet ds = (SE_BOI_1820_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1830_LDataSet se_boi_1830_l(SE_BOI_1830_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1830_LDataSet ds = (SE_BOI_1830_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_BOI_1840_ADataSet se_boi_1840_a(SE_BOI_1840_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1840_ADataSet ds = (SE_BOI_1840_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
	public SE_BOI_1850_ADataSet se_boi_1850_a(SE_BOI_1850_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1850_ADataSet ds = (SE_BOI_1850_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
