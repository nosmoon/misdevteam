<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1101_a.jsp
* 기능     : 확장독자관리
* 작성일자 : 2004-02-25
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_rdr_1126_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //오늘날짜
    String toDate      = Util.getDate2();

    //dataset 인스턴스 선언부분
	PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    //확장독자정보 dataset
    PS_S_RDR_EXTNRDREXTNINFOCURRecord rdrextninfocurRec = null;
    boolean  rdrChk = false;            //확장독자 데이타 유무체크

    if (ds.rdrextninfocur.size() > 0) {
        rdrextninfocurRec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)ds.rdrextninfocur.get(0);
        rdrChk  =  true;
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "defaultDate", Util.getDate());
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "mcCombo2"); // 신청매체
    rxw.makeDataToList(ds, "acqclsfcur", "cicdnm", "cicodeval", "선택", "", initTemp, "acqclsfCombo"); // 수취구분
    rxw.makeDataToList(ds, "rcpmmthdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "rcpmmthdCombo"); // 납부방법
    rxw.makeDataToList(ds, "rshpclsfcdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "rshpclsfcdCombo"); // 신청인과관계
    rxw.makeDataToList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "resiclsfcdCombo"); // 주거구분
    rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "resitypecdCombo"); // 주거형태
    rxw.makeDataToList(ds, "rdr_extnclsfcdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "extnclsfcdCombo"); // 확장구분
    //System.out.println(rxw.getXml());
	rxw.flush(out);
%>

