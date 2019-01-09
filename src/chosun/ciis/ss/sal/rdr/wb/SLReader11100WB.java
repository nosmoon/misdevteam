/***************************************************************************************************
* 파일명 : SSReader11100WB.java_모바일용
* 기능 : 독자현황-독자정보 처리를 위한 Worker Bean
* 작성일자 : 2016-12-06
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ss.sal.rdr.dao.SLReader11100DAO;
import chosun.ciis.ss.sal.rdr.dm.SL_L_SUBS_CNTR_STOP_HISTDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_MOVM_RDRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_NWSPSUBSCNTRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_READERDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_VSPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_S_RDR_INFODM;
import chosun.ciis.ss.sal.rdr.ds.SL_L_SUBS_CNTR_STOP_HISTDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_MOVM_RDRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_NWSPSUBSCNTRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_READERDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_VSPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_S_RDR_INFODataSet;

/**
 * 독자현황-독자정보를 위한 WB
 */

public class SLReader11100WB{

	/**
	 * 독자정보관리(독자목록검색) //모바일용
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 *
	 */
	public void mo_selectReaderList(HttpServletRequest req, HttpServletResponse res) //모바일용
			throws AppException {

		String bocd =  req.getParameter("bocd"); // 지국지사코드

		String search_order = Util.checkString(req.getParameter("search_order")); // 검색정렬조건
		String search_ad = Util.checkString(req.getParameter("search_ad")); // 검색
		// asc,
		// desc
		String search_cond = Util.checkString(req.getParameter("search_cond")); // 검색
		// 조건검색조건('ALL':통합검색,
		// 'DSTC':구역코드,
		// 'DSNO':구역+배달,
		// 'NO':독자번호,
		// 'NM':독자명,
		// 'ADDR':상세주소,
		// 'ADDRS':주소전체,
		// 'TEL':전화번호,
		// 'EMAIL':이메일,
		// 'PRVNO':전(前)독자번호
		// '':전체)
		String search_pttn = Util.checkString(req.getParameter("search_pttn")); // 통합(전체)검색시
		// 검색어의
		// 패턴('1':구역,
		// '2':구역+배달,
		// '3':독자번호,
		// '4':독자명,
		// '5':주소,
		// '6':전화번호)
		String search_word = Util.Uni2Ksc(Util.checkString(req
				.getParameter("search_word"))); // 검색어
		String search_stop = Util.checkString(req.getParameter("search_stop")); // 검색시
		// 중지ㅈ독자
		// 포함
		// 여부
		String pageno = Util.checkString(req.getParameter("pageno")); // 페이지번호
		String pagesize = Util.checkString(req.getParameter("pagesize")); // 한페이지당
		// 레코드수(페이지사이즈)

		// setting dm
		SL_MO_L_READERDM dm = new SL_MO_L_READERDM();

		pageno = ("".equals(pageno)) ? "1" : pageno;
		pagesize = ("".equals(pagesize)) ? "3" : pagesize;

		dm.setBocd(bocd);
		dm.setSearch_order(search_order);
		dm.setSearch_ad(search_ad);
		dm.setSearch_cond(search_cond);
		dm.setSearch_pttn(search_pttn);
		dm.setSearch_word(search_word);
		dm.setSearch_stop(search_stop);
		// dm.setPageno(Long.parseLong(pageno));
		// dm.setPagesize(Long.parseLong(pagesize));
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		SL_MO_L_READERDataSet ds = null;

		SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectReaderList(dm);
        req.setAttribute("ds", ds);

	}

	/**
	 * 독자정보관리(독자상세보기)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 *
	 */
	public void mo_selectReaderDetail(HttpServletRequest req,    //모바일용 SP_SL_S_RDR_INFO 프로시저 참조
			HttpServletResponse res) throws AppException {

		// parameter requesting 하고 DM에 값을 Setting
		String bocd =  req.getParameter("bocd"); // 지국지사코드
		String rdr_no = Util.checkString(req.getParameter("rdr_no")); // 독자번호
		String medicd = Util.checkString(req.getParameter("medicd")); // 매체코드
		String basiyymm = Util.checkString(req.getParameter("basiyymm")); // 수금내역의
		// 검색기준년월

		SL_MO_S_RDR_INFODM dm = new SL_MO_S_RDR_INFODM();
		dm.setBocd(bocd);
		dm.setRdr_no(rdr_no);
		dm.setMedicd(medicd);
		dm.setBasiyymm(basiyymm);

		dm.print();

		SL_MO_S_RDR_INFODataSet ds = null;

		SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectReaderDetail(dm);

        req.setAttribute("ds", ds);

	}

    /**
     * 독자정보관리(구독내역팝업-구독내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectSubsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호
        String frdt = Util.checkString(req.getParameter("frdt"));				//검색 시작일
        String todt = Util.checkString(req.getParameter("todt"));				//검색 종료일
        String medicd = Util.checkString(req.getParameter("medicd"));			//매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.checkString(req.getParameter("pageno"));			//페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));		//페이지사이즈

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_NWSPSUBSCNTRPTCRDM dm = new SL_MO_L_NWSPSUBSCNTRPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectSubsHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding
    }

    /**
     * 독자정보관리(구독내역팝업-휴독내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectStopsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_VSPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//독자번호
        String frdt = Util.checkString(req.getParameter("frdt"));				//검색 시작일
        String todt = Util.checkString(req.getParameter("todt"));               //검색 종료일
        String medicd = Util.checkString(req.getParameter("medicd"));           //매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.checkString(req.getParameter("pageno"));           //페이지번호
        String pagesize = Util.checkString(req.getParameter("pagesize"));       //페이지사이즈

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_VSPTCRDM dm = new SL_MO_L_VSPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectStopsHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

    }

    /**
     * 독자정보관리(구독내역팝업-이사내역목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectMoveHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_MOVM_RDRPTCRDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));		//독자번호
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));         //검색 시작일
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));         //검색 종료일
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));     //매체코드(들)  ('##' 으로 연결된 여러 매체코드 일 수 있음)
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));     //페이지번호
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //페이지사이즈


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_MOVM_RDRPTCRDM dm = new SL_MO_L_MOVM_RDRPTCRDM();

        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectMoveHistoryList(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding

        /*
        // JNDI lookup 을 통해 EJB Home interface 객체생성
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDRPTCRDataSet ds = null;
            ds = ejb.selectMoveHistoryList(dm); // 설정된 dm값으로 EJB를 호출
            req.setAttribute("ds", ds); // request에 결과값을 Binding
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
     * 독자정보관리(중지내역팝업-목록조회)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectStopHist(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일용

    	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
        // parameter requesting 하고  DM에 값을 Setting
        String bocd = Util.checkString(req.getParameter("bocd"));		//독자번호
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//독자번호
        String medicd = Util.checkString(req.getParameter("medicd"));

        SL_L_SUBS_CNTR_STOP_HISTDM dm = new SL_L_SUBS_CNTR_STOP_HISTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectStopHist(dm);
        req.setAttribute("ds", ds); // request에 결과값을 Binding


    }



}