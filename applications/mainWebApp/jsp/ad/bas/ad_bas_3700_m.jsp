<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3700_MDataSet ds = (AD_BAS_3700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	try
	{
		//게재평가항목(조선)
		int cs_pubc_asse_cd = rx.add( tempData, "cs_pubc_asse_cd", "");
		for(int i=0; i<ds.curlist1.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( cs_pubc_asse_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//게재평가항목(중앙)
		int ja_pubc_asse_cd = rx.add( tempData, "ja_pubc_asse_cd", "");
		for(int i=0; i<ds.curlist2.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist2.get(i);
			int item  = rx.add( ja_pubc_asse_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//게재평가항목(동아)
		int da_pubc_asse_cd = rx.add( tempData, "da_pubc_asse_cd", "");
		for(int i=0; i<ds.curlist3.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist3.get(i);
			int item  = rx.add( da_pubc_asse_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//섹션명(조선)
		int cs_sect_nm_cd = rx.add( tempData, "cs_sect_nm_cd", "");
		for(int i=0; i<ds.curlist4.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist4.get(i);
			int item  = rx.add( cs_sect_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//섹션명(중앙)
		int ja_sect_nm_cd = rx.add( tempData, "ja_sect_nm_cd", "");
		for(int i=0; i<ds.curlist5.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist5.get(i);
			int item  = rx.add( ja_sect_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//섹션명(동아)
		int da_sect_nm_cd = rx.add( tempData, "da_sect_nm_cd", "");
		for(int i=0; i<ds.curlist6.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist6.get(i);
			int item  = rx.add( da_sect_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//영업담당자
		int slcrg_pers = rx.add( tempData, "cs_slcrg_pers", "");
		for(int i=0; i<ds.curlist7.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist7.get(i);
			int item  = rx.add( slcrg_pers, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		//업종
		int indt_clsf = rx.add( tempData, "indt_clsf", "");
		for(int i=0; i<ds.curlist8.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist8.get(i);
			int item  = rx.add( slcrg_pers, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//팀
		int team_cd = rx.add( tempData, "team_cd", "");
		for(int i=0; i<ds.curlist9.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist9.get(i);
			int item  = rx.add( slcrg_pers, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//게재평가항목(매경)
		int me_pubc_asse_cd = rx.add( tempData, "me_pubc_asse_cd", "");
		for(int i=0; i<ds.curlist10.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist10.get(i);
			int item  = rx.add( me_pubc_asse_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//게재평가항목(한경)
		int he_pubc_asse_cd = rx.add( tempData, "he_pubc_asse_cd", "");
		for(int i=0; i<ds.curlist11.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist11.get(i);
			int item  = rx.add( he_pubc_asse_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}		
		
		//섹션명(중앙)
		int me_sect_nm_cd = rx.add( tempData, "me_sect_nm_cd", "");
		for(int i=0; i<ds.curlist12.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist12.get(i);
			int item  = rx.add( me_sect_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}
		
		//섹션명(동아)
		int he_sect_nm_cd = rx.add( tempData, "he_sect_nm_cd", "");
		for(int i=0; i<ds.curlist13.size(); i++)
		{
			AD_BAS_3700_MCURLISTRecord rec = (AD_BAS_3700_MCURLISTRecord)ds.curlist13.get(i);
			int item  = rx.add( he_sect_nm_cd, "item", "");
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
		}				
						
	}
	catch (Exception e) 
	{
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>