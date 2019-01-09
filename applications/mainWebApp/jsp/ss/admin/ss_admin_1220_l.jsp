<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1220_l.jsp
* 기능 : 관리자-작업-마이그레이션-검증목록
* 작성일자 : 2004-04-01
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGRSGBANGDataSet ds = (SS_L_MIGRSGBANGDataSet)request.getAttribute("ds");
    int migListCount = 5;	// 한 화면당 리스트 항목 수
	int bigListCount = (ds.migrtmpsgbangcur.size() > ds.migrcrmsgbangcur.size())? ds.migrtmpsgbangcur.size() : ds.migrcrmsgbangcur.size();
	if (migListCount < bigListCount) {
        migListCount = bigListCount;
	}
%>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
    <tr>
        <td height="25" align="left" class="gray">&nbsp;지국도우미</td>
        <td height="25" align="left" class="gray">&nbsp;CRM시스템</td>
    </tr>
    <tr valign="top">
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">지명</td>
              <td class="gray">지로</td>
              <td class="gray">방문</td>
              <td class="gray">자동이체</td>
              <td class="gray">카드이체</td>
              <td class="gray">기타</td>
              <td class="gray">TOTAL</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%
            for(int i=0; i<ds.migrtmpsgbangcur.size(); i++){
                SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord migrtmpsgbangcurRec = (SS_L_MIGRSGBANGMIGRTMPSGBANGCURRecord)ds.migrtmpsgbangcur.get(i);%>
            <tr align="center" style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrtmpsgbangcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.giro%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.bangmun%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.autogiro%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.cardauto%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrtmpsgbangcurRec.total%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<(migListCount-ds.migrtmpsgbangcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- 합계 --%>&nbsp;
              </td>
            </tr>
          </table>
        </td>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">지명</td>
              <td class="gray">지로</td>
              <td class="gray">방문</td>
              <td class="gray">자동이체</td>
              <td class="gray">카드이체</td>
              <td class="gray">기타</td>
              <td class="gray">TOTAL</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%
            for(int i=0; i<ds.migrcrmsgbangcur.size(); i++){
                SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord migrcrmsgbangcurRec = (SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord)ds.migrcrmsgbangcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrcrmsgbangcurRec.sinmoon%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.giro%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.bangmun%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.autogiro%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.cardauto%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrcrmsgbangcurRec.total%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<(migListCount-ds.migrcrmsgbangcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- 합계 --%> &nbsp;
              </td>
            </tr>
          </table>
        </td>
    </tr>
    </table>

<script>
    parent.document.all.mig_mecd.outerHTML = mig_mecd.outerHTML;
    //parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 이벤트 핸들러 호출
    parent.jsInit();


<%if(ds.migrtmpsgbangcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>

