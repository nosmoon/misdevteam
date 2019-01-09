/***************************************************************************************************
* 파일명 : SE_SND_1500DAO.java
* 기능 : 판매 - 발송관리 - 공장별부수
* 작성일자 : 2009.02.03
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.se.snd.dm.SE_SND_1500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1520_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1520_LDataSet;



/**
 * 
 */
public class SE_SND_1500DAO {
	
	public SE_SND_1500_MDataSet se_snd_1500_m(SE_SND_1500_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1500_MDataSet ds 	= (SE_SND_1500_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1510_LDataSet se_snd_1510_l(SE_SND_1510_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1510_LDataSet ds 	= (SE_SND_1510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1520_LDataSet se_snd_1520_l(SE_SND_1520_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1520_LDataSet ds 	= (SE_SND_1520_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
