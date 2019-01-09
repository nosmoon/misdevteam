/***************************************************************************************************
* 파일명 : SE_SND_1200WB.java
* 기능 : 판매 - 발송관리 - 노선구분등록
* 작성일자 : 2009.01.20
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_1200DAO;
import chosun.ciis.se.snd.dm.SE_SND_1210_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1220_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1230_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1240_ADM;
import chosun.ciis.se.snd.ds.SE_SND_1210_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1220_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1230_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1240_ADataSet;
/**
 * 
 */

public class SE_SND_1200WB extends BaseWB{

    /**
     * 검색조건에 맞는 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1210_LDataSet ds = null;

        // DM Setting
        SE_SND_1210_LDM dm 		= new SE_SND_1210_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String job_clsf 		= "04";
        String cd_clsf 			= "A0";
        String cd				= Util.checkString(req.getParameter("cdText"));
        String cdnm 			= Util.checkString(req.getParameter("cdnmText"));
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setJob_clsf			(job_clsf	);
        dm.setCd_clsf			(cd_clsf	);
        dm.setCd				(cd			);
        dm.setCdnm				(cdnm		);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1200DAO dao = new SE_SND_1200DAO();
            ds = dao.se_snd_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd		=" + dm.getCmpy_cd		());
//        System.out.println("job_clsf	=" + dm.getJob_clsf		());
//        System.out.println("cd_clsf		=" + dm.getCd_clsf		());
//        System.out.println("cd			=" + dm.getCd			());
//        System.out.println("cdnm		=" + dm.getCdnm			());
//        System.out.println("incmg_pers	=" + dm.getIncmg_pers	());
//        
//        SE_SND_1200EJBHome home = (SE_SND_1200EJBHome) JNDIManager.getInstance().getHome("SE_SND_1200EJB");
//        
//        try {
//        	SE_SND_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1210_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
        
    /**
     *  노선구분등록, 수정, 삭제 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1220_ADataSet ds = null;
    	
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        
        String[] converted = convertMultiUpdateData(multiUpdateData);
        
        int idx = 0;
        String mode 			= converted[idx++];
        String rownum       	= converted[idx++];
        String cd				= converted[idx++];
        String cdnm				= converted[idx++];
        String use_yn			= converted[idx++];
        String mang_cd_1		= converted[idx++];
        String chg_dt_tm		= converted[idx++];
        String cd_key			= converted[idx++];
        
        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        
        String job_clsf         = "04";
        String cd_clsf			= "A0";
        
        //DM Setting
        SE_SND_1220_ADM dm = new SE_SND_1220_ADM();
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        dm.setCd_key(cd_key);
        dm.setMode(mode.toUpperCase());
        dm.setCd(cd);
        dm.setCdnm(cdnm);
        dm.setUse_yn(use_yn);
        dm.setMang_cd_1(mang_cd_1);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1200DAO dao = new SE_SND_1200DAO();
            ds = dao.se_snd_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd    =" + dm.getCmpy_cd()    );
//        System.out.println("job_clsf   =" + dm.getJob_clsf()   );
//        System.out.println("cd_clsf    =" + dm.getCd_clsf()    );
//        System.out.println("cd_key     =" + dm.getCd_key()     );
//        System.out.println("mode       =" + dm.getMode()       );
//        System.out.println("cd         =" + dm.getCd()         );
//        System.out.println("cdnm       =" + dm.getCdnm()       );
//        System.out.println("use_yn     =" + dm.getUse_yn()     );
//        System.out.println("mang_cd_1  =" + dm.getMang_cd_1()  );
//        
//        SE_SND_1200EJBHome home = (SE_SND_1200EJBHome) JNDIManager.getInstance().getHome("SE_SND_1200EJB");
//        
//        try {
//        	SE_SND_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1220_a(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 노선구분 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1230_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1230_LDataSet ds = null;

        // DM Setting
        SE_SND_1230_LDM dm 		= new SE_SND_1230_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String job_clsf 		= "04";
        String cd_clsf 			= "A0";
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setJob_clsf			(job_clsf	);
        dm.setCd_clsf			(cd_clsf	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1200DAO dao = new SE_SND_1200DAO();
            ds = dao.se_snd_1230_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("cmpy_cd		=" + dm.getCmpy_cd		());
//        System.out.println("job_clsf	=" + dm.getJob_clsf		());
//        System.out.println("cd_clsf		=" + dm.getCd_clsf		());
//        System.out.println("incmg_pers	=" + dm.getIncmg_pers	());
//        
//        SE_SND_1200EJBHome home = (SE_SND_1200EJBHome) JNDIManager.getInstance().getHome("SE_SND_1200EJB");
//        
//        try {
//        	SE_SND_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1230_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    
    /**
     * 노선구분 복사 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1240_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1240_ADataSet ds = null;

        // DM Setting
        SE_SND_1240_ADM dm 		= new SE_SND_1240_ADM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
        String tar_route_clsf	= Util.checkString(req.getParameter("tar_route_clsf"));
        String src_route_clsf	= Util.checkString(req.getParameter("src_route_clsf"));
        
        dm.setCmpy_cd			(cmpy_cd		);
        dm.setIncmg_pers		(incmg_pers		);
        dm.setIncmg_pers_ip		(incmg_pers_ip	);
        dm.setTar_route_clsf	(tar_route_clsf	);
        dm.setSrc_route_clsf	(src_route_clsf	);
        
        try {
        	SE_SND_1200DAO dao = new SE_SND_1200DAO();
            ds = dao.se_snd_1240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1200EJBHome home = (SE_SND_1200EJBHome) JNDIManager.getInstance().getHome("SE_SND_1200EJB");
//        
//        try {
//        	SE_SND_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1240_a(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
}
