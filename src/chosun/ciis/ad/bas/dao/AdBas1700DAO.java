/***************************************************************************************************
 * 파일명 : AdBas1700DAO.java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_1710_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1720_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1710_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1720_ADataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas1700DAO {
	
    public AD_BAS_1710_SDataSet ad_bas_1710_s(AD_BAS_1710_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1710_SDataSet ds = (AD_BAS_1710_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1720_ADataSet ad_bas_1720_a(AD_BAS_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1720_ADataSet ds = (AD_BAS_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

}
