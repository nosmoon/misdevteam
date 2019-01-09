/***************************************************************************************************
 * 파일명 : AdPub1200DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1200_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1210_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1220_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1200_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1210_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1220_ADataSet;

/**
 * 
 */
public class AdPub1200DAO {
	
	public AD_PUB_1200_MDataSet ad_pub_1200_m(AD_PUB_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1200_MDataSet ds = (AD_PUB_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1210_SDataSet ad_pub_1210_s(AD_PUB_1210_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1210_SDataSet ds = (AD_PUB_1210_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
	public AD_PUB_1220_ADataSet ad_pub_1220_a(AD_PUB_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1220_ADataSet ds = (AD_PUB_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
}
