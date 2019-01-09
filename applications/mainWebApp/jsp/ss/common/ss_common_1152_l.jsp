<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_common_1152_l.jsp
* 기능 		 : 공통 우편번호 검색 (우편번호 입력 의한 검색)
* 작성일자 	 : 2004-03-05
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 : TrustForm 대응
* 수정자 	 : 황성진
* 수정일자 	 : 2009-02-11
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)request.getAttribute("ds");
    CO_L_ZIPCURCOMMLISTRecord rec = null;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "zipGrid");
	
	rxw.flush(out);

%>







