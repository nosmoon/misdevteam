<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1720_s.jsp
* 기능 : 지국지원-관할지국조정-상세
* 작성일자 : 2004-03-19
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-20
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	SS_S_RDR_MOVMWORKDataSet ds = (SS_S_RDR_MOVMWORKDataSet)request.getAttribute("ds");
	String comscd = Util.checkString(request.getParameter("comscd"));

    //int dstcListCount = 10;	// 구역 정보 iframe에서 한 프레임당 보여지는 항목 수
    //int mediListCount = 9;	// 매체 정보 iframe에서 한 프레임당 보여지는 항목 수
    int dstcListCount = 5000;
    int mediListCount = 5000;

    //request process
    String acptBonm = Util.Uni2Ksc(Util.checkString(request.getParameter("acptbonm")));  //인수지국명
    String trsfBonm = Util.Uni2Ksc(Util.checkString(request.getParameter("trsfbonm")));  //인계지국명
    String basidt = Util.checkString(request.getParameter("basidt"));      //조정기준일자
    
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
        
		//title 추가.
		if(i == 0)
		{ 
			rxw.add_ColVal("sum");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlist2Rec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(curcommlist2Rec.valqty + curcommlist2Rec.pre_valqty + curcommlist2Rec.no_valqty);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlist2Rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>