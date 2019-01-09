/***************************************************************************************************
* 파일명 : SE_SAL_12300WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 출장전자료조회_모바일용
* 작성일자 : 2017-03-01
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dm.SE_MO_RCP_2510_LDM;
import chosun.ciis.se.sal.dm.SE_MO_SAL_2320_LDM;
import chosun.ciis.se.sal.ds.SE_MO_RCP_2510_LDataSet;
import chosun.ciis.se.sal.ds.SE_MO_SAL_2320_LDataSet;
import chosun.ciis.se.rcp.dm.SE_RCP_1010_LDM;
import chosun.ciis.se.rcp.ds.SE_RCP_1010_LDataSet;

/**
 *
 */

public class SE_SAL_12300WB extends BaseWB{

    /**
     * 매출관리-출장전자료조회-조회리스트 / 모바일) 지대마감-지대청구
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_12320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	DBManager manager = new DBManager("MISSEL");

        // DM Setting
    	SE_MO_SAL_2320_LDM dm 		= new SE_MO_SAL_2320_LDM();

        String cmpy_cd= Util.checkString(req.getParameter("cmpy_cd"));
        String incmg_pers= Util.checkString(req.getParameter("incmg_pers"));
        String yymm= Util.checkString(req.getParameter("yymm"));
        String deptcd= Util.checkString(req.getParameter("deptcd"));
        String partcd= Util.checkString(req.getParameter("partcd"));
        String areacd= Util.checkString(req.getParameter("areacd"));

        dm.setCmpy_cd(cmpy_cd	);
        dm.setIncmg_pers(incmg_pers);
        dm.setYymm(yymm);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setPartcd(partcd);
        dm.print();

        SE_MO_SAL_2320_LDataSet ds = (SE_MO_SAL_2320_LDataSet) manager.executeCall(dm);

        req.setAttribute("ds", ds);

    }

    /**
     * 입금관리-지대입금관리-지대입금률현황 / 모바일) 지대마감-지대입금률현황  20170524 장선희추가
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_mo_rcp_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	DBManager manager = new DBManager("MISSEL");

    	// DM Setting
    	SE_MO_RCP_2510_LDM dm 		= new SE_MO_RCP_2510_LDM();

    	String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
    	String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
    	String team_cd = Util.checkString(req.getParameter("team_cd"));
    	String part_cd = Util.checkString(req.getParameter("part_cd"));
    	String area_cd = Util.checkString(req.getParameter("area_cd"));
    	String yymm = Util.checkString(req.getParameter("yymm"));
    	String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setTeam_cd(team_cd);
    	dm.setPart_cd(part_cd);
    	dm.setArea_cd(area_cd);
    	dm.setYymm(yymm);
    	dm.setRcpm_dt(rcpm_dt);

    	dm.print();

    	SE_MO_RCP_2510_LDataSet ds = (SE_MO_RCP_2510_LDataSet) manager.executeCall(dm);

    	req.setAttribute("ds", ds);

    }

    /**
     * 입금관리-지대입금관리-입금확인(가상계좌) / 모바일) 지대마감-입금확인(가상계좌)  20170530 장선희추가
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_rcp_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	DBManager manager = new DBManager("MISSEL");

    	// DM Setting
    	SE_RCP_1010_LDM dm 		= new SE_RCP_1010_LDM();

    	String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
    	String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
    	String team_cd = Util.checkString(req.getParameter("team_cd"));
    	String part_cd = Util.checkString(req.getParameter("part_cd"));
    	String area_cd = Util.checkString(req.getParameter("area_cd"));
    	String rcpm_dt1 =Util.checkString(req.getParameter("rcpm_dt1"));
    	String rcpm_dt2 =Util.checkString(req.getParameter("rcpm_dt2"));
    	String bo_nm = Util.checkString(req.getParameter("bo_nm"));
    	String acct_no = Util.checkString(req.getParameter("acct_no"));
    	String rcpm_pers = Util.checkString(req.getParameter("rcpm_pers"));
    	String cnfm_yn = Util.checkString(req.getParameter("cnfm_yn"));

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setTeam_cd(team_cd);
    	dm.setPart_cd(part_cd);
    	dm.setArea_cd(area_cd);
    	dm.setRcpm_dt1(rcpm_dt1);
    	dm.setRcpm_dt2(rcpm_dt2);
    	dm.setBo_nm(bo_nm);
    	dm.setAcct_no(acct_no);
    	dm.setRcpm_pers(rcpm_pers);
    	dm.setCnfm_yn(cnfm_yn);

    	dm.print();

    	SE_RCP_1010_LDataSet ds = (SE_RCP_1010_LDataSet) manager.executeCall(dm);

    	req.setAttribute("ds", ds);

    }
}
