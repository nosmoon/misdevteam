/***************************************************************************************************
* 파일명 : SSExtn2600DAO.java
* 기능 : 확장현황-기타확장관련작업을 위한 DAO
* 작성일자 : 2013-1-28
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;

/**
 * 확장현황-신청현황 을 위한 DAO
 */
public class SSExtn2600DAO {
    
    /**
     * 확장현황-신청현황 확장신청 목록
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
