/***************************************************************************************************
 * ���ϸ� : SSAdmin1100WB.java
 * ��� : ������-���̱׷��̼��� ���� Worker Bean
 * �ۼ����� : 2004-03-12
 * �ۼ��� : ��뼷
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.dao.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������-���̱׷��̼��� ���� WB
 */

public class SSAdmin1100WB {

    /**
     * ������-���̱׷��̼�-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initMig(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� initMig ȣ��
        ds = dao.initMig(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.initMig(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // ��������� �Ǽ� DB ������ ��
        SS_S_MIGRWORKINFODataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_S_MIGRWORKINFODM dm = new SS_S_MIGRWORKINFODM();
        dm.setBocd(bocd);

        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectMigList ȣ��
        ds = dao.selectMigList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectMigList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-����DB���ε�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/*  �����ϴ� ������ �Ǵ��ϰ� �ּ�ó����. ejb �Ⱦ��µ� �����ϱ� ��ٷο�	 20171213 ������
    public void boUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));

        // DM Setting
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� boUpload ȣ��
        dao.boUpload(bocd, bonm, incmgpers);

        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ejb.boUpload(bocd, bonm, incmgpers);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
    }
*/    

    /**
    * ������-���̱׷��̼�-����DB���ε� ���� Ȯ��
    *   DM, DataSet�� ������� �ʴ´�.(���ν��� ȣ���� �ƴ� ���� IO�� ó��
    *   EJB�� ȣ������ �ʰ� WB���� ���� IO�� �ٷ� ó��
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    **/
   public void showError(HttpServletRequest req, HttpServletResponse res) throws AppException {

        // Request Parameter Processing
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        if(bocd == null || "".equals(bocd)){
            throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] �����ڵ尡 �������� �ʽ��ϴ�.");
        }

        try{
            Properties p = new Properties();
            File propFile = new File("//was//salesdept//prop//default.properties");

            FileInputStream fis = new FileInputStream(propFile);
            p.load(fis);
            fis.close();
/*
             MIG.BOUPLOAD.DIR=//isdata//chosunis//dataload//jikukload//
             MIS.BAD.DIR=bad//
             MIS.LOG.DIR=log//
             MIS.BAD.FILEEXT=.bad
             MIS.LOG.FILEEXT=.log

*/
            // �α����� ���� ���
            String mainDir = (String) p.get("MIG.BOUPLOAD.DIR");
            String badDir = (String) p.get("MIG.BAD.DIR");
            String logDir = (String) p.get("MIG.LOG.DIR");
            String badFileExt = (String) p.get("MIS.BAD.FILEEXT");
            String logFileExt = (String) p.get("MIS.LOG.FILEEXT");

            // StringBuffer ��ü ����
           StringBuffer badBuffer = new StringBuffer("");
           StringBuffer logBuffer = new StringBuffer("");


           // bad ���� ���丮 ��ü ����
            File badFileDir = new File(mainDir+bocd+"//"+badDir);
            // bad ���� ��ü�� ����
            File badFiles[] = badFileDir.listFiles();

            // .bad ���� Ȯ��
            if(badFiles.length == 0){
                throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] "+bocd+" ������ bad ������ �������� �ʽ��ϴ�.");
            }

            // bad ���� ���� ����
            for(int i=0; i<badFiles.length; i++){
                // bad ���� ���� �б�
                BufferedReader badBR = new BufferedReader(new FileReader(badFiles[i]));
                badBuffer.append("File �� : "+badFiles[i].getName()+"\n");
                badBuffer.append("-----------------------------------------------------"+"\n");
                String line = null;
                while( (line = badBR.readLine()) != null){
                    badBuffer.append(line+"\n");
                }
                badBuffer.append("-----------------------------------------------------"+"\n\n");
            }


            // log ���� ���丮 ��ü ����
            File logFileDir = new File(mainDir+bocd+"//"+logDir);
            // log ���� ��ü�� ����
            File logFiles[] = logFileDir.listFiles();

            // log ���� ���� ����(bad ������ �����ϴ� ��쿡��)
            for(int i=0; i<logFiles.length; i++){
                for(int j=0; j<badFiles.length; j++){
                    // �� ������ Ȯ���ڸ� ������ �̸��� ���Ͽ� ���� ��츸 ������ ���´�.
                    String logTemp = logFiles[i].getName().substring(0, logFiles[i].getName().indexOf("."));
                    String badTemp = badFiles[j].getName().substring(0, badFiles[j].getName().indexOf("."));
System.out.println("logTemp : "+logTemp);
System.out.println("badTemp : "+badTemp);
                    if(logTemp.trim().equals(badTemp.trim())){
                        // log ���� ���� �б�
                        BufferedReader logBR = new BufferedReader(new FileReader(logFiles[i]));
                        logBuffer.append("File �� : "+logFiles[i].getName()+"\n");
                        logBuffer.append("-----------------------------------------------------"+"\n");
                        String line = null;
                        while ( (line = logBR.readLine()) != null) {
                            logBuffer.append(line + "\n");
                        }
                        logBuffer.append("-----------------------------------------------------"+"\n\n");
                    }
                }
            }

            req.setAttribute("badFileContent", badBuffer.toString());
            req.setAttribute("logFileContent", logBuffer.toString());

        }catch(IOException ioe){
            throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] ����Ȯ���� ���� ���������� ã�� �� �����ϴ�.");
        }
   }


    /**
     * ������-���̱׷��̼�-����DB���ε�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void billUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIG_BILLUPDataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_A_MIG_BILLUPDM dm = new SS_A_MIG_BILLUPDM();
        dm.setIncmgpers(incmgpers);
        dm.setBocd(bocd);
        dm.setWorkclsf("3");

/*
        �������ε�� �۾�����,�۾��̷�,�۾����� ó���� EJB-DAO���� �������ε�ʹ� ������� ó���ؾ� �ϹǷ� CMT(Container Managed Tranaction)
        �� �������� �ʴ�. �������ε�� ������ EJB�� ó���Ѵ�.
 */
