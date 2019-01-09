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
import chosun.ciis.ad.pub.dao.AdPub1800DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1800_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1810_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1811_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1812_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1813_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1800_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1810_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1811_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1812_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1813_LDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1800WB extends BaseWB {

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
    public void ad_pub_1800_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException 
    {	
    	AD_PUB_1800_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1800_MDM dm = new AD_PUB_1800_MDM();
    	String cmpy_cd	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no   = Util.getSessionParameterValue(req, "emp_no", true);
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setEmpno(emp_no);

        try 
        {
        	AdPub1800DAO	dao = new AdPub1800DAO();
            ds = dao.ad_pub_1800_m(dm);
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
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1810_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	

    	//long start_tm = System.currentTimeMillis();
    	
    	AD_PUB_1810_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String select_dt = Util.checkString(req.getParameter("select_dt"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String misu = Util.checkString(req.getParameter("misu"));
    	String jikgulae = Util.checkString(req.getParameter("jikgulae"));
    	String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
    	String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
    	String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String cslcrg_pers = Util.checkString(req.getParameter("cslcrg_pers"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String acct_cd    = Util.getSessionParameterValue(req, "uid", true);
    	String emp_no     = Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	AD_PUB_1810_LDM dm = new AD_PUB_1810_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSelect_dt(select_dt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMisu(misu);
        dm.setJikgulae(jikgulae);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setSect_clsf_cd(sect_clsf_cd);
        dm.setSect_nm_cd(sect_nm_cd);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMchrg_pers(mchrg_pers);
        dm.setCslcrg_pers(cslcrg_pers);
        dm.setIndt_clsf(indt_clsf);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);
        dm.setPragn_yn(pragn_yn);
        dm.setPre_issu_yn(pre_issu_yn);
        
        dm.print(); 

        try {
        	AdPub1800DAO	dao = new AdPub1800DAO();
            ds = dao.ad_pub_1810_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
        	throw e;
        } 
//        
//        AdPub1800EJBHome home = (AdPub1800EJBHome) JNDIManager.getInstance().getHome("AdPub1800EJB");
//        try {
//        	AdPub1800EJB ejb = home.create();
//        	ds = ejb.ad_pub_1810_l(dm);
//            req.setAttribute("ds", ds);
//            
//            
//            //long end_tm = System.currentTimeMillis();
//            
//            //System.out.println("elapsed = " + (end_tm - start_tm));
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
    public void ad_pub_1811_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1811_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
    	String select_dt = Util.checkString(req.getParameter("select_dt"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String notaxrate_data_yn = Util.checkString(req.getParameter("notaxrate_data_yn"));
    	String sect_cd = Util.checkString(req.getParameter("sect_cd"));
    	String sect_seq = Util.checkString(req.getParameter("sect_seq"));
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
    	String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
    	String pubc_clsf2 = StringUtil.replaceString(req.getParameter("pubc_clsf2"), " ", ","); 
    	String dlco_nm2 = Util.checkString(req.getParameter("dlco_nm2"));
    	String pubc_side2 = Util.checkString(req.getParameter("pubc_side2"));
    	String fradvt_fee = Util.checkString(req.getParameter("fradvt_fee"));
    	String toadvt_fee = Util.checkString(req.getParameter("toadvt_fee"));
    	String fravt = Util.checkString(req.getParameter("fravt"));
    	String toavt = Util.checkString(req.getParameter("toavt"));
    	String frtot_rcpm_amt = Util.checkString(req.getParameter("frtot_rcpm_amt"));
    	String totot_rcpm_amt = Util.checkString(req.getParameter("totot_rcpm_amt"));
    	String frtot_misu_amt = Util.checkString(req.getParameter("frtot_misu_amt"));
    	String totot_misu_amt = Util.checkString(req.getParameter("totot_misu_amt"));
    	String frdn = Util.checkString(req.getParameter("frdn"));
    	String todn = Util.checkString(req.getParameter("todn"));
    	String frcm = Util.checkString(req.getParameter("frcm"));
    	String tocm = Util.checkString(req.getParameter("tocm"));
    	String brdg_advt_yn = Util.checkString(req.getParameter("brdg_advt_yn"));
    	String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
    	String sale_stmt_issu_yn = Util.checkString(req.getParameter("sale_stmt_issu_yn"));
    	dlco_nm2 = convert(dlco_nm2);
    	pubc_side2 = convert(pubc_side2);
    	String acct_cd = Util.getSessionParameterValue(req, "uid", true);
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String indt_clsf_1 = Util.checkString(req.getParameter("indt_clsf_1"));
    	String indt_clsf_2 = Util.checkString(req.getParameter("indt_clsf_2"));
    	String type_clsf_1 = Util.checkString(req.getParameter("type_clsf_1"));
    	String type_clsf_2 = Util.checkString(req.getParameter("type_clsf_2"));
    	String line_advt_yn = Util.checkString(req.getParameter("line_advt_yn"));
    	String nwsp_type_yn = Util.checkString(req.getParameter("nwsp_type_yn"));
    	String self_advt_yn = Util.checkString(req.getParameter("self_advt_yn"));
    	String ilbo_total = Util.checkString(req.getParameter("ilbo_total"));
    	String evnt_clsf = Util.checkString(req.getParameter("evnt_clsf"));

        // DM Setting
    	AD_PUB_1811_LDM dm = new AD_PUB_1811_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setPubc_clsf(pubc_clsf);
        dm.setSelect_dt(select_dt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setNotaxrate_data_yn(notaxrate_data_yn);
        dm.setSect_cd(sect_cd);
        dm.setSect_seq(sect_seq);
        dm.setChro_clsf(chro_clsf);
        dm.setMedi_cd(medi_cd);
        dm.setSect_clsf_cd(sect_clsf_cd);
        dm.setSect_nm_cd(sect_nm_cd);
        dm.setGrp_cmpy_cd(grp_cmpy_cd);
        dm.setAdvt_cont(advt_cont);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMchrg_pers(mchrg_pers);
        dm.setEdt_clsf(edt_clsf);
        dm.setPubc_clsf2(pubc_clsf2);
        dm.setDlco_nm2(dlco_nm2);
        dm.setPubc_side2(pubc_side2);
        dm.setFradvt_fee(fradvt_fee);
        dm.setToadvt_fee(toadvt_fee);
        dm.setFravt(fravt);
        dm.setToavt(toavt);
        dm.setFrtot_rcpm_amt(frtot_rcpm_amt);
        dm.setTotot_rcpm_amt(totot_rcpm_amt);
        dm.setFrtot_misu_amt(frtot_misu_amt);
        dm.setTotot_misu_amt(totot_misu_amt);
        dm.setFrdn(frdn);
        dm.setTodn(todn);
        dm.setFrcm(frcm);
        dm.setTocm(tocm);
        dm.setBrdg_advt_yn(brdg_advt_yn);
        dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
        dm.setSale_stmt_issu_yn(sale_stmt_issu_yn);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);
        
        dm.setIndt_clsf_1(indt_clsf_1);
        dm.setIndt_clsf_2(indt_clsf_2);
        dm.setType_clsf_1(type_clsf_1);
        dm.setType_clsf_2(type_clsf_2);
        dm.setLine_advt_yn(line_advt_yn);
        dm.setNwsp_type_yn(nwsp_type_yn);
        dm.setSelf_advt_yn(self_advt_yn);
        dm.setIlbo_total(ilbo_total);
        dm.setEvnt_clsf(evnt_clsf);
        
        dm.print();

        try {
        	AdPub1800DAO	dao = new AdPub1800DAO();
            ds = dao.ad_pub_1811_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1800EJBHome home = (AdPub1800EJBHome) JNDIManager.getInstance().getHome("AdPub1800EJB");
//        try {
//        	AdPub1800EJB ejb = home.create();
//            ds = ejb.ad_pub_1811_l(dm);
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
    public void ad_pub_1812_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1812_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1812_LDM dm = new AD_PUB_1812_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
    	String select_dt = Util.checkString(req.getParameter("select_dt"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String notaxrate_data_yn = Util.checkString(req.getParameter("notaxrate_data_yn"));
    	String sect_cd = Util.checkString(req.getParameter("sect_cd"));
    	String sect_seq = Util.checkString(req.getParameter("sect_seq"));
    	String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
    	String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
    	String pubc_clsf2 = StringUtil.replaceString(req.getParameter("pubc_clsf2"), " ", ","); 
    	String dlco_nm2 = Util.checkString(req.getParameter("dlco_nm2"));
    	String pubc_side2 = Util.checkString(req.getParameter("pubc_side2"));
    	String fradvt_fee = Util.checkString(req.getParameter("fradvt_fee"));
    	String toadvt_fee = Util.checkString(req.getParameter("toadvt_fee"));
    	String fravt = Util.checkString(req.getParameter("fravt"));
    	String toavt = Util.checkString(req.getParameter("toavt"));
    	String frtot_rcpm_amt = Util.checkString(req.getParameter("frtot_rcpm_amt"));
    	String totot_rcpm_amt = Util.checkString(req.getParameter("totot_rcpm_amt"));
    	String frtot_misu_amt = Util.checkString(req.getParameter("frtot_misu_amt"));
    	String totot_misu_amt = Util.checkString(req.getParameter("totot_misu_amt"));
    	String frdn = Util.checkString(req.getParameter("frdn"));
    	String todn = Util.checkString(req.getParameter("todn"));
    	String frcm = Util.checkString(req.getParameter("frcm"));
    	String tocm = Util.checkString(req.getParameter("tocm"));
    	String brdg_advt_yn = Util.checkString(req.getParameter("brdg_advt_yn"));
    	String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
    	String sale_stmt_issu_yn = Util.checkString(req.getParameter("sale_stmt_issu_yn"));
    	
    	String emp_no     = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String indt_clsf_1 = Util.checkString(req.getParameter("indt_clsf_1"));
    	String indt_clsf_2 = Util.checkString(req.getParameter("indt_clsf_2"));
    	String type_clsf_1 = Util.checkString(req.getParameter("type_clsf_1"));
    	String type_clsf_2 = Util.checkString(req.getParameter("type_clsf_2"));
    	String line_advt_yn = Util.checkString(req.getParameter("line_advt_yn"));
    	String nwsp_type_yn = Util.checkString(req.getParameter("nwsp_type_yn"));
    	String self_advt_yn = Util.checkString(req.getParameter("self_advt_yn"));
    	String ilbo_total = Util.checkString(req.getParameter("ilbo_total"));
    	String evnt_clsf = Util.checkString(req.getParameter("evnt_clsf"));
    	
    	dlco_nm2 = convert(dlco_nm2);
    	pubc_side2 = convert(pubc_side2);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setPubc_clsf(pubc_clsf);
        dm.setSelect_dt(select_dt);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setNotaxrate_data_yn(notaxrate_data_yn);
        dm.setSect_cd(sect_cd);
        dm.setSect_seq(sect_seq);
        dm.setChro_clsf(chro_clsf);
        dm.setMedi_cd(medi_cd);
        dm.setSect_clsf_cd(sect_clsf_cd);
        dm.setSect_nm_cd(sect_nm_cd);
        dm.setGrp_cmpy_cd(grp_cmpy_cd);
        dm.setAdvt_cont(advt_cont);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMchrg_pers(mchrg_pers);
        dm.setEdt_clsf(edt_clsf);
        dm.setPubc_clsf2(pubc_clsf2);
        dm.setDlco_nm2(dlco_nm2);
        dm.setPubc_side2(pubc_side2);
        dm.setFradvt_fee(fradvt_fee);
        dm.setToadvt_fee(toadvt_fee);
        dm.setFravt(fravt);
        dm.setToavt(toavt);
        dm.setFrtot_rcpm_amt(frtot_rcpm_amt);
        dm.setTotot_rcpm_amt(totot_rcpm_amt);
        dm.setFrtot_misu_amt(frtot_misu_amt);
        dm.setTotot_misu_amt(totot_misu_amt);
        dm.setFrdn(frdn);
        dm.setTodn(todn);
        dm.setFrcm(frcm);
        dm.setTocm(tocm);
        dm.setBrdg_advt_yn(brdg_advt_yn);
        dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
        dm.setSale_stmt_issu_yn(sale_stmt_issu_yn);
        dm.setEmp_no(emp_no);
        
        dm.setIndt_clsf_1(indt_clsf_1);
        dm.setIndt_clsf_2(indt_clsf_2);
        dm.setType_clsf_1(type_clsf_1);
        dm.setType_clsf_2(type_clsf_2);
        dm.setLine_advt_yn(line_advt_yn);
        dm.setNwsp_type_yn(nwsp_type_yn);
        dm.setSelf_advt_yn(self_advt_yn);
        dm.setIlbo_total(ilbo_total);
        dm.setEvnt_clsf(evnt_clsf);
                
        //dm.print();

        try {
        	AdPub1800DAO	dao = new AdPub1800DAO();
            ds = dao.ad_pub_1812_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1800EJBHome home = (AdPub1800EJBHome) JNDIManager.getInstance().getHome("AdPub1800EJB");
//        try {
//        	AdPub1800EJB ejb = home.create();
//            ds = ejb.ad_pub_1812_l(dm);
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
    
    public void ad_pub_1813_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1813_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String div_yn = Util.checkString(req.getParameter("div_yn"));
    	String acct_cd = Util.getSessionParameterValue(req, "uid", true);
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	AD_PUB_1813_LDM dm = new AD_PUB_1813_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedi_cd(medi_cd);
        dm.setDiv_yn(div_yn);
        dm.setAcct_cd(acct_cd);
        dm.setEmp_no(emp_no);

        dm.print();

        try {
        	AdPub1800DAO	dao = new AdPub1800DAO();
            ds = dao.ad_pub_1813_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
}
