/***************************************************************************************************
 * 파일명 : SSBrsup1000WB.java
 * 기능 : 지국지원-신문지원물품-등록,입고,신청을 위한 Worker Bean
 * 작성일자 : 2004-01-20
 * 작성자 : 김대섭
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.wb;

import javax.ejb.*;

import java.io.*;

import java.rmi.*;
import java.util.Hashtable;

import javax.servlet.http.*;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import oracle.sql.BLOB;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.dao.*;

/**
 * 지국지원-신문지원물품-등록,입고,신청을 위한 WB
 */

public class SSBrsup1000WB {
	
	public int filesize = 5*1024*1024;
	
    /**
     * 지국지원-신문지원물품-등록-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initNwspItem(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CDLSTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWSPITEM_CDLSTDM dm = new SS_L_NWSPITEM_CDLSTDM();
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 initNwspItem 호출
        ds = dao.initNwspItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.initNwspItem(dm);
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
     * 지국지원-신문지원물품-물품-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemClsfList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CLSFDataSet ds = null;
        // Request Parameter Processing
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));

        // DM Setting
        SS_L_NWSPITEM_CLSFDM dm = new SS_L_NWSPITEM_CLSFDM();
        dm.setItemclsf(itemclsf);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemClsfList 호출
        ds = dao.selectNwspItemClsfList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemClsfList(dm);
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
     * 지국지원-신문지원물품-등록-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMDataSet ds = null;
        // Request Parameter Processing
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String sendclsf = Util.checkString(req.getParameter("sendclsf"));
        String costclsf = Util.checkString(req.getParameter("costclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_NWSPITEMDM dm = new SS_L_NWSPITEMDM();
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        dm.setSendclsf(sendclsf);
        dm.setCostclsf(costclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemList 호출
        ds = dao.selectNwspItemList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemList(dm);
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
     * 지국지원-신문지원물품-등록-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_NWSPITEMDataSet ds = null;
        // Request Parameter Processing
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        
        // DM Setting
        SS_S_NWSPITEMDM dm = new SS_S_NWSPITEMDM();
        dm.setItemcd(itemcd);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemDetail 호출
        ds = dao.selectNwspItemDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemDetail(dm);
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
    
    // 요기부터 수정
    /**
     * 지국Info-지국장정보-사진
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectThunbnail(HttpServletRequest req, HttpServletResponse res) throws AppException{
        byte[] thumbnail = null;

        // Request Parameter Processing
        String itemcdStr = Util.checkString(req.getParameter("itemcd"));
        long itemcd = Long.parseLong(itemcdStr);
                
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectBoheadDetail 호출
    	thumbnail = dao.selectThunbnail(itemcd);
    	req.setAttribute("thumbnail", thumbnail);
    	
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome)JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try{
        	SSBrsup1000EJB ejb = home.create();
            thumbnail = ejb.selectThunbnail(itemcd);
            req.setAttribute("thumbnail", thumbnail);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    /**
     * 지국Info-지국장정보-사진
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     **/
    public void selectpopup(HttpServletRequest req, HttpServletResponse res) throws AppException{
        byte[] popup = null;
        // Request Parameter Processing
        String itemcdStr = Util.checkString(req.getParameter("itemcd"));
        long itemcd = Long.parseLong(itemcdStr);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectBoheadDetail 호출
    	popup = dao.selectPopup(itemcd);
    	req.setAttribute("popup", popup);
        
    	/*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome)JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try{
        	SSBrsup1000EJB ejb = home.create();
        	popup = ejb.selectPopup(itemcd);
            req.setAttribute("popup", popup);
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }
    

    /**
     * 지국지원-신문지원물품-등록-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateNwspItem(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_NWSPITEMDataSet ds = null;
        // Session Processing

        PrintWriter out = null;
        //PrintWriter out = null;
        Hashtable ht = new Hashtable();

//        FileInputStream thumbnail = null;
//        FileInputStream popup = null;
        byte[] thumbnail = null;
        byte[] popup = null;
        
        //int thumbnailsize = 0;
        //int popupsize = 0;
        
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, filesize,  true, true);
            Part part = null;
            FilePart filePart = null;
            ParamPart parampart = null;
            //String parmName = null;
            //String parmValue = null;

            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {
            	
                if (part.isFile()) {
                	System.out.println("count::::" + i);
                    filePart = (FilePart) part;
                    //파일을 첨부했을 경우
                    if(filePart.getFileName() != null){
                    	System.out.println("filename::::" + filePart.getFileName());
                    	System.out.println("Name()::::" + filePart.getName());
	                    
                    	ht.put(part.getName(), filePart.getFileName());
                    	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);

                    	//File file = new File(filePart.getInputStream());
                    	//System.out.println("Name, length::::" + file.getName() + ":" + file.length());
	                    // 썸네일 파이일일 경우
	                    if (filePart.getName().equals("thumbnail")) {
	                    	thumbnail = byteArrayOutputStream.toByteArray();
	                    	//thumbnail = filePart.getInputStream();
	                    	//thumbnailsize = (int)file.length();
	                    	System.out.println("FileSize::::" + filesize + ":" + thumbnail.length);
	                    }
	                    if (filePart.getName().equals("popup")) {
	                    	popup = byteArrayOutputStream.toByteArray();
		                    //popup = new FileInputStream(file);	                    	
	                    	//popupsize = (int)file.length();
	                    	System.out.println("FileSize::::" + filesize + ":" + popup.length);
	                    }
                    }
                    //파일을 첨부하지 않았을 경우
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (IOException e) {
        	
            throw new AppException("[SSShare1100WB.updateNwspItem()]","[SSShare1100WB.updateNwspItem()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        	//throw new AppException("[SSShare1100WB.updateNwspItem()]", e.getMessage());

        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        
        
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        String itemcd           = Util.checkString((String)ht.get("itemcd"));
        String quntStr          = Util.checkString((String)ht.get("qunt"));
        long   qunt             = Long.parseLong(quntStr);
        String uprcStr          = Util.checkString((String)ht.get("uprc"));
        long   uprc             = Long.parseLong(uprcStr);
        String rcpmchrgpersclsf = Util.checkString((String)ht.get("rcpmchrgpersclsf"));        
        String unit             = Util.checkString((String)ht.get("unit"));
        String clamchrgpersclsf = Util.checkString((String)ht.get("clamchrgpersclsf"));
        String itemclsf         = Util.checkString((String)ht.get("itemclsf"));        
        String sendclsf         = Util.checkString((String)ht.get("sendclsf"));        
        String costclsf         = Util.checkString((String)ht.get("costclsf"));
        String aplcfrdt         = Util.checkString((String)ht.get("aplcfrdt"));        
        String aplctodt         = Util.checkString((String)ht.get("aplctodt"));
        String aplcclostm       = Util.checkString((String)ht.get("aplcclostm"));
        String remk             = Util.checkString((String)ht.get("remk"));
        
        System.out.println("itemcd::::" + itemcd);
        //-----------------------------------------------------------------
        // Request Parameter Processing
        /*
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String quntStr = Util.checkString(req.getParameter("qunt"));
        long qunt = Long.parseLong(quntStr);
        String uprcStr = Util.checkString(req.getParameter("uprc"));
        long uprc = Long.parseLong(uprcStr);
        String rcpmchrgpersclsf = Util.checkString(req.getParameter("rcpmchrgpersclsf"));
        String unit = Util.checkString(req.getParameter("unit"));
        String clamchrgpersclsf = Util.checkString(req.getParameter("clamchrgpersclsf"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String sendclsf = Util.checkString(req.getParameter("sendclsf"));
        String costclsf = Util.checkString(req.getParameter("costclsf"));
        String aplcfrdt = Util.checkString(req.getParameter("aplcfrdt"));
        String aplctodt = Util.checkString(req.getParameter("aplctodt"));
        String aplcclostm = Util.checkString(req.getParameter("aplcclostm"));
        String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
        
        */
        

        // DM Setting
        SS_U_NWSPITEMDM dm = new SS_U_NWSPITEMDM();
        dm.setIncmgpers(incmgpers);
        dm.setItemcd(itemcd);
        dm.setQunt(qunt);
        dm.setUprc(uprc);
        dm.setRcpmchrgpersclsf(rcpmchrgpersclsf);
        dm.setUnit(unit);
        dm.setClamchrgpersclsf(clamchrgpersclsf);
        dm.setItemclsf(itemclsf);
        dm.setSendclsf(sendclsf);
        dm.setCostclsf(costclsf);
        dm.setAplcfrdt(aplcfrdt);
        dm.setAplctodt(aplctodt);
        dm.setAplcclostm(aplcclostm);
        dm.setRemk(remk);
        System.out.println("thumbnail::::" + thumbnail);
        System.out.println("popup::::" + popup);
        if (thumbnail != null) {
        	//dm.setThumbnail(thumbnail);
        	//dm.setThumbnailSize(thumbnailsize);
        	dm.setThumbnail(thumbnail);
        }        
        if (popup != null) {
        	//dm.setPopup(popup);
        	//dm.setThumbnailSize(popupsize);
        	dm.setPopup(popup);
        }
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 updateNwspItem 호출
        ds = dao.updateNwspItem(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.updateNwspItem(dm);
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
     * 지국지원-신문지원물품-입고-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initNwspItemEwh(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CDLSTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWSPITEM_CDLSTDM dm = new SS_L_NWSPITEM_CDLSTDM();
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 initNwspItemEwh 호출
        ds = dao.initNwspItemEwh(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.initNwspItemEwh(dm);
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
     * 지국지원-신문지원물품-입고-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemEwhList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMEWHDataSet ds = null;
        // Request Parameter Processing
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String sendclsf = Util.checkString(req.getParameter("sendclsf"));
        String costclsf = Util.checkString(req.getParameter("costclsf"));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_L_NWSPITEMEWHDM dm = new SS_L_NWSPITEMEWHDM();
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        dm.setSendclsf(sendclsf);
        dm.setCostclsf(costclsf);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemEwhList 호출
        ds = dao.selectNwspItemEwhList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemEwhList(dm);
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
     * 지국지원-신문지원물품-입고-상세
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemEwhDetail(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_S_NWSPITEMEWHDataSet ds = null;
        // Request Parameter Processing
        String ewhdt = Util.checkString(req.getParameter("ewhdt"));
        String ewhno = Util.checkString(req.getParameter("ewhno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        // DM Setting
        SS_S_NWSPITEMEWHDM dm = new SS_S_NWSPITEMEWHDM();
        dm.setEwhdt(ewhdt);
        dm.setEwhno(ewhno);
        dm.setItemcd(itemcd);

        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemEwhDetail 호출
        ds = dao.selectNwspItemEwhDetail(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemEwhDetail(dm);
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
     * 지국지원-신문지원물품-입고-등록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void insertNwspItemEwh(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMEWHDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ewhdt = Util.checkString(req.getParameter("ewhdt"));
        String ewhno = Util.checkString(req.getParameter("ewhno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String ewhquntStr = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhqunt")));
        long ewhqunt = Long.parseLong(ewhquntStr);
        // DM Setting
        SS_A_NWSPITEMEWHDM dm = new SS_A_NWSPITEMEWHDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setEwhdt(ewhdt);
        dm.setEwhno(ewhno);
        dm.setItemcd(itemcd);
        dm.setEwhqunt(ewhqunt);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 insertNwspItemEwh 호출
        ds = dao.insertNwspItemEwh(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.insertNwspItemEwh(dm);
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
     * 지국지원-신문지원물품-입고-수정
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateNwspItemEwh(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMEWHDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ewhdt = Util.checkString(req.getParameter("ewhdt"));
        String ewhno = Util.checkString(req.getParameter("ewhno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String ewhquntStr = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhqunt")));
        long ewhqunt = Long.parseLong(ewhquntStr);
        // DM Setting
        SS_A_NWSPITEMEWHDM dm = new SS_A_NWSPITEMEWHDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setEwhdt(ewhdt);
        dm.setEwhno(ewhno);
        dm.setItemcd(itemcd);
        dm.setEwhqunt(ewhqunt);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 updateNwspItemEwh 호출
        ds = dao.updateNwspItemEwh(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.updateNwspItemEwh(dm);
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
     * 지국지원-신문지원물품-입고-삭제
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void deleteNwspItemEwh(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_A_NWSPITEMEWHDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String accflag = Util.checkString(req.getParameter("accflag"));
        String ewhdt = Util.checkString(req.getParameter("ewhdt"));
        String ewhno = Util.checkString(req.getParameter("ewhno"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        // DM Setting
        SS_A_NWSPITEMEWHDM dm = new SS_A_NWSPITEMEWHDM();
        dm.setIncmgpers(incmgpers);
        dm.setAccflag(accflag);
        dm.setEwhdt(ewhdt);
        dm.setEwhno(ewhno);
        dm.setItemcd(itemcd);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 deleteNwspItemEwh 호출
        ds = dao.deleteNwspItemEwh(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.deleteNwspItemEwh(dm);
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
     * 지국지원-신문지원물품-신청-초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initNwspItemAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEM_CDLSTDataSet ds = null;
        // Request Parameter Processing
        // String XXX = req.getParameter("XXX");
        // DM Setting
        SS_L_NWSPITEM_CDLSTDM dm = new SS_L_NWSPITEM_CDLSTDM();
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 initNwspItemAplc 호출
        ds = dao.initNwspItemAplc(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.initNwspItemAplc(dm);
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
     * 지국지원-신문지원물품-신청-목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void selectNwspItemAplcList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMAPLCDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));
        String closyn = Util.checkString(req.getParameter("closyn"));

        // DM Setting
        SS_L_NWSPITEMAPLCDM dm = new SS_L_NWSPITEMAPLCDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        dm.setClosyn(closyn);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 selectNwspItemAplcList 호출
        ds = dao.selectNwspItemAplcList(dm);
        req.setAttribute("ds", ds);
        
        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.selectNwspItemAplcList(dm);
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
     * 지국지원-신문지원물품-신청-저장
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void updateNwspItemAplc(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_U_NWSPITEMAPLCDataSet ds = null;
        // Session Processing
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);

        // Request Parameter Processing
        String aplcdtary = Util.checkString(req.getParameter("aplcdtary"));
        String aplcnoary = Util.checkString(req.getParameter("aplcnoary"));
        String itemcdary = Util.checkString(req.getParameter("itemcdary"));
        String aplcquntary = Util.checkString(req.getParameter("aplcquntary"));
        String checkedary = Util.checkString(req.getParameter("checkedary"));

        // DM Setting
        SS_U_NWSPITEMAPLCDM dm = new SS_U_NWSPITEMAPLCDM();
        dm.setIncmgpers(incmgpers);
        dm.setAplcdtary(aplcdtary);
        dm.setAplcnoary(aplcnoary);
        dm.setItemcdary(itemcdary);
        dm.setAplcquntary(aplcquntary);
        dm.setCheckedary(checkedary);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 updateNwspItemAplc 호출
        ds = dao.updateNwspItemAplc(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.updateNwspItemAplc(dm);
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
     * 지국지원-신문지원물품-신청-인쇄
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void printNwspItemList(HttpServletRequest req, HttpServletResponse res) throws AppException {
        SS_L_NWSPITEMSEND_PRINTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String partcd = Util.checkString(req.getParameter("partcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bocd = Util.checkString(req.getParameter("bocd"));
        String frdt = Util.checkString(req.getParameter("frdt"));
        String todt = Util.checkString(req.getParameter("todt"));
        String itemcd = Util.checkString(req.getParameter("itemcd"));
        String itemclsf = Util.checkString(req.getParameter("itemclsf"));

        // DM Setting
        SS_L_NWSPITEMSEND_PRINTDM dm = new SS_L_NWSPITEMSEND_PRINTDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setItemcd(itemcd);
        dm.setItemclsf(itemclsf);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 printNwspItemList 호출
        ds = dao.printNwspItemList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.printNwspItemList(dm);
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
     * 지국지원-신문지원물품-신청-출고등록 
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    
    public void outNwspItemList(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	SS_I_NWSPITEMSEND_BNSOUTDataSet ds = null;
        // Request Parameter Processing
    	String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true); 	//회사코드
   		String incmgpers = Util.getSessionParameterValue(req, "uid", true); 	//입력자아이디
   		String chgpers = Util.getSessionParameterValue(req, "uid", true);       //변경자 아이디
   		
    	String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
    	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
    	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
    	String inoutdt = Util.Uni2Ksc(Util.checkString(req.getParameter("inoutdt")));
    	String valqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("valqunt")));
    	String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
    	String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
    	String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));

        // DM Setting
        SS_I_NWSPITEMSEND_BNSOUTDM dm = new SS_I_NWSPITEMSEND_BNSOUTDM();
        dm.setCmpycd(cmpycd);
        dm.setIncmgpers(incmgpers);
        dm.setChgpers(chgpers);
        dm.setBns_itemcd(bns_itemcd);
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setInoutdt(inoutdt);
        dm.setValqunt(valqunt);
        dm.setUprc(uprc);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        
        SSBrsup1000DAO dao = new SSBrsup1000DAO();
        // DAO 객체의 printNwspItemList 호출
        ds = dao.outNwspItemList(dm);
        req.setAttribute("ds", ds);

        /*
        SSBrsup1000EJBHome home = (SSBrsup1000EJBHome) JNDIManager.getInstance().getHome("SSBrsup1000EJB");
        try {
            SSBrsup1000EJB ejb = home.create();
            ds = ejb.outNwspItemList(dm);
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