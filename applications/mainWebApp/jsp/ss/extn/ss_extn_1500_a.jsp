<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1500_a.jsp
* 기능 : 확장현황-확장용역비용-(조선IS)-초기화면
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-18
* 백업파일명: ss_extn_1500_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet)request.getAttribute("ds");
	//int servListCount = 20;
    //int mediListCount = 13;
    int servListCount = 5000;
    int mediListCount = 5000;
	String paramGbn = "##";
    applySession = true;	// 세션 적용 여부
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defalutDate", Util.getDate());
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "선택", "", initData, "mcCombo"); // 매체
	rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "선택", "", initData, "deptCombo"); // 부서
	
	rxw.flush(out);
%>
