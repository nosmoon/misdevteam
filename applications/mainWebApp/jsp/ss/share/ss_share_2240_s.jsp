<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2240_s.jsp
* 기능 : 판매국메인-초기화면-판매국공지 목록
* 작성일자 : 2004-04-20
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_ANNCSLSDataSet ds = (SS_L_ANNCSLSDataSet)request.getAttribute("ds");
	PrintWriter tickerOut = response.getWriter();

	StringBuffer message = new StringBuffer("");

	for(int i=0; i<ds.mainannclist.size(); i++){
		SS_L_ANNCSLSMAINANNCLISTRecord mainannclistRec = (SS_L_ANNCSLSMAINANNCLISTRecord)ds.mainannclist.get(i);
		message.append(mainannclistRec.seq);
		message.append('\u0002');
		message.append(mainannclistRec.annctitl);
		message.append('\u0002');
		message.append(mainannclistRec.annccont);
		message.append('\u0003');
	}
 	tickerOut.print(message.toString());
	tickerOut.close();
%>
