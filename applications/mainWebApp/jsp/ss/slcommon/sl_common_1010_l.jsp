<%@ page contentType="text/html;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1010_l.jsp
* ��� 		 : ���� �����ȣ �˻��� ���� ��ȸ�� ���
* �ۼ����� 	 : 2003-12-09
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // getting dataset
    CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)request.getAttribute("ds");  // request dataset

    if(ds.curcommlist.size() == 0){
%>
<table width="400" border="0" cellspacing="0" cellpadding="3" id="zip_list">
  <tr>
    <td bgcolor="#979596" height="1">
      <!--line-->
    </td>
  </tr>
  <tr>
    <td bgcolor="#E7E7E7"><b>�Է��Ͻ� '�����ȣ Ȥ�� ��/��/�� '�� �����ϴ�.</b><br>
      �����Ͻô� ������ '�����ȣ Ȥ�� ��/��/�� �̸�'�� ��Ȯ�ϰ� �ԷµǾ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.</td>
  </tr>
  <tr>
    <td bgcolor="#979596" height="1">
      <!--line-->
    </td>
  </tr>
</table>
<%
    }else{
        CO_L_ZIPCURCOMMLISTRecord rec = null;
        String color = null;
        StringBuffer sb = new StringBuffer();
%>

<!---�ּҳ����°� �Ѷ��ξ� ���� Ʋ����-->
<table width="400" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" id="zip_list">
  <tr align="center" bgcolor="#979596">
    <td width="60"  ><font color="#ffffff">�����ȣ</font></td>
    <td><font color="#ffffff">�ּ�</font></td>
  </tr>
  <%
        String zip1 = "";
        String zip2 = "";
        for(int i=0; i<ds.curcommlist.size(); i++){
            rec = (CO_L_ZIPCURCOMMLISTRecord)ds.curcommlist.get(i);
            // ������
            color = ( Math.IEEEremainder(i, 2) == 0.0 )? "#F2F2F2" : "#DDDDDD";
            // zip1 - zip2
            if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
            	zip1 = rec.zip.substring(0, 3);
            	zip2 = rec.zip.substring(3, 6);
            }
            sb.append("<tr bgcolor=" + color + " onclick='set_addr(      \""+zip1+"-"+zip2
																	+"\",\""+rec.addr
																	+"\",\""+rec.bgnn
																	+"\",\""+rec.endn
																	+"\",\""+rec.bocd
																	+"\",\""+rec.bonm
																	+"\",\""+rec.telno1
																	+"\",\""+rec.telno2
																	+"\",\""+rec.telno3 +"\""
																    +" );' style=\"cursor:hand\" onmouseover=\"this.style.backgroundColor = '#BFD2DD';\" onmouseout=\"this.style.backgroundColor = '"+color+"';\">\n");
            sb.append("<td width=60 align=center>"+ zip1 + "-" + zip2 +"</td>\n");
            sb.append("<td>"+rec.addr+" "+ ((rec.bgnn.trim().length() > 0 && rec.endn.trim().length()>0)? rec.bgnn.trim() + "~" + rec.endn.trim() : rec.bgnn.trim() + rec.endn.trim()) + "</td>\n");
            sb.append("</tr>\n");
  	}
        out.write(sb.toString());
  %>
  <%--tr bgcolor="#dddddd">
    <td width="60" align="center"   >100-745</td>
    <td ><a href="#">���� �߱� 1�� �����û</a></td>
  </tr--%>
</table>
<%
    }
%>
<script language="javascript">
<!--
	var lo_form = parent.document.zip_search_form;

	parent.document.all.zip_list.outerHTML = zip_list.outerHTML;
    lo_form.bocd.value = "";
    lo_form.zip.value = "";
    lo_form.addr3.value = "";
    if(parent.validate_zip(lo_form.search_word.value)) parent.insertDash(lo_form.search_word, 3);
//-->
</script>
<%
    out.flush();
%>