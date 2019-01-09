/***************************************************************************************************
* ���ϸ� : SE_SND_2000WB.java
* ��� : �Ǹ� - �߼۰��� - �뼱��������
* �ۼ����� : 2009.02.12
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
import chosun.ciis.se.snd.dao.SE_SND_2000DAO;
import chosun.ciis.se.snd.dm.SE_SND_2000_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2010_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2020_ADM;
import chosun.ciis.se.snd.ds.SE_SND_2000_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2010_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2020_ADataSet;
/**
 * 
 */

public class SE_SND_2000WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2000_MDataSet ds = null;

        // DM Setting
        SE_SND_2000_MDM dm 		= new SE_SND_2000_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_2000DAO dao = new SE_SND_2000DAO();
            ds = dao.se_snd_2000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2000EJBHome home = (SE_SND_2000EJBHome) JNDIManager.getInstance().getHome("SE_SND_2000EJB");
//        
//        try {
//        	SE_SND_2000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2000_m(dm);
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
     * �뼱H�� ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_2010_LDataSet ds = null;

        // DM Setting
        SE_SND_2010_LDM dm 		= new SE_SND_2010_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String prt_plac_cd		= Util.checkString(req.getParameter("prt_plac_cd"	));
        String route_clsf		= Util.checkString(req.getParameter("route_clsf"	));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_2000DAO dao = new SE_SND_2000DAO();
            ds = dao.se_snd_2010_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_2000EJBHome home = (SE_SND_2000EJBHome) JNDIManager.getInstance().getHome("SE_SND_2000EJB");
//        
//        try {
//        	SE_SND_2000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2010_l(dm);
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
     *  �뼱H, �߼�ó�뼱 �뼱���� ���� 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_2020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_2020_ADataSet ds 	= null;
    	
    	//DM Setting
        SE_SND_2020_ADM dm 			= new SE_SND_2020_ADM();
        
        String cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    	= Util.checkString(req.getRemoteAddr());
        
    	//�߼۳뼱 ���� �׸���
    	String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate"));
    	    	
    	System.out.println("multiUpdate=" + multiUpdateData);
    	
    	Hashtable hash 				= getHashMultiUpdateData(multiUpdateData);
    	//�뼱 ����
    	String mode         		= (String) hash.get("m"				);
    	String route_clsf   		= (String) hash.get("route_clsf"	);
    	String route_cd     		= (String) hash.get("route_cd"		);
    	String prt_plac_cd  		= (String) hash.get("prt_plac_cd"	);
    	String route_rank 			= (String) hash.get("chg_route_rank");

    	dm.setCmpy_cd(cmpy_cd				);		         
    	dm.setRoute_clsf(route_clsf			);      
    	dm.setRoute_cd(route_cd				);          
    	dm.setPrt_plac_cd(prt_plac_cd		);    
    	dm.setMode(mode.toUpperCase()		);                  
    	dm.setRoute_rank(route_rank			);      
    	dm.setIncmg_pers_ip(incmg_pers_ip	);
    	dm.setIncmg_pers(incmg_pers			);      
    	
        try {
        	SE_SND_2000DAO dao = new SE_SND_2000DAO();
            ds = dao.se_snd_2020_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//    	dm.print();
        
//        SE_SND_2000EJBHome home = (SE_SND_2000EJBHome) JNDIManager.getInstance().getHome("SE_SND_2000EJB");
//        
//        try {
//        	SE_SND_2000EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_2020_a(dm);
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
