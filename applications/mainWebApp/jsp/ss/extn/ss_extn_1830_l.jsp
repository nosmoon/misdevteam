<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1830_l.jsp
* 기능 : 입주아파트 목록 조회
* 작성일자 : 2006-06-09
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-19
* 백업파일명 : ps_extn_1830_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_MOVEIN_APTDataSet ds = (SL_L_MOVEIN_APTDataSet)request.getAttribute("ds");
    //int listCount = 20;		// 한 화면당 리스트 항목 수
    int listCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curaptlist.size());
	
	for(int i=0; i < ds.curaptlist.size() ; i++)
	{
		SL_L_MOVEIN_APTCURAPTLISTRecord curcommlistRec = (SL_L_MOVEIN_APTCURAPTLISTRecord)ds.curaptlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.dongno + "/" + curcommlistRec.flor_houscnt + "/" + curcommlistRec.florcnt);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>

