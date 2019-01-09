<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_common_1178_l.jsp
* 기능 		 : 공통 독자 검색 (독자 입력 의한 검색)
* 작성일자   : 2003-04-13
* 작성자     : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_RDR_SRCHDataSet ds = (CO_L_RDR_SRCHDataSet)request.getAttribute("ds");
    CO_L_RDR_SRCHCURCOMMLISTRecord rec = null;

	if(ds.curcommlist.size() == 1){
        rec = (CO_L_RDR_SRCHCURCOMMLISTRecord)ds.curcommlist.get(0);
%>
		<form name="rdr_detail_form" method="post">
            <input type=hidden name=rdr_no         value="<%= rec.rdr_no         %>">      <!--독자번호          -->      
            <input type=hidden name=rdrnm          value="<%= rec.rdrnm          %>">      <!--독자명            --> 
            <input type=hidden name=onlmembid      value="<%= rec.onlmembid      %>">      <!--온라인회원아이디  --> 
            <input type=hidden name=zip            value="<%= rec.dlvzip         %>">      <!--우편번호          --> 
            <input type=hidden name=addr           value="<%= rec.dlvaddr        %>">      <!--주소              --> 
            <input type=hidden name=dtlsaddr       value="<%= rec.dlvdtlsaddr    %>">      <!--상세주소          --> 
            <input type=hidden name=rdrtel_no1     value="<%= rec.rdrtel_no1     %>">      <!--전화번호1         --> 
            <input type=hidden name=rdrtel_no2     value="<%= rec.rdrtel_no2     %>">      <!--전화번호2         --> 
            <input type=hidden name=rdrtel_no3     value="<%= rec.rdrtel_no3     %>">      <!--전화번호3         --> 
            <input type=hidden name=rdrptph_no1    value="<%= rec.rdrptph_no1    %>">      <!--휴대폰번호1       --> 
            <input type=hidden name=rdrptph_no2    value="<%= rec.rdrptph_no2    %>">      <!--휴대폰번호2       --> 
            <input type=hidden name=rdrptph_no3    value="<%= rec.rdrptph_no3    %>">      <!--휴대폰번호3       --> 
            <input type=hidden name=email          value="<%= rec.email          %>">      <!--독자이메일        --> 
            <input type=hidden name=prn            value="<%= rec.prn            %>">      <!--주민등록번호      --> 
            <input type=hidden name=onlmembseq     value="<%= rec.onlmembseq     %>">      <!--온라인회원일련번호-->             
        </form>
        <script language="javascript">
        	parent.set_rdr_search_result();
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.rdr_search();
        </script>
<%
    }
%>