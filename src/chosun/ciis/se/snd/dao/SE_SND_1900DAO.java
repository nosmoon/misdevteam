/***************************************************************************************************
* 파일명 : SE_SND_1900DAO.java
* 기능 : 판매 - 발송관리 - 발송마스터
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
import chosun.ciis.se.snd.dm.SE_SND_1900_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1910_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1920_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1930_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1940_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1950_DDM;
import chosun.ciis.se.snd.ds.SE_SND_1900_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1910_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1920_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1930_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1940_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1950_DDataSet;



/**
 * 
 */
public class SE_SND_1900DAO {
	
	public SE_SND_1900_MDataSet se_snd_1900_m(SE_SND_1900_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1900_MDataSet ds 	= (SE_SND_1900_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1910_LDataSet se_snd_1910_l(SE_SND_1910_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1910_LDataSet ds 	= (SE_SND_1910_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1920_LDataSet se_snd_1920_l(SE_SND_1920_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1920_LDataSet ds 	= (SE_SND_1920_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1930_LDataSet se_snd_1930_l(SE_SND_1930_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1930_LDataSet ds 	= (SE_SND_1930_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1940_ADataSet se_snd_1940_a(SE_SND_1940_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1940_ADataSet ds 	= (SE_SND_1940_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1950_DDataSet se_snd_1950_d(SE_SND_1950_DDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1950_DDataSet ds 	= (SE_SND_1950_DDataSet) manager.executeCall(dm);
        
        System.out.println("error=" + ds.errcode);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
