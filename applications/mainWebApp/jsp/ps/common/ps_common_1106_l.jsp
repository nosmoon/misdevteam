<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1106_l.jsp
* ���     : ���� �����ȣ �˻��� ���� ��ȸ�� ���
* �ۼ����� : 2004-01-30
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //getting dataset
	PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)request.getAttribute("ds");

	//����Ÿ �������
    if(ds.zipaddrcur.size() == 0){
%>

      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" id="zip_list">
        <tr>
          <td bgcolor="#E7E7E7"><b>�Է��Ͻ� '�����ȣ Ȥ�� ��/��/�� '�� �����ϴ�.</b><br>
            �����Ͻô� ������ '�����ȣ Ȥ�� ��/��/�� �̸�'�� ��Ȯ�ϰ�<br>
            �ԷµǾ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.
          </td>
        </tr>
      </table>

<%
	//����Ÿ �������
    }else{
        String color = null;
%>

      <!---�ּҳ����°� �Ѷ��ξ� ���� Ʋ����-->
      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" id="zip_list">
        <tr align="center" bgcolor="#979596">
          <td width="60"><font color="#ffffff">�����ȣ</font></td>
          <td           ><font color="#ffffff">�ּ�</font></td>
        </tr>

<%
		//����Ÿ ȭ�鿡 Display
		for(int i=0; i<ds.zipaddrcur.size(); i++){
			PB_L_TAOCC_PSTCDZIPADDRCURRecord zipaddrcurRec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)ds.zipaddrcur.get(i);

            // ������
            color = ( Math.IEEEremainder(i, 2) == 0.0 )? "#F2F2F2" : "#DDDDDD";
%>
        <tr bgcolor="<%=color%>" onclick='set_addr("<%=zipaddrcurRec.juzipcd1%>-<%=zipaddrcurRec.juzipcd2%>-<%=zipaddrcurRec.juzipcd3%>","<%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%>");' style="cursor:hand" onmouseover="this.style.backgroundColor='#BFD2DD'" onmouseout="this.style.backgroundColor='<%=color%>'">
          <td width="60" align="center"><%=zipaddrcurRec.juzipcd1%>-<%=zipaddrcurRec.juzipcd2%></td>
          <td><%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%> <%=zipaddrcurRec.judoseo%>
<%
			//���� üũ�� Display
			if(!"".equals(zipaddrcurRec.jusaf) && !"".equals(zipaddrcurRec.jusat)) {
				out.write(zipaddrcurRec.jusaf+"-"+zipaddrcurRec.jusat);
			} else if("".equals(zipaddrcurRec.jusaf) || "".equals(zipaddrcurRec.jusat)) {
			    out.write(zipaddrcurRec.jusaf+" "+zipaddrcurRec.jusat);
			}
%>
          </td>
        </tr>
<%
  	    }
%>
      </table>
<%
    }
%>

<script language="javascript">
<!--
	var lo_form = parent.document.zip_search_form;
	parent.document.all.zip_list.outerHTML = zip_list.outerHTML;
    lo_form.zip.value   = "";
    lo_form.addr3.value = "";
    if(parent.validate_zip(lo_form.search_word.value)) parent.insertDash(lo_form.search_word, 3);
-->
</script>
