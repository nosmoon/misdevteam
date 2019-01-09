/***************************************************************************************************
 * 파일명 : AdPub1850DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1850_MDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1850_MDataSet;
import chosun.ciis.ad.pub.dm.AD_PUB_1851_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1851_LDataSet;
import chosun.ciis.ad.pub.dm.AD_PUB_1853_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1853_LDataSet;

/**
 * 
 */
	public class AdPub1850DAO {
	
	public AD_PUB_1850_MDataSet ad_pub_1850_m(AD_PUB_1850_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1850_MDataSet ds = (AD_PUB_1850_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	

	public AD_PUB_1851_LDataSet ad_pub_1851_l(AD_PUB_1851_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1851_LDataSet ds = (AD_PUB_1851_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	public AD_PUB_1853_LDataSet ad_pub_1853_l(AD_PUB_1853_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1853_LDataSet ds = (AD_PUB_1853_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}