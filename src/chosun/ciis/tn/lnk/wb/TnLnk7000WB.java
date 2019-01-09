/***************************************************************************************************
* 파일명 : TnLnk1000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김상훈
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.tn.lnk.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.tn.dns.dao.TN_DNS_1000DAO;
import chosun.ciis.tn.lnk.dao.TnLnk1000DAO;
import chosun.ciis.tn.lnk.dao.TnLnk7000DAO;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class TnLnk7000WB extends BaseWB {

    public void tn_lnk_7010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	TN_LNK_7010_LDataSet ds = null;

        // DM Setting
    	TN_LNK_7010_LDM dm = new TN_LNK_7010_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String yy     = Util.checkString(req.getParameter("yy"));
    
        dm.setCmpy_cd(cmpy_cd);
        dm.setYy(yy);
        
        dm.print();
        
		 try { 
			 	TnLnk7000DAO dao = new TnLnk7000DAO();
	            ds = dao.tn_lnk_7010_l(dm);
	            req.setAttribute("ds", ds);
	        }
	        catch (AppException e) {
	            LogManager.getInstance().log(e);
	            throw e;
	        }     

    } 
 
}
