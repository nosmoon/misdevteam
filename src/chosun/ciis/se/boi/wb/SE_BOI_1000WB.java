/***************************************************************************************************
* 파일명 : SE_BOI_1000WB.java
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

package chosun.ciis.se.boi.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.*;

import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.db.DBManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_1000DAO;
import chosun.ciis.se.boi.dm.SE_BOI_1000_MDM;
import chosun.ciis.se.boi.dm.SE_BOI_1010_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1020_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1030_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1040_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1050_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1055_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1056_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1057_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1058_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1059_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_1060_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1070_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1080_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1090_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1091_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_1092_SDM;
import chosun.ciis.se.boi.dm.SE_BOI_1093_LDM;
import chosun.ciis.se.boi.ds.SE_BOI_1000_MDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1010_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1020_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1030_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1040_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1050_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1055_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1056_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1057_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1058_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1059_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1060_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1070_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1080_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1090_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1091_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1092_SDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_1093_LDataSet;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

import com.oreilly.servlet.multipart.*;
/**
 *
 */

public class SE_BOI_1000WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1000_MDataSet ds = null;

        // DM Setting
        SE_BOI_1000_MDM dm = new SE_BOI_1000_MDM();

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1000_m(dm);
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
     * 지국 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1010_LDataSet ds = null;

        // DM Setting
        SE_BOI_1010_LDM dm = new SE_BOI_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		dm.bo_reg_clsf = Util.checkString(req.getParameter("bo_reg_clsf"));
		dm.bo_cntr_dt_fr = Util.checkString(req.getParameter("bo_cntr_dt_fr"));
		dm.bo_cntr_dt_to = Util.checkString(req.getParameter("bo_cntr_dt_to"));


        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1010_l(dm);
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
     * 지국 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1020_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1020_SDataSet ds = null;

        // DM Setting
        SE_BOI_1020_SDM dm = new SE_BOI_1020_SDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1020_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1020_s(dm);
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
     * 지국장 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1030_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
        SE_BOI_1030_SDataSet ds = null;
        // DM Setting
        SE_BOI_1030_SDM dm = new SE_BOI_1030_SDM();

        String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_head_prn(bo_head_prn);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1030_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1030_s(dm);
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
     * 지국장 사진 다운로드
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1035_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1030_SDataSet ds = null;

        // DM Setting
        SE_BOI_1030_SDM dm = new SE_BOI_1030_SDM();

        String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_head_prn(bo_head_prn);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1030_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1030_s(dm);
