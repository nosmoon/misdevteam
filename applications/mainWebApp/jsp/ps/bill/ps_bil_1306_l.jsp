<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1306_l.jsp
* ��� : �������Ա� ����Ʈ
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
// dataset �ν��Ͻ� ���� �κ�
PS_L_BILL_NONRCPMDataSet ds=(PS_L_BILL_NONRCPMDataSet)request.getAttribute("ds");

int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
%>


<!--�˻� -->
<table width="830" cellspacing="0" cellpadding="0" border="0" id="non_rcpm_list"><tr><td>
	<table width="830" cellspacing="0" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF">
		<tr bgcolor="#dddddd" align="center">
			<td width="30" class="gray" >
			<input type="checkbox" name="chkhead" onClick="javascript:select_all(this.checked)">
			</td>
                <td width="70" class="gray" > �Ա����� </td>
                <td width="310" class="gray" > ���ڹ�ȣ </td>
                <td width="70" class="gray" > ó������ </td>
                <td width="70" class="gray" > �������� </td>
                <td width="70" class="gray" > �Աݱݾ� </td>
                <td width="60" class="gray" > ������ </td>
                <td width="70" class="gray" > �������� </td>
                <td width="60" class="gray" > ó������ </td>
		</tr>
		<%
		//���� ��񿡼� �˻��� �����͸� ������
		for(int i=0; i<ds.curcommlist.size();i++) {
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)ds.curcommlist.get(i);

			String seq      = rec.getSeq();                  // �Ϸù�ȣ
			String acqdt	= rec.getAcqdt();                // ���� ����
			String acqno	= rec.getAcqno();                // ���� ��ȣ
			String rcpmrfldt= rec.getRcpmrfldt();             // �Ա� �ݿ�����
			String custbrwsno = rec.getCustbrwsno();         // �� ��ȸ ��ȣ
            String bonm      = rec.getBonm();               // ó������
			String recpdt   = rec.getRecpdt();               // ���� ����
			int    amt  	= rec.getAmt();					 // ���� �ݾ�
			String recpbrchcd = rec.getRecpbrchcd();         // ������ �ڵ�

			String rdr_no   = rec.getRdr_no();               // ���� ��ȣ
			String medicd   = rec.getMedicd();               // ��ü �ڵ�
			String termsubsno = rec.getTermsubsno();         // ���⵶�� ��ȣ
            String bocd    = rec.getBocd();                  // ���������ڵ�

			String rdrnm = rec.getRdrnm();                   // ���ڸ�
			String medinm= rec.getMedinm();                  // ��ü��
			String tbstprocclsf=rec.getTbstprocclsf();       // ���������ڵ�(��������)
			String tbstprocclsfnm=rec.getTbstprocclsfnm();   // ���������̸�(��������)
			String rcpmrflyn= rec.getRcpmrflyn();            // �Աݹݿ� ���θ�
			String rcpmrflynnm= rec.getRcpmrflynnm();            // �Աݹݿ� ���θ�
		%>
		<tr>
			<td width="30" class="gray" align="center" >
			<%
				if(rcpmrflyn.equals("N")) {
			%>
			<input type="checkbox" name="chk" value="<%=seq%>##<%=acqdt%>##<%=acqno%>##<%=rcpmrfldt%>##<%=recpdt%>##<%=amt%>##<%=recpbrchcd%>##<%=tbstprocclsf%>##<%=custbrwsno%>##<%=rdr_no%>##<%=medicd%>##<%=termsubsno%>##<%=bocd%>" onclick="checkOne();">
			</td>
			<td width="80" class="gray" align="center" >
				<input type="text" name="rcpmrfldt" value="<%=Util.convertS(rcpmrfldt)%>" size="10" class="text_box" caption="�Ա�����" notEmpty datatype="date" onkeyup="passFocus_Enter(this, this.form.rdr_no[<%=i%>],8)">
			</td>
			<td width="310" class="gray" align="center" >
	<!--
	        <input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" tabIndex="1" datatype="number"  len="9" class="text_box"caption="���ڹ�ȣ" notEmpty onkeyup="passFocus(this, this.form.medicd[<%=i%>],9)">
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3" tabIndex="2"  datatype="number"  		   class="text_box"caption="���ڹ�ȣ" notEmpty onkeyup="passFocus(this, this.form.termsubsno[<%=i%>],3)">
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" tabIndex="3" datatype="number" len="4" class="text_box" caption="���ڹ�ȣ" notEmpty onkeyup="search_rdrnm_medicdnm(<%=i%>)">
	-->
			<input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" datatype="number"  len="9" class="text_box" caption="���ڹ�ȣ" notEmpty onkeyup="passFocus_Enter(this, this.form.medicd[<%=i%>],9)">
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3" datatype="number"  		   class="text_box" caption="���ڹ�ȣ" notEmpty onkeyup="passFocus_Enter(this, this.form.termsubsno[<%=i%>],3)">
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" datatype="number" len="4" class="text_box" caption="���ڹ�ȣ" notEmpty onchange="search_rdrnm_medicdnm(<%=i%>);">

			<%
				} else {
			%>
			<input type="checkbox" name="chk" disabled>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rcpmrfldt" value="<%=Util.convertS(rcpmrfldt)%>" size="10" class="readonly_box" readOnly>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" class="readonly_box" readOnly>
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3"  class="readonly_box" readOnly>
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" class="readonly_box" readOnly>
			<%
				}
			%>
			<input type="text" name="rdrnm" value="<%=rdrnm%>" size="10" class="readonly_box" readOnly>
			<input type="text" name="medinm" value="<%=medinm%>" size="10" class="readonly_box" readOnly>
			</td>
            <td   class="gray" > <%=bonm.equals("")? "&nbsp;" : bonm %></td>
			<td   class="gray" > <%=tbstprocclsfnm%></td>
			<td   class="gray" align="right" > <%=Util.comma(amt)%></td>
			<td   class="gray" align="center" > <%=recpbrchcd%></td>
			<td   class="gray" align="center" > <%=Util.convertS(recpdt)%></td>
			<td   class="gray" > <%=rcpmrflynnm%> </td>
		</tr>
			<%
			}
				for(int i=0; i < no_data_page; i++) {
			%>
		<tr>
			<td width="30" class="gray" align="center" >
			<input type="checkbox" name="chk" disabled>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rcpmrfldt" size="10" class="readonly_box" readOnly>
			</td>
			<td  class="gray" align="center" >
			<input type="text" name="rdr_no" size="9" class="readonly_box" readOnly>
			<input type="text" name="medicd" size="3" class="readonly_box" readOnly>
			<input type="text" name="termsubsno" size="4" class="readonly_box" readOnly>
			<input type="text" name="rdrnm" size="10" class="readonly_box" readOnly>
			<input type="text" name="medinm" size="10" class="readonly_box" readOnly>
			</td>
			<td   class="gray" > &nbsp;</td>
            <td   class="gray" > &nbsp;</td>
			<td   class="gray" align="right" > &nbsp;</td>
			<td   class="gray" align="center" > &nbsp;</td>
			<td   class="gray" align="center" > &nbsp;</td>
			<td   class="gray" > &nbsp; </td>
		</tr>
	<%
		}
	%>
	</table>
	<!---button-->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
		<tr>
			<td align="center" height="2">
			<!--����-->
			</td>
		</tr>
		<tr>
			<td align="center" height="24" bgcolor="#E8E8E8">
			<!--JSP PAGE START---------------------------------------------------------------------------------->
			<%
			String curr_page_no = request.getParameter("curr_page_no");
			String total_records = String.valueOf(ds.getTotalcnt());
			String js_fn_nm = request.getParameter("js_fn_nm");
			%>
			<input type="hidden" name="total_records" value="<%=total_records%>">
			<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
			<jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
			<jsp:param name = "total_records" 	value="<%=total_records%>"/>
			<jsp:param name = "js_fn_nm" 			value="page_move"/>
			<jsp:param name = "records_per_page" 	value="15"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>

			<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
	</table>
</td></tr>
</table>
<script>
parent.document.all.non_rcpm_list.outerHTML = non_rcpm_list.outerHTML;

parent.setEventHandler();
</script>