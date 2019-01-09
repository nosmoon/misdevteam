<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2210_l.jsp
* 기능 : 확장현황-지국확장마감-목록
* 작성일자 : 2009-07-09
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TASLM_BOSUSPCLOSDataSet ds = (SS_L_TASLM_BOSUSPCLOSDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
           
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.bosuspclos.size());
	
	for(int i=0; i < ds.bosuspclos.size() ; i++)
	{
		SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord bosuspclosRec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)ds.bosuspclos.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(bosuspclosRec);
		}

		//데이터 추가.
		if(bosuspclosRec.suspexclyn.equals("Y")){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(bosuspclosRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>


