<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1660_i.jsp
* ��� : �������� �Խ��� �������� �亯���
* �ۼ����� : 2003-12-03
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����. 
* ������   : ����
* �������� : 2009-03-24
* ������ϸ� : ss_share_1660_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	applySession = true;	// ���� ���� ����

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    String rmsgdept_param = Util.checkString((String)request.getAttribute("rmsgdept_param"));
    String rmsgarea_param = Util.checkString((String)request.getAttribute("rmsgarea_param"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String titl = Util.checkString((String)request.getAttribute("titl"));
    String answergrp = Util.checkString((String)request.getAttribute("answergrp"));
    String answerseq = Util.checkString((String)request.getAttribute("answerseq"));
    String answerlevl = Util.checkString((String)request.getAttribute("answerlevl"));

    String seq = Util.checkString((String)request.getAttribute("seq"));			//����� seq
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // ���̵�
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // ����ڸ�
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // �ҼӺμ��ڵ�    
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // �ҼӺμ���   
	    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.add(root, "resTemp", "");
    
    rxw.add(resTemp, "makepersnm", makepersnm); //����ڸ�
    rxw.add(resTemp, "deptnm", deptnm); //�ҼӺμ���             
    rxw.add(resTemp, "titl", titl);
        
	rxw.flush(out);
%>
