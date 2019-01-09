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

package chosun.ciis.hd.vaca.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;
 
/**
 * 
 */
public class HD_VACA_1000DAO {
	
	public HD_VACA_1000_ADataSet hd_vaca_1000_a(HD_VACA_1000_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1000_ADataSet ds = (HD_VACA_1000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1001_ADataSet hd_vaca_1001_a(HD_VACA_1001_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1001_ADataSet ds = (HD_VACA_1001_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1200_LDataSet hd_vaca_1200_l(HD_VACA_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1200_LDataSet ds = (HD_VACA_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1201_LDataSet hd_vaca_1201_l(HD_VACA_1201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1201_LDataSet ds = (HD_VACA_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1202_LDataSet hd_vaca_1202_l(HD_VACA_1202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1202_LDataSet ds = (HD_VACA_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1203_ADataSet hd_vaca_1203_a(HD_VACA_1203_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1203_ADataSet ds = (HD_VACA_1203_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1204_UDataSet hd_vaca_1204_u(HD_VACA_1204_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1204_UDataSet ds = (HD_VACA_1204_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1300_LDataSet hd_vaca_1300_l(HD_VACA_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1300_LDataSet ds = (HD_VACA_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1301_LDataSet hd_vaca_1301_l(HD_VACA_1301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1301_LDataSet ds = (HD_VACA_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1302_LDataSet hd_vaca_1302_l(HD_VACA_1302_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1302_LDataSet ds = (HD_VACA_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1303_ADataSet hd_vaca_1303_a(HD_VACA_1303_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1303_ADataSet ds = (HD_VACA_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1304_UDataSet hd_vaca_1304_u(HD_VACA_1304_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1304_UDataSet ds = (HD_VACA_1304_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1305_LDataSet hd_vaca_1305_l(HD_VACA_1305_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1305_LDataSet ds = (HD_VACA_1305_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1400_LDataSet hd_vaca_1400_l(HD_VACA_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1400_LDataSet ds = (HD_VACA_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1401_LDataSet hd_vaca_1401_l(HD_VACA_1401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1401_LDataSet ds = (HD_VACA_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1402_UDataSet hd_vaca_1402_u(HD_VACA_1402_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1402_UDataSet ds = (HD_VACA_1402_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1500_LDataSet hd_vaca_1500_l(HD_VACA_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1500_LDataSet ds = (HD_VACA_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1501_LDataSet hd_vaca_1501_l(HD_VACA_1501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1501_LDataSet ds = (HD_VACA_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1502_LDataSet hd_vaca_1502_l(HD_VACA_1502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1502_LDataSet ds = (HD_VACA_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1503_ADataSet hd_vaca_1503_a(HD_VACA_1503_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1503_ADataSet ds = (HD_VACA_1503_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_VACA_1504_ADataSet hd_vaca_1504_a(HD_VACA_1504_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1504_ADataSet ds = (HD_VACA_1504_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public HD_VACA_1505_LDataSet hd_vaca_1505_l(HD_VACA_1505_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1505_LDataSet ds = (HD_VACA_1505_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
 
	
	public HD_VACA_1600_LDataSet hd_vaca_1600_l(HD_VACA_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1600_LDataSet ds = (HD_VACA_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1601_LDataSet hd_vaca_1601_l(HD_VACA_1601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1601_LDataSet ds = (HD_VACA_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1602_ADataSet hd_vaca_1602_a(HD_VACA_1602_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1602_ADataSet ds = (HD_VACA_1602_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1603_LDataSet hd_vaca_1603_l(HD_VACA_1603_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1603_LDataSet ds = (HD_VACA_1603_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1604_ADataSet hd_vaca_1604_a(HD_VACA_1604_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1604_ADataSet ds = (HD_VACA_1604_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1605_LDataSet hd_vaca_1605_l(HD_VACA_1605_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1605_LDataSet ds = (HD_VACA_1605_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1610_LDataSet hd_vaca_1610_l(HD_VACA_1610_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1610_LDataSet ds = (HD_VACA_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_VACA_1700_LDataSet hd_vaca_1700_l(HD_VACA_1700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1700_LDataSet ds = (HD_VACA_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1701_LDataSet hd_vaca_1701_l(HD_VACA_1701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1701_LDataSet ds = (HD_VACA_1701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1702_ADataSet hd_vaca_1702_a(HD_VACA_1702_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1702_ADataSet ds = (HD_VACA_1702_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1703_ADataSet hd_vaca_1703_a(HD_VACA_1703_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1703_ADataSet ds = (HD_VACA_1703_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1800_LDataSet hd_vaca_1800_l(HD_VACA_1800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1800_LDataSet ds = (HD_VACA_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1801_ADataSet hd_vaca_1801_a(HD_VACA_1801_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1801_ADataSet ds = (HD_VACA_1801_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_VACA_1900_LDataSet hd_vaca_1900_l(HD_VACA_1900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1900_LDataSet ds = (HD_VACA_1900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_VACA_1606_LDataSet hd_vaca_1606_l(HD_VACA_1606_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1606_LDataSet ds = (HD_VACA_1606_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1607_LDataSet hd_vaca_1607_l(HD_VACA_1607_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1607_LDataSet ds = (HD_VACA_1607_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_VACA_1608_LDataSet hd_vaca_1608_l(HD_VACA_1608_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1608_LDataSet ds = (HD_VACA_1608_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1850_MDataSet hd_vaca_1850_m(HD_VACA_1850_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1850_MDataSet ds = (HD_VACA_1850_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1851_LDataSet hd_vaca_1851_l(HD_VACA_1851_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1851_LDataSet ds = (HD_VACA_1851_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1852_UDataSet hd_vaca_1852_u(HD_VACA_1852_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1852_UDataSet ds = (HD_VACA_1852_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1853_DDataSet hd_vaca_1853_d(HD_VACA_1853_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1853_DDataSet ds = (HD_VACA_1853_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_1861_LDataSet hd_vaca_1861_l(HD_VACA_1861_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_1861_LDataSet ds = (HD_VACA_1861_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_VACA_9999_SDataSet hd_vaca_9999_s(HD_VACA_9999_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_VACA_9999_SDataSet ds = (HD_VACA_9999_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}
