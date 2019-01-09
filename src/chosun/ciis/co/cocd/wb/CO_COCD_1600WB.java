/***************************************************************************************************
* ���ϸ� : CO_COCD_1600WB
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.cocd.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.StringTokenizer;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;
import chosun.ciis.co.dlco.dm.CO_DLCO_1007_ADM;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.fc.acct.ds.FC_ACCT_1011_LDataSet;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
/**
 * 
 */

public class CO_COCD_1600WB extends BaseWB{

    /**
     * �ʱ�ȭ��
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void co_cocd_1600_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_COCD_1600_MDataSet ds = null;

        // DM Setting
        CO_COCD_1600_MDM dm = new CO_COCD_1600_MDM();

        dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
        dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
        
        dm.print();
        
        DBManager manager = new DBManager("MISCOM");

        ds 	= (CO_COCD_1600_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /** �����ȸ
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_COCD_1610_LDataSet ds = null;

        // DM Setting
        CO_COCD_1610_LDM dm = new CO_COCD_1610_LDM();

        dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.pgm_clf2 = Util.checkString(req.getParameter("pgm_clf2"));
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
        dm.print();
        
        DBManager manager = new DBManager("MISCOM");

        ds 	= (CO_COCD_1610_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**����
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1620_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_COCD_1620_ADataSet ds = null;

        // DM Setting
        CO_COCD_1620_ADM dm = new CO_COCD_1620_ADM();
		
        dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
        
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);  
        
    	dm.pgm_id = Util.checkString((String) hash.get("pgm_id"));//PK
		dm.pgm_nm = Util.checkString((String) hash.get("pgm_nm"));
    	dm.medi_cd = Util.checkString((String) hash.get("medi_cd"));
    	dm.use_yn = Util.checkString((String) hash.get("use_yn"));
    	
        dm.print();
        
        DBManager manager = new DBManager("MISCOM");

        ds 	= (CO_COCD_1620_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /** ���� (MISTV)�����ȸ ==> ���� (MISCOM)����
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1640_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_COCD_1640_LDataSet ds = null;

        // DM Setting
        CO_COCD_1640_LDM dm = new CO_COCD_1640_LDM();

        dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
        dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
        dm.print();
        
        DBManager manager = new DBManager("MISTV");
        ds 	= (CO_COCD_1640_LDataSet) manager.executeCall(dm);
        
        CO_COCD_1650_ADataSet ds2 = null;
        // DM Setting
        CO_COCD_1650_ADM dm2 = new CO_COCD_1650_ADM();
        for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1640_LCOMMCDCUR1Record rec = (CO_COCD_1640_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			
			dm2.pgm_id				= rec.pgm_id;
			dm2.pgm_nm              = rec.pgm_nm;
			dm2.pgm_onm             = rec.pgm_onm;
			dm2.pgm_typ             = rec.pgm_typ;
			dm2.brd_run             = rec.brd_run;
			dm2.tot_cnt             = rec.tot_cnt;
			dm2.pgm_clf1            = rec.pgm_clf1;
			dm2.pgm_clf2            = rec.pgm_clf2;
			dm2.jenr_clf            = rec.jenr_clf;
			dm2.target              = rec.target;
			dm2.delib_grd           = rec.delib_grd;
			dm2.info_grd            = rec.info_grd;
			dm2.frgn_clf            = rec.frgn_clf;
			dm2.game_clf            = rec.game_clf;
			dm2.main_role           = rec.main_role;
			dm2.supp_role           = rec.supp_role;
			dm2.director            = rec.director;
			dm2.mc_nm               = rec.mc_nm;
			dm2.award_info          = rec.award_info;
			dm2.prd_cntry1          = rec.prd_cntry1;
			dm2.prd_cntry2          = rec.prd_cntry2;
			dm2.prd_co_cd           = rec.prd_co_cd;
			dm2.prd_co_nm           = rec.prd_co_nm;
			dm2.prd_ym              = rec.prd_ym;
			dm2.flash_yn            = rec.flash_yn;
			dm2.emerg_yn            = rec.emerg_yn;
			dm2.news_yn             = rec.news_yn;
			dm2.pilot_yn            = rec.pilot_yn;
			dm2.pgm_info            = rec.pgm_info;
			dm2.pgm_icon            = rec.pgm_icon;
			dm2.regr                = rec.regr;
			dm2.reg_dt              = rec.reg_dt;
			dm2.modr                = rec.modr;
			dm2.mod_dt              = rec.mod_dt;
			dm2.del_yn              = rec.del_yn;
			dm2.delr                = rec.delr;
			dm2.del_dt              = rec.del_dt;
			dm2.dvs_yn              = rec.dvs_yn;
			dm2.news_group          = rec.news_group;
			dm2.online_service_yn   = rec.online_service_yn; 
			dm2.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
			dm2.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			
			System.out.println(i+"pgm_id::::::::::::::::::::::>>"+dm2.pgm_id);
		
			//dm2.print();
			DBManager manager2 = new DBManager("MISCOM");
	        ds2 = (CO_COCD_1650_ADataSet) manager2.executeCall(dm2);
		}    	
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**���� (MISCOM)����
     * @param req
     * @param res
     * @throws AppException
     */
    public void co_cocd_1650_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	CO_COCD_1650_ADataSet ds = null;

