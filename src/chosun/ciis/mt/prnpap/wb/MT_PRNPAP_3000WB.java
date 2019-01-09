/***************************************************************************************************
* 파일명 : MT_PRNPAP_3000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-27
* 작성자 : 문미라
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.prnpap.wb;

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
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

public class MT_PRNPAP_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    // 용지일일재고및파지확인 팝업 조회
    public void mt_prnpap_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3000_LDataSet ds = null;

		MT_PRNPAP_3000_LDM dm = new MT_PRNPAP_3000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PRNPAP_3000_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //  용지일일재고및파지확인  조회
    public void mt_prnpap_3001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3001_LDataSet ds = null;

		MT_PRNPAP_3001_LDM dm = new MT_PRNPAP_3001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3001_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고 등록/수정
    public void mt_prnpap_3002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3002_ADataSet ds = null;
		MT_PRNPAP_3002_ADM dm = new MT_PRNPAP_3002_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("mulitUpdata"));
		dm.cmpy_cd 				=  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr 	=  Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 			=  Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf          	=  Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt           	=  Util.checkString(req.getParameter("issu_dt"));

		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);

   	    dm.gubun                = (String)hash.get("gubun");
   	    dm.occr_dt              = (String)hash.get("occr_dt");
	    dm.seq                  = (String)hash.get("seq");
	    dm.matr_cd              = (String)hash.get("matr_cd");
   	    dm.ewh_roll_cnt         = (String)hash.get("ewh_roll_cnt");
   	    dm.ewh_wgt              = (String)hash.get("ewh_wgt");
	    dm.wht_pj_retngod_wgt   = (String)hash.get("wht_pj_retngod_wgt");
	   	dm.print();

	   	ds = (MT_PRNPAP_3002_ADataSet)manager.executeCall(dm);

	   	if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고 금일입고 롤당 중량 구하기
    public void mt_prnpap_3003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3003_MDataSet ds = null;

		MT_PRNPAP_3003_MDM dm = new MT_PRNPAP_3003_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.roll = Util.checkString(req.getParameter("roll"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_PRNPAP_3003_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고 공장구분
    public void mt_prnpap_3004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3004_LDataSet ds = null;
		MT_PRNPAP_3004_LDM dm = new MT_PRNPAP_3004_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.print();

		ds = (MT_PRNPAP_3004_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //  용지일일재고및파지확인 팝업 조회
    public void mt_prnpap_3006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3006_LDataSet ds = null;

		MT_PRNPAP_3006_LDM dm = new MT_PRNPAP_3006_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PRNPAP_3006_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //  분공장 마감 처리
    public void mt_prnpap_3007_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3007_UDataSet ds = null;

		MT_PRNPAP_3007_UDM dm = new MT_PRNPAP_3007_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pers_ipaddr  = Util.checkString(req.getRemoteAddr());
		dm.pers_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PRNPAP_3007_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //  분공장 마감 취소 처리
    public void mt_prnpap_3008_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3008_UDataSet ds = null;

		MT_PRNPAP_3008_UDM dm = new MT_PRNPAP_3008_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pers_ipaddr  = Util.checkString(req.getRemoteAddr());
		dm.pers_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PRNPAP_3008_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고 지고재고 조회
    public void mt_prnpap_3009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3009_LDataSet ds = null;

		MT_PRNPAP_3009_LDM dm = new MT_PRNPAP_3009_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.print();

		ds = (MT_PRNPAP_3009_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //	지고정보 수정
    public void mt_prnpap_3011_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3011_UDataSet ds = null;

		MT_PRNPAP_3011_UDM dm = new MT_PRNPAP_3011_UDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		//dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_PRNPAP_3011_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고지고 조회
    public void mt_prnpap_3100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3100_LDataSet ds = null;

		MT_PRNPAP_3100_LDM dm = new MT_PRNPAP_3100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3100_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고지고 등록/수정/삭제
    public void mt_prnpap_3101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3101_ADataSet ds = null;

		MT_PRNPAP_3101_ADM dm = new MT_PRNPAP_3101_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		String gubun		= converted[0]; // 구분
		String matr_cd		= converted[4]; // 자재코드
		String roll_cnt		= converted[5]; // 롤수
		String wgt			= converted[6]; // 지고중량
		String occr_dt		= converted[9]; // 발생일자
		String seq			= converted[10]; // 일련번호

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf   = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt    = Util.checkString(req.getParameter("issu_dt"));

		dm.occr_dt = occr_dt;
		dm.seq = seq;
		dm.matr_cd = matr_cd;
		dm.roll_cnt = roll_cnt;
		dm.wgt = wgt;
		dm.gubun = gubun;
		dm.print();

		ds = (MT_PRNPAP_3101_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고지고 조회
    public void mt_prnpap_3102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3102_LDataSet ds = null;

		MT_PRNPAP_3102_LDM dm = new MT_PRNPAP_3102_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_3102_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고지고 조회
    public void mt_prnpap_3103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3103_LDataSet ds = null;

		MT_PRNPAP_3103_LDM dm = new MT_PRNPAP_3103_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	    dm.paper_cmpy = Util.checkString(req.getParameter("paper_cmpy"));
	    dm.print();

	    ds = (MT_PRNPAP_3103_LDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 일일재고지고 조회
    public void mt_prnpap_3104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3104_LDataSet ds = null;

		MT_PRNPAP_3104_LDM dm = new MT_PRNPAP_3104_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.paper_cmpy = Util.checkString(req.getParameter("paper_cmpy"));
		dm.paper_clsf_cd = Util.checkString(req.getParameter("paper_clsf_cd"));
		dm.print();

		ds = (MT_PRNPAP_3104_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    
    public void mt_prnpap_3105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3105_LDataSet ds = null;
      
    	MT_PRNPAP_3105_LDM dm = new MT_PRNPAP_3105_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
    	dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	dm.print();
      
    	ds = (MT_PRNPAP_3105_LDataSet)manager.executeCall(dm);
    	if (!"".equals(ds.errcode))
    	{
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	req.setAttribute("ds", ds);
    }
    
    // 용지일일재고중잔지 조회
    public void mt_prnpap_3200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3200_LDataSet ds = null;

		MT_PRNPAP_3200_LDM dm = new MT_PRNPAP_3200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3200_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 용지일일재고중잔지 등록/수정/삭제
    public void mt_prnpap_3201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3201_ADataSet ds = null;

		MT_PRNPAP_3201_ADM dm = new MT_PRNPAP_3201_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		//for (int i=0; i<converted.length; i++){
		//	System.out.println("converted[" + i + "]=" + converted[i] );
		//}
		String gubun		    = converted[0]; 		// 구분
		String papcmpy_cd	    = converted[2]; 		// 제지사
		String paper_loca_clsf  = converted[3]; 		// 용지위치구분
		String a_qunt_cnt       = converted[4]; 		// a_잔량수
		String a_qunt_wgt       = converted[5]; 		// a_잔량중량
		String a_un_use_roll    = converted[6]; 		// a_미사용롤수
		String c_qunt_cnt       = converted[8]; 		// b_잔량수
		String c_qunt_wgt       = converted[9]; 		// b_잔량중량
		String c_un_use_roll    = converted[10]; 		// b_미사용롤수
		String b_qunt_cnt       = converted[12]; 		// c_잔량수
		String b_qunt_wgt       = converted[13]; 		// c_잔량중량
		String b_un_use_roll    = converted[14]; 		// c_미사용롤수
		String occr_dt          = converted[16]; 		// 발생일자
		String seq		        = converted[17]; 		// 일련번호

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.gubun = gubun;
		dm.occr_dt = occr_dt;
		dm.seq = seq;

		dm.paper_loca_clsf = paper_loca_clsf;
		dm.papcmpy_cd = papcmpy_cd;
		dm.a_rem_qunt_cnt = a_qunt_cnt;
		dm.a_rem_qunt_wgt = a_qunt_wgt;
		dm.a_un_use_roll_cnt = a_un_use_roll;
		dm.b_rem_qunt_cnt = b_qunt_cnt;
		dm.b_rem_qunt_wgt = b_qunt_wgt;
		dm.b_un_use_roll_cnt = b_un_use_roll;
		dm.c_rem_qunt_cnt = c_qunt_cnt;
		dm.c_rem_qunt_wgt = c_qunt_wgt;
		dm.c_un_use_roll_cnt = c_un_use_roll;
		dm.print();

		ds = (MT_PRNPAP_3201_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 잔량산출기준 조회
    public void mt_prnpap_3202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3202_MDataSet ds = null;

		MT_PRNPAP_3202_MDM dm = new MT_PRNPAP_3202_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.rem_length = Util.checkString(req.getParameter("rem_length"));
		dm.print();

		ds = (MT_PRNPAP_3202_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3203_LDataSet ds = null;

		MT_PRNPAP_3203_LDM dm = new MT_PRNPAP_3203_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	    dm.paper_cmpy = Util.checkString(req.getParameter("paper_cmpy"));
	    dm.print();

	    ds = (MT_PRNPAP_3203_LDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3204_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3204_LDataSet ds = null;
      
    	MT_PRNPAP_3204_LDM dm = new MT_PRNPAP_3204_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
    	dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	dm.print();
      
    	ds = (MT_PRNPAP_3204_LDataSet)manager.executeCall(dm);
    	if (!"".equals(ds.errcode))
    	{
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	req.setAttribute("ds", ds);
    }
    
    // 용지일일재고윤전기 조회
    public void mt_prnpap_3300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3300_LDataSet ds = null;

		MT_PRNPAP_3300_LDM dm = new MT_PRNPAP_3300_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3300_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 용지일일재고윤전기 등록/수정/삭제
    public void mt_prnpap_3301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3301_ADataSet ds = null;

		MT_PRNPAP_3301_ADM dm = new MT_PRNPAP_3301_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		for (int i=0; i<converted.length; i++){
			System.out.println("converted[" + i + "]=" + converted[i] );
		}
		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.gubun               =  ((String)hash.get("m")).toUpperCase();
		dm.occr_dt             =  (String)hash.get("occr_dt");
		dm.seq                 =  (String)hash.get("seq");
		dm.sub_seq             =  (String)hash.get("sub_seq");
		dm.papcmpy_cd          =  (String)hash.get("papcmpy_cd");
		dm.rot_mach_no         =  (String)hash.get("rot_mach_no");
		dm.sett_seq            =  (String)hash.get("sett_seq");
		dm.a_cmcnt_val         =  (String)hash.get("a_cmcnt_val");
		dm.a_wgt               =  (String)hash.get("a_wgt");
		dm.a_un_use_yn         =  (String)hash.get("a_un_use_yn");
		dm.b_cmcnt_val         =  (String)hash.get("b_cmcnt_val");
		dm.b_wgt               =  (String)hash.get("b_wgt");
		dm.b_un_use_yn         =  (String)hash.get("b_un_use_yn");
		dm.c_cmcnt_val         =  (String)hash.get("c_cmcnt_val");
		dm.c_wgt               =  (String)hash.get("c_wgt");
		dm.c_un_use_yn         =  (String)hash.get("c_un_use_yn");
		dm.print();

		ds = (MT_PRNPAP_3301_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}



    // 용지일일재고윤전기 호기 콤보 조회
    public void mt_prnpap_3303_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3303_MDataSet ds = null;

		MT_PRNPAP_3303_MDM dm = new MT_PRNPAP_3303_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_3303_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3304_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3304_LDataSet ds = null;
       
    	MT_PRNPAP_3304_LDM dm = new MT_PRNPAP_3304_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
    	dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	dm.print();
      
    	ds = (MT_PRNPAP_3304_LDataSet)manager.executeCall(dm);
    	if (!"".equals(ds.errcode))
    	{
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	req.setAttribute("ds", ds);
    }
    
    // 선인쇄 사용량 조회
    public void mt_prnpap_3400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3400_LDataSet ds = null;

		MT_PRNPAP_3400_LDM dm = new MT_PRNPAP_3400_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3400_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 선인쇄 사용량 등록/수정/삭제
    public void mt_prnpap_3401_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3401_ADataSet ds = null;

		MT_PRNPAP_3401_ADM dm = new MT_PRNPAP_3401_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String multiUpdateDataSub = Util.checkString(req.getParameter("muliUpdataSub"));
		dm.cmpy_cd           = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers        = Util.getSessionParameterValue(req,"emp_no",true);
		dm.fac_clsf          = Util.checkString(req.getParameter("fac_clsf"));

		Hashtable hash  = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateDataSub);

   	    dm.gubun       = (String)hash.get("m");
   	    dm.occr_dt     = (String)hash.get("occr_dt");
	    dm.seq         = (String)hash.get("seq");
	    dm.issu_dt     = (String)hash.get("issu_dt");
	    dm.prt_dt      = (String)hash.get("prt_dt");
	    dm.medi_cd     = (String)hash.get("medi_cd");
	    dm.sect_cd     = (String)hash.get("sect_cd");
	    dm.issu_pcnt   = (String)hash.get("issu_pcnt");
	    dm.issu_qty    = (String)hash.get("issu_qty");
	    dm.matr_cd     = (String)hash.get("matr_cd");
	    dm.pj_qunt     = (String)hash.get("pj_qunt");
	    dm.cnsm_qunt   = (String)hash.get("cnsm_qunt");

		dm.sub_gubun  =  (String)hash2.get("gubun");
		dm.sub_seq    =  (String)hash2.get("sub_seq");
		dm.pj_kind    =  (String)hash2.get("pj_kind");
		dm.rem_qunt   =  (String)hash2.get("rem_qunt");
		dm.cnt        =  (String)hash2.get("cnt");
		dm.wgt        =  (String)hash2.get("wgt");
		dm.print();

		ds = (MT_PRNPAP_3401_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 선인쇄사용량 섹션 콤보 가져오기
    public void mt_prnpap_3402_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3402_MDataSet ds = null;

		MT_PRNPAP_3402_MDM dm = new MT_PRNPAP_3402_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_3402_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 선인쇄 파지량 조회
    public void mt_prnpap_3403_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3403_LDataSet ds = null;

		MT_PRNPAP_3403_LDM dm = new MT_PRNPAP_3403_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.print();

		ds = (MT_PRNPAP_3403_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 선인쇄 파지량  등록/수정
    public void mt_prnpap_3404_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3404_ADataSet ds = null;

		MT_PRNPAP_3404_ADM dm = new MT_PRNPAP_3404_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		String gubun                = converted[0];   	// 구분
		String pj_kind				= converted[8];   	// 파지종류
		String seq   				= converted[10];    // 일련번호
		String occr_dt				= converted[9];    // 발생일자
		String rem_qunt				= converted[3];     // 잔량
		String cnt					= converted[4];     // 개수
		String wgt					= converted[5];     // 중량

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr 	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 			= Util.getSessionParameterValue(req,"emp_no",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.sect_cd = Util.checkString(req.getParameter("sect_cd"));
		dm.gubun = gubun;
		dm.pj_kind = pj_kind;
		dm.seq = seq;
		dm.occr_dt = occr_dt;
		dm.rem_qunt = rem_qunt;
		dm.cnt = cnt;
		dm.wgt = wgt;
		dm.print();

		ds = (MT_PRNPAP_3404_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //	 파지량 입력 여부 조회
    public void mt_prnpap_3405_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3405_LDataSet ds = null;

		MT_PRNPAP_3405_LDM dm = new MT_PRNPAP_3405_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3405_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //	 선인쇄 파지량 데이터  조회
    public void mt_prnpap_3406_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3406_LDataSet ds = null;

		MT_PRNPAP_3406_LDM dm = new MT_PRNPAP_3406_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.a_sum_wgt = Util.checkString(req.getParameter("a_sum_wgt"));
		dm.b_sum_wgt = Util.checkString(req.getParameter("b_sum_wgt"));
		dm.c_sum_wgt = Util.checkString(req.getParameter("c_sum_wgt"));
		dm.pap_cmpy = Util.checkString(req.getParameter("pap_cmpy"));
		dm.print();

		ds = (MT_PRNPAP_3406_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    //	 선인쇄 파지량 데이터  조회
    public void mt_prnpap_3407_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3407_LDataSet ds = null;

		MT_PRNPAP_3407_LDM dm = new MT_PRNPAP_3407_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3407_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3409_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3409_IDataSet ds = null;

		MT_PRNPAP_3409_IDM dm = new MT_PRNPAP_3409_IDM();
		dm.cmpy_cd     = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf    = Util.checkString(req.getParameter("fac_clsf"));
		dm.issu_dt     = Util.checkString(req.getParameter("issu_dt"));
		dm.wgt_clsf    = Util.checkString(req.getParameter("wgt_clsf"));
		dm.pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.pers_id     = Util.getSessionParameterValue(req,"emp_no",true);

		String multiUpData1 = Util.checkString(req.getParameter("multiUpData1"));
		String multiUpData2 = Util.checkString(req.getParameter("multiUpData2"));

		Hashtable hash1 = getHashMultiUpdateData(multiUpData1);
		dm.blk_cmpy_cd_ar  = (String)hash1.get("cmpy_cd");
		dm.blk_occr_dt_ar  = (String)hash1.get("occr_dt");
		dm.blk_seq_ar      = (String)hash1.get("seq");
		dm.bw_pj_wgt_ar    = (String)hash1.get("bw_pj_wgt");

		Hashtable hash2 = getHashMultiUpdateData(multiUpData2);

	    dm.issu_dt_ar          =  (String)hash2.get("issu_dt");
	    dm.prt_dt_ar           =  (String)hash2.get("prt_dt");
	    dm.medi_cd_ar          =  (String)hash2.get("medi_cd");
	    dm.sect_cd_ar          =  (String)hash2.get("sect_cd");
	    dm.pre_prt_clsf_ar     =  (String)hash2.get("pre_prt_clsf");
		dm.hdqt_paper_clsf_ar  =  (String)hash2.get("hdqt_paper_clsf");
		dm.pj_kind_ar          =  (String)hash2.get("pj_kind");
		dm.cnt_ar              =  (String)hash2.get("cnt");
		dm.wgt_ar              =  (String)hash2.get("wgt");

		dm.print();

		ds = (MT_PRNPAP_3409_IDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3410_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3410_DDataSet ds = null;

		MT_PRNPAP_3410_DDM dm = new MT_PRNPAP_3410_DDM();
		dm.cmpy_cd     = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt     = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf    = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();

	    ds = (MT_PRNPAP_3410_DDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3411_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3411_LDataSet ds = null;

		MT_PRNPAP_3411_LDM dm = new MT_PRNPAP_3411_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.cd5_totwgt = Util.checkString(req.getParameter("wgt"));
		dm.print();

		ds = (MT_PRNPAP_3411_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    public void mt_prnpap_3412_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3412_LDataSet ds = null;

		MT_PRNPAP_3412_LDM dm = new MT_PRNPAP_3412_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3412_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3414_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3414_IDataSet ds = null;

		MT_PRNPAP_3414_IDM dm = new MT_PRNPAP_3414_IDM();
		dm.cmpy_cd     = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fac_clsf    = Util.checkString(req.getParameter("fac_clsf"));
		dm.pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.pers_id     = Util.getSessionParameterValue(req,"emp_no",true);

		String multiUpData1    = Util.checkString(req.getParameter("multiUpData"));

//System.out.println(multiUpData1);
 		Hashtable hash  = getHashMultiUpdateData(multiUpData1);

 		dm.medi_cd          =  (String)hash.get("medi_cd");
 		dm.sect_cd          =  (String)hash.get("sect_cd");
 		dm.issu_dt          =  (String)hash.get("issu_dt");
 		dm.prt_dt           =  (String)hash.get("prt_dt");
 		dm.pre_prt_clsf     =  (String)hash.get("pre_prt_clsf");
   	    dm.hdqt_paper_clsf  =  (String)hash.get("hdqt_paper_clsf");
		dm.pj_kind          =  (String)hash.get("pj_kind");
		dm.cnt              =  (String)hash.get("cnt");
		dm.wgt              =  (String)hash.get("wgt");
		dm.print();

		ds = (MT_PRNPAP_3414_IDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3415_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3415_DDataSet ds = null;

		MT_PRNPAP_3415_DDM dm = new MT_PRNPAP_3415_DDM();
		dm.cmpy_cd     = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt     = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf    = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3415_DDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3416_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3416_LDataSet ds = null;

		MT_PRNPAP_3416_LDM dm = new MT_PRNPAP_3416_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3416_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    public void mt_prnpap_3417_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3417_UDataSet ds = null;

		MT_PRNPAP_3417_UDM dm = new MT_PRNPAP_3417_UDM();
		dm.pers_id     = Util.getSessionParameterValue(req,"emp_no",true);

		String multiUpData1    = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash  = getHashMultiUpdateData(multiUpData1);

		dm.cmpy_cd_ar     = (String)hash.get("cmpy_cd");
   	    dm.occr_dt_ar     = (String)hash.get("occr_dt");
	    dm.seq_ar         = (String)hash.get("seq");
	    dm.bw_pj_wgt     = (String)hash.get("bw_pj_wgt");

		dm.print();

		ds = (MT_PRNPAP_3417_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    public void mt_prnpap_3418_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3418_LDataSet ds = null;

		MT_PRNPAP_3418_LDM dm = new MT_PRNPAP_3418_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3418_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    public void mt_prnpap_3419_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3419_LDataSet ds = null;

		MT_PRNPAP_3419_LDM dm = new MT_PRNPAP_3419_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
	    dm.prt_dt = Util.checkString(req.getParameter("prt_dt"));
	    dm.pj_kind = Util.checkString(req.getParameter("pj_kind"));
		dm.print();

		ds = (MT_PRNPAP_3419_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
   
    public void mt_prnpap_3420_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3420_UDataSet ds = null;

    	MT_PRNPAP_3420_UDM dm = new MT_PRNPAP_3420_UDM();
    	dm.pers_id = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
      
    	String multiUpData = Util.checkString(req.getParameter("multiUpdata"));
    	Hashtable hash = getHashMultiUpdateData(multiUpData);
      
    	dm.occr_dt_ar = ((String)hash.get("occr_dt"));
    	dm.seq_ar = ((String)hash.get("seq"));
    	dm.cnt_ar = ((String)hash.get("cnt"));
    	dm.wgt_ar = ((String)hash.get("wgt"));
		dm.print();

		ds = (MT_PRNPAP_3420_UDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
    
    // 용지일일파지량 조회
    public void mt_prnpap_3500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3500_LDataSet ds = null;

		MT_PRNPAP_3500_LDM dm = new MT_PRNPAP_3500_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_PRNPAP_3500_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 용지일일파지량  등록/수정
    public void mt_prnpap_3501_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3501_ADataSet ds = null;

		MT_PRNPAP_3501_ADM dm = new MT_PRNPAP_3501_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);

		String gubun                = converted[0];   	// 구분
		String occr_dt				= converted[1];    // 발생일자
		String seq   				= converted[2];    // 일련번호
		String medi_cd				= converted[3];     // 매체코드
		String sect_cd				= converted[4];     // 섹션코드
		String pj_kind				= converted[5];   	// 파지종류
		String rem_qunt				= converted[6];     // 잔량
		String cnt					= converted[7];     // 개수
		String wgt					= converted[8];     // 중량

		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt 				= Util.checkString(req.getParameter("issu_dt"));
		dm.fac_clsf 			= Util.checkString(req.getParameter("fac_clsf"));
		dm.medi_cd 				= medi_cd;
		dm.sect_cd 				= sect_cd;
		dm.incmg_pers_ipaddr 	= Util.checkString(req.getRemoteAddr());
		dm.incmg_pers 			= Util.getSessionParameterValue(req,"emp_no",true);
		dm.occr_dt 				= occr_dt;
		dm.seq 					= seq;
		dm.pj_kind 				= pj_kind;
		dm.rem_qunt 			= rem_qunt;
		dm.cnt 					= cnt;
		dm.wgt 					= wgt;
		dm.gubun 				= gubun;
		dm.print();

		ds = (MT_PRNPAP_3501_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    // 용지일일파지량 섹션 콤보 조회
    public void mt_prnpap_3502_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3502_MDataSet ds = null;

		MT_PRNPAP_3502_MDM dm = new MT_PRNPAP_3502_MDM();
		dm.cmpy_cd 	= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_3502_MDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}

    public void mt_prnpap_3503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_PRNPAP_3503_LDataSet ds = null;

		MT_PRNPAP_3503_LDM dm = new MT_PRNPAP_3503_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_PRNPAP_3503_LDataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

		req.setAttribute("ds", ds);
	}
}
