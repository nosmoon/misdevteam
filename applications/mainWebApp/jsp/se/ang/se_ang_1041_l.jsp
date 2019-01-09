<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.ang.rec.*
	,	chosun.ciis.se.ang.ds.*
	,	org.json.*;
	"
%>

<%
	System.out.println("start........");

	RwXml rx = new RwXml();
	SE_ANG_1041_LDataSet ds = (SE_ANG_1041_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int gridData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//gridData = rx.add(root, "gridData", "");

	int iter = 0;
	int proc = 0;
	int max = (ds.curlist.size() / 30000) + 1;
	
	System.out.println("-----------------(1)");
	try {
		for(int k=0; k<max; k++) {
			System.out.println("-----------------(2) " + k);
			
			int gridData = rx.add(root, "gridData", "");
			
			for(int i = iter; i < ds.curlist.size(); i++, iter++) {
				System.out.println("-----------------(3) " + i + " : " + iter + " : (" + k + ")");
				
				SE_ANG_1041_LCURLISTRecord rec = (SE_ANG_1041_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add(gridData, "record", "");
				rx.add(record, "bocd", rec.bocd);
				rx.add(record, "subsmappli", rec.subsmappli);
				rx.add(record, "medinm", rec.medinm);
				rx.add(record, "medicd", rec.medicd);
				rx.add(record, "clamtnm", rec.clamtnm);
				rx.add(record, "clamtmthdcd", rec.clamtmthdcd);
				rx.add(record, "rcpmnm", rec.rcpmnm);
				rx.add(record, "rcpmclsfcd", rec.rcpmclsfcd);
				rx.add(record, "clamqty", rec.clamqty);
				rx.add(record, "clamt", rec.clamt);

				if(proc++ >= 30000) {
					//rx.add(gridData, "totalcnt", ds.curlist.size());
					rx.add(gridData, "totalcnt", proc);
					proc = 0;
					break;
				}
			}
		}
		//rx.add(gridData, "totalcnt", proc);

		System.out.println("-----------------(4) " + max);

		rx.add(root, "totalGridCnt", max);

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
		System.out.println("*ERROR: " + errmsg);
	}
	finally {
		//-----------------------------------------
		// *기존: 생성된 XML 자체를  내보내는 방식은 막음
		//-----------------------------------------
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());

		System.out.println("-----------------(finally 1)");
		//-----------------------------------------
		// *신규: 생성된 XML을 JSON형태로 전환하여 내보냄
		//-----------------------------------------
		System.out.println("-----------------(finally 1-1) : ");
		rx.getXml();
		System.out.println("-----------------(finally 1-2) : " + rx.getXml().length());		
		JSONObject obj = XML.toJSONObject(rx.getXml());
		System.out.println("-----------------(finally 2)");
		out.println(obj.toString());
		System.out.println("-----------------(finally 3)");
		out.println(rx.xmlEndFlush());
		System.out.println("-----------------(finally end)");

		//System.out.println(obj.toString());
	}
	
	System.out.println("end........");
	//Date date = new Date();
	//System.out.println(date.toString());
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<se_ang_1041_l>
	<dataSet>
		<CURLIST>
			<record>
				<bocd/>
				<subsmappli/>
				<medinm/>
				<medicd/>
				<clamtnm/>
				<clamtmthdcd/>
				<rcpmnm/>
				<rcpmclsfcd/>
				<clamqty/>
				<clamt/>
			</record>
		</CURLIST>
	</dataSet>
</se_ang_1041_l>
*/
%>

<% /* 작성시간 : Tue Oct 31 13:59:00 KST 2017 */ %>