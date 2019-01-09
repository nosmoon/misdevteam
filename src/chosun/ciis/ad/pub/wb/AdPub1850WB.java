/***************************************************************************************************
* 파일명 : AdPub1800WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1850DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1850_MDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1850_MDataSet;
import chosun.ciis.ad.pub.dm.AD_PUB_1851_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1851_LDataSet;
import chosun.ciis.ad.pub.dm.AD_PUB_1853_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1853_LDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1850WB extends BaseWB {

	public String convert(String str){
		
		StringBuffer sb = new StringBuffer();
		
		if("".equals(StringUtil.nvl(str)))	return "";
		
		String[] temp = StringUtil.toArray(str, ",");
		
		for(int i=0; i<temp.length; i++){
			
			sb.append("'").append(temp[i]).append("'");
			if(i<temp.length - 1){
				sb.append(",");
			}
		}
		
		return sb.toString();
	}
	
	
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1850_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_PUB_1850_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1850_MDM dm = new AD_PUB_1850_MDM();
    	String cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no   = Util.getSessionParameterValue(req, "emp_no", true);
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setEmp_no(emp_no);

        try 
        {
        	AdPub1850DAO	dao = new AdPub1850DAO();
            ds = dao.ad_pub_1850_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        } 
//        
//        AdPub1800EJBHome home = (AdPub1800EJBHome) JNDIManager.getInstance().getHome("AdPub1800EJB");
//        try {
//        	AdPub1800EJB ejb = home.create();
//            ds = ejb.ad_pub_1800_m(dm);
//            req.setAttribute("ds", ds);
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
    public void ad_pub_1851_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_PUB_1851_LDataSet ds = null;
        // DM Setting
    	AD_PUB_1851_LDM dm = new AD_PUB_1851_LDM();
    	String cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd   = Util.checkString(req.getParameter("medi_cd"));
    	String select_dt 	= Util.checkString(req.getParameter("select_dt"));
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
    	String misu 	= Util.checkString(req.getParameter("misu"));
    	String jikgulae 	= Util.checkString(req.getParameter("jikgulae"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 	= Util.checkString(req.getParameter("mchrg_pers"));
    	String indt_clsf 	= Util.checkString(req.getParameter("indt_clsf"));
    	String acct_cd 	= Util.checkString(req.getParameter("acct_cd"));
    	String emp_no 	= Util.getSessionParameterValue(req, "emp_no", true);
    	String pubc_clsf 	= Util.checkString(req.getParameter("pubc_clsf"));
    	String rslt_dept 	= Util.checkString(req.getParameter("rslt_dept"));
    	String medialeb_yn 	= Util.checkString(req.getParameter("medialeb_yn"));
    	String chcode 	= Util.checkString(req.getParameter("chcode"));
   
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSelect_dt(select_dt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMisu(misu);
        dm.setJikgulae(jikgulae);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMchrg_pers(mchrg_pers);
        dm.setIndt_clsf(indt_clsf);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);
        dm.setPubc_clsf(pubc_clsf);
        dm.setRslt_dept(rslt_dept);
        dm.setMedialeb_yn(medialeb_yn); 
        dm.setChcode(chcode);

        try 
        {
        	AdPub1850DAO	dao = new AdPub1850DAO();
            ds = dao.ad_pub_1851_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        } 
    }   
    public void ad_pub_1853_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_PUB_1853_LDataSet ds = null;
    	// DM Setting
    	AD_PUB_1853_LDM dm = new AD_PUB_1853_LDM();
    	String cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd   = Util.checkString(req.getParameter("medi_cd"));
    	String select_dt 	= Util.checkString(req.getParameter("select_dt"));
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
    	String misu 	= Util.checkString(req.getParameter("misu"));
    	String jikgulae 	= Util.checkString(req.getParameter("jikgulae"));
    	String sale_clsf 	= Util.checkString(req.getParameter("sale_clsf"));
    	String rslt_dept 	= Util.checkString(req.getParameter("rslt_dept"));
    	String medialeb_yn 	= Util.checkString(req.getParameter("medialeb_yn"));
    	String acct_cd 	= Util.getSessionParameterValue(req, "uid", true);
    	String emp_no 	= Util.getSessionParameterValue(req, "emp_no", true);
    	String chcode 	= Util.checkString(req.getParameter("chcode"));
   
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSelect_dt(select_dt);
        dm.setFr_dt(frdt);
        dm.setTo_dt(todt);
        dm.setMisu(misu);
        dm.setJikgulae(jikgulae);
        dm.setSale_clsf(sale_clsf);
        dm.setRslt_dept(rslt_dept);
        dm.setMedialeb_yn(medialeb_yn);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);
        dm.setChcode(chcode);
        dm.print();
        try 
        {
        	AdPub1850DAO	dao = new AdPub1850DAO();
            ds = dao.ad_pub_1853_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        } 
    }     

}
