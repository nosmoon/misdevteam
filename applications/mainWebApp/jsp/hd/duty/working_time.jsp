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
* ���ϸ� : working_time.jsp
* ��� : �ٹ��ð� �Է� �ý���
* �ۼ����� : 2018-06-28
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

		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
		/*
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // ���
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // ����
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // ȸ��
		String cmpynm       = request.getHeader("CMPYNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYNM"));         // ȸ��		
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

		// LDAP ����� ���� Session ó��
		
		session.setAttribute("uid"			,uid		); 		// ���̵�
		//	���翡�� �߰��ϴ� ����
		//	�а���� ��ȸ�翡�� �α����ϴ� ��� ����� ���� ���̵� �ְ� �ȴ�.
		//	���̵� ������ ������� ���
		//System.out.println("emp_no=_" + emp_no + "_");
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // ���
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // ���
		}
		session.setAttribute("emp_nm"		,emp_nm    	);      // ����
		session.setAttribute("cmpycd"		,cmpycd     );      // ȸ��
		session.setAttribute("cmpynm"		,cmpynm     );      // ȸ��
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
		session.setAttribute("mobile"  	,mobile );      // ������ü�ڵ�		
		
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";
	
//System.out.println("domainName : " + domainName);
//domainName = "http://192.168.1.102:8100";
//System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
//System.out.println("uid null : " + uid);
	}

	if (uid == null){
		response.sendRedirect("/login.jsp"); 
	}

	//System.out.println("strmainFrame == " + strmainFrame);
	//System.out.println("domainName == " + domainName);
%>
<!DOCTYPE html>
<html lang='ko'>
<head>
  <meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <title>�ٹ��ð�</title>
  <link rel="stylesheet" type="text/css" href="http://news.chosun.com/cs_intranet/css/intranet_common.css">
	<!--[if lt IE 8 ]><link rel="stylesheet" href="http://news.chosun.com/cs_intranet/css/ie7.css" type="text/css" /><![endif]-->  
  
  <style>
   /*
    body {height:100%; margin:0 auto; text-align:center;}
   .tbl_tit { text-align:left; }
   */
  </style>
  <script type="text/javascript" src="http://news.chosun.com/dhtm/js/jquery-1.9.1.min.js"></script>
  <script type="text/javascript" src="http://news.chosun.com/cs_intranet/js/placeholder.js"></script>
  <script type="text/javascript" src="http://news.chosun.com/cs_intranet/js/intra_common.js"></script>

  <script>
  
  //�ʱ�ȭ
  function init() {
	  var frm = document.frm_content;

	  frm.prsnt_tm.readOnly   = false;
	  frm.finish_tm.readOnly  = false;
	  frm.addm_rest_minute.readOnly = false;
	  frm.reset();

	  search_time();
  }


  //��ȸ
  function search_time(clsf) {	  
	  var frm = document.frm1;

	  if(clsf != null && clsf != "") {
	     frm.basi_dt.value = frm.last_week_dt.value;
	  } else {
	     frm.basi_dt.value = "<%=Util.getDate()%>";
	  }

	  frm.action = "/hd/duty/1001001";
	  frm.target = "ifrm";	  	 
	  frm.submit();
  }

  //����on/off 
  function chk_duty_clsf(obj) {
	var frm = document.frm_content;

	if(obj.checked == true) {
		frm.duty_clsf.value  = "10";
		frm.prsnt_tm.value   = "09:30";
		frm.finish_tm.value  = "18:30";
		frm.addm_rest_minute.value = "";

		frm.prsnt_tm.readOnly   = true;
		frm.finish_tm.readOnly  = true;
		frm.addm_rest_minute.readOnly = true;

	} else {
		frm.duty_clsf.value = "";
		frm.prsnt_tm.value   = "";
		frm.finish_tm.value  = "";
		frm.addm_rest_minute.value = "";

		frm.prsnt_tm.readOnly   = false;
		frm.finish_tm.readOnly  = false;
		frm.addm_rest_minute.readOnly = false;
	}
  } 
  
  //�Է�
  function save() {
	  var frm = document.frm_content;
	  var tmp = "";
	  

	  if( frm.duty_clsf.checked == false ) {
	  	if(frm.prsnt_tm.value == "") {
			alert("��ٽð��� �Է����ּ���");
			return;
	  	}

	  	if(frm.finish_tm.value == "") {
			alert("��ٽð��� �Է����ּ���");
			return;
	  	}
	}

	  //alert(frm.prsnt_tm.value + " : " + frm.finish_tm.value + " : " + frm.duty_clsf.value + " : " + frm.duty_clsf.checked);
	  //return;
	  //alert(frm.duty_clsf.value); 

	  frm.prsnt_tm.value = frm.prsnt_tm.value.replace(":",""); 
	  frm.finish_tm.value = frm.finish_tm.value.replace(":",""); 
	  frm.addm_rest_minute.value = frm.addm_rest_minute.value.replace(":",""); 
	  frm.action = "/hd/duty/1001002";
	  frm.method = "post";
	  frm.target = "ifrm";
	  frm.submit();
  }
  

  //��ü ����/����
  function set_check_onoff(obj) {
	var ocheck = document.getElementsByName("check_yn");		
	for(var i=0; i<ocheck.length; i++) {
		document.getElementById("t"+i).checked = obj.checked; 
	}
  }

  //���û���
  function chkdelete() {
	  var frm  = document.frm_list;
	  var frm1 = document.frm1;
	  var ocheck = document.getElementsByName("check_yn");
	  var param = "";
	  var chk;
	  
	  for(var i=0; i<ocheck.length; i++) {
		chk = document.getElementById("t"+i);
		param += (chk.checked == true) ? chk.value + "#" : "";
	  }
	  
	  if(param == "") {
		  alert("���õ�  �׸��� �����ϴ�");
	  } else {
		  if(confirm("�����Ͻðڽ��ϱ�?")) {
			  //alert(param + "\n" + param.substring(0, param.length - 1));
			  //return;
			  
			  frm1.duty_dt.value = param.substring(0, param.length - 1);
			  frm1.action = "/hd/duty/1001003";
			  frm1.target = "ifrm";
			  frm1.submit();
		  } else {
			  return;
		  }
	  }
  }

  function chg_input(obj) {
	var txt = obj.value.replace(":","");
	if(txt.length > 2) {
		obj.value = txt.substring(0,2) + ":" + txt.substring(2,4);
	}
  }

  </script>
