'<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3051_LDataSet ds = (AD_PUB_3051_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	long   t_advt_fee_1   = 0;
	long   t_advt_fee_2   = 0;
	long   t_suply_amt_1  = 0;
	long   t_suply_amt_2  = 0;
	long   t_suply_amt_3  = 0;
	long   t_suply_amt_4  = 0;
	long   t_suply_amt_5  = 0;
	long   t_suply_amt_6  = 0;
	long   t_suply_amt_7  = 0;
	long   t_hap1         = 0;
	long   t_advt_fee_11  = 0;
	long   t_advt_fee_22  = 0;
	long   t_suply_amt_11 = 0;
	long   t_suply_amt_22 = 0;
	long   t_suply_amt_33 = 0;
	long   t_suply_amt_44 = 0;
	long   t_suply_amt_55 = 0;
	long   t_suply_amt_66 = 0;
	long   t_suply_amt_77 = 0;
	long   t_hap2         = 0;
	long   t_diff         = 0;
	double t_diff_ratio   = 0.00d;	
	double mo = 100000000;	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3051_LCURLISTRecord rec = (AD_PUB_3051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "grp_cmpy_cd", rec.grp_cmpy_cd);
			rx.addCData(record, "grp_cmpy_nm", rec.grp_cmpy_nm);

			//double a = Double.parseDouble(rec.advt_fee_1)/mo;
			//System.out.println("1::"+ DigitUtil.cutUnderPoint(Double.parseDouble(rec.advt_fee_1)/mo,1));
			
			rx.add(record, "advt_fee_1",   DigitUtil.cutUnderPoint(Double.parseDouble(rec.advt_fee_1)/mo,1));
			rx.add(record, "advt_fee_2",   DigitUtil.cutUnderPoint(Double.parseDouble(rec.advt_fee_2)/mo,1));
			rx.add(record, "suply_amt_1",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_1)/mo,1));
			rx.add(record, "suply_amt_2",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_2)/mo,1));
			rx.add(record, "suply_amt_3",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_3)/mo,1));
			rx.add(record, "suply_amt_4",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_4)/mo,1));
			rx.add(record, "suply_amt_5",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_5)/mo,1));
			rx.add(record, "suply_amt_6",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_6)/mo,1));
			rx.add(record, "suply_amt_7",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_7)/mo,1));
			rx.add(record, "hap1",         DigitUtil.cutUnderPoint(Double.parseDouble(rec.hap1)/mo,1));
			rx.add(record, "advt_fee_11",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.advt_fee_11)/mo,1));
			rx.add(record, "advt_fee_22",  DigitUtil.cutUnderPoint(Double.parseDouble(rec.advt_fee_22)/mo,1));
			rx.add(record, "suply_amt_11", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_11)/mo,1));
			rx.add(record, "suply_amt_22", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_22)/mo,1));
			rx.add(record, "suply_amt_33", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_33)/mo,1));
			rx.add(record, "suply_amt_44", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_44)/mo,1));
			rx.add(record, "suply_amt_55", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_55)/mo,1));
			rx.add(record, "suply_amt_66", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_66)/mo,1));
			rx.add(record, "suply_amt_77", DigitUtil.cutUnderPoint(Double.parseDouble(rec.suply_amt_77)/mo,1));
			rx.add(record, "hap2",         DigitUtil.cutUnderPoint(Double.parseDouble(rec.hap2)/mo,1));
			rx.add(record, "diff",         DigitUtil.cutUnderPoint(Double.parseDouble(rec.diff)/mo,1));
