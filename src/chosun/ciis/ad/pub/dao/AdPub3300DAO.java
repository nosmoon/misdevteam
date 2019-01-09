/***************************************************************************************************
 * 파일명 : AdPub33400DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.pub.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.pub.dm.AD_PUB_3310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3330_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_3350_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_3310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3330_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3350_ADataSet;
/**
 * 
 */
public class AdPub3300DAO {

	public AD_PUB_3310_LDataSet ad_pub_3310_l(AD_PUB_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3310_LDataSet ds = (AD_PUB_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3330_ADataSet ad_pub_3330_a(AD_PUB_3330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3330_ADataSet ds = (AD_PUB_3330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3350_ADataSet ad_pub_3350_a(AD_PUB_3350_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3350_ADataSet ds = (AD_PUB_3350_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
