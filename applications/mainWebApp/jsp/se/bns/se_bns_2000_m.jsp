<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_2000_m.jsp
* 기능 :  판매 - 판촉물관리 - 판촉물세금계산서 정정
* 작성일자 : 2009-05-01
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_2000_MDataSet ds = (SE_BNS_2000_MDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	
	String bgn_yymm	= "";
	String end_yymm	= "";
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String dd		= String.valueOf(cal.get(cal.DATE));
	dd				= dd.length() == 1 ? "0" + dd : dd;
	String updateYn	= "N";
	
	if ( "01".equals(month) || "04".equals(month) || "07".equals(month) || "10".equals(month) ) {
		if ( Integer.parseInt(dd) < 25 ){
			cal.add(cal.MONTH, -1);
			year 	= String.valueOf(cal.get(cal.YEAR));
			month 	= String.valueOf(cal.get(cal.MONTH) + 1);
			month	= month.length() == 1 ? "0" + month : month;
			dd		= String.valueOf(cal.get(cal.DATE));
			dd		= dd.length() == 1 ? "0" + dd : dd;
			
			//end_yymm	= year + month + dd;
			end_yymm	= year + month;
			
			cal.add(cal.MONTH, -2);
			year 	= String.valueOf(cal.get(cal.YEAR));
			month 	= String.valueOf(cal.get(cal.MONTH) + 1);
			month	= month.length() == 1 ? "0" + month : month;
			dd		= String.valueOf(cal.get(cal.DATE));
			dd		= dd.length() == 1 ? "0" + dd : dd;
				
//			bgn_yymm	= year + month + dd;
			bgn_yymm	= year + month ;
			
			updateYn = "Y";
		}
	}

	if ( ("01".equals(month) && Integer.parseInt(dd) >= 25) 
		||"02".equals(month) ||"03".equals(month) ){
		
		bgn_yymm	= year + "01";
		end_yymm	= year + "03";
	}
	
	if ( ("04".equals(month) && Integer.parseInt(dd) >= 25) 
		||"05".equals(month) ||"06".equals(month) ){
		
		bgn_yymm	= year + "04";
		end_yymm	= year + "06";
	}
	
	if ( ("07".equals(month) && Integer.parseInt(dd) >= 25) 
		||"08".equals(month) ||"09".equals(month) ){
		
		bgn_yymm	= year + "07";
		end_yymm	= year + "09";
	}

	if ( ("10".equals(month) && Integer.parseInt(dd) >= 25) 
		||"11".equals(month) ||"12".equals(month) ){
		
		bgn_yymm	= year + "10";
		end_yymm	= year + "12";
	}

	rx.add(root	, "bgn_yymm"	, bgn_yymm);
	rx.add(root	, "end_yymm"	, end_yymm);
	rx.add(root	, "updateYn"	, updateYn);	
	
	//formData 		= rx.add(root		, "initData"	, "");
	formData 		= rx.add(root	, "comboSet"	, "");

	try {
		recordSet	= rx.add(formData	, "teamlist"		, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_BNS_2000_MTEAMLISTRecord rec = (SE_BNS_2000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
		}
		recordSet	= rx.add(formData	, "arealist_temp"	, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_BNS_2000_MAREALISTRecord rec = (SE_BNS_2000_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		recordSet	= rx.add(formData	, "partlist_temp"	, "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BNS_2000_MPARTLISTRecord rec = (SE_BNS_2000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet	= rx.add(formData	, "issulist"	,	 "");		
		for(int i = 0; i < ds.issulist.size(); i++) {
			SE_BNS_2000_MISSULISTRecord rec = (SE_BNS_2000_MISSULISTRecord)ds.issulist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "cd"				, rec.cd			);
			rx.add(record, "cdnm"			, rec.cdnm			);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm	);
		}
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
	<TEAMLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAMLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<PARTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PARTLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<teamlist/>
		<partlist/>
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri May 01 13:59:05 KST 2009 */ %>