package chosun.ciis.mt.etcbook.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

public class MT_ETCBOOK_2000WB extends BaseWB {
	// 도서코드 화면설정정보 조회 
	public void mt_etcbook_2001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_2001_MDataSet ds = null;
		
		MT_ETCBOOK_2001_MDM dm = new MT_ETCBOOK_2001_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCBOOK_2001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 도서코드내역 조회
	public void mt_etcbook_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_2000_LDataSet ds = null;
		
		MT_ETCBOOK_2000_LDM dm = new MT_ETCBOOK_2000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.book_cd = Util.checkString(req.getParameter("book_cd"));
		dm.book_kind = Util.checkString(req.getParameter("book_kind"));
		dm.book_seq = Util.checkString(req.getParameter("book_seq"));
		dm.book_nm = Util.checkString(req.getParameter("book_nm"));
		dm.print();

		ds = (MT_ETCBOOK_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	// 도서코드내역 등록/수정/삭제
	public void mt_etcbook_2002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCBOOK_2002_ADataSet ds = null;
		
		MT_ETCBOOK_2002_ADM dm = new MT_ETCBOOK_2002_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String gubun = Util.checkString(req.getParameter("gubun"));

		if("i".equalsIgnoreCase(gubun)){	
			dm.book_cd = Util.checkString(req.getParameter("book_cd_1"))+Util.checkString(req.getParameter("book_cd_2"));
		}else if("u".equalsIgnoreCase(gubun) ||"d".equalsIgnoreCase(gubun)){
			dm.book_cd = Util.checkString(req.getParameter("book_cd_1"))+Util.checkString(req.getParameter("book_cd_2"))+Util.checkString(req.getParameter("book_cd_3"));
		}
		dm.book_nm = Util.checkString(req.getParameter("book_nm"));
		dm.liv_clsi_clsf = Util.checkString(req.getParameter("liv_clsi_clsf"));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.print();

		ds = (MT_ETCBOOK_2002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
}
