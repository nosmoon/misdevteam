<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_brmgr_1891_s.jsp
* 기능 	 	 : 판매국-아파트투입률(투입률계산)
* 작성일자 	 : 2006-03-11
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// dataset 인스턴스 선언부분
    SL_L_COMM_THRW_RATEDataSet ds = (SL_L_COMM_THRW_RATEDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	int mediThrwRateOutForm = rxw.add(resTemp, "mediThrwRateOutForm", "");
	
	rxw.add(mediThrwRateOutForm, "ccnt", ds.c_cnt);
	rxw.add(mediThrwRateOutForm, "crate", ds.c_rate);
	rxw.add(mediThrwRateOutForm, "jcnt", ds.j_cnt);
	rxw.add(mediThrwRateOutForm, "jrate", ds.j_rate);
	rxw.add(mediThrwRateOutForm, "dcnt", ds.d_cnt);
	rxw.add(mediThrwRateOutForm, "drate", ds.d_rate);
	rxw.add(mediThrwRateOutForm, "ocnt", ds.o_cnt);
	rxw.add(mediThrwRateOutForm, "orate", ds.o_rate);
	
	rxw.flush(out);
%>
