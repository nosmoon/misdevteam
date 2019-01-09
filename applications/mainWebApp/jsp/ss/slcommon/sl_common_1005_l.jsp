<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1005_l.jsp
* 기능 		 : 공통 우편번호 검색 (우편번호 입력 의한 검색)
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
	CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)request.getAttribute("ds");
    CO_L_ZIPCURCOMMLISTRecord rec = null;

	if(ds.curcommlist.size() == 1){
        rec = (CO_L_ZIPCURCOMMLISTRecord)ds.curcommlist.get(0);

%>
		<form name="zip_detail_form" method="post">
        	<input type=hidden name=zip    value="<%= rec.zip    %>">
			<input type=hidden name=addr   value="<%= rec.addr   %>">
			<input type=hidden name=bgnn   value="<%= rec.bgnn   %>">
			<input type=hidden name=endn   value="<%= rec.endn   %>">
			<input type=hidden name=bocd   value="<%= rec.bocd   %>">
			<input type=hidden name=bonm   value="<%= rec.bonm   %>">
			<input type=hidden name=telno1 value="<%= rec.telno1 %>">
			<input type=hidden name=telno2 value="<%= rec.telno2 %>">
			<input type=hidden name=telno3 value="<%= rec.telno3 %>">
        </form>
        <script language="javascript">
        	parent.set_zip_search_result();
/*
            parent.reader_detail_form.dlvzip.value = "<%=rec.zip%>";
            parent.reader_detail_form.dlvaddr.value = "<%=rec.addr%>";
            parent.insertDash(parent.reader_detail_form.dlvzip, 3);
*/
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.zip_search(1);
        </script>
<%
    }
%>








