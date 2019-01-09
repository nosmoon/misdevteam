/***************************************************************************************************
* ���ϸ�   : AdBrn1700WB.java
* ���     : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*            EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ����� : 
* �ۼ���   : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

package chosun.ciis.ad.brn.wb;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1700DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1710_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1715_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1740_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1770_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1710_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1715_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1740_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1770_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

/**
 * �������-�������� Ȯ��ó������ WorkBean
 */

public class AdBrn1700WB extends BaseWB {


	public static final String PRENG_ADVT_BO = "00038160";
    /**
     * �������� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_BRN_1710_LDataSet ds = null;

        //����� ��������
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);

        String uid 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(uid))	uid = PRENG_ADVT_BO;
        
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        
        // DM Setting
    	AD_BRN_1710_LDM dm = new AD_BRN_1710_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setUid(uid);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        
//    	//dm.print();

        try {
        	AdBrn1700DAO dao = new AdBrn1700DAO();
            ds = dao.ad_brn_1710_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1700EJBHome home = (AdBrn1700EJBHome) JNDIManager.getInstance().getHome("AdBrn1700EJB");
//        
//        try {
//       	    AdBrn1700EJB ejb = home.create();
//            ds = ejb.ad_brn_1710_l(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
//            req.setAttribute("ds", ds);	// request�� ������� ��´�.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    

    /**
     * �������� ����� ��ȸ�Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1715_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {    	
    	AD_BRN_1715_SDataSet ds = null;

        //����� ��������
    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);

        String uid 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(uid))	uid = PRENG_ADVT_BO;
        
    	String job_clsf = Util.checkString(req.getParameter("job_clsf"));
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
        
        // DM Setting
    	AD_BRN_1715_SDM dm = new AD_BRN_1715_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);
    	dm.setUid(uid);

//    	//dm.print();

        try {
        	AdBrn1700DAO dao = new AdBrn1700DAO();
            ds = dao.ad_brn_1715_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1700EJBHome home = (AdBrn1700EJBHome) JNDIManager.getInstance().getHome("AdBrn1700EJB");
//        
//        try {
//       	    AdBrn1700EJB ejb = home.create();
//            ds = ejb.ad_brn_1715_s(dm);	// ������ dm������ EJB�� ȣ���Ѵ�.
//            req.setAttribute("ds", ds);	// request�� ������� ��´�.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    /**
     * �������� �亯�� �Է�, ����, �����Ѵ�.
     * ��ȸ�� request���� set�Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1740_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, IOException {
    	
    	AD_BRN_1740_ADataSet ds = null;
    	
        byte[] add_file = (byte[])req.getAttribute("add_file");

        // Request Parameter Processing
        String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        String incmg_pers_ip = req.getRemoteAddr();
    	
        String job_clsf    	= Util.checkString(req.getParameter("job_clsf"));
        String cntc_seq    	= Util.checkString(req.getParameter("cntc_seq"));
        String answer_cont 	= Util.checkString(req.getParameter("answer_cont"));
        String add_file_nm 	= Util.checkString(req.getParameter("add_file_nm"));
        String file_delyn  	= Util.checkString(req.getParameter("file_delyn"));

//        try{
//        	answer_cont = new String(answer_cont.getBytes("8859_1"), "EUC-KR");
//	        add_file_nm	= new String(add_file_nm.getBytes("8859_1"), "EUC-KR");	
//        }catch(Exception e){
//        }
//        
        // DM Setting
        AD_BRN_1740_ADM dm = new AD_BRN_1740_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCntc_seq(cntc_seq);
        dm.setAnswer_cont(answer_cont);
        dm.setAdd_file_nm(add_file_nm);
        dm.setAdd_file(add_file);
        dm.setFile_delyn(file_delyn);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(preng_advt_bo);
        
//        //dm.print();

        try {
        	AdBrn1700DAO dao = new AdBrn1700DAO();
            ds = dao.ad_brn_1740_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1700EJBHome home = (AdBrn1700EJBHome) JNDIManager.getInstance().getHome("AdBrn1700EJB");
//        try {
//            AdBrn1700EJB ejb = home.create();            
//            ds = ejb.ad_brn_1740_a(dm);         
//            req.setAttribute("ds", ds); // request�� ������� ��´�.
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);  
//            LogManager.getInstance().log(se);
//            throw se;
//        }        
    }    

    /**
     * �������� ÷�������� �ٿ�ε��Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     **/

    public void ad_brn_1770_a(HttpServletRequest req, HttpServletResponse res) throws AppException {

        AD_BRN_1770_ADataSet ds = null;

        //����� ��������
        String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
//      String make_pers   = Util.getSessionParameterValue(req, "emp_no", true);

        String job_clsf = Util.checkString(req.getParameter("job_clsf"));	//��������
    	String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));	//�����Ϸù�ȣ    
    	String rmsg_seq = Util.checkString(req.getParameter("rmsg_seq"));	//�����Ϸù�ȣ    	
    	
    	AD_BRN_1770_ADM dm = new AD_BRN_1770_ADM();    	
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setJob_clsf(job_clsf);
    	dm.setCntc_seq(cntc_seq);
    	dm.setRmsg_seq(rmsg_seq);

        try {
        	AdBrn1700DAO dao = new AdBrn1700DAO();
            ds = dao.ad_brn_1770_a(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("add_file", ds.add_file); // request�� ������� ��´�.
            req.setAttribute("add_file_nm", ds.add_file_nm); // request�� ������� ��´�.
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//    	AdBrn1700EJBHome home = (AdBrn1700EJBHome) JNDIManager.getInstance().getHome("AdBrn1700EJB");
//    	    	
//        try {
//           	AdBrn1700EJB ejb = home.create();        
//            ds = ejb.ad_brn_1770_a(dm); // ������ dm������ EJB�� ȣ���Ѵ�.
//            req.setAttribute("add_file", ds.add_file); // request�� ������� ��´�.
//            req.setAttribute("add_file_nm", ds.add_file_nm); // request�� ������� ��´�.
//            
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
    
}
