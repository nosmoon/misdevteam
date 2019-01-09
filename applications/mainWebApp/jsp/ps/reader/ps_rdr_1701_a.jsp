<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1701_a.jsp
* ��� : ���纰�Է¸�� �ʱ�
* �ۼ����� : 2004-02-21
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-05
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String input_fromdt = Util.Uni2Ksc(Util.checkString(request.getParameter("input_fromdt"))); //��û�Ⱓ(from)
	String input_todt = Util.Uni2Ksc(Util.checkString(request.getParameter("input_todt"))); //��û�Ⱓ(to)


	//��û�Ⱓ(from) �ʱ�ȭ üũ
	if (input_fromdt.equals("")) {
		input_fromdt  =  Util.addDate(Util.getDate(),-5);   //�������ڷκ��� 10����
	}

	//��û�Ⱓ(to) �ʱ�ȭ üũ
	if (input_todt.equals("")) {
		input_todt  =  Util.getDate();                     //��������
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", input_fromdt);
    rxw.add(initTemp, "defaultTo", input_todt);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");
    
	rxw.flush(out);

%>

