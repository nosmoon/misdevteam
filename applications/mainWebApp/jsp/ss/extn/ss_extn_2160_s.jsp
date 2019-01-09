<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2160_l.jsp
* 기능 : 확장현황-에듀/제휴현황 상세조회
* 작성일자 : 2009-05-28
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_EXTN_EDURDRDataSet ds = (SS_S_EXTN_EDURDRDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	//rxw.makeDataToBulk(ds, "rdrlist", resTemp, "detailGrid");
    
  //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(resTemp, "detailGrid", ds.rdrlist.size());
	
	for(int i=0; i < ds.rdrlist.size() ; i++)
	{
		SS_S_EXTN_EDURDRRDRLISTRecord curcommlistRec = (SS_S_EXTN_EDURDRRDRLISTRecord)ds.rdrlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.		
		rxw.add_ColVal("");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


