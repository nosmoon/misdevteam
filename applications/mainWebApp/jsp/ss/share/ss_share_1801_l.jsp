<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1800_l.jsp
* ��� : �������� ���Ͼ�������-�˻�
* �ۼ����� : 2003-12-20
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    SS_L_JOBREC_SRCHDataSet ds = (SS_L_JOBREC_SRCHDataSet)request.getAttribute("ds");    // request dataset
    applySession = true;	// ���� ���� ����
    
    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
        
    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "10";}

    String srchdeptcd = Util.checkString((String)request.getAttribute("srchdeptcd"));
    String makedt1 = Util.checkString((String)request.getAttribute("makedt1"));
    String makedt2 = Util.checkString((String)request.getAttribute("makedt2"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.jobrec_form.makedt1.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���Ͼ������� ��� ȭ��
function job_write(){
    var lo_form1 = document.jobrec_form;

    // �׼��� "/ss/share/1810" �������� ������
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1810";
    lo_form1.submit();
        
}

// page �̵�
function page_move(curr_page_no) {
    var lo_form1 = document.jobrec_form;

    if(!curr_page_no) {
        lo_form1.curr_page_no.value = '1';
    } else {
        lo_form1.curr_page_no.value = curr_page_no;
    }
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    list_init();
}

// ���Ͼ������� �˻� ����Ʈ
function list_search(){
    var lo_form1 = document.jobrec_form;

    // �μ� �Ǵ� �˻������� "/ss/share/1801" �������� ������
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1801";
    lo_form1.submit();
        
}

// ���Ͼ������� �ʱ� ����Ʈ
function list_init(){
    var lo_form1 = document.jobrec_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.action = "/ss/share/1800";
    lo_form1.target = "_self";
    lo_form1.submit();
        
}


// ���Ͼ������� ��
function jobrec_view(makedt,makepersid,brwscnt) {
    var lo_form1 = document.jobrec_form;	

    // ���������� "/ss/share/1820" �������� ������
    lo_form1.makedt.value = makedt;
    lo_form1.makepersid.value = makepersid;
    lo_form1.brwscnt.value = brwscnt;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1820";
    lo_form1.submit();
}

//���Ͼ������� �ٿ�ε�
function jobrec_dwload(makedt,makepersid,dwloadcnt) {
    var lo_form1 = document.jobrec_form;	

    // ���������� "/ss/share/1850" �������� ������
    lo_form1.makedt.value = makedt;
    lo_form1.makepersid.value = makepersid;
    lo_form1.dwloadcnt.value = dwloadcnt;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/1850";
    lo_form1.submit();
}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<form name="jobrec_form" method="post" action="">
	<input type="hidden" name="makedt" value="">   <!--���Ͼ������� pk��-->
	<input type="hidden" name="makepersid" value=""> <!--���Ͼ������� pk��-->
	<input type="hidden" name="brwscnt" value="">
	<input type="hidden" name="dwloadcnt" value="">  <!--�ٿ�ε��-->
    <input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
    <input type="hidden" name="records_per_page" value="<%=records_per_page%>">
    <input type="hidden" name="js_fn_nm" value="<%=js_fn_nm%>">
    <input name="applySession" type="hidden" value="<%= applySession%>">   <!-- ���� ���� ���� -->	

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�������� 
      &gt; </b> �����׺��� > ���Ͼ�������</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--�˻� -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
    <td bgcolor="#EBE9DC" class="title" width="100"> 
      <select name="srchdeptcd" class="sel_all">
<%
	  writeDeptOpt(session, out, ds.buseolistOptHtml(srchdeptcd), true);
%>		
      </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ۼ����� 
    </td>
    <td bgcolor="#EBE9DC" class="title" width="180"> 
      <input name="makedt1" type="text" size="10" class="text_box" value="<%=makedt1%>" dataType=date>
      - 
      <input name="makedt2" type="text" size="10" class="text_box" value="<%=makedt2%>" dataType=date>
	</td>
	<td bgcolor="#EBE9DC" class="title" width="180"> 	      
      <select name="search_word_kind" class="sel_all">
        <option value='makepersnm' <%if(search_word_kind.equals("makepersnm")){%>selected<%}%>>�ۼ���</option>
        <option value='cont' <%if(search_word_kind.equals("cont")){%>selected<%}%>>����</option>
      </select>
      <input name="search_word" style="ime-mode:active;"  type="text" size="12" class="text_box" value="<%=search_word%>">
	</td>      
	<td bgcolor="#EBE9DC" class="title" align="right"> 	      
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all"  onclick="javascript:list_search();window.event.returnValue=false;"> 
    </td>
  </tr>
  <tr> 
    <td height="3" colspan="4"> 
      <!--����-->
    </td>
  </tr>
</table>
<!--Ÿ��Ʋ -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="27" bgcolor="#EBE9DC" class="title">���Ͼ������� ���</td>
    <td  height="27" bgcolor="#EBE9DC" class="title" width="40" align="right">
    	<input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:job_write();window.event.returnValue=false;">
    </td>
  </tr>
  <tr> 
    <td height="3" colspan="2"> 
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray">
  <tr bgcolor="#dddddd" align="center"> 
    <td width="250" class="gray" > �ۼ����� </td>
    <td width="100" class="gray" > �Ҽ�</td>
    <td width="100" class="gray" > �ۼ��� </td>
    <td class="gray" width="370" > ÷������ </td>
    <td width="80" class="gray" > ��ȸ�� </td>
    <td width="80" class="gray" > �ٿ�ε�� </td>
  </tr>
	<%--�������� ����Ʈ ���� ���� �κ�--%>
    <%

    for(int i=0 ; i< ds.jobreclist.size(); i++) {
        SS_L_JOBREC_SRCHJOBRECLISTRecord rec = (SS_L_JOBREC_SRCHJOBRECLISTRecord)ds.jobreclist.get(i);
    %>  
  <tr> 
    <td class="gray" width="250" align="center"> 
    	<a onClick="jobrec_view('<%=Util.checkString(rec.makedt)%>','<%= Util.checkString(rec.makepersid)%>','<%=rec.brwscnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.convertS(rec.makedt)%> </font>
    	</a>
    </td>    
    <td width="100" class="gray" >&nbsp;<%=Util.checkString(rec.deptnm)%></td>
    <td width="100" class="gray" >&nbsp;<%=Util.checkString(rec.makepersnm)%></td>
    <td class="gray" width="370" >&nbsp;
    	<a onClick="jobrec_dwload('<%=Util.checkString(rec.makedt)%>','<%= Util.checkString(rec.makepersid)%>','<%=rec.dwloadcnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(rec.filenm)%> </font>
    	</a>    
    </td>    
    <td align="right" width="80" class="gray" >&nbsp;<%=rec.brwscnt%>&nbsp;</td>
    <td align="right" width="80" class="gray" >&nbsp;<%=rec.dwloadcnt%>&nbsp;</td>
  </tr>
    <%
     }
    %>   
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr> 
    <td align="center" height="2"> 
      <!--����-->
    </td>
  </tr>
  <tr> 
    <td align="center" height="24" bgcolor="#E8E8E8"> 
	    <!--JSP PAGE START---------------------------------------------------------------------------------->
	    <jsp:include page="/jsp/ss/comm_jsp/page_navigator2.jsp">
	    <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
	    <jsp:param name = "total_records" 		value="<%=ds.getTotalcnt()%>"/>
	    <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
	    <jsp:param name = "records_per_page" 	value="10"/>
	    <jsp:param name = "page_set_gubun" 		value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>   
	    
	</td>
  </tr>
</table>
<br>
<br>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
