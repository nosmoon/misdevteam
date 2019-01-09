/***************************************************************************************************
 * ���ϸ� : AdPub2300DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : ��ȣ��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.pub.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.pub.dm.AD_PUB_2300_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2311_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2300_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2311_LDataSet;
/**
 * 
 */
public class AdPub2300DAO {
	
	public AD_PUB_2300_MDataSet ad_pub_2300_m(AD_PUB_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2300_MDataSet ds = (AD_PUB_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_2310_LDataSet ad_pub_2310_l(AD_PUB_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2310_LDataSet ds = (AD_PUB_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_2311_LDataSet ad_pub_2311_l(AD_PUB_2311_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2311_LDataSet ds = (AD_PUB_2311_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
