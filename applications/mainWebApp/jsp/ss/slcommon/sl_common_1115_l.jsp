<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_common_1115_l.jsp
* 기능       : 독자검색팝업(기본형)(독자명/번호/구역+배달 - 엔터키)
* 작성일자   : 2004-01-15
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_READER_01DataSet ds = (SL_L_READER_01DataSet)request.getAttribute("ds");
    SL_L_READER_01READERCURRecord rec = null;

	if(ds.readercur.size() == 1){
        rec = (SL_L_READER_01READERCURRecord)ds.readercur.get(0);

%>
		<form name="reader_result_form" method="post">
            <input type=hidden name=rdr_no         value="<%= rec.rdr_no         %>">
            <input type=hidden name=paty_clsfcd    value="<%= rec.paty_clsfcd    %>">
            <input type=hidden name=natnclsfcd     value="<%= rec.natnclsfcd     %>">
            <input type=hidden name=onlmembid      value="<%= rec.onlmembid      %>">
            <input type=hidden name=rdrnm          value="<%= rec.rdrnm          %>">
            <input type=hidden name=prn            value="<%= rec.prn            %>">
            <input type=hidden name=ernno          value="<%= rec.ernno          %>">
            <input type=hidden name=email          value="<%= rec.email          %>">
            <input type=hidden name=dlvzip         value="<%= rec.dlvzip         %>">
            <input type=hidden name=dlvcd          value="<%= rec.dlvcd          %>">
            <input type=hidden name=dlvaddr        value="<%= rec.dlvaddr        %>">
            <input type=hidden name=dlvdtlsaddr    value="<%= rec.dlvdtlsaddr    %>">
            <input type=hidden name=dlvdong        value="<%= rec.dlvdong        %>">
            <input type=hidden name=dlvser_no      value="<%= rec.dlvser_no      %>">
            <input type=hidden name=dlvbnji        value="<%= rec.dlvbnji        %>">
            <input type=hidden name=dlvteamcd      value="<%= rec.dlvteamcd      %>">
            <input type=hidden name=dlvdstccd      value="<%= rec.dlvdstccd      %>">
            <input type=hidden name=dlvno          value="<%= rec.dlvno          %>">
            <input type=hidden name=dlvintvno      value="<%= rec.dlvintvno      %>">
            <input type=hidden name=dlvmthdcd      value="<%= rec.dlvmthdcd      %>">
            <input type=hidden name=dlvqty         value="<%= rec.dlvqty         %>">
            <input type=hidden name=rdrtel_no1     value="<%= rec.rdrtel_no1     %>">
            <input type=hidden name=rdrtel_no2     value="<%= rec.rdrtel_no2     %>">
            <input type=hidden name=rdrtel_no3     value="<%= rec.rdrtel_no3     %>">
            <input type=hidden name=rdrptph_no1    value="<%= rec.rdrptph_no1    %>">
            <input type=hidden name=rdrptph_no2    value="<%= rec.rdrptph_no2    %>">
            <input type=hidden name=rdrptph_no3    value="<%= rec.rdrptph_no3    %>">
            <input type=hidden name=realsubsamt    value="<%= rec.realsubsamt    %>">
            <input type=hidden name=subsamt        value="<%= rec.subsamt        %>">
            <input type=hidden name=dscnamt        value="<%= rec.dscnamt        %>">
            <input type=hidden name=rptvsubsdt     value="<%= rec.rptvsubsdt     %>">
            <input type=hidden name=rptvrdr_extndt value="<%= rec.rptvrdr_extndt %>">
            <input type=hidden name=addrnm         value="<%= rec.addrnm         %>">
            <input type=hidden name=mil            value="<%= rec.mil            %>">
        </form>
        <script language="javascript">
        	parent.set_reader_search_result();
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.reader_search();
        </script>
<%
    }
%>