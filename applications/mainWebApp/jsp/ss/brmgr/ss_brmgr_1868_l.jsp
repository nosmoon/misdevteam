<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_account_1160_p.jsp
* 기능 		 : 직원검색 팝업 (검색 버튼에 의한 팝업 화면)
* 작성일자 	 : 2004-01-27
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // dataset 인스턴스 선언부분
	SL_L_BOEMPDataSet ds = (SL_L_BOEMPDataSet)request.getAttribute("ds");

%>

	<table id="boemp_no_list_id" width="400" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td>
          <table width="400" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
            <tr align="center" bgcolor="#dddddd">
              <td width="50" class="gray">코드</td>
              <td width="100" class="gray">직원명</td>
              <td width="80" class="gray">직책</td>
              <td width="80" class="gray">전화번호</td>
              <td width="80" class="gray">입사일자</td>
            </tr>
        <%
        for(int i=0; i<ds.rsltcur.size(); i++){
            SL_L_BOEMPRSLTCURRecord boemp_nocurRec = (SL_L_BOEMPRSLTCURRecord)ds.rsltcur.get(i);
		%>
            <tr bgcolor="#FFFFFF" onclick='set_boemp_no("<%=boemp_nocurRec.boemp_no%>", "<%=boemp_nocurRec.flnm%>");' style="cursor:hand" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td class="gray">&nbsp;<%= boemp_nocurRec.boemp_no%></td>
              <td class="gray">&nbsp;<%= boemp_nocurRec.flnm%></td>
              <td class="gray">&nbsp;<%= boemp_nocurRec.empnm%></td>
              <td class="gray">&nbsp;<%= boemp_nocurRec.tel1+"-"+boemp_nocurRec.tel2+"-"+boemp_nocurRec.tel3%></td>
              <td class="gray">&nbsp;<%= Util.convertS(boemp_nocurRec.in_cmpy_dt)%></td>
            </tr>
		<%
		}
			for (int i = 0 ; i < (10 - ds.rsltcur.size()) ; i++) {
        %>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
	    <%
			}
	    %>
          </table>
          <!--버튼-->
          <table id="boemp_no_list_nav_id" width="400" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
            <tr>
              <td align="center" height="25" valign="center" bgcolor="#E8E8E8">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                      <jsp:include page="/jsp/ss/comm_jsp/page_navigator2.jsp">
                      <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
                      <jsp:param name = "total_records" 	value="<%=ds.getTotalcnt()%>"/>
                      <jsp:param name = "js_fn_nm" 			value="boemp_no_search"/>
                      <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
                      <jsp:param name = "page_set_gubun" 	value="0"/>
                      </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
              </td>
            </tr>
          </table>
          </td>
        </tr>
      </table>
<%
	String job_flg = request.getParameter("job_flg");
	if("P".equals(job_flg)){
%>
<script language="javascript">
	parent.boemp_no_list_id.outerHTML = boemp_no_list_id.outerHTML;
	parent.boemp_no_list_nav_id.outerHTML = boemp_no_list_nav_id.outerHTML;
</script>
<%	}else{%>
<script language="javascript">
	parent.boemp_no_search_form.result_html.value = boemp_no_list_id.outerHTML;
	parent.boemp_no_search(1);
</script>
<%
	}
%>
