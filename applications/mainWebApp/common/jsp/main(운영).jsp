<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*,
"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : main.jsp
* ��� : ����ó�� �� ���������� ����
* �ۼ����� : 2009-02-18
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 	
* ������ : 	
* �������� : 	
---------------------------------------------------------------------------------------------------%>
<%!
    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }
            }
        }
        return ret;
    }
%>
<%

		String uid = (String)session.getAttribute("ACCT_CD") == null ? "" : (String)session.getAttribute("ACCT_CD");				// ���̵�
		String emp_no = (String)session.getAttribute("EMPNO") == null ? "" : (String)session.getAttribute("EMPNO");				// ���
		String emp_nm = (String)session.getAttribute("NM") == null ? "" : (String)session.getAttribute("NM");					// ����

		String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD");		// ȸ��
		String cmpynm = (String)session.getAttribute("BLNG_CMPY_NM") == null ? "" : (String)session.getAttribute("BLNG_CMPY_NM");		// ȸ���

		String deptcd = (String)session.getAttribute("PART_CD") == null ? "" : (String)session.getAttribute("PART_CD");			// �μ�
		String deptnm = (String)session.getAttribute("PART_NM") == null ? "" : (String)session.getAttribute("PART_NM");			// �μ���

		String selldeptcd = (String)session.getAttribute("CRM_SELL_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_CD");		// �Ǹźμ�
		String selldeptnm = (String)session.getAttribute("CRM_SELL_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_NM");		// �Ǹźμ���
		
		String areacd = (String)session.getAttribute("CRM_MANG_AREA_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_CD");			// ���������ڵ�
		String areanm = (String)session.getAttribute("CRM_MANG_AREA_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_NM");			// ����������

		
		
		String jobcd = (String)session.getAttribute("JOB_CLSF_CD") == null ? "" : (String)session.getAttribute("JOB_CLSF_CD");				// ��������
		String jobnm = (String)session.getAttribute("JOB_CLSF_NM") == null ? "" : (String)session.getAttribute("JOB_CLSF_NM");				// �������и�
		
		String posicd = (String)session.getAttribute("DTY_CD") == null ? "" : (String)session.getAttribute("DTY_CD");			// ��å�ڵ�
		String posinm = (String)session.getAttribute("DTY_NM") == null ? "" : (String)session.getAttribute("DTY_NM");			// ��å��
		
		String usertypecd = (String)session.getAttribute("EMP_CLSF_CD") == null ? "" : (String)session.getAttribute("EMP_CLSF_CD");		// ��������ڵ�
		String usertypenm = (String)session.getAttribute("EMP_CLSF_NM") == null ? "" : (String)session.getAttribute("EMP_CLSF_NM");		// ������и�
		
		String email = (String)session.getAttribute("EMAIL_ID") == null ? "" : (String)session.getAttribute("EMAIL_ID");				// �̸���

		String dealdeptcd = (String)session.getAttribute("CRM_MANG_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_CD");		// �����μ��ڵ�
		String dealdeptnm = (String)session.getAttribute("CRM_MANG_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_NM");		// �����μ���
			
		String mobile = (String)session.getAttribute("PTPH") == null ? "" : (String)session.getAttribute("PTPH");			// �޴���ȭ
		String dealmedicd	= (String)session.getAttribute("dealmedicd") == null ? "" : (String)session.getAttribute("dealmedicd"); 		// ������ü�ڵ�
		
		// ��ü�Ҹ�
		String hdqtcd = "";			// �����ڵ�
		String hdqtnm = "";			// ���θ�
		String partcd = "";			// ��Ʈ�ڵ�
		String partnm = "";			// ��Ʈ��
		String deptplacyn = "";												// �μ��忩��
		String hdqtplacyn = "";												// �����忩��
		String partplacyn = "";												// ��Ʈ�忩��
		// -------

		if(uid.equals("")){
			response.sendRedirect("/");
		}
		
		/*
		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // ���
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // ����
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // ȸ��
		String cmpynm       = request.getHeader("CMPYNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYNM"));         // ȸ���
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTCD"));         // �μ�
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTNM"));         // �μ���
		String selldeptcd	= request.getHeader("SELLDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTCD"));     // �Ǹźμ�
		String selldeptnm   = request.getHeader("SELLDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTNM"));     // �Ǹźμ���
		String areacd       = request.getHeader("AREACD")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREACD"));         // ���������ڵ�
		String areanm       = request.getHeader("AREANM")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREANM"));         // ����������
		String deptplacyn   = request.getHeader("DEPTPLACYN")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTPLACYN"));     // �μ��忩��
		String jobcd        = request.getHeader("JOBCD")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBCD"));          // ��������
		String jobnm        = request.getHeader("JOBNM")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBNM"));          // �������и�
		String posicd       = request.getHeader("POSICD")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSICD"));         // ��å�ڵ�
		String posinm       = request.getHeader("POSINM")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSINM"));         // ��å��
		String usertypecd   = request.getHeader("USERTYPECD")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPECD"));     // ��������ڵ�
		String usertypenm   = request.getHeader("USERTYPENM")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPENM"));     // ������и�
		String email        = request.getHeader("EMAIL")        == null ? "" : Util.Uni2Ksc(request.getHeader("EMAIL"));          // �̸���
		String dealdeptcd   = request.getHeader("DEALDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTCD"));     // �����μ��ڵ�
		String dealdeptnm   = request.getHeader("DEALDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTNM"));	  // �����μ���

		// CIIS �߰� �׸��
		String hdqtcd		= request.getHeader("HDQTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTCD")); 			// ����
		String hdqtnm		= request.getHeader("HDQTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTNM")); 			// ���θ�
		String partcd		= request.getHeader("PARTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTCD")); 			// ��Ʈ�ڵ�
		String partnm		= request.getHeader("PARTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTNM")); 			// ��Ʈ��
		String hdqtplacyn	= request.getHeader("HDQTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTPLACYN")); 		// �����忩��
		String partplacyn	= request.getHeader("PARTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTPLACYN")); 		// ��Ʈ�忩��
		String dealmedicd	= request.getHeader("DEALMEDICD")  	== null ? "" : Util.Uni2Ksc(request.getHeader("DEALMEDICD")); 		// ������ü�ڵ�
		String mobile	= request.getHeader("MOBILE")  	== null ? "" : Util.Uni2Ksc(request.getHeader("MOBILE")); 		// ������ü�ڵ�		
		*/
		if("".equals(dealmedicd))	dealmedicd = "1";

		// LDAP ����� ���� Session ó��
		

		session.setAttribute("uid"			,uid		); 		// ���̵�
		//	���翡�� �߰��ϴ� ����
		//	�а���� ��ȸ�翡�� �α����ϴ� ��� ����� ���� ���̵� �ְ� �ȴ�.
		//	���̵� ������ ������� ���
		System.out.println("emp_no=_" + emp_no + "_");
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // ���
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // ���
		}
		session.setAttribute("emp_nm"		,emp_nm    	);      // ����
		session.setAttribute("cmpycd"		,cmpycd     );      // ȸ��
		session.setAttribute("cmpynm"		,cmpynm     );      // ȸ���
		session.setAttribute("deptcd"		,deptcd     );      // �μ�
		session.setAttribute("deptnm"		,deptnm     );      // �μ���
		session.setAttribute("selldeptcd"   ,selldeptcd );      // �Ǹźμ�
		session.setAttribute("selldeptnm"   ,selldeptnm );      // �Ǹźμ���
		session.setAttribute("dealdeptcd"   ,dealdeptcd );      // �����μ��ڵ�
		session.setAttribute("dealdeptnm"   ,dealdeptnm );      // �����μ���
		session.setAttribute("areacd"       ,areacd     );      // ���������ڵ�
		session.setAttribute("areanm"       ,areanm     );      // ����������
		session.setAttribute("deptplacyn"   ,deptplacyn );      // �μ��忩��
		session.setAttribute("jobcd"        ,jobcd      );      // ��������
		session.setAttribute("jobnm"        ,jobnm      );      // �������и�
		session.setAttribute("posicd"       ,posicd     );      // ��å�ڵ�
		session.setAttribute("posinm"       ,posinm     );      // ��å��
		session.setAttribute("usertypecd"   ,usertypecd );      // ��������ڵ�
		session.setAttribute("usertypenm"   ,usertypenm );      // ������и�
		session.setAttribute("email"        ,email      );      // �̸���
		session.setAttribute("mobile"  			,mobile );      		// �����ȭ��ȣ
		
		// CIIS �߰� �׸��  - ����(��),��Ʈ(��) LDAP���� ���� �ȵǴ� ����� ������.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // ����        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // ���θ�      
		//session.setAttribute("partcd"     ,partcd     );      // ��Ʈ�ڵ�    
		//session.setAttribute("partnm"     ,partnm     );      // ��Ʈ��      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // �����忩��  
		session.setAttribute("partplacyn" 	,partplacyn );      // ��Ʈ�忩��  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // ������ü�ڵ�
		

