package chosun.ciis.ss.sls.brmgr.wb;

import javax.ejb.*;
import java.util.*;
import java.lang.*;
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;

public class SSBrmgr2800WB
{
	public void ss_sls_brmgr_2850_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_SLS_BRMGR_2850_MDataSet ds = null;
		SS_SLS_BRMGR_2850_MDM dm = new SS_SLS_BRMGR_2850_MDM();

		dm.print();
		
        try {
        	SSBrmgr2800DAO dao = new SSBrmgr2800DAO();
            ds = dao.ss_sls_brmgr_2850_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	public void ss_sls_brmgr_2851_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_SLS_BRMGR_2851_LDataSet ds = null;
		SS_SLS_BRMGR_2851_LDM dm = new SS_SLS_BRMGR_2851_LDM();

		dm.deptcd = Util.checkString(req.getParameter("deptcd"));
		dm.partcd = Util.checkString(req.getParameter("partcd"));
		dm.areacd = Util.checkString(req.getParameter("areacd"));
		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.medicd = Util.checkString(req.getParameter("medicd"));
		dm.yymm = Util.checkString(req.getParameter("fr_yymm"));
		dm.abcclsf = Util.checkString(req.getParameter("abcclsf"));
		dm.refresh = Util.checkString(req.getParameter("refresh"));
		dm.print();

        try {
        	SSBrmgr2800DAO dao = new SSBrmgr2800DAO();
            ds = dao.ss_sls_brmgr_2851_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
	}
	
	public void ss_sls_brmgr_2852_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SS_SLS_BRMGR_2852_SDataSet ds = null;
		SS_SLS_BRMGR_2852_SDM dm = new SS_SLS_BRMGR_2852_SDM();

		dm.bocd = Util.checkString(req.getParameter("bocd"));
		dm.medicd = Util.checkString(req.getParameter("medicd"));
		dm.basiyymm = Util.checkString(req.getParameter("basiyymm"));
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tgtclsf = Util.checkString(req.getParameter("tgtclsf"));

		dm.print();

        try {
        	SSBrmgr2800DAO dao = new SSBrmgr2800DAO();
            ds = dao.ss_sls_brmgr_2852_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }        
	}
	
}