<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1430_a.jsp
* ��� 		 : ������������(���ڸ޸��˾�-����)
* �ۼ����� 	 : 2003-12-29
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    String rdr_no = request.getParameter("rdr_no");
    // getting dataset
    SL_A_RDRMEMODataSet ds = (SL_A_RDRMEMODataSet)request.getAttribute("ds");  // request dataset
%>
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td height="76">
      <!--title-->
      <table width=100% border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td style width="16"><img src="/html/slcomm_img/memo_01.gif" width=16 height=76 ></td>
          <td width="72"><img src="/html/slcomm_img/memo_02.gif" width=72 height=76 ></td>
          <td width="133"><img src="/html/slcomm_img/memo_03.gif" width=133 height=76 ></td>
          <td background="/html/slcomm_img/memo_04.gif">&nbsp;</td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
      <!-----����Ʈ���̿���-- -->
    </td>
  </tr>
  <tr>
    <td align="center" class="scroll1" valign="top">
      <!--����-->
      <table width="300" border="0" cellspacing="0" cellpadding="5"  style="border: #AEACAE 1px solid;" id="rdrmemo_detail_id">
<form name="rdrmemo_detail_form" method="post">
    <input type=hidden name=accflag	    >  <!--ó�� FLAG(R:��ȸ, U:����, D:�ʱ�ȭ) -->
    <input type=hidden name=incmgpers   >  <!--�Է���(������)���̵�                -->
    <input type=hidden name=rdr_no	   value="<%=rdr_no%>" >  <!--���ڹ�ȣ                            -->
        <tr>
          <td width="195" bgcolor="#dddddd" valign="top">
            <textarea name="cont" cols="44" rows="20"><%=ds.cont%></textarea>
          </td>
          <td width="85" bgcolor="#dddddd" align="center"><input type="image" id="reset_btn" border="0" src="/html/slcomm_img/bu_memo_re.gif" width="62" height="73" onclick="access_rdrmemo('D')" ><br><br>
            <input type="image" id="save_btn" border="0" src="/html/slcomm_img/bu_memo_sa.gif" width="62" height="78" onclick="access_rdrmemo('U')" ></td>
        </tr>
</form>
      </table>
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--�ϴܿ���-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"> <a href="javascript:self.close();"><img src="/html/slcomm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
<script language="javascript">
	parent.document.all.rdrmemo_detail_id.outerHTML = rdrmemo_detail_id.outerHTML;
<%if ("U".equals(request.getParameter("accflag"))){ %>
	alert("����Ǿ����ϴ�.");
<%}%>
    parent.jsInit();
</script>