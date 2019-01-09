<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_reader_1615_l.jsp
* 기능     : 독자현황-독자등급관리-독자비교검색
* 작성일자 : 2004-04-21
* 작성자   : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    int   showRecCnt  =  5;
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">

<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //이벤트초기화
    function jsInit() {
        setEventHandler();
    }


	//검색버튼
	function sear_button(pageno) {
	    var lo_form1 = document.search_form;

		if(lo_form1.hd_rownum.value == null || lo_form1.hd_rownum.value =="") {
			alert("독자선택후 검색하세요");
			return false;
		}
    	//event check.
    	
    	if(window.event) window.event.returnValue = false;

		lo_form1.hd_searcd.value  = lo_form1.sh_searcd.value; 
		lo_form1.hd_searnm.value  = lo_form1.sh_searnm.value; 
		lo_form1.hd_medicd.value  = lo_form1.sh_medicd.value; 
		lo_form1.hd_phone1.value  = lo_form1.sh_phone1.value;
		lo_form1.hd_phone2.value  = lo_form1.sh_phone2.value;
		lo_form1.hd_phone3.value  = lo_form1.sh_phone3.value;

		if (!chk_search(pageno)) return;
	}


	//PAGE버튼
	function list_search(pageno) {
	    var lo_form1 = document.search_form;
	    
	    //기존 검색조건과 변경여부 체크
		lo_form1.sh_searcd.value  = lo_form1.hd_searcd.value; 
		lo_form1.sh_searnm.value  = lo_form1.hd_searnm.value; 
		lo_form1.sh_medicd.value  = lo_form1.hd_medicd.value; 
		lo_form1.sh_phone1.value  = lo_form1.hd_phone1.value;
		lo_form1.sh_phone2.value  = lo_form1.hd_phone2.value;
		lo_form1.sh_phone3.value  = lo_form1.hd_phone3.value;

		if (!chk_search(pageno)) return;
	}


	//독자비교검색 리스트 조회
	function chk_search(pageno) {	
	    var lo_form1 = document.search_form;

		lo_form1.pageno.value   =   pageno;

		if((lo_form1.sh_searnm.value == null || lo_form1.sh_searnm.value == "") &&
		   (lo_form1.sh_phone1.value == null || lo_form1.sh_phone1.value == "") &&
		   (lo_form1.sh_phone2.value == null || lo_form1.sh_phone2.value == "") &&
		   (lo_form1.sh_phone3.value == null || lo_form1.sh_phone3.value == "")) {
			alert("검색어나 전화번호 둘중하나는 필수 입니다.");
			return false;
			lo_form1.sh_searnm.focus();
		}
        //입력항목 전체 체크
        if(!validate(lo_form1)) return false;
		makeValue(lo_form1);
	    lo_form1.method = "post";
	    lo_form1.action = "/ss/reader/1620";
	    lo_form1.target = "cmprifrm";
	    lo_form1.submit();
	}

	//독자번호 위로넘김
	function rdrno_set(rdr_no,rownum,bocd, bonm){
		var lo_form = parent.document.grad_form;

		if(lo_form.rdr_no!=null && lo_form.bocd!=null){
            lo_form.rdr_no[rownum].value = rdr_no;
            lo_form.bocd[rownum].value = bocd;
            lo_form.bonm[rownum].value = bonm;
			//lo_form.rdrgrad[rownum].value = 1;
			lo_form.dtlsprocstat[rownum].value = 20;
			lo_form.grad_check[rownum].checked = 'true';
            return;
		} else {
            var inx_nm = "rdr_no"+rownum;
			var inx_bocd = "bocd"+rownum;
			var inx_bonm = "bonm"+rownum;
			//var inx_grad = "rdrgrad"+rownum;
			var inx_dtlsprocstat = "dtlsprocstat"+rownum;
			var inx_grad_check = "grad_check"+rownum;

            lo_form.all[inx_nm].value = rdr_no;
            lo_form.all[inx_bocd].value = bocd;
            lo_form.all[inx_bonm].value = bonm;
			//lo_form.all[inx_grad].value = 1;
			lo_form.all[inx_dtlsprocstat].value = 20;
			lo_form.all[inx_grad_check].checked = true;
            return;

		}
	}

    //하위 체크박스 전체 체크 또는 해제
    function checkAll() {
    	//filtering
    	if (!window.event) return;

    	var lo_form1  =  document.cmpr_form;
    	var li_len    =  new Number(lo_form1.listcnt.value);

    	if (li_len < 1) return;

    	var lo_src    =  window.event.srcElement;
    	var ls_name   =  window.event.srcElement.name;

    	for(var i=0; i<li_len; i++) {
    		if (lo_src.checked) {
    		    if (document.all(ls_name + new String(i)).disabled == true)  continue;
    		    document.all(ls_name + new String(i)).checked = true;
    		}
    		else {
    		    document.all(ls_name + new String(i)).checked = false;
    		}
    	}
    }


	// rowspan 되어 있는 2개의 로우에서 마우스 OUT 시 색깔 변경 /
	function change_row_color_out(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "";
                //document.all.list_zone.rows(i).className = "out";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
	                document.all.list_zone.rows(i-1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i-1).className = "out";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
	                document.all.list_zone.rows(i+1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i+1).className = "out";
				}
	        }
	    }
	}


	// rowspan 되어 있는 2개의 로우에서 마우스 IN 시 색깔 변경
	function change_row_color_in(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "#CCCCBB";
                //document.all.list_zone.rows(i).className = "over";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
	                document.all.list_zone.rows(i-1).style.backgroundColor = "#CCCCBB";
                    //document.all.list_zone.rows(i-1).className = "over";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
	                document.all.list_zone.rows(i+1).style.backgroundColor = "#CCCCBB";
                    //document.all.list_zone.rows(i+1).className = "over";
				}
	        }
	    }
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="gray"  onload="jsInit();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td bgcolor="#EBE9DC" class="title" height="27"><b>독자비교검색</b></td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--여백-->
    </td>
  </tr>