//System.out.println("request.getHeader(emp_nm) : " + request.getHeader("EMP_NM"));


//System.out.println("  emp_nm  : " + emp_nm);
//System.out.println("  sess emp_nm : " + Util.getSessionParameterValue(request, "emp_nm", true));
  
%>

<%
		//boolean updateyn = false;
		// LDAP �α��� ������Ʈ
		//System.out.println("uid : " + uid + " updateinflogin");
        //ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        //updateyn = updateInfoLogin.updateldap(uid);
		//System.out.println("updateyn : " + updateyn + " updateyn");

%>
<iframe frameborder=0 name=bodyframe scrolling=no src="http://220.73.135.81:40003/IMPlus/customer/setLastLoginDate.jsp?SERVICE_ID=MISCOM&USER_ID=<%=uid%>&SERVICE_USER_ID=<%=uid%>" width="500" height="0"></iframe>
<%
	String domainName = request.getScheme()+"://"+request.getServerName()+request.getContextPath(); // ":"+request.getServerPort()+
	String strMenuUrl = "";
	String strmainFrame = "";

System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
System.out.println("uid null : " + uid);
	}

	if (uid == null){
		response.sendRedirect("/common/jsp/logclose.jsp"); 
	} else {
		strMenuUrl = "/co/mng/1000";
		strmainFrame = "/common/xrw/mainFrame.xrw";
	}

	System.out.println("strmainFrame == " + strmainFrame);
	System.out.println("domainName == " + domainName);
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
</script>
<script language="javascript" src="/js/TFControlWrite.js"></script>
<script language="javascript" src="/js/swfShow.js"></script>
<script language="javascript">
    function jsNewModalWinNoS( url, args, sizeW, sizeH )
    {
        opt = "center:yes; help:no; resizable:no; scroll:no; status:no; location=no;";
        sizeH = parseInt(sizeH) + 20;
        window.showModalDialog(url, args, "dialogWidth:" + sizeW + "px; dialogHeight:" + sizeH  +"px; "+ opt );
        return;
    }
	function pop_system(){
		jsNewModalWinNoS("/html/popup01_2.html","a","450","500");
	}
