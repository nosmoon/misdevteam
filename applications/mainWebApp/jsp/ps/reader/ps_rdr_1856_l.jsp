<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1856_l.jsp
* 기능 :  독자 리스트 가져오기
* 작성일자 : 2007-03-29
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-13
* 백업파일명 : ps_rdr_1856_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String pagesize = request.getParameter("pagesize");
    // dataset 인스턴스 선언부분
    PS_L_BO_READER_SEARCHDataSet ds = (PS_L_BO_READER_SEARCHDataSet)request.getAttribute("ds");  // request dataset
    // 공란으로 화면을 구성할 Row수
	
    int records_non_page = Integer.parseInt(pagesize) - ds.readerlistcur.size();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//페이지 관련.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.readerlistcur.size() ; i++)
	{

		PS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (PS_L_BO_READER_SEARCHREADERLISTCURRecord)ds.readerlistcur.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("tel_detail");
			rxw.add_ColVal("addr_detail");

			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(rec.rdrtel_no1).append("-").append(rec.rdrtel_no2).append("-").append(rec.rdrtel_no3));	
		rxw.add_ColVal(new StringBuffer().append(rec.dlvaddr).append("/").append(rec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>
