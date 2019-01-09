<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1055_l.jsp
* 기능 : 지국Info-지국우편번호-목록
* 작성일자 : 2004-08-13
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-19
* 백업파일명 : ps_brinfo_1055_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_JUSO_BODataSet ds = (SS_L_JUSO_BODataSet)request.getAttribute("ds");
    //int listCount = 20;		// 한 화면당 리스트 항목 수
    int listCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // 총건
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_JUSO_BOCURCOMMLISTRecord curcommlistRec = (SS_L_JUSO_BOCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			//rxw.add_ColVal("subspynDesc");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		//rxw.add_ColVal(curcommlistRec.subspyn.equals("N") ? "Y" : "");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>