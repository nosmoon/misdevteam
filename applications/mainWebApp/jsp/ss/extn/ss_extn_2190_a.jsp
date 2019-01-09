<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2190_a.jsp
* 기능 : 확장현황-단체확장(대납독자)
* 작성일자 : 2009-06-02
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	//rxw.add(codeData, "yyyymm", Util.getYear() + "0101");
	rxw.add(codeData, "yyyymmdd", Util.getDate());
			
	rxw.flush(out);	
%>
