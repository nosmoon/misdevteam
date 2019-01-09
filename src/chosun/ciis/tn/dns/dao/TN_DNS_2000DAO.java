package chosun.ciis.tn.dns.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.submatrcla.dm.MT_SUBMATRCLA_3321_ADM;
import chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_3321_ADataSet;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 *
 */

public class TN_DNS_2000DAO {
	
	
	public TN_DNS_2000_MDataSet tn_dns_2000_m(TN_DNS_2000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2000_MDataSet ds = (TN_DNS_2000_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

	public TN_DNS_2010_LDataSet tn_dns_2010_l(TN_DNS_2010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2010_LDataSet ds = (TN_DNS_2010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_DNS_2020_ADataSet tn_dns_2020_a(TN_DNS_2020_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2020_ADataSet ds = (TN_DNS_2020_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_DNS_2030_LDataSet tn_dns_2030_l(TN_DNS_2030_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2030_LDataSet ds = (TN_DNS_2030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public TN_DNS_2110_LDataSet tn_dns_2110_l(TN_DNS_2110_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_2110_LDataSet ds = (TN_DNS_2110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}