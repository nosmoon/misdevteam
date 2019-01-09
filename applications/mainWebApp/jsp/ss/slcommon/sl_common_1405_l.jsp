<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1405_l.jsp
* 기능 		 : 지국검색(지국명 입력에 의한 검색-엔터키)
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
    SL_L_BO_SRCHCURBOLISTRecord rec = null;

	if(ds.curbolist.size() == 1){
		rec = (SL_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(0);
%>
    <form name="bo_form" method="post">
        <input type=hidden name=bocd 		value="<%=rec.bocd 			%>">	<!--지국지사코드      -->
        <input type=hidden name=bonm 		value="<%=rec.bonm 			%>">	<!--지국지사명        -->
        <input type=hidden name=deptcd 		value="<%=rec.deptcd 		%>">	<!--부서코드          -->
        <input type=hidden name=deptnm 		value="<%=rec.deptnm 		%>">	<!--부서명            -->
        <input type=hidden name=areacd 		value="<%=rec.areacd 		%>">	<!--지역코드          -->
        <input type=hidden name=areanm 		value="<%=rec.areanm 		%>">	<!--지역명            -->
        <input type=hidden name=tel_no11 	value="<%=rec.tel_no11 		%>">	<!--지국전화번호1     -->
        <input type=hidden name=tel_no12 	value="<%=rec.tel_no12 		%>">	<!--지국전화번호2     -->
        <input type=hidden name=tel_no13 	value="<%=rec.tel_no13 		%>">	<!--지국전화번호3     -->
        <input type=hidden name=fax1 		value="<%=rec.fax1 			%>">	<!--지국팩스1         -->
        <input type=hidden name=fax2 		value="<%=rec.fax2 			%>">	<!--지국팩스2         -->
        <input type=hidden name=fax3 		value="<%=rec.fax3 			%>">	<!--지국팩스3         -->
        <input type=hidden name=bo_headnm 	value="<%=rec.bo_headnm 	%>">	<!--지국장명          -->
        <input type=hidden name=htel_no1 	value="<%=rec.htel_no1 		%>">	<!--지국장전화번호1   -->
        <input type=hidden name=htel_no2 	value="<%=rec.htel_no2 		%>">	<!--지국장전화번호2   -->
        <input type=hidden name=htel_no3 	value="<%=rec.htel_no3 		%>">	<!--지국장전화번호3   -->
        <input type=hidden name=hptph_no1 	value="<%=rec.hptph_no1 	%>">	<!--지국장휴대폰번호1 -->
        <input type=hidden name=hptph_no2 	value="<%=rec.hptph_no2 	%>">	<!--지국장휴대폰번호2 -->
        <input type=hidden name=hptph_no3 	value="<%=rec.hptph_no3 	%>">	<!--지국장휴대폰번호3 -->
        <input type=hidden name=hemail 		value="<%=rec.hemail 		%>">	<!--지국장이메일      -->
        <input type=hidden name=boaddr 		value="<%=rec.boaddr 		%>">	<!--지국주소          -->
        <input type=hidden name=bodtlsaddr 	value="<%=rec.bodtlsaddr 	%>">	<!--지국상세주소      -->
        <input type=hidden name=hboaddr 	value="<%=rec.hboaddr 		%>">	<!--지국장주소        -->
        <input type=hidden name=hbodtlsaddr value="<%=rec.hbodtlsaddr 	%>">	<!--지국장상세주소    -->
    </form>
    <script language="javascript">
        parent.bo_search_result();
    </script>
<%
    }else{
%>
    <script language="javascript">
        parent.bo_search();
    </script>
<%
    }
%>