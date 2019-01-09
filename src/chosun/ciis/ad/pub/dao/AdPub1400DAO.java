/***************************************************************************************************
 * 파일명 : AdPub1400DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1400_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1410_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1420_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1430_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1400_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1410_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1420_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1430_LDataSet;

/**
 * 
 */
public class AdPub1400DAO {
	
    public AD_PUB_1400_MDataSet ad_pub_1400_m(AD_PUB_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1400_MDataSet ds = (AD_PUB_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_PUB_1410_ADataSet ad_pub_1410_a(AD_PUB_1410_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1410_ADataSet ds = (AD_PUB_1410_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_PUB_1420_ADataSet ad_pub_1420_a(AD_PUB_1420_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1420_ADataSet ds = (AD_PUB_1420_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_PUB_1430_LDataSet ad_pub_1430_l(AD_PUB_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1430_LDataSet ds = (AD_PUB_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

}
