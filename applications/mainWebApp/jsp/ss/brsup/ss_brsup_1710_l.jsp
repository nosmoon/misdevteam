<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1710_l.jsp
* ��� : ������������-Billing�ڵ���ü-�����ڸ��
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
    SS_L_PYMTDataSet ds = (SS_L_PYMTDataSet)request.getAttribute("ds");
%>

<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
</head>
<body bgcolor="#F8F7F7" class="scroll1">
	<table id="pymt_id" width="814" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
<%
	int i = 0;

    for(i=0; i<ds.rsltcur.size(); i++){
        SS_L_PYMTRSLTCURRecord rsltcurRec = (SS_L_PYMTRSLTCURRecord)ds.rsltcur.get(i);%>
        <tr>
          <td width="90" class="gray" ><%= rsltcurRec.bonm%>&nbsp;</td>
          <td width="80" class="gray" ><%= rsltcurRec.pymtnm%>&nbsp;</td>
          <td width="200" class="gray" ><%= rsltcurRec.prn%>&nbsp;</td>
          <td width="80" class="gray" ><%= rsltcurRec.rdrnm%>&nbsp;</td>
          <td width="80" class="gray" ><%= rsltcurRec.banknm%>&nbsp;</td>
          <td width="143" class="gray" ><%= rsltcurRec.acctno%>&nbsp;</td>
          <td width="70" class="gray" ><%= rsltcurRec.shftbgnyymm%>&nbsp;</td>
          <td width="56" class="gray" ><%= rsltcurRec.shftstatclsfnm%>&nbsp;</td>
        </tr>
<%
	}

	if(i<4) {
		for (int j=0; j<5-i; j++) {
%>
        <tr>
          <td width="90" class="gray" >&nbsp;</td>
          <td width="80" class="gray" >&nbsp;</td>
          <td width="200" class="gray" >&nbsp;</td>
          <td width="80" class="gray" >&nbsp;</td>
          <td width="80" class="gray" >&nbsp;</td>
          <td width="143" class="gray" >&nbsp;</td>
          <td width="70" class="gray" >&nbsp;</td>
          <td width="56" class="gray" >&nbsp;</td>
        </tr>
<%
		}
	}
%>
      </table>
</body>
<script language="javascript">
	parent.ifrm_1.document.all.pymt_id.outerHTML = document.all.pymt_id.outerHTML;

<%if(ds.rsltcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
</html>
