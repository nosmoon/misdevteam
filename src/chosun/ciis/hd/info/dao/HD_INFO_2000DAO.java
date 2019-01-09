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

package chosun.ciis.hd.info.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */
public class HD_INFO_2000DAO {
	
	public HD_INFO_2000_LDataSet hd_info_2000_l(HD_INFO_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2000_LDataSet ds = (HD_INFO_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2001_LDataSet hd_info_2001_l(HD_INFO_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2001_LDataSet ds = (HD_INFO_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2002_ADataSet hd_info_2002_a(HD_INFO_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2002_ADataSet ds = (HD_INFO_2002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2003_ADataSet hd_info_2003_a(HD_INFO_2003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2003_ADataSet ds = (HD_INFO_2003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2004_ADataSet hd_info_2004_a(HD_INFO_2004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2004_ADataSet ds = (HD_INFO_2004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2006_ADataSet hd_info_2006_a(HD_INFO_2006_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2006_ADataSet ds = (HD_INFO_2006_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2100_LDataSet hd_info_2100_l(HD_INFO_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2100_LDataSet ds = (HD_INFO_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2101_ADataSet hd_info_2101_a(HD_INFO_2101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2101_ADataSet ds = (HD_INFO_2101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2102_LDataSet hd_info_2102_l(HD_INFO_2102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2102_LDataSet ds = (HD_INFO_2102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2103_UDataSet hd_info_2103_u(HD_INFO_2103_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2103_UDataSet ds = (HD_INFO_2103_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2200_LDataSet hd_info_2200_l(HD_INFO_2200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2200_LDataSet ds = (HD_INFO_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	 
	public HD_INFO_2201_LDataSet hd_info_2201_l(HD_INFO_2201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2201_LDataSet ds = (HD_INFO_2201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2202_LDataSet hd_info_2202_l(HD_INFO_2202_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2202_LDataSet ds = (HD_INFO_2202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {

			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2203_ADataSet hd_info_2203_a(HD_INFO_2203_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2203_ADataSet ds = (HD_INFO_2203_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2300_LDataSet hd_info_2300_l(HD_INFO_2300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2300_LDataSet ds = (HD_INFO_2300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2301_ADataSet hd_info_2301_a(HD_INFO_2301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2301_ADataSet ds = (HD_INFO_2301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2400_ADataSet hd_info_2400_a(HD_INFO_2400_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		System.out.println("#########DAO");
		HD_INFO_2400_ADataSet ds = (HD_INFO_2400_ADataSet)manager.executeCall(dm);
		System.out.println("#########DAO ds.getErrcode() : " + ds.getErrcode());
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2401_LDataSet hd_info_2401_l(HD_INFO_2401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("dao 1");
		HD_INFO_2401_LDataSet ds = (HD_INFO_2401_LDataSet)manager.executeCall(dm);
		System.out.println("dao 2");
		if(!ds.getErrcode().equals("")) {
			System.out.println("dao error");
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2402_LDataSet hd_info_2402_l(HD_INFO_2402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2402_LDataSet ds = (HD_INFO_2402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_INFO_2500_LDataSet hd_info_2500_l(HD_INFO_2500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2500_LDataSet ds = (HD_INFO_2500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2600_LDataSet hd_info_2600_l(HD_INFO_2600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2600_LDataSet ds = (HD_INFO_2600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2601_ADataSet hd_info_2601_a(HD_INFO_2601_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2601_ADataSet ds = (HD_INFO_2601_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2602_LDataSet hd_info_2602_l(HD_INFO_2602_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2602_LDataSet ds = (HD_INFO_2602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INFO_2403_LDataSet hd_info_2403_l(HD_INFO_2403_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INFO_2403_LDataSet ds = (HD_INFO_2403_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	 
}