//            req.setAttribute("bo_head_phot", ds.bo_head_phot);
//            req.setAttribute("filenm", ds.bo_head_nm+".gif");
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
     * 지국기타정보 상세조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1040_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1040_SDataSet ds = null;

        // DM Setting
        SE_BOI_1040_SDM dm = new SE_BOI_1040_SDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1040_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

 //dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1040_s(dm);
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
     * 지국직원정보 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1050_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1050_LDataSet ds = null;

        // DM Setting
        SE_BOI_1050_LDM dm = new SE_BOI_1050_LDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String lvcmpyyn = Util.checkString(req.getParameter("lvcmpyyn"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);
		dm.setLvcmpyyn(lvcmpyyn);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1050_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	//dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1050_l(dm);
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
     * 지국수지정보 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1055_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1055_LDataSet ds = null;

        // DM Setting
        SE_BOI_1055_LDM dm = new SE_BOI_1055_LDM();

        String bo_cd = Util.checkString(req.getParameter("bo_cd"));
        String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String yymm = Util.checkString(req.getParameter("yymm"));
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setBo_cd(bo_cd);
        dm.setBo_seq(bo_seq);
		dm.setYymm(yymm);
		dm.setIncmg_pers(incmg_pers);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1055_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	//dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1055_l(dm);
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
     * 지국대행관리자 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1056_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1056_LDataSet ds = null;
		SE_BOI_1056_LDM dm = new SE_BOI_1056_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1056_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//			SE_BOI_1000EJB ejb = home.create();
//
//			ds = ejb.se_boi_1056_l(dm);
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
     * 지국현황 리스트
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1057_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1057_LDataSet ds = null;
		SE_BOI_1057_LDM dm = new SE_BOI_1057_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bocd = Util.checkString(req.getParameter("bo_cd"));
		dm.basi_yymm = Util.checkString(req.getParameter("basi_yymm"));

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1057_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//		try {
//			SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//			SE_BOI_1000EJB ejb = home.create();
//
//			ds = ejb.se_boi_1057_l(dm);
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
     * 직원의 부팀명
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1058_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1058_SDataSet ds = null;
		SE_BOI_1058_SDM dm = new SE_BOI_1058_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.empno = Util.checkString(req.getParameter("empno"));

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1058_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//			SE_BOI_1000EJB ejb = home.create();
//
//			ds = ejb.se_boi_1058_s(dm);
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
     * 지국명변경이력
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1059_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1059_LDataSet ds = null;
		SE_BOI_1059_LDM dm = new SE_BOI_1059_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1059_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		//dm.print();
//		try {
//			SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//			SE_BOI_1000EJB ejb = home.create();
//
//			ds = ejb.se_boi_1059_l(dm);
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
     * 지국기본정보 등록/수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1060_ADataSet ds = null;

        // DM Setting
        SE_BOI_1060_ADM dm = new SE_BOI_1060_ADM();

		String accflag = Util.checkString(req.getParameter("accflag"));
		String orgn_clsf = Util.checkString(req.getParameter("orgn_clsf"));
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String bo_nm = Util.checkString(req.getParameter("bo_nm"));
		String area_cd = Util.checkString(req.getParameter("area_cd"));
		String srt_seq = Util.checkString(req.getParameter("srt_seq"));
		String div_motr_bo_cdseq = Util.checkString(req.getParameter("div_motr_bo_cd"));
		String div_motr_bo_cd = "";
		String div_motr_bo_seq = "";
		if(div_motr_bo_cdseq.length()==8){
			div_motr_bo_cd = div_motr_bo_cdseq.substring(0,5);
			div_motr_bo_seq = div_motr_bo_cdseq.substring(5,8);
		}
		String ref_bo_cdseq = Util.checkString(req.getParameter("ref_bo_cd"));
		String ref_bo_cd = "";
		String ref_bo_seq = "";
		if(ref_bo_cdseq.length()==8){
			ref_bo_cd = ref_bo_cdseq.substring(0,5);
			ref_bo_seq = ref_bo_cdseq.substring(5,8);
		}
		String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		String bo_cntr_dt = Util.checkString(req.getParameter("bo_cntr_dt"));
		String bo_expy_dt = Util.checkString(req.getParameter("bo_expy_dt"));
		String bo_spcf_clsf = Util.checkString(req.getParameter("bo_spcf_clsf"));
		String cntr_doc_1 = Util.checkString(req.getParameter("cntr_doc_1"));
		String cntr_doc_2 = Util.checkString(req.getParameter("cntr_doc_2"));
		String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
		String jont_debtgurt_limt_amt = Util.checkString(req.getParameter("jont_debtgurt_limt_amt"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
		String tel_no_1_0 = Util.checkString(req.getParameter("tel_no_1_0"));
		String tel_no_1_1 = Util.checkString(req.getParameter("tel_no_1_1"));
		String tel_no_1_2 = Util.checkString(req.getParameter("tel_no_1_2"));
		String tel_no_1_3 = Util.checkString(req.getParameter("tel_no_1_3"));
		String tel_no_2_0 = Util.checkString(req.getParameter("tel_no_2_0"));
		String tel_no_2_1 = Util.checkString(req.getParameter("tel_no_2_1"));
		String tel_no_2_2 = Util.checkString(req.getParameter("tel_no_2_2"));
		String tel_no_2_3 = Util.checkString(req.getParameter("tel_no_2_3"));
		//String bo_zip_1 = Util.checkString(req.getParameter("bo_zip_1"));
		//String bo_zip_2 = Util.checkString(req.getParameter("bo_zip_2"));
		String bo_zip_1 = Util.checkString(req.getParameter("bo_zip"));
		String bo_addr = Util.checkString(req.getParameter("bo_addr"));
		String bo_dtls_addr = Util.checkString(req.getParameter("bo_dtls_addr"));
		//String jd_zip_1 = Util.checkString(req.getParameter("jd_zip_1"));
		//String jd_zip_2 = Util.checkString(req.getParameter("jd_zip_2"));
		String jd_zip_1 = Util.checkString(req.getParameter("jd_zip"));
		String jd_addr = Util.checkString(req.getParameter("jd_addr"));
		String jd_dtls_addr = Util.checkString(req.getParameter("jd_dtls_addr"));
		//String bo_jurs_nwsp_zip_1 = Util.checkString(req.getParameter("bo_jurs_nwsp_zip_1"));
		//String bo_jurs_nwsp_zip_2 = Util.checkString(req.getParameter("bo_jurs_nwsp_zip_2"));
		String bo_jurs_nwsp_zip_1 = Util.checkString(req.getParameter("bo_jurs_nwsp_zip"));
		String bo_jurs_nwsp_addr = Util.checkString(req.getParameter("bo_jurs_nwsp_addr"));
		String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
		String bo_mang_grad_clas = Util.checkString(req.getParameter("bo_mang_grad_clas"));
		String stmt_crte_clsf = Util.checkString(req.getParameter("stmt_crte_clsf"));
		String jd_sell_net_clsf = Util.checkString(req.getParameter("jd_sell_net_clsf"));
		String qty_sell_net_clsf = Util.checkString(req.getParameter("qty_sell_net_clsf"));
		String invsg_obj_bo = Util.checkString(req.getParameter("invsg_obj_bo"));
		String jd_clam = Util.checkString(req.getParameter("jd_clam"));
		String clam_grp = Util.checkString(req.getParameter("clam_grp"));
		String add_snd_bo_cdseq = Util.checkString(req.getParameter("add_snd_bo_cd"));
		String add_snd_bo_cd = "";
		String add_snd_bo_seq = "";
		if(add_snd_bo_cdseq.length()==8){
			add_snd_bo_cd = add_snd_bo_cdseq.substring(0,5);
			add_snd_bo_seq = add_snd_bo_cdseq.substring(5,8);
		}
		String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
		String adms_unit_clsf = Util.checkString(req.getParameter("adms_unit_clsf"));
		String sido_gugun_cd = Util.checkString(req.getParameter("sido_gugun_cd"));
		String bo_mang_type = Util.checkString(req.getParameter("bo_mang_type"));
		String dmang_yn = Util.checkString(req.getParameter("dmang_yn"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
        String bo_reg_clsf = Util.checkString(req.getParameter("bo_reg_clsf"));
        String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
        String email = Util.checkString(req.getParameter("email"));
        String bogurt_clsf = Util.checkString(req.getParameter("bogurt_clsf"));


		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setOrgn_clsf(orgn_clsf);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setBo_nm(bo_nm);
		dm.setArea_cd(area_cd);
		dm.setSrt_seq(srt_seq);
		dm.setDiv_motr_bo_cd(div_motr_bo_cd);
		dm.setDiv_motr_bo_seq(div_motr_bo_seq);
		dm.setRef_bo_cd(ref_bo_cd);
		dm.setRef_bo_seq(ref_bo_seq);
		dm.setChrg_pers(chrg_pers);
		dm.setBo_cntr_dt(bo_cntr_dt);
		dm.setBo_expy_dt(bo_expy_dt);
		dm.setBo_spcf_clsf(bo_spcf_clsf);
		dm.setCntr_doc_1(cntr_doc_1);
		dm.setCntr_doc_2(cntr_doc_2);
		dm.setCntr_stat_clsf(cntr_stat_clsf);
		dm.setJont_debtgurt_limt_amt(jont_debtgurt_limt_amt);
		dm.setDlco_no(dlco_no);
		dm.setBo_head_nm(bo_head_nm);
		dm.setBo_head_prn(bo_head_prn);
		dm.setTel_no_1_0(tel_no_1_0);
		dm.setTel_no_1_1(tel_no_1_1);
		dm.setTel_no_1_2(tel_no_1_2);
		dm.setTel_no_1_3(tel_no_1_3);
		dm.setTel_no_2_0(tel_no_2_0);
		dm.setTel_no_2_1(tel_no_2_1);
		dm.setTel_no_2_2(tel_no_2_2);
		dm.setTel_no_2_3(tel_no_2_3);
		dm.setBo_zip_1(bo_zip_1);
		//dm.setBo_zip_2(bo_zip_2);
		dm.setBo_addr(bo_addr);
		dm.setBo_dtls_addr(bo_dtls_addr);
		dm.setJd_zip_1(jd_zip_1);
		//dm.setJd_zip_2(jd_zip_2);
		dm.setJd_addr(jd_addr);
		dm.setJd_dtls_addr(jd_dtls_addr);
		dm.setBo_jurs_nwsp_zip_1(bo_jurs_nwsp_zip_1);
		//dm.setBo_jurs_nwsp_zip_2(bo_jurs_nwsp_zip_2);
		dm.setBo_jurs_nwsp_addr(bo_jurs_nwsp_addr);
		dm.setBo_feat_clsf(bo_feat_clsf);
		dm.setBo_mang_grad_clas(bo_mang_grad_clas);
		dm.setStmt_crte_clsf(stmt_crte_clsf);
		dm.setJd_sell_net_clsf(jd_sell_net_clsf);
		dm.setQty_sell_net_clsf(qty_sell_net_clsf);
		dm.setInvsg_obj_bo(invsg_obj_bo);
		dm.setJd_clam(jd_clam);
		dm.setClam_grp(clam_grp);
		dm.setAdd_snd_bo_cd(add_snd_bo_cd);
		dm.setAdd_snd_bo_seq(add_snd_bo_seq);
		dm.setAdms_dstc_cd(adms_dstc_cd);
		dm.setAdms_unit_clsf(adms_unit_clsf);
		dm.setSido_gugun_cd(sido_gugun_cd);
		dm.setBo_mang_type(bo_mang_type);
		dm.setDmang_yn(dmang_yn);
		dm.setIncmgpers(incmgpers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());
		dm.setBo_reg_clsf(bo_reg_clsf);
		dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
		dm.setEmail(email);
		dm.setBogurt_clsf(bogurt_clsf);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1060_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1060_a(dm);
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
     * 지국장정보 등록/수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1070_a(HttpServletRequest req, HttpServletResponse res)
    	//throws   AppException, IOException {
    	throws   AppException{

        SE_BOI_1070_ADataSet ds = null;

        // DM Setting
        SE_BOI_1070_ADM dm = new SE_BOI_1070_ADM();

        Hashtable ht = new Hashtable();
//        byte[] phot = new byte[10 * 1024 * 1024]; 20170530 장선희 주석처리 10MB
        byte[] phot = new byte[153600];  //150KB로 변경

		//String file_name = "";
		//String file_size = "";

        //int limitsize = 10*1024*1024;  // 파일크기
        int limitsize = 153600 ;  //150KB로 변경
        /*MultipartParser mp = new MultipartParser(req, limitsize, true, true, "EUC-KR"); // 10MB
        Part part;

        while ((part = mp.readNextPart()) != null) {
		    String name  = part.getName();
		    //System.out.println("name::"+name);
			if (part.isParam()) {
				ht.put(part.getName(), ((ParamPart)part).getStringValue());
		    }else if (part.isFile()) {
		    		//System.out.println("part.isFile::");
			        FilePart filePart = (FilePart) part;
			        file_name = filePart.getFileName();
			        //System.out.println("file_name::"+file_name);
			        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			        ((FilePart)part).writeTo(byteArrayOutputStream);
						phot = byteArrayOutputStream.toByteArray();
						//dm.bo_head_phot = phot;
						file_size = String.valueOf(phot.length);
						//dm.phot_size = file_size;
						//System.out.println("phot_size = "+file_size);
		    }
		}*/
        try
        {
          MultipartParser multi = new MultipartParser(req, limitsize, true, true, "euc_kr");
          Part part = null;
          for (int i = 0; (part = multi.readNextPart()) != null; i++) {
            if ((part instanceof FilePart)) {
              if (((FilePart)part).getFileName() != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((FilePart)part).writeTo(byteArrayOutputStream);
                phot = byteArrayOutputStream.toByteArray();
                ht.put("phot", phot);
              }
            } else if ((part instanceof ParamPart))
              ht.put(part.getName(), ((ParamPart)part).getStringValue());
          }
        }
        catch (IOException e)
        {
          throw new AppException("[SE_BOI_1000WB.se_boi_1070_a()]", "[SE_BOI_1000WB.se_boi_1070_a()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
          SysException se = new SysException(e);
          LogManager.getInstance().log(se);
          throw se;
        }

		String accflag = Util.checkString((String)ht.get("accflag"));
		String bo_head_nm = Util.checkString((String)ht.get("bo_head_nm"));
		String bo_head_prn = Util.checkString((String)ht.get("bo_head_prn"));
		String tel_no_0 = Util.checkString((String)ht.get("tel_no_0"));
		String tel_no_1 = Util.checkString((String)ht.get("tel_no_1"));
		String tel_no_2 = Util.checkString((String)ht.get("tel_no_2"));
		String tel_no_3 = Util.checkString((String)ht.get("tel_no_3"));
		String ptph_1 = Util.checkString((String)ht.get("ptph_no_1"));
		String ptph_2 = Util.checkString((String)ht.get("ptph_no_2"));
		String ptph_3 = Util.checkString((String)ht.get("ptph_no_3"));
		String bo_head_bidt = Util.checkString((String)ht.get("bo_head_bidt"));
		String luso_clsf = Util.checkString((String)ht.get("luso_clsf"));
		String wedd_anvy_dd = Util.checkString((String)ht.get("wedd_anvy_dd"));
		//String zip_1 = Util.checkString((String)ht.get("zip_1"));
		//String zip_2 = Util.checkString((String)ht.get("zip_2"));
		String zip_1 = Util.checkString((String)ht.get("zip"));
		String addr = Util.checkString((String)ht.get("addr"));
		String dtls_addr = Util.checkString((String)ht.get("dtls_addr"));
		String nativ = Util.checkString((String)ht.get("nativ"));
		String hby = Util.checkString((String)ht.get("hby"));
		String relg = Util.checkString((String)ht.get("relg"));
		String drink_qunt = Util.checkString((String)ht.get("drink_qunt"));
		String smok_yn = Util.checkString((String)ht.get("smok_yn"));
		String dlco_no = Util.checkString((String)ht.get("dlco_no"));

        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_head_nm(bo_head_nm);
		dm.setBo_head_prn(bo_head_prn);
		dm.setTel_no_0(tel_no_0);
		dm.setTel_no_1(tel_no_1);
		dm.setTel_no_2(tel_no_2);
		dm.setTel_no_3(tel_no_3);
		dm.setPtph_1(ptph_1);
		dm.setPtph_2(ptph_2);
		dm.setPtph_3(ptph_3);
		dm.setBo_head_bidt(bo_head_bidt);
		dm.setLuso_clsf(luso_clsf);
		dm.setWedd_anvy_dd(wedd_anvy_dd);
		dm.setZip_1(zip_1);
		//dm.setZip_2(zip_2);
		dm.setAddr(addr);
		dm.setDtls_addr(dtls_addr);
		dm.setNativ(nativ);
		dm.setHby(hby);
		dm.setRelg(relg);
		dm.setDrink_qunt(drink_qunt);
		dm.setSmok_yn(smok_yn);
		dm.setDlco_no(dlco_no);

		dm.setIncmgpers(incmgpers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

    	boolean bResult = false;
        String sResult = "false"; // request로 반환할 String Type 결과

	if(!"P".equals(accflag)){

		   	phot = (byte[])ht.get("phot");

		   	if(phot != null){
		   		dm.setBo_head_phot(phot);
		   		int phot_len = phot.length/1024;
		   		dm.setPhot_size(Integer.toString(phot_len));
		   	}
//			dm.setBo_head_phot("1010".getBytes());
//			dm.setPhot_size(file_size);

	        //학력및 경력
	    	String multiUpdateData1 = Util.checkString((String)ht.get("multiUpdateData1"));

	    	Hashtable hash = getHashMultiUpdateData(multiUpdateData1);

	    	String mode 			= (String)hash.get("m");
	        String hsty_seq     	= (String)hash.get("hsty_seq");
	        String yymm     		= (String)hash.get("yymm");
	        String hsty_matt 		= (String)hash.get("hsty_matt");

	        //mode = StringUtil.nvl(mode);
			dm.setMode_ar(mode.toUpperCase());
			dm.setHsty_seq_ar(hsty_seq);
			dm.setYymm_ar(yymm);
			dm.setHsty_matt_ar(hsty_matt);

	        //가족사항
	    	String multiUpdateData2 = Util.checkString((String)ht.get("multiUpdateData2"));

	    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

	    	String mode2 			= (String)hash2.get("m");
	        String faml_seq     	= (String)hash2.get("faml_seq");
	        String flnm     		= (String)hash2.get("flnm");
	        String faml_rshp_cd		= (String)hash2.get("faml_rshp_cd");
	        String bidt				= (String)hash2.get("bidt");
	        String luso_clsf_ar		= (String)hash2.get("luso_clsf");

			dm.setMode2_ar(mode2.toUpperCase());
			dm.setFaml_seq_ar(faml_seq);
			dm.setFlnm_ar(flnm);
			dm.setFaml_rshp_cd_ar(faml_rshp_cd);
			dm.setBidt_ar(bidt);
			dm.setLuso_clsf_ar(luso_clsf_ar);

	        //지국장 소견
	    	String multiUpdateData3 = Util.checkString((String)ht.get("multiUpdateData3"));

	    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

	    	String mode3 			= (String)hash3.get("m");
	        String idea_seq     	= (String)hash3.get("idea_seq");
	        String make_pers_nm		= (String)hash3.get("make_pers_nm");
	        String idea 			= (String)hash3.get("idea");

			dm.setMode3_ar(mode3.toUpperCase());
			dm.setIdea_seq_ar(idea_seq);
			dm.setMake_pers_nm_ar(make_pers_nm);
			dm.setIdea_ar(idea);

			dm.print();
    	}

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            bResult = dao.se_boi_1070_a(dm);
            if (bResult == true) { // 성공적으로 입력된 경우
                sResult = "true";
            }

            req.setAttribute("result", sResult);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
        /*
		dm.print();
		DBManager manager = new DBManager("MISSEL");
		ds = (SE_BOI_1070_ADataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			//System.out.println("bb");
			// BLOB 구하기
			//manager.m_conn.setAutoCommit(false);
			//System.out.println("file_name222::"+file_name);
			if(file_name != ""){
				try {System.out.println("BLOB start!!");
							manager.getConnection();
							manager.m_conn.setAutoCommit(false);
							Statement stmt = manager.m_conn.createStatement();
							String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE BO_HEAD_PRN      = '" + dm.bo_head_prn + "' FOR UPDATE";
							//System.out.println("blobQuery::"+blobQuery);

							OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
							//System.out.println("rset::"+rset);
							if (rset.next()) {
								System.out.println("resin-BLOB-start");
								//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
								//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
			          	   		//레진용(ep1)
			          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);
								OutputStream os = oracle_blob.getBinaryOutputStream();

								// 파일로부터 읽어서 BLOB 에 WRITE 한다.
								for(int i=0; i<phot.length; i++){
									os.write(phot[i]);
								}
								os.close();
							}
							stmt.close();
							manager.m_conn.commit();
							manager.disConnection();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}


		req.setAttribute("ds", ds);
		*/
	}

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//
//            bResult = ejb.se_boi_1070_a(dm);
//            if (bResult == true) { // 성공적으로 입력된 경우
//                sResult = "true";
//            }
//            req.setAttribute("result", sResult); // request에 결과값을 담는다.
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
//    }

    /**
     * 지국기타정보 등록/수정/삭제
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1080_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1080_ADataSet ds = null;

        // DM Setting
        SE_BOI_1080_ADM dm = new SE_BOI_1080_ADM();

		String accflag = Util.checkString(req.getParameter("accflag"));
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

        //학력및 경력
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode_ar = (String)hash.get("m");
		String gurt_pers_flnm_ar = (String)hash.get("gurt_pers_flnm");
		String prn_ar = (String)hash.get("prn");
		String zip_ar = (String)hash.get("zip");
		String addr_ar = (String)hash.get("addr");
		String dtls_addr_ar = (String)hash.get("dtls_addr");
		String tel_no_1_ar = (String)hash.get("tel_no_1");
		String tel_no_2_ar = (String)hash.get("tel_no_2");
		String tel_no_3_ar = (String)hash.get("tel_no_3");
		String ptph_no_1_ar = (String)hash.get("ptph_no_1");
		String ptph_no_2_ar = (String)hash.get("ptph_no_2");
		String ptph_no_3_ar = (String)hash.get("ptph_no_3");
		String gurt_dt_ar = (String)hash.get("gurt_dt");
		String reg_resn_ar = (String)hash.get("reg_resn");

		String add_bogurt_amt = Util.checkString(req.getParameter("add_bogurt_amt"));
		String mort_amt = Util.checkString(req.getParameter("mort_amt"));
		String insr_clsf = Util.checkString(req.getParameter("insr_clsf"));
		String insr_cmpy = Util.checkString(req.getParameter("insr_cmpy"));
		String insr_no = Util.checkString(req.getParameter("insr_no"));
		String insr_rmk = Util.checkString(req.getParameter("insr_rmk"));
		String insr_amt = Util.checkString(req.getParameter("insr_amt"));
		String insr_prem = Util.checkString(req.getParameter("insr_prem"));
		String insr_fr_dt = Util.checkString(req.getParameter("insr_fr_dt"));
		String insr_to_dt = Util.checkString(req.getParameter("insr_to_dt"));
		String insr_seq = Util.checkString(req.getParameter("insr_seq"));

		dm.setMode_ar(mode_ar.toUpperCase());
		dm.setGurt_pers_flnm_ar(gurt_pers_flnm_ar);
		dm.setPrn_ar(prn_ar);
		dm.setZip_ar(zip_ar);
		dm.setAddr_ar(addr_ar);
		dm.setDtls_addr_ar(dtls_addr_ar);
		dm.setTel_no_1_ar(tel_no_1_ar);
		dm.setTel_no_2_ar(tel_no_2_ar);
		dm.setTel_no_3_ar(tel_no_3_ar);
		dm.setPtph_no_1_ar(ptph_no_1_ar);
		dm.setPtph_no_2_ar(ptph_no_2_ar);
		dm.setPtph_no_3_ar(ptph_no_3_ar);
		dm.setGurt_dt_ar(gurt_dt_ar);
		dm.setReg_resn_ar(reg_resn_ar);
		dm.setAdd_bogurt_amt(add_bogurt_amt);
		dm.setMort_amt(mort_amt);
		dm.setInsr_clsf(insr_clsf);
		dm.setInsr_cmpy(insr_cmpy);
		dm.setInsr_no(insr_no);
		dm.setInsr_rmk(insr_rmk);
		dm.setInsr_amt(insr_amt);
		dm.setInsr_prem(insr_prem);
		dm.setInsr_fr_dt(insr_fr_dt);
		dm.setInsr_to_dt(insr_to_dt);
		dm.setInsr_seq(insr_seq);

		dm.print();

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1080_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1080_a(dm);
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
     * 지국수지 등록/수정/삭제
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
    public void se_boi_1090_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {

        SE_BOI_1090_ADataSet ds = null;

        // DM Setting
        SE_BOI_1090_ADM dm = new SE_BOI_1090_ADM();

		String accflag = Util.checkString(req.getParameter("accflag"));
		String bo_cd = Util.checkString(req.getParameter("bo_cd"));
		String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		String yymm = Util.checkString(req.getParameter("yymm"));
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.setAccflag(accflag);
		dm.setCmpy_cd(cmpy_cd);
		dm.setBo_cd(bo_cd);
		dm.setBo_seq(bo_seq);
		dm.setYymm(yymm);
		dm.setIncmg_pers(incmg_pers);
		dm.setIncmg_pers_ip(req.getRemoteAddr());

        //수입내역
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode_ar = (String)hash.get("m");
		String innexp_clsf_ar = (String)hash.get("innexp_clsf");
		String innexp_ptcr_clsf_ar = (String)hash.get("innexp_ptcr_clsf");
		String innexp_amt_ar = (String)hash.get("innexp_amt");

		dm.setMode_ar(mode_ar.toUpperCase());
		dm.setInnexp_clsf_ar(innexp_clsf_ar);
		dm.setInnexp_ptcr_clsf_ar(innexp_ptcr_clsf_ar);
		dm.setInnexp_amt_ar(innexp_amt_ar);


        //지출내역
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));

    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	String mode2_ar = (String)hash2.get("m");
		String innexp_clsf2_ar = (String)hash2.get("innexp_clsf2");
		String innexp_ptcr_clsf2_ar = (String)hash2.get("innexp_ptcr_clsf2");
		String innexp_amt2_ar = (String)hash2.get("innexp_amt2");

		dm.setMode2_ar(mode2_ar.toUpperCase());
		dm.setInnexp_clsf2_ar(innexp_clsf2_ar);
		dm.setInnexp_ptcr_clsf2_ar(innexp_ptcr_clsf2_ar);
		dm.setInnexp_amt2_ar(innexp_amt2_ar);

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1090_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();

//        SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome) JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//        try {
//        	SE_BOI_1000EJB ejb = home.create();
//            ds = ejb.se_boi_1090_a(dm);
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
     * 지국대행 관리자 등록/수정/삭제
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_1091_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_1091_ADataSet ds = null;
		SE_BOI_1091_ADM dm = new SE_BOI_1091_ADM();

		dm.accflag = Util.checkString(req.getParameter("accflag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode_ar = (String)hash.get("m");
    	String vexc_mang_pers_ar = (String)hash.get("vexc_mang_pers");
    	String empno_ar = (String)hash.get("empno");
    	String remk_ar = (String)hash.get("remk");

		dm.mode_ar = mode_ar.toUpperCase();
		dm.vexc_mang_pers_ar = vexc_mang_pers_ar;
		dm.empno_ar = empno_ar;
		dm.remk_ar = remk_ar;

        try {
        	SE_BOI_1000DAO dao = new SE_BOI_1000DAO();
            ds = dao.se_boi_1091_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_BOI_1000EJBHome home = (SE_BOI_1000EJBHome)JNDIManager.getInstance().getHome("SE_BOI_1000EJB");
//			SE_BOI_1000EJB ejb = home.create();
//
//			ds = ejb.se_boi_1091_a(dm);
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
	 * 센터대표 이미지 파일 조회. 20170427 장선희 추가.
	 *
	 * @@param req HttpServletRequest
	 * @@param res HttpServletResponse
	 * @@throws AppException
	 */
	public void se_boi_1092_s(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISSEL");

    	long start_tm = System.currentTimeMillis();

    	SE_BOI_1092_SDataSet ds = null;

        // DM Setting
    	SE_BOI_1092_SDM dm = new SE_BOI_1092_SDM();
		dm.bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));

        //dm.print();

		ds = (SE_BOI_1092_SDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
    }

	/**
	 * 센터대표 이미지 파일 다운로드 20170515 장선희 추가. 20170518
	 *
	 * @@param req HttpServletRequest
	 * @@param res HttpServletResponse
	 * @@throws AppException
	 */
	public void se_boi_1093_l(HttpServletRequest req, HttpServletResponse res) throws AppException {

		DBManager manager = new DBManager("MISSEL");

    	SE_BOI_1093_LDataSet ds = null;

        // DM Setting
    	SE_BOI_1093_LDM dm = new SE_BOI_1093_LDM();

    	dm.bo_cd =  Util.checkString(req.getParameter("bo_cd"));
    	dm.bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));

        //dm.print();

		ds = (SE_BOI_1093_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
    }

}
