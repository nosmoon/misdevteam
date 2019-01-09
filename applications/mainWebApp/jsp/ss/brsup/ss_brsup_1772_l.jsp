<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1772_l.jsp
* ��� : ������������-Billing�ڵ���ü-û���������-�ڵ���üû�������ϰ˻�
* �ۼ����� : 2004-04-15
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-16
* ������ϸ� : ss_brsup_1772_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SHFT_CLAM_OCOM2DataSet ds = (SS_L_SHFT_CLAM_OCOM2DataSet)request.getAttribute("ds");
    //int moveListCount = 18;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.add(resTemp, "totalSum", ds.getTotalcnt()); //�Ѱ���
	rxw.add(resTemp, "trueSum", ds.getNormcnt()); //���󰳼�
	rxw.add(resTemp, "falseSum", ds.getErrcnt()); //��������
    
	rxw.add(resTemp, "totalMoney", ds.getTotalamt()); //�� û���ݾ�
	rxw.add(resTemp, "trueMoney", ds.getNormamt()); //����ݾ�
	rxw.add(resTemp, "falseMoney", ds.getErramt()); //�����ݾ�
	rxw.add(resTemp, "susuMoney", ds.getComsamt()); //������
	rxw.add(resTemp, "bonmMoney", ds.getNormamt() - ds.getComsamt()); //�����۱ݱݾ�
	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.rsltcur.size());
	
	for(int i=0; i<ds.rsltcur.size(); i++)
	{
		SS_L_SHFT_CLAM_OCOM2RSLTCURRecord rsltcurRec = (SS_L_SHFT_CLAM_OCOM2RSLTCURRecord)ds.rsltcur.get(i);
			
			if(i == 0)
			{
				rxw.add_ColVal("shftclsfnm_f");
				rxw.add_ColVal("rdrnm_f");
							
				//������ �ʵ�� �ڵ� ����.
				rxw.makeRecordToBulkTitle(rsltcurRec);
			}
			
			//������ �߰�.		
			if("110".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("����");
			} else if("120".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("D.O");
			} else if("130".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("�Ϲ�");
			}
			
			if(rsltcurRec.rdrnm.getBytes().length>8) {
				rxw.add_ColVal(Util.leftKscStrB(rsltcurRec.rdrnm, 8)+"..");
          	} else {
          		rxw.add_ColVal(rsltcurRec.rdrnm);
          	}
									
			//������ �ʵ� �ڵ�����.
			rxw.makeRecordToBulk(rsltcurRec, false);
			
		}
		rxw.makeHugeEnd();
		   
		rxw.flush(out);
%>