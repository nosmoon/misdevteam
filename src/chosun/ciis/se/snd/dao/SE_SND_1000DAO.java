/***************************************************************************************************
* 파일명 : SE_SND_1000DAO.java
* 기능 : 판매 - 발송관리 - 대표노선등록
 * 작성일자 : 2009.02.02
 * 작성자 :   김대준
***************************************************************************************************
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_1000_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1010_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1020_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1030_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1040_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1000_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1010_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1020_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1030_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1040_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_1000DAO {
	
	public SE_SND_1000_MDataSet se_snd_1000_m(SE_SND_1000_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1000_MDataSet ds 	= (SE_SND_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1010_LDataSet se_snd_1010_l(SE_SND_1010_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1010_LDataSet ds 	= (SE_SND_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1020_ADataSet se_snd_1020_a(SE_SND_1020_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1020_ADataSet ds 	= (SE_SND_1020_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1030_ADataSet se_snd_1030_a(SE_SND_1030_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1030_ADataSet ds 	= (SE_SND_1030_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1040_LDataSet se_snd_1040_l(SE_SND_1040_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1040_LDataSet ds 	= (SE_SND_1040_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
