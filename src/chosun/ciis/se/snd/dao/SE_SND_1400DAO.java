/***************************************************************************************************
* 파일명 : SE_SND_1400DAO.java
* 기능 : 판매 - 발송관리 - 노선별부수집계
* 작성일자 : 2009.01.30
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_1400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1420_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1420_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_1400DAO {
	
	public SE_SND_1400_MDataSet se_snd_1400_m(SE_SND_1400_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1400_MDataSet ds 	= (SE_SND_1400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1410_LDataSet se_snd_1410_l(SE_SND_1410_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1410_LDataSet ds 	= (SE_SND_1410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1420_LDataSet se_snd_1420_l(SE_SND_1420_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1420_LDataSet ds 	= (SE_SND_1420_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
