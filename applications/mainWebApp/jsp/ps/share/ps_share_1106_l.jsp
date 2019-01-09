<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1106_l.jsp
* 기능 : 정보공유 일정 리스트 가져오기
* 작성일자 : 2004-02-23
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_share_1106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_TACOM_SCHEDataSet ds = (PS_L_TACOM_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
   	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_TACOM_SCHECURCOMMLISTRecord rec = (PS_L_TACOM_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("frdt_detail");
			rxw.add_ColVal("todt_detail");			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		rxw.add_ColVal(Util.Timestamp2Str(rec.getFrdt(), "yyyyMMdd' '"));
		rxw.add_ColVal(Util.Timestamp2Str(rec.getTodt(), "yyyyMMdd' '"));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


