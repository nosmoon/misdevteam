<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1910_l.jsp
* 기능 : 확장현황-확장제한-신청 목록
* 작성일자 : 2007-07-12
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-16
* 백업파일명 : ss_extn_1910_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_RESDataSet ds = (SS_L_EXTN_RESDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "councilCount", Util.comma(ds.cns_empcnfm)); // 상담원 확인건수
    rxw.add(acctTemp, "confirmCount", Util.comma(ds.chrg_cnfm_cnt)); // 담당 확인건수
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_EXTN_RESCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_RESCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("rdrtel_detail");
			rxw.add_ColVal("rdrptph_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.		
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrtel_no1).append("-").append(curcommlistRec.rdrtel_no2).append("-").append(curcommlistRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrptph_no1).append("-").append(curcommlistRec.rdrptph_no2).append("-").append(curcommlistRec.rdrptph_no3));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


