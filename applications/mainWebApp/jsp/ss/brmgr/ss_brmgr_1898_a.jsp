<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2660_a.jsp
* 기능 	 	 : 판매국-지국경영-아파트투입 현황조사 결과보기
* 작성일자 	 : 2004-03-08
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-19
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    //업무환경구분 설정 시작
    Vector jobcdSet = new Vector();
    String jobcd_param = "";
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)    
//	String jobcd = (String)request.getHeader("JOBCD");

    if( jobcd == null ) {
      jobcd = "^";
//      jobcd = "100^280^710^920^950^T15";
    }

	StringTokenizer st = new StringTokenizer(jobcd, "^");
	while(st.hasMoreTokens()){
		jobcdSet.add(st.nextToken());
	}

    for(int i=0; i<jobcdSet.size(); i++){
      jobcd_param = (String)jobcdSet.elementAt(i);
      if( jobcd_param.equals("100") || jobcd_param.equals("302") || jobcd_param.equals("570") ) {
        //전산담당(100), 정보관리(302), 판촉담당(570)
        break;
      } else {
        jobcd_param = "";
      }
    }
    //업무환경구분 설정 끝
    
    //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", request.getParameter("bocd"));
	rxw.add(resTemp, "jobcdset", jobcd_param);
	rxw.add(resTemp, "invsgdt1", Util.getMonth2( -1 ));
	rxw.add(resTemp, "invsgdt2", Util.getDate());
	
	//등록구분1
	rxw.makeEmpytList(resTemp, "regtype1list", "전체", "");
	
	//등록구분2
	rxw.makeEmpytList(resTemp, "regtype2list", "전체", "");
	
	rxw.flush(out);
%>