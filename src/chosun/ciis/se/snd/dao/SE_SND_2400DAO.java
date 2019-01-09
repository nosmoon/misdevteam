/***************************************************************************************************
* 파일명 : SE_SND_2400DAO.java
* 기능 : 판매-발송관리-수송단가변경
* 작성일자 : 2009-02-19
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_2400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2420_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2430_ADM;
import chosun.ciis.se.snd.ds.SE_SND_2400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2420_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2430_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_2400DAO {
	
	public SE_SND_2400_MDataSet se_snd_2400_m(SE_SND_2400_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2400_MDataSet ds 	= (SE_SND_2400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2410_LDataSet se_snd_2410_l(SE_SND_2410_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2410_LDataSet ds 	= (SE_SND_2410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2420_LDataSet se_snd_2420_l(SE_SND_2420_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2420_LDataSet ds 	= (SE_SND_2420_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2430_ADataSet se_snd_2430_a(SE_SND_2430_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2430_ADataSet ds 	= (SE_SND_2430_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	
}