</head>  
<body onload="init();">

<div class="header">
  <a href="http://work.chosun.com/"><img src="http://image.chosun.com/img/intranet//logo_intr.png" alt="�����Ϻ�"></a>
</div>
<div class="wrap_container">
  <div class="content">
    <form id="frm_content" name="frm_content" action="" method="post" target="ifrm">
    <!--strong class="title_txt">�ٹ��ð� ���� �ý���</strong-->
    <span class="tbl_tit">�ٹ��ð� �Է�</span>
    <div class="user_input_area">
      <div class="option_step">
        <strong class="tit">��¥</strong><div class="selectarea"><div class="selectBox">
            <select name="duty_dt" onchange="">
<%
	String today = Util.getDate();
	String[] week_days = {"��", "��", "ȭ", "��", "��", "��", "��"};
	String dt = "";
	Calendar now = Calendar.getInstance();
	int	day_of_week = now.get(now.DAY_OF_WEEK);
	int inc = 0;
	String today2 = "";
	
	for(int i=-4; i<=0; i++) {
			if(i<0){
				today2 = Util.addDate(today, i*7);
			}else{
				today2 = today;
			}
			for(int d=1; d<=7; d++) {
				
				if(d == day_of_week) {
					inc = 0;
				} else {
					inc = ((d < day_of_week) ? -(day_of_week - d) : (d-day_of_week));
				}
				dt = Util.addDate(today2, inc);
				//System.out.println("dt:"+dt);
		%>
				<option value="<%=dt%>" <%=(day_of_week == d && i == 0? "selected" : "")%>><%=dt.substring(4,6)%>��<%=dt.substring(6,8)%>��(<%=week_days[d-1]%>)</option>
		<%
			}
	}
