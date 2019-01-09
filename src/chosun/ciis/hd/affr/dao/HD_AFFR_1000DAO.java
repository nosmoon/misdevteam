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

package chosun.ciis.hd.affr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;
 
/**
 * 
 */
public class HD_AFFR_1000DAO {
	
	public HD_AFFR_1000_LDataSet hd_affr_1000(HD_AFFR_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1000_LDataSet ds = (HD_AFFR_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	 
	public HD_AFFR_1001_LDataSet hd_affr_1001(HD_AFFR_1001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1001_LDataSet ds = (HD_AFFR_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1002_LDataSet hd_affr_1002(HD_AFFR_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1002_LDataSet ds = (HD_AFFR_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1003_ADataSet hd_affr_1003(HD_AFFR_1003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1003_ADataSet ds = (HD_AFFR_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1004_LDataSet hd_affr_1004_l(HD_AFFR_1004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1004_LDataSet ds = (HD_AFFR_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1100_LDataSet hd_affr_1100(HD_AFFR_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1100_LDataSet ds = (HD_AFFR_1100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1101_LDataSet hd_affr_1101(HD_AFFR_1101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1101_LDataSet ds = (HD_AFFR_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1102_LDataSet hd_affr_1102(HD_AFFR_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1102_LDataSet ds = (HD_AFFR_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1103_ADataSet hd_affr_1103(HD_AFFR_1103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1103_ADataSet ds = (HD_AFFR_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1104_LDataSet hd_affr_1104_l(HD_AFFR_1104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1104_LDataSet ds = (HD_AFFR_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1200_LDataSet hd_affr_1200(HD_AFFR_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1200_LDataSet ds = (HD_AFFR_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1105_ADataSet hd_affr_1105_a(HD_AFFR_1105_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1105_ADataSet ds = (HD_AFFR_1105_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1106_DDataSet hd_affr_1106_d(HD_AFFR_1106_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1106_DDataSet ds = (HD_AFFR_1106_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1108_LDataSet hd_affr_1108_l(HD_AFFR_1108_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1108_LDataSet ds = (HD_AFFR_1108_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1109_ADataSet hd_affr_1109_a(HD_AFFR_1109_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1109_ADataSet ds = (HD_AFFR_1109_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1201_ADataSet hd_affr_1201(HD_AFFR_1201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1201_ADataSet ds = (HD_AFFR_1201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1202_LDataSet hd_affr_1202(HD_AFFR_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1202_LDataSet ds = (HD_AFFR_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1203_LDataSet hd_affr_1203_l(HD_AFFR_1203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1203_LDataSet ds = (HD_AFFR_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_1300_LDataSet hd_affr_1300(HD_AFFR_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1300_LDataSet ds = (HD_AFFR_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1301_LDataSet hd_affr_1301(HD_AFFR_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1301_LDataSet ds = (HD_AFFR_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1302_LDataSet hd_affr_1302(HD_AFFR_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1302_LDataSet ds = (HD_AFFR_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1303_ADataSet hd_affr_1303(HD_AFFR_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1303_ADataSet ds = (HD_AFFR_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1410_LDataSet hd_affr_1410(HD_AFFR_1410_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1410_LDataSet ds = (HD_AFFR_1410_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1411_LDataSet hd_affr_1411(HD_AFFR_1411_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1411_LDataSet ds = (HD_AFFR_1411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1412_LDataSet hd_affr_1412(HD_AFFR_1412_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1412_LDataSet ds = (HD_AFFR_1412_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1413_ADataSet hd_affr_1413(HD_AFFR_1413_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1413_ADataSet ds = (HD_AFFR_1413_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1414_LDataSet hd_affr_1414(HD_AFFR_1414_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1414_LDataSet ds = (HD_AFFR_1414_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1415_LDataSet hd_affr_1415_l(HD_AFFR_1415_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1415_LDataSet ds = (HD_AFFR_1415_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1416_ADataSet hd_affr_1416_a(HD_AFFR_1416_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1416_ADataSet ds = (HD_AFFR_1416_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1417_DDataSet hd_affr_1417_d(HD_AFFR_1417_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1417_DDataSet ds = (HD_AFFR_1417_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1420_LDataSet hd_affr_1420(HD_AFFR_1420_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1420_LDataSet ds = (HD_AFFR_1420_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1500_LDataSet hd_affr_1500(HD_AFFR_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1500_LDataSet ds = (HD_AFFR_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1501_ADataSet hd_affr_1501(HD_AFFR_1501_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1501_ADataSet ds = (HD_AFFR_1501_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_1502_LDataSet hd_affr_1502(HD_AFFR_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1502_LDataSet ds = (HD_AFFR_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1600_LDataSet hd_affr_1600(HD_AFFR_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1600_LDataSet ds = (HD_AFFR_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1601_LDataSet hd_affr_1601(HD_AFFR_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1601_LDataSet ds = (HD_AFFR_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1602_ADataSet hd_affr_1602(HD_AFFR_1602_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1602_ADataSet ds = (HD_AFFR_1602_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1611_LDataSet hd_affr_1611(HD_AFFR_1611_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1611_LDataSet ds = (HD_AFFR_1611_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1612_LDataSet hd_affr_1612(HD_AFFR_1612_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1612_LDataSet ds = (HD_AFFR_1612_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1700_LDataSet hd_affr_1700(HD_AFFR_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1700_LDataSet ds = (HD_AFFR_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1701_LDataSet hd_affr_1701(HD_AFFR_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1701_LDataSet ds = (HD_AFFR_1701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1703_LDataSet hd_affr_1703(HD_AFFR_1703_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1703_LDataSet ds = (HD_AFFR_1703_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1720_ADataSet hd_affr_1720_a(HD_AFFR_1720_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1720_ADataSet ds = (HD_AFFR_1720_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_1721_LDataSet hd_affr_1721(HD_AFFR_1721_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1721_LDataSet ds = (HD_AFFR_1721_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1714_ADataSet hd_affr_1714(HD_AFFR_1714_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1714_ADataSet ds = (HD_AFFR_1714_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1715_LDataSet hd_affr_1715_l(HD_AFFR_1715_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1715_LDataSet ds = (HD_AFFR_1715_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_1716_ADataSet hd_affr_1716_a(HD_AFFR_1716_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1716_ADataSet ds = (HD_AFFR_1716_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_1717_DDataSet hd_affr_1717_d(HD_AFFR_1717_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1717_DDataSet ds = (HD_AFFR_1717_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1800_LDataSet hd_affr_1800(HD_AFFR_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1800_LDataSet ds = (HD_AFFR_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_1810_LDataSet hd_affr_1810(HD_AFFR_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1810_LDataSet ds = (HD_AFFR_1810_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_1820_ADataSet hd_affr_1820(HD_AFFR_1820_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1820_ADataSet ds = (HD_AFFR_1820_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_1900_LDataSet hd_affr_1900(HD_AFFR_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1900_LDataSet ds = (HD_AFFR_1900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
