/***************************************************************************************************
 * 파일명 : .java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_2210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2220_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2220_LDataSet;
/**
 * 
 */
public class AdBas2200DAO {
	
	public AD_BAS_2210_LDataSet ad_bas_2210_l(AD_BAS_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2210_LDataSet ds = (AD_BAS_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2220_LDataSet ad_bas_2220_l(AD_BAS_2220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2220_LDataSet ds = (AD_BAS_2220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	
}
