<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_reader_1620_l.jsp
* 기능     : 독자현황-독자등급관리-구독자비교대상검색
* 작성일자 : 2004-04-23
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

	// 검색 리스트 카운트
	int recCount  =  ds.rdrcmprcur.size();

	// 한페이지에 보여줄 레코드 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	int hd_rownum = Integer.parseInt(request.getParameter("hd_rownum"));

	//임의의 변수
	int k  =  0;
%>

<!--list start -->
<table width="830" border="0" align="center" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="list_zone">
  <form name="cmpr_form" method="post" action="" onsubmit="sear_button(1);">
  <input type="hidden" name="listcnt" value="<%=pagesize%>">
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
	for(int i=0; i<ds.rdrcmprcur.size(); i++){
		CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rdrcmprcurRec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)ds.rdrcmprcur.get(i);
%>
  <tr align="left"
             onClick="rdrno_set('<%=rdrcmprcurRec.rdr_no%>',<%=hd_rownum%>,'<%=rdrcmprcurRec.bocd%>', '<%= rdrcmprcurRec.bonm%>');" style="cursor:hand;"
             onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);"> 
    <td class="gray" width="80"   align="center"><%= Util.convertS(rdrcmprcurRec.aplcdt)%>&nbsp;</td>
    <td class="gray" width="90"   align="center"><%= rdrcmprcurRec.bonm%>&nbsp;</td>
    <td class="gray" width="90"   align="center"><%= rdrcmprcurRec.rdr_no%>&nbsp;</td>
    <td class="gray" width="100"  align="left"  ><%= rdrcmprcurRec.rdrnm%>&nbsp;</td>
    <td class="gray" width="100"  align="left"  ><%= rdrcmprcurRec.onlmembid%>&nbsp;</td>
    <td class="gray" width="50"   align="center">&nbsp;<%= rdrcmprcurRec.rdrgrad%>&nbsp;</td>
    <td class="gray" width="100"  align="left"  ><%= rdrcmprcurRec.medinm%></td>
    <td class="gray" width="100"  align="center"><%= rdrcmprcurRec.subsfrser_no%>-<%= rdrcmprcurRec.substoser_no%></td>
    <td class="gray" width="110"  align="left"  ><%if(!"".equals(rdrcmprcurRec.prn)) {out.print(Util.FormatJumin(rdrcmprcurRec.prn));} else {out.print("&nbsp;");}%></td>
  </tr>
  <tr onClick="rdrno_set('<%=rdrcmprcurRec.rdr_no%>',<%=hd_rownum%>,'<%=rdrcmprcurRec.bocd%>','<%= rdrcmprcurRec.bonm%>');" style="cursor:hand;" onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" > 
    <td class="gray" colspan="3"  align="left"  >
      <%= Util.getChainStr(Util.getChainStr(rdrcmprcurRec.rdrtel_no1, rdrcmprcurRec.rdrtel_no2, rdrcmprcurRec.rdrtel_no3,"-") , Util.getChainStr(rdrcmprcurRec.rdroffitel_no1, rdrcmprcurRec.rdroffitel_no2, rdrcmprcurRec.rdroffitel_no3,"-"), Util.getChainStr(rdrcmprcurRec.rdrptph_no1,rdrcmprcurRec.rdrptph_no2, rdrcmprcurRec.rdrptph_no3,"-"),"/")%>
    </td>
    <td class="gray" colspan="2"  align="left"  ><%if(!"".equals(rdrcmprcurRec.email)) {out.print(rdrcmprcurRec.email);} else {out.print("&nbsp;");}%></td>
    <td class="gray" colspan="4"  align="left"  ><%= rdrcmprcurRec.dlvaddr%> <%= rdrcmprcurRec.dlvdtlsaddr%></td>
  </tr>
<%-- 검색된 배정지사 내역이 Display될 기본 레코드 수에 미치지 못할경우 공란 Display --%>
<%
		++k;
	}

	for(int i=0; i < (pagesize-recCount) ; i++) {
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

<table  width="830" cellpadding="0" border="0" cellspacing="0" class="title2" align="center" id="page_zone">
  <tr>
    <td height="20" bgcolor="#E8E8E8">
      <div align="center">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
    <%
        String pageno  = request.getParameter("pageno");
        String totalcnt = String.valueOf(ds.getTotalcnt());
        String js_fn_nm      = request.getParameter("js_fn_nm");
    %>
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
        <jsp:param name = "pageno" 		value="<%=pageno%>"/>
        <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
        <jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
        <jsp:param name = "pagesize" 	value="<%= pagesize%>"/>
        <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
      </div>
    </td>
  </tr>
</table>

<script>
	var lo_form1  =  parent.document.search_form;
	parent.document.all.list_zone.outerHTML    = list_zone.outerHTML;
	parent.document.all.page_zone.outerHTML    = page_zone.outerHTML;
	parent.jsInit();
	
<%if(recCount == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    	
</script>
