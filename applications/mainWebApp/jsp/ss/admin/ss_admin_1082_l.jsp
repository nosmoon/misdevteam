<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1082_l.jsp
* 기능 : 관리자-계정코드-초기화면
* 작성일자 : 2004-05-01
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1082_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_ACCTCDDataSet ds = (SS_L_ACCTCDDataSet)request.getAttribute("ds");
	int listCount = 10;		// 화면 당 항목 수
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.acctcdcur.size());
	
	for(int i=0; i < ds.acctcdcur.size() ; i++)
	{
		SS_L_ACCTCDACCTCDCURRecord acctcdcurRec = (SS_L_ACCTCDACCTCDCURRecord)ds.acctcdcur.get(i);
		
		//title 추가.
		if(i == 0)
		{	
			
			rxw.add_ColVal("leaf_inyn_f");
			rxw.add_ColVal("empadvyn_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(acctcdcurRec);
		}

		//데이터 추가.
		if("Y".equals(acctcdcurRec.leaf_inyn)){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}
		if("Y".equals(acctcdcurRec.empadvyn)){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}	
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(acctcdcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

