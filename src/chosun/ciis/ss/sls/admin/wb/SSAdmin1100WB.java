/***************************************************************************************************
 * 파일명 : SSAdmin1100WB.java
 * 기능 : 관리자-마이그레이션을 위한 Worker Bean
 * 작성일자 : 2004-03-12
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
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
 * 관리자-마이그레이션을 위한 WB
 */

public class SSAdmin1100WB {

    /**
     * 관리자-마이그레이션-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initMig(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 initMig 호출
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
     * 관리자-마이그레이션-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // 목록이지만 실세 DB 쿼리는 상세
        SS_S_MIGRWORKINFODataSet ds = null;

        // Request Parameter Processing
        String bocd = Util.checkString(req.getParameter("bocd"));

        // DM Setting
        SS_S_MIGRWORKINFODM dm = new SS_S_MIGRWORKINFODM();
        dm.setBocd(bocd);

        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 selectMigList 호출
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
     * 관리자-마이그레이션-지국DB업로드
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
/*  사용안하는 것으로 판단하고 주석처리함. ejb 안쓰는데 정리하기 까다로움	 20171213 심정보
    public void boUpload(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
        String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));

        // DM Setting
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 boUpload 호출
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
    * 관리자-마이그레이션-지국DB업로드 에러 확인
    *   DM, DataSet을 사용하지 않는다.(프로시저 호출이 아닌 파일 IO로 처리
    *   EJB를 호출하지 않고 WB에서 파일 IO를 바로 처리
    * @param req HttpServletRequest
    * @param res HttpServletResponse
    * @throws AppException
    **/
   public void showError(HttpServletRequest req, HttpServletResponse res) throws AppException {

        // Request Parameter Processing
        String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));

        if(bocd == null || "".equals(bocd)){
            throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] 지국코드가 존재하지 않습니다.");
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
            // 로그파일 상위 경로
            String mainDir = (String) p.get("MIG.BOUPLOAD.DIR");
            String badDir = (String) p.get("MIG.BAD.DIR");
            String logDir = (String) p.get("MIG.LOG.DIR");
            String badFileExt = (String) p.get("MIS.BAD.FILEEXT");
            String logFileExt = (String) p.get("MIS.LOG.FILEEXT");

            // StringBuffer 객체 생성
           StringBuffer badBuffer = new StringBuffer("");
           StringBuffer logBuffer = new StringBuffer("");


           // bad 파일 디렉토리 객체 생성
            File badFileDir = new File(mainDir+bocd+"//"+badDir);
            // bad 파일 객체들 생성
            File badFiles[] = badFileDir.listFiles();

            // .bad 파일 확인
            if(badFiles.length == 0){
                throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] "+bocd+" 지국의 bad 파일이 존재하지 않습니다.");
            }

            // bad 파일 내용 묶기
            for(int i=0; i<badFiles.length; i++){
                // bad 파일 내용 읽기
                BufferedReader badBR = new BufferedReader(new FileReader(badFiles[i]));
                badBuffer.append("File 명 : "+badFiles[i].getName()+"\n");
                badBuffer.append("-----------------------------------------------------"+"\n");
                String line = null;
                while( (line = badBR.readLine()) != null){
                    badBuffer.append(line+"\n");
                }
                badBuffer.append("-----------------------------------------------------"+"\n\n");
            }


            // log 파일 디렉토리 객체 생성
            File logFileDir = new File(mainDir+bocd+"//"+logDir);
            // log 파일 객체들 생성
            File logFiles[] = logFileDir.listFiles();

            // log 파일 내용 묶기(bad 파일이 존재하는 경우에만)
            for(int i=0; i<logFiles.length; i++){
                for(int j=0; j<badFiles.length; j++){
                    // 두 파일의 확장자를 제외한 이름을 비교하여 같은 경우만 내용을 묶는다.
                    String logTemp = logFiles[i].getName().substring(0, logFiles[i].getName().indexOf("."));
                    String badTemp = badFiles[j].getName().substring(0, badFiles[j].getName().indexOf("."));
System.out.println("logTemp : "+logTemp);
System.out.println("badTemp : "+badTemp);
                    if(logTemp.trim().equals(badTemp.trim())){
                        // log 파일 내용 읽기
                        BufferedReader logBR = new BufferedReader(new FileReader(logFiles[i]));
                        logBuffer.append("File 명 : "+logFiles[i].getName()+"\n");
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
            throw new AppException("[SSAdmin1100WB.showError()]","[SSAdmin1100WB.showError()] 에러확인을 위한 설정파일을 찾을 수 없습니다.");
        }
   }


    /**
     * 관리자-마이그레이션-빌링DB업로드
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
        빌링업로드는 작업상태,작업이력,작업내역 처리를 EJB-DAO에서 빌링업로드와는 상관없이 처리해야 하므로 CMT(Container Managed Tranaction)
        는 적합하지 않다. 빌링업로드는 별도의 EJB로 처리한다.
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
        // 빌링업로드는 BMT(Bean Managed Transaction)로 처리된다.
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 billUpload 호출
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
     * 관리자-마이그레이션-지국자료전환
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
        // DAO 객체의 boConvert 호출
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
     * 관리자-마이그레이션-빌링자료전환
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
        // DAO 객체의 billConvert 호출
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
     * 관리자-마이그레이션-지국DB업로드 작업이력
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
        // DAO 객체의 selectBoUploadHstyList 호출
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
     * 관리자-마이그레이션-빌링DB업로드 작업이력
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
        // DAO 객체의 selectBillUploadHstyList 호출
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
     * 관리자-마이그레이션-지국자료전환 작업이력
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
        // DAO 객체의 selectBoConvertHstyList 호출
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
     * 관리자-마이그레이션-빌링자료전환 작업이력
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
        // DAO 객체의 selectBillConvertHstyList 호출
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
     * 관리자-마이그레이션-지국DB업로드 작업내역
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
        // DAO 객체의 selectBoUploadPtcrList 호출
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
     * 관리자-마이그레이션-빌링DB업로드 작업내역
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
        // DAO 객체의 selectBillUploadPtcrList 호출
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
     * 관리자-마이그레이션-지국자료전환 작업내역
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
        // DAO 객체의 selectBoConvertPtcrList 호출
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
     * 관리자-마이그레이션-빌링자료전환 작업내역
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
        // DAO 객체의 selectBillConvertPtcrList 호출
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
     * 관리자-마이그레이션 현황-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initMigInfo(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWBUSEOCDDataSet ds = null;

        // DM Setting
        SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();
        
        SSAdmin1100DAO dao = new SSAdmin1100DAO();
        // DAO 객체의 initMigInfo 호출
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
     * 관리자-마이그레이션 현황-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectMigInfoList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        // 목록이지만 실세 DB 쿼리는 상세
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
        // DAO 객체의 selectMigInfoList 호출
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
     * 관리자-마이그레이션 현황-저장
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
        // DAO 객체의 updateMigInfo 호출
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
