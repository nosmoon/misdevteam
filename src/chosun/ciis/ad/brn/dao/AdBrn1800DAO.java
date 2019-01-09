/***************************************************************************************************
 * ���ϸ�   : AdBrn1800DAO.java
 * ���     : ��������-������Ȳ ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.ad.brn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.brn.dm.AD_BRN_1810_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1820_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1810_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1820_ADataSet;


/**
 * ��������-������Ȳ
 */
 
public class AdBrn1800DAO {
	
    /**
     * ��������-������Ȳ �����ȸ
     * @param dm AD_BRN_1810_LDM
     * @return AD_BRN_1810_LDataSet
     * @throws AppException
     */
    public AD_BRN_1810_LDataSet ad_brn_1810_l(AD_BRN_1810_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BRN_1810_LDataSet ds = (AD_BRN_1810_LDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
	 * ��������-������Ȳ ����ó��
	 * @param  AD_BRN_1870_ADM
	 * @return AD_BRN_1870_ADataSet
	 * @throws AppException
	 */
    public AD_BRN_1820_ADataSet ad_brn_1820_a(AD_BRN_1820_ADM dm) throws AppException {
    	
        DBManager manager = new DBManager("MISADV");        
        AD_BRN_1820_ADataSet ds = (AD_BRN_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
