package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException; 
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
 
public class MT_CLOSE_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 월마감기준정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_4000(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_4000_LDataSet ds = null;

        // DM Setting
    	MT_CLOSE_4000_LDM dm = new MT_CLOSE_4000_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));	// 회사코드
    	
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_4000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
    	
        /* EJB 수정전 시작		
        try {
            MT_CLOSE_4000EJBHome home = (MT_CLOSE_4000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_4000EJB");
        	MT_CLOSE_4000EJB ejb = home.create();

    		dm.print();
        	
        	ds = ejb.getMt_Close_4000(dm);
        	
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB 수정전 끝 */
    }

    /**
     * 월마감기준정보 입력,수정,삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */    
    public void mt_close_4001(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_4001_ADataSet ds = null;
    	MT_CLOSE_4001_ADM dm = new MT_CLOSE_4001_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		System.out.println("converted[ 0] => CRUD	(" + converted[0]+")");
		System.out.println("converted[ 1] => ROW	(" + converted[1]+")");
		System.out.println("converted[ 2] => 회사	(" + converted[2]+")");
		System.out.println("converted[ 3] => 배부비	(" + converted[3]+")");
		System.out.println("converted[ 4] => 기준 	(" + converted[4]+")");
		System.out.println("converted[ 5] => 계산식   	(" + converted[5]+")");
		
		String mode      	= converted[0];
		String row       	= converted[1];
		String dstb_rat_cd  = converted[3];		// 배부비
		String dstb_rat_nm  = converted[4];		// 배부비명
		String basi   		= converted[5];		// 기준
		String calc_styl   	= converted[6];		// 계산식

		dm.setMode(mode);
		dm.setRow(row);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	// 회사코드
		dm.setDstb_rat_cd(dstb_rat_cd);										// 배부비
		dm.setDstb_rat_nm(dstb_rat_nm);										// 배부비명
		dm.setBasi(basi);													// 기준
		dm.setCalc_styl(calc_styl);											// 계산식
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		// 입력자IP
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);	// 입력자
    	
    	dm.print();
    	
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_4001_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
    	try {
            MT_CLOSE_4000EJBHome home = (MT_CLOSE_4000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_4000EJB");
        	MT_CLOSE_4000EJB ejb = home.create();

        	ds = ejb.getMt_Close_4001(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        EJB 수정전 끝 */
    }

}