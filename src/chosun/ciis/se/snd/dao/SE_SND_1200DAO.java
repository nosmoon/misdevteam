/**************************************************************************************************
* 파일명 : SE_SND_1200DAO.java
* 기능 : 판매 - 발송관리 - 노선구분등록
* 작성일자 : 2009.01.20
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_1210_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1220_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1230_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1240_ADM;
import chosun.ciis.se.snd.ds.SE_SND_1210_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1220_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1230_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1240_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_1200DAO {
	
	public SE_SND_1210_LDataSet se_snd_1210_l(SE_SND_1210_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1210_LDataSet ds 	= (SE_SND_1210_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1220_ADataSet se_snd_1220_a(SE_SND_1220_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1220_ADataSet ds 	= (SE_SND_1220_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SE_SND_1230_LDataSet se_snd_1230_l(SE_SND_1230_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1230_LDataSet ds 	= (SE_SND_1230_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1240_ADataSet se_snd_1240_a(SE_SND_1240_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1240_ADataSet ds 	= (SE_SND_1240_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
