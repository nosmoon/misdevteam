<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2105_l.jsp
* 기능 : 확장현황-본사현황-조회
* 작성일자 : 2009-05-22
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_HDQTDataSet ds = (SS_L_EXTN_HDQTDataSet)request.getAttribute("ds");
        
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    rxw.add(acctTemp, "totalQtyCount", Util.comma(ds.totalqty)); // 총부수
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수
          	
    //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.onlinelist.size());
	
	for(int i=0; i < ds.onlinelist.size() ; i++)
	{
		SS_L_EXTN_HDQTONLINELISTRecord curcommlistRec = (SS_L_EXTN_HDQTONLINELISTRecord)ds.onlinelist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("check");
			rxw.add_ColVal("alladdr");
			rxw.add_ColVal("allbotel");
			rxw.add_ColVal("allrdrtel");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.		
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.dlvaddr).append("-").append(curcommlistRec.dlvdtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.tel_no11).append("-").append(curcommlistRec.tel_no12).append("-").append(curcommlistRec.tel_no13));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrtel_no1).append("-").append(curcommlistRec.rdrtel_no2).append("-").append(curcommlistRec.rdrtel_no3));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


