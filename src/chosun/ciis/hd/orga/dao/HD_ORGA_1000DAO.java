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

package chosun.ciis.hd.orga.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */
public class HD_ORGA_1000DAO {
	
	public HD_ORGA_1001_LDataSet getHd_orga_1001(HD_ORGA_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	    HD_ORGA_1001_LDataSet ds = (HD_ORGA_1001_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_ORGA_1002_LDataSet getHd_orga_1002(HD_ORGA_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	    HD_ORGA_1002_LDataSet ds = (HD_ORGA_1002_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_ORGA_1003_LDataSet getHd_orga_1003(HD_ORGA_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	    HD_ORGA_1003_LDataSet ds = (HD_ORGA_1003_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}

	public HD_ORGA_1004_LDataSet hd_orga_1004_l(HD_ORGA_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1004_LDataSet ds = (HD_ORGA_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1005_ADataSet hd_orga_1005_a(HD_ORGA_1005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1005_ADataSet ds = (HD_ORGA_1005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1006_ADataSet hd_orga_1006_a(HD_ORGA_1006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1006_ADataSet ds = (HD_ORGA_1006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1007_LDataSet hd_orga_1007_l(HD_ORGA_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1007_LDataSet ds = (HD_ORGA_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1009_LDataSet hd_orga_1009_l(HD_ORGA_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1009_LDataSet ds = (HD_ORGA_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1010_LDataSet hd_orga_1010_l(HD_ORGA_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1010_LDataSet ds = (HD_ORGA_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1101_LDataSet hd_orga_1101_l(HD_ORGA_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1101_LDataSet ds = (HD_ORGA_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public BaseDataSet getHd_orga_1102(HD_ORGA_1102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		BaseDataSet ds = (BaseDataSet) manager.executeCall(dm);

		if (!"".equals(ds.getErrcode())) {
            throw new AppException(ds.getErrcode(), ds.getErrmsg());
        }
	    return ds;
	}

	public HD_ORGA_1103_ADataSet hd_orga_1103_a(HD_ORGA_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1103_ADataSet ds = (HD_ORGA_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1202_LDataSet getHd_orga_1202(HD_ORGA_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	    HD_ORGA_1202_LDataSet ds = (HD_ORGA_1202_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_ORGA_1203_LDataSet getHd_orga_1203(HD_ORGA_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
	    HD_ORGA_1203_LDataSet ds = (HD_ORGA_1203_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_ORGA_1204_ADataSet hd_orga_1204_a(HD_ORGA_1204_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1204_ADataSet ds = (HD_ORGA_1204_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1205_LDataSet hd_orga_1205_l(HD_ORGA_1205_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1205_LDataSet ds = (HD_ORGA_1205_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1206_LDataSet hd_orga_1206_l(HD_ORGA_1206_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1206_LDataSet ds = (HD_ORGA_1206_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1207_ADataSet hd_orga_1207_a(HD_ORGA_1207_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1207_ADataSet ds = (HD_ORGA_1207_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1208_ADataSet hd_orga_1208_a(HD_ORGA_1208_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1208_ADataSet ds = (HD_ORGA_1208_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1209_ADataSet hd_orga_1209_a(HD_ORGA_1209_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1209_ADataSet ds = (HD_ORGA_1209_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_ORGA_1300_LDataSet hd_orga_1300_l(HD_ORGA_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1300_LDataSet ds = (HD_ORGA_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_ORGA_1301_LDataSet hd_orga_1301_l(HD_ORGA_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1301_LDataSet ds = (HD_ORGA_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_ORGA_1302_ADataSet hd_orga_1302_a(HD_ORGA_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1302_ADataSet ds = (HD_ORGA_1302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_ORGA_1400_LDataSet hd_orga_1400_l(HD_ORGA_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1400_LDataSet ds = (HD_ORGA_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_ORGA_1401_LDataSet hd_orga_1401_l(HD_ORGA_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_ORGA_1401_LDataSet ds = (HD_ORGA_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
