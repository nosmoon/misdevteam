<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : pb_common_1811_l.jsp
* 기능     : 공통 우편번호 검색 (우편번호 입력 의한 검색)
* 작성일자 : 2004-01-30
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 : TrustForm 대응
* 수정자 	 : 황성진
* 수정일자 	 : 2009-02-11
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	//우편 및 주소검색 위치 - trustform에서 필요 없음.
    //String zipseq = Util.Uni2Ksc(Util.checkString(request.getParameter("zipseq")));

    //getting dataset
	CO_L_ZIP_BRANCHDataSet ds = (CO_L_ZIP_BRANCHDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "zipGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_L_ZIP_BRANCHCURCOMMLISTRecord rec = (CO_L_ZIP_BRANCHCURCOMMLISTRecord)ds.curcommlist.get(0);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("zip1");
			rxw.add_ColVal("zip2");
			rxw.add_ColVal("zip3");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//데이터 추가.
		String zip1 = "";
		String zip2 = "";
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
	    	zip1 = rec.zip.substring(0, 3);
	    	zip2 = rec.zip.substring(3, 6);
	    }
		
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>