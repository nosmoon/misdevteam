/***************************************************************************************************
* ���ϸ� : SSExtn2600DAO.java
* ��� : Ȯ����Ȳ-��ŸȮ������۾��� ���� DAO
* �ۼ����� : 2013-1-28
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * Ȯ����Ȳ-��û��Ȳ �� ���� DAO
 */
public class SSExtn2600DAO {
    
    /**
     * Ȯ����Ȳ-��û��Ȳ Ȯ���û ���
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
	public SS_L_YEARLY_SUBSDataSet selectYearlySubsList(SS_L_YEARLY_SUBSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_YEARLY_SUBSDataSet ds = (SS_L_YEARLY_SUBSDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public SS_S_YEARLY_SUBSDataSet selectYearlySubsDetail(SS_S_YEARLY_SUBSDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_YEARLY_SUBSDataSet ds = (SS_S_YEARLY_SUBSDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public SS_L_YEARLY_SUBS_GETUSERDataSet getUserInfo(SS_L_YEARLY_SUBS_GETUSERDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_YEARLY_SUBS_GETUSERDataSet ds = (SS_L_YEARLY_SUBS_GETUSERDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SS_I_YEARLY_SUBSDataSet insertYearlySubs(SS_I_YEARLY_SUBSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_I_YEARLY_SUBSDataSet ds = (SS_I_YEARLY_SUBSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SS_L_YEARLY_SUBS_GETADDRDataSet getDlvaddr(SS_L_YEARLY_SUBS_GETADDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_YEARLY_SUBS_GETADDRDataSet ds = (SS_L_YEARLY_SUBS_GETADDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
