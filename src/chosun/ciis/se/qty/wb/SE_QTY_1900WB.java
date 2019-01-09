/***************************************************************************************************
* 파일명 : SE_QTY_1900WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
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
import chosun.ciis.se.qty.dao.SE_QTY_1900DAO;
import chosun.ciis.se.qty.dm.SE_QTY_1900_MDM;
import chosun.ciis.se.qty.dm.SE_QTY_1910_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_1920_ADM;
import chosun.ciis.se.qty.dm.SE_QTY_1930_LDM;
import chosun.ciis.se.qty.dm.SE_QTY_1950_LDM;
import chosun.ciis.se.qty.ds.SE_QTY_1900_MDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1910_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1920_ADataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1930_LDataSet;
import chosun.ciis.se.qty.ds.SE_QTY_1950_LDataSet;
/**
 * 
 */

public class SE_QTY_1900WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_qty_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_QTY_1900_MDataSet ds = null;

        // DM Setting
        SE_QTY_1900_MDM dm = new SE_QTY_1900_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_QTY_1900DAO dao = new SE_QTY_1900DAO();
            ds = dao.se_qty_1900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_QTY_1900EJBHome home = (SE_QTY_1900EJBHome) JNDIManager.getInstance().getHome("SE_QTY_1900EJB");
//        
//        try {
//        	SE_QTY_1900EJB ejb = home.create();
//            ds = ejb.se_qty_1900_m(dm);
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
     * 일반탭 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_1910_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_1910_LDataSet ds = null;
		SE_QTY_1910_LDM dm = new SE_QTY_1910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

        try {
        	SE_QTY_1900DAO dao = new SE_QTY_1900DAO();
            ds = dao.se_qty_1910_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_QTY_1900EJBHome home = (SE_QTY_1900EJBHome)JNDIManager.getInstance().getHome("SE_QTY_1900EJB");
//			SE_QTY_1900EJB ejb = home.create();
//
//			ds = ejb.se_qty_1910_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    
    /**
     * 증감 저장
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_1920_a(HttpServletRequest req, HttpServletResponse res) throws AppException {

		SE_QTY_1920_ADataSet ds = null;
		SE_QTY_1920_ADM dm = new SE_QTY_1920_ADM();

		int rownum = Integer.parseInt(Util.checkString(req.getParameter("colcnt")));

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpDate);
    	
    	String mode_ar = (String)hash.get("m"); 
		String bo_cd_ar = (String)hash.get("bo_cd"); 
		String send_plac_seq_ar = (String)hash.get("send_plac_seq"); 
		String add_snd_bo_cdseq = (String)hash.get("add_snd_bo_cdseq"); 

		String[] tmpTok = mode_ar.split("#");
		int iRnum = tmpTok.length;
		if(add_snd_bo_cdseq==null){
			add_snd_bo_cdseq = "";
			for(int j=1; j<iRnum; j++){
				add_snd_bo_cdseq = add_snd_bo_cdseq + "#";				
			}
		}
		
    	String colnm1 = "";
    	String colnm2 = "";
    	String colnm3 = "";
    	String colnm5 = "";
    	String medi_cd_tmp = "";
    	String regchk_yn_tmp = "";
    	String icdc_qty_tmp = "";
    	String issu_qty_tmp = "";

    	String[] medi_cd = new String[iRnum];
    	String[] regchk_yn = new String[iRnum];
    	String[] icdc_qty = new String[iRnum];
    	String[] issu_qty = new String[iRnum];
    	
    	//가변그리드의 판매망 구분별 데이타를 하나로 재정렬
    	for(int i=1; i<=rownum; i++){
    		
    		colnm1 = "col"+i+"_1";
    		colnm2 = "col"+i+"_2";
    		colnm3 = "col"+i+"_3";
    		colnm5 = "col"+i+"_5";
    		 	
    		medi_cd_tmp = (String)hash.get(colnm1); 
    		regchk_yn_tmp = (String)hash.get(colnm2); 
    		icdc_qty_tmp = (String)hash.get(colnm3); 
    		issu_qty_tmp = (String)hash.get(colnm5); 
    		System.out.println("medi_cd_tmp::::::::::::::"+medi_cd_tmp);
    		System.out.println("regchk_yn_tmp::::::::::::::"+regchk_yn_tmp);
    		System.out.println("icdc_qty_tmp::::::::::::::"+icdc_qty_tmp);
    		System.out.println("issu::::::::::::::"+issu_qty_tmp);
    		String[] tmpTok1 = medi_cd_tmp.split("#");
    		String[] tmpTok2 = regchk_yn_tmp.split("#");
    		String[] tmpTok3 = icdc_qty_tmp.split("#");   		
    		String[] tmpTok5 = issu_qty_tmp.split("#"); 

    		//가변갯수만큼 ':'로 구분자 넣어 만듬
    		for(int j=0; j<iRnum; j++){
    			if(i==1){
    				medi_cd[j] = "";
    				regchk_yn[j] = "";
    				icdc_qty[j] = "";
    				issu_qty[j] = "";
    			}

    			if(tmpTok1.length>j) medi_cd[j] = medi_cd[j] + ":" + tmpTok1[j];
    			else medi_cd[j] = medi_cd[j] + ":";
    			
    			if(tmpTok2.length>j) regchk_yn[j] = regchk_yn[j] + ":" + tmpTok2[j];
    			else regchk_yn[j] = regchk_yn[j] + ":";

    			if(tmpTok3.length>j) icdc_qty[j] = icdc_qty[j] + ":" + tmpTok3[j];
    			else icdc_qty[j] = icdc_qty[j] + ":";

    			if(tmpTok5.length>j) issu_qty[j] = issu_qty[j] + ":" + tmpTok5[j];
    			else issu_qty[j] = issu_qty[j] + ":";

    			if(i==1){
    				medi_cd[j] = medi_cd[j].substring(1);
    				regchk_yn[j] = regchk_yn[j].substring(1);
    				icdc_qty[j] = icdc_qty[j].substring(1);
    				issu_qty[j] = issu_qty[j].substring(1);
    			}   			
    		}
		}

    	String medi_cd_ar = "";
    	String regchk_yn_ar = "";
    	String icdc_qty_ar = "";
    	String issu_qty_ar = "";
	
		for(int i=0; i<iRnum; i++){
			medi_cd_ar = medi_cd_ar +"#"+ medi_cd[i];
			regchk_yn_ar = regchk_yn_ar +"#"+ regchk_yn[i];
			icdc_qty_ar = icdc_qty_ar +"#"+ icdc_qty[i];
			issu_qty_ar = issu_qty_ar +"#"+ issu_qty[i];
		}
			
		medi_cd_ar = medi_cd_ar.substring(1);
		regchk_yn_ar = regchk_yn_ar.substring(1);
		icdc_qty_ar = icdc_qty_ar.substring(1);
		issu_qty_ar = issu_qty_ar.substring(1);

		dm.mode = mode_ar.toUpperCase();
		dm.bo_cd = bo_cd_ar;
		dm.send_plac_seq = send_plac_seq_ar;
		dm.add_snd_bo_cdseq = add_snd_bo_cdseq;
		dm.medi_cd = medi_cd_ar;
		dm.regchk_yn = regchk_yn_ar;
		dm.icdc_qty = icdc_qty_ar;
		dm.issu_qty = issu_qty_ar;
		dm.print();

        try {
        	SE_QTY_1900DAO dao = new SE_QTY_1900DAO();
            ds = dao.se_qty_1920_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_QTY_1900EJBHome home = (SE_QTY_1900EJBHome)JNDIManager.getInstance().getHome("SE_QTY_1900EJB");
//			SE_QTY_1900EJB ejb = home.create();
//
//			ds = ejb.se_qty_1920_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    /**
     * 스포츠탭 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_qty_1930_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_1930_LDataSet ds = null;
		SE_QTY_1930_LDM dm = new SE_QTY_1930_LDM();

		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		dm.print();
        try {
        	SE_QTY_1900DAO dao = new SE_QTY_1900DAO();
            ds = dao.se_qty_1930_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_QTY_1900EJBHome home = (SE_QTY_1900EJBHome)JNDIManager.getInstance().getHome("SE_QTY_1900EJB");
//			SE_QTY_1900EJB ejb = home.create();
//
//			ds = ejb.se_qty_1930_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
	public void se_qty_1950_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_QTY_1950_LDataSet ds = null;
		SE_QTY_1950_LDM dm = new SE_QTY_1950_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
		
		dm.print();

        try {
        	SE_QTY_1900DAO dao = new SE_QTY_1900DAO();
            ds = dao.se_qty_1950_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	}

}
