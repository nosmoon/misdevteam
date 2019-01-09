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

//import javax.ejb.EJBException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;
  
/**
 * 
 */
public class HD_AFFR_2000DAO {

	
	public HD_AFFR_2010_LDataSet hd_affr_2010(HD_AFFR_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2010_LDataSet ds = (HD_AFFR_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2011_LDataSet hd_affr_2011(HD_AFFR_2011_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2011_LDataSet ds = (HD_AFFR_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_2012_ADataSet hd_affr_2012(HD_AFFR_2012_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2012_ADataSet ds = (HD_AFFR_2012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2013_LDataSet hd_affr_2013_l(HD_AFFR_2013_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2013_LDataSet ds = (HD_AFFR_2013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_2014_ADataSet hd_affr_2014_a(HD_AFFR_2014_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2014_ADataSet ds = (HD_AFFR_2014_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public HD_AFFR_2015_DDataSet hd_affr_2015_d(HD_AFFR_2015_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2015_DDataSet ds = (HD_AFFR_2015_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_AFFR_2017_IDataSet hd_affr_2017_i(HD_AFFR_2017_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2017_IDataSet ds = (HD_AFFR_2017_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public HD_AFFR_2020_LDataSet hd_affr_2020(HD_AFFR_2020_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2020_LDataSet ds = (HD_AFFR_2020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_2100_LDataSet hd_affr_2100_l(HD_AFFR_2100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2100_LDataSet ds = (HD_AFFR_2100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_2110_ADataSet hd_affr_2110(HD_AFFR_2110_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2110_ADataSet ds = (HD_AFFR_2110_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2120_LDataSet hd_affr_2120(HD_AFFR_2120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2120_LDataSet ds = (HD_AFFR_2120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2200_LDataSet hd_affr_2200(HD_AFFR_2200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2200_LDataSet ds = (HD_AFFR_2200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2210_LDataSet hd_affr_2210(HD_AFFR_2210_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2210_LDataSet ds = (HD_AFFR_2210_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2211_ADataSet hd_affr_2211(HD_AFFR_2211_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2211_ADataSet ds = (HD_AFFR_2211_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2212_LDataSet hd_affr_2212_l(HD_AFFR_2212_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2212_LDataSet ds = (HD_AFFR_2212_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2220_LDataSet hd_affr_2220(HD_AFFR_2220_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2220_LDataSet ds = (HD_AFFR_2220_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2310_LDataSet hd_affr_2310(HD_AFFR_2310_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2310_LDataSet ds = (HD_AFFR_2310_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2312_LDataSet hd_affr_2312(HD_AFFR_2312_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2312_LDataSet ds = (HD_AFFR_2312_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2313_LDataSet hd_affr_2313(HD_AFFR_2313_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2313_LDataSet ds = (HD_AFFR_2313_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2314_ADataSet hd_affr_2314(HD_AFFR_2314_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2314_ADataSet ds = (HD_AFFR_2314_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}		
	
	public HD_AFFR_2315_LDataSet hd_affr_2315_l(HD_AFFR_2315_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2315_LDataSet ds = (HD_AFFR_2315_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_2316_ADataSet hd_affr_2316_a(HD_AFFR_2316_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2316_ADataSet ds = (HD_AFFR_2316_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_2317_DDataSet hd_affr_2317_d(HD_AFFR_2317_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2317_DDataSet ds = (HD_AFFR_2317_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2320_LDataSet hd_affr_2320(HD_AFFR_2320_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2320_LDataSet ds = (HD_AFFR_2320_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2321_LDataSet hd_affr_2321(HD_AFFR_2321_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2321_LDataSet ds = (HD_AFFR_2321_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2322_LDataSet hd_affr_2322(HD_AFFR_2322_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2322_LDataSet ds = (HD_AFFR_2322_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2323_LDataSet hd_affr_2323(HD_AFFR_2323_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2323_LDataSet ds = (HD_AFFR_2323_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_2400_LDataSet hd_affr_2400(HD_AFFR_2400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2400_LDataSet ds = (HD_AFFR_2400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_2401_LDataSet hd_affr_2401(HD_AFFR_2401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2401_LDataSet ds = (HD_AFFR_2401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2402_LDataSet hd_affr_2402(HD_AFFR_2402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2402_LDataSet ds = (HD_AFFR_2402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2403_ADataSet hd_affr_2403(HD_AFFR_2403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2403_ADataSet ds = (HD_AFFR_2403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2404_LDataSet hd_affr_2404(HD_AFFR_2404_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2404_LDataSet ds = (HD_AFFR_2404_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public HD_AFFR_2405_LDataSet hd_affr_2405(HD_AFFR_2405_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2405_LDataSet ds = (HD_AFFR_2405_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2406_LDataSet hd_affr_2406_l(HD_AFFR_2406_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2406_LDataSet ds = (HD_AFFR_2406_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2407_ADataSet hd_affr_2407_a(HD_AFFR_2407_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2407_ADataSet ds = (HD_AFFR_2407_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2408_DDataSet hd_affr_2408_d(HD_AFFR_2408_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2408_DDataSet ds = (HD_AFFR_2408_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2500_LDataSet hd_affr_2500(HD_AFFR_2500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2500_LDataSet ds = (HD_AFFR_2500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2501_LDataSet hd_affr_2501(HD_AFFR_2501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2501_LDataSet ds = (HD_AFFR_2501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2502_LDataSet hd_affr_2502(HD_AFFR_2502_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2502_LDataSet ds = (HD_AFFR_2502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2503_ADataSet hd_affr_2503(HD_AFFR_2503_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2503_ADataSet ds = (HD_AFFR_2503_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2700_LDataSet hd_affr_2700(HD_AFFR_2700_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2700_LDataSet ds = (HD_AFFR_2700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2600_LDataSet hd_affr_2600(HD_AFFR_2600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2600_LDataSet ds = (HD_AFFR_2600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2701_LDataSet hd_affr_2701(HD_AFFR_2701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2701_LDataSet ds = (HD_AFFR_2701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2702_LDataSet hd_affr_2702(HD_AFFR_2702_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2702_LDataSet ds = (HD_AFFR_2702_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2703_ADataSet hd_affr_2703(HD_AFFR_2703_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2703_ADataSet ds = (HD_AFFR_2703_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2704_LDataSet hd_affr_2704(HD_AFFR_2704_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2704_LDataSet ds = (HD_AFFR_2704_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2705_ADataSet hd_affr_2705_a(HD_AFFR_2705_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2705_ADataSet ds = (HD_AFFR_2705_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	
	public HD_AFFR_2706_DDataSet hd_affr_2706_d(HD_AFFR_2706_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2706_DDataSet ds = (HD_AFFR_2706_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2708_LDataSet hd_affr_2708_l(HD_AFFR_2708_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2708_LDataSet ds = (HD_AFFR_2708_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2800_LDataSet hd_affr_2800(HD_AFFR_2800_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2800_LDataSet ds = (HD_AFFR_2800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2801_IDataSet hd_affr_2801(HD_AFFR_2801_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2801_IDataSet ds = (HD_AFFR_2801_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_AFFR_2900_LDataSet hd_affr_2900(HD_AFFR_2900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2900_LDataSet ds = (HD_AFFR_2900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2901_LDataSet hd_affr_2901(HD_AFFR_2901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2901_LDataSet ds = (HD_AFFR_2901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public HD_AFFR_2902_ADataSet hd_affr_2902(HD_AFFR_2902_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_2902_ADataSet ds = (HD_AFFR_2902_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
}
