<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1225_s.jsp
* ��� 		 : ������������(�Աݳ�����)
* �ۼ����� 	 : 2003-12-22
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-24
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    String basiyymm = Util.checkString(request.getParameter("basiyymm"));       //�˻����س��
    String rdr_no = Util.checkString(request.getParameter("rdr_no"));           //���ڹ�ȣ
    String medicd = Util.checkString(request.getParameter("medicd"));           //��ü�ڵ�
    String dlvdstccd = Util.checkString(request.getParameter("dlvdstccd"));     //�����ڵ�
    String subsmappli = Util.checkString(request.getParameter("subsmappli"));   //��������

    // getting dataset
    SL_S_RDR_NWSPCLAMTDataSet ds = (SL_S_RDR_NWSPCLAMTDataSet)request.getAttribute("ds");  // request dataset

	SL_S_RDR_NWSPCLAMTDEFAULTCURRecord defaultcurRec  = null;
	SL_S_RDR_NWSPCLAMTCLAMTCURRecord   clamtcurRec    = null;
    if(ds.clamtcur.size()   == 1  ) clamtcurRec   = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)ds.clamtcur.get(0);
    if(ds.defaultcur.size() == 1  ) defaultcurRec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)ds.defaultcur.get(0);

    String recpdt      = "";
    String clamamt     = "";
    String clamt       = "";
    String clamtmthdcd = "";
    String rcpmclsfcd  = "";

	if(clamtcurRec == null){ //�ش� �������п� ���� ���� ���ڵ尡 ���� ���� �ʴ� ���
		if(ds.curryymm.compareTo(subsmappli) < 0) { //������� ū ���������� ���
			rcpmclsfcd = "050";                 //���ݱ���("050":����)
		}else{ //����� ���������� ���� ���
			rcpmclsfcd = "010";//���ݱ���("010":����)
		}
	}else{ //�ش� �������п� ���� ���� ���ڵ尡 �����ϴ� ���
		recpdt = clamtcurRec.recpdt;
		clamamt = String.valueOf(clamtcurRec.clamamt);
		clamt = String.valueOf(clamtcurRec.clamt);
		clamtmthdcd = clamtcurRec.clamtmthdcd;
		rcpmclsfcd = clamtcurRec.rcpmclsfcd;
	}
	
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int rcpmDetailForm = rxw.add(resTemp, "rcpmDetailForm", "");
	//data
	rxw.add(rcpmDetailForm, "dataExist",	clamtcurRec == null ? "N" : "Y");
	//hidden
	rxw.add(rcpmDetailForm, "bocd", 		Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(rcpmDetailForm, "incmgpers", 	Util.getSessionParameterValue(request, "uid", true));
	rxw.add(rcpmDetailForm, "rdr_no", 		rdr_no);
	rxw.add(rcpmDetailForm, "medicd", 		medicd);
	rxw.add(rcpmDetailForm, "dlvdstccd", 	dlvdstccd);
	rxw.add(rcpmDetailForm, "basiyymm", 	basiyymm);
	/*** 2004-05-20 �߰�( ����: �Աݱ��п� ���� �⺻�� ������ ����) ****/
	rxw.add(rcpmDetailForm, "h_recpdt", 	Util.getDate());
	rxw.add(rcpmDetailForm, "h_clamamt", 	(defaultcurRec == null)? "" : String.valueOf(defaultcurRec.clamamt));
	rxw.add(rcpmDetailForm, "h_clamt", 		(defaultcurRec == null)? ds.realsubsamt : String.valueOf(defaultcurRec.clamamt));
	rxw.add(rcpmDetailForm, "h_clamtmthdcd",(defaultcurRec == null)? "" : defaultcurRec.clamtmthdcd);
	//�Է°�ü
	rxw.add(rcpmDetailForm, "subsmappli", 	subsmappli);
	rxw.add(rcpmDetailForm, "clamamt", 		clamamt);
	rxw.add(rcpmDetailForm, "recpdt", 		recpdt);
	rxw.add(rcpmDetailForm, "clamt", 		clamt);
	rxw.add(rcpmDetailForm, "rcpmclsfcd", 	rcpmclsfcd);
	rxw.add(rcpmDetailForm, "clamtmthdcd", 	clamtmthdcd);
	
	//combbo
	int comboData = rxw.add(resTemp, "comboData", "");
	//�Աݱ���
	rxw.makeDataToBulkList(ds, "rcpmclsfcur", "cicdnm", "cicodeval", comboData, "clamtmthdcdCombo");
	//���ݹ��
	rxw.makeDataToBulkList(ds, "clamtmthdcur", "cicdnm", "cicodeval", comboData, "rcpmclsfcdCombo");
	
	rxw.flush(out);
%>

