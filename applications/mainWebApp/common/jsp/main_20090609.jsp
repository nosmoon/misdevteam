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
		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // ���
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // ����
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // ȸ��
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
		

		dealmedicd	 = "1";

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
		
		// CIIS �߰� �׸��  - ����(��),��Ʈ(��) LDAP���� ���� �ȵǴ� ����� ������.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // ����        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // ���θ�      
		//session.setAttribute("partcd"     ,partcd     );      // ��Ʈ�ڵ�    
		//session.setAttribute("partnm"     ,partnm     );      // ��Ʈ��      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // �����忩��  
		session.setAttribute("partplacyn" 	,partplacyn );      // ��Ʈ�忩��  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // ������ü�ڵ�

System.out.println("request.getHeader(emp_nm) : " + request.getHeader("EMP_NM"));


System.out.println("  emp_nm  : " + emp_nm);
System.out.println("  sess emp_nm : " + Util.getSessionParameterValue(request, "emp_nm", true));
  
%>

<%
		// LDAP �α��� ������Ʈ
        ldapp.UpdateInfoLogin updateInfoLogin = new ldapp.UpdateInfoLogin();
        updateInfoLogin.updateldap(uid);

%>

<%
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
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
</form>

<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
	<tr height="70">
		<td>
			<!-- ===================== TFMenu �κ� ============================================= -->
			<table cellSpacing="0" cellPadding="0" width="100%" height="70" border="0" background="/images/top_bg.gif">
				<tr height="36">
					<td width="20" background="transparent"></td>                
          <td valign="top" rowspan=3 border=0 align="left" width="236" height="70"> <!-- background="/images/top_logo.gif" -->
          	<img width="236" height="60" src="/images/top_logo3.gif">
          </td>
          <td width="*" valign="bottom" background="transparent">
						<script type="text/javascript">swfShow("/flash/ciis_txt.swf", 483, 23)</script><br>                    
          	<!--font size="2">�������������ý���(CIIS : Chosunilbo Integrated Information System)</font-->
          </td>
          <td align="right" valign="bottom" background="transparent" height="18">
              <a href="/common/jsp/main.jsp"><img height="18" border=0 src="/images/01.gif"></a>
              <a href="_self" onclick="pop_system();return false;"><img height="18" border=0 src="/images/03.gif"></a>
              <a href="/common/jsp/logout.jsp"><img height="18" border=0 src="/images/04.gif"></a>
          </td>
          <td width="5"></td>
				</tr>
        <tr height="26">
            <td width="20" background="transparent"></td>
            <td colspan=3 width="*" align="left" valign="bottom">
                <div id="TFMenuControlLocation">
                    <script>
                        //TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "998", "26");
                        TFMenuWrite(TFMenuControlLocation, "TFMenu", "<%= domainName + strMenuUrl %>", "100%", "26");
                    </script>
                </div>
            </td>
            <td width="5" background="transparent"></td>
        </tr>
        <tr height="8">
            <td width="20" background="transparent"></td>
            <td colspan=3 width="*" align="right" valign="bottom"></td>
            <td width="5" background="transparent"></td>
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

</body>
</HTML>