//			rx.add(record, "diff_ratio",   DigitUtil.cutUnderPoint(Double.parseDouble(rec.diff_ratio),2));
			rx.add(record, "diff_ratio",   DigitUtil.cutUnderPoint(Double.parseDouble(rec.diff_ratio),1));
						
			t_advt_fee_1   += StringUtil.toLong(rec.advt_fee_1  );
			t_advt_fee_2   += StringUtil.toLong(rec.advt_fee_2  );
			t_suply_amt_1  += StringUtil.toLong(rec.suply_amt_1 );
			t_suply_amt_2  += StringUtil.toLong(rec.suply_amt_2 );
			t_suply_amt_3  += StringUtil.toLong(rec.suply_amt_3 );
			t_suply_amt_4  += StringUtil.toLong(rec.suply_amt_4 );
			t_suply_amt_5  += StringUtil.toLong(rec.suply_amt_5 );
			t_suply_amt_6  += StringUtil.toLong(rec.suply_amt_6 );
			t_suply_amt_7  += StringUtil.toLong(rec.suply_amt_7 );
			t_hap1         += StringUtil.toLong(rec.hap1        );
			t_advt_fee_11  += StringUtil.toLong(rec.advt_fee_11 );
			t_advt_fee_22  += StringUtil.toLong(rec.advt_fee_22 );
			t_suply_amt_11 += StringUtil.toLong(rec.suply_amt_11);
			t_suply_amt_22 += StringUtil.toLong(rec.suply_amt_22);
			t_suply_amt_33 += StringUtil.toLong(rec.suply_amt_33);
			t_suply_amt_44 += StringUtil.toLong(rec.suply_amt_44);
			t_suply_amt_55 += StringUtil.toLong(rec.suply_amt_55);
			t_suply_amt_66 += StringUtil.toLong(rec.suply_amt_66);
			t_suply_amt_77 += StringUtil.toLong(rec.suply_amt_77);
			t_hap2         += StringUtil.toLong(rec.hap2        );
			t_diff         += StringUtil.toLong(rec.diff        );			
		}
		double mo2 = 100;
		int record = rx.add(gridData, "record", "");

		rx.add(record, "grp_cmpy_cd", "");
		rx.add(record, "grp_cmpy_nm", "гу ╟Х");
		rx.add(record, "advt_fee_1",   DigitUtil.cutUnderPoint((double)t_advt_fee_1/mo,1));
		rx.add(record, "advt_fee_2",   DigitUtil.cutUnderPoint((double)t_advt_fee_2/mo,1));
		rx.add(record, "suply_amt_1",  DigitUtil.cutUnderPoint((double)t_suply_amt_1/mo,1));
		rx.add(record, "suply_amt_2",  DigitUtil.cutUnderPoint((double)t_suply_amt_2/mo,1));
		rx.add(record, "suply_amt_3",  DigitUtil.cutUnderPoint((double)t_suply_amt_3/mo,1));
		rx.add(record, "suply_amt_4",  DigitUtil.cutUnderPoint((double)t_suply_amt_4/mo,1));
		rx.add(record, "suply_amt_5",  DigitUtil.cutUnderPoint((double)t_suply_amt_5/mo,1));
		rx.add(record, "suply_amt_6",  DigitUtil.cutUnderPoint((double)t_suply_amt_6/mo,1));
		rx.add(record, "suply_amt_7",  DigitUtil.cutUnderPoint((double)t_suply_amt_7/mo,1));
		rx.add(record, "hap1",         DigitUtil.cutUnderPoint((double)t_hap1/mo,1));
		rx.add(record, "advt_fee_11",  DigitUtil.cutUnderPoint((double)t_advt_fee_11/mo,1));
		rx.add(record, "advt_fee_22",  DigitUtil.cutUnderPoint((double)t_advt_fee_22/mo,1));
		rx.add(record, "suply_amt_11", DigitUtil.cutUnderPoint((double)t_suply_amt_11/mo,1));
		rx.add(record, "suply_amt_22", DigitUtil.cutUnderPoint((double)t_suply_amt_22/mo,1));
		rx.add(record, "suply_amt_33", DigitUtil.cutUnderPoint((double)t_suply_amt_33/mo,1));
		rx.add(record, "suply_amt_44", DigitUtil.cutUnderPoint((double)t_suply_amt_44/mo,1));
		rx.add(record, "suply_amt_55", DigitUtil.cutUnderPoint((double)t_suply_amt_55/mo,1));
		rx.add(record, "suply_amt_66", DigitUtil.cutUnderPoint((double)t_suply_amt_66/mo,1));
		rx.add(record, "suply_amt_77", DigitUtil.cutUnderPoint((double)t_suply_amt_77/mo,1));		
		rx.add(record, "hap2",         DigitUtil.cutUnderPoint((double)t_hap2/mo,1));
		rx.add(record, "diff",         DigitUtil.cutUnderPoint((double)t_diff/mo,1));
		//System.out.println("1");
		double tot_diff_amt = ((double)t_diff/(double)t_hap2) * mo2;
		//System.out.println("2::"+Double.toString(tot_diff_amt));
		//System.out.println("3::"+DigitUtil.cutUnderPoint(tot_diff_amt,2));
		rx.add(record, "diff_ratio",   DigitUtil.cutUnderPoint(tot_diff_amt,2));	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
