<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bill_1716_s.jsp
* ��� : ����-�ڵ���ü��û-�ڵ���ü��
* �ۼ����� : 2006-04-17
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    PS_S_APLCDataSet ds = (PS_S_APLCDataSet)request.getAttribute("ds");
    PS_S_APLCRSLTCURRecord rsltcurRec = (PS_S_APLCRSLTCURRecord)ds.rsltcur.get(0);

    boolean closYn = false;	// �������� : true�̸� �������ڹ�ȣ�� ������ �� �ִ�.
    String trsmyn = Util.checkString(request.getParameter("trsmyn"));				// ���ۿ���
    String pymtinforflyn = Util.checkString(request.getParameter("pymtinforflyn"));	// ���������ݿ�����
    String closYnStr = null;

    // �������� => ���ۿ��ΰ� 'Y'�̰ų�, �Ա������ݿ����ΰ� 'Y'�̸� �������δ� true. ���º��� �� ���������� �� �� ����.
	if("Y".equals(trsmyn) || "Y".equals(pymtinforflyn)) {
		closYn = true;
		closYnStr = "Y";
	} else {
		closYn = false;
		closYnStr = "N";
	}
%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<body bgcolor="#F8F7F7">
<table width="830" border="0"  cellpadding="1" cellspacing="0" id="aplc_header_id">
<input type="hidden" name="accflag" value="<%=rsltcurRec.aplcclsf%>">
<input type="hidden" name="cardcmpycd" value="<%=rsltcurRec.cardcmpycd%>">
<input type="hidden" name="cardno" value="<%=rsltcurRec.cardno%>">
<input type="hidden" name="shftclsf" value="<%=rsltcurRec.shftclsf%>">
<input type="hidden" name="pymtnm" value="<%=rsltcurRec.pymtnm%>">
<input type="hidden" name="pymtno_2" value="<%=rsltcurRec.pymtno_2%>">
<input type="hidden" name="pymttel1" value="<%=rsltcurRec.pymttel1%>">
<input type="hidden" name="pymttel2" value="<%=rsltcurRec.pymttel2%>">
<input type="hidden" name="pymttel3" value="<%=rsltcurRec.pymttel3%>">
<input type="hidden" name="bankcd" value="<%=rsltcurRec.recpinstt%>">
<input type="hidden" name="acctno" value="<%=rsltcurRec.acctno%>">
<input type="hidden" name="prn" value="<%=rsltcurRec.prn%>">
<input type="hidden" name="aplyyymm" value="<%=rsltcurRec.aplyyymm%>">
<input type="hidden" name="email" value="<%=rsltcurRec.email%>">
<input type="hidden" name="aplcpathcd" value="<%=rsltcurRec.aplcpathcd%>">

    <tr>
        <td  height="27" bgcolor="#EBE9DC" class="title" width="681">
            �󼼳���
            <input type="hidden" name="aplcno" value="<%=request.getParameter("aplcno")%>"><%--��û��ȣ--%>
            <input type="hidden" name="shftclsf" value="<%=request.getParameter("shftclsf")%>"><%--��ü����--%>
            <input type="hidden" name="aplcdt" value="<%=request.getParameter("aplcdt")%>"><%--��û����--%>
            <input type="hidden" name="closyn" value="<%=closYnStr%>"><%--��������--%>
        </td>
        <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right">&nbsp;</td>
    </tr>
    <tr>
        <td height="3" colspan="2"> <!--����--> </td>
    </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0"  class="gray" bgcolor="#ffffff" id="aplc_body_id">
    <tr align="center">
        <td colspan="8" class="gray" bgcolor="#dddddd" height="25"> ������ ���� </td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">�����ڸ�</td>
        <td class="gray" colspan="7"><%= rsltcurRec.pymtnm%>(<%=Util.checkString(request.getParameter("pymttel"))%>)</td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">�����ڹ�ȣ</td>
        <td colspan="7" class="gray"><%= rsltcurRec.pymtno_2%>&nbsp;</td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">��û����</td>
        <td colspan="7" class="gray"><%= Util.convertS(rsltcurRec.aplcdt)%></td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">��ü����</td>
        <td colspan="7" class="gray"><%= rsltcurRec.shftclsfnm%></td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">��ü���ۿ�<font color="red">*</font></td>
        <td colspan="6" class="gray">

        <%---------------------------------------------------------------------------------------------------
        * �������� : ��ü���ۿ� �׽� ���������ϰ� ����
        * ������ :	�����
        * �������� :	2004-08-16
        * ������ϸ� : �ּ�ó��
        ---------------------------------------------------------------------------------------------------%>
        <%--
        	if(closYn) {	// ������ ��û���� ��� ������ �� ����.
        %>
        	<%=Util.convertMonthS(rsltcurRec.pymtstrtdt)%>
        	<input type="hidden" name="aplyyymm" value="<%=rsltcurRec.aplyyymm%>">
        <%
        	} else {
        --%>

        	<select name="pymtstrtdt" class="sel_all" notEmpty caption="��ü���ۿ�">
        		<option value="<%=rsltcurRec.aplyyymm%>"><%= Util.convertMonthS((rsltcurRec.aplyyymm))%></option>
        	<%
        		String nowDate = Util.getDate();
				String tempDate = nowDate;

                int today = Integer.parseInt(Util.getDate());
                int basiday = Integer.parseInt(Util.getYyyyMm()+"11");
                int j=0;

                if(today > basiday ) {
                  j++;
                }

        		// for(int i=1; i<12; i++) {
        		//	tempDate = Util.addMonth(tempDate, 1);
        		for(int i=j; i<12+j; i++) {
        			tempDate = Util.addMonth(nowDate, i);
        	%>
        		<option value="<%=tempDate.substring(0, 6)%>"><%=Util.convertMonthS(tempDate.substring(0, 6))%></option>
        	<%
        		}
        	%>
        	</select>

        <%--
        	}
        --%>
        </td>
        <td class="gray">&nbsp;<!--2005-01-31 �̺�Ʈ ���� <input type="checkbox" name="remk"
            <%--if(rsltcurRec.remk.equals("E1")){out.print(" checked");}else{out.print(" ");} --%>>
            <font color="red">�̿����</font> ķ���� ����--></td>
    </tr>
    <tr align="center">
        <td colspan="8" bgcolor="#dddddd" class="gray" height="25"> ���� ���� </td>
