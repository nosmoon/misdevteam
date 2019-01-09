<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2810_LDataSet ds = (AD_DEP_2810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	long row_cnt = Long.parseLong(ds.cnt);
	//변수 선언부 시작
	long advt_tot 	= 0;
	long madvt_tot 	= 0;
	long sadvt_tot 	= 0;
	long eadvt_tot 	= 0;
	String sum_tot	= "";
	long setoff_tot = 0;
	String sum_avg  = "";
	String setoff_avg = "";
	//int	mpubc_tot	= 0;
	//int	spubc_tot	= 0;
	//int	epubc_tot	= 0;
	//변수 선언부 끝



	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2810_LCURLISTRecord rec = (AD_DEP_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			advt_tot = 0;
			if(!"".equals(rec.pubc_dt)){
				String mm = rec.pubc_dt.substring(4,6);
				String dd = rec.pubc_dt.substring(6,8);			
				rx.add(record, "pubc_dt", mm+"월 "+dd+"일");
			}
			rx.add(record, "hosu", rec.hosu);
			//일단 null 처리 
			rx.add(record, "mpubc_side", "");
			rx.add(record, "spubc_side", "");
			rx.add(record, "epubc_side", "");
			
			rx.add(record, "madvt_fee", "0".equals(rec.madvt_fee) ? "" : rec.madvt_fee);
			advt_tot += Long.parseLong(rec.madvt_fee);
			madvt_tot += Long.parseLong(rec.madvt_fee);

			rx.add(record, "sadvt_fee", "0".equals(rec.sadvt_fee) ? "" : rec.sadvt_fee);
			advt_tot += Long.parseLong(rec.sadvt_fee);
			sadvt_tot += Long.parseLong(rec.sadvt_fee);

			rx.add(record, "eadvt_fee", "0".equals(rec.eadvt_fee) ? "" : rec.sadvt_fee);
			advt_tot += Long.parseLong(rec.eadvt_fee);
			eadvt_tot += Long.parseLong(rec.eadvt_fee);

			rx.add(record, "sum_fee", advt_tot);
			rx.add(record, "setoff_advt_fee", "0".equals(rec.setoff_advt_fee) ? "" : rec.setoff_advt_fee);
			setoff_tot += Long.parseLong(rec.setoff_advt_fee);			

			//입금율 : (입금액:x/총게재액:y)*100
			double x = 0; 
			double y = 0;
			String at = Long.toString(advt_tot);
			y = Double.valueOf(at).doubleValue();
			x = Double.valueOf(rec.setoff_advt_fee).doubleValue();
			rx.add(record, "setoff_advt_rate",  y == 0 ? x == 0 ? "0" : "100" : DigitUtil.cutUnderPoint((x/y)*100, 1) );
		}
		//합계 
		int record = rx.add(gridData, "record", "");
		rx.add(record, "pubc_dt", "합 계");
		rx.add(record, "hosu", "");
		rx.add(record, "mpubc_side", "");
		rx.add(record, "spubc_side", "");
		rx.add(record, "epubc_side", "");
		rx.add(record, "madvt_fee", madvt_tot == 0 ? "" : Long.toString(madvt_tot));
		rx.add(record, "sadvt_fee", sadvt_tot == 0 ? "" : Long.toString(sadvt_tot));
		rx.add(record, "eadvt_fee", eadvt_tot == 0 ? "" : Long.toString(eadvt_tot));
		sum_tot = Long.toString(madvt_tot + sadvt_tot + eadvt_tot);
		rx.add(record, "sum_fee", "0".equals(sum_tot) ? "" : sum_tot);
		rx.add(record, "setoff_advt_fee", setoff_tot == 0 ? "" : Long.toString(setoff_tot));
		
		double w = 0; 
		double z = 0;
		String sot = Long.toString(setoff_tot);		
		z = Double.valueOf(sum_tot).doubleValue();
		w = Double.valueOf(sot).doubleValue();		
		rx.add(record, "setoff_advt_rate", z == 0 ? w == 0 ? "0" : "100" : DigitUtil.cutUnderPoint((w/z)*100, 1));
		//평균
		rx.add(gridData, "record", "");
		rx.add(record, "pubc_dt", "평 균");
		rx.add(record, "hosu", "");
		rx.add(record, "mpubc_side", "");
		rx.add(record, "spubc_side", "");
		rx.add(record, "epubc_side", "");
		rx.add(record, "madvt_fee",  madvt_tot == 0 ? "" : Long.toString(madvt_tot/row_cnt));
		rx.add(record, "sadvt_fee",  sadvt_tot == 0 ? "" : Long.toString(sadvt_tot/row_cnt));
		rx.add(record, "eadvt_fee",  eadvt_tot == 0 ? "" : Long.toString(eadvt_tot/row_cnt));
		sum_avg = "0".equals(sum_tot) ? "" : Long.toString(Long.parseLong(sum_tot)/row_cnt);
		rx.add(record, "sum_fee", sum_avg);
		setoff_avg = setoff_tot == 0 ? "" : Long.toString(setoff_tot/row_cnt);
		rx.add(record, "setoff_advt_fee", setoff_avg);

		double den = 0; 
		double mol = 0;
		den = Double.valueOf(sum_avg).doubleValue();
		mol = Double.valueOf(setoff_avg).doubleValue();		
		rx.add(record, "setoff_advt_rate", den == 0 ? mol == 0 ? "0" : "100" : DigitUtil.cutUnderPoint((mol/den)*100, 1));		
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<pubc_dt/>
			<hosu/>
			<mpubc_side/>
			<spubc_side/>
			<epubc_side/>
			<madvt_fee/>
			<sadvt_fee/>
			<eadvt_fee/>
			<setoff_advt_fee/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 08 20:20:06 KST 2009 */ %>