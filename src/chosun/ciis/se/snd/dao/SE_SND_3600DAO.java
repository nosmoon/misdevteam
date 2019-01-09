/***************************************************************************************************
* 파일명 : SE_SND_3600DAO.java
* 기능 : 판매 - 노선관리 - 노선 인쇄처 변경
 * 작성일자 : 2009.06.24
 * 작성자 :   이근탁
***************************************************************************************************
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_3600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3610_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3620_ADM;

import chosun.ciis.se.snd.ds.SE_SND_3600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3610_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3620_ADataSet;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_3600DAO {
	
	public SE_SND_3600_MDataSet se_snd_3600_m(SE_SND_3600_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3600_MDataSet ds 	= (SE_SND_3600_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3610_LDataSet se_snd_3610_l(SE_SND_3610_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3610_LDataSet ds 	= (SE_SND_3610_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3620_ADataSet se_snd_3620_a(SE_SND_3620_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3620_ADataSet ds 	= (SE_SND_3620_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
	
}