</script>
<script type="text/javascript">
    // �� frame ����
    document.write('<iframe id="hiddenFrame" style="display:none" width="0" height="0" ></iframe>');

    // �ֱ������� ����� �Լ�
    function onScheduler(){

        // �� �������� ��û
        var dataobj = document.frames["hiddenFrame"];
        if(dataobj){
            dataobj.location.href = "http://ciis.chosun.com/common/jsp/blank.jsp";
        }
        // 10�� ����(���� �������� ���� ����)
        setTimeout("onScheduler()", 1000*60*10);
    }

    // �ʱ� ����(form�� onLoad�� ��ġ�Ͽ��� ��)
    onScheduler();

</script>
</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="no">
<form name="SessionInfo">
	<input type="hidden" name="uid"			value="<%= uid %>">
	<input type="hidden" name="emp_no"		value="<%= emp_no %>">
	<input type="hidden" name="emp_nm"		value="<%= emp_nm %>">
	<input type="hidden" name="cmpycd"		value="<%= cmpycd %>">
	<input type="hidden" name="deptcd"		value="<%= deptcd %>">
	<input type="hidden" name="deptnm"		value="<%= deptnm %>">
	<input type="hidden" name="selldeptcd"	value="<%= selldeptcd %>">
	<input type="hidden" name="selldeptnm"	value="<%= selldeptnm %>">
	<input type="hidden" name="areacd"		value="<%= areacd %>">
	<input type="hidden" name="areanm"		value="<%= areanm %>">
	<input type="hidden" name="deptplacyn"	value="<%= deptplacyn %>">
	<input type="hidden" name="jobcd"		value="<%= jobcd %>">
	<input type="hidden" name="jobnm"		value="<%= jobnm %>">
	<input type="hidden" name="posicd"		value="<%= posicd %>">
	<input type="hidden" name="posinm"		value="<%= posinm %>">
	<input type="hidden" name="usertypecd"	value="<%= usertypecd %>">
	<input type="hidden" name="usertypenm"	value="<%= usertypenm %>">
	<input type="hidden" name="email"		value="<%= email %>">
	<input type="hidden" name="dealdeptcd"	value="<%= dealdeptcd %>">
	<input type="hidden" name="dealdeptnm"	value="<%= dealdeptnm %>">
	<input type="hidden" name="hdqtcd"		value="<%= hdqtcd %>">
	<input type="hidden" name="hdqtnm"		value="<%= hdqtnm %>">
	<input type="hidden" name="partcd"		value="<%= partcd %>">
	<input type="hidden" name="partnm"		value="<%= partnm %>">
	<input type="hidden" name="hdqtplacyn"	value="<%= hdqtplacyn %>">
	<input type="hidden" name="partplacyn"	value="<%= partplacyn %>">
	<input type="hidden" name="dealmedicd"	value="<%= dealmedicd %>">
	<input type="hidden" name="domainnm"	value="<%= domainName %>">
	<input type="hidden" name="mobile"	value="<%= mobile %>">	
