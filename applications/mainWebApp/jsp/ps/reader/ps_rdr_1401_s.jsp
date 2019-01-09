<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1401_s.jsp
* ��� : ����-������ȸ
* �ۼ����� : 2004-02-21
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-05
* ������ϸ� : ps_rdr_1401_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	// �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    
    //	dataset �ν��Ͻ� ����κ�
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String aplcdtfr = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtfr"))); //��û�Ⱓ(from)
	String aplcdtto = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtto"))); //��û�Ⱓ(to)

	//��û�Ⱓ(from) �ʱ�ȭ üũ
	if (aplcdtfr.equals("")) {
		aplcdtfr  =  Util.addMonth(Util.getDate(),-24);   //�������ڷκ��� 24������
	}

	//��û�Ⱓ(to) �ʱ�ȭ üũ
	if (aplcdtto.equals("")) {
		aplcdtto  =  Util.getDate();                     //��������
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", aplcdtfr);
    rxw.add(initTemp, "defaultTo", aplcdtto);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");
    
	rxw.flush(out);
	
%>

