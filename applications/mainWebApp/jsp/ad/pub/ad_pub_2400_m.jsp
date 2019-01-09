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
* 파일명 : ad_pub_2400_m.jsp
* 기능 : 
* 작성일자 : 2009-02-25
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
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

	//행사년도
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
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get(today.YEAR);
		int Int_cd = Integer.parseInt(sub_cd);
		if(Int_cd < year){
			int item  = rx.add( evnt_yyyy , "item" , "");
			rx.add ( item, "value", Integer.toString(year));
			rx.add ( item, "label", Integer.toString(year));		
		}
		
		//행사코드		
		int evnt_cd = rx.add( tempData , "evnt_cd" , "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2400_MCURLIST2Record rec = (AD_PUB_2400_MCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(evnt_cd, "item", "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}	
		
	//문화사업 시작
	//행사년도
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
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar Mtoday = new GregorianCalendar ( );
		int Myear = Mtoday.get(Mtoday.YEAR);
		int MInt_cd = Integer.parseInt(Msub_cd);
		if(MInt_cd < Myear){
			int item  = rx.add( Mevnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(Myear));
			rx.add ( item, "label", Integer.toString(Myear));		
		}	
		
		//문화사업코드		
		int Mevnt_cd = rx.add( tempData , "Mevnt_cd" , "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_PUB_2400_MCURLIST3Record rec = (AD_PUB_2400_MCURLIST3Record)ds.curlist3.get(i);
			int item = rx.add(Mevnt_cd, "item", "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			rx.add ( item, "pcode", rec.cd.substring(0,4));			
		}	
	
		//리스트
		int evnt_cd_l = rx.add( tempData , "evnt_cd_l" , "");//리스트용
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
		//20180601 구독협찬 코드(가상) 추가
		int item_l_2 = rx.add(evnt_cd_l,"item","");
		rx.add(item_l_2, "value", "20180000");
		rx.add(item_l_2, "label", "구독협찬");
		rx.add(item_l_2, "pcode", "2018");
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
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
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Feb 25 17:01:36 KST 2009 */ %>