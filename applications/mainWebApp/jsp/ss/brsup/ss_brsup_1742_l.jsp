<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1742_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청관리-신청목록
* 작성일자 : 2004-03-26
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-16
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLCDataSet ds = (SS_L_APLCDataSet)request.getAttribute("ds");
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수	8 -> 5000
    
 	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int aplcListForm = rxw.add(resTemp, "aplcListForm", "");
	rxw.add(aplcListForm, "bocd", Util.checkString(request.getParameter("bocd")));
	
	int summary = rxw.add(resTemp, "summary", "");
	rxw.add(summary, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(summary, "botel", request.getParameter("botel"));
	rxw.add(summary, "uncnfmcnt", ds.getUncnfmcnt());
	rxw.add(summary, "cnfmcnt", ds.getCnfmcnt());
	rxw.add(summary, "canccnt", ds.getCanccnt());
	rxw.add(summary, "aprverrcnt", ds.getAprverrcnt());
	
	int naviInfo = rxw.add(resTemp, "naviInfo2", "");
	rxw.add(naviInfo, "pageno", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(naviInfo, "totalcnt", ds.getTotalcnt());
	rxw.add(naviInfo, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(naviInfo, "pagesize", moveListCount);
	
	rxw.makeHugeStart(resTemp, "aplcGrid", ds.rsltcur.size());
	String tempStr = null;
    String pymttel = null;
    boolean closYn = false;
    String closYnStr = null;
    String shifclsf_t = "";
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_APLCRSLTCURRecord rsltcurRec = (SS_L_APLCRSLTCURRecord)ds.rsltcur.get(i);
		
		if(rsltcurRec.getPymttel1()!=null && !rsltcurRec.getPymttel1().equals("")) {	// 납부자전화번호
            pymttel = rsltcurRec.getPymttel1() + "-" + rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
        } else {
            pymttel = rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
        }
        // 마감여부 => 전송여부가 'Y'이거나, 입금정보반영여부가 'Y'이면 마감여부는 true. 상태변경 및 정보수정을 할 수 없음.
        if("Y".equals(rsltcurRec.getTrsmyn()) || "Y".equals(rsltcurRec.getPymtinforflyn())) {
			closYn = true;
		} else {
			closYn = false;
		}
        if(closYn) {
            closYnStr = "Y";
        } else {
            closYnStr = "N";
        }
        if(rsltcurRec.getShftclsf().equals("110")) {
        	shifclsf_t = "자동";
        } else if(rsltcurRec.getShftclsf().equals("120")) {
        	shifclsf_t = "D.O";
        } else if(rsltcurRec.getShftclsf().equals("130")) {
        	shifclsf_t = "카드";
        } else {
        	shifclsf_t = "";
        }
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			rxw.add_ColVal("pymttel");
			rxw.add_ColVal("closyn");
			rxw.add_ColVal("pymtnmtel");
			rxw.add_ColVal("shiftclsf_t");
			rxw.add_ColVal("addr_t");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		rxw.add_ColVal(pymttel);
		rxw.add_ColVal(closYnStr);
		rxw.add_ColVal(new StringBuffer().append(rsltcurRec.getPymtnm()).append("(").append(pymttel).append(")"));
		rxw.add_ColVal(shifclsf_t);
		rxw.add_ColVal(new StringBuffer().append(rsltcurRec.getDlvaddr()).append(" ").append(rsltcurRec.getDlvaddrdtls()).append(" ").append(rsltcurRec.getShftaplcclsfnm()));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
