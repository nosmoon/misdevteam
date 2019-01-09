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

package chosun.ciis.hd.duty.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;
 
/**
 * 
 */
public class HD_DUTY_1000DAO {  

	public HD_DUTY_1000_ADataSet hd_duty_1000_a(HD_DUTY_1000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1000_ADataSet ds = (HD_DUTY_1000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1001_LDataSet hd_duty_1001_l(HD_DUTY_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1001_LDataSet ds = (HD_DUTY_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1002_LDataSet hd_duty_1002_l(HD_DUTY_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1002_LDataSet ds = (HD_DUTY_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1003_ADataSet hd_duty_1003_a(HD_DUTY_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1003_ADataSet ds = (HD_DUTY_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1004_LDataSet hd_duty_1004_l(HD_DUTY_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1004_LDataSet ds = (HD_DUTY_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1107_LDataSet hd_duty_1107_l(HD_DUTY_1107_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1107_LDataSet ds = (HD_DUTY_1107_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1100_LDataSet hd_duty_1100_l(HD_DUTY_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1100_LDataSet ds = (HD_DUTY_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1102_LDataSet hd_duty_1102_l(HD_DUTY_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1102_LDataSet ds = (HD_DUTY_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1103_ADataSet hd_duty_1103_a(HD_DUTY_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1103_ADataSet ds = (HD_DUTY_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1104_LDataSet hd_duty_1104_l(HD_DUTY_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1104_LDataSet ds = (HD_DUTY_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1105_LDataSet hd_duty_1105_l(HD_DUTY_1105_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1105_LDataSet ds = (HD_DUTY_1105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
/*	
	public HD_DUTY_1105_ADataSet hd_duty_1105_a(HD_DUTY_1105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1105_ADataSet ds = (HD_DUTY_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
*/	
	public HD_DUTY_1106_ADataSet hd_duty_1106_a(HD_DUTY_1106_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1106_ADataSet ds = (HD_DUTY_1106_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1200_LDataSet hd_duty_1200_l(HD_DUTY_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1200_LDataSet ds = (HD_DUTY_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1114_LDataSet hd_duty_1114_l(HD_DUTY_1114_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1114_LDataSet ds = (HD_DUTY_1114_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1201_ADataSet hd_duty_1201_a(HD_DUTY_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1201_ADataSet ds = (HD_DUTY_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1202_LDataSet hd_duty_1202_l(HD_DUTY_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1202_LDataSet ds = (HD_DUTY_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1203_LDataSet hd_duty_1203_l(HD_DUTY_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1203_LDataSet ds = (HD_DUTY_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1204_LDataSet hd_duty_1204_l(HD_DUTY_1204_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1204_LDataSet ds = (HD_DUTY_1204_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1205_LDataSet hd_duty_1205_l(HD_DUTY_1205_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1205_LDataSet ds = (HD_DUTY_1205_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1206_LDataSet hd_duty_1206_l(HD_DUTY_1206_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1206_LDataSet ds = (HD_DUTY_1206_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	/*
	public HD_DUTY_1208_LDataSet hd_duty_1208_l(HD_DUTY_1208_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1208_LDataSet ds = (HD_DUTY_1208_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	*/
	public HD_DUTY_1209_LDataSet hd_duty_1209_l(HD_DUTY_1209_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1209_LDataSet ds = (HD_DUTY_1209_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DUTY_1300_LDataSet hd_duty_1300_l(HD_DUTY_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1300_LDataSet ds = (HD_DUTY_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1301_ADataSet hd_duty_1301_a(HD_DUTY_1301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1301_ADataSet ds = (HD_DUTY_1301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
/*	
	public HD_DUTY_1301_344_ADataSet hd_duty_1301_344_a(HD_DUTY_1301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1301_344_ADataSet ds = (HD_DUTY_1301_344_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
*/	
	public HD_DUTY_1302_UDataSet hd_duty_1302_u(HD_DUTY_1302_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1302_UDataSet ds = (HD_DUTY_1302_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1400_LDataSet hd_duty_1400_l(HD_DUTY_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1400_LDataSet ds = (HD_DUTY_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1401_LDataSet hd_duty_1401_l(HD_DUTY_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1401_LDataSet ds = (HD_DUTY_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1402_ADataSet hd_duty_1402_a(HD_DUTY_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1402_ADataSet ds = (HD_DUTY_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
/*	
	public HD_DUTY_1402_344_ADataSet hd_duty_1402_344_a(HD_DUTY_1402_344_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1402_344_ADataSet ds = (HD_DUTY_1402_344_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
*/	
	public HD_DUTY_1403_ADataSet hd_duty_1403_a(HD_DUTY_1403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1403_ADataSet ds = (HD_DUTY_1403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1500_LDataSet hd_duty_1500_l(HD_DUTY_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1500_LDataSet ds = (HD_DUTY_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1501_ADataSet hd_duty_1501_a(HD_DUTY_1501_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1501_ADataSet ds = (HD_DUTY_1501_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1502_ADataSet hd_duty_1502_a(HD_DUTY_1502_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1502_ADataSet ds = (HD_DUTY_1502_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1600_LDataSet hd_duty_1600_l(HD_DUTY_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1600_LDataSet ds = (HD_DUTY_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DUTY_1601_LDataSet hd_duty_1601_l(HD_DUTY_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1601_LDataSet ds = (HD_DUTY_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DUTY_1700_LDataSet hd_duty_1700_l(HD_DUTY_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DUTY_1700_LDataSet ds = (HD_DUTY_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
