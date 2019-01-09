/***************************************************************************************************
* 파일명 : SE_BOI_3000WB.java _모바일 개선사항
* 기능 :
 * 작성일자 : 2017-06-30
 * 작성자 :  민기홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.boi.dao.SE_BOI_3000DAO;
import chosun.ciis.se.boi.dm.SE_BOI_3000_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_3000_ADataSet;
import chosun.ciis.se.boi.dm.SE_BOI_3010_LDM;
import chosun.ciis.se.boi.ds.SE_BOI_3010_LDataSet;
import chosun.ciis.se.boi.dm.SE_BOI_3020_SDM;
import chosun.ciis.se.boi.ds.SE_BOI_3020_SDataSet;
import chosun.ciis.se.boi.dm.SE_BOI_3030_UDM;
import chosun.ciis.se.boi.ds.SE_BOI_3030_UDataSet;
import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;

public class SE_BOI_3000WB  extends BaseWB  {
	
    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_3000_a(HttpServletRequest req, HttpServletResponse res) throws AppException{

		SE_BOI_3000_ADM dm = new SE_BOI_3000_ADM();
		SE_BOI_3000_ADataSet ds = null;
	    
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
        
        try{
        	SE_BOI_3000DAO dao = new SE_BOI_3000DAO();
	        req.setAttribute("ds", dao.se_boi_3000_a(dm));
	    }catch (AppException e) {
	        LogManager.getInstance().log(e);
	        throw e;
	    }
	}
	
    /**
     * 리스트 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_3010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		SE_BOI_3010_LDM dm = new SE_BOI_3010_LDM();
		SE_BOI_3010_LDataSet ds = null;
		
		dm.setDeptcd(Util.checkString(req.getParameter("deptcd")));
		dm.setPartcd(Util.checkString(req.getParameter("partcd")));
		dm.setAreacd(Util.checkString(req.getParameter("partcd")));
		dm.setBocd(Util.checkString(req.getParameter("bocd")));
		dm.setChkyn(Util.checkString(req.getParameter("chkyn")));
		dm.setFrdt(Util.checkString(req.getParameter("frdt")));
		dm.setTodt(Util.checkString(req.getParameter("todt")));
		
        try{
        	SE_BOI_3000DAO dao = new SE_BOI_3000DAO();
	        req.setAttribute("ds", ds = dao.se_boi_3010_l(dm));
	    }catch (AppException e) {
	        LogManager.getInstance().log(e);
	        throw e;
	    }
	}

    /**
     * 상세 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_3020_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_3020_SDM dm = new SE_BOI_3020_SDM();
		SE_BOI_3020_SDataSet ds = null;
		
		dm.setSeq(Util.checkString(req.getParameter("seq")));
		
        try{
        	SE_BOI_3000DAO dao = new SE_BOI_3000DAO();
	        req.setAttribute("ds", ds = dao.se_boi_3020_s(dm));
	    }catch (AppException e) {
	        LogManager.getInstance().log(e);
	        throw e;
	    }
	}

    /**
     * 수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_3030_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_3030_UDM dm = new SE_BOI_3030_UDM();
		SE_BOI_3030_UDataSet ds = null;
		
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setRmk(Util.checkString(req.getParameter("rmk")));
		dm.setSeq(Util.checkString(req.getParameter("seq")));
		
		try{
        	SE_BOI_3000DAO dao = new SE_BOI_3000DAO();
	        if(dao.se_boi_3030_u(dm) == null)
	        	req.setAttribute("result", "success");
	        else
	        	req.setAttribute("result", "fail");
	    }catch (AppException e) {
	        LogManager.getInstance().log(e);
	        throw e;
	    }
	}
}