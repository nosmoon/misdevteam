<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1307_s.jsp
* 기능 :  상담원-VacationStop-휴가지배달지역 지국정보
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-09
* 백업파일명 : ss_cns_1307_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_S_VS_AREABODataSet ds = (SL_S_VS_AREABODataSet)request.getAttribute("ds");
	ArrayList bo2tel = getTokens(ds.getVaca_areabotel(), "-");

	String telno12 = "";
	String telno22 = "";
	String telno32 = "";
	try{
		telno12 = (String)bo2tel.get(0);
		telno22 = (String)bo2tel.get(1);
		telno32 = (String)bo2tel.get(2);
	}catch(Exception e){
		telno12 = "";
		telno22 = "";
		telno32 = "";	
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int dataTemp = rxw.add(root, "dataTemp", "");
	
	rxw.add(dataTemp, "bocd2",  ds.vaca_areabocd);  //휴가지배달지국코드
	rxw.add(dataTemp, "bonm2",  ds.vaca_areabonm); //휴가지배달지국명
	rxw.add(dataTemp, "telno12",  telno12); //휴가지배달지국 전화번호1
	rxw.add(dataTemp, "telno22",  telno22); //휴가지배달지국 전화번호2
	rxw.add(dataTemp, "telno32",  telno32); //휴가지배달지국 전화번호3
	
	rxw.flush(out);
%>