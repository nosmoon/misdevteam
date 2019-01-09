<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1730_l.jsp
* 기능 : 지국업무지원-Billing자동이체-납부내역목록
* 작성일자 : 2004-03-22
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_PYMT_PTCRDataSet ds = (SS_L_PYMT_PTCRDataSet)request.getAttribute("ds");
%>

<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
</head>
<body bgcolor="#F8F7F7" class="scroll1">
	  <table id="pymtptcr_id" width="814" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
<%
	int i = 0;

	for(i=0; i<ds.rsltcur.size(); i++){
		SS_L_PYMT_PTCRRSLTCURRecord rsltcurRec = (SS_L_PYMT_PTCRRSLTCURRecord)ds.rsltcur.get(i);%>
        <tr>
          <td width="72" class="gray" align="center" ><%= rsltcurRec.bonm%>&nbsp;</td>
          <td width="72" class="gray" align="center" ><%= rsltcurRec.rdr_no%>&nbsp;</td>
          <td width="72" class="gray" align="center" ><%= rsltcurRec.rdrnm%>&nbsp;</td>
          <td width="42" class="gray" align="center" ><%= rsltcurRec.medinm%>&nbsp;</td>
          <td width="42" class="gray" align="center" ><%= rsltcurRec.clamqty%>&nbsp;</td>
          <td width="62" class="gray" align="center" ><%= Util.comma(rsltcurRec.realsubsamt)%>&nbsp;</td>
          <td width="62" class="gray" align="center" ><%= Util.convertMonthS(rsltcurRec.basidt.substring(0,6))%>&nbsp;</td>
          <td width="74" class="gray" align="center" ><%= Util.convertMonthS(rsltcurRec.subsmappli)%>&nbsp;</td>
          <td width="124" class="gray" align="center" ><%= rsltcurRec.shftclsfnm%>&nbsp;</td>
          <td width="53" align="center" class="gray" ><%= rsltcurRec.erryn%>&nbsp;</td>
          <td width="118" align="center" class="gray" ><%= rsltcurRec.recpocomnm%>&nbsp;</td>
        </tr>
<%
	}

	if(i<4) {
		for (int j=0; j<5-i; j++) {
%>
        <tr>
          <td width="72" class="gray" align="center" >&nbsp;</td>
          <td width="72" class="gray" align="center" >&nbsp;</td>
          <td width="72" class="gray" align="center" >&nbsp;</td>
          <td width="42" class="gray" align="center" >&nbsp;</td>
          <td width="42" class="gray" align="center" >&nbsp;</td>
          <td width="62" class="gray" align="center" >&nbsp;</td>
          <td width="62" class="gray" align="center" >&nbsp;</td>
          <td width="74" class="gray" align="center" >&nbsp;</td>
          <td width="124" class="gray" align="center" >&nbsp;</td>
          <td width="53" align="center" class="gray" >&nbsp;</td>
          <td width="118" align="center" class="gray" >&nbsp;</td>
        </tr>
<%
		}
	}
%>
      </table>
</body>
<script language="javascript">
	parent.ifrm_3.document.all.pymtptcr_id.outerHTML = document.all.pymtptcr_id.outerHTML;
    // 이벤트 핸들러 호출
    parent.jsInit();

<%if(ds.rsltcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>

</script>
</html>
