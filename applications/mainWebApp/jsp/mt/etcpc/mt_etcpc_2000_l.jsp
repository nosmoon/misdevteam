<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcpc.rec.*
	,	chosun.ciis.mt.etcpc.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCPC_2000_LDataSet ds = (MT_ETCPC_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_2000_LCURLIST1Record rec = (MT_ETCPC_2000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");    
			
			rx.add(record, "mchn_mang_no", rec.mchn_mang_no);    //기기관리번호
            rx.add(record, "modl_nm", rec.modl_mang_no+" "+rec.modl_nm);              //모델명
			rx.add(record, "serl_no", rec.serl_no);              //시리얼번호
			rx.add(record, "buy_dt", rec.buy_dt);                //구매일자
			rx.add(record, "use_pers_flnm", rec.use_pers_flnm);  //사용자성명
			rx.add(record, "use_deptcdnm", rec.use_dept_nm);  //사용부서+부서명
			rx.add(record, "pay_kind_cdnm", rec.pay_kind_nm);   //지급종류명
			rx.add(record, "pay_dt", rec.pay_dt);                //지급일자
			rx.add(record, "mchn_stat_nm", rec.mchn_stat_nm);  //기기상태명
			rx.add(record, "kep_plac_nm", rec.kep_plac_nm);      //보관장소명
			rx.add(record, "rsrt_dt", rec.rsrt_dt);              //반납일자
			rx.add(record, "wste_dd_pers", rec.wste_dd_pers);    //폐기일자
			rx.add(record, "remk", rec.remk);                    //비고
			
			rx.add(record, "cmpy_cd", rec.cmpy_cd);              //회사코드    
			rx.add(record, "modl_mang_no", rec.modl_mang_no);    //모델관리번호
			rx.add(record, "aset_no", rec.aset_no);              //자산번호
			rx.add(record, "use_pers", rec.use_pers);            //사용자
			rx.add(record, "use_deptcd", rec.use_deptcd);        //사용자부서코드
			rx.add(record, "use_usag", rec.use_usag);            // 사용용도
			rx.add(record, "pay_kind", rec.pay_kind);            //지급종류
			rx.add(record, "mchn_stat", rec.mchn_stat);          //기기상태
			rx.add(record, "kep_plac", rec.kep_plac);            //보관장소
			rx.add(record, "acpt_dt", rec.acpt_dt);              //인수일자
			rx.add(record, "monitor_mang_no", rec.monitor_mang_no);//모니터관리번호
			rx.add(record, "repa_item_yn", rec.repa_item_yn);    //보수정비품목여부
			rx.add(record, "wste_obj_item_yn", rec.wste_obj_item_yn);//폐기대상상품목여부
			rx.add(record, "lend_item_rsrt_plan_dt", rec.lend_item_rsrt_plan_dt);//반납예정일자
			rx.add(record, "lend_item_yn", rec.lend_item_yn);    //대여품여부 
            rx.add(record, "ipaddr", rec.ipaddr);
		
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<mchn_mang_no/>
			<modl_mang_no/>
			<serl_no/>
			<buy_dt/>
			<aset_no/>
			<use_pers/>
			<use_pers_flnm/>
			<use_deptcd/>
			<use_dept_nm/>
			<use_usag/>
			<pay_dt/>
			<pay_kind/>
			<mchn_stat/>
			<kep_plac/>
			<acpt_dt/>
			<rsrt_dt/>
			<wste_dd_pers/>
			<monitor_mang_no/>
			<repa_item_yn/>
			<wste_obj_item_yn/>
			<lend_item_rsrt_plan_dt/>
			<lend_item_yn/>
			<remk/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Mar 22 11:30:16 KST 2009 */ %>