package chosun.ciis.se.boi.dao;

import chosun.ciis.se.boi.dm.SE_BOI_3000_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_3010_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_3020_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_3030_UDM;
import chosun.ciis.se.boi.ds.SE_BOI_3000_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_3010_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_3020_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_3030_UDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

public class SE_BOI_3000DAO {

	public SE_BOI_3000_ADataSet se_boi_3000_a(SE_BOI_3000_ADM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_3000_ADataSet ds = (SE_BOI_3000_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}

	public SE_BOI_3010_LDataSet se_boi_3010_l(SE_BOI_3010_LDM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_3010_LDataSet ds = (SE_BOI_3010_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}

	public SE_BOI_3020_SDataSet se_boi_3020_s(SE_BOI_3020_SDM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_3020_SDataSet ds = (SE_BOI_3020_SDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		return ds;
	}

	public SE_BOI_3030_UDataSet se_boi_3030_u(SE_BOI_3030_UDM dm) throws AppException {
		// TODO Auto-generated method stub
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_3030_UDataSet ds = (SE_BOI_3030_UDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			ds = null;
		}
		
		return ds;
	}

}
