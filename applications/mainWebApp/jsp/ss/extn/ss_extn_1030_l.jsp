<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1030_l.jsp
* 기능 : 확장현황-신청현황-독자자진신청 목록
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-09
* 백업파일명 : ss_extn_1030_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTNDataSet ds = (SS_L_RDR_EXTNDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "chosunCount", Util.comma(ds.advtcnt)); // 조선닷컴
    rxw.add(acctTemp, "totalQtyCount", Util.comma(ds.totalqty)); // 총부수
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_EXTNCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTNCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{	
			rxw.add_ColVal("extnflnm_f");
			rxw.add_ColVal("bo_headcnfmdt_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.aplcpersnm);
		if(curcommlistRec.bo_headcnfmdt != null){
			rxw.add_ColVal(curcommlistRec.bo_headcnfmdt.toString().substring(0,10));
		}else{
			rxw.add_ColVal("");
		}
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

