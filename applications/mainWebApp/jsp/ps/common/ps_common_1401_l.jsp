<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1401_l.jsp
* 기능     : 공통 기존독자 검색
* 작성일자 : 2004-02-16
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언부분
	PB_L_EXST_RDR_SEARCHDataSet ds = (PB_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int recCount  =  ds.exstrdrlistcur.size();

	// 한페이지에 보여줄 레코드 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
%>

<!--리스트 -->
<table  width="813" cellpadding="0" border="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="list_zone">
  <tr>
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr bgcolor="#dddddd" align="center">
          <td width="85"  class="gray" height="20" > 독자번호 </td>
          <td width="120" class="gray" height="20" > 성명 </td>
          <td width="120" class="gray" height="20" > 주민번호 </td>
          <td width="180" class="gray" height="20" > 전화번호 </td>
          <td width="100" class="gray" height="20" > 휴대폰번호 </td>
          <td width="200" class="gray" height="20" > 이메일 </td>
        </tr>
        <tr bgcolor="#dddddd" align="center">
          <td colspan="6" class="gray" height="20" > 주소 </td>
        </tr>
      </table>
    </td>
  </tr>
<%-- 독자 검색내역 --%>
<%
	for(int i=0; i<recCount; i++){
		PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);
%>
  <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand" onclick="jsSelect_Row('<%= exstrdrlistcurRec.rdr_no%>');">
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr>
          <td width="85"  class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.rdr_no%>&nbsp;</td>
          <td width="120" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.rdrnm%>&nbsp;</td>
          <td width="120" class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.prn%>&nbsp;</td>
          <td width="180" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.rdrtel_no%>&nbsp;</td>
          <td width="100" class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.rdrptph_no%>&nbsp;</td>
          <td width="200" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.email%>&nbsp;</td>
        </tr>
        <tr>
          <td colspan="6" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.dlvaddr%>&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
<%-- 검색된 기존독자내역내역이 Display될 기본 레코드 수에 미치지 못할경우 공란 Display --%>
<%
	}

	for(int i=0; i < (pagesize-recCount) ; i++) {
%>
  <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" >
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr>
          <td width="85"  class="gray" height="20" >&nbsp;</td>
          <td width="120" class="gray" height="20" >&nbsp;</td>
          <td width="120" class="gray" height="20" >&nbsp;</td>
          <td width="180" class="gray" height="20" >&nbsp;</td>
          <td width="100" class="gray" height="20" >&nbsp;</td>
          <td width="200" class="gray" height="20" >&nbsp;</td>
        </tr>
        <tr>
          <td colspan="6" class="gray" height="20" >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
<%
	}
%>
</table>
<%-- page navigator --%>
<table  width="813" cellpadding="0" border="0" cellspacing="0" class="title2" align="center" id="page_zone">
  <tr>
    <td height="20">
      <div align="center">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
    <%
        String pageno  = request.getParameter("pageno");
        String total_records = String.valueOf(ds.getTotalcnt());
        String js_fn_nm      = request.getParameter("js_fn_nm");
    %>
        <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
        <jsp:param name  ="curr_page_no"        value="<%=pageno%>"/>
        <jsp:param name  ="total_records"       value="<%=total_records%>"/>
        <jsp:param name  ="js_fn_nm"            value="<%=js_fn_nm%>"/>
        <jsp:param name  ="records_per_page"    value="<%=pagesize%>"/>
        <jsp:param name  ="page_set_gubun"      value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
      </div>
    </td>
  </tr>
</table>


	<script>
		var lo_form1  =  parent.document.exstrdrsrc_form;
		parent.document.all.list_zone.outerHTML = list_zone.outerHTML;
		parent.document.all.page_zone.outerHTML = page_zone.outerHTML;
		parent.jsInit();
		lo_form1.sh_rdr_no.focus();
	</script>
