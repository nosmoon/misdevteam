/***************************************************************************************************
* 파일명 :
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

package chosun.ciis.tn.rpt.wb;

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
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;
/**
 *
 */

public class TN_RPT_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";

    /**
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */


	//통일나눔_영수증 발급대장 모금부서 콤보리스트
	public void tn_report_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN"); //DAO 사용안함.

		TN_RPT_1010_MDataSet ds = null;
		TN_RPT_1010_MDM dm = new TN_RPT_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.

		dm.print();

		ds = (TN_RPT_1010_MDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//통일나눔_영수증 발급대장_조회
	public void tn_rpt_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1020_LDataSet ds = null;
		TN_RPT_1020_LDM dm = new TN_RPT_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);     //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //월별조회기간
		dm.start_fr_dt = Util.checkString(req.getParameter("start_fr_dt"));    //시작일자
		dm.end_to_dt = Util.checkString(req.getParameter("end_to_dt"));     //종료일자
		dm.deptidx = Util.checkString(req.getParameter("deptidx_cd"));        //모금부서코드
		dm.type_gb = Util.checkString(req.getParameter("type_gb")); 			//선택구분

		dm.print();

		ds = (TN_RPT_1020_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//통일나눔_통장내역조회_조회
	public void tn_rpt_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1050_LDataSet ds = null;
		TN_RPT_1050_LDM dm = new TN_RPT_1050_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //조회기간

		dm.print();

		ds = (TN_RPT_1050_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
//	통일나눔_데이터감사_조회
	public void tn_rpt_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1500_LDataSet ds = null;
		TN_RPT_1500_LDM dm = new TN_RPT_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //조회기간

		dm.print();

		ds = (TN_RPT_1500_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
//	통일나눔_데이터감사 상세(회원)_조회
	public void tn_rpt_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1510_LDataSet ds = null;
		TN_RPT_1510_LDM dm = new TN_RPT_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));   //회원인덱스
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.code = Util.checkString(req.getParameter("code"));

		dm.print();
		ds = (TN_RPT_1510_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	통일나눔_데이터감사 상세(약정)_조회
	public void tn_rpt_1520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1520_LDataSet ds = null;
		TN_RPT_1520_LDM dm = new TN_RPT_1520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));   //회원인덱스
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));   //약정인덱스
		dm.seq = Util.checkString(req.getParameter("seq"));   //순서
		dm.code = Util.checkString(req.getParameter("code"));   
		
		dm.print();
		ds = (TN_RPT_1520_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	통일나눔_약정명단_조회
	public void tn_rpt_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1600_LDataSet ds = null; 
		TN_RPT_1600_LDM dm = new TN_RPT_1600_LDM();
		dm.srch_startdate = Util.checkString(req.getParameter("srch_startdate"));
		dm.srch_enddate = Util.checkString(req.getParameter("srch_enddate"));
		dm.srch_proofstatus = Util.checkString(req.getParameter("srch_proofstatus"));
		dm.srch_defaultmonth = Util.checkString(req.getParameter("srch_defaultmonth"));
		
		dm.print();
		ds = (TN_RPT_1600_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	통일나눔_납입명단_조회
	public void tn_rpt_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {		
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1800_LDataSet ds = null; 
		TN_RPT_1800_LDM dm = new TN_RPT_1800_LDM();
		dm.srch_startdate = Util.checkString(req.getParameter("srch_startdate"));
		dm.srch_enddate = Util.checkString(req.getParameter("srch_enddate"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.print();
		ds = (TN_RPT_1800_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
	//통일나눔_약정납입현황_조회
	public void tn_rpt_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		
		TN_RPT_1400_LDataSet ds = null;
		TN_RPT_1400_LDM dm = new TN_RPT_1400_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //조회기간

		dm.print();

		ds = (TN_RPT_1400_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	//통일나눔_계좌번호관리_조회
	public void tn_rpt_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1101_LDataSet ds = null;
		TN_RPT_1101_LDM dm = new TN_RPT_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (TN_RPT_1101_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//통일나눔_계좌번호관리_저장
	public void tn_rpt_1102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1102_ADataSet ds = null;
		TN_RPT_1102_ADM dm = new TN_RPT_1102_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase(); //모드
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //회사코드
		
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.bank_gb = (String)hash.get("bank_gb");
		dm.bank_nm = (String)hash.get("bank_nm");
		dm.bank_acct_no = (String)hash.get("bank_acct_no");
		dm.use_yn = (String)hash.get("use_yn");
		dm.remk = (String)hash.get("remk");
			
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP 주소
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //입력자
        dm.print();

		ds = (TN_RPT_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//통일나눔_정기예금조회_조회
	public void tn_rpt_1131_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1131_LDataSet ds = null;
		TN_RPT_1131_LDM dm = new TN_RPT_1131_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //조회기간

		dm.print();

		ds = (TN_RPT_1131_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	public void tn_rpt_1141_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		
		TN_RPT_1141_LDataSet ds = null;
		TN_RPT_1141_LDM dm = new TN_RPT_1141_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (TN_RPT_1141_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);

	}

	public void tn_rpt_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");		
		
		TN_RPT_1301_LDataSet ds = null;
		TN_RPT_1301_LDM dm = new TN_RPT_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));

		dm.print();


		ds = (TN_RPT_1301_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);


		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_dt = (String)hash.get("clos_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		*******************************************************************************************/
	}	
	

	public void tn_rpt_1302_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");		

		TN_RPT_1302_IDataSet ds = null;
		TN_RPT_1302_IDM dm = new TN_RPT_1302_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //회사코드 사용은 하지 않지만 추후 사용을 위해 관리하기로함.
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.to_off = Util.checkString(req.getParameter("to_off"));
		dm.to_on = Util.checkString(req.getParameter("to_on"));
		dm.off_remk = Util.checkString(req.getParameter("off_remk"));
		dm.on_remk = Util.checkString(req.getParameter("on_remk"));
		dm.to_off_yet = Util.checkString(req.getParameter("to_off_yet"));
		dm.to_on_yet = Util.checkString(req.getParameter("to_on_yet"));
		dm.off_yet_remk = Util.checkString(req.getParameter("off_yet_remk"));
		dm.on_yet_remk = Util.checkString(req.getParameter("on_yet_remk"));

		dm.print();

		ds = (TN_RPT_1302_IDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}	
	
	public void tn_rpt_1700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");	
		TN_RPT_1700_MDataSet ds = null;
		TN_RPT_1700_MDM dm = new TN_RPT_1700_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();
		
		ds = (TN_RPT_1700_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	
	}	
	public void tn_rpt_1701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");	
		TN_RPT_1701_LDataSet ds = null;
		TN_RPT_1701_LDM dm = new TN_RPT_1701_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.fundidx = Util.checkString(req.getParameter("fundidx"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));

		dm.print();
		
		ds = (TN_RPT_1701_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	
	}
	
}
