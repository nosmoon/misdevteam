<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1516_l.jsp
* 기능     : 지사배정처리 비교대상리스트
* 작성일자 : 2004-03-02
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 황성진
* 수정일자 : 2009-02-05
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	PS_L_EXST_RDR_SEARCHDataSet ds = (PS_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(root, "compareGrid");
	for(int i=0; i < ds.exstrdrlistcur.size() ; i++)
	{
		PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdrtel_no");
			rxw.add_ColVal("rdrptph_no");
			rxw.add_ColVal("addr");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(exstrdrlistcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.rdrtel_no1).append("-").append(exstrdrlistcurRec.rdrtel_no2).append("-").append(exstrdrlistcurRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.rdrptph_no1).append("-").append(exstrdrlistcurRec.rdrptph_no2).append("-").append(exstrdrlistcurRec.rdrptph_no3));
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.dlvaddr).append(" ").append(exstrdrlistcurRec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(exstrdrlistcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