<%--            <input type="hidden" name="bocd"    value="<%=rsltcurRec.bocd%>" ><!--���������� ����� ����--> --%>
            <input type="hidden" name="bocd"    value="" ><!--���������� ����� ����-->
            <input type="hidden" name="rdrprn"  value="" ><!--���������� ����� �ֹι�ȣ �Է�-->
            <input type="hidden" name="dlvzip"  value="" ><!--���������� ����� �����ȣ-->
            <input type="hidden" name="dlvaddr" value="" ><!--���������� ����� �ּ�-->
            <input type="hidden" name="dlvaddrdtls" value="" ><!--���������� ����� ���ּ�-->
    </tr>
    <tr>
        <td width="75" height=25 bgcolor="#dddddd" class="gray">�����ڸ�<font color="red">*</font></td>
        <td class="gray"> <input type="text" name="rdrnm"  class="text_box" value="<%= rsltcurRec.rdrnm%>"> </td>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">��ȭ��ȣ<font color="red">*</font></td>
        <td class="gray">
            <input type="text" name="rdrtel_no1"  class="text_box" value="<%=rsltcurRec.rdrtel1%>" size="4">-
            <input type="text" name="rdrtel_no2"  class="text_box" value="<%=rsltcurRec.rdrtel2%>" size="4">-
            <input type="text" name="rdrtel_no3"  class="text_box" value="<%=rsltcurRec.rdrtel3%>" size="4">
        </td>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">�ڵ���<font color="red">*</font></td>
        <td colspan="3" class="gray">
            <input type="text" name="rdrptph_no1"  class="text_box" value="" size="4">-
            <input type="text" name="rdrptph_no2"  class="text_box" value="" size="4">-
            <input type="text" name="rdrptph_no3"  class="text_box" value="" size="4">
        </td>
    </tr>
    <tr>

        <td width="75" height="25" bgcolor="#dddddd" class="gray">���ڹ�ȣ<font color="red">*</font></td>
        <td colspan="5" class="gray">

        <%
        	if(closYn) {	// ������ ��û���� ��� ������ �� ����.
        %>
        	<input type="text" name="rdr_no" value="<%= rsltcurRec.rdr_no%>" size="9" class="text_box" notEmpty readOnly=true caption="���ڹ�ȣ">
        	<input type="text" name="medicd" value="<%= rsltcurRec.medicd%>" size="3" class="text_box" notEmpty readOnly=true caption="��ü�ڵ�">
        	<input type="text" name="termsubsno" value="<%= rsltcurRec.termsubsno%>" size="4" class="text_box" notEmpty readOnly=true caption="���ⱸ����ȣ">
            <%
                if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
                   rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
                   rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
            %>
            <td colspan="2" class="gray" align="right">
            <input type="image" onclick="reader_detail_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
            </td>
            <%
                }
            %>

        <%
        	} else {
        %>
        	<input type="text" name="rdr_no" value="<%= rsltcurRec.rdr_no%>" size="9" class="readonly_box" notEmpty readOnly=true caption="���ڹ�ȣ">
        	<input type="text" name="medicd" value="<%= rsltcurRec.medicd%>" size="3" class="readonly_box" notEmpty readOnly=true caption="��ü�ڵ�">
        	<input type="text" name="termsubsno" value="<%= rsltcurRec.termsubsno%>" size="4" class="readonly_box" notEmpty readOnly=true caption="���ⱸ����ȣ">
            <%--���ڹ�ȣ�� ���� ��쿡 ���ڰ˻� ��ư ���--%>
            <%
                if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
                   rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
                   rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
            %>
            <td colspan="2" class="gray" align="right">
            <input type="image" onclick="reader_detail_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
            </td>
            <%
                }
            %>

        <%
        	}
        %>
        </td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">������ü<font color="red">*</font></td>
        <td width="75" class="gray">

		<%
			boolean mediyn = false;
            if(rsltcurRec.medicd!=null && !rsltcurRec.medicd.equals("")) {
                mediyn = true;
            }

        	if(mediyn) {	// ������ ��û���� ��� ������ �� ����.
        %>
        	<input type="text" name="medinm" value="<%= rsltcurRec.medinm%>" class="readonly_box" notEmpty readOnly=true caption="��ü��">
        	<%--input type="hidden" name="medicd" value="<%= rsltcurRec.medicd%>" --%>
        <%
        	} else {
        %>

	        <%--������ü�� ���� text��� �Ǵ� select���--%>
	        <%
	            if(mediyn) {
	        %>
	        	<select name="medicd" class="sel_all" id="medi_list_id">
	                <option value="<%= rsltcurRec.medicd%>"><%= rsltcurRec.medinm%></option>
	            </select>
	        <%
	            } else {
	        %>
	            <select name="medicd" class="sel_all" id="medi_list_id">
	                <option>����</option>
	            </select>
	        <%
	            }
	        %>

	    <%
	    	}
	    %>
        </td>
        <td width="80" bgcolor="#dddddd" class="gray" >�����Ⱓ<font color="red">*</font></td>
        <td class="gray"  width="200">
            <input type="text" name="subsfrser_no" size="10" value="<%=rsltcurRec.subsfrser_no%>" class="readonly_box" style="text-align:center" readonly caption="�����Ⱓ" notEmpty> -
            <input type="text" name="substoser_no" size="10" value="<%=rsltcurRec.substoser_no%>" class="readonly_box" style="text-align:center" readonly caption="�����Ⱓ" notEmpty>
        </td>

        <td width="90" bgcolor="#dddddd" class="gray" >�Ҽ�����<font color="red">*</font></td>
        <td class="gray"  width="200" colspan="5">
            <input type="text" name="bocdnm" value="<%=rsltcurRec.bonm%>" size="20" class="readonly_box" style="text-align:center" readonly caption="�Ҽ�����" notEmpty>
        </td>

    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">�����ּ�<font color="red">*</font></td>
        <td colspan="7" class="gray">
            <input type="text" size="100" name="addr_all" value="<%=rsltcurRec.dlvaddr%>&nbsp;<%=rsltcurRec.dlvaddrdtls%>" class="readonly_box" style="text-align:left" readonly caption="�ּ�" notEmpty>
        </td>
    </tr>
    <tr>
        <td width="100" class="gray" bgcolor="#dddddd">�Ǳ����ݾ�</td>
        <td width="70"  class="gray" align="right" style="border-right-width:0"><span id="realsellamt_id"><% if(mediyn) { out.print(Util.comma(rsltcurRec.realsellamt)); } else { out.print("&nbsp;&nbsp;"); }%></span>��</td>
        <td width="100" class="gray" bgcolor="#dddddd">��������</td>
        <td width="150" class="gray" align="left"style="border-right-width:0"> <%=rsltcurRec.agrmnt_list%>&nbsp;</td>
        <td width="100" class="gray" bgcolor="#dddddd">�Աݳ���</td>
        <td width="150" class="gray" align="left" style="border-right-width:0" colspan="3"><%=rsltcurRec.clamt_list%>&nbsp;</td>
    </tr>
