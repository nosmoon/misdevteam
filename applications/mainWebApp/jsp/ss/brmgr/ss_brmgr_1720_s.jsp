<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1720_s.jsp
* ��� : ��������-������������-��
* �ۼ����� : 2004-03-19
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-20
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	SS_S_RDR_MOVMWORKDataSet ds = (SS_S_RDR_MOVMWORKDataSet)request.getAttribute("ds");
	String comscd = Util.checkString(request.getParameter("comscd"));

    //int dstcListCount = 10;	// ���� ���� iframe���� �� �����Ӵ� �������� �׸� ��
    //int mediListCount = 9;	// ��ü ���� iframe���� �� �����Ӵ� �������� �׸� ��
    int dstcListCount = 5000;
    int mediListCount = 5000;

    //request process
    String acptBonm = Util.Uni2Ksc(Util.checkString(request.getParameter("acptbonm")));  //�μ�������
    String trsfBonm = Util.Uni2Ksc(Util.checkString(request.getParameter("trsfbonm")));  //�ΰ�������
    String basidt = Util.checkString(request.getParameter("basidt"));      //������������
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "acptBonm", Util.Uni2Ksc(Util.checkString(request.getParameter("acptbonm"))));
	rxw.add(resTemp, "trsfBonm", Util.Uni2Ksc(Util.checkString(request.getParameter("trsfbonm"))));
	rxw.add(resTemp, "basidt", Util.checkString(request.getParameter("basidt")));
	
	rxw.makeDataToBulk(ds, "curcommlist1", resTemp, "detailGrid");
	//rxw.makeDataToBulk(ds, "curcommlist2", resTemp, "detailGrid2");
	rxw.makeHugeStart(resTemp, "detailGrid2", ds.curcommlist2.size());
	for(int i=0; i < ds.curcommlist2.size(); i++)
	{
		SS_S_RDR_MOVMWORKCURCOMMLIST2Record curcommlist2Rec = (SS_S_RDR_MOVMWORKCURCOMMLIST2Record)ds.curcommlist2.get(i);
        
		//title �߰�.
		if(i == 0)
		{ 
			rxw.add_ColVal("sum");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlist2Rec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(curcommlist2Rec.valqty + curcommlist2Rec.pre_valqty + curcommlist2Rec.no_valqty);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlist2Rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>