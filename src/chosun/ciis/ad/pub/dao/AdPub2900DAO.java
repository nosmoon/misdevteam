/***************************************************************************************************
 * 파일명 : AdPub2900DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_2900_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2910_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2900_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2910_LDataSet;
/**
 * 
 */
public class AdPub2900DAO {
	
	public AD_PUB_2900_MDataSet ad_pub_2900_m(AD_PUB_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2900_MDataSet ds = (AD_PUB_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_2910_LDataSet ad_pub_2910_l(AD_PUB_2910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2910_LDataSet ds = (AD_PUB_2910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
