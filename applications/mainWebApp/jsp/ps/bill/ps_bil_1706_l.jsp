<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1706_l.jsp
* ��� : ����-�ڵ���ü ��û���-�˻����
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
    PS_L_AUTO_SHIFT_APLCDataSet ds = (PS_L_AUTO_SHIFT_APLCDataSet)request.getAttribute("ds");

    int records_per_page = Integer.parseInt(request.getParameter("records_per_page"));
    String curr_page_no = request.getParameter("curr_page_no");
    String total_records = String.valueOf(ds.getTotalcnt());
    String js_fn_nm = request.getParameter("js_fn_nm");
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">���� &gt; </b>�ڵ���ü��û����</td>
        </tr>
        <tr>
            <td height="10"><!--������ ���� ����--> </td>
        </tr>
    </table>
    <table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
        <tr>
            <td>
            <table width="830" border="0"  cellpadding="1" cellspacing="0" id="aplc_header_id">
                <tr>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="627">�ڵ���ü ��û(����) ��û�� ���</td>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right">
                      <input type="image" onclick="aplc_cnfm();window.event.returnValue=false;" img src="/html/comm_img/bu_sin01.gif" width="65" height="19" border="0" align="absmiddle">
                      <input type="image" onclick="aplc_canc();window.event.returnValue=false;" src="/html/comm_img/bu_sin02.gif" width="65" height="19" border="0" align="absmiddle">
                    </td>
                </tr>
                <tr>
                    <td height="3" colspan="2"><!--����--> </td>
                </tr>
            </table>
            <table width="830" height="290" border="0" cellpadding="2" cellspacing="0" bgcolor="#ffffff" class="gray" id="aplc_body_id">
                <tr align="left" bgcolor="#CCCCCC" >
                    <td width="24" rowspan="2" class="gray"> <input type="checkbox" name="chkhead" onclick="select_all(this,this.form.chk)"> <!-- select_all(this.checked, ifrm.document.aplc_body_id)"> -->
                    </td>
                    <td width="102" rowspan="2" class="gray"> ���ڸ�<br>
                        (�����ڹ�ȣ) </td>
                    <td height="16" class="gray"> �����ڸ�(��ȭ��ȣ) </td>
                    <td width="80" class="gray" align="center"> ��ü���� </td>
                    <td width="56" class="gray" align="center"> ��û���� </td>
                    <td width="52" class="gray" align="center"> ó������ </td>
                    <td width="52" class="gray" align="center"> �������� </td>
                    <td width="86" class="gray" align="center"> ��ü </td>
                    <!--td width="33" class="gray" align="center"> �μ� </td-->
                    <td width="61" class="gray" align="center"> �������� </td>
                    <td width="61" class="gray" align="center"> ��ü���ۿ� </td>
                    <td width="61" class="gray" align="center"> ���ʽ�û�� </td>
                </tr>
                <tr align="left" >
            <td height="13" bgcolor="#CCCCCC" class="gray"> ���ڹ�ȣ </td>
            <td height="13" colspan="8" bgcolor="#CCCCCC" class="gray" align="center"> �����ּ� </td>
        </tr>
