<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6211_SDataSet ds = (FC_ACCT_6211_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resData = rx.add(root, "resData", "");
	int resForm = 0;
	try {

		resForm = rx.add(resData,"resForm","");
		rx.add(resForm,"erplace_cd" ,ds.erplace_cd );
		rx.add(resForm,"data_cnt"   ,ds.data_cnt   );
		rx.add(resForm,"vat_fr_yymm",ds.vat_fr_yymm);
		rx.add(resForm,"vat_to_yymm",ds.vat_to_yymm);
		rx.add(resForm,"clos_yn"    ,ds.clos_yn    );
		
		//과세표준 매출세액
		rx.add(resForm,"ma_amt_01"  ,ds.ma_amt_01  );
		rx.add(resForm,"ma_vat_01"  ,ds.ma_vat_01  );
		rx.add(resForm,"ma_amt_02"  ,ds.ma_amt_02  );
		rx.add(resForm,"ma_vat_02"  ,ds.ma_vat_02  );
		rx.add(resForm,"ma_amt_03"  ,ds.ma_amt_03  );
		rx.add(resForm,"ma_vat_03"  ,ds.ma_vat_03  );
		rx.add(resForm,"ma_amt_04"  ,ds.ma_amt_04  );
		rx.add(resForm,"ma_vat_04"  ,ds.ma_vat_04  );
		rx.add(resForm,"ma_amt_05"  ,ds.ma_amt_05  );
		rx.add(resForm,"ma_amt_06"  ,ds.ma_amt_06  );
		rx.add(resForm,"ma_amt_07"  ,ds.ma_amt_07  );
		rx.add(resForm,"ma_vat_07"  ,ds.ma_vat_07  );
		rx.add(resForm,"ma_amt_08"  ,ds.ma_amt_08  );
		rx.add(resForm,"ma_vat_08"  ,ds.ma_vat_08  );
		rx.add(resForm,"ma_amt_09"  ,ds.ma_amt_09  );
		rx.add(resForm,"ma_vat_09"  ,ds.ma_vat_09  );
		
		//매입 세액
		rx.add(resForm,"mb_amt_10"  ,ds.mb_amt_10  );
		rx.add(resForm,"mb_vat_10"  ,ds.mb_vat_10  );
		rx.add(resForm,"mb_amt_11"  ,ds.mb_amt_11  );
		rx.add(resForm,"mb_vat_11"  ,ds.mb_vat_11  );
		rx.add(resForm,"mb_amt_12"  ,ds.mb_amt_12  );
		rx.add(resForm,"mb_vat_12"  ,ds.mb_vat_12  );
		rx.add(resForm,"mb_amt_13"  ,ds.mb_amt_13  );
		rx.add(resForm,"mb_vat_13"  ,ds.mb_vat_13  );
		rx.add(resForm,"mb_amt_14"  ,ds.mb_amt_14  );
		rx.add(resForm,"mb_vat_14"  ,ds.mb_vat_14  );
		rx.add(resForm,"mb_amt_15"  ,ds.mb_amt_15  );
		rx.add(resForm,"mb_vat_15"  ,ds.mb_vat_15  );
		rx.add(resForm,"mb_amt_16"  ,ds.mb_amt_16  );
		rx.add(resForm,"mb_vat_16"  ,ds.mb_vat_16  );
		rx.add(resForm,"mb_amt_17"  ,ds.mb_amt_17  );
		rx.add(resForm,"mb_vat_17"  ,ds.mb_vat_17  );
		rx.add(resForm,"mb_vat_17_d",ds.mb_vat_17_d);
		
		//경감 공제 세액
		rx.add(resForm,"mc_vat_18"  ,ds.mc_vat_18  );
		rx.add(resForm,"mc_amt_19"  ,ds.mc_amt_19  );
		rx.add(resForm,"mc_vat_19"  ,ds.mc_vat_19  );
		rx.add(resForm,"mc_vat_20"  ,ds.mc_vat_20  );
		rx.add(resForm,"mc_vat_21"  ,ds.mc_vat_21  );
		rx.add(resForm,"mc_vat_22"  ,ds.mc_vat_22  );
		rx.add(resForm,"mc_vat_23"  ,ds.mc_vat_23  );
		rx.add(resForm,"mc_vat_24"  ,ds.mc_vat_24  );
		rx.add(resForm,"mc_vat_25"  ,ds.mc_vat_25  );
		
		//(26)
		rx.add(resForm,"md_vat_26", "0");
		rx.add(resForm,"md_vat_26_b",ds.md_vat_26_b);
	
		//합계
		rx.add(resForm,"me_amt_31"  ,ds.me_amt_31  );

		//(7)
		rx.add(resForm,"mg_amt_32"  ,ds.mg_amt_32  );
		rx.add(resForm,"mg_vat_32"  ,ds.mg_vat_32  );
		rx.add(resForm,"mg_amt_33"  ,ds.mg_amt_33  );
		rx.add(resForm,"mg_vat_33"  ,ds.mg_vat_33  );
		rx.add(resForm,"mg_amt_34"  ,ds.mg_amt_34  );
		rx.add(resForm,"mg_amt_35"  ,ds.mg_amt_35  );
		rx.add(resForm,"mg_amt_36"  ,ds.mg_amt_36  );
		rx.add(resForm,"mg_vat_36"  ,ds.mg_vat_36  );

		//(12)
		rx.add(resForm,"mg_amt_37"  ,ds.mg_amt_37  );
		rx.add(resForm,"mg_vat_37"  ,ds.mg_vat_37  );
		rx.add(resForm,"mg_amt_38"  ,ds.mg_amt_38  );
		rx.add(resForm,"mg_vat_38"  ,ds.mg_vat_38  );
		rx.add(resForm,"mg_amt_39"  ,ds.mg_amt_39  );
		rx.add(resForm,"mg_vat_39"  ,ds.mg_vat_39  );

		//(14)
		rx.add(resForm,"mh_amt_40"  ,ds.mh_amt_40  );
		rx.add(resForm,"mh_vat_40"  ,ds.mh_vat_40  );
		rx.add(resForm,"mh_amt_41"  ,ds.mh_amt_41  );
		rx.add(resForm,"mh_vat_41"  ,ds.mh_vat_41  );
		rx.add(resForm,"mh_amt_42"  ,ds.mh_amt_42  );
		rx.add(resForm,"mh_vat_42"  ,ds.mh_vat_42  );
		rx.add(resForm,"mh_amt_43"  ,ds.mh_amt_43  );
		rx.add(resForm,"mh_vat_43"  ,ds.mh_vat_43  );
		rx.add(resForm,"mh_amt_44"  ,ds.mh_amt_44  );
		rx.add(resForm,"mh_vat_44"  ,ds.mh_vat_44  );
		rx.add(resForm,"mh_vat_45"  ,ds.mh_vat_45  );
		rx.add(resForm,"mh_vat_46"  ,ds.mh_vat_46  );
		rx.add(resForm,"mh_vat_47"  ,ds.mh_vat_47  );
		rx.add(resForm,"mh_amt_48"  ,ds.mh_amt_48  );
		rx.add(resForm,"mh_vat_48"  ,ds.mh_vat_48  );

		//(16)
		rx.add(resForm,"mi_amt_49"  ,ds.mi_amt_49  );
		rx.add(resForm,"mi_vat_49"  ,ds.mi_vat_49  );
		rx.add(resForm,"mi_amt_50"  ,ds.mi_amt_50  );
		rx.add(resForm,"mi_vat_50"  ,ds.mi_vat_50  );
		rx.add(resForm,"mi_amt_51"  ,ds.mi_amt_51  );
		rx.add(resForm,"mi_vat_51"  ,ds.mi_vat_51  );
		rx.add(resForm,"mi_amt_52"  ,ds.mi_amt_52  );
		rx.add(resForm,"mi_vat_52"  ,ds.mi_vat_52  );

		//(18)
		rx.add(resForm,"mj_vat_53"  ,ds.mj_vat_53  );
		rx.add(resForm,"mj_vat_54"  ,ds.mj_vat_54  );
		rx.add(resForm,"mj_vat_55"  ,ds.mj_vat_55  );
		rx.add(resForm,"mj_vat_56"  ,ds.mj_vat_56  );
		rx.add(resForm,"mj_vat_57"  ,ds.mj_vat_57  );
		rx.add(resForm,"mj_vat_58"  ,ds.mj_vat_58  );
				
		//(26)
		rx.add(resForm,"mk_amt_59"  ,ds.mk_amt_59  );
		rx.add(resForm,"mk_vat_59"  ,ds.mk_vat_59  );
		rx.add(resForm,"mk_amt_60"  ,ds.mk_amt_60  );
		rx.add(resForm,"mk_vat_60"  ,ds.mk_vat_60  );
		rx.add(resForm,"mk_amt_61"  ,ds.mk_amt_61  );
		rx.add(resForm,"mk_vat_61"  ,ds.mk_vat_61  );
		rx.add(resForm,"mk_amt_62"  ,ds.mk_amt_62  );
		rx.add(resForm,"mk_vat_62"  ,ds.mk_vat_62  );
		rx.add(resForm,"mk_amt_63"  ,ds.mk_amt_63  );
		rx.add(resForm,"mk_vat_63"  ,ds.mk_vat_63  );
		rx.add(resForm,"mk_amt_64"  ,ds.mk_amt_64  );
		rx.add(resForm,"mk_vat_64"  ,ds.mk_vat_64  );
		rx.add(resForm,"mk_amt_65"  ,ds.mk_amt_65  );
		rx.add(resForm,"mk_vat_65"  ,ds.mk_vat_65  );
		rx.add(resForm,"mk_amt_66"  ,ds.mk_amt_66  );
		rx.add(resForm,"mk_vat_66"  ,ds.mk_vat_66  );
		rx.add(resForm,"mk_amt_67"  ,ds.mk_amt_67  );
		rx.add(resForm,"mk_vat_67"  ,ds.mk_vat_67  );
		rx.add(resForm,"mk_amt_68"  ,ds.mk_amt_68  );
		rx.add(resForm,"mk_vat_68"  ,ds.mk_vat_68  );
		rx.add(resForm,"mk_amt_69"  ,ds.mk_amt_69  );
		rx.add(resForm,"mk_vat_69"  ,ds.mk_vat_69  );
		rx.add(resForm,"mk_amt_70"  ,ds.mk_amt_70  );
		rx.add(resForm,"mk_vat_70"  ,ds.mk_vat_70  );
		rx.add(resForm,"mk_amt_71"  ,ds.mk_amt_71  );
		rx.add(resForm,"mk_vat_71"  ,ds.mk_vat_71  );
		rx.add(resForm,"mk_amt_72"  ,ds.mk_amt_72  );
		rx.add(resForm,"mk_vat_72"  ,ds.mk_vat_72  );
		rx.add(resForm,"mk_amt_73"  ,ds.mk_amt_73  );
		rx.add(resForm,"mk_vat_73"  ,ds.mk_vat_73  );
		rx.add(resForm,"mk_amt_74"  ,ds.mk_amt_74  );
		rx.add(resForm,"mk_vat_74"  ,ds.mk_vat_74  );
		rx.add(resForm,"mk_amt_75"  ,ds.mk_amt_75  );
		rx.add(resForm,"mk_vat_75"  ,ds.mk_vat_75  );
		rx.add(resForm,"mk_amt_76"  ,ds.mk_amt_76  );
		rx.add(resForm,"mk_vat_76"  ,ds.mk_vat_76  );
		rx.add(resForm,"mk_vat_77"  ,ds.mk_vat_77  );	

		
		/****** CUR_VATDECLSTMT_LIST_2 BEGIN */
		int gridData = rx.add(resData,"gridData","");
		recordSet = rx.add(gridData, "CURLIST2", "");

		for(int i = 0; i < ds.cur_vatdeclstmt_list_2.size(); i++) {
			FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record rec = (FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_2Record)ds.cur_vatdeclstmt_list_2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "form_no", rec.form_no);
			rx.add(record, "form_nm", rec.form_nm);
			rx.add(record, "make_yn", rec.make_yn);
		}
		rx.add(recordSet, "totalcnt", ds.cur_vatdeclstmt_list_2.size());
		/****** CUR_VATDECLSTMT_LIST_2 END */

		/****** CUR_VATDECLSTMT_LIST_1 BEGIN */
		recordSet = rx.add(gridData, "CURLIST1", "");

		for(int i = 0; i < ds.cur_vatdeclstmt_list_1.size(); i++) {
			FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record rec = (FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "prof_type_cdnm", rec.prof_type_cdnm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
		}
		rx.add(recordSet, "totalcnt", ds.cur_vatdeclstmt_list_1.size());
		/****** CUR_VATDECLSTMT_LIST_1 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6211_s>
	<dataSet>
		<CUR_VATDECLSTMT_LIST_2>
			<record>
				<form_no/>
				<form_nm/>
				<make_yn/>
			</record>
		</CUR_VATDECLSTMT_LIST_2>
	</dataSet>
</fc_acct_6211_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6211_s>
	<dataSet>
		<CUR_VATDECLSTMT_LIST_1>
			<record>
				<prof_type_cd/>
				<prof_type_cdnm/>
				<suply_amt/>
				<vat_amt/>
			</record>
		</CUR_VATDECLSTMT_LIST_1>
	</dataSet>
</fc_acct_6211_s>
*/
%>

<% /* 작성시간 : Wed Jun 18 18:51:49 KST 2014 */ %>