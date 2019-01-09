<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_alon_1726_l.jsp
* 기능     : 캠페인관리 사원캠페인 검색
* 작성일자 : 2004-03-10
* 작성자   : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언부분
	PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int recCount  =  ds.empcampcur.size();

	// 한페이지에 보여줄 레코드 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
%>

            <!--리스트 -->
            <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="list_zone">
              <tr align="center" bgcolor="#dddddd">
                <td class="gray" width="200">사원번호</td>
                <td class="gray" width="200">사원명</td>
                <td class="gray" width="200">부서명</td>
                <td class="gray" width="230">건당금액</td>
              </tr>
<%--사원별 캠페인수당 검색 리스트 Display--%>
<%
	for(int i=0; i<recCount; i++){
		PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord empcampcurRec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)ds.empcampcur.get(i);
%>
              <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.boemp_no%>&nbsp;</td>
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.boemp_nm%>&nbsp;</td>
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.dept_nm%>&nbsp;</td>
                <td class="gray" width="230" align="center">
                  <input type="text"   name="amt<%=i%>"         value="<%= empcampcurRec.amt%>" class="numb_box" size="7" maxlength="7" caption="건당금액" dataType="number" comma >
                  <input type="hidden" name="keyboemp_no<%=i%>" value="<%= empcampcurRec.boemp_no%>">
                  <input type="hidden" name="keybocd_no<%=i%>" value="<%= empcampcurRec.bocd%>">
                </td>
              </tr>
<%--검색된 사원별 캠페인수당 리스트 이외에 빈 레코드를 포멧에 맞게 Display--%>
<%
    }

	for(int i=0; i < (pagesize-recCount) ; i++) {
%>
              <tr>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="230" height="23" align="center">&nbsp;</td>
              </tr>
<%
    }
%>
            </table>
            <!---button-->
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_zone" >
        <tr>
          <td align="center" height="2">
            <!--여백-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
                            <div align="center">
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
<%
    String pageno        = request.getParameter("pageno");
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
		var lo_form1  =  parent.document.search_form;
		var lo_form2  =  parent.document.campalon_form;
		parent.document.all.list_zone.outerHTML = list_zone.outerHTML;
		parent.document.all.page_zone.outerHTML = page_zone.outerHTML;
        parent.setEventHandler();
        lo_form2.checkcnt.value = "<%= recCount%>";
		lo_form1.sh_boemp_no1.focus();
	</script>
