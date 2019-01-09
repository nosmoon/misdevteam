/***************************************************************************************************
* 파일명   : AdCom1500WB.java
* 기능     : Servlet에서 받은 parameter를 이용하여 dm을 set하고
*            EJB 호출하여 얻은 결과값을 request값으로 으로 반환한다.
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/

package chosun.ciis.ad.com.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.com.dao.AdCom1500DAO;
import chosun.ciis.ad.com.dm.AD_COM_1510_LDM;
import chosun.ciis.ad.com.dm.AD_COM_1520_SDM;
import chosun.ciis.ad.com.dm.AD_COM_1530_ADM;
import chosun.ciis.ad.com.ds.AD_COM_1510_LDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1520_SDataSet;
import chosun.ciis.ad.com.ds.AD_COM_1530_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * 공문
 */

public class AdCom1500WB extends BaseWB {

    /**
     * 
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_com_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_COM_1510_LDataSet ds = null;

        //사용자 세션정보 
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
    	String rcv_plac = Util.checkString(req.getParameter("rcv_plac"));
        
        // DM Setting
    	AD_COM_1510_LDM dm = new AD_COM_1510_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setRcv_plac(rcv_plac);       
        
//    	//dm.print();

        try {
        	AdCom1500DAO dao = new AdCom1500DAO();
            ds = dao.ad_com_1510_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdCom1500EJBHome home = (AdCom1500EJBHome) JNDIManager.getInstance().getHome("AdCom1500EJB");
//        
//        try {
//       	    AdCom1500EJB ejb = home.create();
//            ds = ejb.ad_com_1510_l(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    

    /**
     * 
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_com_1520_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_COM_1520_SDataSet ds = null;

        //사용자 세션정보 
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String yyyy = Util.checkString(req.getParameter("yyyy"));
    	String seq = Util.checkString(req.getParameter("seq"));
        
        // DM Setting
    	AD_COM_1520_SDM dm = new AD_COM_1520_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setYyyy(yyyy);
    	dm.setSeq(seq);  
        
//    	//dm.print();

        try {
        	AdCom1500DAO dao = new AdCom1500DAO();
            ds = dao.ad_com_1520_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdCom1500EJBHome home = (AdCom1500EJBHome) JNDIManager.getInstance().getHome("AdCom1500EJB");
//        
//        try {
//       	    AdCom1500EJB ejb = home.create();
//            ds = ejb.ad_com_1520_s(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 
     * 조회된 request값을 set한다.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_com_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_COM_1530_ADataSet ds = null;

        //사용자 세션정보 
    	String cmpy_cd  		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String flag = Util.checkString(req.getParameter("flag"));
    	String yyyy = Util.checkString(req.getParameter("yyyy"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String rcv_plac = Util.checkString(req.getParameter("rcv_plac"));
    	String zip1 = Util.checkString(req.getParameter("zip1"));
    	String zip2 = Util.checkString(req.getParameter("zip2"));
    	String addr = Util.checkString(req.getParameter("addr"));
    	String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
    	String tel_no = Util.checkString(req.getParameter("tel_no"));
    	String fax_no = Util.checkString(req.getParameter("fax_no"));
    	String send_plac = Util.checkString(req.getParameter("send_plac"));
    	String titl = Util.checkString(req.getParameter("titl"));
    	String cont = Util.checkString(req.getParameter("cont"));
    	
        // DM Setting
    	AD_COM_1530_ADM dm = new AD_COM_1530_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setYyyy(yyyy);
    	dm.setSeq(seq);
    	dm.setRcv_plac(rcv_plac);
    	dm.setZip1(zip1);
    	dm.setZip2(zip2);
    	dm.setAddr(addr);
    	dm.setDtls_addr(dtls_addr);
    	dm.setTel_no(tel_no);
    	dm.setFax_no(fax_no);
    	dm.setSend_plac(send_plac);
    	dm.setTitl(titl);
    	dm.setCont(cont);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);      

        try {
        	AdCom1500DAO dao = new AdCom1500DAO();
            ds = dao.ad_com_1530_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdCom1500EJBHome home = (AdCom1500EJBHome) JNDIManager.getInstance().getHome("AdCom1500EJB");
//        
//        try {
//       	    AdCom1500EJB ejb = home.create();
//            ds = ejb.ad_com_1530_a(dm);	// 설정된 dm값으로 EJB를 호출한다.
//            req.setAttribute("ds", ds);	// request에 결과값을 담는다.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
}
