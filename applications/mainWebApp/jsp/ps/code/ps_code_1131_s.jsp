<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_code_1131_s.jsp
* 기능     : 매체 상세내역
* 작성일자 : 2004-09-21
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    PS_S_SEPBK_INFODataSet ds = (PS_S_SEPBK_INFODataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
	rxw.makeDataToBulk(ds, "sepbkinfo", acctTemp, "detailData");
	
	rxw.flush(out);
	
	// data가 없을 경우 처리. 추가 필요.
	    
	// page 처리. 추가 필요.

/*
    // 구독자정보 dataset
    PS_S_SEPBK_INFOSEPBKINFORecord sepbkinfoRec = null;
    boolean  sepbkChk = false;            //매체 정보 유무체크

    if (ds.sepbkinfo.size() > 0) {
        sepbkinfoRec = (PS_S_SEPBK_INFOSEPBKINFORecord)ds.sepbkinfo.get(0);
        sepbkChk  =  true;
    }
*/    
/*    
    System.out.println("=================== sepbkinfoRec.sep_bookcdnm =========: " + sepbkinfoRec.sep_bookcdnm );
    System.out.println("=================== sepbkinfoRec.medicd =========: " + sepbkinfoRec.medicd );
    System.out.println("=================== sepbkinfoRec.mediser_no =========: " + sepbkinfoRec.mediser_no );
    System.out.println("=================== sepbkinfoRec.medi_clsf =========: " + sepbkinfoRec.medi_clsf );
    System.out.println("=================== sepbkinfoRec.issuclsf =========: " + sepbkinfoRec.issuclsf );
    System.out.println("=================== sepbkinfoRec.basiyymm =========: " + sepbkinfoRec.basiyymm );
    System.out.println("=================== sepbkinfoRec.uprc =========: " + sepbkinfoRec.uprc );
    System.out.println("=================== sepbkinfoRec.subsuprc =========: " + sepbkinfoRec.subsuprc );
    System.out.println("=================== sepbkinfoRec.dcrate =========: " + sepbkinfoRec.dcrate );
    System.out.println("=================== sepbkinfoRec.contclascd =========: " + sepbkinfoRec.contclascd );
    System.out.println("=================== sepbkinfoRec.author =========: " + sepbkinfoRec.author );
    System.out.println("=================== sepbkinfoRec.type =========: " + sepbkinfoRec.type );
    System.out.println("=================== sepbkinfoRec.std =========: " + sepbkinfoRec.std );
    System.out.println("=================== sepbkinfoRec.page =========: " + sepbkinfoRec.page );
    System.out.println("=================== sepbkinfoRec.covermodl =========: " + sepbkinfoRec.covermodl );
    System.out.println("=================== sepbkinfoRec.reg_dt =========: " + sepbkinfoRec.reg_dt );
    System.out.println("=================== sepbkinfoRec.extdtms =========: " + sepbkinfoRec.extdtms );
    System.out.println("=================== sepbkinfoRec.absenceyn =========: " + sepbkinfoRec.absenceyn );
    System.out.println("=================== sepbkinfoRec.absencedt =========: " + sepbkinfoRec.absencedt );
    System.out.println("=================== sepbkinfoRec.absenceprocdt =========: " + sepbkinfoRec.absenceprocdt );
    System.out.println("=================== sepbkinfoRec.bundunit =========: " + sepbkinfoRec.bundunit );
    System.out.println("=================== sepbkinfoRec.unitmidlqunt =========: " + sepbkinfoRec.unitmidlqunt );
    System.out.println("=================== sepbkinfoRec.pjbasimidlqunt =========: " + sepbkinfoRec.pjbasimidlqunt );
    System.out.println("=================== sepbkinfoRec.sericd =========: " + sepbkinfoRec.sericd );
    System.out.println("=================== sepbkinfoRec.endbasiyymm =========: " + sepbkinfoRec.endbasiyymm );
    System.out.println("=================== sepbkinfoRec.memo =========: " + sepbkinfoRec.memo );
    System.out.println("=================== sepbkinfoRec.sep_bookcd =========: " + sepbkinfoRec.sep_bookcd );
    System.out.println("=================== sepbkinfoRec.cmpycd =========: " + sepbkinfoRec.cmpycd );
    System.out.println("=================== sepbkinfoRec.medicd =========: " + sepbkinfoRec.medicd );
*/    
%>

