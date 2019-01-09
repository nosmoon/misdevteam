<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@	page import="java.io.*,
		chosun.ciis.ss.sls.admin.ds.*,
		chosun.ciis.ss.sls.admin.rec.*
"%>
<%
		SS_L_SQL_EXECUTE_DWLOADDataSet ds = (SS_L_SQL_EXECUTE_DWLOADDataSet)request.getAttribute("ds");
        
        response.reset();
        response.setHeader("Content-Type", "text/html; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=SQL_result.xls;");    
        response.setHeader("Content-Transfer-Encoding", "base64");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
        PrintWriter out2 = response.getWriter();
        
        out2.println("<TABLE BORDER=1>");
		
		
		   for(int i=0; i<ds.resultcur.size(); i++){	
			SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord resultcurRec = (SS_L_SQL_EXECUTE_DWLOADRESULTCURRecord)ds.resultcur.get(i);
		
			out2.println("<TR>");
		
			out2.println ("<TD>" +resultcurRec.a1.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a2.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a3.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a4.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a5.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a6.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a7.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a8.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a9.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a10.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a11.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a12.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a13.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a14.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a15.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a16.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a17.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a18.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a19.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a20.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a21.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a22.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a23.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a24.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a25.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a26.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a27.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a28.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a29.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a30.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a31.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a32.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a33.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a34.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a35.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a36.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a37.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a38.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a39.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a40.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a41.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a42.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a43.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a44.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a45.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a46.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a47.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a48.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a49.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a50.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a51.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a52.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a53.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a54.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a55.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a56.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a57.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a58.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a59.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a60.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a61.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a62.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a63.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a64.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a65.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a66.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a67.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a68.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a69.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a70.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a71.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a72.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a73.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a74.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a75.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a76.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a77.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a78.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a79.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a80.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a81.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a82.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a83.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a84.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a85.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a86.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a87.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a88.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a89.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a90.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a91.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a92.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a93.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a94.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a95.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a96.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a97.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a98.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a99.toString()+ "</TD>");
			out2.println ("<TD>" +resultcurRec.a100.toString()+ "</TD>");
			out2.println("</TR>");
		   }
		out2.println("</TR>");
		out2.println("</TABLE>");

%>        

