<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�  : ps_rdr_1901_a.jsp
* ���    : �����Է¸�� �ʱ�
* �ۼ����� : 2008-07-14
* �ۼ���  : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-06
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page);
    //	dataset �ν��Ͻ� ����κ�
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String procdt_fr = Util.Uni2Ksc(Util.checkString(request.getParameter("procdt_fr"))); //�Ա�����(from)
	String procdt_to = Util.Uni2Ksc(Util.checkString(request.getParameter("procdt_to"))); //�Ա�����(to)


	//�Ա�����(from) �ʱ�ȭ üũ
	if (procdt_fr.equals("")) {
		procdt_fr  =  Util.addDate(Util.getDate(),-5);   //�������ڷκ��� 10����
	}

	//�Ա�����(to) �ʱ�ȭ üũ
	if (procdt_to.equals("")) {
		procdt_to  =  Util.getDate();                    //��������
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", procdt_fr);
    rxw.add(initTemp, "defaultTo", procdt_to);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "mcCombo"); // ��û��ü
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");  // ����
    rxw.makeDataToList(ds, "rcpmmthdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "rcpCombo");  // �Աݹ��
    
	rxw.flush(out);

%>

