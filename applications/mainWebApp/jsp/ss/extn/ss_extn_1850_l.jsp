<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1850_l.jsp
* 기능 : 확장현황-입주아파트관리-입주아파트관리 조회
* 작성일자 : 2009-05-18
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_APTDataSet ds = (SS_L_EXTN_APTDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// 조회 결과.
    //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.aptlist.size());
	
	for(int i=0; i < ds.aptlist.size() ; i++)
	{
		SS_L_EXTN_APTAPTLISTRecord curcommlistRec = (SS_L_EXTN_APTAPTLISTRecord)ds.aptlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			rxw.add_ColVal("check");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		rxw.add_ColVal("");
		//나머지 필드 자동생성.		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
           
	rxw.flush(out);
%>
