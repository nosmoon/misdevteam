package chosun.ciis.tn.dns.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import java.sql.SQLException;

import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;
  
public class TN_DNS_1000DAO {
	public TN_DNS_1000_MDataSet tn_dns_1000_m(TN_DNS_1000_MDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1000_MDataSet ds = (TN_DNS_1000_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public TN_DNS_1010_LDataSet tn_dns_1010_l(TN_DNS_1010_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1010_LDataSet ds = (TN_DNS_1010_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public TN_DNS_1020_LDataSet tn_dns_1020_l(TN_DNS_1020_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1020_LDataSet ds = (TN_DNS_1020_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public TN_DNS_1030_ADataSet tn_dns_1030_a(TN_DNS_1030_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1030_ADataSet ds = (TN_DNS_1030_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public TN_DNS_1040_ADataSet tn_dns_1040_a(TN_DNS_1040_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1040_ADataSet ds = (TN_DNS_1040_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public TN_DNS_1041_UDataSet tn_dns_1041_u(TN_DNS_1041_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1041_UDataSet ds = (TN_DNS_1041_UDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	public TN_DNS_1045_UDataSet tn_dns_1045_u(TN_DNS_1045_UDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1045_UDataSet ds = (TN_DNS_1045_UDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}			
	public TN_DNS_1050_ADataSet tn_dns_1050_a(TN_DNS_1050_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1050_ADataSet ds = (TN_DNS_1050_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		
	public TN_DNS_1060_LDataSet tn_dns_1060_l(TN_DNS_1060_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1060_LDataSet ds = (TN_DNS_1060_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public TN_DNS_1070_ADataSet tn_dns_1070_a(TN_DNS_1070_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1070_ADataSet ds = (TN_DNS_1070_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public TN_DNS_1075_ADataSet tn_dns_1075_a(TN_DNS_1075_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1075_ADataSet ds = (TN_DNS_1075_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}		
	public TN_DNS_1080_LDataSet tn_dns_1080_l(TN_DNS_1080_LDM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_1080_LDataSet ds = (TN_DNS_1080_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
	public TN_DNS_3040_ADataSet tn_dns_3040_a(TN_DNS_3040_ADM dm) throws AppException, SQLException {
		DBManager manager = new DBManager("MISTNN");
		TN_DNS_3040_ADataSet ds = (TN_DNS_3040_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}	
}
