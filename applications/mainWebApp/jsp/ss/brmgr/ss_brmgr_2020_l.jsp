<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_bmgr_2020_l.jsp
* ���       : ����-ķ����Ȯ�����ڰ���(��ϰ˻�)
* �ۼ�����   : 2005-03-04
* �ۼ���     : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :TrustForm ����.
* ������   : ����
* �������� : 2009-04-15
* ������ϸ� : ss_brmgr_2020_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SS_L_CAMPSTATDataSet ds = (SS_L_CAMPSTATDataSet)request.getAttribute("ds");
	long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
	
	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    // ��ȸ ���.
    
	if((ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot()) != 0) 
   	{
		rxw.add(resTemp, "yCheck", ds.getCnfmstatcd_10_tot()+"("+(ds.getCnfmstatcd_10_tot()*100)/(ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot())+"%)"); //Ȯ��
		rxw.add(resTemp, "nCheck", ds.getCnfmstatcd_00_tot()+"("+(ds.getCnfmstatcd_00_tot()*100)/(ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot())+"%)"); //��Ȯ��
		rxw.add(resTemp, "totalBusu", ds.getCnfmstatcd_00_tot()+ds.getCnfmstatcd_10_tot()); //�Ѻμ�
		rxw.add(resTemp, "total", ds.totalcnt); //�ѰǼ�
   	}else {
   		rxw.add(resTemp, "yCheck", "0");
   		rxw.add(resTemp, "nCheck", "0");
   		rxw.add(resTemp, "totalBusu", "0");
   		rxw.add(resTemp, "total", "0");
   	}
	
   
    rxw.makeHugeStart(resTemp, "detailGrid", ds.camp_stat.size());
    
    for(int i=0; i< ds.camp_stat.size(); i++)
    {
		SS_L_CAMPSTATCAMP_STATRecord camp_statRec = (SS_L_CAMPSTATCAMP_STATRecord)ds.camp_stat.get(i);
		
		if(i == 0)
		{
			rxw.add_ColVal("noCheck");
			rxw.add_ColVal("sum");
			rxw.add_ColVal("totalSum");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(camp_statRec);
		}
		
		//������ �߰�.		
		if((camp_statRec.cnfmstatcd_00 + camp_statRec.cnfmstatcd_10) != 0) 
    	{
			rxw.add_ColVal(camp_statRec.cnfmstatcd_00+"("+(camp_statRec.cnfmstatcd_00*100)/(camp_statRec.cnfmstatcd_00 + camp_statRec.cnfmstatcd_10)+"%)");
			rxw.add_ColVal(camp_statRec.cnfmstatcd_10+"("+(camp_statRec.cnfmstatcd_10*100)/(camp_statRec.cnfmstatcd_00 + camp_statRec.cnfmstatcd_10)+"%)");
			rxw.add_ColVal(camp_statRec.cnfmstatcd_00 + camp_statRec.cnfmstatcd_10);
    	}else {
    		rxw.add_ColVal("0"+"(0%)");
    		rxw.add_ColVal("0"+"(0%)");
    		rxw.add_ColVal(camp_statRec.cnfmstatcd_00 + camp_statRec.cnfmstatcd_10);
    	}
					
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(camp_statRec, false);
		
	}
	rxw.makeHugeEnd();
	   
	rxw.flush(out);
%>