<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1510_l.jsp
* ��� : ������Ȳ-VacationStop-�ڵ�-���
* �ۼ����� : 2004-03-29
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-06
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_VSCDDataSet ds = (SS_L_VSCDDataSet)request.getAttribute("ds");  // request dataset
    //int vscdListCount = 12;	// �� ȭ��� ����Ʈ �׸� ��
    int vscdListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	rxw.add(resTemp, "totalCount", Util.comma(ds.getTotalcnt()));
	
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", vscdListCount);
	rxw.add(resTemp, "page_set_gubun", 0);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listgrid");
	
	rxw.flush(out);
	//�Ǽ��� ���� ��� "�˻� ����� �����ϴ�"
%>


