<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ad_pub_2400_m.jsp
* ��� : 
* �ۼ����� : 2009-02-25
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2400_MDataSet ds = (AD_PUB_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	int nwsp_side_type = rx.add( tempData , "nwsp_side_type" , "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2400_MCURLISTRecord rec = (AD_PUB_2400_MCURLISTRecord)ds.curlist.get(i);
			int item = rx.add(nwsp_side_type, "item", "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
		}

	//���⵵
		int evnt_yyyy = rx.add( tempData , "evnt_yyyy" , "");
		String chk_cd = "";
		String sub_cd = "";
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_PUB_2400_MCURLIST2Record rec = (AD_PUB_2400_MCURLIST2Record)ds.curlist2.get(i);
			String cd = rec.cd;
			sub_cd = cd.substring(0,4);
			
			if(!chk_cd.equals(sub_cd)){
				int item  = rx.add( evnt_yyyy , "item" , "");
				rx.add ( item, "value", sub_cd);
				rx.add ( item, "label", sub_cd);
				chk_cd = sub_cd;
			}
		}			
		//�����⵵�� ����⵵���� �������
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get(today.YEAR);
		int Int_cd = Integer.parseInt(sub_cd);
		if(Int_cd < year){
			int item  = rx.add( evnt_yyyy , "item" , "");
			rx.add ( item, "value", Integer.toString(year));
			rx.add ( item, "label", Integer.toString(year));		
		}
		
		//����ڵ�		
		int evnt_cd = rx.add( tempData , "evnt_cd" , "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2400_MCURLIST2Record rec = (AD_PUB_2400_MCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(evnt_cd, "item", "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}	
		
	//��ȭ��� ����
	//���⵵
		int Mevnt_yy = rx.add( tempData , "Mevnt_yyyy" , "");
		String Mchk_cd = "";
		String Msub_cd = "";
		for(int i=0; i<ds.curlist3.size(); i++){ 
			AD_PUB_2400_MCURLIST3Record rec = (AD_PUB_2400_MCURLIST3Record)ds.curlist3.get(i);
			String cd = rec.cd;
			Msub_cd = cd.substring(0,4);
			
			if(!Mchk_cd.equals(Msub_cd)){
				int item  = rx.add( Mevnt_yy , "item" , "");
				rx.add ( item, "value", Msub_cd);
				rx.add ( item, "label", Msub_cd);
				Mchk_cd = Msub_cd;
			}
		}			
		//�����⵵�� ����⵵���� �������
		GregorianCalendar Mtoday = new GregorianCalendar ( );
		int Myear = Mtoday.get(Mtoday.YEAR);
		int MInt_cd = Integer.parseInt(Msub_cd);
		if(MInt_cd < Myear){
			int item  = rx.add( Mevnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(Myear));
			rx.add ( item, "label", Integer.toString(Myear));		
		}	
		
		//��ȭ����ڵ�		
		int Mevnt_cd = rx.add( tempData , "Mevnt_cd" , "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_PUB_2400_MCURLIST3Record rec = (AD_PUB_2400_MCURLIST3Record)ds.curlist3.get(i);
			int item = rx.add(Mevnt_cd, "item", "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			rx.add ( item, "pcode", rec.cd.substring(0,4));			
		}	
	
		//����Ʈ
		int evnt_cd_l = rx.add( tempData , "evnt_cd_l" , "");//����Ʈ��
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2400_MCURLIST2Record rec = (AD_PUB_2400_MCURLIST2Record)ds.curlist2.get(i);
			int item_l = rx.add(evnt_cd_l, "item", "");
			rx.add ( item_l, "value", rec.cd ); 
			rx.add ( item_l, "label", rec.cdnm); 
			rx.add ( item_l, "pcode", rec.cd.substring(0,4));			
		}
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_PUB_2400_MCURLIST3Record rec = (AD_PUB_2400_MCURLIST3Record)ds.curlist3.get(i);
			int item_l = rx.add(evnt_cd_l, "item", "");
			rx.add ( item_l, "value", rec.cd ); 
			rx.add ( item_l, "label", rec.cdnm); 
			rx.add ( item_l, "pcode", rec.cd.substring(0,4));				
		}	
		//20180601 �������� �ڵ�(����) �߰�
		int item_l_2 = rx.add(evnt_cd_l,"item","");
		rx.add(item_l_2, "value", "20180000");
		rx.add(item_l_2, "label", "��������");
		rx.add(item_l_2, "pcode", "2018");
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Feb 25 17:01:36 KST 2009 */ %>