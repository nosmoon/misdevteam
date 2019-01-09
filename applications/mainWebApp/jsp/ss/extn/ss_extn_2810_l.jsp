<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2810_l.jsp
* 기능 : 확장현황-센터비독자관리-센터비독자 목록
* 작성일자 : 2013-07-01
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_RDRAREADataSet ds = (SS_L_RDR_RDRAREADataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_RDRAREACURCOMMLISTRecord curcommlistRec = (SS_L_RDR_RDRAREACURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//rxw.makeRecordToBulk(curcommlistRec, false);

		//title 추가.
		if(i == 0)
		{	
			rxw.add_ColVal("address");
			rxw.add_ColVal("tel_no");

			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.addr+" "+curcommlistRec.dtlsaddr);
		rxw.add_ColVal(curcommlistRec.tel_no1+"-"+curcommlistRec.tel_no2+"-"+curcommlistRec.tel_no3);

		//if(curcommlistRec.bo_headcnfmdt != null){
		//	rxw.add_ColVal(curcommlistRec.bo_headcnfmdt.toString().substring(0,10));
		//}else{
		//	rxw.add_ColVal("");
		//}
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
%>

