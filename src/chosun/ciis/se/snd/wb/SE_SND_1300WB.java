/***************************************************************************************************
* ���ϸ� : SE_SND_1300WB.java
* ��� : �Ǹ� - �߼۰��� - �뼱���μ�ó����
* �ۼ����� : 2009.01.30
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_1300DAO;
import chosun.ciis.se.snd.dm.SE_SND_1300_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1310_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1320_ADM;
import chosun.ciis.se.snd.ds.SE_SND_1300_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1310_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1320_ADataSet;
/**
 * 
 */

public class SE_SND_1300WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1300_MDataSet ds = null;

        // DM Setting
        SE_SND_1300_MDM dm 		= new SE_SND_1300_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1300DAO dao = new SE_SND_1300DAO();
            ds = dao.se_snd_1300_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1300EJBHome home = (SE_SND_1300EJBHome) JNDIManager.getInstance().getHome("SE_SND_1300EJB");
//        
//        try {
//        	SE_SND_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1300_m(dm);
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
     * �뼱�� �μ�ó ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1310_LDataSet ds = null;

        // DM Setting
        SE_SND_1310_LDM dm = new SE_SND_1310_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"));
        String bgn_reg_dt 		= Util.checkString(req.getParameter("bgn_reg_dt"));
        String end_reg_dt 		= Util.checkString(req.getParameter("end_reg_dt"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setBgn_reg_dt(bgn_reg_dt);
        dm.setEnd_reg_dt(end_reg_dt);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1300DAO dao = new SE_SND_1300DAO();
            ds = dao.se_snd_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1300EJBHome home = (SE_SND_1300EJBHome) JNDIManager.getInstance().getHome("SE_SND_1300EJB");
//        
//        try {
//        	SE_SND_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1310_l(dm);
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
     *  �뼱�� �μ�ó ���, ����, ���� 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1320_ADataSet ds = null;
    	
    	//DM Setting
        SE_SND_1320_ADM dm = new SE_SND_1320_ADM();
        
    	//�뼱 ���� �׸���
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpDate"));
    	    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	Hashtable hash 			= getHashMultiUpdateData(multiUpdateData);
    	//�뼱 ����
    	String mode				= (String)hash.get("m"				);	//�׸��� ���
    	String reg_dt			= (String)hash.get("reg_dt"			);	//�������
    	String reg_seq			= (String)hash.get("reg_seq" 		);	//��ϼ���	
    	String route_clsf		= (String)hash.get("route_clsf"		);	//�뼱����
    	String bgn_route_cd		= (String)hash.get("bgn_route_cd"	);	//���۳뼱�ڵ�
    	String end_route_cd		= (String)hash.get("end_route_cd"	);	//����뼱�ڵ�
    	String medi_cd			= (String)hash.get("medi_cd"		);	//��ü�ڵ�
    	String prt_plac_cd		= (String)hash.get("prt_plac_cd"	);	//�μ�ó�ڵ�
    	
    	String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
    	
        dm.setCmpy_cd			(cmpy_cd			);
        dm.setMode				(mode.toUpperCase()	);
        dm.setReg_dt			(reg_dt				);
        dm.setReg_seq			(reg_seq			);
        dm.setRoute_clsf		(route_clsf			);
        dm.setBgn_route_cd		(bgn_route_cd		);
        dm.setEnd_route_cd		(end_route_cd		);
        dm.setMedi_cd			(medi_cd			);
        dm.setPrt_plac_cd		(prt_plac_cd		);
        dm.setIncmg_pers		(incmg_pers			);
        dm.setIncmg_pers_ip		(incmg_pers_ip		);
        
        try {
        	SE_SND_1300DAO dao = new SE_SND_1300DAO();
            ds = dao.se_snd_1320_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        System.out.println("mode			=" + dm.getMode()			);
//        System.out.println("reg_dt			=" + dm.getReg_dt()			);
//        System.out.println("reg_seq			=" + dm.getReg_seq()		);
//        System.out.println("route_clsf		=" + dm.getRoute_clsf()		);
//        System.out.println("bgn_route_cd	=" + dm.getBgn_route_cd()	);
//        System.out.println("end_route_cd	=" + dm.getEnd_route_cd()	);
//        System.out.println("medi_cd			=" + dm.getMedi_cd()		);
//        System.out.println("prt_plac_cd		=" + dm.getPrt_plac_cd()	);
//        
//        SE_SND_1300EJBHome home = (SE_SND_1300EJBHome) JNDIManager.getInstance().getHome("SE_SND_1300EJB");
//        
//        try {
//        	SE_SND_1300EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1320_a(dm);
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
