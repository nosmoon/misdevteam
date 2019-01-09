/***************************************************************************************************
* ���ϸ� : SSCommon1100WB.java
* ��� : �μ�,���� �� ���� Worker Bean
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.post.wb;

import javax.ejb.*;
import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.post.ds.*;
import chosun.ciis.co.post.dm.*;
import chosun.ciis.co.post.dao.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * �Ǹű� ���� ������ ���� WB
 */
public class COCommon1100WB{

    /**
     * �����ȣ�˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException, SQLException {
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//���������ڵ�
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//����
        String zip = Util.checkString(req.getParameter("zip"));						//�����ȣ
        String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

        CO_L_ZIPDM dm = new CO_L_ZIPDM();
        dm.setBocd(bocd); // ���������ڵ�
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        // JNDI lookup �� ���� EJB Home interface ��ü����
        /*
        COCommon1100EJBHome home = (COCommon1100EJBHome)JNDIManager.getInstance().getHome("COCommon1100EJB");
        try{
            COCommon1100EJB ejb = home.create();
            CO_L_ZIPDataSet ds = null;
            ds = ejb.selectZipList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        */
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        req.setAttribute("ds", ds);
    }
    
    /**
     * �����ȣ�˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    // ���������� �������� �ʰ� ��� �ּҸ� ��ȸ�ϴ� �ּ��˾�â �߰�����(20090827 ������)
    // url���� ���ν������� �����и�
    public void selectZipListAll(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException, SQLException {
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//���������ڵ�
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//����
        String zip = Util.checkString(req.getParameter("zip"));						//�����ȣ
        String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

        CO_L_ZIP_ALLDM dm = new CO_L_ZIP_ALLDM();
        dm.setBocd(bocd); // ���������ڵ�
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        // JNDI lookup �� ���� EJB Home interface ��ü����
        /*
        COCommon1100EJBHome home = (COCommon1100EJBHome)JNDIManager.getInstance().getHome("COCommon1100EJB");
        try{
            COCommon1100EJB ejb = home.create();
            CO_L_ZIP_ALLDataSet ds = null;
            ds = ejb.selectZipListAll(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        */
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        req.setAttribute("ds", ds);
    }
}

/* �ۼ��ð� : Wed Nov 19 14:40:01 KST 2003 */
