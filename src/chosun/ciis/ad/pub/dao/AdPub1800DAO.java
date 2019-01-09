/***************************************************************************************************
 * 파일명 : AdPub1800DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_1800_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1810_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1811_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1812_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1813_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1800_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1810_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1811_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1812_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1813_LDataSet;
/**
 * 
 */
public class AdPub1800DAO {
	
	public AD_PUB_1800_MDataSet ad_pub_1800_m(AD_PUB_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1800_MDataSet ds = (AD_PUB_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1810_LDataSet ad_pub_1810_l(AD_PUB_1810_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_PUB_1810_LDataSet ds = (AD_PUB_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1811_LDataSet ad_pub_1811_l(AD_PUB_1811_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1811_LDataSet ds = (AD_PUB_1811_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_1812_LDataSet ad_pub_1812_l(AD_PUB_1812_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1812_LDataSet ds = (AD_PUB_1812_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public AD_PUB_1813_LDataSet ad_pub_1813_l(AD_PUB_1813_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_1813_LDataSet ds = (AD_PUB_1813_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
