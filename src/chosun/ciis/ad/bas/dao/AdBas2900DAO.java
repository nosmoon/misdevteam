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
import chosun.ciis.ad.bas.dm.AD_BAS_2900_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2910_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2920_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2900_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2910_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2920_LDataSet;

/**
 * 
 */
public class AdBas2900DAO {
    
	public AD_BAS_2900_MDataSet ad_bas_2900_m(AD_BAS_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2900_MDataSet ds = (AD_BAS_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2910_LDataSet ad_bas_2910_l(AD_BAS_2910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2910_LDataSet ds = (AD_BAS_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_2920_LDataSet ad_bas_2920_l(AD_BAS_2920_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2920_LDataSet ds = (AD_BAS_2920_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
