<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4620_l.jsp
* 기능 : 수정모드 조회
* 작성일자 : 2016-02-17
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SE_BOI_2910_LDataSet ds = (SE_BOI_2910_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	//rxw.makeDataToBulk(ds, "curmodlist", resTemp, "listGrid");
    
    //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
    rxw.makeHugeStart(resTemp, "gridData", ds.curlist.size());

	for(int i=0; i < ds.curlist.size() ; i++)
	{
		SE_BOI_2910_LCURLISTRecord rec = (SE_BOI_2910_LCURLISTRecord)ds.curlist.get(i);
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
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


