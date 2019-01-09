<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1620_p.jsp
* 기능 : 지국경영-스포츠부수현황-인쇄
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm 대응.
	//content type이 text/html, text/xml이 아닌 경우 자동으로 download 전환이라고 하나 아래와 같이 이름 지정하지 않으면 제대로 동작하지 않음.
	response.setHeader("Content-Disposition","attachment; filename=SSBRMGR1620.xls");

    SS_L_QTY_SP_EXCELDataSet ds = (SS_L_QTY_SP_EXCELDataSet)request.getAttribute("ds");
%>

<html>
<body>
</head></head>
<table>
	<tr> 
		<td> 부서 </td>
		<td> 파트 </td>
		<td> 지역 </td>
		<td> 지국 </td>
		<td> 유가부수 </td>
		<td> 무가부수 </td>
		<td> 발송부수 </td>
		<td> 기증지 </td>
		<td> 쿠폰 </td>
	</tr>

<!--스포츠부수 현황 출력 시작 ---------------------------------------------------------------------------->      
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_QTY_SP_EXCELCURCOMMLISTRecord curcommlistRec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td> <%= curcommlistRec.deptnm%>&nbsp; </td>
		<td> <%= curcommlistRec.partnm%>&nbsp; </td>
		<td> <%= curcommlistRec.areanm%>&nbsp; </td>
		<td> <%= curcommlistRec.bonm%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwygbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwmgbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwsdbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.dntnwsp)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.cupn)%>&nbsp; </td>
	</tr>
<%}%>
<!--스포츠부수 현황 출력 끝 ---------------------------------------------------------------------------->      
</table>
</body>
</html>