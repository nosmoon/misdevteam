<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1520_s.jsp
* ��� : ������Ȳ-VacationStop-�ڵ�-��
* �ۼ����� : 2004-03-29
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : Ȳ����
* �������� : 2009-02-11
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    SS_S_VSCDDataSet ds = (SS_S_VSCDDataSet)request.getAttribute("ds");  // �� ���� �������� request dataset
    applySession = false;	// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "applySession", String.valueOf(applySession));
	rxw.add(resTemp, "accflag", "U");
	
	rxw.makeDataToBulk(ds, resTemp, "vacaDetail");
	
	rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "����", "", resTemp, "teamlist", "record", "dept_nm", "dept_cd");
	
	rxw.flush(out);
%>
