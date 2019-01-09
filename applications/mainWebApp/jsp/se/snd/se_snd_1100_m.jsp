<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_1100_m.jsp
* 기능 : 판매 - 발송관리 - 노선등록 - 초기화면
* 작성일자 : 2009.02.03
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
	SE_SND_1100_MDataSet ds = (SE_SND_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "codeData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** LEDTLIST BEGIN */
		recordSet = rx.add(dataSet, "ledtlist", "");

		for(int i = 0; i < ds.ledtlist.size(); i++) {
			SE_SND_1100_MLEDTLISTRecord rec = (SE_SND_1100_MLEDTLISTRecord)ds.ledtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.ledtlist.size());
		/****** LEDTLIST END */

		/****** PRTLIST BEGIN */
		recordSet = rx.add(dataSet, "prtlist", "");

		for(int i = 0; i < ds.prtlist.size(); i++) {
			SE_SND_1100_MPRTLISTRecord rec = (SE_SND_1100_MPRTLISTRecord)ds.prtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.prtlist.size());
		/****** PRTLIST END */

		/****** ROUTELIST BEGIN */
		recordSet = rx.add(dataSet, "routelist", "");

		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_1100_MROUTELISTRecord rec = (SE_SND_1100_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "mang_cd_1"	, rec.mang_cd_1);
		}
		rx.add(recordSet, "totalcnt", ds.routelist.size());
		/****** ROUTELIST END */

		/****** ECNTLIST BEGIN */
		recordSet = rx.add(dataSet, "ecntlist", "");

		for(int i = 0; i < ds.ecntlist.size(); i++) {
			SE_SND_1100_MECNTLISTRecord rec = (SE_SND_1100_MECNTLISTRecord)ds.ecntlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.ecntlist.size());
		/****** ECNTLIST END */

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
<dataSet>
	<LEDTLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</LEDTLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<PRTLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</PRTLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<ROUTELIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</ROUTELIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<ECNTLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</ECNTLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>