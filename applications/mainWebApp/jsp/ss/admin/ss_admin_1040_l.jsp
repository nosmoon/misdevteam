<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1040_l.jsp
* ��� : ������-�����ȣ-��
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : �ּ�3 ���� �����ϵ���
* ������ : ��뼷
* �������� : 2006-03-02
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
1.�����ȣ1,�����ȣ2,�����ȣ3�� request�κ��� ��´�.
--%>
<%
    SS_L_JUSODataSet ds = (SS_L_JUSODataSet)request.getAttribute("ds");
    String zip1 = request.getParameter("zip1");
    String zip2 = request.getParameter("zip2");
    String zip3 = request.getParameter("zip3");
    
    // �ּ�1,�ּ�2,�ּ�3,���ּҴ� MIS�����ȣ���� �����ϳ� �Ǹſ����ȣ�� �������� ���� ��� �ű� ��Ϸο츦 ���� ���ȴ�.
    String addr1 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr1")));
    String addr2 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr2")));
    String addr3 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr3")));
    String largedlvplac = Util.Uni2Ksc(Util.checkString(request.getParameter("largedlvplac")));
%>
<table border="0" cellspacing="0" cellpadding="0" id="zip_detail_id">
<tr><td>
	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
			<td  height="27" bgcolor="#EBE9DC" class="title">�Ǹű� �����ȣ</td>
			<td bgcolor="#EBE9DC" class="title" align="right"> 
				<input type="image" id="auto_input_id" src="/html/comm_img/bu_autobo.gif" align="absmiddle" border="0" onclick="bo_search_detail_rep();window.event.returnValue=false;">
				<input type="image" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
	            <input type="image" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
				<input type="image" src="/html/comm_img/bu_line01.gif" width="52" height="19" align="absmiddle" border="0" onclick="javascript:row_add();"> 
				<input type="image" src="/html/comm_img/bu_line02.gif" width="52" height="19" align="absmiddle" border="0" onclick="javascript:row_del();"> 
			</td>
		</tr>
		<tr> 
			<td height="3" colspan="2"> 
			<!--����-->
			</td>
		</tr>
	</table>
	
	<!--�Ǹű� �����ȣ ��� ���� -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="zip_detail_list_id">
	<form name="zip_detail_form" method="post" action="">
	    <input name="zip1" type="hidden" value ="<%= zip1%>">		<!--�����ȣ1-->
	    <input name="zip2" type="hidden" value ="<%= zip2%>">    	<!--�����ȣ2-->
	    <input name="zip3" type="hidden" value ="<%= zip3%>">    	<!--�����ȣ3-->
		<input name="addr1ary" type="hidden" value ="">      		<!--�ּ�1 ���� ���ڿ�-->        
		<input name="addr2ary" type="hidden" value ="">      		<!--�ּ�2 ���� ���ڿ�-->        
		<input name="addr3ary" type="hidden" value ="">      		<!--�ּ�3 ���� ���ڿ�-->        
		<input name="largedlvplacary" type="hidden" value ="">  	<!--�뷮���ó ���� ���ڿ�-->   
		<input name="bgnnary" type="hidden" value ="">        		<!--�������� ���� ���ڿ�-->     
		<input name="endnary" type="hidden" value ="">        		<!--������ ���� ���ڿ�-->       
		<input name="bocdary" type="hidden" value ="">        		<!--���������ڵ� ���� ���ڿ�-->  
	    
		<tr bgcolor="#dddddd" align="center"> 
			<td class="gray"> ���� </td>
			<td width="80" class="gray">��/��</td>
			<td width="80" class="gray">��/��</td>
			<td width="140" class="gray">��/��/��</td>
			<td width="200" class="gray">���ּ�</td>
			<td width="65" class="gray">���۹���</td>
			<td width="65" class="gray">������</td>
			<td width="150" class="gray">����</td>
		</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_JUSOCURCOMMLISTRecord curcommlistRec = (SS_L_JUSOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
		
		<tr> 
			<td align="center" class="gray" > 
				<input name="checkyn" type="checkbox" value="" checked>
			</td>
			<td class="gray" width="80">
				<input name="addr1" type="text" value="<%= curcommlistRec.addr1%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="80">
				<input name="addr2" type="text" value="<%= curcommlistRec.addr2%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="140">
				<input name="addr3" type="text" value="<%= curcommlistRec.addr3%>" size="20" class="text_box">
			</td>
			<td class="gray" width="200" align="center"> 
				<input name="largedlvplac" type="text" value="<%= curcommlistRec.largedlvplac%>" size="30" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="bgnn" type="text" value="<%= curcommlistRec.bgnn%>" size="6" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="endn" type="text" value="<%= curcommlistRec.endn%>" size="6" class="text_box">
			</td>
			<!--�ش� �ο��� �����˻� �� ��� ���� **����: �߰��� Ŀ��Ʈ ���� ����(children ���)-->
			<td class="gray" width="150" align="center"> 
		    	<input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>" style="ime-mode:active;">
				<input name="bonm" type="text" value="<%= curcommlistRec.bonm%>"  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));">
				<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;"> 
			</td>
		</tr>
<%}%>	

<%--����� �������� ���� ���� �űԵ���� ���� �� �Է·ο�� �Ѱ� ǥ���Ѵ�.--%>
<%--�ּ�1,�ּ�2,�ּ�3�� MIS �����ȣ�� �ּ�1,�ּ�2,�ּ�3�� �����Ѵ�.--%>
<%if(ds.curcommlist.size() == 0){%>
		<tr> 
			<td align="center" class="gray" > 
				<input name="checkyn" type="checkbox" value="" checked>
			</td>
			<td class="gray" width="80">
				<input name="addr1" type="text" value="<%= addr1%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="80">
				<input name="addr2" type="text" value="<%= addr2%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="140">
				<input name="addr3" type="text" value="<%= addr3%>" size="20" class="text_box">
			</td>
			<td class="gray" width="200" align="center"> 
				<input name="largedlvplac" type="text" value="<%= largedlvplac%>" size="30" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="bgnn" type="text" value="" size="6" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="endn" type="text" value="" size="6" class="text_box">
			</td>
			<!--�ش� �ο��� �����˻� �� ��� ���� **����: �߰��� Ŀ��Ʈ ���� ����(children ���)-->
			<td class="gray" width="150" align="center"> 
		    	<input name="bocd" type="hidden" value="" style="ime-mode:active;">
				<input name="bonm" type="text" value=""  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));">
				<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;"> 
			</td>
		</tr>
<%}%>
		<tr bgcolor="#dddddd" align="right"> 
			<td  colspan="8" height="23" class="gray">
<%--����� �������� ���� ��� �Է��� ���� �޼��� ���--%>
<%if(ds.curcommlist.size() == 0){%><font color="#FF0000">*�ش� MIS�����ȣ�� ��ġ�ϴ� �Ǹſ����ȣ�� �������� �ʽ��ϴ�. �ʿ�� �űԵ���ϼ���.</font><%}%>
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
			</td>
		</tr>
	</form>
	</table>
	<!--�Ǹű� �����ȣ ��� �� -->
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
		<tr> 
			<td align="center" height="2"> 
				<!--����-->
			</td>
		</tr>
		<tr> 
			<td align="center" height="24" bgcolor="#E8E8E8">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
				<input type="image" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="cancel()" border="0">
			</td>
		</tr>
	</table>
	
</td></tr>	
</table>


<script>
    parent.document.all.zip_detail_id.outerHTML = zip_detail_id.outerHTML;
    
    // ȭ�� �ʱ�ȭ
    parent.jsInit();
</script>