/***************************************************************************************************
* 파일명 : SE_SND_2000DAO.java
* 기능 : 판매 - 발송관리 - 노선순위변경
* 작성일자 : 2009.02.13
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
import chosun.ciis.se.snd.dm.SE_SND_2000_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2010_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2020_ADM;
import chosun.ciis.se.snd.ds.SE_SND_1900_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1910_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1920_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1930_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1940_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1950_DDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2000_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2010_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2020_ADataSet;



/**
 * 
 */
public class SE_SND_2000DAO {
	
	public SE_SND_2000_MDataSet se_snd_2000_m(SE_SND_2000_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2000_MDataSet ds 	= (SE_SND_2000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2010_LDataSet se_snd_2010_l(SE_SND_2010_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2010_LDataSet ds 	= (SE_SND_2010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2020_ADataSet se_snd_2020_a(SE_SND_2020_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2020_ADataSet ds 	= (SE_SND_2020_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
