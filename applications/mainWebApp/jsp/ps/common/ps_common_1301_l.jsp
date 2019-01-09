<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1301_l.jsp
* 기능     : 지사별 부서검색후 리턴되는곳
* 작성일자 : 2004-03-08
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
	PB_L_BOCDDEPTDataSet ds = (PB_L_BOCDDEPTDataSet)request.getAttribute("ds");
%>

            <select name="deptcd" size="1" class="sel_all" caption="부서" style="width:80;" id="bodept_sel" >
              <option value="%" selected >전체</option>
<%--부서 콤보박스--%>
<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PB_L_BOCDDEPTDEPTLISTCURRecord deptlistcurRec = (PB_L_BOCDDEPTDEPTLISTCURRecord)ds.deptlistcur.get(i);
%>
              <option value="<%= deptlistcurRec.deptcd%>"><%= deptlistcurRec.deptnm%></option>
<%
	}
%>
            </select>

    <script language="javascript">
		parent.document.all.bodept_sel.outerHTML = bodept_sel.outerHTML;
    </script>
