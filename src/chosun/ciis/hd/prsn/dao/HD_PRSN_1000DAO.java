/***************************************************************************************************
 * 파일명 : PilotDAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.prsn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.ds.*;

/** 
 * 
 */
public class HD_PRSN_1000DAO {
	public HD_PRSN_1000_LDataSet hd_prsn_1000_l(HD_PRSN_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_1000_LDataSet ds = (HD_PRSN_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_1001_ADataSet hd_prsn_1001_a(HD_PRSN_1001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_1001_ADataSet ds = (HD_PRSN_1001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_1002_LDataSet hd_prsn_1002_l(HD_PRSN_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_1002_LDataSet ds = (HD_PRSN_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2000_LDataSet hd_prsn_2000_l(HD_PRSN_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2000_LDataSet ds = (HD_PRSN_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2001_LDataSet hd_prsn_2001_l(HD_PRSN_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2001_LDataSet ds = (HD_PRSN_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2002_LDataSet hd_prsn_2002_l(HD_PRSN_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2002_LDataSet ds = (HD_PRSN_2002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2003_LDataSet hd_prsn_2003_l(HD_PRSN_2003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2003_LDataSet ds = (HD_PRSN_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2004_ADataSet hd_prsn_2004_a(HD_PRSN_2004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2004_ADataSet ds = (HD_PRSN_2004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2005_LDataSet hd_prsn_2005_l(HD_PRSN_2005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2005_LDataSet ds = (HD_PRSN_2005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2006_LDataSet hd_prsn_2006_l(HD_PRSN_2006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2006_LDataSet ds = (HD_PRSN_2006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2007_LDataSet hd_prsn_2007_l(HD_PRSN_2007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2007_LDataSet ds = (HD_PRSN_2007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_PRSN_2010_ADataSet hd_prsn_2010_a(HD_PRSN_2010_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRSN_2010_ADataSet ds = (HD_PRSN_2010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}