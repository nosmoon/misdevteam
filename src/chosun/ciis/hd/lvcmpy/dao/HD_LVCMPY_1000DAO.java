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

package chosun.ciis.hd.lvcmpy.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/** 
 * 
 */
public class HD_LVCMPY_1000DAO {
	public HD_LVCMPY_1000_LDataSet hd_lvcmpy_1000_l(HD_LVCMPY_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1000_LDataSet ds = (HD_LVCMPY_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_LVCMPY_1001_LDataSet hd_lvcmpy_1001_l(HD_LVCMPY_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1001_LDataSet ds = (HD_LVCMPY_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1002_LDataSet hd_lvcmpy_1002_l(HD_LVCMPY_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1002_LDataSet ds = (HD_LVCMPY_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1003_LDataSet hd_lvcmpy_1003_l(HD_LVCMPY_1003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1003_LDataSet ds = (HD_LVCMPY_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1004_LDataSet hd_lvcmpy_1004_l(HD_LVCMPY_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1004_LDataSet ds = (HD_LVCMPY_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1005_ADataSet hd_lvcmpy_1005_a(HD_LVCMPY_1005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1005_ADataSet ds = (HD_LVCMPY_1005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1006_LDataSet hd_lvcmpy_1006_l(HD_LVCMPY_1006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1006_LDataSet ds = (HD_LVCMPY_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1007_LDataSet hd_lvcmpy_1007_l(HD_LVCMPY_1007_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1007_LDataSet ds = (HD_LVCMPY_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1009_LDataSet hd_lvcmpy_1009_l(HD_LVCMPY_1009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1009_LDataSet ds = (HD_LVCMPY_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1010_LDataSet hd_lvcmpy_1010_l(HD_LVCMPY_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1010_LDataSet ds = (HD_LVCMPY_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

	
	public HD_LVCMPY_1011_LDataSet hd_lvcmpy_1011_l(HD_LVCMPY_1011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1011_LDataSet ds = (HD_LVCMPY_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1050_LDataSet hd_lvcmpy_1050_l(HD_LVCMPY_1050_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1050_LDataSet ds = (HD_LVCMPY_1050_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1300_UDataSet hd_lvcmpy_1300_u(HD_LVCMPY_1300_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1300_UDataSet ds = (HD_LVCMPY_1300_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1301_UDataSet hd_lvcmpy_1301_u(HD_LVCMPY_1301_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1301_UDataSet ds = (HD_LVCMPY_1301_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1302_LDataSet hd_lvcmpy_1302_l(HD_LVCMPY_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1302_LDataSet ds = (HD_LVCMPY_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2000_LDataSet hd_lvcmpy_2000_l(HD_LVCMPY_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2000_LDataSet ds = (HD_LVCMPY_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2001_ADataSet hd_lvcmpy_2001_a(HD_LVCMPY_2001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2001_ADataSet ds = (HD_LVCMPY_2001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2002_LDataSet hd_lvcmpy_2002_l(HD_LVCMPY_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2002_LDataSet ds = (HD_LVCMPY_2002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2003_ADataSet hd_lvcmpy_2003_a(HD_LVCMPY_2003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2003_ADataSet ds = (HD_LVCMPY_2003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2100_LDataSet hd_lvcmpy_2100_l(HD_LVCMPY_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2100_LDataSet ds = (HD_LVCMPY_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2101_LDataSet hd_lvcmpy_2101_l(HD_LVCMPY_2101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2101_LDataSet ds = (HD_LVCMPY_2101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2102_ADataSet hd_lvcmpy_2102_a(HD_LVCMPY_2102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2102_ADataSet ds = (HD_LVCMPY_2102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2103_ADataSet hd_lvcmpy_2103_a(HD_LVCMPY_2103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2103_ADataSet ds = (HD_LVCMPY_2103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2200_LDataSet hd_lvcmpy_2200_l(HD_LVCMPY_2200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2200_LDataSet ds = (HD_LVCMPY_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2201_ADataSet hd_lvcmpy_2201_a(HD_LVCMPY_2201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2201_ADataSet ds = (HD_LVCMPY_2201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2300_LDataSet hd_lvcmpy_2300_l(HD_LVCMPY_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2300_LDataSet ds = (HD_LVCMPY_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2301_ADataSet hd_lvcmpy_2301_a(HD_LVCMPY_2301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2301_ADataSet ds = (HD_LVCMPY_2301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2400_ADataSet hd_lvcmpy_2400_a(HD_LVCMPY_2400_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2400_ADataSet ds = (HD_LVCMPY_2400_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2500_LDataSet hd_lvcmpy_2500_l(HD_LVCMPY_2500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2500_LDataSet ds = (HD_LVCMPY_2500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2501_ADataSet hd_lvcmpy_2501_a(HD_LVCMPY_2501_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2501_ADataSet ds = (HD_LVCMPY_2501_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2600_ADataSet hd_lvcmpy_2600_a(HD_LVCMPY_2600_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2600_ADataSet ds = (HD_LVCMPY_2600_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2601_ADataSet hd_lvcmpy_2601_a(HD_LVCMPY_2601_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2601_ADataSet ds = (HD_LVCMPY_2601_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2601_2013_ADataSet hd_lvcmpy_2601_2013_a(HD_LVCMPY_2601_2013_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2601_2013_ADataSet ds = (HD_LVCMPY_2601_2013_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2605_ADataSet hd_lvcmpy_2605_a(HD_LVCMPY_2605_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2605_ADataSet ds = (HD_LVCMPY_2605_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2606_LDataSet hd_lvcmpy_2606_1(HD_LVCMPY_2606_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2606_LDataSet ds = (HD_LVCMPY_2606_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2700_LDataSet hd_lvcmpy_2700_l(HD_LVCMPY_2700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2700_LDataSet ds = (HD_LVCMPY_2700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2701_ADataSet hd_lvcmpy_2701_a(HD_LVCMPY_2701_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2701_ADataSet ds = (HD_LVCMPY_2701_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2704_LDataSet hd_lvcmpy_2704_l(HD_LVCMPY_2704_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2704_LDataSet ds = (HD_LVCMPY_2704_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_LVCMPY_2705_ADataSet hd_lvcmpy_2705_a(HD_LVCMPY_2705_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2705_ADataSet ds = (HD_LVCMPY_2705_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_LVCMPY_2706_DDataSet hd_lvcmpy_2706_d(HD_LVCMPY_2706_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2706_DDataSet ds = (HD_LVCMPY_2706_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_LVCMPY_2800_LDataSet hd_lvcmpy_2800_l(HD_LVCMPY_2800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2800_LDataSet ds = (HD_LVCMPY_2800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2801_LDataSet hd_lvcmpy_2801_l(HD_LVCMPY_2801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2801_LDataSet ds = (HD_LVCMPY_2801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_2802_LDataSet hd_lvcmpy_2802_l(HD_LVCMPY_2802_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_2802_LDataSet ds = (HD_LVCMPY_2802_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_LVCMPY_3103_ADataSet hd_lvcmpy_3103_a(HD_LVCMPY_3103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3103_ADataSet ds = (HD_LVCMPY_3103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_LVCMPY_3104_DDataSet hd_lvcmpy_3104_d(HD_LVCMPY_3104_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3104_DDataSet ds = (HD_LVCMPY_3104_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_LVCMPY_3000_ADataSet hd_lvcmpy_3000_a(HD_LVCMPY_3000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3000_ADataSet ds = (HD_LVCMPY_3000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_LVCMPY_3001_ADataSet hd_lvcmpy_3001_a(HD_LVCMPY_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3001_ADataSet ds = (HD_LVCMPY_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3200_LDataSet hd_lvcmpy_3200_l(HD_LVCMPY_3200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3200_LDataSet ds = (HD_LVCMPY_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_LVCMPY_3300_LDataSet hd_lvcmpy_3300_l(HD_LVCMPY_3300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3300_LDataSet ds = (HD_LVCMPY_3300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3400_LDataSet hd_lvcmpy_3400_l(HD_LVCMPY_3400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3400_LDataSet ds = (HD_LVCMPY_3400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3500_ADataSet hd_lvcmpy_3500_a(HD_LVCMPY_3500_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3500_ADataSet ds = (HD_LVCMPY_3500_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3502_LDataSet hd_lvcmpy_3502_l(HD_LVCMPY_3502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3502_LDataSet ds = (HD_LVCMPY_3502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3503_LDataSet hd_lvcmpy_3503_l(HD_LVCMPY_3503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3503_LDataSet ds = (HD_LVCMPY_3503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3504_ADataSet hd_lvcmpy_3504_a(HD_LVCMPY_3504_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3504_ADataSet ds = (HD_LVCMPY_3504_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3505_ADataSet hd_lvcmpy_3505_a(HD_LVCMPY_3505_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3505_ADataSet ds = (HD_LVCMPY_3505_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3002_ADataSet hd_lvcmpy_3002_a(HD_LVCMPY_3002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3002_ADataSet ds = (HD_LVCMPY_3002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_3003_ADataSet hd_lvcmpy_3003_a(HD_LVCMPY_3003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_3003_ADataSet ds = (HD_LVCMPY_3003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1017_LDataSet hd_lvcmpy_1017_l(HD_LVCMPY_1017_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1017_LDataSet ds = (HD_LVCMPY_1017_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_LVCMPY_1018_LDataSet hd_lvcmpy_1018_l(HD_LVCMPY_1018_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_LVCMPY_1018_LDataSet ds = (HD_LVCMPY_1018_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}