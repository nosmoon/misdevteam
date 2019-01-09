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

package chosun.ciis.hd.saly.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;
 
/**
 * 
 */
public class HD_SALY_1000DAO {
	
	public HD_SALY_1000_LDataSet hd_saly_1000_l(HD_SALY_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1000_LDataSet ds = (HD_SALY_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1001_ADataSet hd_saly_1001_a(HD_SALY_1001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1001_ADataSet ds = (HD_SALY_1001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1002_LDataSet hd_saly_1002_l(HD_SALY_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1002_LDataSet ds = (HD_SALY_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1100_LDataSet hd_saly_1100_l(HD_SALY_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1100_LDataSet ds = (HD_SALY_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1200_ADataSet hd_saly_1200_a(HD_SALY_1200_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1200_ADataSet ds = (HD_SALY_1200_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1201_ADataSet hd_saly_1201_a(HD_SALY_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1201_ADataSet ds = (HD_SALY_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1202_MDataSet hd_saly_1202_m(HD_SALY_1202_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1202_MDataSet ds = (HD_SALY_1202_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1211_LDataSet hd_saly_1211_l(HD_SALY_1211_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1211_LDataSet ds = (HD_SALY_1211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1210_LDataSet hd_saly_1210_l(HD_SALY_1210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1210_LDataSet ds = (HD_SALY_1210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1300_LDataSet hd_saly_1300_l(HD_SALY_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1300_LDataSet ds = (HD_SALY_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1301_ADataSet hd_saly_1301_a(HD_SALY_1301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1301_ADataSet ds = (HD_SALY_1301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1302_LDataSet hd_saly_1302_l(HD_SALY_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1302_LDataSet ds = (HD_SALY_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1304_ADataSet hd_saly_1304_a(HD_SALY_1304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1304_ADataSet ds = (HD_SALY_1304_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1400_ADataSet hd_saly_1400_a(HD_SALY_1400_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1400_ADataSet ds = (HD_SALY_1400_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1401_ADataSet hd_saly_1401_a(HD_SALY_1401_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1401_ADataSet ds = (HD_SALY_1401_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1405_ADataSet hd_saly_1405_a(HD_SALY_1405_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1405_ADataSet ds = (HD_SALY_1405_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1410_LDataSet hd_saly_1410_l(HD_SALY_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1410_LDataSet ds = (HD_SALY_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1411_LDataSet hd_saly_1411_l(HD_SALY_1411_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1411_LDataSet ds = (HD_SALY_1411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2100_LDataSet hd_saly_2100_l(HD_SALY_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2100_LDataSet ds = (HD_SALY_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2101_ADataSet hd_saly_2101_a(HD_SALY_2101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2101_ADataSet ds = (HD_SALY_2101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2102_LDataSet hd_saly_2102_l(HD_SALY_2102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2102_LDataSet ds = (HD_SALY_2102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3000_LDataSet hd_saly_3000_l(HD_SALY_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3000_LDataSet ds = (HD_SALY_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3001_ADataSet hd_saly_3001_a(HD_SALY_3001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3001_ADataSet ds = (HD_SALY_3001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3002_LDataSet hd_saly_3002_l(HD_SALY_3002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3002_LDataSet ds = (HD_SALY_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3100_LDataSet hd_saly_3100_l(HD_SALY_3100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3100_LDataSet ds = (HD_SALY_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3101_ADataSet hd_saly_3101_a(HD_SALY_3101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3101_ADataSet ds = (HD_SALY_3101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3102_LDataSet hd_saly_3102_l(HD_SALY_3102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3102_LDataSet ds = (HD_SALY_3102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3200_LDataSet hd_saly_3200_l(HD_SALY_3200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3200_LDataSet ds = (HD_SALY_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3201_ADataSet hd_saly_3201_a(HD_SALY_3201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3201_ADataSet ds = (HD_SALY_3201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3202_LDataSet hd_saly_3202_l(HD_SALY_3202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3202_LDataSet ds = (HD_SALY_3202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3203_LDataSet hd_saly_3203_l(HD_SALY_3203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3203_LDataSet ds = (HD_SALY_3203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4000_LDataSet hd_saly_4000_l(HD_SALY_4000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4000_LDataSet ds = (HD_SALY_4000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4001_LDataSet hd_saly_4001_l(HD_SALY_4001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4001_LDataSet ds = (HD_SALY_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4002_ADataSet hd_saly_4002_a(HD_SALY_4002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4002_ADataSet ds = (HD_SALY_4002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4003_LDataSet hd_saly_4003_l(HD_SALY_4003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4003_LDataSet ds = (HD_SALY_4003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4004_ADataSet hd_saly_4004_a(HD_SALY_4004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4004_ADataSet ds = (HD_SALY_4004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4005_LDataSet hd_saly_4005_l(HD_SALY_4005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4005_LDataSet ds = (HD_SALY_4005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4100_LDataSet hd_saly_4100_l(HD_SALY_4100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4100_LDataSet ds = (HD_SALY_4100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4101_LDataSet hd_saly_4101_l(HD_SALY_4101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4101_LDataSet ds = (HD_SALY_4101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4102_ADataSet hd_saly_4102_a(HD_SALY_4102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4102_ADataSet ds = (HD_SALY_4102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4500_ADataSet hd_saly_4500_a(HD_SALY_4500_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4500_ADataSet ds = (HD_SALY_4500_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3300_ADataSet hd_saly_3300_a(HD_SALY_3300_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3300_ADataSet ds = (HD_SALY_3300_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_SALY_3300_A_GYSGDataSet hd_saly_3300_gysg(HD_SALY_3300_A_GYSGDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3300_A_GYSGDataSet ds = (HD_SALY_3300_A_GYSGDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	//개인별 내역출력(장표 및 리스트) 
	public HD_SALY_3313_PDataSet hd_saly_3313_l(HD_SALY_3313_PDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3313_PDataSet ds = (HD_SALY_3313_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3350_ADataSet hd_saly_3350_a(HD_SALY_3350_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3350_ADataSet ds = (HD_SALY_3350_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3302_ADataSet hd_saly_3302_a(HD_SALY_3302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3302_ADataSet ds = (HD_SALY_3302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_3303_ADataSet hd_saly_3303_a(HD_SALY_3303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3303_ADataSet ds = (HD_SALY_3303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_3304_ADataSet hd_saly_3304_a(HD_SALY_3304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3304_ADataSet ds = (HD_SALY_3304_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_SALY_3305_DDataSet hd_saly_3305_d(HD_SALY_3305_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3305_DDataSet ds = (HD_SALY_3305_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_SALY_3306_ADataSet hd_saly_3306_a(HD_SALY_3306_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3306_ADataSet ds = (HD_SALY_3306_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_SALY_3307_DDataSet hd_saly_3307_d(HD_SALY_3307_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3307_DDataSet ds = (HD_SALY_3307_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_3308_ADataSet hd_saly_3308_a(HD_SALY_3308_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3308_ADataSet ds = (HD_SALY_3308_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_SALY_3309_DDataSet hd_saly_3309_d(HD_SALY_3309_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3309_DDataSet ds = (HD_SALY_3309_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_SALY_3310_LDataSet hd_saly_3310_l(HD_SALY_3310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3310_LDataSet ds = (HD_SALY_3310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_SALY_3311_LDataSet hd_saly_3311_l(HD_SALY_3311_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3311_LDataSet ds = (HD_SALY_3311_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_3312_LDataSet hd_saly_3312_l(HD_SALY_3312_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3312_LDataSet ds = (HD_SALY_3312_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3315_ADataSet hd_saly_3315_a(HD_SALY_3315_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3315_ADataSet ds = (HD_SALY_3315_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3317_LDataSet hd_saly_3317_l(HD_SALY_3317_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3317_LDataSet ds = (HD_SALY_3317_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3330_ADataSet hd_saly_3330 (HD_SALY_3330_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3330_ADataSet ds = (HD_SALY_3330_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3331_ADataSet hd_saly_3331 (HD_SALY_3331_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3331_ADataSet ds = (HD_SALY_3331_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

	public HD_SALY_4103_LDataSet hd_saly_4103_l(HD_SALY_4103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4103_LDataSet ds = (HD_SALY_4103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_4300_LDataSet hd_saly_4300_l(HD_SALY_4300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4300_LDataSet ds = (HD_SALY_4300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_4302_ADataSet hd_saly_4302_a(HD_SALY_4302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4302_ADataSet ds = (HD_SALY_4302_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4301_LDataSet hd_saly_4301_l(HD_SALY_4301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4301_LDataSet ds = (HD_SALY_4301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4303_LDataSet hd_saly_4303_l(HD_SALY_4303_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4303_LDataSet ds = (HD_SALY_4303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4304_ADataSet hd_saly_4304_a(HD_SALY_4304_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4304_ADataSet ds = (HD_SALY_4304_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4200_LDataSet hd_saly_4200_l(HD_SALY_4200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4200_LDataSet ds = (HD_SALY_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3400_ADataSet hd_saly_3400_a(HD_SALY_3400_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3400_ADataSet ds = (HD_SALY_3400_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3401_ADataSet hd_saly_3401_a(HD_SALY_3401_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3401_ADataSet ds = (HD_SALY_3401_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4201_ADataSet hd_saly_4201_a(HD_SALY_4201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4201_ADataSet ds = (HD_SALY_4201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4202_LDataSet hd_saly_4202_l(HD_SALY_4202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4202_LDataSet ds = (HD_SALY_4202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1600_LDataSet hd_saly_1600_l(HD_SALY_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1600_LDataSet ds = (HD_SALY_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1601_LDataSet hd_saly_1601_l(HD_SALY_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1601_LDataSet ds = (HD_SALY_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1602_LDataSet hd_saly_1602_l(HD_SALY_1602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1602_LDataSet ds = (HD_SALY_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1603_ADataSet hd_saly_1603_a(HD_SALY_1603_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1603_ADataSet ds = (HD_SALY_1603_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1700_LDataSet hd_saly_1700_l(HD_SALY_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1700_LDataSet ds = (HD_SALY_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	

	public HD_SALY_1701_LDataSet hd_saly_1701_l(HD_SALY_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1701_LDataSet ds = (HD_SALY_1701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1701_500_LDataSet hd_saly_1701_500_l(HD_SALY_1701_500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1701_500_LDataSet ds = (HD_SALY_1701_500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_SALY_1702_ADataSet hd_saly_1702_a(HD_SALY_1702_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1702_ADataSet ds = (HD_SALY_1702_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_SALY_1702_500_ADataSet hd_saly_1702_a(HD_SALY_1702_500_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1702_500_ADataSet ds = (HD_SALY_1702_500_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4203_ADataSet hd_saly_4203_a(HD_SALY_4203_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4203_ADataSet ds = (HD_SALY_4203_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_4204_LDataSet hd_saly_4204_l(HD_SALY_4204_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4204_LDataSet ds = (HD_SALY_4204_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2200_ADataSet hd_saly_2200_a(HD_SALY_2200_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2200_ADataSet ds = (HD_SALY_2200_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2201_ADataSet hd_saly_2201_a(HD_SALY_2201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2201_ADataSet ds = (HD_SALY_2201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	


	public HD_SALY_2000_LDataSet getHd_SALY_2000(HD_SALY_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2000_LDataSet ds = (HD_SALY_2000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_SALY_2001_LDataSet getHd_SALY_2001(HD_SALY_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2001_LDataSet ds = (HD_SALY_2001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_SALY_2002_ADataSet getHd_SALY_2002(HD_SALY_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2002_ADataSet ds = (HD_SALY_2002_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_SALY_2003_LDataSet hd_saly_2003_l(HD_SALY_2003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2003_LDataSet ds = (HD_SALY_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_1500_LDataSet hd_saly_1500_l(HD_SALY_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1500_LDataSet ds = (HD_SALY_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2300_LDataSet hd_saly_2300_l(HD_SALY_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2300_LDataSet ds = (HD_SALY_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2600_LDataSet hd_saly_2600_l(HD_SALY_2600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2600_LDataSet ds = (HD_SALY_2600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	
	public HD_SALY_2601_MDataSet hd_saly_2601_m(HD_SALY_2601_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2601_MDataSet ds = (HD_SALY_2601_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_2602_ADataSet hd_saly_2602_a(HD_SALY_2602_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2602_ADataSet ds = (HD_SALY_2602_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5002_LDataSet hd_saly_5002_l(HD_SALY_5002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_LDataSet ds = (HD_SALY_5002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5002_334_LDataSet hd_saly_5002_334_l(HD_SALY_5002_334_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_334_LDataSet ds = (HD_SALY_5002_334_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5002_2006_LDataSet hd_saly_5002_2006_l(HD_SALY_5002_2006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_2006_LDataSet ds = (HD_SALY_5002_2006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5003_LDataSet hd_saly_5003_l(HD_SALY_5003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5003_LDataSet ds = (HD_SALY_5003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5004_LDataSet hd_saly_5004_l(HD_SALY_5004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5004_LDataSet ds = (HD_SALY_5004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5005_LDataSet hd_saly_5005_l(HD_SALY_5005_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5005_LDataSet ds = (HD_SALY_5005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3103_ADataSet hd_saly_3103_a(HD_SALY_3103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3103_ADataSet ds = (HD_SALY_3103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5006_LDataSet hd_saly_5006_l(HD_SALY_5006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5006_LDataSet ds = (HD_SALY_5006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_5008_LDataSet hd_saly_5008_l(HD_SALY_5008_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5008_LDataSet ds = (HD_SALY_5008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3503_LDataSet hd_saly_3503_l(HD_SALY_3503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3503_LDataSet ds = (HD_SALY_3503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3502_LDataSet hd_saly_3502_l(HD_SALY_3502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3502_LDataSet ds = (HD_SALY_3502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3600_LDataSet hd_saly_3600_l(HD_SALY_3600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3600_LDataSet ds = (HD_SALY_3600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3601_LDataSet hd_saly_3601_l(HD_SALY_3601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3601_LDataSet ds = (HD_SALY_3601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3602_LDataSet hd_saly_3602_l(HD_SALY_3602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3602_LDataSet ds = (HD_SALY_3602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3603_LDataSet hd_saly_3603_l(HD_SALY_3603_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3603_LDataSet ds = (HD_SALY_3603_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3604_LDataSet hd_saly_3604_l(HD_SALY_3604_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3604_LDataSet ds = (HD_SALY_3604_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_SALY_3700_LDataSet hd_saly_3700_l(HD_SALY_3700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3700_LDataSet ds = (HD_SALY_3700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3800_LDataSet hd_saly_3800_l(HD_SALY_3800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3800_LDataSet ds = (HD_SALY_3800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3801_ADataSet hd_saly_3801_a(HD_SALY_3801_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3801_ADataSet ds = (HD_SALY_3801_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3802_LDataSet hd_saly_3802_l(HD_SALY_3802_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3802_LDataSet ds = (HD_SALY_3802_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_3803_ADataSet hd_saly_3803_a(HD_SALY_3803_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3803_ADataSet ds = (HD_SALY_3803_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_SALY_7000_MDataSet hd_saly_7000_m(HD_SALY_7000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_7000_MDataSet ds = (HD_SALY_7000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_SALY_7002_ADataSet hd_saly_7002_a(HD_SALY_7002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_7002_ADataSet ds = (HD_SALY_7002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}