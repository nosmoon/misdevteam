/***************************************************************************************************
* 파일명 : AdCommon8000WB.java
* 기능 : SMS Service
 * 작성일자 : 2010.08.27
 * 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.common.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.common.dao.AdCommon8000DAO;
import chosun.ciis.ad.common.dm.AD_CO_8000_ADM;
import chosun.ciis.ad.common.ds.AD_CO_8000_ADataSet;
import chosun.ciis.co.base.util.PubcPrengInfo;
import chosun.ciis.co.base.wb.BaseWB;

import java.text.*;
/**
 * 
 */

public class AdCommon8000WB extends BaseWB {
	
	public void ad_co_8000_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmss");
		String inDate = sf.format(new java.util.Date());
				
		String sndTelNo = 	Util.checkString(req.getParameter("send_tel_no"));
		String sndMsg	=	Util.checkString(req.getParameter("send_msg"));
		String sysKey	=	"ERP_AD";
		
//		String[] rcvTelNo = 	req.getParameterValues("mobile_number");
//System.out.println(rcvTelNo[0]);		
		
		String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData"));
     	Hashtable hash 			= getHashMultiUpdateData(multiUpdateData);
     	String mode 			= Util.checkString((String)hash.get("m"));
        String dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
        String dlco_nm 			= Util.checkString((String)hash.get("dlco_nm"));
        String cust_seq			= Util.checkString((String)hash.get("cust_seq"));
        String cust_name		= Util.checkString((String)hash.get("cust_name"));
        String rcvTelNo 		= Util.checkString((String)hash.get("mobile_number"));

//System.out.println(rcvTelNo);

		AD_CO_8000_ADM dm = new AD_CO_8000_ADM();
		dm.setInDate(inDate);
		dm.setRcvTelNo(rcvTelNo);
		dm.setSndMsg(sndMsg);
		dm.setSndTelNo(sndTelNo);
		dm.setSysKey(sysKey);
		
		try{			
			AdCommon8000DAO dao 	= new AdCommon8000DAO();
			AD_CO_8000_ADataSet ds 	= null;
            ds = dao.ad_co_8000_a(dm);
            req.setAttribute("ds", ds);
		}
		catch (AppException e) {
            throw e;
        }
	}
}
