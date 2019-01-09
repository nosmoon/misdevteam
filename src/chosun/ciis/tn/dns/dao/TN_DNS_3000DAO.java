package chosun.ciis.tn.dns.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.MT_ETCCAR_3001_ADM;
import chosun.ciis.mt.etccar.ds.MT_ETCCAR_3001_ADataSet;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 *
 */

public class TN_DNS_3000DAO {
    

	public TN_DNS_3010_LDataSet tn_dns_3010_l(TN_DNS_3010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3010_LDataSet ds = (TN_DNS_3010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_DNS_3060_LDataSet tn_dns_3060_l(TN_DNS_3060_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3060_LDataSet ds = (TN_DNS_3060_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	
	public TN_DNS_3110_LDataSet tn_dns_3110_l(TN_DNS_3110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3110_LDataSet ds = (TN_DNS_3110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public TN_DNS_3030_ADataSet tn_dns_3030_a(TN_DNS_3030_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3030_ADataSet ds = (TN_DNS_3030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public TN_DNS_3120_LDataSet tn_dns_3120_l(TN_DNS_3120_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3120_LDataSet ds = (TN_DNS_3120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public TN_DNS_3130_LDataSet tn_dns_3130_l(TN_DNS_3130_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3130_LDataSet ds = (TN_DNS_3130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}	

	public TN_DNS_3140_ADataSet tn_dns_3140_a(TN_DNS_3140_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3140_ADataSet ds = (TN_DNS_3140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public TN_DNS_3150_ADataSet tn_dns_3150_a(TN_DNS_3150_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3150_ADataSet ds = (TN_DNS_3150_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public TN_DNS_3160_LDataSet tn_dns_3160_l(TN_DNS_3160_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3160_LDataSet ds = (TN_DNS_3160_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public TN_DNS_3170_LDataSet tn_dns_3170_l(TN_DNS_3170_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3170_LDataSet ds = (TN_DNS_3170_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}