<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_2112_l.jsp
* 기능 : 기준정보관리-모바일관리-모바일관리-기기변경,휴대번호변경이력리스트_모바일용
* 작성일자 : 2017-07-13
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
	SS_MO_L_MODIHISTDataSet ds = (SS_MO_L_MODIHISTDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int formData = 0;
	int listGrid3 = 0;
	int listGrid4 = 0;
	int record = 0;

	formData  = rx.add(root , "tab3form" , "");

	try {

		//휴대폰번호 변경 이력
		listGrid3  = rx.add(formData , "listGrid3" , "");
		for(int i = 0; i < ds.ptphmodicur.size(); i++) {
			SS_MO_L_MODIHISTPTPHMODICURRecord rec = (SS_MO_L_MODIHISTPTPHMODICURRecord)ds.ptphmodicur.get(i);

			record = rx.add(listGrid3, "record", "");
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "bonm", rec.bonm);
			rx.add(record, "boemp_no", rec.boemp_no);
			rx.add(record, "chgno", rec.chgno);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "chgincmgdt", rec.chgincmgdt);
			rx.add(record, "chgincmgpers", rec.chgincmgpers);
			rx.add(record, "chgincmgnm", rec.chgincmgnm);
			rx.add(record, "bf_ptphno", rec.bf_ptphno);
			rx.add(record, "af_ptphno", rec.af_ptphno);
			rx.add(record, "chgincmgremk", rec.chgincmgremk);
			rx.add(record, "rnum", rec.rnum);

		}

		//기기 변경 이력
		listGrid4  = rx.add(formData , "listGrid4" , "");
		for(int i = 0; i < ds.dvsmodicur.size(); i++) {
			SS_MO_L_MODIHISTDVSMODICURRecord rec = (SS_MO_L_MODIHISTDVSMODICURRecord)ds.dvsmodicur.get(i);

			record = rx.add(listGrid4, "record", "");
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "bonm", rec.bonm);
			rx.add(record, "boemp_no", rec.boemp_no);
			rx.add(record, "chgno", rec.chgno);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "chgincmgdt", rec.chgincmgdt);
			rx.add(record, "chgincmgpers", rec.chgincmgpers);
			rx.add(record, "chgincmgnm", rec.chgincmgnm);
			rx.add(record, "bf_dvsid", rec.bf_dvsid);
			rx.add(record, "af_dvsid", rec.af_dvsid);
			rx.add(record, "chgincmgremk", rec.chgincmgremk);
			rx.add(record, "rnum", rec.rnum);
		}


	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>