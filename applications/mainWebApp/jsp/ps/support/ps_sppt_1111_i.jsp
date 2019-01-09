<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_sppt_1111_i.jsp
* 기능     : 불편접수 등록후 리턴되는곳
* 작성일자 : 2003-12-02
* 작성자   : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-03-03
* 백업파일명 : ps_sppt_1111_i.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
String strMsg = "등록하였습니다.";
	
RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
int root = RwXmlWrapper.rootNodeID;
rxw.setMessageAlert(strMsg);
//rxw.add(root, "MsgData", strMsg);
//System.out.println(rx.getXml());
rxw.flush(out);
%>	