%>
            </select>
          </div>
        </div>
      </div>
      <div class="option_step">
        <strong class="tit">��ٽð�</strong><p><input type="text" id="prsnt_tm" name="prsnt_tm" maxlength="5" placeholder="��)09:00" onfocus="$(this).select();" oninput="this.value=this.value.replace(/[^0-9,:]/g,'');chg_input(this);"></p>
      </div>
      <div class="option_step">
        <strong class="tit">��ٽð�</strong><p><input type="text" id="finish_tm" name="finish_tm" maxlength="5" placeholder="��)16:00" onfocus="$(this).select();" oninput="this.value=this.value.replace(/[^0-9,:]/g,'');chg_input(this);"></p>
      </div>
      <div class="option_step">
        <strong class="tit">�߰��ްԽð�</strong><p><input type="text" id="addm_rest_minute" name="addm_rest_minute" maxlength="5" placeholder="��)01:00" onfocus="$(this).select();" oninput="this.value=this.value.replace(/[^0-9,:]/g,'');chg_input(this);"></p>
      </div>
      <div class="option_step">
        <input type="checkbox" id="duty_clsf" name="duty_clsf" value="10" onclick="chk_duty_clsf(this);"><label for="duty_clsf"><span>����</span></label>
      </div>
    </div>
	<input type="hidden" id="cmpycd" name="cmpycd"	value="<%=cmpycd%>"/>
	<input type="hidden" id="emp_no" name="emp_no"  value="<%=emp_no%>"/>    
    </form>
    <!--// user_input_area -->
    <div class="btn_area">
      <button type="submit" id="csSubmitButton" class="common_btn small" onclick="init();"><span><em></em>�ʱ�ȭ</span></button><button type="submit" id="csSubmitButton" class="common_btn small on" onclick="save();"><span>�Է�</span></button>
      <button type="button" id="csSubmitButton" class="common_btn small on" onclick="search_time();"><span>��ȸ</span></button>
    </div>
   
    <!--// ����/ ������ ���߰� -->
    <span class="tbl_tit">���� �ٹ��ð�<ul class="list_sort"><li><a href="#" class="select" onclick="search_time();">����</a></li><li class="last"><a href="#none" onclick="search_time('1');">������></a></li></ul></span>
    <!--// ����/ ������ ���߰� -->
 
    <!--span class="tbl_tit">.���� �ٹ��ð�</span-->
    <div class="tbl_area" id="div_table" name="div_table">
      <table class="table_style" summery="���� �ٹ��ð��� ���">
        <caption>�ٹ��ð�</caption>
        <colgroup>
          <col class="c1"></col>
          <col class="c2"></col>
          <col class="c3"></col>
          <col class="c4"></col>
          <col class="c5"></col>
          <col class="c6"></col>
          <col class="c7"></col>
        </colgroup>
        <thead>
          <tr>
            <th scope="col"><input type="checkbox" id="t0"><label for="t0"></label></th>
            <th scope="col">��¥</th>
            <th scope="col">��ٽð�</th>
            <th scope="col">��ٽð�</th>
            <th scope="col">�ްԽð�</th>
            <th scope="col">���</th>
            <th scope="col">�ٹ��ð�</th>
          </tr>
        </thead>
        <tbody id="table_body" name="table_body">
        </tbody>
      </table>
    </div><!-- tbl_area -->
    <div class="all_txt" style="text-align:left;"><a href="#none" class="btn_delete" onclick="chkdelete();">���û���</a><span class="sum_txt">�ְ� �� �ٹ��ð�<em class="time" id="sum_txt" name="sum_txt"></em></span></div>

  </div><!--// content -->
</div><!--// wrap_container -->
<form id="frm1" name="frm1" action="" method="post" target="ifrm">
<input type="hidden" name="cmpycd" value="<%=cmpycd%>"/>
<input type="hidden" name="emp_no" value="<%=emp_no%>"/>
<input type="hidden" name="basi_dt" value="<%=today%>"/>
<input type="hidden" name="last_week_dt" value=""/>
<input type="hidden" name="duty_dt" value=""/>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" style="width:0px;height:0px;"/>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>