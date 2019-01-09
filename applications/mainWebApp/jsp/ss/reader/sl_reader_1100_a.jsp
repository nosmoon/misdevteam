<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1100_a.jsp
* 기능       : 독자정보관리(독자정보 초기화)
* 작성일자   : 2003-11-09
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-11
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//  독자검색 페이지로부터 분기하므로, request로부터 rdr_no 값을 얻는다.
	String rdr_no = request.getParameter("rdr_no");
    String find_type = "";

    if( request.getParameter("find_type") != null ) {
      find_type = request.getParameter("find_type");
    }
    SL_E_READERINIDataSet ds = (SL_E_READERINIDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int useData = rxw.add(root, "useData", "");
	
	//1. 변수값.
	rxw.add(useData, "bocd", Util.getSessionParameterValue(request, "bocd", true));			//각종 동작 script에서 사용.
	rxw.add(useData, "find_type", find_type);												//onload시 조회여부 판단.
	rxw.add(useData, "rdr_no", rdr_no);														//onload시 조회에 사용.
	rxw.add(useData, "firstDlvdstccd", ds.dstcinfocur.size()>0 ? ((SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(0)).dstccd : "");
	rxw.add(useData, "firstMediUprc", ds.bomedicdcur.size()>0 ? ((SL_E_READERINIBOMEDICDCURRecord)ds.bomedicdcur.get(0)).subsuprc : 0);
	rxw.add(useData, "today", Util.getDate());
	rxw.add(useData, "rptvvalmm", Util.addMonth(ds.curryymm + "01", 1).substring(0, 6));
	
	//2. ds 전체 데이터. bo_tel1
	rxw.makeDataToBulk(ds, useData, "dsData");
	
	//3. 독자상세 영역의 combo
	int detailArea = rxw.add(useData, "detailArea", "");
	
	//구역. dstccd필드를 label, value에 모두 사용. attribute: cdnm=dstcnm, teamcd=teamcd 로 가지고 있는 형식. 일단 xpath로 접근하는 방법을 사용하기 위해 nodeset으로 return.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", detailArea, "dlvdstccdHiddenCombo");
	int dlvdstccdHidden = rxw.add(detailArea, "dlvdstccdHiddenCombo", "");
	SL_E_READERINIDSTCINFOCURRecord dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        int item = rxw.add(dlvdstccdHidden, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "teamcd", "<![CDATA[" +  dstcinfocurRec.teamcd  + "]]>");
    }
	
	//주소코드(배달지코드). label=addrnm, value=addrcd. attribute: cdnm=addrnm. 빈문자항목 때문에 전체 구성.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	//rxw.makeDataToBulk(ds, "addrcdcur", detailArea, "dlvcdCombo");
	int searchDstc = rxw.add(detailArea, "dlvcdCombo", "");
	int item = rxw.add(searchDstc, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_E_READERINIADDRCDCURRecord addrcdcurRec = null;
    for(int i=0; i<ds.addrcdcur.size(); i++){
        addrcdcurRec = (SL_E_READERINIADDRCDCURRecord)ds.addrcdcur.get(i);
        String code = addrcdcurRec.addrcd;
        String name = addrcdcurRec.addrnm;
        
        item = rxw.add(searchDstc, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  code+":"+name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  addrcdcurRec.addrnm  + "]]>");
    }
	
	//단체구분 (radio). default : "10". 없으면 선택없음.
	//rxw.makeDataToList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	rxw.makeDataToBulkList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	
	//주거형태.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	//rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	rxw.makeDataToBulkList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	
	//주거구분.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	rxw.makeDataToBulkList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "resiclsfcdCombo");
	
	//배달방법 (radio). default : "10" 없으면 선택없음.
	rxw.makeDataToBulkList(ds, "dlvmthdcdcur", "cicdnm", "cicodeval", detailArea, "dlvmthdcdRadio");
	
	//투입장소
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	rxw.makeDataToBulkList(ds, "thrwplaccdcur", "cicdnm", "cicodeval", "", "", detailArea, "thrwPlacCombo");
	
	//지국지사취급매체 
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	int medicd = rxw.add(detailArea, "medicdCombo", "");
	SL_E_READERINIBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_E_READERINIBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "subsuprc", "<![CDATA[" +  subsuprc  + "]]>");
    	rxw.add(item, "medinm", "<![CDATA[" +  name  + "]]>");
    }
	
	//무료부수.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvfreeclsfCombo");
	
	//수금방법.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	rxw.makeDataToBulkList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", detailArea, "clamtmthdcdCombo");
	
	//확장유형. default : "30" 없으면 첫번째
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", detailArea, "rdrExtntypecdCombo");
	
	//중지일자
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvSuspresncdCombo");
	
	//4. 독자조회영역의 combo
	int searchArea = rxw.add(useData, "searchArea", "");
	
	//정보검색의 구역. 위의 동일 데이터 사용. 필드명이 달라 전체구성.
	//"--" 값이 존재할 경우에는 "--"가 selected. 그렇지 않으면 첫번째 selected.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", searchArea, "searchDstcCombo");
	int dlvcd = rxw.add(searchArea, "dstcCombo", "");
	dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        item = rxw.add(dlvcd, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name+":"+dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "teamcd", "<![CDATA[" +  dstcinfocurRec.teamcd  + "]]>");
    }
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>

