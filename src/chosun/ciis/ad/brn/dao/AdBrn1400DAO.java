/***************************************************************************************************
 * 파일명 : AdBrn1400DAO.java
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

package chosun.ciis.ad.brn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.brn.dm.AD_BRN_1400_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1410_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1400_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1410_LDataSet;

/**
 * 
 */
public class AdBrn1400DAO {
	
    public AD_BRN_1400_MDataSet ad_brn_1400_m(AD_BRN_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1400_MDataSet ds = (AD_BRN_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1410_LDataSet ad_brn_1410_l(AD_BRN_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1410_LDataSet ds = (AD_BRN_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
