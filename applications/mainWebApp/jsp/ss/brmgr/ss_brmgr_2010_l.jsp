<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_bmgr_2010_l.jsp
* ���       : ����-ķ����Ȯ�����ڰ���(��ϰ˻�)
* �ۼ�����   : 2005-03-04
* �ۼ���     : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :TrustForm ����.
* ������   : ����
* �������� : 2009-04-15
* ������ϸ� : ss_brmgr_2010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    CO_L_CAMPINFODataSet ds = (CO_L_CAMPINFODataSet)request.getAttribute("ds");
	System.out.println(ds.campinfolist.size());
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    // ��ȸ ���.
    
    rxw.add(resTemp, "totalCount", ds.campinfolist.size());
   
    rxw.makeHugeStart(resTemp, "listGrid", ds.campinfolist.size());
    for(int i=0; i<ds.campinfolist.size(); i++)
    {
		CO_L_CAMPINFOCAMPINFOLISTRecord campinfolistRec = (CO_L_CAMPINFOCAMPINFOLISTRecord)ds.campinfolist.get(i);
	
		if(i == 0)
		{
			rxw.add_ColVal("campainSystem");
			rxw.add_ColVal("playData");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(campinfolistRec);
		}

		//������ �߰�.
		rxw.add_ColVal("ķ���νý���");
		rxw.add_ColVal(campinfolistRec.campchnlfrdt + "~" + campinfolistRec.campchnltodt);
					
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(campinfolistRec, false);
	}
	rxw.makeHugeEnd();
	   
	rxw.flush(out);
%>
 
