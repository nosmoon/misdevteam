/***************************************************************************************************
 * ���ϸ� : AdPub2000DAO.java
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
import chosun.ciis.ad.pub.dm.AD_PUB_2000_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2010_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2000_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2010_LDataSet;
/**
 * 
 */
public class AdPub2000DAO {
	
	public AD_PUB_2000_MDataSet ad_pub_2000_m(AD_PUB_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2000_MDataSet ds = (AD_PUB_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public AD_PUB_2010_LDataSet ad_pub_2010_l(AD_PUB_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_PUB_2010_LDataSet ds = (AD_PUB_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
