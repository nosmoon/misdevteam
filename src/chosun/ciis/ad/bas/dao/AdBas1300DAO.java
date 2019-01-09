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
import chosun.ciis.ad.bas.dm.AD_BAS_1300_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1310_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1300_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1310_LDataSet;

/**
 * 
 */
public class AdBas1300DAO {
	
    //대행사/지사 담보내역 메인
	public AD_BAS_1300_MDataSet ad_bas_1300_m(AD_BAS_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1300_MDataSet ds = (AD_BAS_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	//대행사/지사 담보내역 리스트
	public AD_BAS_1310_LDataSet ad_bas_1310_l(AD_BAS_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1310_LDataSet ds = (AD_BAS_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
