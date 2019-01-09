/***************************************************************************************************
* 파일명 : SE_SAL_1400WB.java
* 기능 : 판매 - 지대관리 - 매출관리 - 지대원장
* 작성일자 : 2009-04-06
* 작성자 : 김대준
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

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.sal.dao.SE_SAL_1400DAO;
import chosun.ciis.se.sal.dm.SE_SAL_1400_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_1410_SDM;
import chosun.ciis.se.sal.dm.SE_SAL_1420_ADM;
import chosun.ciis.se.sal.ds.SE_SAL_1400_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1410_SDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_1420_ADataSet;
/**
 * 
 */

public class SE_SAL_1400WB extends BaseWB{
	
	/**
     * 초기값 조회 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1400_MDataSet ds = null;

        // DM Setting
        SE_SAL_1400_MDM dm 		= new SE_SAL_1400_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        
        
        try {
        	SE_SAL_1400DAO dao = new SE_SAL_1400DAO();
            ds = dao.se_sal_1400_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1400EJBHome home = (SE_SAL_1400EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1400EJB");
//        
//        try {
//        	SE_SAL_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1400_m(dm);
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
     * 지국매출, 순매출, 입금내역, 부수정보 조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1410_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1410_SDataSet ds = null;

        // DM Setting
        SE_SAL_1410_SDM dm 		= new SE_SAL_1410_SDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm				= Util.checkString(req.getParameter("yymm"			));
        String bo_cd			= Util.checkString(req.getParameter("bo_cd"			));
        String bo_seq			= Util.checkString(req.getParameter("bo_seq"		));
        
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        dm.setYymm				(yymm		);
        dm.setBo_cd				(bo_cd		);
        dm.setBo_seq			(bo_seq		);
                
        try {
        	SE_SAL_1400DAO dao = new SE_SAL_1400DAO();
            ds = dao.se_sal_1410_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1400EJBHome home = (SE_SAL_1400EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1400EJB");
//        
//        try {
//        	SE_SAL_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1410_s(dm);
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
     * 지대 h, 지대 b 업데이트
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_sal_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SAL_1420_ADataSet ds 	= null;

        // DM Setting
        SE_SAL_1420_ADM dm 			= new SE_SAL_1420_ADM();

        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers			= Util.getSessionParameterValue(req, "emp_no", true);
        String yymm					= Util.checkString(req.getParameter("yymm"			));
        String bo_cd				= Util.checkString(req.getParameter("bo_cd"			));
        String bo_seq				= Util.checkString(req.getParameter("bo_seq"		));
        String area_cd				= Util.checkString(req.getParameter("area_cd"		));
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        String icdc_calc_qty_110    = Util.checkString(req.getParameter("icdc_calc_qty_110"		)).replaceAll(",", "");
        String spsl_qty_110         = Util.checkString(req.getParameter("spsl_qty_110"			)).replaceAll(",", "");
        String rdff_rdu_uprc_110    = Util.checkString(req.getParameter("rdff_rdu_uprc_110"		)).replaceAll(",", "");
        String dnt_qty_110          = Util.checkString(req.getParameter("dnt_qty_110"			)).replaceAll(",", "");
        String stetsell_qty_110     = Util.checkString(req.getParameter("stetsell_qty_110"		)).replaceAll(",", "");
        String stetsell_uprc_110    = Util.checkString(req.getParameter("stetsell_uprc_110"		)).replaceAll(",", "");
        String incmp_sale_qty_110   = Util.checkString(req.getParameter("incmp_sale_qty_110"	)).replaceAll(",", "");
        String incmp_sale_amt_110   = Util.checkString(req.getParameter("incmp_sale_amt_110"	)).replaceAll(",", "");
        String prvmm_val_qty_110    = Util.checkString(req.getParameter("prvmm_val_qty_110"		)).replaceAll(",", "");
        String fpymt_encur_amt_110  = Util.checkString(req.getParameter("fpymt_encur_amt_110"	)).replaceAll(",", "");
        String sale_amt_110         = Util.checkString(req.getParameter("sale_amt_110"			)).replaceAll(",", "");
        String net_sale_amt_110     = Util.checkString(req.getParameter("net_sale_amt_110"		)).replaceAll(",", "");
        String rdff_rdu_uprc_130    = Util.checkString(req.getParameter("rdff_rdu_uprc_130"		)).replaceAll(",", "");
        String icdc_calc_qty_130    = Util.checkString(req.getParameter("icdc_calc_qty_130"		)).replaceAll(",", "");
        String spsl_qty_130         = Util.checkString(req.getParameter("spsl_qty_130"			)).replaceAll(",", "");
        String dnt_qty_130          = Util.checkString(req.getParameter("dnt_qty_130"			)).replaceAll(",", "");
        String stetsell_qty_130     = Util.checkString(req.getParameter("stetsell_qty_130"		)).replaceAll(",", "");
        String stetsell_uprc_130    = Util.checkString(req.getParameter("stetsell_uprc_130"		)).replaceAll(",", "");
        String incmp_sale_qty_130   = Util.checkString(req.getParameter("incmp_sale_qty_130"	)).replaceAll(",", "");
        String incmp_sale_amt_130   = Util.checkString(req.getParameter("incmp_sale_amt_130"	)).replaceAll(",", "");
        String prvmm_val_qty_130    = Util.checkString(req.getParameter("prvmm_val_qty_130"		)).replaceAll(",", "");
        String fpymt_encur_amt_130  = Util.checkString(req.getParameter("fpymt_encur_amt_130"	)).replaceAll(",", "");
        String sale_amt_130         = Util.checkString(req.getParameter("sale_amt_130"			)).replaceAll(",", "");
        String net_sale_amt_130     = Util.checkString(req.getParameter("net_sale_amt_130"		)).replaceAll(",", "");
        
        dm.setCmpy_cd				(cmpy_cd			);
        dm.setIncmg_pers			(incmg_pers			);
        dm.setIncmg_pers_ip			(incmg_pers_ip		);
        dm.setYymm					(yymm				);
        dm.setBo_cd					(bo_cd				);
        dm.setBo_seq				(bo_seq				);
        dm.setArea_cd				(area_cd			);
        dm.setIcdc_calc_qty_110   	(icdc_calc_qty_110  );
        dm.setSpsl_qty_110         	(spsl_qty_110       );
        dm.setRdff_rdu_uprc_110    	(rdff_rdu_uprc_110  );
        dm.setDnt_qty_110          	(dnt_qty_110        );
        dm.setStetsell_qty_110     	(stetsell_qty_110   );
        dm.setStetsell_uprc_110    	(stetsell_uprc_110  );
        dm.setIncmp_sale_qty_110   	(incmp_sale_qty_110 );
        dm.setIncmp_sale_amt_110   	(incmp_sale_amt_110 );
        dm.setPrvmm_val_qty_110    	(prvmm_val_qty_110  );
        dm.setFpymt_encur_amt_110  	(fpymt_encur_amt_110);
        dm.setSale_amt_110         	(sale_amt_110       );
        dm.setNet_sale_amt_110     	(net_sale_amt_110   );
        dm.setRdff_rdu_uprc_130    	(rdff_rdu_uprc_130  );
        dm.setIcdc_calc_qty_130    	(icdc_calc_qty_130  );
        dm.setSpsl_qty_130         	(spsl_qty_130       );
        dm.setDnt_qty_130          	(dnt_qty_130        );
        dm.setStetsell_qty_130     	(stetsell_qty_130   );
        dm.setStetsell_uprc_130    	(stetsell_uprc_130  );
        dm.setIncmp_sale_qty_130   	(incmp_sale_qty_130 );
        dm.setIncmp_sale_amt_130   	(incmp_sale_amt_130 );
        dm.setPrvmm_val_qty_130    	(prvmm_val_qty_130  );
        dm.setFpymt_encur_amt_130  	(fpymt_encur_amt_130);
        dm.setSale_amt_130         	(sale_amt_130       );
        dm.setNet_sale_amt_130     	(net_sale_amt_130   );
        
        try {
        	SE_SAL_1400DAO dao = new SE_SAL_1400DAO();
            ds = dao.se_sal_1420_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SAL_1400EJBHome home = (SE_SAL_1400EJBHome) JNDIManager.getInstance().getHome("SE_SAL_1400EJB");
//        
//        try {
//        	SE_SAL_1400EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_sal_1420_a(dm);
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
