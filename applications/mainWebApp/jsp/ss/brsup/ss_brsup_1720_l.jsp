<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1720_l.jsp
* ��� : ������������-Billing�ڵ���ü-���ΰ����
* �ۼ����� : 2004-03-22
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_PYMT_CNTRDataSet ds = (SS_L_PYMT_CNTRDataSet)request.getAttribute("ds");
%>

<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
</head>
<body bgcolor="#F8F7F7" class="scroll1">
	<table id="pymtcntr_id" width="814" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
<%
	int i = 0;

	for(i=0; i<ds.rsltcur.size(); i++){
		SS_L_PYMT_CNTRRSLTCURRecord rsltcurRec = (SS_L_PYMT_CNTRRSLTCURRecord)ds.rsltcur.get(i);%>
        <tr  >
          <td width="70" class="gray" align="center" ><%= rsltcurRec.bonm%>&nbsp;</td>
          <td width="70" class="gray" align="center" ><%= rsltcurRec.rdr_no%>&nbsp;</td>
          <td width="70" class="gray" align="center" ><%= rsltcurRec.rdrnm%>&nbsp;</td>
          <td width="40" class="gray" align="center" ><%= rsltcurRec.mediynm%>&nbsp;</td>
          <td width="40" class="gray" align="center" ><%= rsltcurRec.dlvqty%>&nbsp;</td>
          <td width="60" class="gray" align="center" ><%= Util.comma(rsltcurRec.realsubsamt)%>&nbsp;</td>
          <td width="60" class="gray" align="center" ><%= Util.convertMonthS(rsltcurRec.shftbgnyymm)%>&nbsp;</td>
          <td width="60" class="gray" align="center" ><%= rsltcurRec.shftclsfnm%>&nbsp;</td>
          <td width="60" class="gray" align="center" ><%= rsltcurRec.shftstatclsfnm%>&nbsp;</td>
          <td width="50" class="gray" align="center" ><%= rsltcurRec.dlvzip%>&nbsp;</td>
          <td width="155" align="center" class="gray" ><%= rsltcurRec.dlvaddr%>&nbsp;</td>
          <td width="56" class="gray" align="center" ><%= rsltcurRec.subsstat%>&nbsp;</td>
        </tr>
<%
	}

	if(i<4) {
		for (int j=0; j<5-i; j++) {
%>
        <tr  >
          <td width="70" class="gray" align="center" >&nbsp;</td>
          <td width="70" class="gray" align="center" >&nbsp;</td>
          <td width="70" class="gray" align="center" >&nbsp;</td>
          <td width="40" class="gray" align="center" >&nbsp;</td>
          <td width="40" class="gray" align="center" >&nbsp;</td>
          <td width="60" class="gray" align="center" >&nbsp;</td>
          <td width="60" class="gray" align="center" >&nbsp;</td>
          <td width="60" class="gray" align="center" >&nbsp;</td>
          <td width="60" class="gray" align="center" >&nbsp;</td>
          <td width="50" class="gray" align="center" >&nbsp;</td>
          <td width="155" align="center" class="gray" >&nbsp;</td>
          <td width="56" class="gray" align="center" >&nbsp;</td>
        </tr>
<%
		}
	}
%>
      </table>
</body>
<script language="javascript">
	parent.ifrm_2.document.all.pymtcntr_id.outerHTML = document.all.pymtcntr_id.outerHTML;

<%if(ds.rsltcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
</html>
