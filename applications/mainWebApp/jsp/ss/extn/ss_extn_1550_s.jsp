<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1550_s.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-(Ȯ����)-��
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_SERVCLOSDataSet ds = (SS_S_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 13;
%>
<table id="serv_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">����ISȮ�帶�� ��</td>
    </tr>
    <tr>
        <td height="3">
        <!--����-->
        </td>
    </tr>
</table>

<table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="1" bgcolor="#ffffff" class="gray">
<form name="serv_detail_form" method="post" action="">
	<input type="hidden" name="accflag" value="">          			<!-- ����,������� �����ʵ� -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>"><!-- Ȯ��뿪��븶�� �������� -->
    <input type="hidden" name="medicdary" value="">					<!-- ��ü���� ���ڿ� ���� -->
    <input type="hidden" name="basiamtary" value="">				<!-- ���رݾ� ���ڿ� ���� -->
  <tr>
    <td bgcolor="#dddddd"  class="gray" height="25">��������</td>
    <td colspan="4" class="gray" height="25">
      <input name="basidt" type="text" size="20" class="text_box" value="<%= ds.getBasidt()%>" caption="��������" dataType="month" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">��������</td>
    <td colspan="4" class="gray" height="25">
      <input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="��������" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">��������</td>
    <td colspan="4" class="gray" height="25">
      <input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="��������" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">��������</td>
    <td colspan="4" class="gray" height="25">
      <input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="��������" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" height="25">����IS ��������</td>
    <td colspan="4" class="gray" height="25">
     <%= ds.getClosyn()%>
    </td>
  </tr>
  <tr>
    <td  bgcolor="#dddddd" class="gray" height="25">������ ��������</td>
    <td colspan="4" class="gray" height="25">
     <%= ds.getSplychrgclosyn()%>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">û������</td>
    <td colspan="4" class="gray" height="25">
      <input name="clamdt" type="text" size="10" class="text_box" value="<%= ds.getClamdt()%>" caption="û������" dataType="date" readonly>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" class="gray" height="25">���</td>
    <td colspan="4" class="gray" height="25">
      <input name="remk" type="text" size="35" class="text_box" value="<%= ds.getRemk()%>"readonly>
    </td>
  </tr>
    <tr align="center" bgcolor="#EBE9DC">
        <td width="100" class="gray" height="25" align="center">��ü</td>
        <td width="100" class="gray" height="25" align="center">�μ�</td>
        <td width="75" class="gray" height="25" align="center">����Ʈ</td>
        <td width="75" class="gray" height="25" align="center">����</td>
        <td class="gray" height="25" align="center">��</td>
    </tr>


<%-- ��ü ��� �ݺ� ���� --%>
<%
for(int i=0; i<mediListCount; i++){     // ȭ�鿡 ǥ���� ��� ���� ��ŭ
    if(i< ds.curcommlist.size()){		// ������ ������� ������ �ִ� ���
        SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- �ϳ��� ��ü�� �ʼ� �Է��׸� --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="��ü����" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="��ü����" onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }
    %>
        <!-- ��ü�ڵ�, �ڵ�� ��� -->
        <option value=''>����</option>
        <%
            for(int j=0; j<ds.curmedicd.size(); j++){
                SS_S_RDR_EXTN_SERVCLOSCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_SERVCLOSCURMEDICDRecord)ds.curmedicd.get(j);

                /* ���� ó�� ���� */
                if(curmedicdRec == null || curmedicdRec.cicodeval == null || "".equals(curmedicdRec.cicodeval)){
                    request.setAttribute("appException", new AppException("[ss_extn_1510_s.jsp(1)]","[ss_extn_1510_s.jsp(1)] ��ü�ڵ尡 �ùٸ��� �ʽ��ϴ�."));
                    pageContext.forward("/jsp/ss/comm_jsp/app_error.jsp");
                }
                /* ���� ó�� �� */

                if(curmedicdRec.cicodeval.equals(curcommlistRec.medicd)){
        %>
                    <option value="<%= curmedicdRec.cicodeval%>" selected><%= curmedicdRec.cicdnm%></option>
        <%      }else{%>
                    <option value="<%= curmedicdRec.cicodeval%>"><%= curmedicdRec.cicdnm%></option>
        <%
                }
            }
        %>
    </select>
    </td>
    
    <td class="gray" height="25" align="center">
		<select name="deptcd<%= i+1 %>" size="1" class="sel_all" disabled>
            <option value="" selected>����</option>
        <%
            for(int j=0; j<ds.curdeptcd.size(); j++){
                SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord curdeptcdRec = (SS_S_RDR_EXTN_SERVCLOSCURDEPTCDRecord)ds.curdeptcd.get(j);

                if(curdeptcdRec.deptcd.equals(curcommlistRec.deptcd)){
        %>
                    <option value="<%= curdeptcdRec.deptcd%>" selected><%= curdeptcdRec.boksnm%></option>
        <%      }else{%>
                    <option value="<%= curdeptcdRec.deptcd%>"><%= curdeptcdRec.boksnm%></option>
        <%
                }
            }
        %>            
		</select>            
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt1<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt1%>" size="8" class="text_box" caption="���رݾ�" dataType="integer" comma >      
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt2<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt2%>" size="8" class="text_box" caption="���رݾ�" dataType="integer" comma >      
    </td>
    <td class="gray" height="25" align="center">
      <input name="basiamt3<%= i+1 %>" id="basiamt<%= i+1 %>" type="text" readOnly style="text-align:right" value="<%= curcommlistRec.basiamt3%>" size="8" class="text_box" caption="���رݾ�" dataType="integer" comma >      
    </td>
    
    
    
  </tr>
<%
    }else{                  //������ ������� ������ ���� ���� ���
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- �ϳ��� ��ü�� �ʼ� �Է��׸� --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="��ü����" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" disabled class="sel_all" caption="��ü����" onchange="javascript:medicd_change(medicd<%= i+1 %>, deptcd<%= i+1 %>, basiamt1<%= i+1 %>, basiamt2<%= i+1 %>, basiamt3<%= i+1 %>);">
    <%
        }
    %>
        <option value='' selected>����</option>
        <%= ds.curmedicdOptHtml("") %><!-- ��ü�ڵ�, �ڵ�� ��� -->
    </select>
    </td>
    <td class="gray" height="25" align="center">
		<select name="deptcd<%= i+1 %>" size="1" class="sel_all" disabled>
            <option value="" selected>����</option>
            <%= ds.curdeptcdOptHtml("") %>                              	<!-- �μ��ڵ�, �ڵ�� ��� -->
		</select>            
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt1<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="����Ʈ���رݾ�" dataType="integer" comma readOnly>
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt2<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="���ñ��رݾ�" dataType="integer" comma readOnly>
    </td>
    <td class="gray" height="25" align="center">
        <input name="basiamt3<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="�󰡱��رݾ�" dataType="integer" comma readOnly>
    </td>
  </tr>
<%
    }
}
%>

<%-- ��ü ��� �ݺ� �� --%>
</form>
</table>

<script language="javascript">
    parent.document.all.serv_detail_title_id.outerHTML = serv_detail_title_id.outerHTML;
    parent.document.all.serv_detail_id.outerHTML = serv_detail_id.outerHTML;

    // ȭ�� �ʱ�ȭ
    parent.jsInit();
</script>
