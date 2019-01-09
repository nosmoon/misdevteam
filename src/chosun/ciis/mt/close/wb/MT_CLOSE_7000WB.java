package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

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
public class MT_CLOSE_7000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 필름기준정보관리 화면조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void mt_close_7000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7000_LDataSet ds = null;
		MT_CLOSE_7000_LDM dm = new MT_CLOSE_7000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7000_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}

    /**
     * 필름기준정보관리 화면의 콤보(매체,섹션,공장,자재(필름,현상액) 셋팅
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_close_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7001_LDataSet ds = null;
		MT_CLOSE_7001_LDM dm = new MT_CLOSE_7001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7001_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

    /**
     * 필름기준정보관리 데이터 저장 및 삭제
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */ 
    
    public void mt_close_7002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7002_LDataSet ds = null;
		MT_CLOSE_7002_LDM dm = new MT_CLOSE_7002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.bebubi_cd = Util.checkString(req.getParameter("bebubi_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7002_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.bebubi_cd = (String)hash.get("bebubi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.bebubi_cd = Util.getSessionParameterValue(req,"bebubi_cd",true);
		*******************************************************************************************/
	}
    
/*    
    public void mt_close_7002(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_CLOSE_7002_ADataSet ds = null;
    	MT_CLOSE_7002_ADM dm = new MT_CLOSE_7002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		System.out.println("converted[ 0] => CRUD (" + converted[0]+")");
		System.out.println("converted[ 1] => ROW  (" + converted[1]+")");
		System.out.println("converted[ 2] => 회사   (" + converted[2]+")");
		System.out.println("converted[ 3] => 공장   (" + converted[3]+")");
		System.out.println("converted[ 4] => 필름   (" + converted[4]+")");
		System.out.println("converted[ 5] => 일자   (" + converted[5]+")");
		System.out.println("converted[ 6] => SEQ  (" + converted[6]+")");
		System.out.println("converted[ 7] => 매수   (" + converted[7]+")");
		System.out.println("converted[ 8] => 매체   (" + converted[8]+")");
		System.out.println("converted[ 9] => 섹션   (" + converted[9]+")");
		System.out.println("converted[10] => 약품1 (" + converted[10]+")");
		System.out.println("converted[11] => 약품2 (" + converted[11]+")");
		System.out.println("converted[12] => 약품3 (" + converted[12]+")");
		System.out.println("converted[13] => 약품4 (" + converted[13]+")");
		System.out.println("converted[14] => 약품5 (" + converted[14]+")");
		
		String mode      = converted[0];
		String row       = converted[1];
		String fac_clsf  = converted[3];		// 공장구분
		String matr_cd   = converted[4];		// 자재(필름)
		String aply_dt   = converted[5];		// 적용일자
		String seq       = converted[6];		// 일련번호
		String num_shet  = converted[7];		// 매수
		String medi_cd   = converted[8];		// 매체코드
		String sect_cd   = converted[9];		// 섹션코드
		String chemi_cd1 = converted[10];		// 자재(약품1)
		String chemi_cd2 = converted[11];		// 자재(약품2)
		String chemi_cd3 = converted[12];		// 자재(약품3)
		String chemi_cd4 = converted[13];		// 자재(약품4)
		String chemi_cd5 = converted[14];		// 자재(약품5)

		dm.setMode(mode);
		dm.setRow(row);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);	// 회사코드
		dm.setFac_clsf(fac_clsf);		// 공장구분
		dm.setMatr_cd(matr_cd);			// 자재(필름)
		dm.setAply_dt(aply_dt);			// 적용일자
		dm.setSeq(seq);					// 일련번호
		dm.setNum_shet(num_shet);		// 매수
		dm.setMedi_cd(medi_cd);			// 매체코드
		dm.setSect_cd(sect_cd);			// 섹션코드
		dm.setChemi_cd1(chemi_cd1);		// 자재(약품1)
		dm.setChemi_cd2(chemi_cd2);		// 자재(약품2)
		dm.setChemi_cd3(chemi_cd3);		// 자재(약품3)
		dm.setChemi_cd4(chemi_cd4);		// 자재(약품4)
		dm.setChemi_cd5(chemi_cd5);		// 자재(약품5)
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());		// 입력자IP
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);	// 입력자
    	
    	dm.print();

    	try {
            MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome) JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
        	MT_CLOSE_7000EJB ejb = home.create();

        	ds = ejb.getMt_Close_7002(dm);
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
    }
*/     
    
    public void mt_close_7003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7003_LDataSet ds = null;
		MT_CLOSE_7003_LDM dm = new MT_CLOSE_7003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7003_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
    public void mt_close_7004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7004_LDataSet ds = null;
		MT_CLOSE_7004_LDM dm = new MT_CLOSE_7004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.bebubi_cd = Util.checkString(req.getParameter("bebubi_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7004_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.bebubi_cd = (String)hash.get("bebubi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.bebubi_cd = Util.getSessionParameterValue(req,"bebubi_cd",true);
		*******************************************************************************************/
	}
    
    public void mt_close_7005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_7005_LDataSet ds = null;
		MT_CLOSE_7005_LDM dm = new MT_CLOSE_7005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_7005_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작	
		try {
			MT_CLOSE_7000EJBHome home = (MT_CLOSE_7000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_7000EJB");
			MT_CLOSE_7000EJB ejb = home.create();

			ds = ejb.mt_close_7005_l(dm);
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

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		*******************************************************************************************/
	}
    
}