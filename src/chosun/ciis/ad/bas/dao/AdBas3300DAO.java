/***************************************************************************************************
 * ���ϸ� : .java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_3310_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3320_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3310_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3320_LDataSet;

/**
 * 
 */
public class AdBas3300DAO {
	
    
	
	//������ ����Ʈ ��ȸ 3310
	public AD_BAS_3310_LDataSet ad_bas_3310_l(AD_BAS_3310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3310_LDataSet ds = (AD_BAS_3310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	//����� ����Ʈ ��ȸ 3320
	public AD_BAS_3320_LDataSet ad_bas_3320_l(AD_BAS_3320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3320_LDataSet ds = (AD_BAS_3320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }	
}
