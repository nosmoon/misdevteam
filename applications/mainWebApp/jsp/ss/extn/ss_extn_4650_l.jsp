<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4650_l.jsp
* 기능 : 확장결과 조회
* 작성일자 : 2016-02-18
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4650_LDataSet ds = (SS_SLS_EXTN_4650_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	//rxw.makeDataToBulk(ds, "curmodlist", resTemp, "listGrid");
    
    //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
    rxw.makeHugeStart(resTemp, "listGrid", ds.curextnlist.size());

	for(int i=0; i < ds.curextnlist.size() ; i++)
	{
		SS_SLS_EXTN_4650_LCUREXTNLISTRecord rec = (SS_SLS_EXTN_4650_LCUREXTNLISTRecord)ds.curextnlist.get(i);
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.add(resTemp, "qty_100y", Util.comma(ds.getQty_100y())); // 조선닷컴
    rxw.add(resTemp, "qty_100n", Util.comma(ds.getQty_100n())); // 총부수
    rxw.add(resTemp, "qty_00", Util.comma(ds.getQty_00())); // 총건수
    rxw.add(resTemp, "totqty", Util.comma(ds.getTotqty())); // 총건수
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


