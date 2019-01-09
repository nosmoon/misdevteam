/***************************************************************************************************
 * 파일명 : SE_QTY_1000WB.java
 * 기능 : 일계표이월
 * 작성일자 : 2009-02-16
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.qty.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.qty.dao.SE_QTY_1000DAO;
import chosun.ciis.se.qty.dm.SE_QTY_1000_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_1010_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_1020_ADM;
import chosun.ciis.se.qty.ds.SE_QTY_1000_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1010_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1020_ADataSet;
/**
 * 
 */

public class SE_QTY_1000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1000_MDataSet ds = null;

        // DM Setting
        SE_QTY_1000_MDM dm = new SE_QTY_1000_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.setCmpy_cd(cmpy_cd);

        try {
        	SE_QTY_1000DAO dao = new SE_QTY_1000DAO();
            ds = dao.se_qty_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1000EJBHome home = (SE_QTY_1000EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1000EJB");
//        
//        try {
//        	SE_QTY_1000EJB ejb = home.create();
//            ds = ejb.se_qty_1000_m(dm);
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
     * 이월내역 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1010_LDataSet ds = null;

        // DM Setting
        SE_QTY_1010_LDM dm = new SE_QTY_1010_LDM();

		String callgb = Util.checkString(req.getParameter("callgb"));
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
		String to_yymm = Util.checkString(req.getParameter("to_yymm"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        if(fr_yymm.length()==8) fr_yymm = fr_yymm.substring(0,6);
        if(to_yymm.length()==8) to_yymm = to_yymm.substring(0,6);
        
		dm.setCallgb(callgb);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFr_yymm(fr_yymm);
		dm.setTo_yymm(to_yymm);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_QTY_1000DAO dao = new SE_QTY_1000DAO();
            ds = dao.se_qty_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_QTY_1000EJBHome home = (SE_QTY_1000EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1000EJB");
//        try {
//        	SE_QTY_1000EJB ejb = home.create();
//            ds = ejb.se_qty_1010_l(dm);
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
     * 부수이월처리
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1020_ADataSet ds = null;
        // DM Setting
        SE_QTY_1020_ADM dm = new SE_QTY_1020_ADM();

		int rownum = Integer.parseInt(Util.checkString(req.getParameter("rownum")));

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String yymm_ar = (String)hash.get("yymm"); 
		String medi_cd_ar = (String)hash.get("medi_cd"); 
		String tms_ar = (String)hash.get("tms"); 
		String cyov_dt_ar = (String)hash.get("cyov_dt"); 
		String send_basi_dt_ar = (String)hash.get("send_basi_dt"); 
		String val_meda_yn_ar = (String)hash.get("val_meda_yn"); 

		String[] tmpTok = mode_ar.split("#");
		int iRnum = tmpTok.length;

    	String colnm1 = "";
    	String colnm2 = "";
    	String colnm3 = "";
    	String qty_sell_net_clsf_tmp = "";
    	String val_aply_basi_clsf_tmp = "";
    	String val_rate_tmp = "";

    	String[] qty_sell_net_clsf = new String[iRnum];
    	String[] val_aply_basi_clsf = new String[iRnum];
    	String[] val_rate = new String[iRnum];
			
    	//가변그리드의 판매망 구분별 데이타를 하나로 재정렬
    	for(int i=1; i<=rownum; i++){
    		colnm1 = "col"+i+"_1";
    		colnm2 = "col"+i+"_2";
    		colnm3 = "col"+i+"_3";
    		
    		qty_sell_net_clsf_tmp = (String)hash.get(colnm1); 
    		val_aply_basi_clsf_tmp = (String)hash.get(colnm2); 
    		val_rate_tmp = (String)hash.get(colnm3); 

    		String[] tmpTok1 = qty_sell_net_clsf_tmp.split("#");
    		String[] tmpTok2 = val_aply_basi_clsf_tmp.split("#");
    		String[] tmpTok3 = val_rate_tmp.split("#");   		

    		//가변갯수만큼 ':'로 구분자 넣어 만듬
    		for(int j=0; j<iRnum; j++){
    			if(i==1){
    				qty_sell_net_clsf[j] = "";
    				val_aply_basi_clsf[j] = "";
    				val_rate[j] = "";
    			}
    			
    			if(tmpTok1.length>j) qty_sell_net_clsf[j] = qty_sell_net_clsf[j] + ":" + tmpTok1[j];
    			else qty_sell_net_clsf[j] = qty_sell_net_clsf[j] + ":";
    			
    			if(tmpTok2.length>j) val_aply_basi_clsf[j] = val_aply_basi_clsf[j] + ":" + tmpTok2[j];
    			else val_aply_basi_clsf[j] = val_aply_basi_clsf[j] + ":";

    			if(tmpTok3.length>j) val_rate[j] = val_rate[j] + ":" + tmpTok3[j];
    			else val_rate[j] = val_rate[j] + ":";

    			if(i==1){
    				qty_sell_net_clsf[j] = qty_sell_net_clsf[j].substring(1);
    				val_aply_basi_clsf[j] = val_aply_basi_clsf[j].substring(1);
    				val_rate[j] = val_rate[j].substring(1);
    			}
    		}
		}

    	String qty_sell_net_clsf_ar = "";
    	String val_aply_basi_clsf_ar = "";
    	String val_rate_ar = "";
    	
		for(int i=0; i<iRnum; i++){
			qty_sell_net_clsf_ar = qty_sell_net_clsf_ar +"#"+ qty_sell_net_clsf[i];
			val_aply_basi_clsf_ar = val_aply_basi_clsf_ar +"#"+ val_aply_basi_clsf[i];
			val_rate_ar = val_rate_ar +"#"+ val_rate[i];
		}

		qty_sell_net_clsf_ar = qty_sell_net_clsf_ar.substring(1);
		val_aply_basi_clsf_ar = val_aply_basi_clsf_ar.substring(1);
		val_rate_ar = val_rate_ar.substring(1);

		dm.setMode(mode_ar.toUpperCase());
		dm.setYymm(yymm_ar);
		dm.setMedi_cd(medi_cd_ar);
		dm.setTms(tms_ar);
		dm.setCyov_dt(cyov_dt_ar);
		dm.setSend_basi_dt(send_basi_dt_ar);
		dm.setVal_meda_yn(val_meda_yn_ar);
		dm.setQty_sell_net_clsf(qty_sell_net_clsf_ar);
		dm.setVal_aply_basi_clsf(val_aply_basi_clsf_ar);
		dm.setVal_rate(val_rate_ar);

        try {
        	SE_QTY_1000DAO dao = new SE_QTY_1000DAO();
            ds = dao.se_qty_1020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

dm.print();

//        SE_QTY_1000EJBHome home = (SE_QTY_1000EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1000EJB");
//        try {
//        	SE_QTY_1000EJB ejb = home.create();
//            ds = ejb.se_qty_1020_a(dm);
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

    
}
