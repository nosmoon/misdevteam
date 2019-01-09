<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1445_l.jsp
* 기능       : 독자정보관리(중지내역팝업)(목록조회)-중지처리된 구독계약 목록조회
* 작성일자   : 2004-04-03
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-01
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // 한 row 에 들어갈 탭의 갯수
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "medicur", resTemp, "medicurData");
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.stopcntrcur.size());
	SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord stopcntrcurRec = null;
	for(int i=0; i<ds.stopcntrcur.size(); i++){
		stopcntrcurRec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)ds.stopcntrcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			rxw.add_ColVal("freeyn_s");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(stopcntrcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		rxw.add_ColVal("Y".equals(stopcntrcurRec.freeyn)? "무료" : "유료");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(stopcntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
