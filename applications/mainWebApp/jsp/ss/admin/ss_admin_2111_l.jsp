<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_2111_l.jsp
* 기능 : 기준정보관리-모바일관리-모바일관리-로그인이력리스트_모바일용
* 작성일자 : 2017-07-11
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

	RwXml rx = new RwXml();
	SS_MO_L_LOGINHISTDataSet ds = (SS_MO_L_LOGINHISTDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int formData = 0;
	int listGrid2 = 0;
	int record = 0;

	formData  = rx.add(root , "tab2form" , "");

	try {


		listGrid2  = rx.add(formData , "listGrid2" , "");
		for(int i = 0; i < ds.histlist.size(); i++) {
			SS_MO_L_LOGINHISTHISTLISTRecord rec = (SS_MO_L_LOGINHISTHISTLISTRecord)ds.histlist.get(i);

			record = rx.add(listGrid2, "record", "");
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "bonm", rec.bonm);
			rx.add(record, "boemp_id", rec.sso_id);
			rx.add(record, "flnm", rec.sso_nm);
			rx.add(record, "login_dt", rec.log_dt);
		}


	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>