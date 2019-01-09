<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1410_s.jsp
* 기능 : 확장현황-확장지원비-상세
* 작성일자 : 2003-12-17
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-12
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RECPCOMSCLOSDataSet ds = (SS_S_RECPCOMSCLOSDataSet)request.getAttribute("ds");
    //int mediListCount = 4;
    int mediListCount = 5000;
    
    //accflag 수정, 각 컨트롤 속성 수정.
    //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, root, "resTemp");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
