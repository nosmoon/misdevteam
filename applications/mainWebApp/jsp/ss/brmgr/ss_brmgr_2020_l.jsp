<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_bmgr_2020_l.jsp
* 기능       : 독자-캠페인확장대상자관리(목록검색)
* 작성일자   : 2005-03-04
* 작성자     : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-15
* 백업파일명 : ss_brmgr_2020_l.jsp.bak
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
    // 조회 결과.
    
	if((ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot()) != 0) 
   	{
		rxw.add(resTemp, "yCheck", ds.getCnfmstatcd_10_tot()+"("+(ds.getCnfmstatcd_10_tot()*100)/(ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot())+"%)"); //확인
		rxw.add(resTemp, "nCheck", ds.getCnfmstatcd_00_tot()+"("+(ds.getCnfmstatcd_00_tot()*100)/(ds.getCnfmstatcd_10_tot()+ds.getCnfmstatcd_00_tot())+"%)"); //미확인
		rxw.add(resTemp, "totalBusu", ds.getCnfmstatcd_00_tot()+ds.getCnfmstatcd_10_tot()); //총부수
		rxw.add(resTemp, "total", ds.totalcnt); //총건수
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
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(camp_statRec);
		}
		
		//데이터 추가.		
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
					
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(camp_statRec, false);
		
	}
	rxw.makeHugeEnd();
	   
	rxw.flush(out);
%>