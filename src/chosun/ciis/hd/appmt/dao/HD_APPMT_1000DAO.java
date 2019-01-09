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

package chosun.ciis.hd.appmt.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;
 
/**
 * 
 */
public class HD_APPMT_1000DAO {  
	 
	public HD_APPMT_1000_LDataSet getHd_appmt_1000(HD_APPMT_1000_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1000_LDataSet ds = (HD_APPMT_1000_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_APPMT_1001_LDataSet getHd_appmt_1001(HD_APPMT_1001_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1001_LDataSet ds = (HD_APPMT_1001_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	
	public HD_APPMT_1011_LDataSet getHd_appmt_1011(HD_APPMT_1011_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1011_LDataSet ds = (HD_APPMT_1011_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
	public HD_APPMT_1002_LDataSet getHd_appmt_1002(HD_APPMT_1002_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1002_LDataSet ds = (HD_APPMT_1002_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}
 
	public HD_APPMT_1003_ADataSet getHd_appmt_1003(HD_APPMT_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1003_ADataSet ds = (HD_APPMT_1003_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}	

	public HD_APPMT_1013_ADataSet getHd_appmt_1013(HD_APPMT_1013_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1013_ADataSet ds = (HD_APPMT_1013_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}	
	
	public HD_APPMT_1004_UDataSet getHd_appmt_1004(HD_APPMT_1004_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1004_UDataSet ds = (HD_APPMT_1004_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
	
	public HD_APPMT_1005_LDataSet hd_appmt_1005_l(HD_APPMT_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1005_LDataSet ds = (HD_APPMT_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1006_LDataSet hd_appmt_1006_l(HD_APPMT_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1006_LDataSet ds = (HD_APPMT_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1007_LDataSet hd_appmt_1007_l(HD_APPMT_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1007_LDataSet ds = (HD_APPMT_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1008_LDataSet hd_appmt_1008_l(HD_APPMT_1008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1008_LDataSet ds = (HD_APPMT_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1100_LDataSet getHd_appmt_1100(HD_APPMT_1100_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1100_LDataSet ds = (HD_APPMT_1100_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}	
 
	public HD_APPMT_1101_UDataSet getHd_appmt_1101(HD_APPMT_1101_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1101_UDataSet ds = (HD_APPMT_1101_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
 
	public HD_APPMT_1102_UDataSet getHd_appmt_1102(HD_APPMT_1102_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1102_UDataSet ds = (HD_APPMT_1102_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
 
	public HD_APPMT_1103_UDataSet getHd_appmt_1103(HD_APPMT_1103_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1103_UDataSet ds = (HD_APPMT_1103_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
 
	public HD_APPMT_1104_UDataSet getHd_appmt_1104(HD_APPMT_1104_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1104_UDataSet ds = (HD_APPMT_1104_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
	
	public HD_APPMT_1200_LDataSet getHd_appmt_1200(HD_APPMT_1200_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1200_LDataSet ds = (HD_APPMT_1200_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}	
	
	public HD_APPMT_1201_LDataSet getHd_appmt_1201(HD_APPMT_1201_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1201_LDataSet ds = (HD_APPMT_1201_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}	
 
	public HD_APPMT_1202_ADataSet getHd_appmt_1202(HD_APPMT_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1202_ADataSet ds = (HD_APPMT_1202_ADataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}	

	public HD_APPMT_1203_UDataSet getHd_appmt_1203(HD_APPMT_1203_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1203_UDataSet ds = (HD_APPMT_1203_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
	
	public HD_APPMT_1204_LDataSet hd_appmt_1204_l(HD_APPMT_1204_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1204_LDataSet ds = (HD_APPMT_1204_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1205_LDataSet hd_appmt_1205_l(HD_APPMT_1205_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1205_LDataSet ds = (HD_APPMT_1205_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_1300_LDataSet getHd_appmt_1300(HD_APPMT_1300_LDM dm) throws AppException {

		DBManager manager = new DBManager("MISHDL");
	    HD_APPMT_1300_LDataSet ds = (HD_APPMT_1300_LDataSet) manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
	    return ds;
	}	
 
	public HD_APPMT_1301_UDataSet getHd_appmt_1301(HD_APPMT_1301_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1301_UDataSet ds = (HD_APPMT_1301_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
 
	public HD_APPMT_1302_UDataSet getHd_appmt_1302(HD_APPMT_1302_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1302_UDataSet ds = (HD_APPMT_1302_UDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	       	throw new AppException(ds.errcode, ds.errmsg);
	    }
		return ds;
	}
	
	public HD_APPMT_2000_LDataSet hd_appmt_2000_l(HD_APPMT_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_2000_LDataSet ds = (HD_APPMT_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_2000_500_LDataSet hd_appmt_2000_500_l(HD_APPMT_2000_500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_2000_500_LDataSet ds = (HD_APPMT_2000_500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_2001_LDataSet hd_appmt_2001_l(HD_APPMT_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_2001_LDataSet ds = (HD_APPMT_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_2002_UDataSet hd_appmt_2002_u(HD_APPMT_2002_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_2002_UDataSet ds = (HD_APPMT_2002_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_APPMT_2003_LDataSet hd_appmt_2003_l(HD_APPMT_2003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_2003_LDataSet ds = (HD_APPMT_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_APPMT_1105_IDataSet hd_appmt_1105_i(HD_APPMT_1105_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_1105_IDataSet ds = (HD_APPMT_1105_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_APPMT_3000_LDataSet hd_appmt_3000_l(HD_APPMT_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_APPMT_3000_LDataSet ds = (HD_APPMT_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
