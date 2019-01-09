<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.eis.rec.*
	,	chosun.ciis.ad.eis.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_EIS_1210_LDataSet ds = (AD_EIS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
	
		boolean[] show_me = new boolean[64];
		for(int i=0; i<ds.curlist.size(); i++){ 
			
			AD_EIS_1210_LCURLISTRecord rec = (AD_EIS_1210_LCURLISTRecord)ds.curlist.get(i);
			
			if(!"0".equals(rec.c_0100_pcnt)) show_me[0]  = true;
			if(!"0".equals(rec.c_0200_pcnt)) show_me[1]  = true;
			if(!"0".equals(rec.c_0301_pcnt)) show_me[2]  = true;
			if(!"0".equals(rec.c_0302_pcnt)) show_me[3]  = true;
			if(!"0".equals(rec.c_0303_pcnt)) show_me[4]  = true;
			if(!"0".equals(rec.c_0304_pcnt)) show_me[5]  = true;
			if(!"0".equals(rec.c_0305_pcnt)) show_me[6]  = true;
			if(!"0".equals(rec.c_0306_pcnt)) show_me[7]  = true;
			if(!"0".equals(rec.c_0307_pcnt)) show_me[8]  = true;
			if(!"0".equals(rec.c_0308_pcnt)) show_me[9]  = true;
			if(!"0".equals(rec.c_0309_pcnt)) show_me[10] = true;
			if(!"0".equals(rec.c_0310_pcnt)) show_me[11] = true;
			if(!"0".equals(rec.c_0401_pcnt)) show_me[12] = true;
			if(!"0".equals(rec.c_0402_pcnt)) show_me[13] = true;
			if(!"0".equals(rec.c_0403_pcnt)) show_me[14] = true;
			if(!"0".equals(rec.c_0404_pcnt)) show_me[15] = true;
			if(!"0".equals(rec.c_0405_pcnt)) show_me[16] = true;
			if(!"0".equals(rec.c_0406_pcnt)) show_me[17] = true;
			if(!"0".equals(rec.c_0407_pcnt)) show_me[18] = true;
			if(!"0".equals(rec.c_0408_pcnt)) show_me[19] = true;
			if(!"0".equals(rec.c_0409_pcnt)) show_me[20] = true;
			if(!"0".equals(rec.c_0410_pcnt)) show_me[21] = true;
			if(!"0".equals(rec.c_0501_pcnt)) show_me[22] = true;
			if(!"0".equals(rec.c_0502_pcnt)) show_me[23] = true;
			if(!"0".equals(rec.c_0503_pcnt)) show_me[24] = true; 
			if(!"0".equals(rec.c_0504_pcnt)) show_me[25] = true; 
			if(!"0".equals(rec.c_0505_pcnt)) show_me[26] = true; 
			if(!"0".equals(rec.c_0506_pcnt)) show_me[27] = true; 
			if(!"0".equals(rec.c_0507_pcnt)) show_me[28] = true; 
			if(!"0".equals(rec.c_0508_pcnt)) show_me[29] = true; 
			if(!"0".equals(rec.c_0509_pcnt)) show_me[30] = true; 
			if(!"0".equals(rec.c_0510_pcnt)) show_me[31] = true; 
			if(!"0".equals(rec.c_0601_pcnt)) show_me[32] = true; 
			if(!"0".equals(rec.c_0602_pcnt)) show_me[33] = true; 
			if(!"0".equals(rec.c_0603_pcnt)) show_me[34] = true; 
			if(!"0".equals(rec.c_0604_pcnt)) show_me[35] = true; 
			if(!"0".equals(rec.c_0605_pcnt)) show_me[36] = true; 
			if(!"0".equals(rec.c_0606_pcnt)) show_me[37] = true;  
			if(!"0".equals(rec.c_0607_pcnt)) show_me[38] = true;  
			if(!"0".equals(rec.c_0608_pcnt)) show_me[39] = true;  
			if(!"0".equals(rec.c_0609_pcnt)) show_me[40] = true;  
			if(!"0".equals(rec.c_0610_pcnt)) show_me[41] = true; 
			if(!"0".equals(rec.c_0611_pcnt)) show_me[42] = true; 
			if(!"0".equals(rec.c_0612_pcnt)) show_me[43] = true; 
			if(!"0".equals(rec.c_0613_pcnt)) show_me[44] = true; 
			if(!"0".equals(rec.c_0614_pcnt)) show_me[45] = true; 
			if(!"0".equals(rec.c_0615_pcnt)) show_me[46] = true; 
			if(!"0".equals(rec.c_0616_pcnt)) show_me[47] = true; 
			if(!"0".equals(rec.c_0617_pcnt)) show_me[48] = true; 
			if(!"0".equals(rec.c_0621_pcnt)) show_me[49] = true; 
			if(!"0".equals(rec.c_0631_pcnt)) show_me[50] = true; 
			if(!"0".equals(rec.c_0632_pcnt)) show_me[51] = true; 
			if(!"0".equals(rec.c_0701_pcnt)) show_me[52] = true; 
			if(!"0".equals(rec.c_0702_pcnt)) show_me[53] = true; 
			if(!"0".equals(rec.c_0703_pcnt)) show_me[54] = true; 
			if(!"0".equals(rec.c_0704_pcnt)) show_me[55] = true; 
			if(!"0".equals(rec.c_0705_pcnt)) show_me[56] = true; 
			if(!"0".equals(rec.c_0706_pcnt)) show_me[57] = true; 
			if(!"0".equals(rec.c_0707_pcnt)) show_me[58] = true; 
			if(!"0".equals(rec.c_0708_pcnt)) show_me[59] = true; 
			if(!"0".equals(rec.c_0709_pcnt)) show_me[60] = true; 
			if(!"0".equals(rec.c_0710_pcnt)) show_me[61] = true; 
			if(!"0".equals(rec.c_0711_pcnt)) show_me[62] = true; 
			if(!"0".equals(rec.c_0712_pcnt)) show_me[63] = true; 					
			
		}
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1210_LCURLISTRecord rec = (AD_EIS_1210_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
		    rx.add ( record, "pubc_dt",    rec.pubc_dt);   
			rx.add ( record, "issu_side",  rec.issu_side); 
			rx.add ( record, "advt_fee",   rec.advt_fee);  
            int index = 0;
            if(show_me[index++]) rx.add ( record, "c_0100_amt", rec.c_0100_amt);
			if(show_me[index++]) rx.add ( record, "c_0200_amt", rec.c_0200_amt);
			if(show_me[index++]) rx.add ( record, "c_0301_amt", rec.c_0301_amt);
			if(show_me[index++]) rx.add ( record, "c_0302_amt", rec.c_0302_amt);
			if(show_me[index++]) rx.add ( record, "c_0303_amt", rec.c_0303_amt);
			if(show_me[index++]) rx.add ( record, "c_0304_amt", rec.c_0304_amt);
			if(show_me[index++]) rx.add ( record, "c_0305_amt", rec.c_0305_amt);
			if(show_me[index++]) rx.add ( record, "c_0306_amt", rec.c_0306_amt);
			if(show_me[index++]) rx.add ( record, "c_0307_amt", rec.c_0307_amt);
			if(show_me[index++]) rx.add ( record, "c_0308_amt", rec.c_0308_amt);
			if(show_me[index++]) rx.add ( record, "c_0309_amt", rec.c_0309_amt);
			if(show_me[index++]) rx.add ( record, "c_0310_amt", rec.c_0310_amt);
			if(show_me[index++]) rx.add ( record, "c_0401_amt", rec.c_0401_amt);
			if(show_me[index++]) rx.add ( record, "c_0402_amt", rec.c_0402_amt);
			if(show_me[index++]) rx.add ( record, "c_0403_amt", rec.c_0403_amt);
			if(show_me[index++]) rx.add ( record, "c_0404_amt", rec.c_0404_amt);
			if(show_me[index++]) rx.add ( record, "c_0405_amt", rec.c_0405_amt);
			if(show_me[index++]) rx.add ( record, "c_0406_amt", rec.c_0406_amt);
			if(show_me[index++]) rx.add ( record, "c_0407_amt", rec.c_0407_amt);
			if(show_me[index++]) rx.add ( record, "c_0408_amt", rec.c_0408_amt);
			if(show_me[index++]) rx.add ( record, "c_0409_amt", rec.c_0409_amt);
			if(show_me[index++]) rx.add ( record, "c_0410_amt", rec.c_0410_amt);
			if(show_me[index++]) rx.add ( record, "c_0501_amt", rec.c_0501_amt);
			if(show_me[index++]) rx.add ( record, "c_0502_amt", rec.c_0502_amt);
			if(show_me[index++]) rx.add ( record, "c_0503_amt", rec.c_0503_amt);
			if(show_me[index++]) rx.add ( record, "c_0504_amt", rec.c_0504_amt);
			if(show_me[index++]) rx.add ( record, "c_0505_amt", rec.c_0505_amt);
			if(show_me[index++]) rx.add ( record, "c_0506_amt", rec.c_0506_amt);
			if(show_me[index++]) rx.add ( record, "c_0507_amt", rec.c_0507_amt);
			if(show_me[index++]) rx.add ( record, "c_0508_amt", rec.c_0508_amt);
			if(show_me[index++]) rx.add ( record, "c_0509_amt", rec.c_0509_amt);
			if(show_me[index++]) rx.add ( record, "c_0510_amt", rec.c_0510_amt);
			if(show_me[index++]) rx.add ( record, "c_0601_amt", rec.c_0601_amt);
			if(show_me[index++]) rx.add ( record, "c_0602_amt", rec.c_0602_amt);
			if(show_me[index++]) rx.add ( record, "c_0603_amt", rec.c_0603_amt);
			if(show_me[index++]) rx.add ( record, "c_0604_amt", rec.c_0604_amt);
			if(show_me[index++]) rx.add ( record, "c_0605_amt", rec.c_0605_amt);
			if(show_me[index++]) rx.add ( record, "c_0606_amt", rec.c_0606_amt);
			if(show_me[index++]) rx.add ( record, "c_0607_amt", rec.c_0607_amt);
			if(show_me[index++]) rx.add ( record, "c_0608_amt", rec.c_0608_amt);
			if(show_me[index++]) rx.add ( record, "c_0609_amt", rec.c_0609_amt);
			if(show_me[index++]) rx.add ( record, "c_0610_amt", rec.c_0610_amt);
			if(show_me[index++]) rx.add ( record, "c_0611_amt", rec.c_0611_amt);
			if(show_me[index++]) rx.add ( record, "c_0612_amt", rec.c_0612_amt);
			if(show_me[index++]) rx.add ( record, "c_0613_amt", rec.c_0613_amt);
			if(show_me[index++]) rx.add ( record, "c_0614_amt", rec.c_0614_amt);
			if(show_me[index++]) rx.add ( record, "c_0615_amt", rec.c_0615_amt);
			if(show_me[index++]) rx.add ( record, "c_0616_amt", rec.c_0616_amt);
			if(show_me[index++]) rx.add ( record, "c_0617_amt", rec.c_0617_amt);
			if(show_me[index++]) rx.add ( record, "c_0621_amt", rec.c_0621_amt);
			if(show_me[index++]) rx.add ( record, "c_0631_amt", rec.c_0631_amt);
			if(show_me[index++]) rx.add ( record, "c_0632_amt", rec.c_0632_amt);
			if(show_me[index++]) rx.add ( record, "c_0701_amt", rec.c_0701_amt);
			if(show_me[index++]) rx.add ( record, "c_0702_amt", rec.c_0702_amt);
			if(show_me[index++]) rx.add ( record, "c_0703_amt", rec.c_0703_amt);
			if(show_me[index++]) rx.add ( record, "c_0704_amt", rec.c_0704_amt);
			if(show_me[index++]) rx.add ( record, "c_0705_amt", rec.c_0705_amt);
			if(show_me[index++]) rx.add ( record, "c_0706_amt", rec.c_0706_amt);
			if(show_me[index++]) rx.add ( record, "c_0707_amt", rec.c_0707_amt);
			if(show_me[index++]) rx.add ( record, "c_0708_amt", rec.c_0708_amt);
			if(show_me[index++]) rx.add ( record, "c_0709_amt", rec.c_0709_amt);
			if(show_me[index++]) rx.add ( record, "c_0710_amt", rec.c_0710_amt);
			if(show_me[index++]) rx.add ( record, "c_0711_amt", rec.c_0711_amt);
			if(show_me[index++]) rx.add ( record, "c_0712_amt", rec.c_0712_amt);
            index = 0;
			if(show_me[index++]) rx.add ( record, "c_0100_pcnt", rec.c_0100_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0200_pcnt", rec.c_0200_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0301_pcnt", rec.c_0301_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0302_pcnt", rec.c_0302_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0303_pcnt", rec.c_0303_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0304_pcnt", rec.c_0304_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0305_pcnt", rec.c_0305_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0306_pcnt", rec.c_0306_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0307_pcnt", rec.c_0307_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0308_pcnt", rec.c_0308_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0309_pcnt", rec.c_0309_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0310_pcnt", rec.c_0310_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0401_pcnt", rec.c_0401_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0402_pcnt", rec.c_0402_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0403_pcnt", rec.c_0403_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0404_pcnt", rec.c_0404_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0405_pcnt", rec.c_0405_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0406_pcnt", rec.c_0406_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0407_pcnt", rec.c_0407_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0408_pcnt", rec.c_0408_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0409_pcnt", rec.c_0409_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0410_pcnt", rec.c_0410_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0501_pcnt", rec.c_0501_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0502_pcnt", rec.c_0502_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0503_pcnt", rec.c_0503_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0504_pcnt", rec.c_0504_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0505_pcnt", rec.c_0505_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0506_pcnt", rec.c_0506_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0507_pcnt", rec.c_0507_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0508_pcnt", rec.c_0508_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0509_pcnt", rec.c_0509_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0510_pcnt", rec.c_0510_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0601_pcnt", rec.c_0601_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0602_pcnt", rec.c_0602_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0603_pcnt", rec.c_0603_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0604_pcnt", rec.c_0604_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0605_pcnt", rec.c_0605_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0606_pcnt", rec.c_0606_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0607_pcnt", rec.c_0607_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0608_pcnt", rec.c_0608_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0609_pcnt", rec.c_0609_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0610_pcnt", rec.c_0610_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0611_pcnt", rec.c_0611_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0612_pcnt", rec.c_0612_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0613_pcnt", rec.c_0613_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0614_pcnt", rec.c_0614_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0615_pcnt", rec.c_0615_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0616_pcnt", rec.c_0616_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0617_pcnt", rec.c_0617_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0621_pcnt", rec.c_0621_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0631_pcnt", rec.c_0631_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0632_pcnt", rec.c_0632_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0701_pcnt", rec.c_0701_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0702_pcnt", rec.c_0702_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0703_pcnt", rec.c_0703_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0704_pcnt", rec.c_0704_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0705_pcnt", rec.c_0705_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0706_pcnt", rec.c_0706_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0707_pcnt", rec.c_0707_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0708_pcnt", rec.c_0708_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0709_pcnt", rec.c_0709_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0710_pcnt", rec.c_0710_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0711_pcnt", rec.c_0711_pcnt);
			if(show_me[index++]) rx.add ( record, "c_0712_pcnt", rec.c_0712_pcnt);	
		}	
		
		for(int i=0; i<1-ds.curlist.size(); i++){
			int record  = rx.add( gridData , "record" , "");
		    rx.add ( record, "pubc_dt",    "");   
			rx.add ( record, "issu_side",  ""); 
			rx.add ( record, "advt_fee",   "");  
		}
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>