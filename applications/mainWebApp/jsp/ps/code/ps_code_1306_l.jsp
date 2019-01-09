<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1306_l.jsp
* 기능 : 보너스북관리 리스트
* 작성일자 : 2004-01-12
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1306_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_BNSBKDataSet ds = (PS_L_BNSBKDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
    //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		PS_L_BNSBKCURCOMMLISTRecord rec = (PS_L_BNSBKCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("remk_detail");
			rxw.add_ColVal("vipcont_detail");
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		String str4 = Util.convertS(rec.getBgnvdtydt());    //적용시작일자
        String str5 = Util.convertS(rec.getEndvdtydt());	//적용마지막일자
        String str6 = Util.replace(Util.checkString(Util.convertNull(rec.getVipcont(),"")),"&nbsp;","");    //주요내용
        String str7 = Util.replace(Util.checkString(Util.convertNull(rec.getRemk(),"")), "&nbsp;", "");
               	
		//데이터 추가.
		rxw.add_ColVal(str4 + " ~ "+ str5 + " " + str7);
		rxw.add_ColVal(str6);
        
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>