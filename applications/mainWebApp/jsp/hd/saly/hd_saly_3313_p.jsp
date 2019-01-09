<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_3313_PDataSet ds = (HD_SALY_3313_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_3313_PCURLISTRecord rec = (HD_SALY_3313_PCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yy", rec.yy);
			rx.add(record, "no", rec.no);
			rx.add(record, "dt", rec.dt);
			rx.add(record, "gugcd", rec.gugcd);
			rx.add(record, "gugnm", rec.gugnm);
			rx.add(record, "bunm", rec.bunm);
			rx.add(record, "buseocd", rec.buseocd);
			rx.add(record, "buseonm", rec.buseonm);
			rx.add(record, "jccd2_jg_hobong", rec.jccd2_jg_hobong);
			rx.add(record, "iwgeub", rec.iwgeub);
			rx.add(record, "ybgbg_25", rec.ybgbg_25);
			rx.add(record, "ybjmg_25", rec.ybjmg_25);
			rx.add(record, "gg1tsgy", rec.gg1tsgy);
			rx.add(record, "gg1bggy", rec.gg1bggy);
			rx.add(record, "gbbgggg", rec.gbbgggg);
			rx.add(record, "gbjmgeub", rec.gbjmgeub);
			rx.add(record, "sabeon", rec.sabeon);
			rx.add(record, "name", rec.name);
			rx.add(record, "bw", rec.bw);
			rx.add(record, "soin", rec.soin);
			rx.add(record, "noin", rec.noin);
			rx.add(record, "kro", rec.kro);
			rx.add(record, "jae", rec.jae);
			rx.add(record, "jhgbsd", rec.jhgbsd);
			rx.add(record, "jhbssd", rec.jhbssd);
			rx.add(record, "bjhilsd", rec.bjhilsd);
			rx.add(record, "hgilbssd", rec.hgilbssd);
			rx.add(record, "jcilbssd", rec.jcilbssd);
			rx.add(record, "jclsd", rec.jclsd);
			rx.add(record, "cyygsd", rec.cyygsd);
			rx.add(record, "jpbsd", rec.jpbsd);
			rx.add(record, "twcjbi", rec.twcjbi);
			rx.add(record, "jwgogy", rec.jwgogy);
			rx.add(record, "sggy", rec.sggy);
			rx.add(record, "sgsy", rec.sgsy);
			rx.add(record, "jgtot", rec.jgtot);
			rx.add(record, "ggsae", rec.ggsae);
			rx.add(record, "juminsae", rec.juminsae);
			rx.add(record, "jsggsae", rec.jsggsae);
			rx.add(record, "jsjuminsae", rec.jsjuminsae);
			rx.add(record, "gmyg", rec.gmyg);
			rx.add(record, "erbhr", rec.erbhr);
			rx.add(record, "gybhr", rec.gybhr);
			rx.add(record, "jcbi", rec.jcbi);
			rx.add(record, "bankdb", rec.bankdb);
			rx.add(record, "urigg", rec.urigg);
			rx.add(record, "snbjkg", rec.snbjkg);
			rx.add(record, "jgwhb", rec.jgwhb);
			rx.add(record, "rdjhb", rec.rdjhb);
			rx.add(record, "dchb", rec.dchb);
			rx.add(record, "cchb", rec.cchb);
			rx.add(record, "gajgg_1", rec.gajgg_1);
			rx.add(record, "gajgg_2", rec.gajgg_2);
			rx.add(record, "swgbnm", rec.swgbnm);
			rx.add(record, "gyar", rec.gyar);
			rx.add(record, "gjcak", rec.gjcak);
			rx.add(record, "chainjga", rec.chainjga);
			rx.add(record, "gtgj", rec.gtgj);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "nts", rec.nts);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "dty_alon", rec.dty_alon);
			rx.add(record, "care_alon", rec.care_alon);
			rx.add(record, "food_alon", rec.food_alon);
			rx.add(record, "lang_study_splamt", rec.lang_study_splamt);
			rx.add(record, "rslt_alon_saly", rec.rslt_alon_saly);
			rx.add(record, "scl_exps_alon_saly", rec.scl_exps_alon_saly);
			rx.add(record, "etc_alon_saly", rec.etc_alon_saly);
			rx.add(record, "bns_saly", rec.bns_saly);
			rx.add(record, "rslt_alon_exst_pay", rec.rslt_alon_exst_pay);
			rx.add(record, "scl_exps_alon_exst_pay", rec.scl_exps_alon_exst_pay);
			rx.add(record, "etc_alon_exst_pay", rec.etc_alon_exst_pay);
			rx.add(record, "bns_exst_pay", rec.bns_exst_pay);
			rx.add(record, "sply_chk_fee", rec.sply_chk_fee);
			rx.add(record, "anvy_pay_fee", rec.anvy_pay_fee);
			rx.add(record, "non_tax_food_alon", rec.non_tax_food_alon);
			rx.add(record, "non_tax_care_alon", rec.non_tax_care_alon);
			rx.add(record, "posk_alon", rec.posk_alon);
			rx.add(record, "rdr_extn_alon", rec.rdr_extn_alon);
			rx.add(record, "vaca_fee", rec.vaca_fee);
			rx.add(record, "park_vilt_sply_fee", rec.park_vilt_sply_fee);
			rx.add(record, "clamt_alon", rec.clamt_alon);
			rx.add(record, "prz_fee", rec.prz_fee);
			rx.add(record, "hody_duty_alon", rec.hody_duty_alon);
			rx.add(record, "prsn_pens_dduc", rec.prsn_pens_dduc);
			//rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			//rx.add(record, "no", StringUtil.replaceToXml(rec.no));
			//rx.add(record, "dt", StringUtil.replaceToXml(rec.dt));
			//rx.add(record, "gugcd", StringUtil.replaceToXml(rec.gugcd));
			//rx.add(record, "gugnm", StringUtil.replaceToXml(rec.gugnm));
			//rx.add(record, "bunm", StringUtil.replaceToXml(rec.bunm));
			//rx.add(record, "buseocd", StringUtil.replaceToXml(rec.buseocd));
			//rx.add(record, "buseonm", StringUtil.replaceToXml(rec.buseonm));
			//rx.add(record, "jccd2_jg_hobong", StringUtil.replaceToXml(rec.jccd2_jg_hobong));
			//rx.add(record, "iwgeub", StringUtil.replaceToXml(rec.iwgeub));
			//rx.add(record, "ybgbg_25", StringUtil.replaceToXml(rec.ybgbg_25));
			//rx.add(record, "ybjmg_25", StringUtil.replaceToXml(rec.ybjmg_25));
			//rx.add(record, "gg1tsgy", StringUtil.replaceToXml(rec.gg1tsgy));
			//rx.add(record, "gg1bggy", StringUtil.replaceToXml(rec.gg1bggy));
			//rx.add(record, "gbbgggg", StringUtil.replaceToXml(rec.gbbgggg));
			//rx.add(record, "gbjmgeub", StringUtil.replaceToXml(rec.gbjmgeub));
			//rx.add(record, "sabeon", StringUtil.replaceToXml(rec.sabeon));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "bw", StringUtil.replaceToXml(rec.bw));
			//rx.add(record, "soin", StringUtil.replaceToXml(rec.soin));
			//rx.add(record, "noin", StringUtil.replaceToXml(rec.noin));
			//rx.add(record, "kro", StringUtil.replaceToXml(rec.kro));
			//rx.add(record, "jae", StringUtil.replaceToXml(rec.jae));
			//rx.add(record, "jhgbsd", StringUtil.replaceToXml(rec.jhgbsd));
			//rx.add(record, "jhbssd", StringUtil.replaceToXml(rec.jhbssd));
			//rx.add(record, "bjhilsd", StringUtil.replaceToXml(rec.bjhilsd));
			//rx.add(record, "hgilbssd", StringUtil.replaceToXml(rec.hgilbssd));
			//rx.add(record, "jcilbssd", StringUtil.replaceToXml(rec.jcilbssd));
			//rx.add(record, "jclsd", StringUtil.replaceToXml(rec.jclsd));
			//rx.add(record, "cyygsd", StringUtil.replaceToXml(rec.cyygsd));
			//rx.add(record, "jpbsd", StringUtil.replaceToXml(rec.jpbsd));
			//rx.add(record, "twcjbi", StringUtil.replaceToXml(rec.twcjbi));
			//rx.add(record, "jwgogy", StringUtil.replaceToXml(rec.jwgogy));
			//rx.add(record, "sggy", StringUtil.replaceToXml(rec.sggy));
			//rx.add(record, "sgsy", StringUtil.replaceToXml(rec.sgsy));
			//rx.add(record, "jgtot", StringUtil.replaceToXml(rec.jgtot));
			//rx.add(record, "ggsae", StringUtil.replaceToXml(rec.ggsae));
			//rx.add(record, "juminsae", StringUtil.replaceToXml(rec.juminsae));
			//rx.add(record, "jsggsae", StringUtil.replaceToXml(rec.jsggsae));
			//rx.add(record, "jsjuminsae", StringUtil.replaceToXml(rec.jsjuminsae));
			//rx.add(record, "gmyg", StringUtil.replaceToXml(rec.gmyg));
			//rx.add(record, "erbhr", StringUtil.replaceToXml(rec.erbhr));
			//rx.add(record, "gybhr", StringUtil.replaceToXml(rec.gybhr));
			//rx.add(record, "jcbi", StringUtil.replaceToXml(rec.jcbi));
			//rx.add(record, "bankdb", StringUtil.replaceToXml(rec.bankdb));
			//rx.add(record, "urigg", StringUtil.replaceToXml(rec.urigg));
			//rx.add(record, "snbjkg", StringUtil.replaceToXml(rec.snbjkg));
			//rx.add(record, "jgwhb", StringUtil.replaceToXml(rec.jgwhb));
			//rx.add(record, "rdjhb", StringUtil.replaceToXml(rec.rdjhb));
			//rx.add(record, "dchb", StringUtil.replaceToXml(rec.dchb));
			//rx.add(record, "cchb", StringUtil.replaceToXml(rec.cchb));
			//rx.add(record, "gajgg_1", StringUtil.replaceToXml(rec.gajgg_1));
			//rx.add(record, "gajgg_2", StringUtil.replaceToXml(rec.gajgg_2));
			//rx.add(record, "swgbnm", StringUtil.replaceToXml(rec.swgbnm));
			//rx.add(record, "gyar", StringUtil.replaceToXml(rec.gyar));
			//rx.add(record, "gjcak", StringUtil.replaceToXml(rec.gjcak));
			//rx.add(record, "chainjga", StringUtil.replaceToXml(rec.chainjga));
			//rx.add(record, "gtgj", StringUtil.replaceToXml(rec.gtgj));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
			//rx.add(record, "nts", StringUtil.replaceToXml(rec.nts));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "emp_dtls_clsf", StringUtil.replaceToXml(rec.emp_dtls_clsf));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			//rx.add(record, "dty_alon", StringUtil.replaceToXml(rec.dty_alon));
			//rx.add(record, "care_alon", StringUtil.replaceToXml(rec.care_alon));
			//rx.add(record, "food_alon", StringUtil.replaceToXml(rec.food_alon));
			//rx.add(record, "lang_study_splamt", StringUtil.replaceToXml(rec.lang_study_splamt));
			//rx.add(record, "rslt_alon_saly", StringUtil.replaceToXml(rec.rslt_alon_saly));
			//rx.add(record, "scl_exps_alon_saly", StringUtil.replaceToXml(rec.scl_exps_alon_saly));
			//rx.add(record, "etc_alon_saly", StringUtil.replaceToXml(rec.etc_alon_saly));
			//rx.add(record, "bns_saly", StringUtil.replaceToXml(rec.bns_saly));
			//rx.add(record, "rslt_alon_exst_pay", StringUtil.replaceToXml(rec.rslt_alon_exst_pay));
			//rx.add(record, "scl_exps_alon_exst_pay", StringUtil.replaceToXml(rec.scl_exps_alon_exst_pay));
			//rx.add(record, "etc_alon_exst_pay", StringUtil.replaceToXml(rec.etc_alon_exst_pay));
			//rx.add(record, "bns_exst_pay", StringUtil.replaceToXml(rec.bns_exst_pay));
			//rx.add(record, "sply_chk_fee", StringUtil.replaceToXml(rec.sply_chk_fee));
			//rx.add(record, "anvy_pay_fee", StringUtil.replaceToXml(rec.anvy_pay_fee));
			//rx.add(record, "non_tax_food_alon", StringUtil.replaceToXml(rec.non_tax_food_alon));
			//rx.add(record, "non_tax_care_alon", StringUtil.replaceToXml(rec.non_tax_care_alon));
			//rx.add(record, "posk_alon", StringUtil.replaceToXml(rec.posk_alon));
			//rx.add(record, "rdr_extn_alon", StringUtil.replaceToXml(rec.rdr_extn_alon));
			//rx.add(record, "vaca_fee", StringUtil.replaceToXml(rec.vaca_fee));
			//rx.add(record, "park_vilt_sply_fee", StringUtil.replaceToXml(rec.park_vilt_sply_fee));
			//rx.add(record, "clamt_alon", StringUtil.replaceToXml(rec.clamt_alon));
			//rx.add(record, "prz_fee", StringUtil.replaceToXml(rec.prz_fee));
			//rx.add(record, "hody_duty_alon", StringUtil.replaceToXml(rec.hody_duty_alon));
			//rx.add(record, "prsn_pens_dduc", StringUtil.replaceToXml(rec.prsn_pens_dduc));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<hd_saly_3313_p>
	<dataSet>
		<CURLIST>
			<record>
				<yy/>
				<no/>
				<dt/>
				<gugcd/>
				<gugnm/>
				<bunm/>
				<buseocd/>
				<buseonm/>
				<jccd2_jg_hobong/>
				<iwgeub/>
				<ybgbg_25/>
				<ybjmg_25/>
				<gg1tsgy/>
				<gg1bggy/>
				<gbbgggg/>
				<gbjmgeub/>
				<sabeon/>
				<name/>
				<bw/>
				<soin/>
				<noin/>
				<kro/>
				<jae/>
				<jhgbsd/>
				<jhbssd/>
				<bjhilsd/>
				<hgilbssd/>
				<jcilbssd/>
				<jclsd/>
				<cyygsd/>
				<jpbsd/>
				<twcjbi/>
				<jwgogy/>
				<sggy/>
				<sgsy/>
				<jgtot/>
				<ggsae/>
				<juminsae/>
				<jsggsae/>
				<jsjuminsae/>
				<gmyg/>
				<erbhr/>
				<gybhr/>
				<jcbi/>
				<bankdb/>
				<urigg/>
				<snbjkg/>
				<jgwhb/>
				<rdjhb/>
				<dchb/>
				<cchb/>
				<gajgg_1/>
				<gajgg_2/>
				<swgbnm/>
				<gyar/>
				<gjcak/>
				<chainjga/>
				<gtgj/>
				<cnt/>
				<nts/>
				<dty_cd/>
				<dty_nm/>
				<emp_dtls_clsf/>
				<incm_tax/>
				<res_tax/>
				<dty_alon/>
				<care_alon/>
				<food_alon/>
				<lang_study_splamt/>
				<rslt_alon_saly/>
				<scl_exps_alon_saly/>
				<etc_alon_saly/>
				<bns_saly/>
				<rslt_alon_exst_pay/>
				<scl_exps_alon_exst_pay/>
				<etc_alon_exst_pay/>
				<bns_exst_pay/>
				<sply_chk_fee/>
				<anvy_pay_fee/>
				<non_tax_food_alon/>
				<non_tax_care_alon/>
				<posk_alon/>
				<rdr_extn_alon/>
				<vaca_fee/>
				<park_vilt_sply_fee/>
				<clamt_alon/>
				<prz_fee/>
				<hody_duty_alon/>
				<prsn_pens_dduc/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3313_p>
*/
%>

<% /* 작성시간 : Fri Sep 06 11:05:02 KST 2013 */ %>