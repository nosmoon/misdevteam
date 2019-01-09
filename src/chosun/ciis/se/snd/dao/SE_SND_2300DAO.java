/***************************************************************************************************
* 파일명 : SE_SND_2300DAO.java
* 기능 : 판매-발송관리-수송업자등록
* 작성일자 : 2009-02-13
* 작성자 : 김대준
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
import chosun.ciis.se.snd.dm.SE_SND_2300_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2310_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2320_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2330_ADM;
import chosun.ciis.se.snd.dm.SE_SND_2340_SDM;
import chosun.ciis.se.snd.ds.SE_SND_2300_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2310_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2320_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2330_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_2340_SDataSet;



/**
 * 
 */
public class SE_SND_2300DAO {
	
	public SE_SND_2300_MDataSet se_snd_2300_m(SE_SND_2300_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2300_MDataSet ds 	= (SE_SND_2300_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2310_LDataSet se_snd_2310_l(SE_SND_2310_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2310_LDataSet ds 	= (SE_SND_2310_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2320_LDataSet se_snd_2320_l(SE_SND_2320_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2320_LDataSet ds 	= (SE_SND_2320_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2330_ADataSet se_snd_2330_a(SE_SND_2330_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2330_ADataSet ds 	= (SE_SND_2330_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2340_SDataSet se_snd_2340_s(SE_SND_2340_SDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2340_SDataSet ds 	= (SE_SND_2340_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
