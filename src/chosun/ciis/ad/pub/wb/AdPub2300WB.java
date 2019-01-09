/***************************************************************************************************
* 파일명 : AdPub2300WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1600DAO;
import chosun.ciis.ad.pub.dao.AdPub2300DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1650_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_2300_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2310_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2311_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2313_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1650_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2300_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2310_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2311_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2313_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2300WB extends BaseWB {

	
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
    public void ad_pub_2300_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2300_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2300_MDM dm = new AD_PUB_2300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no     = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setEmp_no(emp_no);
        
        try {
        	AdPub2300DAO	dao = new AdPub2300DAO();
            ds = dao.ad_pub_2300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2300EJBHome home = (AdPub2300EJBHome) JNDIManager.getInstance().getHome("AdPub2300EJB");
//        try {
//        	AdPub2300EJB ejb = home.create();
//            ds = ejb.ad_pub_2300_m(dm);
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
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2310_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2310_LDM dm = new AD_PUB_2310_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no    = Util.getSessionParameterValue(req, "emp_no", true);
    	String dept_cd    = Util.getSessionParameterValue(req, "deptcd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String select_dt = Util.checkString(req.getParameter("select_dt"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
    	String std_clsf = Util.checkString(req.getParameter("std_clsf"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSelect_dt(select_dt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setPre_issu_yn(pre_issu_yn);
        dm.setEmp_no(emp_no);
        dm.setDept_cd(dept_cd);
        dm.setStd_clsf(std_clsf);
        
        //dm.print();

        try {
        	AdPub2300DAO	dao = new AdPub2300DAO();
            ds = dao.ad_pub_2310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2300EJBHome home = (AdPub2300EJBHome) JNDIManager.getInstance().getHome("AdPub2300EJB");
//        try {
//        	AdPub2300EJB ejb = home.create();
//            ds = ejb.ad_pub_2310_l(dm);
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
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2311_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2311_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String select_dt = Util.checkString(req.getParameter("select_dt"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String notaxrate_data_yn = Util.checkString(req.getParameter("notaxrate_data_yn"));
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String indt_clsf2 = Util.checkString(req.getParameter("indt_clsf2"));
    	String std_clsf = Util.checkString(req.getParameter("std_clsf"));
    	String nwsp_type_clsf = Util.checkString(req.getParameter("nwsp_type_clsf"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String sale_stmt_issu_yn = Util.checkString(req.getParameter("sale_stmt_issu_yn"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String fradvt_fee = Util.checkString(req.getParameter("fradvt_fee"));
    	String toadvt_fee = Util.checkString(req.getParameter("toadvt_fee"));
    	String frvat = Util.checkString(req.getParameter("frvat"));
    	String tovat = Util.checkString(req.getParameter("tovat"));
    	String frtot_rcpm_amt = Util.checkString(req.getParameter("frtot_rcpm_amt"));
    	String totot_rcpm_amt = Util.checkString(req.getParameter("totot_rcpm_amt"));
    	String frtot_misu_amt = Util.checkString(req.getParameter("frtot_misu_amt"));
    	String totot_misu_amt = Util.checkString(req.getParameter("totot_misu_amt"));
    	String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
    	dlco_nm = convert(dlco_nm);

        // DM Setting
    	AD_PUB_2311_LDM dm = new AD_PUB_2311_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSelect_dt(select_dt);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setNotaxrate_data_yn(notaxrate_data_yn);
    	dm.setChro_clsf(chro_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setIndt_clsf(indt_clsf);
    	dm.setIndt_clsf2(indt_clsf2);
    	dm.setStd_clsf(std_clsf);
    	dm.setNwsp_type_clsf(nwsp_type_clsf);
    	dm.setAdvt_cont(advt_cont);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	dm.setSale_stmt_issu_yn(sale_stmt_issu_yn);
    	dm.setDlco_nm(dlco_nm);
    	dm.setFradvt_fee(fradvt_fee);
    	dm.setToadvt_fee(toadvt_fee);
    	dm.setFrvat(frvat);
    	dm.setTovat(tovat);
    	dm.setFrtot_rcpm_amt(frtot_rcpm_amt);
    	dm.setTotot_rcpm_amt(totot_rcpm_amt);
    	dm.setFrtot_misu_amt(frtot_misu_amt);
    	dm.setTotot_misu_amt(totot_misu_amt);
    	dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
        
        //dm.print();

        try {
        	AdPub2300DAO	dao = new AdPub2300DAO();
            ds = dao.ad_pub_2311_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
        
//        AdPub2300EJBHome home = (AdPub2300EJBHome) JNDIManager.getInstance().getHome("AdPub2300EJB");
//        try {
//        	AdPub2300EJB ejb = home.create();
//            ds = ejb.ad_pub_2311_l(dm);
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
    public void ad_pub_2313_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2313_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr(); 
    	String pubc_dt    = Util.checkString(req.getParameter("pubc_dt"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      	

		String medi_cd     = Util.checkString((String)hash.get("medi_cd"));
		String hndl_clsf   = Util.checkString((String)hash.get("hndl_clsf"));
		String dlco_no     = Util.checkString((String)hash.get("dlco_no"));
		String advt_cont   = Util.checkString((String)hash.get("advt_cont"));
		String page        = Util.checkString((String)hash.get("page"));
		String issu_ser_no = Util.checkString((String)hash.get("issu_ser_no"));
		String publ_std    = Util.checkString((String)hash.get("publ_std"));
		String advt_fee    = Util.checkString((String)hash.get("advt_fee"));
		String vat         = Util.checkString((String)hash.get("vat"));
		String agn         = Util.checkString((String)hash.get("agn"));
		String fee_rate    = Util.checkString((String)hash.get("fee_rate"));
		String fee         = Util.checkString((String)hash.get("fee"));
		String fee_vat     = Util.checkString((String)hash.get("fee_vat"));
		String advt_clsf   = Util.checkString((String)hash.get("advt_clsf"));
		String tax_clsf    = Util.checkString((String)hash.get("tax_clsf"));
		String pre_issu_yn = Util.checkString((String)hash.get("pre_issu_yn"));
		String remk        = Util.checkString((String)hash.get("remk"));
		String slcrg_pers  = Util.checkString((String)hash.get("slcrg_pers"));
		String mchrg_pers  = Util.checkString((String)hash.get("mchrg_pers"));
    	

    	
        // DM Setting
    	AD_PUB_2313_ADM dm = new AD_PUB_2313_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setIssu_ser_no(issu_ser_no);
    	dm.setPubl_std(publ_std);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setAgn(agn);
    	dm.setFee_rate(fee_rate);
    	dm.setFee(fee);
    	dm.setFee_vat(fee_vat);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setRemk(remk);
    	dm.setIncmg_pers_ip(req.getRemoteAddr());
    	dm.setIncmg_pers(incmg_pers);
    	dm.setTax_clsf(tax_clsf);
    	dm.setAdvt_clsf(advt_clsf);
    	dm.setPage(page);
    	dm.setPre_issu_yn(pre_issu_yn);
    	
        dm.print(); 
 
        try {
        	AdPub2300DAO	dao = new AdPub2300DAO();
            ds = dao.ad_pub_2313_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
}