</table>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> �Ҽ����� </td>
        <td width="100" align="center" class="gray"> ������ü </td>
        <td width="150" align="center" class="gray"> ���ڹ�ȣ </td>
        <td width="130" align="center" class="gray"> �����Ⱓ </td>
        <td width="80"  align="center" class="gray"> �ּ� </td>
        <td width="80"  align="center" class="gray"> �����ڹ�ȣ </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="aplc_footer_id">
    <tr>
        <td align="center" height="2"> <!--����--> </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
          <input type="image" src="/html/comm_img/bu_save.gif" onclick="aplc_detail_save();window.event.returnValue=false;" width="39" height="19" border="0" align="absmiddle">
          <input type="image" src="/html/comm_img/bu_list.gif" onclick="list_search();window.event.returnValue=false;" width="65" height="19" align="absmiddle" border="0"><!--img onClick="aplc_list_form.reset();window.event.returnValue=false" style="cursor:hand" src="/html/comm_img/bu_cencle.gif" width="39" height="19" border="0" align="absmiddle"--> </td>
    </tr>
</table>
</body>
</html>
<%
    if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
       rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
       rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
%>
<script language="javascript">
    parent.aplc_header_id.outerHTML = aplc_header_id.outerHTML;
    parent.aplc_body_id.outerHTML = aplc_body_id.outerHTML;
    parent.aplc_footer_id.outerHTML = aplc_footer_id.outerHTML;
    parent.pbrdr_list.outerHTML = pbrdr_list.outerHTML;
    parent.setEventHandler();
</script>
<%
    } else {
%>
<script language="javascript">
    parent.aplc_header_id.outerHTML = aplc_header_id.outerHTML;
    parent.aplc_body_id.outerHTML = aplc_body_id.outerHTML;
    parent.aplc_footer_id.outerHTML = aplc_footer_id.outerHTML;
    parent.setEventHandler();
</script>
<%
    }
%>
