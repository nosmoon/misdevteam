package chosun.ciis.mc.budg.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_5000DAO {
	public MC_BUDG_9999_LDataSet getDummyList(MC_BUDG_9999_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_9999_LDataSet ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public MC_BUDG_5011_LDataSet mc_budg_5011_l(MC_BUDG_5011_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5011_LDataSet ds = (MC_BUDG_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5031_LDataSet mc_budg_5031_l(MC_BUDG_5031_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5031_LDataSet ds = (MC_BUDG_5031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5061_LDataSet mc_budg_5061_l(MC_BUDG_5061_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5061_LDataSet ds = (MC_BUDG_5061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5062_LDataSet mc_budg_5062_l(MC_BUDG_5062_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5062_LDataSet ds = (MC_BUDG_5062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5070_MDataSet mc_budg_5070_m(MC_BUDG_5070_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5070_MDataSet ds = (MC_BUDG_5070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5071_LDataSet mc_budg_5071_l(MC_BUDG_5071_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5071_LDataSet ds = (MC_BUDG_5071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5151_LDataSet mc_budg_5151_l(MC_BUDG_5151_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5151_LDataSet ds = (MC_BUDG_5151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5021_LDataSet mc_budg_5021_l(MC_BUDG_5021_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5021_LDataSet ds = (MC_BUDG_5021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5072_LDataSet mc_budg_5072_l(MC_BUDG_5072_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5072_LDataSet ds = (MC_BUDG_5072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5161_LDataSet mc_budg_5161_l(MC_BUDG_5161_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5161_LDataSet ds = (MC_BUDG_5161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5171_LDataSet mc_budg_5171_l(MC_BUDG_5171_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5171_LDataSet ds = (MC_BUDG_5171_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5172_LDataSet mc_budg_5172_l(MC_BUDG_5172_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5172_LDataSet ds = (MC_BUDG_5172_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5173_LDataSet mc_budg_5173_l(MC_BUDG_5173_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5173_LDataSet ds = (MC_BUDG_5173_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MC_BUDG_5043_LDataSet mc_budg_5043_l(MC_BUDG_5043_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5043_LDataSet ds = (MC_BUDG_5043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_5098_MDataSet mc_budg_5098_m(MC_BUDG_5098_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5098_MDataSet ds = (MC_BUDG_5098_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_5180_MDataSet mc_budg_5180_m(MC_BUDG_5180_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5180_MDataSet ds = (MC_BUDG_5180_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public MC_BUDG_5181_LDataSet mc_budg_5181_l(MC_BUDG_5181_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISFNC");
		MC_BUDG_5181_LDataSet ds = (MC_BUDG_5181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}
