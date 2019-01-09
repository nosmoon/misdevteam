/***************************************************************************************************
* 파일명 : SE_RCP_5200WB.java
* 기능 : 판매- 입금관리 - 마감관리 - 전표생성
* 작성일자 : 2009-05-18
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.wb;

import java.util.Calendar;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.rcp.dao.SE_RCP_5200DAO;
import chosun.ciis.se.rcp.dm.SE_RCP_5200_MDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5210_LDM;
import chosun.ciis.se.rcp.dm.SE_RCP_5220_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_5230_ADM;
import chosun.ciis.se.rcp.dm.SE_RCP_5240_ADM;
import chosun.ciis.se.rcp.ds.SE_RCP_5200_MDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5210_LDataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5220_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5230_ADataSet;
import chosun.ciis.se.rcp.ds.SE_RCP_5240_ADataSet;
/**
 * 
 */

public class SE_RCP_5200WB extends BaseWB{

    /**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_5200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5200_MDataSet ds = null;

        // DM Setting
        SE_RCP_5200_MDM dm 		= new SE_RCP_5200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.feat_clsf = Util.checkString(req.getParameter("feat_clsf"));
        try {
        	SE_RCP_5200DAO dao = new SE_RCP_5200DAO();
            ds = dao.se_rcp_5200_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_RCP_5100EJBHome home = (SE_RCP_5100EJBHome) JNDIManager.getInstance().getHome("SE_RCP_5100EJB");
//        
//        try {
//        	SE_RCP_5100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_rcp_5100_m(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
   public void se_rcp_5210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_RCP_5210_LDataSet ds = null; 

        // DM Setting
        SE_RCP_5210_LDM dm 		= new SE_RCP_5210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.team = Util.checkString(req.getParameter("team"));
		dm.part = Util.checkString(req.getParameter("part"));
		dm.area = Util.checkString(req.getParameter("area"));
		dm.schlevel = Util.checkString(req.getParameter("schlevel"));
		
		dm.print();
             
        try {
        	SE_RCP_5200DAO dao = new SE_RCP_5200DAO();
            ds = dao.se_rcp_5210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }   
   public void se_rcp_5220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
   	
       SE_RCP_5220_ADataSet ds = null;

       // DM Setting
       SE_RCP_5220_ADM dm 		= new SE_RCP_5220_ADM();

       String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
       String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
       String incmg_pers_ip     = Util.checkString(req.getRemoteAddr());
       dm.yymm = Util.checkString(req.getParameter("yymm"));
		
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		//String yymm = Util.checkString((String)hash.get("yymm"));
		String dept_cd  = Util.checkString((String)hash.get("dept_cd"));
		String sub_dept_cd = Util.checkString((String)hash.get("sub_dept_cd"));
		String area_cd = Util.checkString((String)hash.get("area_cd"));
		String bo_cd = Util.checkString((String)hash.get("bo_cd"));
		String bo_seq = Util.checkString((String)hash.get("bo_seq"));
		String pdlv_rdr_qty = Util.checkString((String)hash.get("pdlv_rdr_qty"));
		String qty = Util.checkString((String)hash.get("qty"));
		String pdlv_fee = Util.checkString((String)hash.get("pdlv_fee"));
		
		dm.setCmpy_cd(cmpy_cd);
		//dm.setYymm(yymm);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setArea_cd(area_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);	
		dm.setPdlv_rdr_qty(pdlv_rdr_qty);
		dm.setQty(qty);
		dm.setPdlv_fee(pdlv_fee);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		
		dm.print();
            
       try {
       	SE_RCP_5200DAO dao = new SE_RCP_5200DAO();
           ds = dao.se_rcp_5220_a(dm);
           req.setAttribute("ds", ds);
       }
       catch (AppException e) {
           LogManager.getInstance().log(e);
           throw e;
       }

   }  
   public void se_rcp_5230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
	   	
       SE_RCP_5230_ADataSet ds = null;

       // DM Setting
       SE_RCP_5230_ADM dm 		= new SE_RCP_5230_ADM();

       String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
       String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
       String incmg_pers_ip     = Util.checkString(req.getRemoteAddr());
       String issu_dt 			= Util.checkString(req.getParameter("issu_dt"));
       String clos_yn 			= Util.checkString(req.getParameter("clos_yn"));
       String areagb 			= Util.checkString(req.getParameter("areagb"));
       String area_cd 			= Util.checkString(req.getParameter("area_cd"));
       String selldeptcd 			= Util.checkString(req.getParameter("selldeptcd"));
       String dept_cd 			= Util.checkString(req.getParameter("dept_cd"));
       String sub_dept_cd 			= Util.checkString(req.getParameter("sub_dept_cd"));
       
				
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);
		dm.setClos_yn(clos_yn);
		dm.setAreagb(areagb);
		dm.setArea_cd(area_cd);
		dm.setSelldeptcd(selldeptcd);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		
		dm.print();
		
       try {
       	SE_RCP_5200DAO dao = new SE_RCP_5200DAO();
           ds = dao.se_rcp_5230_a(dm);
           req.setAttribute("ds", ds);
       }
       catch (AppException e) {
           LogManager.getInstance().log(e);
           throw e;
       }
   }   
   public void se_rcp_5240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
	   	
       SE_RCP_5240_ADataSet ds = null;

       // DM Setting
       SE_RCP_5240_ADM dm 		= new SE_RCP_5240_ADM();

       String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
       String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
       String incmg_pers_ip     = Util.checkString(req.getRemoteAddr());
       String dept_cd     		= Util.checkString(req.getParameter("dept_cd"));
       String sub_dept_cd     	= Util.checkString(req.getParameter("sub_dept_cd"));
       String area_cd     		= Util.checkString(req.getParameter("area_cd"));
       String issu_dt 			= Util.checkString(req.getParameter("issu_dt"));
				
		dm.setCmpy_cd(cmpy_cd);
		dm.setIssu_dt(issu_dt);
		dm.setDept_cd(dept_cd);
		dm.setSub_dept_cd(sub_dept_cd);
		dm.setArea_cd(area_cd);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		
		dm.print();
		
       try {
       	SE_RCP_5200DAO dao = new SE_RCP_5200DAO();
           ds = dao.se_rcp_5240_a(dm);
           req.setAttribute("ds", ds);
       }
       catch (AppException e) {
           LogManager.getInstance().log(e);
           throw e;
       }
   }   
}
