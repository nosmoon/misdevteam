<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1185_l.jsp
* 기능       : 독자정보관리(구독계약목록조회)
* 작성일자   : 2003-12-12
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-07
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_NWSPSUBSCNTRDataSet ds = (SL_L_NWSPSUBSCNTRDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // 한 row 에 들어갈 탭의 갯수
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "rdr_no", Util.checkString(request.getParameter("rdr_no")));
	rxw.add(resTemp, "medicd", Util.checkString(request.getParameter("medicd")));
	rxw.add(resTemp, "flag", Util.checkString(request.getParameter("flag")));
	
	//매체탭 버튼
	rxw.makeDataToBulk(ds, "medicur", resTemp, "medicurData");
	
	//구독계약 리스트
	rxw.makeHugeStart(resTemp, "listGrid", ds.nwspsubscntrcur.size());
	SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = null;
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++)
	{
		nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("key");
			rxw.add_ColVal("freeyn_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(nwspsubscntrcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("" + nwspsubscntrcurRec.cntrno + nwspsubscntrcurRec.mangno);
		rxw.add_ColVal("Y".equals(nwspsubscntrcurRec.freeyn)? "무료" : "유료");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(nwspsubscntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
