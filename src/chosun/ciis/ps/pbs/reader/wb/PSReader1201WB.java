/***************************************************************************************************
* ���ϸ�   : PSReader1201WB.java
* ���     : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ� EJB ȣ���Ͽ� ���� ������� request������ ��ȯ�Ѵ�.
* �ۼ����� : 2004-02-25
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
 * ����-Ȯ�嵶�ڳ���
 */
public class PSReader1201WB{

    /**
     * Ȯ�嵶�ڳ��� ȭ���� ���� �⺻����Ÿ Set
     * ��ȸ�� request���� set�Ѵ�.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectRdr_Extn_search(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_RDR_EXTN_SEARCHDataSet ds = null;

        //Session���� ���� ����Ÿ
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //ȸ���ڵ�
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //�����ID

        //���������� Request�� ���� �Ķ����
        String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));               //Ȯ������(from)
        String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));               //Ȯ������(to)
        String sh_aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_aplcpathcd")));             //��û���
        String sh_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extntypecd")));             //��û����
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //��û��ü
        String sh_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrnm")));                       //���ڼ���
        String sh_rdrprn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn1")));                   //�ֹι�ȣ1
        String sh_rdrprn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_rdrprn2")));                   //�ֹι�ȣ2
        String sh_phone1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone1")));                     //��ȭ��ȣ1
        String sh_phone2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone2")));                     //��ȭ��ȣ2
        String sh_phone3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_phone3")));                     //��ȭ��ȣ3
        String sh_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_dlvaddr")));                   //�ּҸ�
        String sh_extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extnflnm")));                 //Ȯ���ڼ���
        String sh_deliproccd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_deliproccd")));               //�躻����
        String sh_bouseyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_bouseyn")));                   //��Ͽ���
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //����������
        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //�������� ������ �Ǽ�
        if (pagesizestr.equals(""))   pagesizestr = "10";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM ���� Setting�Ѵ�.
        PS_L_RDR_EXTN_SEARCHDM dm = new PS_L_RDR_EXTN_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //ȸ���ڵ�
        dm.setIncmgpers(incmgpers);                                                                           //�����ID
        dm.setSh_extndt_fr(sh_extndt_fr);                                                                     //Ȯ������(from)
        dm.setSh_extndt_to(sh_extndt_to);                                                                     //Ȯ������(to)
        dm.setSh_aplcpathcd(sh_aplcpathcd);                                                                   //��û���
        dm.setSh_extntypecd(sh_extntypecd);                                                                   //��û����
        dm.setSh_medicd(sh_medicd);                                                                           //��û��ü
        dm.setSh_rdrnm(sh_rdrnm);                                                                             //���ڼ���
        dm.setSh_rdrprn1(sh_rdrprn1);                                                                         //�ֹι�ȣ1
        dm.setSh_rdrprn2(sh_rdrprn2);                                                                         //�ֹι�ȣ2
        dm.setSh_phone1(sh_phone1);                                                                           //��ȭ��ȣ1
        dm.setSh_phone2(sh_phone2);                                                                           //��ȭ��ȣ2
        dm.setSh_phone3(sh_phone3);                                                                           //��ȭ��ȣ3
        dm.setSh_dlvaddr(sh_dlvaddr);                                                                         //�ּҸ�
        dm.setSh_extnflnm(sh_extnflnm);                                                                       //Ȯ���ڼ���
        dm.setSh_deliproccd(sh_deliproccd);                                                                   //�躻����
        dm.setSh_bouseyn(sh_bouseyn);                                                                         //��Ͽ���

        dm.setPageno(pageno);                                                                                 //����������
        dm.setPagesize(pagesize);                                                                             //�������� ������ �Ǽ�

        PSReader1201EJBHome home = (PSReader1201EJBHome)JNDIManager.getInstance().getHome("PSReader1201EJB");

        try{
            PSReader1201EJB ejb = home.create();
            ds = ejb.selectRdr_Extn_search(dm);        //������ dm������ EJB�� ȣ���Ѵ�.
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
