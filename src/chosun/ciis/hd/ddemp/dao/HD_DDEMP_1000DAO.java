/***************************************************************************************************
* 파일명 : HD_DWNWRK_1000DAO.java
* 기능 : 일용직관리
* 작성일자 : 2009.04.23
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.ddemp.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;
 
/**
 * 
 */
public class HD_DDEMP_1000DAO {
	public HD_DDEMP_1000_LDataSet hd_ddemp_1000_l(HD_DDEMP_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1000_LDataSet ds = (HD_DDEMP_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1001_LDataSet hd_ddemp_1001_l(HD_DDEMP_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1001_LDataSet ds = (HD_DDEMP_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1002_LDataSet hd_ddemp_1002_l(HD_DDEMP_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1002_LDataSet ds = (HD_DDEMP_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1003_ADataSet hd_ddemp_1003_a(HD_DDEMP_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1003_ADataSet ds = (HD_DDEMP_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DDEMP_1005_ADataSet hd_ddemp_1005_a(HD_DDEMP_1005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1005_ADataSet ds = (HD_DDEMP_1005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DDEMP_1006_DDataSet hd_ddemp_1006_d(HD_DDEMP_1006_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1006_DDataSet ds = (HD_DDEMP_1006_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_DDEMP_1007_LDataSet hd_ddemp_1007_l(HD_DDEMP_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1007_LDataSet ds = (HD_DDEMP_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1009_LDataSet hd_ddemp_1009_l(HD_DDEMP_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1009_LDataSet ds = (HD_DDEMP_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1010_LDataSet hd_ddemp_1010_l(HD_DDEMP_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1010_LDataSet ds = (HD_DDEMP_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1103_ADataSet hd_ddemp_1103_a(HD_DDEMP_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1103_ADataSet ds = (HD_DDEMP_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1104_ADataSet hd_ddemp_1104_a(HD_DDEMP_1104_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1104_ADataSet ds = (HD_DDEMP_1104_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_1105_LDataSet hd_ddemp_1105_l(HD_DDEMP_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_1105_LDataSet ds = (HD_DDEMP_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	 
	
	public HD_DDEMP_3000_LDataSet hd_ddemp_3000_l(HD_DDEMP_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_3000_LDataSet ds = (HD_DDEMP_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DDEMP_3001_ADataSet hd_ddemp_3001_a(HD_DDEMP_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DDEMP_3001_ADataSet ds = (HD_DDEMP_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

