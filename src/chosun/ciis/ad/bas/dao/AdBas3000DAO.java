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
import chosun.ciis.ad.bas.dm.AD_BAS_3000_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3010_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3020_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3000_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3010_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3020_ADataSet;

/**
 * 
 */
public class AdBas3000DAO {
    
	public AD_BAS_3010_LDataSet ad_bas_3010_l(AD_BAS_3010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3010_LDataSet ds = (AD_BAS_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3020_ADataSet ad_bas_3020_a(AD_BAS_3020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3020_ADataSet ds = (AD_BAS_3020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_BAS_3000_MDataSet ad_bas_3000_m(AD_BAS_3000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3000_MDataSet ds = (AD_BAS_3000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
