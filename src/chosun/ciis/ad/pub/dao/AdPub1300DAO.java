/***************************************************************************************************
 * 파일명 : AdPub1300DAO.java
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

package chosun.ciis.ad.pub.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.pub.dm.AD_PUB_1300_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1320_UDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1300_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1320_UDataSet;
/**
 * 
 */
public class AdPub1300DAO {
	
	public AD_PUB_1300_MDataSet ad_pub_1300_m(AD_PUB_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1300_MDataSet ds = (AD_PUB_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
	
	public AD_PUB_1310_LDataSet ad_pub_1310_l(AD_PUB_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1310_LDataSet ds = (AD_PUB_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	
	public AD_PUB_1320_UDataSet ad_pub_1320_u(AD_PUB_1320_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1320_UDataSet ds = (AD_PUB_1320_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
