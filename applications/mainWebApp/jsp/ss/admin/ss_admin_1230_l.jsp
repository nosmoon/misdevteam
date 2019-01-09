<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1210_l.jsp
* 기능 : 관리자-작업-마이그레이션-검증목록
* 작성일자 : 2004-03-11
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGRERRDataSet ds = (SS_L_MIGRERRDataSet)request.getAttribute("ds");
    int migListCount = 5;	// 한 화면당 리스트 항목 수
	System.out.print(ds.migrerrcur.size());
%>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
    <tr valign="top">
        <td>
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td height="25" align="left" colspan="3" class="gray">&nbsp;</td>
                <td height="25" align="left" colspan="4" class="gray">&nbsp;지국도우미</td>
                <td height="25" align="left" colspan="4" class="gray">&nbsp;CRM시스템</td>
                <td height="25" align="left" colspan="2" class="gray">&nbsp;</td>
            </tr>
            <tr bgcolor="#dddddd" align="center">

              <td height="23" class="gray">구역</td>
              <td class="gray">배달</td>
			  <td class="gray">매체명</td>

              <td class="gray">고유번호</td>
              <td class="gray">유가월</td>
              <td class="gray">구독구분</td>
              <td class="gray">수금방법</td>

              <td class="gray">신독자번호</td>
              <td class="gray">무료여부</td>
              <td class="gray">유가월</td>
              <td class="gray">수금방법</td>

              <td class="gray">오류코드</td>
              <td class="gray">오류구분</td>

            </tr>
            <%-- 목록 반복 시작 --%>
            <%
			for(int i=0; i<ds.migrerrcur.size(); i++){
				SS_L_MIGRERRMIGRERRCURRecord migrerrcurRec = (SS_L_MIGRERRMIGRERRCURRecord)ds.migrerrcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrerrcurRec.dd_no%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.dd_bno%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.sinmoon%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.dd_code%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.oyuga%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.ogudok%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.osgbang%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.rdr_no%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.cfreeyn%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.cyuga%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.csgbang%>&nbsp;</td>

              <td class="gray"><%= migrerrcurRec.ercode%>&nbsp;</td>
              <td class="gray"><%= migrerrcurRec.ername%>&nbsp;</td>

            </tr>
            <%}%>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<(migListCount-ds.migrerrcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>

              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="13" class="gray">
                <%-- 합계 --%>&nbsp;
              </td>
            </tr>
          </table>
        </td>
    </tr>
    </table>

<script>
    parent.document.all.mig_mecd.outerHTML = mig_mecd.outerHTML;
    //parent.document.all.page_move.outerHTML = page_move.outerHTML;
	parent.jsInit();
</script>

