<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_alon_1506_l.jsp
* 기능 : 직책수당 조회
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_ALON_RSLTDataSet ds = (PS_L_ALON_RSLTDataSet)request.getAttribute("ds");
    // 공란으로 화면을 구성할 Row수
    int records_non_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
%>
      <!--리스트 -->
      <table width="830"  cellspacing="0" cellpadding="1" border="0" bgcolor="#FFFFFF" class="gray" id="code_list" >
        <tr align="center">
          <td width="30" align="center" bgcolor="#dddddd" class="gray">
            <input type="checkbox" name="checkall"  onClick="chkboxAll()">
          </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 소속지사 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 사원번호 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 사원명 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 부서명 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 직책 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 목표건수 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 정액정률구분 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 비율계산구분 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 금액 </td>
          <td width="100" bgcolor="#dddddd" class="gray" > 비율 </td>
        </tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_ALON_RSLTCURCOMMLISTRecord curcommlistRec = (PS_L_ALON_RSLTCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
        <input type="hidden" name="boemp_no" value="<%= curcommlistRec.boemp_no%>">
        <tr>
          <td  width="30" align="center" class="gray" onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
            <input type="checkbox" name="insChk" value="">
          </td>
          <td  width="100" class="gray" align="center"><%= curcommlistRec.bonm%></td>
          <td  width="100" class="gray" align="center"><%= curcommlistRec.boemp_no%></td>
          <td  width="100" class="gray" align="center"><%= curcommlistRec.flnm%></td>
          <td  width="100" class="gray" align="center"><%= curcommlistRec.boemp_nm%></td>
          <td  width="100" class="gray" align="center"><%= curcommlistRec.dutycd_nm.equals("")? "&nbsp;" : curcommlistRec.dutycd_nm%></td>
          <td  width="100" align="center" class="gray">
            <input name="trgtnoit" type="text" size="6" maxlength="5" style='text-align:right;' caption="목표건수" comma dataType="number" value="<%= curcommlistRec.trgtnoit%>" class="text_box">
          </td>
          <td  width="100" align="center" class="gray">
            <select name="fix_rateclsf" class="sel_all" onchange="chk_fix(<%=i%>,'<%= curcommlistRec.ratio%>')">
              <option value="" >선택</option>
              <%=ds.fixlistOptHtml(curcommlistRec.fix_rateclsf)%>
            </select>
           </td>
          <td  width="100" align="center" class="gray">
            <select name="ratiocalcclsf" class="sel_all">
              <option value="" >선택</option>
              <%=ds.alonlistOptHtml(curcommlistRec.ratiocalcclsf)%>
            </select>
          </td>
          <td  width="100" align="center" class="gray">
            <input name="amt" type="text" size="10" maxlength="8" style='text-align:right;'  caption="금액" comma dataType="number" value="<%= curcommlistRec.amt%>" class="text_box">
          </td>
          <td width="100" align="center" class="gray" >
<%
    if (curcommlistRec.fix_rateclsf.equals("01")){ // 정액정률 구분이 정액일경우는 비율란 비활성화
%>
          <input name="ratio" type="text" size="10" maxlength="5" style='text-align:right;' caption="비율" comma dataType="float" readonly  class="readonly_box"  value="">
<%  } else {%>
          <input name="ratio" type="text" size="10" maxlength="5" style='text-align:right;' caption="비율" comma dataType="float"  class="text_box"  value="<%= curcommlistRec.ratio%>">
<%  } %>

          </td>
        </tr>
<%
	}
	for ( int i= 0 ; i <records_non_page ; i++ ) {
%>
        <tr>
          <td  width="30" align="center" class="gray">&nbsp;</td>
          <td  width="100" class="gray">&nbsp;</td>
          <td  width="100" class="gray">&nbsp;</td>
          <td  width="100" class="gray">&nbsp;</td>
          <td  width="100" class="gray">&nbsp;</td>
          <td  width="100" class="gray">&nbsp;</td>
          <td  width="100" align="center" class="gray">&nbsp;</td>
          <td  width="100" align="center" class="gray">&nbsp;</td>
          <td  width="100" align="center" class="gray">&nbsp;</td>
          <td  width="100" align="center" class="gray">&nbsp;</td>
          <td width="100" align="center" class="gray" >&nbsp; </td>
        </tr>
<%
	}
%>
      </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="list_page" >
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
                String curr_page_no = request.getParameter("curr_page_no");
                String total_records = String.valueOf(ds.getTotalcnt());
                String js_fn_nm = request.getParameter("js_fn_nm"); // 페이지이동 Script
            %>
            <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
            <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
            <jsp:param name = "total_records" 		value="<%=total_records%>"/>
            <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
            <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
            <jsp:param name = "page_set_gubun" 		value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </div>
          </td>
        </tr>
      </table>
<script>
    parent.document.all.code_list.outerHTML = code_list.outerHTML;
    parent.document.all.list_page.outerHTML = list_page.outerHTML;
    parent.jsInit();
</script>
