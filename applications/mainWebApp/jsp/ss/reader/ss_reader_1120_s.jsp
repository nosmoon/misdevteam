<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1120_s.jsp
* 기능 : 독자현황-독자불편 상세화면
* 작성일자 : 2004-01-10
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-06
* 백업파일명 : ss_reader_1120_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");

	rxw.add(resTemp, "acpndt_f", Util.Timestamp2Str(ds.getAcpndt(),"yyyy-MM-dd' 'HH:mm:ss")); //접수일시
	rxw.add(resTemp, "boprocdt_f", Util.Timestamp2Str(ds.getBoprocdt(),"yyyy-MM-dd' 'HH:mm:ss")); //처리일시
	rxw.add(resTemp, "cns_empcnfmdt_f", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //일시
	rxw.flush(out);
%>
