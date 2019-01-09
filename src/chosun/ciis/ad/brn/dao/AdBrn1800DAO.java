/***************************************************************************************************
 * 파일명   : AdBrn1800DAO.java
 * 기능     : 광고지사-예약현황 화면의 모든 이벤트를 처리
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/

package chosun.ciis.ad.brn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.brn.dm.AD_BRN_1810_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1820_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1810_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1820_ADataSet;


/**
 * 광고지사-예약현황
 */
 
public class AdBrn1800DAO {
	
    /**
     * 광고지사-예약현황 목록조회
     * @param dm AD_BRN_1810_LDM
     * @return AD_BRN_1810_LDataSet
     * @throws AppException
     */
    public AD_BRN_1810_LDataSet ad_brn_1810_l(AD_BRN_1810_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BRN_1810_LDataSet ds = (AD_BRN_1810_LDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
	 * 광고지사-예약현황 승인처리
	 * @param  AD_BRN_1870_ADM
	 * @return AD_BRN_1870_ADataSet
	 * @throws AppException
	 */
    public AD_BRN_1820_ADataSet ad_brn_1820_a(AD_BRN_1820_ADM dm) throws AppException {
    	
        DBManager manager = new DBManager("MISADV");        
        AD_BRN_1820_ADataSet ds = (AD_BRN_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
