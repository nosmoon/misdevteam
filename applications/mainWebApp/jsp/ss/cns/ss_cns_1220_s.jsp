<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1120_s.jsp
* 기능 : 상담원-불편 상세
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-07
* 백업파일명 : ss_cns_1220_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");

	ArrayList botel = getTokens(ds.getBotel(), "-");

	String telno1 = "";
	String telno2 = "";
	String telno3 = "";
	try{
		telno1 = (String)botel.get(0);
		telno2 = (String)botel.get(1);
		telno3 = (String)botel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAcpnpathcdnm()); //신청경로
	rxw.add(resTemp, "acpndt_id",  Util.Timestamp2Str(ds.getAcpndt(),"yyyy-MM-dd' 'HH:mm:ss")); //접수일시
	rxw.add(resTemp, "rdremail",  ds.getEmail()); //이메일
	rxw.add(resTemp, "telno1",  telno1); //지국전화번호1
	rxw.add(resTemp, "telno2",  telno2); //지국전화번호2
	rxw.add(resTemp, "telno3",  telno3); //지국전화번호3
	rxw.add(resTemp, "boprocyn_id",  Util.convertNull(ds.getBocnfmyn(),"N")); //불편내용 처리여부
	rxw.add(resTemp, "boprocdt_id",  Util.Timestamp2Str(ds.getBoprocdt(),"yyyy-MM-dd' 'HH:mm:ss")); //불편내용 처리일시
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //상담원 일시
	rxw.add(resTemp, "remk",  ds.getCns_empremk()); //상담원 비고
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //상담원 확인여부위해서.
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>