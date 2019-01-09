package chosun.ciis.tn.dns.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.mt.etccar.dm.MT_ETCCAR_3001_ADM;
import chosun.ciis.mt.etccar.ds.MT_ETCCAR_3001_ADataSet;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

public class TN_DNS_5000DAO {
    

	public TN_DNS_5010_LDataSet tn_dns_5010_l(TN_DNS_5010_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_5010_LDataSet ds = (TN_DNS_5010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}