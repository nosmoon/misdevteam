<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_share_11302_s.jsp /  agency/commun_11120_s.jsp����
* ��� : �������� ��_����Ͽ�
* �ۼ����� : 2017-01-24
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SL_S_INFOEXGDataSet ds = (SL_S_INFOEXGDataSet)request.getAttribute("ds");  // request dataset

    int listCount = 18;	// ��� �ݺ� Ƚ��

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = String.valueOf(listCount);};

%>
<noticedetaillist>
<noticedetailinfo>
<regdt><%=ds.getRegdt() %></regdt>
<brwscnt><%=ds.getBrwscnt() %></brwscnt>
<titl><![CDATA[<%=ds.getTitl() %>]]></titl>
  <%
     String cont = ds.getCont1() + ds.getCont2() + ds.getCont3() + ds.getCont4() + ds.getCont5();
  %>
<cont><![CDATA[<%=cont %>]]></cont>
<!--������ -->
<%
        if(ds.prev_dtl.size() > 0){
            SL_S_INFOEXGPREV_DTLRecord prev_dtlRec = (SL_S_INFOEXGPREV_DTLRecord)ds.prev_dtl.get(0);
%>
<prev_seq><%=prev_dtlRec.seq %></prev_seq>
<prev_brwscnt><%=prev_dtlRec.brwscnt %></prev_brwscnt>
<prev_titl><![CDATA[<%=prev_dtlRec.titl%>]]></prev_titl>
<%
	}
%>
<!--������ -->
<%
        if(ds.next_dtl.size() > 0){
            SL_S_INFOEXGNEXT_DTLRecord next_dtlRec = (SL_S_INFOEXGNEXT_DTLRecord)ds.next_dtl.get(0);
%>
<next_seq><%=next_dtlRec.seq%></next_seq>
<next_brwscnt><%=next_dtlRec.brwscnt%></next_brwscnt>
<next_titl><![CDATA[<%=Util.checkString(next_dtlRec.titl)%>]]></next_titl>
<%
	}
%>
</noticedetailinfo>
</noticedetaillist>