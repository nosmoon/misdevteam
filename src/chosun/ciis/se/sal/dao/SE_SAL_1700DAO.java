/***************************************************************************************************
* ���ϸ� : SE_SAL_1700DAO.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-16
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;

import chosun.ciis.se.sal.dm.CO_SMTB_1020_UDM;
import chosun.ciis.se.sal.ds.CO_SMTB_1020_UDataSet;
import chosun.ciis.se.sal.dm.SE_SAL_1700_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1710_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1720_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1730_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1740_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1750_LDM;
import chosun.ciis.se.sal.dm.SE_SAL_1760_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1770_UDM;
import chosun.ciis.se.sal.dm.SE_SAL_1780_ADM;
import chosun.ciis.se.sal.dm.SE_SAL_1785_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1700_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1710_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1720_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1730_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1740_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1750_LDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1760_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1770_UDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1780_ADataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1785_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
                                                                 
                                                                                      
public class SE_SAL_1700DAO {
	public SE_SAL_1700_MDataSet se_sal_1700_m(SE_SAL_1700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1700_MDataSet ds = (SE_SAL_1700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_SAL_1710_LDataSet se_sal_1710_l(SE_SAL_1710_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1710_LDataSet ds = (SE_SAL_1710_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1720_ADataSet se_sal_1720_a(SE_SAL_1720_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1720_ADataSet ds = (SE_SAL_1720_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1730_LDataSet se_sal_1730_l(SE_SAL_1730_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1730_LDataSet ds = (SE_SAL_1730_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1740_ADataSet se_sal_1740_a(SE_SAL_1740_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1740_ADataSet ds = (SE_SAL_1740_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1750_LDataSet se_sal_1750_l(SE_SAL_1750_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1750_LDataSet ds = (SE_SAL_1750_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1760_ADataSet se_sal_1760_a(SE_SAL_1760_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1760_ADataSet ds = (SE_SAL_1760_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1770_UDataSet se_sal_1770_u(SE_SAL_1770_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1770_UDataSet ds = (SE_SAL_1770_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1780_ADataSet se_sal_1780_a(SE_SAL_1780_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1780_ADataSet ds = (SE_SAL_1780_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SAL_1785_ADataSet se_sal_1785_a(SE_SAL_1785_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SAL_1785_ADataSet ds = (SE_SAL_1785_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
}                                                                               
