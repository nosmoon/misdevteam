/***************************************************************************************************
* 파일명 : MT_PAPMEDA_1000WB
* 기능 :  원재료관리 / 위탁인쇄조정 관리
* 작성일자 : 2009-05-06
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papmeda.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

public class MT_PAPMEDA_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
	 * 위탁처, 제지사, 매체 콤보
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1000_MDataSet ds = null;

		MT_PAPMEDA_1000_MDM dm = new MT_PAPMEDA_1000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPMEDA_1000_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    /**
	 * 사업자등록번호 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1100_LDataSet ds = null;

		MT_PAPMEDA_1100_LDM dm = new MT_PAPMEDA_1100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
		dm.print();

		ds = (MT_PAPMEDA_1100_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}



    /**
	 * 위탁처조정금액내역 저장,수정,삭제
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1101_ADataSet ds = null;

		MT_PAPMEDA_1101_ADM dm = new MT_PAPMEDA_1101_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    	//System.out.println(multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

System.out.println(multiUpdateData);



		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.yyyymm    = Util.checkString(req.getParameter("meda_yymm"));
		dm.slip_dt   = Util.checkString(req.getParameter("slip_proc_occr_dt"));
		dm.fac_clsf  = (String)hash.get("fac_clsf");
		dm.papcmpy_cd  = (String)hash.get("papcmpy_cd");
		dm.medi_cd   = (String)hash.get("medi_cd");
		dm.cnsm_wgt  = (String)hash.get("cnsm_wgt");
		dm.hdqt_paper_uprc = (String)hash.get("hdqt_paper_uprc");
		dm.hdqt_amt    = (String)hash.get("hdqt_amt");
		dm.meda_amt    = (String)hash.get("meda_amt");
		dm.meda_vat    = (String)hash.get("meda_vat");
		dm.basi_amt    = (String)hash.get("basi_amt");
		dm.print();

		ds = (MT_PAPMEDA_1101_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    /**
	 * 위탁처조정금액내역 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1102_LDataSet ds = null;

		MT_PAPMEDA_1102_LDM dm = new MT_PAPMEDA_1102_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.meda_yymm = Util.checkString(req.getParameter("meda_yymm"));
		dm.slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
		dm.print();

		ds = (MT_PAPMEDA_1102_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_papmeda_1104_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1104_MDataSet ds = null;

		MT_PAPMEDA_1104_MDM dm = new MT_PAPMEDA_1104_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyymm  = Util.checkString(req.getParameter("meda_yymm"));
		dm.pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.pers_id= Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (MT_PAPMEDA_1104_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    /**
	 * 위탁처별 조회 - 위탁처(동적그리드)조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1200_LDataSet ds = null;

		MT_PAPMEDA_1200_LDM dm = new MT_PAPMEDA_1200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPMEDA_1200_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}


    /**
	 * 위탁처별 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1201_LDataSet ds = null;

		MT_PAPMEDA_1201_LDM dm = new MT_PAPMEDA_1201_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.meda_yymm_fr = Util.checkString(req.getParameter("meda_yymm_fr"));
		dm.meda_yymm_to = Util.checkString(req.getParameter("meda_yymm_to"));
		dm.print();

		ds = (MT_PAPMEDA_1201_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}


    /**
	 * 제지사별 조회 - 제지사(동적그리드)조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1300_LDataSet ds = null;

		MT_PAPMEDA_1300_LDM dm = new MT_PAPMEDA_1300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PAPMEDA_1300_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}


    /**
	 * 제지사별 조회
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papmeda_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPMEDA_1301_LDataSet ds = null;

		MT_PAPMEDA_1301_LDM dm = new MT_PAPMEDA_1301_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.meda_yymm_fr = Util.checkString(req.getParameter("meda_yymm_fr"));
		dm.meda_yymm_to = Util.checkString(req.getParameter("meda_yymm_to"));
		dm.print();

		ds = (MT_PAPMEDA_1301_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
}
