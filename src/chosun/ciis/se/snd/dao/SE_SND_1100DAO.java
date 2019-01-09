/***************************************************************************************************
* 파일명 : SE_SND_1100DAO.java
* 기능 : 판매 - 발송관리 - 노선등록
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

import chosun.ciis.se.snd.dm.SE_SND_1100_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1110_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1120_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1130_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1140_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1100_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1110_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1120_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1130_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1140_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_1100DAO {
	
	public SE_SND_1100_MDataSet se_snd_1100_m(SE_SND_1100_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1100_MDataSet ds 	= (SE_SND_1100_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1110_LDataSet se_snd_1110_l(SE_SND_1110_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1110_LDataSet ds 	= (SE_SND_1110_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1120_LDataSet se_snd_1120_l(SE_SND_1120_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1120_LDataSet ds 	= (SE_SND_1120_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1130_ADataSet se_snd_1130_a(SE_SND_1130_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1130_ADataSet ds 	= (SE_SND_1130_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1140_LDataSet se_snd_1140_l(SE_SND_1140_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1140_LDataSet ds 	= (SE_SND_1140_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
