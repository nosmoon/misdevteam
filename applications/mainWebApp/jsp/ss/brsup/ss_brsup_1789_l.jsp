<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1786_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청통계-목록조회(엑셀 다운로드)
* 작성일자 : 2004-04-26
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-03
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	response.setHeader("Content-Disposition", "attachment; filename=SSBRSUP1789.xls");

	SS_L_SHFTAPLC_CNFM_STCSDataSet ds = (SS_L_SHFTAPLC_CNFM_STCSDataSet)request.getAttribute("ds");
%>
<!--list-->
<table id="body_id" width="830" border="0" cellpadding="1" cellspacing="0"  align="center" class="gray" bgcolor="#FFFFFF">
  <tr align="center" bgcolor="#dddddd" >
    <td class="gray" rowspan="2" width="83">지역</td>
    <td class="gray" rowspan="2" width="83">지국</td>
    <td width="136" class="gray" rowspan="2">전화번호</td>
    <td  colspan="3" class="gray">지로 자동이체</td>
    <td colspan="3" class="gray">DO카드 자동이체</td>
    <td colspan="3" class="gray">일반카드 자동이체</td>
  </tr>
  <tr align="center" bgcolor="#dddddd" >
    <td class="gray" width="56" >전체</td>
    <td class="gray" width="56">확인</td>
    <td class="gray" width="56">미확인</td>
    <td class="gray" width="56">전체</td>
    <td class="gray" width="56" >확인</td>
    <td class="gray" width="56">미확인</td>
    <td class="gray" width="56">전체</td>
    <td class="gray" width="56">확인</td>
    <td class="gray" width="56" >미확인</td>
  </tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
  <tr>
    <td class="gray" width="45" ><%= rsltcurRec.areanm%></td>
    <td class="gray" width="45"><%= rsltcurRec.bonm%></td>
    <td class="gray"><%= rsltcurRec.tel_no%></td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_c_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_c_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_c_cnt%>&nbsp;</td>
  </tr>
<%}%>
</table>