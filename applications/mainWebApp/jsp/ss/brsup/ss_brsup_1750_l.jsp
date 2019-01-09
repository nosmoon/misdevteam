<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1750_l.jsp
* 기능		: 지국업무지원-Billing자동이체-신청관리-자동이체해지신청 초기화
* 작성일자	: 2004-04-01
* 작성자	: 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APLC_EXPYDataSet ds = (SS_L_APLC_EXPYDataSet)request.getAttribute("ds");

    String n = "1"; // 신규신청 탭의 백그라운드 이미지이름을 구성할 문자
    String e = ""; // 해지신청 탭의 백그라운드 이미지이름을 구성할 문자

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
    }
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//신규이체신청가능 목록
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_L_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.add(resTemp, "bocd", request.getParameter("bocd"));
	rxw.add(resTemp, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(resTemp, "accflag", "E");
	
	rxw.flush(out);
%>
