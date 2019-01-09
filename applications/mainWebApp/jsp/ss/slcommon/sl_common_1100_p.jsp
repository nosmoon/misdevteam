<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_common_1100_p.jsp
* 기능       : 독자 상세 조회 팝업
* 작성일자   : 2003-12-09
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    String code = "";
    String name = "";
    String firstDlvdstccd = ""; //최초구역코드
    StringBuffer sb_dstc = new StringBuffer("");

    SL_L_DSTCINFOCDDataSet ds = (SL_L_DSTCINFOCDDataSet)request.getAttribute("ds");

  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	int searchDstcCombo = rxw.add(resTemp, "searchDstcCombo", "");
	SL_L_DSTCINFOCDDSTCINFOCURRecord dstcinfocurRec  = null;
    for(int i=0; i<ds.dstcinfocur.size(); i++){
        dstcinfocurRec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)ds.dstcinfocur.get(i);
        code = dstcinfocurRec.dstccd;
        name = dstcinfocurRec.dstccd;

        if(i==0) firstDlvdstccd = code;
        
        int item = rxw.add(searchDstcCombo, "item", "");
        rxw.add(item, "label", name+":"+dstcinfocurRec.dstcnm);
    	rxw.add(item, "value", code);
    	rxw.add(item, "cdnm", dstcinfocurRec.dstcnm);
    	rxw.add(item, "teamcd", dstcinfocurRec.teamcd);
    }
    
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(resTemp, "firstDlvdstccd", firstDlvdstccd);
	
	rxw.flush(out);
	
%>

