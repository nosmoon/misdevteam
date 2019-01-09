<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1106_p.jsp
* 기능 : 불편등록 독자검색 팝업
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-25
* 백업파일명 : ps_sspt_1106_p.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String rdrnm =  Util.Uni2Ksc(Util.checkString(request.getParameter("rdrnm")));
    String rdrtel_no1 =  ""; // Util.checkString(request.getParameter("rdrtel_no1"));
    String rdrtel_no2 =  ""; // Util.checkString(request.getParameter("rdrtel_no2"));
    String rdrtel_no3 =  ""; //  Util.checkString(request.getParameter("rdrtel_no3"));
    String rdrptph_no1 = ""; //  Util.checkString(request.getParameter("rdrptph_no1"));
    String rdrptph_no2 = ""; //  Util.checkString(request.getParameter("rdrptph_no2"));
    String rdrptph_no3 = ""; //  Util.checkString(request.getParameter("rdrptph_no3"));

    // dataset 인스턴스 선언부분
    PS_L_DSCTINFODataSet ds = (PS_L_DSCTINFODataSet)request.getAttribute("ds");  // request dataset
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "userGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_DSCTINFOCURCOMMLISTRecord curcommlistRec = (PS_L_DSCTINFOCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdrno_detail");
			rxw.add_ColVal("subsfrser_detail");
			rxw.add_ColVal("addr_datail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.rdr_no + "-" + curcommlistRec.medicd + "-" + curcommlistRec.termsubsno);
		rxw.add_ColVal(curcommlistRec.subsfrser_no + "-" + curcommlistRec.substoser_no);
		rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>