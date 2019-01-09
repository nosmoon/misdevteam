<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_reader_1605_l.jsp
* 기능     : 독자현황-독자등급관리-조회
* 작성일자 : 2004-04-23
* 작성자   : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 검색조건 및 조회내용 변경(현금영수증 및 회원명 추가)
* 수정자   : 김대섭
* 수정일자 : 2005-11-23
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-08
* 백업파일명 : ss_reader_1605_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
	SS_L_RDRCRTSDataSet ds = (SS_L_RDRCRTSDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int listCount  =  20;
    String reqtype = request.getParameter("errresncd");

	String errresncdnm = null;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDRCRTSCURCOMMLISTRecord curcommlistRec = (SS_L_RDRCRTSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("addr_detail");
			rxw.add_ColVal("err_detail");
			rxw.add_ColVal("ceph_no_detail");
			rxw.add_ColVal("reqtype_detail");
			rxw.add_ColVal("errresncdnm_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.add_ColVal(curcommlistRec.addr + " " + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(curcommlistRec.dtlsprocstatnm + curcommlistRec.errresncdnm);
		rxw.add_ColVal(curcommlistRec.ceph_no_1 + "-" + curcommlistRec.ceph_no_2);		
		rxw.add_ColVal(reqtype.equals("M") ? curcommlistRec.mblefrdt : curcommlistRec.recdt);
		//rxw.add_ColVal(Util.convertD( reqtype.equals("M") ? curcommlistRec.mblefrdt : curcommlistRec.recdt));
		rxw.add_ColVal(Util.convertS( (reqtype.equals("M") ? ( (curcommlistRec.mblestatcd).equals("수신") ? curcommlistRec.mblestatcd : curcommlistRec.mblenonrsmgcd) : curcommlistRec.recstatnm )));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
