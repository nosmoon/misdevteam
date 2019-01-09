<%@ page contentType="text/html; charset=EUC-KR" %>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*;
"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ep.jsp
* ��� : EP�� ���ؼ� �˾�ȭ������ ������ ����ڿ� ���� ����ó�� �� �ش� XRW ȣ��
* �ۼ����� : 2009-03-24
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 	
* ������ : 	
* �������� : 	
---------------------------------------------------------------------------------------------------%>

<%
		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
		String uid			= (String)session.getAttribute("uid");
		String emp_no       = (String)session.getAttribute("emp_no");
		String emp_nm       = (String)session.getAttribute("emp_nm");
		String cmpycd       = (String)session.getAttribute("cmpycd");
		String deptcd       = (String)session.getAttribute("deptcd");
		String deptnm       = (String)session.getAttribute("deptnm");
		String selldeptcd	= (String)session.getAttribute("selldeptcd");
		String selldeptnm   = (String)session.getAttribute("selldeptnm");
		String areacd       = (String)session.getAttribute("areacd");
		String areanm       = (String)session.getAttribute("areanm");
		String deptplacyn   = (String)session.getAttribute("deptplacyn");
		String jobcd        = (String)session.getAttribute("jobcd");
		String jobnm        = (String)session.getAttribute("jobnm");
		String posicd       = (String)session.getAttribute("posicd");
		String posinm       = (String)session.getAttribute("posinm");
		String usertypecd   = (String)session.getAttribute("usertypecd");
		String usertypenm   = (String)session.getAttribute("usertypenm");
		String email        = (String)session.getAttribute("email");
		String dealdeptcd   = (String)session.getAttribute("dealdeptcd");
		String dealdeptnm   = (String)session.getAttribute("dealdeptnm");

		// CIIS �߰� �׸��
		String hdqtcd		= (String)session.getAttribute("hdqtcd");
		String hdqtnm		= (String)session.getAttribute("hdqtnm");
		String partcd		= (String)session.getAttribute("partcd");
		String partnm		= (String)session.getAttribute("partnm");
		String hdqtplacyn	= (String)session.getAttribute("hdqtplacyn");
		String partplacyn	= (String)session.getAttribute("partplacyn");
		String dealmedicd	= (String)session.getAttribute("dealmedicd");
		String epView_seq	= (String)session.getAttribute("epView_seq");
		String dlco_no  	= (String)session.getAttribute("dlco_no");


        //////////////////////////////////////////////////////////////////
        //
        //  �������Ǵ� URL�� parameter passing ����߰�
        //  by ������ at 20090612
        //
        //  ex) .../ep.jsp?url=/.../aa.xrw?param1=&param2= 
        String url = request.getParameter("url");
        if(url == null) url = "";
        StringBuffer params = new StringBuffer();
        
        int pos = url.indexOf("?");
        if(pos > 0 ) {
            String [] tokens = url.substring(pos+1).split("&");
            url = url.substring(0,pos);

            for( int i = 0; tokens != null && i < tokens.length; i++) {
                String token = tokens[i];

                int pos2 = token.indexOf("=");

                if(pos2 > 0) {
                    session.setAttribute(token.substring(0,pos2),token.substring(pos2+1));
                }
            }
        }


	String domainName = request.getScheme()+"://"+request.getServerName()+":7001"+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";

	strMenuUrl = "/co/mng/1000";
	strmainFrame = request.getParameter("url");
	
%>
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>�����Ϻ��������������ý���</title>
<Script language="javascript" for="TFMenu" event="OnClickedMenuItem(idx)">
	//Ŭ���� �޴��� �����ܰ踦 ����Ʈ�޴�Ʈ���� ������
	document.all.mainFrame.window.javaScript.loadLeftMenuXml(idx);
	document.all.mainFrame.window.javaScript.onBtnTree("top");
	//����ȭ���� ȣ��
	//document.all.mainFrame.window.javaScript.onLoadPage(idx);
	
	model.property("epView_seq") = "<%= epView_seq %>";
	model.property("dlco_no") = "<%= dlco_no %>";
</script>
<script language="javascript" src="/js/TFControlWrite.js"></script>
<!--
<script type="text/javascript">
    // �� frame ����
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // �ֱ������� ����� �Լ�
    function onScheduler(){

        // �� �������� ��û
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ess.chosun.com/common/jsp/refresh.jsp";
        }
        // 10�� ����(���� �������� ���� ����)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // �ʱ� ����(form�� onLoad�� ��ġ�Ͽ��� ��)
    onScheduler();

</script>
-->
</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="auto">

<form name="SessionInfo">
	<input type="hidden" name="uid"			value="<%=uid%>">
	<input type="hidden" name="emp_no"		value="<%=emp_no%>">
	<input type="hidden" name="emp_nm"		value="<%=emp_nm%>">
	<input type="hidden" name="cmpycd"		value="<%=cmpycd%>">
	<input type="hidden" name="deptcd"		value="<%=deptcd%>">
	<input type="hidden" name="deptnm"		value="<%=deptnm%>">
	<input type="hidden" name="selldeptcd"	value="<%=selldeptcd%>">
	<input type="hidden" name="selldeptnm"	value="<%=selldeptnm%>">
	<input type="hidden" name="areacd"		value="<%=areacd%>">
	<input type="hidden" name="areanm"		value="<%=areanm%>">
	<input type="hidden" name="deptplacyn"	value="<%=deptplacyn%>">
	<input type="hidden" name="jobcd"		value="<%=jobcd%>">
	<input type="hidden" name="jobnm"		value="<%=jobnm%>">
	<input type="hidden" name="posicd"		value="<%=posicd%>">
	<input type="hidden" name="posinm"		value="<%=posinm%>">
	<input type="hidden" name="usertypecd"	value="<%=usertypecd%>">
	<input type="hidden" name="usertypenm"	value="<%=usertypenm%>">
	<input type="hidden" name="email"		value="<%=email%>">
	<input type="hidden" name="dealdeptcd"	value="<%=dealdeptcd%>">
	<input type="hidden" name="dealdeptnm"	value="<%=dealdeptnm%>">
	<input type="hidden" name="hdqtcd"		value="<%=hdqtcd%>">
	<input type="hidden" name="hdqtnm"		value="<%=hdqtnm%>">
	<input type="hidden" name="partcd"		value="<%=partcd%>">
	<input type="hidden" name="partnm"		value="<%=partnm%>">
	<input type="hidden" name="hdqtplacyn"	value="<%=hdqtplacyn%>">
	<input type="hidden" name="partplacyn"	value="<%=partplacyn%>">
	<input type="hidden" name="dealmedicd"	value="<%=dealmedicd%>">
	<input type="hidden" name="domainnm"	value="<%=domainName%>">
	<input type="hidden" name="epView_seq"	value="<%=epView_seq%>">
	<input type="hidden" name="dlco_no"	value="<%=dlco_no%>">
</form>

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
	<tr>
		<td>
			<!-- ===================== TF Framework �κ� =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "essmainFrame", "<%=strmainFrame%>", "100%", "100%", "<%=domainName%>");
							</script>
						</div>
<!-- fileDownload�� ���� hidden iframe ���� -->
	<div><iframe id="hiddenIframe" src="" style="width: 0px; height: 0px; visibility: hidden;" ></iframe></div>
<!-- fileDownload�� ���� hidden iframe �� -->							
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>

</body>
</HTML>
