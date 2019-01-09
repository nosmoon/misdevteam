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

package chosun.ciis.hd.cost.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/** 
 * 
 */
public class HD_COST_1000DAO {
	public HD_COST_1000_LDataSet hd_cost_1000_l(HD_COST_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1000_LDataSet ds = (HD_COST_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1001_LDataSet hd_cost_1001_l(HD_COST_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1001_LDataSet ds = (HD_COST_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1002_LDataSet hd_cost_1002_l(HD_COST_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1002_LDataSet ds = (HD_COST_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1002_500_LDataSet hd_cost_1002_500_l(HD_COST_1002_500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1002_500_LDataSet ds = (HD_COST_1002_500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1003_ADataSet hd_cost_1003_a(HD_COST_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1003_ADataSet ds = (HD_COST_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_1004_ADataSet hd_cost_1004_a(HD_COST_1004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1004_ADataSet ds = (HD_COST_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1006_ADataSet hd_cost_1006_a(HD_COST_1006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1006_ADataSet ds = (HD_COST_1006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_1007_LDataSet hd_cost_1007_l(HD_COST_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1007_LDataSet ds = (HD_COST_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1100_LDataSet hd_cost_1100_l(HD_COST_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1100_LDataSet ds = (HD_COST_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1101_ADataSet hd_cost_1101_a(HD_COST_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1101_ADataSet ds = (HD_COST_1101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_1102_LDataSet hd_cost_1102_l(HD_COST_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1102_LDataSet ds = (HD_COST_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1103_ADataSet hd_cost_1103_a(HD_COST_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1103_ADataSet ds = (HD_COST_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1104_DDataSet hd_cost_1104_d(HD_COST_1104_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1104_DDataSet ds = (HD_COST_1104_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1200_LDataSet hd_cost_1200_l(HD_COST_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1200_LDataSet ds = (HD_COST_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1201_LDataSet hd_cost_1201_l(HD_COST_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1201_LDataSet ds = (HD_COST_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1202_ADataSet hd_cost_1202_a(HD_COST_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1202_ADataSet ds = (HD_COST_1202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1300_LDataSet hd_cost_1300_l(HD_COST_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1300_LDataSet ds = (HD_COST_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1301_LDataSet hd_cost_1301_l(HD_COST_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1301_LDataSet ds = (HD_COST_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1302_ADataSet hd_cost_1302_a(HD_COST_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1302_ADataSet ds = (HD_COST_1302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1303_LDataSet hd_cost_1303_l(HD_COST_1303_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1303_LDataSet ds = (HD_COST_1303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1400_LDataSet hd_cost_1400_l(HD_COST_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1400_LDataSet ds = (HD_COST_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1401_LDataSet hd_cost_1401_l(HD_COST_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1401_LDataSet ds = (HD_COST_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1402_ADataSet hd_cost_1402_a(HD_COST_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1402_ADataSet ds = (HD_COST_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_1403_ADataSet hd_cost_1403_a(HD_COST_1403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1403_ADataSet ds = (HD_COST_1403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1500_ADataSet hd_cost_1500_a(HD_COST_1500_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1500_ADataSet ds = (HD_COST_1500_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1501_LDataSet hd_cost_1501_l(HD_COST_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1501_LDataSet ds = (HD_COST_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1502_ADataSet hd_cost_1502_a(HD_COST_1502_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1502_ADataSet ds = (HD_COST_1502_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_1503_DDataSet hd_cost_1503_d(HD_COST_1503_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1503_DDataSet ds = (HD_COST_1503_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_COST_1600_LDataSet hd_cost_1600_l(HD_COST_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1600_LDataSet ds = (HD_COST_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_COST_1105_ADataSet hd_cost_1105_a(HD_COST_1105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1105_ADataSet ds = (HD_COST_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_1106_ADataSet hd_cost_1106_a(HD_COST_1106_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1106_ADataSet ds = (HD_COST_1106_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_1108_ADataSet hd_cost_1108_a(HD_COST_1108_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_1108_ADataSet ds = (HD_COST_1108_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_2002_LDataSet hd_cost_2002_l(HD_COST_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2002_LDataSet ds = (HD_COST_2002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_2003_ADataSet hd_cost_2003_a(HD_COST_2003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2003_ADataSet ds = (HD_COST_2003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_2006_ADataSet hd_cost_2006_a(HD_COST_2006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2006_ADataSet ds = (HD_COST_2006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_2007_LDataSet hd_cost_2007_l(HD_COST_2007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2007_LDataSet ds = (HD_COST_2007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_COST_2100_LDataSet hd_cost_2100_l(HD_COST_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2100_LDataSet ds = (HD_COST_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_2101_ADataSet hd_cost_2101_a(HD_COST_2101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2101_ADataSet ds = (HD_COST_2101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_2102_LDataSet hd_cost_2102_l(HD_COST_2102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2102_LDataSet ds = (HD_COST_2102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_2103_ADataSet hd_cost_2103_a(HD_COST_2103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2103_ADataSet ds = (HD_COST_2103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_2104_DDataSet hd_cost_2104_d(HD_COST_2104_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2104_DDataSet ds = (HD_COST_2104_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_COST_2108_ADataSet hd_cost_2108_a(HD_COST_2108_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_2108_ADataSet ds = (HD_COST_2108_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_3002_LDataSet hd_cost_3002_l(HD_COST_3002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3002_LDataSet ds = (HD_COST_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3003_ADataSet hd_cost_3003_a(HD_COST_3003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3003_ADataSet ds = (HD_COST_3003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3006_ADataSet hd_cost_3006_a(HD_COST_3006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3006_ADataSet ds = (HD_COST_3006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3100_LDataSet hd_cost_3100_l(HD_COST_3100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3100_LDataSet ds = (HD_COST_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3101_ADataSet hd_cost_3101_a(HD_COST_3101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3101_ADataSet ds = (HD_COST_3101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3103_ADataSet hd_cost_3103_a(HD_COST_3103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3103_ADataSet ds = (HD_COST_3103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3105_ADataSet hd_cost_3105_a(HD_COST_3105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3105_ADataSet ds = (HD_COST_3105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_COST_3106_ADataSet hd_cost_3106_a(HD_COST_3106_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3106_ADataSet ds = (HD_COST_3106_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_COST_3108_ADataSet hd_cost_3108_a(HD_COST_3108_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_COST_3108_ADataSet ds = (HD_COST_3108_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

