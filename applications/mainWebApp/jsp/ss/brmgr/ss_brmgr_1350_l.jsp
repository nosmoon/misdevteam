<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1350_l.jsp
* 기능 : 지국경영-부수증감 신청(부수담당)-조회
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%--
	본지를 제외한 부수증감신청은 소년(130),주간(110),스포츠(610),수능(111) 항목에 대해서만 처리한다.
	추가적인 매체에 대해 처리할 경우는  주석처리된 input 파라미터를 해제한다.
	본지를 제외한 부수증감신청 마감은 영업담당의 마감여부와 상관없이 처리한다.
	지국에서 신청한 발행일자를 prvissudt 항목으로 받아서 수정시 수정된 발행일자(issudt)와 함께 전송한다.
--%>
<%
	SS_L_QTYAPLCDataSet ds = (SS_L_QTYAPLCDataSet)request.getAttribute("ds");
	//int listCount = 10;		
	int listCount = 5000;
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	//rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_QTYAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("prvissudt");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.issudt);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

