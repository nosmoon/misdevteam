<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1201_l.jsp
* 기능 : 불편접수내역 조회
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-17
* 백업파일명 : ps_sspt_1306_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_MOVM_RDRDataSet ds = (PS_L_MOVM_RDRDataSet)request.getAttribute("ds");
    // 공란으로 화면을 구성할 Row수
    int records_non_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_MOVM_RDRCURCOMMLISTRecord rec = (PS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			rxw.add_ColVal("rdrtel_detail");
			rxw.add_ColVal("acptbocnfmynDesc");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		rxw.add_ColVal(rec.addr + " " + rec.dtlsaddr);
		rxw.add_ColVal(rec.rdrtel_no1 + "-" + rec.rdrtel_no2 + "-" + rec.rdrtel_no3);
		rxw.add_ColVal(rec.acptbocnfmyn.equals("Y")? "처리완료" : "미처리");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>
