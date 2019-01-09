<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1455_l.jsp
* 기능       : 독자정보관리(기존독자 카운트)
*              (전화번호, 휴대폰번호, 우편번호+상세주소+동+호+번지, 주민등록번호, 이메일)-onblur시
*              ->(독자명 onblur시)
*              ->(휴대폰번호 세번째 element에서 enter 입력시)
*              ->(주민등록번호에서 enter 입력시)
* 작성일자   : 2004-04-06
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-31
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_RDR_DUP_CHKDataSet ds = (SL_L_RDR_DUP_CHKDataSet)request.getAttribute("ds");

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	rxw.add(resTemp, "chkcnt", ds.chkcnt);
	
	rxw.flush(out);
%>
