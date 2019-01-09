<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1410_l.jsp
* 기능 		 : 공통 지국 찾기 (검색 버튼에 의한 팝업 화면)
* 작성일자 	 : 2003-12-09
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BO_SRCHDataSet ds = (SL_L_BO_SRCHDataSet)request.getAttribute("ds");
%>
<%-- 검색결과가 없을 경우--%>
<%if(ds.curbolist.size() == 0){%>

    <!--지국 검색 결과가 없을 경우 출력 시작-->
    <table width="680" border="0" cellspacing="0" cellpadding="3" id="bo_list_id">
        <tr>
            <td bgcolor="#979596" height="1">
            <!--line-->
            </td>
        </tr>
        <tr>
            <td bgcolor="#E7E7E7" align="center"><b>입력하신 '지국'이 없습니다.</b><br>
            거주하시는 지역의 '읍/면/동 이름'이 정확하게 입력되었는지 다시 확인해주시기 바랍니다.</td>
        </tr>
        <tr>
            <td bgcolor="#979596" height="1">
            <!--line-->
            </td>
        </tr>
    </table>
    <!--지국 검색 결과가 없을 경우 출력 끝-->

<%-- 검색결과가 있을 경우 --%>
<%}else{%>

    <!--지국 검색 결과가 있을 경우 출력 시작-->
    <table width="680" border="1" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" bordercolor="#FFFFFF" id="bo_list_id">
        <tr align="center">
            <td width="80" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            지국 </font></td>
            <td width="120" class="gray" bgcolor="#979596"  ><font color="#FFFFFF">
            지국장/이메일 </font></td>
            <td width="90" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            지국전화/팩스 </font></td>
            <td width="110" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            지국장휴대폰/자택</font></td>
            <td class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            지국주소/지국장자택주소</font></td>
        </tr>
    <%-- 지국 검색 목록 시작 --%>
    <%for(int i=0; i<ds.curbolist.size(); i++){
        SL_L_BO_SRCHCURBOLISTRecord curbolistRec = (SL_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(i);%>
        <tr bgcolor="#F2F2F2" onclick="popup_select('<%= curbolistRec.bocd%>','<%= curbolistRec.bonm%>','<%= curbolistRec.deptcd%>','<%= curbolistRec.deptnm%>','<%= curbolistRec.areacd%>','<%= curbolistRec.areanm%>');" style="cursor:hand" onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);">
            <td rowspan="2" width="80" class="gray"><%-- 지국명 --%>
                <%= curbolistRec.bonm%>
            </td>
            <td width="120" class="gray"> <%= curbolistRec.bo_headnm%> &nbsp;</td><%-- 지국장명 --%>
            <td width="90" class="gray"><%-- 지국전화번호 --%>
                <%= curbolistRec.tel_no11%>-
                <%= curbolistRec.tel_no12%>-
                <%= curbolistRec.tel_no13%>&nbsp; </td>
            <td width="110" class="gray"><%-- 지국장휴대폰 --%>
                <%= curbolistRec.hptph_no1%>-
                <%= curbolistRec.hptph_no2%>-
                <%= curbolistRec.hptph_no3%>&nbsp; </td>
            <td class="gray"> <%-- 지국주소--%>
                <%= curbolistRec.boaddr%>&nbsp;
                <%= curbolistRec.bodtlsaddr%>&nbsp;</td>
        </tr>
        <tr bgcolor="#F2F2F2" onclick="popup_select('<%= curbolistRec.bocd%>','<%= curbolistRec.bonm%>','<%= curbolistRec.deptcd%>','<%= curbolistRec.deptnm%>','<%= curbolistRec.areacd%>','<%= curbolistRec.areanm%>');" style="cursor:hand" onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);">
            <td width="120" class="gray"> <%= curbolistRec.hemail%>&nbsp;</td><%-- 지국장이메일 --%>
            <td width="90" class="gray"><%-- 지국팩스번호 --%>
                <%= curbolistRec.fax1%>-
                <%= curbolistRec.fax2%>-
                <%= curbolistRec.fax3%> &nbsp;</td>
            <td width="110" class="gray" ><%-- 지국장 자택전화 --%>
                <%= curbolistRec.htel_no1%>-
                <%= curbolistRec.htel_no2%>-
                <%= curbolistRec.htel_no3%>&nbsp; </td>
            <td class="gray"> <%-- 지국장 자택주소--%>
                <%= curbolistRec.hboaddr%>
                <%= curbolistRec.hbodtlsaddr%>&nbsp;</td>
        </tr>
    <%}%>
    <%-- 지국 검색 목록 끝 --%>
</table>
<%}%>

<!--지국 검색 결과가 있을 경우 출력 끝-->
<script>
    parent.document.all.bo_list_id.outerHTML = bo_list_id.outerHTML;
</script>
