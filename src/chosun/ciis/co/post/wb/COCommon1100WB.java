/***************************************************************************************************
* 파일명 : SSCommon1100WB.java
* 기능 : 부서,지역 등 공통 Worker Bean
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
 * 판매국 공통 업무를 위한 WB
 */
public class COCommon1100WB{

    /**
     * 우편번호검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException, SQLException {
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//지국지사코드
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//동명
        String zip = Util.checkString(req.getParameter("zip"));						//우편번호
        String pageno = Util.checkString(req.getParameter("pageno"));				//현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//페이지사이즈

        CO_L_ZIPDM dm = new CO_L_ZIPDM();
        dm.setBocd(bocd); // 지국지사코드
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        // JNDI lookup 을 통해 EJB Home interface 객체생성
        /*
        COCommon1100EJBHome home = (COCommon1100EJBHome)JNDIManager.getInstance().getHome("COCommon1100EJB");
        try{
            COCommon1100EJB ejb = home.create();
            CO_L_ZIPDataSet ds = null;
            ds = ejb.selectZipList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 우편번호검색(목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    // 가동지국을 조인하지 않고 모든 주소를 조회하는 주소팝업창 추가개발(20090827 권정윤)
    // url부터 프로시져까지 완전분리
    public void selectZipListAll(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException, SQLException {
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//지국지사코드
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//동명
        String zip = Util.checkString(req.getParameter("zip"));						//우편번호
        String pageno = Util.checkString(req.getParameter("pageno"));				//현재 페이지
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//페이지사이즈

        CO_L_ZIP_ALLDM dm = new CO_L_ZIP_ALLDM();
        dm.setBocd(bocd); // 지국지사코드
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        // JNDI lookup 을 통해 EJB Home interface 객체생성
        /*
        COCommon1100EJBHome home = (COCommon1100EJBHome)JNDIManager.getInstance().getHome("COCommon1100EJB");
        try{
            COCommon1100EJB ejb = home.create();
            CO_L_ZIP_ALLDataSet ds = null;
            ds = ejb.selectZipListAll(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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

/* 작성시간 : Wed Nov 19 14:40:01 KST 2003 */
