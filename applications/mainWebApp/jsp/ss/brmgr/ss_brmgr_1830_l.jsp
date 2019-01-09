<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2600_a.jsp
* ��� 		 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ����� ��Ȳ��� ����Ʈ
* �ۼ����� 	 : 2004-02-28
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 : ss_brmgr_1830_l.jsp
* ������ 	 : �Ǹ���-����Ʈ���� ��Ȳ����� ��Ȳ��� ����Ʈ
* �������� 	 : 2006-03-10
* �ۼ��� 	 : ����
* ������ϸ�   :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-10
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	int page_rec = 5000;				// ��ȭ�鿡 ��ȸ�Ǵ� ���ڵ�� 5 -> 5000

    //	dataset �ν��Ͻ� ����κ�
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int naviInfo = rxw.add(resTemp, "naviInfo", request.getParameter("curr_page_no")==null || "".equals(request.getParameter("curr_page_no")) ? "1" : request.getParameter("curr_page_no"));
	rxw.add(naviInfo, "curr_page_no", "");
	rxw.add(naviInfo, "total_records", ds.getTotalcnt());
	rxw.add(naviInfo, "records_per_page", page_rec);
	
	rxw.makeHugeStart(resTemp, "thrwResearchGrid", ds.thrwlistcur.size());
	SS_L_COMM_APT_THRWTHRWLISTCURRecord rsltcurRec = null;
    for(int i=0, j=0; i<ds.thrwlistcur.size(); i++){
    	rsltcurRec = (SS_L_COMM_APT_THRWTHRWLISTCURRecord)ds.thrwlistcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("invsgdthm");
			//������ trustform datagrid �⺻ ��� ���.
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(rsltcurRec.invsgdt + rsltcurRec.invsghhmm.substring(0,4));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	//��޻���
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd1Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd2Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", resTemp, "selDlvstatcd3Combo");
	
	rxw.flush(out);
%>
