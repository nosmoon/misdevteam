/***************************************************************************************************
 * ���ϸ�   : AdCom1400DAO.java
 * ���     : ��������-������������ / ����Ȯ�α�����Ʈ ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.ad.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.com.dm.AD_COM_1410_LDM;
import chosun.ciis.ad.com.dm.AD_COM_1420_ADM;
import chosun.ciis.ad.com.dm.AD_COM_1430_ADM;
import chosun.ciis.ad.com.ds.AD_COM_1410_LDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1420_ADataSet;
import chosun.ciis.ad.com.ds.AD_COM_1430_ADataSet;


/**
 * ��������-������������ / ����Ȯ�α�����Ʈ
 */
 
public class AdCom1400DAO {
	
	/**
     * ��������-������������ / ����Ȯ�α�����Ʈ ��ȸ
     * @param dm AD_COM_1410_LDM
     * @return AD_COM_1410_LDataSet
     * @throws AppException
     */
    public AD_COM_1410_LDataSet ad_com_1410_l(AD_COM_1410_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1410_LDataSet ds = (AD_COM_1410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    
    /**
     * ��������-������������ ���, ����, ����
     * @param dm AD_COM_1420_ADM
     * @return AD_COM_1420_ADataSet
     * @throws AppException
     */
    public AD_COM_1420_ADataSet ad_com_1420_a(AD_COM_1420_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1420_ADataSet ds = (AD_COM_1420_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * ��������-����Ȯ�α�����Ʈ ���, ����, ����
     * @param dm AD_COM_1430_ADM
     * @return AD_COM_1430_ADataSet
     * @throws AppException
     */
    public AD_COM_1430_ADataSet ad_com_1430_a(AD_COM_1430_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1430_ADataSet ds = (AD_COM_1430_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
}
