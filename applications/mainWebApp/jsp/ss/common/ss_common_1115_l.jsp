<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1115_l.jsp
* ��� : ���� �˻� ���
* �ۼ����� : 2003-12-08
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : Ȳ����
* �������� : 20090122
* ������ϸ� : ss_brinfo_1050_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BO_SRCH_TEMPDataSet ds = (SS_L_BO_SRCH_TEMPDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	//rxw.makeDataToXml(ds, "curbolist", root, "branchGrid");
	//rxw.makeDataToBulk(ds, "curbolist", root, "branchGrid");
	rxw.makeHugeStart(root, "branchGrid", ds.curbolist.size());
	for(int i=0; i < ds.curbolist.size() ; i++)
	{
		SS_L_BO_SRCH_TEMPCURBOLISTRecord curbolistRec = (SS_L_BO_SRCH_TEMPCURBOLISTRecord)ds.curbolist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("tel_no1");
			rxw.add_ColVal("hptph_no");
			rxw.add_ColVal("baddr");
			rxw.add_ColVal("fax");
			rxw.add_ColVal("htel_no");
			rxw.add_ColVal("haddr");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curbolistRec);
			
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.tel_no11).append("-").append(curbolistRec.tel_no12).append("-").append(curbolistRec.tel_no13));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.hptph_no1).append("-").append(curbolistRec.hptph_no2).append("-").append(curbolistRec.hptph_no3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.boaddr).append(" ").append(curbolistRec.bodtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.fax1).append("-").append(curbolistRec.fax2).append("-").append(curbolistRec.fax3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.htel_no1).append("-").append(curbolistRec.htel_no2).append("-").append(curbolistRec.htel_no3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.hboaddr).append(" ").append(curbolistRec.hbodtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curbolistRec, false);
		
	}
	rxw.makeHugeEnd();
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
