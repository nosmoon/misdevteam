<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_admin_1055_l.jsp
* 기능		: 관리자-판촉코드-목록
* 작성일자	: 2004-04-28
* 작성자	: 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-08
* 백업파일명 : ss_admin_1055_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");
    int cdvListCount = 10;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.bnsitemcur.size());
	
	for(int i=0; i < ds.bnsitemcur.size() ; i++)
	{
		SL_L_BNSITEMBNSITEMCURRecord bnsitemcurRec = (SL_L_BNSITEMBNSITEMCURRecord)ds.bnsitemcur.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(bnsitemcurRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(bnsitemcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
