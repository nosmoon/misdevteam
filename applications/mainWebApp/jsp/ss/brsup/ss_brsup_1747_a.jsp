<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1747_a.jsp
* 기능		: 지국업무지원-Billing자동이체-신청관리-신규신청초기화면
* 작성일자	: 2004-03-31
* 작성자	: 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";
    applySession = false;	// 세션 적용 여부

    boolean migryn = false;	// 지국마이그레이션 여부
    if("Y".equals(request.getParameter("migryn"))) {
    	migryn = true;
    }
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(resTemp, "botel", Util.checkString(request.getParameter("botel")));
	rxw.add(resTemp, "migryn", request.getParameter("migryn"));
	
	int pymtInfoForm = rxw.add(resTemp, "pymtInfoForm", "");
	rxw.add(pymtInfoForm, "shftclsf", "110");
	rxw.add(pymtInfoForm, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(pymtInfoForm, "bocd", request.getParameter("bocd"));
	rxw.add(pymtInfoForm, "accflag", request.getParameter("accflag"));
	
	rxw.makeEmpytList(resTemp, "recpinsttCombo", "선택", "");
	rxw.makeEmpytList(resTemp, "cardcmpycdCombo", "선택", "");
	rxw.makeEmpytList(resTemp, "aplyyymmCombo", "선택", "");
	
	rxw.flush(out);
%>
