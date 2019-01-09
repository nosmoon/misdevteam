/***************************************************************************************************
 * 파일명   : AdCom1500DAO.java
 * 기능     : 
 * 작성일자 : 
 * 작성자   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 ***************************************************************************************************/

package chosun.ciis.ad.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.com.dm.AD_COM_1510_LDM;
import chosun.ciis.ad.com.dm.AD_COM_1520_SDM;
import chosun.ciis.ad.com.dm.AD_COM_1530_ADM;
import chosun.ciis.ad.com.ds.AD_COM_1510_LDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1520_SDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1530_ADataSet;


/**
 * 
 */
 
public class AdCom1500DAO {
	
	/**
     * 
     * @param dm AD_COM_1510_LDM
     * @return AD_COM_1510_LDataSet
     * @throws AppException
     */
    public AD_COM_1510_LDataSet ad_com_1510_l(AD_COM_1510_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1510_LDataSet ds = (AD_COM_1510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
	/**
     * 
     * @param dm AD_COM_1510_LDM
     * @return AD_COM_1510_LDataSet
     * @throws AppException
     */
    public AD_COM_1520_SDataSet ad_com_1520_s(AD_COM_1520_SDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1520_SDataSet ds = (AD_COM_1520_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

	/**
     * 
     * @param dm AD_COM_1520_SDM
     * @return AD_COM_1520_SDataSet
     * @throws AppException
     */
    public AD_COM_1530_ADataSet ad_com_1530_a(AD_COM_1530_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_COM_1530_ADataSet ds = (AD_COM_1530_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
  
}
