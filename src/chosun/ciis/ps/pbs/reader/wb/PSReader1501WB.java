/***************************************************************************************************
* ���ϸ�   : PSReader1501WB.java
* ���     : ���� - ������� ó��
* �ۼ����� : 2004-03-02
* �ۼ���   : ����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/

package chosun.ciis.ps.pbs.reader.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;

import chosun.ciis.ps.pbs.reader.ejb.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;


/**
 * ����-�������ó��
 */
public class PSReader1501WB{

    /**
     * �������ó�� ȭ���� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectAsinExtn_search(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EXTN_ASIN_SEARCHDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));               //Ȯ������(from)
        String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));               //Ȯ������(to)
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //������ü
        String sh_asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinbocd")));                 //��������
        String sh_asinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinyn")));                     //��������
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������

        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_EXTN_ASIN_SEARCHDM dm = new PS_L_EXTN_ASIN_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setSh_extndt_fr(sh_extndt_fr);                                                                     //Ȯ������(from)
        dm.setSh_extndt_to(sh_extndt_to);                                                                     //Ȯ������(to)
        dm.setSh_medicd(sh_medicd);                                                                           //������ü
        dm.setSh_asinbocd(sh_asinbocd);                                                                       //��������
        dm.setSh_asinyn(sh_asinyn);                                                                           //��������
        dm.setPageno(pageno);                                                                                 //����������
        dm.setPagesize(pagesize);                                                                             //�������� ������ �Ǽ�

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.selectAsinExtn_search(dm);        //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * �������ó�� �񱳴�󸮽�Ʈ ȭ���� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectExstRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EXST_RDR_SEARCHDataSet ds = null;

        //���� Session���� ���� ����Ÿ
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                           //ȸ���ڵ�
        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));                     //�����ID

        //���������� Request�� ���� �Ķ����
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                                 //Ȯ������
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                                 //Ȯ���ȣ

        //DM ���� Setting�Ѵ�.
        PS_L_EXST_RDR_SEARCHDM dm = new PS_L_EXST_RDR_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //Ȯ������
        dm.setRdr_extnno(rdr_extnno);                                                                         //Ȯ���ȣ

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.selectExstRdrList(dm);            //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

    /**
     * �������ó�� ���� ȭ���� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateExstRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_U_EXTN_BO_ASINDataSet ds = null;

        //���� Session���� ���� ����Ÿ
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                           //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //�� ���ڵ� ī��Ʈ
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);

        StringBuffer extnboasinarr = new StringBuffer("");                                                    //Ȯ��������� Array

        //Ȯ��������� String Array�� ����
        for (int i=0 ; i < listcnt ; i++) {
        	if ("SEL".equals(Util.checkString(req.getParameter("asin_check"+i)))) {
        		extnboasinarr.append("##");
        		extnboasinarr.append(Util.checkString(req.getParameter("rdr_extndt"+i)));                     //Ȯ������
        		extnboasinarr.append("&&");
        		extnboasinarr.append(Util.checkString(req.getParameter("rdr_extnno"+i)));                     //Ȯ���ȣ
        		extnboasinarr.append("&&");
        		extnboasinarr.append(Util.checkString(req.getParameter("resitypecd"+i)));                     //��������
        	}
        }

        extnboasinarr.delete(0,2);          //ó�� ## ����

        //DM ���� Setting�Ѵ�.
        PS_U_EXTN_BO_ASINDM dm = new PS_U_EXTN_BO_ASINDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setExtnboasinarr(extnboasinarr.toString());                                                        //Ȯ��������� Array

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.updateExstRdrList(dm);            //������ dm������ EJB�� ȣ���Ѵ�.
            req.setAttribute("ds", ds);                //request�� ������� ��´�.
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }

}