        // DM Setting
        CO_COCD_1650_ADM dm = new CO_COCD_1650_ADM();
/*
		dm.cmpy_cd 	= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pgm_id = Util.checkString(req.getParameter("pgm_id"));
		dm.pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
		dm.pgm_onm = Util.checkString(req.getParameter("pgm_onm"));
		dm.pgm_typ = Util.checkString(req.getParameter("pgm_typ"));
		dm.brd_run = Util.checkString(req.getParameter("brd_run"));
		dm.tot_cnt = Util.checkString(req.getParameter("tot_cnt"));
		dm.pgm_clf1 = Util.checkString(req.getParameter("pgm_clf1"));
		dm.pgm_clf2 = Util.checkString(req.getParameter("pgm_clf2"));
		dm.jenr_clf = Util.checkString(req.getParameter("jenr_clf"));
		dm.target = Util.checkString(req.getParameter("target"));
		dm.delib_grd = Util.checkString(req.getParameter("delib_grd"));
		dm.info_grd = Util.checkString(req.getParameter("info_grd"));
		dm.frgn_clf = Util.checkString(req.getParameter("frgn_clf"));
		dm.game_clf = Util.checkString(req.getParameter("game_clf"));
		dm.main_role = Util.checkString(req.getParameter("main_role"));
		dm.supp_role = Util.checkString(req.getParameter("supp_role"));
		dm.director = Util.checkString(req.getParameter("director"));
		dm.mc_nm = Util.checkString(req.getParameter("mc_nm"));
		dm.award_info = Util.checkString(req.getParameter("award_info"));
		dm.prd_cntry1 = Util.checkString(req.getParameter("prd_cntry1"));
		dm.prd_cntry2 = Util.checkString(req.getParameter("prd_cntry2"));
		dm.prd_co_cd = Util.checkString(req.getParameter("prd_co_cd"));
		dm.prd_co_nm = Util.checkString(req.getParameter("prd_co_nm"));
		dm.prd_ym = Util.checkString(req.getParameter("prd_ym"));
		dm.flash_yn = Util.checkString(req.getParameter("flash_yn"));
		dm.emerg_yn = Util.checkString(req.getParameter("emerg_yn"));
		dm.news_yn = Util.checkString(req.getParameter("news_yn"));
		dm.pilot_yn = Util.checkString(req.getParameter("pilot_yn"));
		dm.pgm_info = Util.checkString(req.getParameter("pgm_info"));
		dm.pgm_icon = Util.checkString(req.getParameter("pgm_icon"));
		dm.regr = Util.checkString(req.getParameter("regr"));
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.modr = Util.checkString(req.getParameter("modr"));
		dm.mod_dt = Util.checkString(req.getParameter("mod_dt"));
		dm.del_yn = Util.checkString(req.getParameter("del_yn"));
		dm.delr = Util.checkString(req.getParameter("delr"));
		dm.del_dt = Util.checkString(req.getParameter("del_dt"));
		dm.dvs_yn = Util.checkString(req.getParameter("dvs_yn"));
		dm.news_group = Util.checkString(req.getParameter("news_group"));
		dm.online_service_yn = Util.checkString(req.getParameter("online_service_yn"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
        dm.print();
*/        
        DBManager manager = new DBManager("MISCOM");

        ds 	= (CO_COCD_1650_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
}