//
//        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
//        try {
//            SSAdmin1100EJB ejb = home.create();
//            ds = ejb.billUpload(dm);
//            req.setAttribute("ds", ds);
//        } catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        } catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
        // �������ε�� BMT(Bean Managed Transaction)�� ó���ȴ�.
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� billUpload ȣ��
        ds = dao.billUpload(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin2000EJBHome home = (SSAdmin2000EJBHome) JNDIManager.getInstance().getHome("SSAdmin2000EJB");
        try {
            SSAdmin2000EJB ejb = home.create();
            ds = ejb.billUpload(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/

    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void boConvert(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIGRWORKINFODataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_A_MIGRWORKINFODM dm = new SS_A_MIGRWORKINFODM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� boConvert ȣ��
        ds = dao.boConvert(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.boConvert(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void billConvert(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_MIGRWORKINFODataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_A_MIGRWORKINFODM dm = new SS_A_MIGRWORKINFODM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setBocd(bocd);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� billConvert ȣ��
        ds = dao.billConvert(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.billConvert(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-����DB���ε� �۾��̷�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoUploadHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKHISTDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

       // DM Setting
        SS_L_MIGRWORKHISTDM dm = new SS_L_MIGRWORKHISTDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBoUploadHstyList ȣ��
        ds = dao.selectBoUploadHstyList(dm);
        req.setAttribute("ds", ds);
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBoUploadHstyList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-����DB���ε� �۾��̷�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBillUploadHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKHISTDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

       // DM Setting
        SS_L_MIGRWORKHISTDM dm = new SS_L_MIGRWORKHISTDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBillUploadHstyList ȣ��
        ds = dao.selectBillUploadHstyList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBillUploadHstyList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoConvertHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKHISTDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

       // DM Setting
        SS_L_MIGRWORKHISTDM dm = new SS_L_MIGRWORKHISTDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBoConvertHstyList ȣ��
        ds = dao.selectBoConvertHstyList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBoConvertHstyList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ �۾��̷�
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBillConvertHstyList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKHISTDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

       // DM Setting
        SS_L_MIGRWORKHISTDM dm = new SS_L_MIGRWORKHISTDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBillConvertHstyList ȣ��
        ds = dao.selectBillConvertHstyList(dm);
        req.setAttribute("ds", ds);

        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBillConvertHstyList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-����DB���ε� �۾�����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoUploadPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKPTCRDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String workno = Util.checkString(req.getParameter("workno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKPTCRDM dm = new SS_L_MIGRWORKPTCRDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setWorkno(workno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBoUploadPtcrList ȣ��
        ds = dao.selectBoUploadPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBoUploadPtcrList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-����DB���ε� �۾�����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBillUploadPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKPTCRDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String workno = Util.checkString(req.getParameter("workno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKPTCRDM dm = new SS_L_MIGRWORKPTCRDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setWorkno(workno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBillUploadPtcrList ȣ��
        ds = dao.selectBillUploadPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBillUploadPtcrList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ �۾�����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBoConvertPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKPTCRDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String workno = Util.checkString(req.getParameter("workno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKPTCRDM dm = new SS_L_MIGRWORKPTCRDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setWorkno(workno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBoConvertPtcrList ȣ��
        ds = dao.selectBoConvertPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBoConvertPtcrList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼�-�����ڷ���ȯ �۾�����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectBillConvertPtcrList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_MIGRWORKPTCRDataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));
        String workclsf = Util.checkString(req.getParameter("workclsf"));
        String workno = Util.checkString(req.getParameter("workno"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_MIGRWORKPTCRDM dm = new SS_L_MIGRWORKPTCRDM();
        dm.setBocd(bocd);
        dm.setWorkclsf(workclsf);
        dm.setWorkno(workno);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectBillConvertPtcrList ȣ��
        ds = dao.selectBillConvertPtcrList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectBillConvertPtcrList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼� ��Ȳ-�ʱ�ȭ��
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initMigInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� initMigInfo ȣ��
        ds = dao.initMigInfo(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome)JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.initMigInfo(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼� ��Ȳ-���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigInfoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // ��������� �Ǽ� DB ������ ��
        SS_L_MIGRWORKINFODataSet ds = null;

        // Request Parameter Processing
        String endcnfmyn = Util.checkString(req.getParameter("endcnfmyn"));
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_L_MIGRWORKINFODM dm = new SS_L_MIGRWORKINFODM();
        dm.setEndcnfmyn(endcnfmyn);
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� selectMigInfoList ȣ��
        ds = dao.selectMigInfoList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.selectMigInfoList(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������-���̱׷��̼� ��Ȳ-����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateMigInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_MIGRWORKINFODataSet ds = null;

        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String bocdary = Util.checkString(req.getParameter("bocdary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_MIGRWORKINFODM dm = new SS_U_MIGRWORKINFODM();
        dm.setIncmgpers(incmgpers);
        dm.setBocdary(bocdary);
        dm.setCheckedary(checkedary);
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO ��ü�� updateMigInfo ȣ��
        ds = dao.updateMigInfo(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSAdmin1100EJBHome home = (SSAdmin1100EJBHome) JNDIManager.getInstance().getHome("SSAdmin1100EJB");
        try {
            SSAdmin1100EJB ejb = home.create();
            ds = ejb.updateMigInfo(dm);
            req.setAttribute("ds", ds);
        } catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
}
