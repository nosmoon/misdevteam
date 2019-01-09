<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_3020_LDataSet ds = (TN_LNK_3020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");
                
	int totData    = rx.add(root, "totData", "");
	rx.add(totData, "totcount",  	ds.totcount	);
	rx.add(totData, "totprice", 	ds.totprice );
	rx.add(totData, "okcount",  	ds.okcount 	);
	rx.add(totData, "okprice", 		ds.okprice	);
	rx.add(totData, "errorcount",  	ds.errorcount	);
	rx.add(totData, "errorprice", 	ds.errorprice	);
	rx.add(totData, "fee",     		ds.fee	);

	int gridDetail = rx.add(root, "gridDetail", "");
	
	try {
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_3020_LCURLISTRecord rec = (TN_LNK_3020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridDetail, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "pymtmm"            , rec.pymtmm           );
			rx.add(record, "pymtdd"            , rec.pymtdd           );
			rx.addCData(record, "support"           , rec.support          );
			rx.addCData(record, "memb_cd"           , rec.memb_cd          );
			rx.addCData(record, "memb_nm"           , rec.memb_nm          );
			rx.add(record, "pymt_cd"           , rec.pymt_cd          );
			rx.addCData(record, "bankaccountowner"  , rec.bankaccountowner );
			rx.addCData(record, "banknm"            , rec.banknm           );
			rx.add(record, "bankaccount"       , rec.bankaccount      );
			rx.add(record, "reqprice"          , rec.scheduleprice    );
			rx.add(record, "payprice"          , rec.payprice         );
			rx.add(record, "result_stat"       , rec.result_stat      );
			rx.add(record, "paymentcode"       , rec.paymentcode      );
			rx.add(record, "isdelete"          , rec.isdelete         );
			rx.add(record, "memberidx"         , rec.memberidx        );
			rx.add(record, "promiseidx"        , rec.promiseidx       );
			rx.add(record, "cmspaymentidx"     , rec.cmspaymentidx    );
			rx.add(record, "cmsidx"            , rec.cmsidx           );
		}
		rx.add(gridDetail, "totalcnt", ds.curlist.size());
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_3020_l>
	<dataSet>
		<CURLIST>
			<record>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_3020_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 16:33:29 KST 2016 */ %>