<%

    String tempStr = null;
    String pymttel = null;

    boolean closYn = false;
    String closYnStr = null;

    int i = 0;
    for(i=0; i<ds.rsltcur.size(); i++){
        PS_L_AUTO_SHIFT_APLCRSLTCURRecord rsltcurRec = (PS_L_AUTO_SHIFT_APLCRSLTCURRecord)ds.rsltcur.get(i);

		if(rsltcurRec.getPymttel1()!=null && !rsltcurRec.getPymttel1().equals("")) {	// ��������ȭ��ȣ
			pymttel = rsltcurRec.getPymttel1() + "-" + rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
		} else {
			pymttel = rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
		}

		// �������� => ���ۿ��ΰ� 'Y'�̰ų�, �Ա������ݿ����ΰ� 'Y'�̸� �������δ� true. ���º��� �� ���������� �� �� ����.
		if("Y".equals(rsltcurRec.getTrsmyn()) || "Y".equals(rsltcurRec.getPymtinforflyn())) {
			closYn = true;
		} else {
			closYn = false;
		}

        if(closYn) {
            //tempStr = "";
            tempStr = "onMouseOver=\"change_bgColor(this, '#BFD2DD')\" onMouseOut=\"change_bgColor(this, '#FFFFFF')\" " + "onClick=\"detail('" + rsltcurRec.getAplcno() + "','" + rsltcurRec.getShftclsf() + "','" + rsltcurRec.getAplcdt() + "','" + pymttel + "','" + rsltcurRec.getTrsmyn() + "','" + rsltcurRec.getPymtinforflyn() + "')\"" + " style=\"cursor:hand\"";
            closYnStr = "Y";
        } else {
            tempStr = "onMouseOver=\"change_bgColor(this, '#BFD2DD')\" onMouseOut=\"change_bgColor(this, '#FFFFFF')\" " + "onClick=\"detail('" + rsltcurRec.getAplcno() + "','" + rsltcurRec.getShftclsf() + "','" + rsltcurRec.getAplcdt() + "','" + pymttel + "','" + rsltcurRec.getTrsmyn() + "','" + rsltcurRec.getPymtinforflyn() + "')\"" + " style=\"cursor:hand\"";
            closYnStr = "N";
        }
%>
                <tr align="left" <%=tempStr%> name="first_tr">
                    <td rowspan="2" class="gray">
                        <input type="checkbox" name="chk" value="" onClick="checkOne();">
                        <input type="hidden" name="aplcno" value="<%=rsltcurRec.getAplcno()%>"><%--��û��ȣ--%>
                        <input type="hidden" name="shftclsf" value="<%=rsltcurRec.getShftclsf()%>"><%--��ü����--%>
                        <input type="hidden" name="aplcdt" value="<%=rsltcurRec.getAplcdt()%>"><%--��û����--%>
                        <input type="hidden" name="trsmyn" value="<%=rsltcurRec.getTrsmyn()%>"><%--���ۿ���--%>
                        <input type="hidden" name="closyn" value="<%=closYnStr%>"><%--��������--%>
                        <input type="hidden" name="aplcprocstat" value="<%=rsltcurRec.getAplcprocstat()%>"><%--��ûó������--%>
                        <input type="hidden" name="shftaplcclsf" value="<%=rsltcurRec.getShftaplcclsf()%>"><%--��ü��û����--%>
                    </td>
                    <td rowspan="2" class="gray"><%=rsltcurRec.getRdrnm()%><br>
                        (<%=rsltcurRec.getPymtno_2()%>)</td>
                    <td height="17" class="gray"><%=rsltcurRec.getPymtnm()%>(<%=pymttel%>)</td>
                    <td class="gray" align="center"><%=rsltcurRec.getShftclsfnm()%></td>
                    <td class="gray"><%=rsltcurRec.getAplcclsfnm()%></td>
                    <td class="gray"><%=rsltcurRec.getAplcprocstatnm()%></td>
                    <td class="gray">
                        <%if(closYn) out.print("Y"); else out.print("N");%>
                    </td>
                    <td class="gray"><%=rsltcurRec.getMedinm()%>&nbsp;</td>
                    <!--td class="gray"><%=rsltcurRec.getDlvqty()%></td-->
                    <td class="gray" align="center"><%=Util.convertS(rsltcurRec.getAplcdt())%></td>
                    <td class="gray" align="center"><%=Util.convertMonthS(rsltcurRec.getAplyyymm())%>&nbsp;</td>
                    <td class="gray" align="center"><%=Util.convertS(rsltcurRec.getFstaplcdt())%>&nbsp;</td>
                </tr>
                <tr align="left" <%=tempStr%> name="second_tr">
                    <td height="17" class="gray"><%=rsltcurRec.getRdr_no()%>&nbsp;</td>
                    <td height="17" colspan="8" class="gray"><%=rsltcurRec.getDlvaddr()%> <%=rsltcurRec.getDlvaddrdtls()%><%=rsltcurRec.getShftaplcclsfnm()%>&nbsp;</td>
                </tr>
<%
    }

    if(i<records_per_page) {
        for(int j=0; j<records_per_page-i; j++) {
%>
                <tr align="left" >
                    <td rowspan="2" class="gray">&nbsp;</td>
                    <td rowspan="2" class="gray">&nbsp;<br>
                        &nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray">&nbsp;</td>
                    <td class="gray">&nbsp;</td>
                    <td class="gray">&nbsp;</td>
                    <td class="gray">&nbsp;</td>
                    <td class="gray">&nbsp;</td>
                    <td class="gray" align="center">&nbsp;</td>
                    <td class="gray" align="center">&nbsp;</td>
                    <td class="gray" align="center">&nbsp;</td>
                </tr>
                <tr align="left" >
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" colspan="8" class="gray">&nbsp;</td>
                </tr>
<%
        }
    }
%>
                <tr align="right" bgcolor="#dddddd" >
                    <td colspan="10" class="gray" align="left" style="border-right-width:0"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">��Ȯ�� <b><font color="red"><%= ds.getUncnfmcnt()%>��</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">Ȯ�� <b><%= ds.getCnfmcnt()%>��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">��� <b><%= ds.getCanccnt()%>��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���ο��� <b><%= ds.getAprverrcnt()%>�� </b></td><td class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� <b><%= ds.getTotalcnt()%>��</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="aplc_footer_id">
                <tr>
                    <td align="center" height="2"> <!--����--> </td>
                </tr>
                <tr>
                    <td align="center" height="24" bgcolor="#E8E8E8">
                    <!--JSP PAGE START---------------------------------------------------------------------------------->
                    <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
                    <jsp:param name = "total_records" 		value="<%=total_records%>"/>
                    <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
                    <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
                    <jsp:param name = "page_set_gubun" 		value="0"/>
                    </jsp:include>
                    <!--JSP PAGE END------------------------------------------------------------------------------------>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>
<br>
<br>
</body>
<script language="javascript">
    parent.aplc_header_id.outerHTML = aplc_header_id.outerHTML;
    parent.aplc_body_id.outerHTML = aplc_body_id.outerHTML;
    parent.aplc_footer_id.outerHTML = aplc_footer_id.outerHTML;
<%
    if(ds.rsltcur.size()==0) {
        out.print("alert(\"�˻������ �����ϴ�.\");");
    }
%>
</script>
</html>
