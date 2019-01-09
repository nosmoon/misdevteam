<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1325_e.jsp
* 기능 		 : 독자정보관리(중지팝업)(초기화)
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-02
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_E_SUBS_CNTR_STOP_INIDataSet ds = (SL_E_SUBS_CNTR_STOP_INIDataSet)request.getAttribute("ds");  // request dataset
    	
   	//TrustForm 처리.
   	RwXmlWrapper rxw = new RwXmlWrapper();
   	int root = RwXmlWrapper.rootNodeID;
   	int resTemp = rxw.add(root, "resTemp", "");
   	
   	rxw.add(resTemp, "suspFlag", String.valueOf(!(ds.readercur.size() > 0)));

   	if(ds.readercur.size() > 0){ //중지독자가 아니라면
    	 
   		//1. 독자정보
   		int readerInfo = rxw.add(resTemp, "readerInfo", "");
   	
   		SL_E_SUBS_CNTR_STOP_INIREADERCURRecord readercurRec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)ds.readercur.get(0);
   		rxw.add(readerInfo, "rdr_no", readercurRec.rdr_no);
   		rxw.add(readerInfo, "rdrnm", readercurRec.rdrnm);
   		rxw.add(readerInfo, "rdrtel_no", Util.getChainStr(readercurRec.rdrtel_no1, readercurRec.rdrtel_no2, readercurRec.rdrtel_no3, "-"));
   		StringBuffer sb  = new StringBuffer("");
        if( !"".equals(readercurRec.dlvzip) && readercurRec.dlvzip.trim().length() == 6){
            sb.append(readercurRec.dlvzip.substring(0, 3));
            sb.append("-");
            sb.append(readercurRec.dlvzip.substring(3, 6));
        }
        sb.append(" " + readercurRec.dlvaddr );
        sb.append(" " + readercurRec.dlvdtlsaddr );
        sb.append(" " + readercurRec.dlvdong );
        sb.append(" " + readercurRec.dlvser_no);
        sb.append(" " + readercurRec.dlvbnji );
   		rxw.add(readerInfo, "addr", sb);
   		
   		//중지유형
   		rxw.makeDataToBulkList(ds, "susptypecdcur", "cicdnm", "cicodeval", readerInfo, "susptypeCombo");
   		
   		//중지일자
   		rxw.add(readerInfo, "suspdt", Util.getDate());
   		
   		//중지사유
   		rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", readerInfo, "suspresncdCombo");
   		//중지사유 타신문구독.
   		rxw.makeHugeListStart(readerInfo, "remkCombo");
   		rxw.addHugeListItem("", "");
   		rxw.addHugeListItem("중앙일보", "중앙일보");
   		rxw.addHugeListItem("동아일보", "동아일보");
   		rxw.addHugeListItem("한겨레", "한겨레");
   		rxw.addHugeListItem("기타", "기타");
   		rxw.makeHugeEnd();
   		
   		//2. 매체계약목록
   		int stopObj = rxw.add(resTemp, "stopObj", "");
   		
   		//처리플래그
   		rxw.add(stopObj, "susptype", "20");
   		
   		//목록 freeyn에 의해 freeclsf를 선택할 수 있는 대상이 틀려짐. trustform UI에서는 이를 지원하지 않으므로 아예 freeclsf값을 변경함.
   		//rxw.makeDataToBulk(ds, "objcur", stopObj, "stopObjGrid");
   		rxw.makeHugeStart(stopObj, "stopObjGrid", ds.objcur.size());
   		SL_E_SUBS_CNTR_STOP_INIOBJCURRecord objcurRec = null;
   		for(int i=0; i<ds.objcur.size(); i++){
   			objcurRec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)ds.objcur.get(i);
   	        
   			//title 추가.
   			if(i == 0)
   			{
   				rxw.add_ColVal("idx");
   				rxw.add_ColVal("freeclsf");
   				rxw.add_ColVal("orgqty");
   				//나머지 필드는 자동 생성.
   				rxw.makeRecordToBulkTitle(objcurRec);
   			}
   			
   			//데이터 추가.
   			rxw.add_ColVal("Y");	//모든 체크박스를 default로 체크.
   			rxw.add_ColVal("Y".equals(objcurRec.freeyn) ? objcurRec.freeclsf : "");
   			rxw.add_ColVal(objcurRec.qty);
   			//나머지 필드 자동생성.
   			rxw.makeRecordToBulk(objcurRec, false);
   		}
   		rxw.makeHugeEnd();
   		
   		//무료구분
   		rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", stopObj, "freeclsfCombo");
   	}
   	
   	rxw.flush(out);
%>

