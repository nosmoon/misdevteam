<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1606_l.jsp
* 기능     : 모닝+ 현금영수증 검색
* 작성일자 : 2004-04-23
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-23
* 백업파일명 : ps_rdr_1606_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
    CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int recCount  =  ds.rdr_gradaplccur.size();

	// 한페이지에 보여줄 레코드 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	//임의의 변수
	int k  =  0;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//처리구분
	rxw.makeDataToList(ds, "pusbocdcur", "bonm", "bocd", "선택", "", acctTemp, "branchCombo"); // 지사
    rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", acctTemp, "moCombo2"); // 모플회원
    rxw.makeDataToList(ds, "errresncdcur", "cicdnm", "cicodeval", "선택", "", acctTemp, "errCombo"); // 오류사유
    rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", acctTemp, "cashCombo2"); // 현금영수증
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid");

	for(int i=0; i < ds.rdr_gradaplccur.size(); i++)
	{

		CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rdr_gradaplccurRec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)ds.rdr_gradaplccur.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("INDEX");
			rxw.add_ColVal("bocdIndex");
			rxw.add_ColVal("dtlsprocstatIndex");
			rxw.add_ColVal("errresncdIndex");
			rxw.add_ColVal("cashrcptstatIndex");
			rxw.add_ColVal("tel_detail");
			rxw.add_ColVal("addr_detail");
			//rxw.add_ColVal("medicd");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rdr_gradaplccurRec);
		}

		//데이터 추가.
		rxw.add_ColVal("N");
		rxw.add_ColVal(i);
		rxw.add_ColVal(rdr_gradaplccurRec.bocd + i);
		rxw.add_ColVal(rdr_gradaplccurRec.dtlsprocstat + i);
		rxw.add_ColVal(rdr_gradaplccurRec.errresncd + i);
		rxw.add_ColVal(rdr_gradaplccurRec.recstat + i);
		rxw.add_ColVal(rdr_gradaplccurRec.home_tel_no + " / " + rdr_gradaplccurRec.ceph_no_1 + "-" + rdr_gradaplccurRec.ceph_no_2);
		rxw.add_ColVal(rdr_gradaplccurRec.addr + rdr_gradaplccurRec.dtlsaddr);
		//rxw.add_ColVal(rdr_gradaplccurRec.medicd);		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rdr_gradaplccurRec, false);		
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>
