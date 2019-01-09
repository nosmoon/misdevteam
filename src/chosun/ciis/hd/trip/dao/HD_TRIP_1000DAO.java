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

package chosun.ciis.hd.trip.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/** 
 * 
 */
public class HD_TRIP_1000DAO {
	public HD_TRIP_1000_LDataSet hd_trip_1000_l(HD_TRIP_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1000_LDataSet ds = (HD_TRIP_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1001_LDataSet hd_trip_1001_l(HD_TRIP_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1001_LDataSet ds = (HD_TRIP_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1002_ADataSet hd_trip_1002_a(HD_TRIP_1002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1002_ADataSet ds = (HD_TRIP_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1002_344_ADataSet hd_trip_1002_344_a(HD_TRIP_1002_344_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1002_344_ADataSet ds = (HD_TRIP_1002_344_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1003_LDataSet hd_trip_1003_l(HD_TRIP_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1003_LDataSet ds = (HD_TRIP_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1004_LDataSet hd_trip_1004_l(HD_TRIP_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1004_LDataSet ds = (HD_TRIP_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1004_344_LDataSet hd_trip_1004_344_l(HD_TRIP_1004_344_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1004_344_LDataSet ds = (HD_TRIP_1004_344_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1005_LDataSet hd_trip_1005_l(HD_TRIP_1005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1005_LDataSet ds = (HD_TRIP_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1006_LDataSet hd_trip_1006_l(HD_TRIP_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1006_LDataSet ds = (HD_TRIP_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1100_LDataSet hd_trip_1100_l(HD_TRIP_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1100_LDataSet ds = (HD_TRIP_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1101_LDataSet hd_trip_1101_l(HD_TRIP_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1101_LDataSet ds = (HD_TRIP_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1101_344_LDataSet hd_trip_1101_344_l(HD_TRIP_1101_344_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1101_344_LDataSet ds = (HD_TRIP_1101_344_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1102_LDataSet hd_trip_1102_l(HD_TRIP_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1102_LDataSet ds = (HD_TRIP_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1103_ADataSet hd_trip_1103_a(HD_TRIP_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1103_ADataSet ds = (HD_TRIP_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1103_344_ADataSet hd_trip_1103_344_a(HD_TRIP_1103_344_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1103_344_ADataSet ds = (HD_TRIP_1103_344_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1104_LDataSet hd_trip_1104_l(HD_TRIP_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1104_LDataSet ds = (HD_TRIP_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1105_ADataSet hd_trip_1105_a(HD_TRIP_1105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1105_ADataSet ds = (HD_TRIP_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1106_LDataSet hd_trip_1106_l(HD_TRIP_1106_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1106_LDataSet ds = (HD_TRIP_1106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1107_ADataSet hd_trip_1107_a(HD_TRIP_1107_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1107_ADataSet ds = (HD_TRIP_1107_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1108_DDataSet hd_trip_1108_d(HD_TRIP_1108_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1108_DDataSet ds = (HD_TRIP_1108_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1109_ADataSet hd_trip_1109_a(HD_TRIP_1109_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1109_ADataSet ds = (HD_TRIP_1109_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1200_LDataSet hd_trip_1200_l(HD_TRIP_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1200_LDataSet ds = (HD_TRIP_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1200_344_LDataSet hd_trip_1200_344_l(HD_TRIP_1200_344_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
        HD_TRIP_1200_344_LDataSet ds = (HD_TRIP_1200_344_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1201_ADataSet hd_trip_1201_a(HD_TRIP_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1201_ADataSet ds = (HD_TRIP_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1300_LDataSet hd_trip_1300_l(HD_TRIP_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1300_LDataSet ds = (HD_TRIP_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1301_LDataSet hd_trip_1301_l(HD_TRIP_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1301_LDataSet ds = (HD_TRIP_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1302_ADataSet hd_trip_1302_a(HD_TRIP_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1302_ADataSet ds = (HD_TRIP_1302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1303_LDataSet hd_trip_1303_l(HD_TRIP_1303_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1303_LDataSet ds = (HD_TRIP_1303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1304_LDataSet hd_trip_1304_l(HD_TRIP_1304_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1304_LDataSet ds = (HD_TRIP_1304_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1305_ADataSet hd_trip_1305_a(HD_TRIP_1305_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1305_ADataSet ds = (HD_TRIP_1305_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1307_LDataSet hd_trip_1307_l(HD_TRIP_1307_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1307_LDataSet ds = (HD_TRIP_1307_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1402_ADataSet hd_trip_1402_a(HD_TRIP_1402_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1402_ADataSet ds = (HD_TRIP_1402_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1403_LDataSet hd_trip_1403_l(HD_TRIP_1403_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1403_LDataSet ds = (HD_TRIP_1403_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1405_ADataSet hd_trip_1405_a(HD_TRIP_1405_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1405_ADataSet ds = (HD_TRIP_1405_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1500_LDataSet hd_trip_1500_l(HD_TRIP_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1500_LDataSet ds = (HD_TRIP_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1501_LDataSet hd_trip_1501_l(HD_TRIP_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1501_LDataSet ds = (HD_TRIP_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1502_LDataSet hd_trip_1502_l(HD_TRIP_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1502_LDataSet ds = (HD_TRIP_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1503_ADataSet hd_trip_1503_a(HD_TRIP_1503_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1503_ADataSet ds = (HD_TRIP_1503_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1504_ADataSet hd_trip_1504_a(HD_TRIP_1504_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1504_ADataSet ds = (HD_TRIP_1504_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1510_LDataSet hd_trip_1510_l(HD_TRIP_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1510_LDataSet ds = (HD_TRIP_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1600_LDataSet hd_trip_1600_l(HD_TRIP_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1600_LDataSet ds = (HD_TRIP_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1601_ADataSet hd_trip_1601_a(HD_TRIP_1601_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1601_ADataSet ds = (HD_TRIP_1601_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_TRIP_1700_LDataSet hd_trip_1700_l(HD_TRIP_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1700_LDataSet ds = (HD_TRIP_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1701_LDataSet hd_trip_1701_l(HD_TRIP_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1701_LDataSet ds = (HD_TRIP_1701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1702_ADataSet hd_trip_1702_a(HD_TRIP_1702_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1702_ADataSet ds = (HD_TRIP_1702_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1703_LDataSet hd_trip_1703_l(HD_TRIP_1703_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1703_LDataSet ds = (HD_TRIP_1703_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1704_ADataSet hd_trip_1704_a(HD_TRIP_1704_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1704_ADataSet ds = (HD_TRIP_1704_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1800_LDataSet hd_trip_1800_l(HD_TRIP_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1800_LDataSet ds = (HD_TRIP_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_TRIP_1801_ADataSet hd_trip_1801_a(HD_TRIP_1801_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1801_ADataSet ds = (HD_TRIP_1801_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1900_LDataSet hd_trip_1900_l(HD_TRIP_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1900_LDataSet ds = (HD_TRIP_1900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1901_ADataSet hd_trip_1901_a(HD_TRIP_1901_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1901_ADataSet ds = (HD_TRIP_1901_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_1902_LDataSet hd_trip_1902_l(HD_TRIP_1902_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1902_LDataSet ds = (HD_TRIP_1902_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1903_LDataSet hd_trip_1903_l(HD_TRIP_1903_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1903_LDataSet ds = (HD_TRIP_1903_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_1904_ADataSet hd_trip_1904_a(HD_TRIP_1904_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1904_ADataSet ds = (HD_TRIP_1904_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_TRIP_1905_DDataSet hd_trip_1905_d(HD_TRIP_1905_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_1905_DDataSet ds = (HD_TRIP_1905_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_TRIP_2020_LDataSet hd_trip_2020_l(HD_TRIP_2020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2020_LDataSet ds = (HD_TRIP_2020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_2021_LDataSet hd_trip_2021_l(HD_TRIP_2021_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2021_LDataSet ds = (HD_TRIP_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_TRIP_2022_ADataSet hd_trip_2022_a(HD_TRIP_2022_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_2022_ADataSet ds = (HD_TRIP_2022_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_9996_LDataSet hd_trip_9996_l(HD_TRIP_9996_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9996_LDataSet ds = (HD_TRIP_9996_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_9997_ADataSet hd_trip_9997_a(HD_TRIP_9997_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9997_ADataSet ds = (HD_TRIP_9997_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_9998_LDataSet hd_trip_9998_l(HD_TRIP_9998_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9998_LDataSet ds = (HD_TRIP_9998_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_TRIP_9999_LDataSet hd_trip_9999_l(HD_TRIP_9999_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_TRIP_9999_LDataSet ds = (HD_TRIP_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
}

