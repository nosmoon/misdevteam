<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*	
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_3410_LDataSet ds = (AD_DEP_3410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = rx.add(root, "resData", "");
	int gridData = rx.add(root, "gridData1", "");
	//��������//
	long advt_tot = 0;
	long in_advt_tot = 0;
	long misu_tot = 0;
	//��������//

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3410_LCURLISTRecord rec = (AD_DEP_3410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "advt_amt", "".equals(rec.advt_amt) ? "0" : rec.advt_amt);
			advt_tot = advt_tot + Long.parseLong("".equals(rec.advt_amt) ? "0" : rec.advt_amt);
			rx.add(record, "in_advt_fee", "".equals(rec.in_advt_fee) ? "0" : rec.in_advt_fee);
			in_advt_tot = in_advt_tot + Long.parseLong("".equals(rec.in_advt_fee) ? "0" : rec.in_advt_fee);
			rx.add(record, "misu_amt", "".equals(rec.misu_amt) ? "0" : rec.misu_amt);
			misu_tot = misu_tot + Long.parseLong("".equals(rec.misu_amt) ? "0" : rec.misu_amt);			
			rx.add(record, "misu_rate", "".equals(rec.misu_rate) ? "0" : ".".equals(rec.misu_rate.substring(0,1)) ? "0"+rec.misu_rate : rec.misu_rate);
		}
		/****** CURLIST END */
		//�հ�//
		if(ds.curlist.size() > 0){
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd", "��    ��");
			rx.add(record, "advt_amt", advt_tot);
			rx.add(record, "in_advt_fee", in_advt_tot);
			rx.add(record, "misu_amt", misu_tot);
			String at = Long.toString(advt_tot);
			String mt = Long.toString(misu_tot);
			double y = Double.parseDouble(at);
			double x = Double.parseDouble(mt);
			rx.add(record, "misu_rate", y == 0 ? x == 0 ? "0" : "100" : DigitUtil.cutUnderPoint((x/y)*100, 2));
		}
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<advt_amt/>
			<in_advt_fee/>
			<misu_amt/>
			<misu_rate/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Tue Apr 14 15:24:54 KST 2009 */ %>