<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/oz_common.jsp" %>
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
System.out.println("HI");
    //����� ��������
    String cmpycd =  Util.getSessionParameterValue(request, "cmpycd", true); //����ȸ���ڵ�
    String incmgpers = Util.getSessionParameterValue(request, "uid", true); //�α��λ����
    String sysDate = Util.getDate(); // ����ȭ�� ����� �����̸����� ���
%>
paramTag[paramTag.length] = '<OBJECT name="OZViewer" width = "100" height = "100" CLASSID="<%=ozClasssID%>">';
paramTag[paramTag.length] = '<param name="connection.servlet"              		value="<%=ozServerIP%>">';
paramTag[paramTag.length] = '<param name="connection.reportname"           		value="SP_PS_P_BO_READER_SEARCH.ozr">';
paramTag[paramTag.length] = '<param name="odi.odinames"                    		value="SP_PS_P_BO_READER_SEARCH">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.pcount" 	value="12">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args1"  	value="cmpycd=<%=cmpycd%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args2"  	value="medicd=<%=request.getParameter("medicd")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args3"  	value="gubun1=<%=request.getParameter("gubun1")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args4"  	value="nmtext=<%=request.getParameter("nmtext")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args5"  	value="rdr_no=<%=request.getParameter("rdr_no")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args6"  	value="gubun2=<%=request.getParameter("gubun2")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args7"  	value="phone1=<%=request.getParameter("phone1")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args8"  	value="phone2=<%=request.getParameter("phone2")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args9"  	value="phone3=<%=request.getParameter("phone3")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args10" 	value="gubun3=<%=request.getParameter("gubun3")%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args11" 	value="dlvdtlsaddr=<%=Util.Uni2Ksc(Util.checkString(request.getParameter("dlvdtlsaddr")))%>">';
paramTag[paramTag.length] = '<param name="odi.SP_PS_P_BO_READER_SEARCH.args12" 	value="sendmthd=<%=request.getParameter("sh_sendmthd")%>">';
paramTag[paramTag.length] = '<param name="applet.configmode"               		value="html">';
paramTag[paramTag.length] = '<param name="applet.isframe"                  		value="true">';
paramTag[paramTag.length] = '<param name="applet.mode"                     		value="preview">';

<!--�̸����� ȭ�������-->
<!--������ȯ�� �ݺ����� ���ܿ� ��������-->
paramTag[paramTag.length] = '<param name="export.path"                     		value="C:\\temp\\ChosunCRM">';
paramTag[paramTag.length] = '<param name="export.filename"                 		value="������ȸ����Ʈ���<%=sysDate%>.xls">';
paramTag[paramTag.length] = '<param name="excel.removerange"               		value="1,2">';
paramTag[paramTag.length] = '<param name="excel.exceptfirstpage"           		value="true">';
        <!--������ȯ ����-->
paramTag[paramTag.length] = '</OBJECT>';

oz_activex_build(paramTag);
</script>

