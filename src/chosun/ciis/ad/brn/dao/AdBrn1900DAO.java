/***************************************************************************************************
 * 파일명 : AdBrn1900DAO.java
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
import chosun.ciis.ad.brn.dm.AD_BRN_1900_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1910_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1920_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1900_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1910_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1920_ADataSet;

/**
 * 
 */
public class AdBrn1900DAO {
	
	
    public AD_BRN_1900_MDataSet ad_brn_1900_m(AD_BRN_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1900_MDataSet ds = (AD_BRN_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    
	public AD_BRN_1910_LDataSet ad_brn_1910_l(AD_BRN_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1910_LDataSet ds = (AD_BRN_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_BRN_1920_ADataSet ad_brn_1920_a(AD_BRN_1920_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1920_ADataSet ds = (AD_BRN_1920_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     

}
