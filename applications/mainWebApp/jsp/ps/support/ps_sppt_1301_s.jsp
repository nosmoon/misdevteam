<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1301_s.jsp
* ��� : �̻�ó��
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-10
* ������ϸ� : ps_sppt_1301_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String lo_empno     = Util.getSessionParameterValue(request, "emp_no", true);       //�����ȣ
    String lo_kflnm     = Util.getSessionParameterValue(request, "emp_nm",true);         //�����

    String records_per_page = "10";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset �ν��Ͻ� ����κ�
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-30));
    rxw.add(initTemp, "defaultTo", Util.getDate());         
        
	rxw.flush(out);
    
%>

