<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : sl_common_1300_s.jsp
* 기능 : 공통 - 통합회원 서비스 조회
* 작성일자 : 2006-08-18
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-24
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	CO_S_RDR_SERVICEDataSet ds = (CO_S_RDR_SERVICEDataSet)request.getAttribute("ds");

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int rdrService = rxw.add(resTemp, "rdrService", "");
	//모닝플러스회원
	int record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_morningplus");
	rxw.add(record, "URL", "/images/mp_new3.gif");
	rxw.add(record, "DESC", "모닝플러스회원");
	rxw.add(record, "VISIBLE", ds.getMorningplus().equals("0") ? "false" : "true");
	//SKT모바일기사서비스
	record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_sktmobile");
	rxw.add(record, "URL", "/images/skt2.gif");
	rxw.add(record, "DESC", "SKT모바일기사서비스");
	rxw.add(record, "VISIBLE", ds.getSktsrv().equals("0") ? "false" : "true");
	//IReader구독
	record = rxw.add(rdrService, "record", "");
	rxw.add(record, "ID", "img_ireader");
	rxw.add(record, "URL", "/images/ireader.gif");
	rxw.add(record, "DESC", "IReader구독");
	rxw.add(record, "VISIBLE", ds.getResv1().equals("0") ? "false" : "true");
	
	rxw.flush(out);
%>

