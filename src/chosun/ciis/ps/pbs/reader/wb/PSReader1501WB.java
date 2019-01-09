/***************************************************************************************************
* 파일명   : PSReader1501WB.java
* 기능     : 독자 - 지사배정 처리
* 작성일자 : 2004-03-02
* 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
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
 * 독자-지사배정처리
 */
public class PSReader1501WB{

    /**
     * 지사배정처리 화면을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectAsinExtn_search(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EXTN_ASIN_SEARCHDataSet ds = null;

        //Session에서 얻을 데이타
        String cmpycd    = Util.getSessionParameterValue(req, "cmpycd", true);                                //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String sh_extndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_fr")));               //확장일자(from)
        String sh_extndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_extndt_to")));               //확장일자(to)
        String sh_medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_medicd")));                     //구독매체
        String sh_asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinbocd")));                 //배정지사
        String sh_asinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sh_asinyn")));                     //배정여부
        String pagenostr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));                        //현재페이지

        if (pagenostr.equals(""))   pagenostr = "1";
        long   pageno = Long.parseLong(pagenostr);
        String pagesizestr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));                    //페이지당 보여줄 건수
        if (pagesizestr.equals(""))   pagesizestr = "5";
        long   pagesize = Long.parseLong(pagesizestr);

        //DM 값을 Setting한다.
        PS_L_EXTN_ASIN_SEARCHDM dm = new PS_L_EXTN_ASIN_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setSh_extndt_fr(sh_extndt_fr);                                                                     //확장일자(from)
        dm.setSh_extndt_to(sh_extndt_to);                                                                     //확장일자(to)
        dm.setSh_medicd(sh_medicd);                                                                           //구독매체
        dm.setSh_asinbocd(sh_asinbocd);                                                                       //배정지사
        dm.setSh_asinyn(sh_asinyn);                                                                           //배정여부
        dm.setPageno(pageno);                                                                                 //현재페이지
        dm.setPagesize(pagesize);                                                                             //페이지당 보여줄 건수

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.selectAsinExtn_search(dm);        //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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
     * 지사배정처리 비교대상리스트 화면을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void selectExstRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_L_EXST_RDR_SEARCHDataSet ds = null;

        //추후 Session에서 얻을 데이타
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                           //회사코드
        String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));                     //사용자ID

        //정상적으로 Request로 받을 파라메터
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                                 //확장일자
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                                 //확장번호

        //DM 값을 Setting한다.
        PS_L_EXST_RDR_SEARCHDM dm = new PS_L_EXST_RDR_SEARCHDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setRdr_extndt(rdr_extndt);                                                                         //확장일자
        dm.setRdr_extnno(rdr_extnno);                                                                         //확장번호

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.selectExstRdrList(dm);            //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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
     * 지사배정처리 저장 화면을 위해 기본데이타 Set
     * 조회된 request값을 set한다.
     * @param HttpServletRequest req
     * @param HttpServletResponse res
     * @return void
     */
    public void updateExstRdrList(HttpServletRequest req, HttpServletResponse res) throws AppException{
        PS_U_EXTN_BO_ASINDataSet ds = null;

        //추후 Session에서 얻을 데이타
        String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));                           //회사코드
        String incmgpers = Util.getSessionParameterValue(req, "uid", true);                                   //사용자ID

        //정상적으로 Request로 받을 파라메터
        String listcntstr = Util.checkString(req.getParameter("listcnt"));                                    //총 레코드 카운트
        if (listcntstr.equals(""))   listcntstr = "0";
        long   listcnt = Long.parseLong(listcntstr);

        StringBuffer extnboasinarr = new StringBuffer("");                                                    //확장지사배정 Array

        //확장지사배정 String Array로 구성
        for (int i=0 ; i < listcnt ; i++) {
        	if ("SEL".equals(Util.checkString(req.getParameter("asin_check"+i)))) {
        		extnboasinarr.append("##");
        		extnboasinarr.append(Util.checkString(req.getParameter("rdr_extndt"+i)));                     //확장일자
        		extnboasinarr.append("&&");
        		extnboasinarr.append(Util.checkString(req.getParameter("rdr_extnno"+i)));                     //확장번호
        		extnboasinarr.append("&&");
        		extnboasinarr.append(Util.checkString(req.getParameter("resitypecd"+i)));                     //배정지사
        	}
        }

        extnboasinarr.delete(0,2);          //처음 ## 제거

        //DM 값을 Setting한다.
        PS_U_EXTN_BO_ASINDM dm = new PS_U_EXTN_BO_ASINDM();
        dm.setCmpycd(cmpycd);                                                                                 //회사코드
        dm.setIncmgpers(incmgpers);                                                                           //사용자ID
        dm.setExtnboasinarr(extnboasinarr.toString());                                                        //확장지사배정 Array

        PSReader1501EJBHome home = (PSReader1501EJBHome)JNDIManager.getInstance().getHome("PSReader1501EJB");

        try{
            PSReader1501EJB ejb = home.create();
            ds = ejb.updateExstRdrList(dm);            //설정된 dm값으로 EJB를 호출한다.
            req.setAttribute("ds", ds);                //request에 결과값을 담는다.
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