</form>
<%

System.out.println("������ XRW ȣ�� �� : uid [" + uid + "] ȸ���ڵ� : [" + cmpycd +"]");
System.out.println("������ XRW ȣ�� �� : uid [" + uid + "] ȸ���ڵ� : [" + cmpycd +"]");
System.out.println("������ XRW ȣ�� �� : uid [" + uid + "] ȸ���ڵ� : [" + cmpycd +"]");
System.out.println("������ XRW ȣ�� �� : uid [" + uid + "] ȸ���ڵ� : [" + cmpycd +"]");
System.out.println("������ XRW ȣ�� �� : uid [" + uid + "] ȸ���ڵ� : [" + cmpycd +"]");
System.out.println("xrw last : " + uid);
System.out.println("xrw last : " + emp_no);
System.out.println("xrw last : " + emp_nm);
System.out.println("xrw last : " + cmpycd);
System.out.println("xrw last : " + deptcd);
System.out.println("xrw last : " + deptnm);
System.out.println("xrw last : " + selldeptcd);
System.out.println("xrw last : " + selldeptnm);
System.out.println("xrw last : " + areacd);
System.out.println("xrw last : " + areanm);
System.out.println("xrw last : " + deptplacyn);
System.out.println("xrw last : " + jobcd);
System.out.println("xrw last : " + jobnm);
System.out.println("xrw last : " + posicd);
System.out.println("xrw last : " + posinm);
System.out.println("xrw last : " + usertypecd);
System.out.println("xrw last : " + usertypenm);
System.out.println("xrw last : " + email);
System.out.println("xrw last : " + dealdeptcd);
System.out.println("xrw last : " + dealdeptnm);
System.out.println("xrw last : " + hdqtcd);
System.out.println("xrw last : " + hdqtnm);
System.out.println("xrw last : " + partcd);
System.out.println("xrw last : " + partnm);
System.out.println("xrw last : " + hdqtplacyn);
System.out.println("xrw last : " + partplacyn);
System.out.println("xrw last : " + dealmedicd);
System.out.println("xrw last : " + domainName);
System.out.println("session " + Util.getSessionParameterValue(request, "cmpycd", true));
%>

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
    <tr height="70">
        <td>
            <!-- ===================== TFMenu �κ� ============================================= -->
            <table cellSpacing="0" cellPadding="0" width="100%" height="70" border="0" background="/images/top_bg.gif">
                <tr>
					<td width="20" ></td>                
                    <!--td valign="middle" rowspan=3 border=0 align="left" width="236" height="70">
                    	<img width="236" height="60" src="/images/top_logo3.gif">
                    </td-->
			        <td valign="middle" rowspan=3 border=0 align="left" width="100" height="70">
			        	<!--img src="/images/top_logo3.gif" width="115" height="46" alt=""-->
			        	<!--img src="/images/Logo.gif" width="100" height="40" alt=""-->
			        	<script type="text/javascript">swfShow("/flash/logo01_new.swf", 115, 46)</script>
			        	<br>
			        </td>
			        <td valign="middle" rowspan=3 width="126" height="70">
			            <table width="100%" border="0" cellspacing="0" cellpadding="0">
			              <tr>
		                	<%-- if(cmpycd.equals("100")){--%>
		                	<!--td align="left">
		                		&nbsp;<script type="text/javascript">swfShow("/flash/logo02.swf", 100, 22)</script><br>
		                	</td-->
			                <%--}else{%-->
			                <td align="center">
			                	&nbsp;<span style="COLOR:#6b6b6b;FILTER:shadow(color=#cccccc);height:8px;font-size:11pt;"><b><%=cmpynm%></b></span>
			                </td>
			                <%--}--%>
			                <td align="center">
			                	&nbsp;<span style="COLOR:#6b6b6b;FILTER:shadow(color=#cccccc);height:8px;font-size:11pt;"><b><%=cmpynm%></b></span>
			                </td>			                
			                <!-- img src="/images/Logo_Txt.gif" width="100" height="20" alt="" -->
			              </tr>
			              <tr>
			                <td valign="bottom" height="22" align="center"><font style="font-size:9pt; color:#808080;filter:glow(color=green, strength=8);"><%=deptnm%>&nbsp;<%=emp_nm%></font></td>
			              </tr>
			          </table>
			        </td>
                    <td width="*" valign="bottom" >
						<script type="text/javascript">swfShow("/flash/ciis_txt.swf", 483, 24)</script><br>                    
                    	<!--font size="2">�������������ý���(CIIS : Chosunilbo Integrated Information System)</font-->
                    </td>
                    <td align="right" valign="bottom"  height="18">
                        <a href="/common/jsp/main.jsp"><img height="18" border=0 src="/images/01.gif"></a>
                        <a href="_self" onclick="pop_system();return false;"><img height="18" border=0 src="/images/03.gif"></a>
						<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
                        <!--
						<a href="/common/jsp/logclose.jsp"><img height="18" border=0 src="/images/04.gif"></a>
						-->
						<a href="/genics/logout.jsp"><img height="18" border=0 src="/images/04.gif"></a>
						<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
                    </td>
                    <td width="5"></td>
                </tr>
                <tr height="26">
                    <td width="20" ></td>
                    <td colspan=3 width="*" align="left" valign="bottom">
                        <div id="TFMenuControlLocation">
                            <script>
                                //TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "998", "26");
                                TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "100%", "26");
                            </script>
                        </div>
                    </td>
                    <td width="5" ></td>
                </tr>
                <tr height="8">
                    <td width="20" ></td>
                    <td colspan=3 width="*" align="right" valign="bottom"></td>
                    <td width="5" ></td>
                </tr>
            </table>
            <!-- =============================================================================== -->
        </td>
    </tr>
	<tr>
		<td>

			<!-- ===================== TF Framework �κ� =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "mainFrame", "<%= strmainFrame %>", "100%", "100%", "<%= domainName %>");
							</script>
						</div>
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 
<iframe id="_sso_frame" name="_sso_frame" width="500" height="0" frameborder="0" src="http://ciis.chosun.com/genics/sso_inc/inc_agent.jsp"></iframe>
<% //---------------------- GENICS ASSOCIATE ------------------------// %> 

</body>
</HTML>



