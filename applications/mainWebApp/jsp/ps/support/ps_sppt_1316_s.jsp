<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1316_s.jsp
* 기능 : 이사처리내역 상세조회
* 작성일자 : 2005-02-15
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-17
* 백업파일명 : ps_sspt_1316_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%

    String lo_empno     = Util.getSessionParameterValue(request, "emp_no", true);       //사원번호
    String lo_kflnm     = Util.getSessionParameterValue(request, "emp_nm", true);         //사원명

    // dataset 인스턴스 선언부분
    PS_S_MOVM_RDRDataSet ds = (PS_S_MOVM_RDRDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "rdrnm", ds.getRdrnm());
    rxw.add(acctTemp, "rdrtel_no1", ds.getRdrtel_no1());
    rxw.add(acctTemp, "rdrtel_no2", ds.getRdrtel_no2());
    rxw.add(acctTemp, "rdrtel_no3", ds.getRdrtel_no3());
    rxw.add(acctTemp, "bocdnm", ds.getAcptbonm());
    rxw.add(acctTemp, "rdrbocd", ds.getAcptbocd());
    rxw.add(acctTemp, "medinm", ds.getMedinm());
    rxw.add(acctTemp, "rdr_no", ds.getRdr_no());
    rxw.add(acctTemp, "medicd", ds.getMedicd());
    rxw.add(acctTemp, "addr_all", ds.getAddr() + ds.getDtlsaddr());

	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
