/***************************************************************************************************
 * ���ϸ� : AdPub2500DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_2500_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2510_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2500_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2510_LDataSet;
/**
 * 
 */
public class AdPub2500DAO {
	
	public AD_PUB_2500_MDataSet ad_pub_2500_m(AD_PUB_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2500_MDataSet ds = (AD_PUB_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_2510_LDataSet ad_pub_2510_l(AD_PUB_2510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2510_LDataSet ds = (AD_PUB_2510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
