/***************************************************************************************************
 * 파일명 : AdPub2500DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_3200_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3210_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_3220_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_3200_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3210_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_3220_LDataSet;
/**
 * 
 */
public class AdPub3200DAO {
	
	public AD_PUB_3200_MDataSet ad_pub_3200_m(AD_PUB_3200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3200_MDataSet ds = (AD_PUB_3200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_3210_LDataSet ad_pub_3210_l(AD_PUB_3210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3210_LDataSet ds = (AD_PUB_3210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_3220_LDataSet ad_pub_3220_l(AD_PUB_3220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_3220_LDataSet ds = (AD_PUB_3220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
