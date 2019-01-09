<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1107_l.jsp
* 기능     : 공통 우편번호 검색 (우편번호 입력 의한 검색)
* 작성일자 : 2004-01-30
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	//우편 및 주소검색 위치
    String zipseq = Util.Uni2Ksc(Util.checkString(request.getParameter("zipseq")));

    //getting dataset
	PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)request.getAttribute("ds");

	//데이타 없을경우
    if(ds.zipaddrcur.size() == 1){
		PB_L_TAOCC_PSTCDZIPADDRCURRecord zipaddrcurRec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)ds.zipaddrcur.get(0);
%>
		<form name="zip_detail_form" method="post">
        	<input type=hidden name="zip1"   value="<%=zipaddrcurRec.juzipcd1%>">
        	<input type=hidden name="zip2"   value="<%=zipaddrcurRec.juzipcd2%>">
        	<input type=hidden name="zip3"   value="<%=zipaddrcurRec.juzipcd3%>">
			<input type=hidden name="addr"   value="<%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%>">
        </form>
        <script language="javascript">
        	parent.set_zip_search_result(<%=zipseq%>);
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.zip_search(<%=zipseq%>);
        </script>
<%
    }
%>
