<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/oz_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1871_t.jsp
* ���     : ����������ȸ ����Ʈ ���
* �ۼ����� : 2006-01-23
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozViewerID%>">
<param name="connection.servlet"              		value="<%=ozServerIP%>">
<param name="connection.reportname"           		value="SP_PS_P_BO_READER_SEARCH.ozr">
<param name="odi.odinames"                    		value="SP_PS_P_BO_READER_SEARCH">
<param name="odi.SP_PS_P_BO_READER_SEARCH.pcount" 	value="15">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args1"  	value="cmpycd=<%=cmpycd%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args2"  	value="medicd=<%=request.getParameter("medicd")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args3"  	value="gubun1=<%=request.getParameter("gubun1")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args4"  	value="nmtext=<%=request.getParameter("nmtext")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args5"  	value="rdr_no=<%=request.getParameter("rdr_no")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args6"  	value="gubun2=<%=request.getParameter("gubun2")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args7"  	value="phone1=<%=request.getParameter("phone1")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args8"  	value="phone2=<%=request.getParameter("phone2")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args9"  	value="phone3=<%=request.getParameter("phone3")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args10" 	value="gubun3=<%=request.getParameter("gubun3")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args11" 	value="dlvdtlsaddr=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("dlvdtlsaddr")))%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args12" 	value="sendmthd=<%=request.getParameter("sh_sendmthd")%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args13" 	value="deptcd=<%=Util.checkString(request.getParameter("deptcd"))%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args14" 	value="areacd=<%=Util.checkString(request.getParameter("areacd"))%>">
<param name="odi.SP_PS_P_BO_READER_SEARCH.args15" 	value="bocd=<%=Util.checkString(request.getParameter("corrbocd"))%>">

<param name="applet.configmode"               		value="html">
<param name="applet.isframe"                  		value="true">
<param name="applet.mode"                     		value="preview">

<!--�̸����� ȭ�������-->
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
<param name="export.path"                     		value="C:\\temp\\ChosunCRM">
<param name="export.filename"                 		value="������ȸ����Ʈ���<%=sysDate%>.xls">
<param name="excel.removerange"               		value="1,2">
<param name="excel.exceptfirstpage"           		value="true">
        <!--������ȯ ����-->
</OBJECT>
