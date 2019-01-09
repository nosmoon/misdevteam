
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

package chosun.ciis.hd.dalon.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;
 
/**
 * 
 */
public class HD_DALON_1000DAO {
	
	public HD_DALON_1000_LDataSet getHd_DALON_1000(HD_DALON_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1000_LDataSet ds = (HD_DALON_1000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1001_ADataSet getHd_DALON_1001(HD_DALON_1001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1001_ADataSet ds = (HD_DALON_1001_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1002_LDataSet getHd_DALON_1002(HD_DALON_1002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1002_LDataSet ds = (HD_DALON_1002_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1010_LDataSet hd_dalon_1010_l(HD_DALON_1010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1010_LDataSet ds = (HD_DALON_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_DALON_1100_LDataSet getHd_DALON_1100(HD_DALON_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1100_LDataSet ds = (HD_DALON_1100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1101_ADataSet getHd_DALON_1101(HD_DALON_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1101_ADataSet ds = (HD_DALON_1101_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1102_LDataSet getHd_DALON_1102(HD_DALON_1102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1102_LDataSet ds = (HD_DALON_1102_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1200_LDataSet getHd_DALON_1200(HD_DALON_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1200_LDataSet ds = (HD_DALON_1200_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1201_LDataSet getHd_DALON_1201(HD_DALON_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1201_LDataSet ds = (HD_DALON_1201_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1202_ADataSet getHd_DALON_1202(HD_DALON_1202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1202_ADataSet ds = (HD_DALON_1202_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1300_LDataSet getHd_DALON_1300(HD_DALON_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1300_LDataSet ds = (HD_DALON_1300_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1301_LDataSet getHd_DALON_1301(HD_DALON_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1301_LDataSet ds = (HD_DALON_1301_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1302_ADataSet getHd_DALON_1302(HD_DALON_1302_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1302_ADataSet ds = (HD_DALON_1302_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1400_LDataSet getHd_DALON_1400(HD_DALON_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1400_LDataSet ds = (HD_DALON_1400_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1401_LDataSet getHd_DALON_1401(HD_DALON_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1401_LDataSet ds = (HD_DALON_1401_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1402_LDataSet getHd_DALON_1402(HD_DALON_1402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1402_LDataSet ds = (HD_DALON_1402_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1403_ADataSet getHd_DALON_1403(HD_DALON_1403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1403_ADataSet ds = (HD_DALON_1403_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1404_LDataSet getHd_DALON_1404(HD_DALON_1404_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1404_LDataSet ds = (HD_DALON_1404_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1405_ADataSet getHd_DALON_1405(HD_DALON_1405_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1405_ADataSet ds = (HD_DALON_1405_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1406_LDataSet getHd_DALON_1406(HD_DALON_1406_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1406_LDataSet ds = (HD_DALON_1406_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public HD_DALON_1407_LDataSet getHd_DALON_1407(HD_DALON_1407_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1407_LDataSet ds = (HD_DALON_1407_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_DALON_1408_LDataSet getHd_DALON_1408(HD_DALON_1408_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1408_LDataSet ds = (HD_DALON_1408_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	
	public HD_DALON_1500_LDataSet getHd_DALON_1500(HD_DALON_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1500_LDataSet ds = (HD_DALON_1500_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1501_ADataSet getHd_DALON_1501(HD_DALON_1501_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1501_ADataSet ds = (HD_DALON_1501_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1502_ADataSet getHd_DALON_1502(HD_DALON_1502_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1502_ADataSet ds = (HD_DALON_1502_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	/* 회의비 지급대상자 관리    2014.07.16 */
	public HD_DALON_1550_LDataSet getHd_DALON_1550(HD_DALON_1550_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1550_LDataSet ds = (HD_DALON_1550_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_DALON_1551_MDataSet getHd_DALON_1551(HD_DALON_1551_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1551_MDataSet ds = (HD_DALON_1551_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_DALON_1552_ADataSet getHd_DALON_1552(HD_DALON_1552_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1552_ADataSet ds = (HD_DALON_1552_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public HD_DALON_1600_LDataSet getHd_DALON_1600(HD_DALON_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1600_LDataSet ds = (HD_DALON_1600_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	





	public HD_DALON_1700_LDataSet getHd_DALON_1700(HD_DALON_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1700_LDataSet ds = (HD_DALON_1700_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1701_LDataSet getHd_DALON_1701(HD_DALON_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1701_LDataSet ds = (HD_DALON_1701_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1702_LDataSet getHd_DALON_1702(HD_DALON_1702_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1702_LDataSet ds = (HD_DALON_1702_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_DALON_1704_ADataSet getHd_DALON_1704(HD_DALON_1704_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1704_ADataSet ds = (HD_DALON_1704_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public HD_DALON_1705_LDataSet hd_dalon_1705_l(HD_DALON_1705_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1705_LDataSet ds = (HD_DALON_1705_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_1706_ADataSet hd_dalon_1706_a(HD_DALON_1706_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1706_ADataSet ds = (HD_DALON_1706_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_1707_DDataSet hd_dalon_1707_d(HD_DALON_1707_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1707_DDataSet ds = (HD_DALON_1707_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_DALON_1800_LDataSet getHd_DALON_1800(HD_DALON_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1800_LDataSet ds = (HD_DALON_1800_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public HD_DALON_1801_LDataSet hd_dalon_1801_l(HD_DALON_1801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1801_LDataSet ds = (HD_DALON_1801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_1802_ADataSet hd_dalon_1802_a(HD_DALON_1802_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1802_ADataSet ds = (HD_DALON_1802_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DALON_1803_DDataSet hd_dalon_1803_d(HD_DALON_1803_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1803_DDataSet ds = (HD_DALON_1803_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_DALON_1804_LDataSet hd_dalon_1804_l(HD_DALON_1804_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1804_LDataSet ds = (HD_DALON_1804_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DALON_1900_LDataSet getHd_DALON_1900(HD_DALON_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1900_LDataSet ds = (HD_DALON_1900_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1901_LDataSet getHd_DALON_1901(HD_DALON_1901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1901_LDataSet ds = (HD_DALON_1901_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_1902_LDataSet getHd_DALON_1902(HD_DALON_1902_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1902_LDataSet ds = (HD_DALON_1902_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	


	public HD_DALON_1903_ADataSet getHd_DALON_1903(HD_DALON_1903_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1903_ADataSet ds = (HD_DALON_1903_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public HD_DALON_1904_LDataSet hd_dalon_1904_l(HD_DALON_1904_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1904_LDataSet ds = (HD_DALON_1904_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_1905_ADataSet hd_dalon_1905_a(HD_DALON_1905_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1905_ADataSet ds = (HD_DALON_1905_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DALON_1906_DDataSet hd_dalon_1906_d(HD_DALON_1906_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1906_DDataSet ds = (HD_DALON_1906_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_DALON_1907_LDataSet hd_dalon_1907_l(HD_DALON_1907_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1907_LDataSet ds = (HD_DALON_1907_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_DALON_2000_LDataSet getHd_DALON_2000(HD_DALON_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2000_LDataSet ds = (HD_DALON_2000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_2001_LDataSet getHd_DALON_2001(HD_DALON_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2001_LDataSet ds = (HD_DALON_2001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_2002_LDataSet getHd_DALON_2002(HD_DALON_2002_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2002_LDataSet ds = (HD_DALON_2002_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	

	public HD_DALON_2003_ADataSet getHd_DALON_2003(HD_DALON_2003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2003_ADataSet ds = (HD_DALON_2003_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public HD_DALON_2004_LDataSet hd_dalon_2004_l(HD_DALON_2004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2004_LDataSet ds = (HD_DALON_2004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2005_ADataSet hd_dalon_2005_a(HD_DALON_2005_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2005_ADataSet ds = (HD_DALON_2005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DALON_2006_DDataSet hd_dalon_2006_d(HD_DALON_2006_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2006_DDataSet ds = (HD_DALON_2006_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_DALON_1805_LDataSet hd_dalon_1805_l(HD_DALON_1805_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_1805_LDataSet ds = (HD_DALON_1805_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2030_MDataSet hd_dalon_2030_m(HD_DALON_2030_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2030_MDataSet ds = (HD_DALON_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2031_LDataSet hd_dalon_2031_l(HD_DALON_2031_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2031_LDataSet ds = (HD_DALON_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2032_ADataSet hd_dalon_2032_a(HD_DALON_2032_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2032_ADataSet ds = (HD_DALON_2032_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2041_LDataSet hd_dalon_2041_l(HD_DALON_2041_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2041_LDataSet ds = (HD_DALON_2041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2043_ADataSet hd_dalon_2043_a(HD_DALON_2043_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2043_ADataSet ds = (HD_DALON_2043_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2045_ADataSet hd_dalon_2045_a(HD_DALON_2045_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2045_ADataSet ds = (HD_DALON_2045_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2046_DDataSet hd_dalon_2046_d(HD_DALON_2046_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2046_DDataSet ds = (HD_DALON_2046_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2047_LDataSet hd_dalon_2047_l(HD_DALON_2047_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2047_LDataSet ds = (HD_DALON_2047_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2049_DDataSet hd_dalon_2049_d(HD_DALON_2049_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2049_DDataSet ds = (HD_DALON_2049_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_DALON_2042_LDataSet hd_dalon_2042_l(HD_DALON_2042_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_DALON_2042_LDataSet ds = (HD_DALON_2042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

