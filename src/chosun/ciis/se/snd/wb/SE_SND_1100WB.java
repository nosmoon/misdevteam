/***************************************************************************************************
* ���ϸ� : SE_SND_1100WB.java
* ��� : �Ǹ� - �߼۰��� - �뼱���
 * �ۼ����� : 2009.02.03
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
import chosun.ciis.se.snd.dao.SE_SND_1100DAO;
import chosun.ciis.se.snd.dm.SE_SND_1100_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1110_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1120_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1130_ADM;
import chosun.ciis.se.snd.dm.SE_SND_1140_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1100_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1110_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1120_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1130_ADataSet;
import chosun.ciis.se.snd.ds.SE_SND_1140_LDataSet;
/**
 * 
 */

public class SE_SND_1100WB extends BaseWB{

    /**
     * �ʱⰪ ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1100_MDataSet ds = null;

        // DM Setting
        SE_SND_1100_MDM dm 		= new SE_SND_1100_MDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd			(cmpy_cd	);
        dm.setIncmg_pers		(incmg_pers	);
        
        try {
        	SE_SND_1100DAO dao = new SE_SND_1100DAO();
            ds = dao.se_snd_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1100EJBHome home = (SE_SND_1100EJBHome) JNDIManager.getInstance().getHome("SE_SND_1100EJB");
//        
//        try {
//        	SE_SND_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1100_m(dm);
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
     * �뼱 ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1110_LDataSet ds = null;

        // DM Setting
        SE_SND_1110_LDM dm = new SE_SND_1110_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"));
        String route_cd 		= Util.checkString(req.getParameter("route_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setRoute_cd(route_cd);
        
        try {
        	SE_SND_1100DAO dao = new SE_SND_1100DAO();
            ds = dao.se_snd_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1100EJBHome home = (SE_SND_1100EJBHome) JNDIManager.getInstance().getHome("SE_SND_1100EJB");
//        
//        try {
//        	SE_SND_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1110_l(dm);
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
     * �߼� ��ȸ 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1120_LDataSet ds = null;

        // DM Setting
        SE_SND_1120_LDM dm = new SE_SND_1120_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String route_clsf 		= Util.checkString(req.getParameter("route_clsf"));
        String route_cd 		= Util.checkString(req.getParameter("route_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setRoute_clsf(route_clsf);
        dm.setRoute_cd(route_cd);
        
        try {
        	SE_SND_1100DAO dao = new SE_SND_1100DAO();
            ds = dao.se_snd_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1100EJBHome home = (SE_SND_1100EJBHome) JNDIManager.getInstance().getHome("SE_SND_1100EJB");
//        
//        try {
//        	SE_SND_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1120_l(dm);
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
     *  �뼱���, ����, ���� 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1130_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_SND_1130_ADataSet ds = null;
    	
    	//�뼱 ���� �׸���
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData1"));
    	//�߼�ó ���� �׸���
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash 			= getHashMultiUpdateData(multiUpdateData);
    	//�뼱 ����
    	String mode				= (String)hash.get("m"			);	//�׸��� ���
    	String medi_cd			= (String)hash.get("medi_cd"	);	//��ü�ڵ�
    	String prt_plac_cd		= (String)hash.get("prt_plac_cd");	//�μ�ó�ڵ�
    	String ecnt_cd			= (String)hash.get("ecnt_cd"	);	//�Ǽ��ڵ�
    	String ledt_cd			= (String)hash.get("ledt_cd"	);	//������ �ڵ�
    	
    	String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers	  	= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip    = Util.checkString(req.getRemoteAddr());
    	String route_clsf		= Util.checkString(req.getParameter("route_clsf"	)); 	//�뼱����
    	String route_cd			= Util.checkString(req.getParameter("route_cd"		)); 	//�뼱�ڵ�
    	String route_nm			= Util.checkString(req.getParameter("route_nm"		)); 	//�뼱��
    	String route_rank		= Util.checkString(req.getParameter("route_rank"	)); 	//�뼱����
    	String inwsp_send_yn	= Util.checkString(req.getParameter("inwsp_send_yn"	));		//�����߼ۿ���
        
        Hashtable hash2 		= getHashMultiUpdateData(multiUpdateData2);
    	
    	String mode_send		= (String)hash2.get("m"				);	//�߼�ó �׸��� ���
        String send_plac_nm		= (String)hash2.get("send_plac_nm"	);  //�߼�ó��
        String area_nm			= (String)hash2.get("area_nm"		);	//������
        String send_rank		= (String)hash2.get("send_rank"		);	//�߼ۼ���
        String cnsg_seqo		= (String)hash2.get("cnsg_seqo"		);	//Ź�ۼ���
        String send_mthd		= (String)hash2.get("send_mthd"		);	//��������
        String bo_cd			= (String)hash2.get("bo_cd"			);	//�����ڵ�
        String send_plac_seq	= (String)hash2.get("send_plac_seq"	);	//�߼�ó����
        String area_cd			= (String)hash2.get("area_cd"		);	//�����ڵ�
        
        //DM Setting
        SE_SND_1130_ADM dm = new SE_SND_1130_ADM();
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setInwsp_send_yn(inwsp_send_yn);
        dm.setMode(mode.toUpperCase());
        dm.setRoute_clsf(route_clsf);
        dm.setRoute_cd(route_cd);
        dm.setRoute_nm(route_nm);
        dm.setRoute_rank(route_rank);
        dm.setMedi_cd(medi_cd);
        dm.setPrt_plac_cd(prt_plac_cd);
        dm.setEcnt_cd(ecnt_cd);
        dm.setLedt_cd(ledt_cd);
        dm.setMode_send(mode_send.toUpperCase());
        dm.setBo_cd(bo_cd);
        dm.setSend_plac_seq(send_plac_seq);
        dm.setSend_rank(send_rank);
        dm.setCnsg_seqo(cnsg_seqo);
        dm.setSend_mthd(send_mthd);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_SND_1100DAO dao = new SE_SND_1100DAO();
            ds = dao.se_snd_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1100EJBHome home = (SE_SND_1100EJBHome) JNDIManager.getInstance().getHome("SE_SND_1100EJB");
//        
//        try {
//        	SE_SND_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1130_a(dm);
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
     * ��ü��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void se_snd_1140_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_SND_1140_LDataSet ds = null;

        // DM Setting
        SE_SND_1140_LDM dm 		= new SE_SND_1140_LDM();

        String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	SE_SND_1100DAO dao = new SE_SND_1100DAO();
            ds = dao.se_snd_1140_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_SND_1100EJBHome home = (SE_SND_1100EJBHome) JNDIManager.getInstance().getHome("SE_SND_1100EJB");
//        
//        try {
//        	SE_SND_1100EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_snd_1140_l(dm);
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