</table>
<!--검색시작-->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <form name="search_form" method="post" action="" onsubmit="sear_button(1);">
  <input type="hidden" name="pageno"     value="1" >               <%--현재페이지--%>
  <input type="hidden" name="pagesize"   value="<%=showRecCnt%>">  <%--한페이지당 레코드수--%>
  <input type="hidden" name="js_fn_nm"   value="list_search">      <%--페이지이동시 호출되는 자바스크립트 이름--%>

  <%--페이지 이동시 기존 검색조건과 같도록 유지하기 위한 Hidden Type--%>
  <input type="hidden" name="hd_searcd"  value="">                 <%--검색구분--%>
  <input type="hidden" name="hd_searnm"  value="">                 <%--검색어--%>
  <input type="hidden" name="hd_medicd"  value="">                 <%--신청매체--%>
  <input type="hidden" name="hd_phone1"  value="">                 <%--전화번호1--%>
  <input type="hidden" name="hd_phone2"  value="">                 <%--전화번호2--%>
  <input type="hidden" name="hd_phone3"  value="">                 <%--전화번호3--%>
  <Input type="hidden" name="hd_rownum"  value="">                 <%--Row 넘버--%>
  <tr bgcolor="#EBE9DC">
    <td class="title">
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr> 
          <td width="90"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
             <select name="sh_searcd" size="1" class="sel_all" >
               <option value="NM" >독자명</option>
               <option value="NO" >독자번호</option>
               <option value="PR" >주민번호</option>
               <option value="ML" >이메일</option>
             </select>
          </td>
          <td> 
            <input type="text" name="sh_searnm" size="15" maxlength="30" class="text_box" caption="검색어">
          </td>
          <td width="40"><img src="/html/comm_img/ic_title.gif" width="12" height="7">매체</td>
          <td> 
             <select name="sh_medicd" size="1" class="sel_all" style="width:70;" >
               <option value="ALL" selected >전체</option>
<%--매체 콤보박스 구성--%>
<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord medicdcurRec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)ds.medicdcur.get(i);
%>
               <option value="<%= medicdcurRec.cicodeval%>"><%= medicdcurRec.cicdnm%></option>
<%
	}
%>
             </select>
          </td>
          <td width="80" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">전화/휴대폰</td>
          <td> 
            <input type="text" name="sh_phone1" size="4" maxlength="4" class="text_box">
            <input type="text" name="sh_phone2" size="4" maxlength="4" class="text_box">
            <input type="text" name="sh_phone3" size="4" maxlength="4" class="text_box">
          </td>
          <td align="right"> 
            <input type="image" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="sear_button(1);window.event.returnValue=false;">
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--여백-->
    </td>
  </tr>
  </form>
</table>
<!--검색끝-->
<!--list start -->
<table width="830" border="0" align="center" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="list_zone">
  <form name="cmpr_form" method="post" action="" onsubmit="sear_button(1);">
  <input type="hidden" name="listcnt" value="<%=showRecCnt%>">
  <tr bgcolor="#dddddd" align="center"> 
    <td class="gray" width="80"  >구독일자</td>
    <td class="gray" width="90"  >지사</td>
    <td class="gray" width="90"  >독자번호</td>
    <td class="gray" width="100" >독자명</td>
    <td class="gray" width="100" >회원아이디</td>
    <td class="gray" width="50"  >등급</td>
    <td class="gray" width="100" >매체</td>
    <td class="gray" width="100" >구독호수</td>
    <td class="gray" width="110" >주민번호</td>
  </tr>
  <tr bgcolor="#dddddd" align="center"> 
    <td class="gray" colspan="3" >전화/직장전화/휴대폰</td>
    <td class="gray" colspan="2" >이메일</td>
    <td class="gray" colspan="4" >주소</td>
  </tr>
<%--화면에 보여줄 기본 레코드수에 따라 포멧에 맞게 Display--%>
<%
	for(int i=0; i < showRecCnt ; i++) {
%>
  <tr> 
    <td class="gray" width="80"   align="center">&nbsp;</td>
    <td class="gray" width="90"   align="center">&nbsp;</td>
    <td class="gray" width="90"   align="center">&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="50"   align="center">&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="100"  align="center">&nbsp;</td>
    <td class="gray" width="110"  align="left"  >&nbsp;</td>
  </tr>
  <tr> 
    <td class="gray" colspan="3"  align="left"  >&nbsp;</td>
    <td class="gray" colspan="2"  align="left"  >&nbsp;</td>
    <td class="gray" colspan="4"  align="left"  >&nbsp;</td>
  </tr>
<%
	}
%>
  </form>
</table>
<!---button-->
<table  width="830" cellpadding="0" border="0" cellspacing="0" class="title2" align="center" id="page_zone">
  <tr>
    <td height="20" bgcolor="#E8E8E8">
      <div align="center">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
        <jsp:param name  ="pageno"        value="1"/>
        <jsp:param name  ="totalcnt"       value="0"/>
        <jsp:param name  ="js_fn_nm"            value="list_search"/>
        <jsp:param name  ="records_per_page"    value="<%=showRecCnt%>"/>
        <jsp:param name  ="page_set_gubun"      value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
      </div>
    </td>
  </tr>
</table>
<iframe name="cmprifrm" width=0 height=0></iframe>
</body>
</html>
