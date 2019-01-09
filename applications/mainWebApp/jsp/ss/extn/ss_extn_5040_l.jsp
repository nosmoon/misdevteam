<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*, chosun.ciis.ss.sls.extn.ds.*, chosun.ciis.ss.sls.extn.rec.*, somo.framework.util.*"%><%

	StringBuffer sb = new StringBuffer("");
	
	SS_SLS_EXTN_5040_LDataSet ds = (SS_SLS_EXTN_5040_LDataSet)request.getAttribute("ds");
    
	sb.append("<html>");
	sb.append("<body>");
	sb.append("<table border=1 cellpadding=0 cellspacing=0>");
	sb.append(" <tr height=18 style='height:13.5pt'>");
	sb.append("  <td height=18 width=80>유가월</td>");
	sb.append("  <td width=100>대납기업</td>");
	sb.append("  <td width=200>권유부서</td>");
	sb.append("  <td width=100>권유자</td>");
	sb.append("  <td width=70>신문</td>");
	sb.append("  <td width=70>e조경</td>");
	sb.append("  <td width=200>확장부서</td>");
	sb.append("  <td width=100>확장자</td>");
	sb.append("  <td width=70>신문2</td>");
	sb.append("  <td width=70>e조경2</td>");
	sb.append("  <td width=100>등록코드</td>");
	sb.append(" </tr>");

	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5040_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5040_LCURCOMMLISTRecord)ds.curcommlist.get(i);
	 
		sb.append(" <tr height=18 style='height:13.5pt'>");
		sb.append("  <td height=18>").append(curcommlistRec.yymm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.dncompnm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.adv_deptnm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.adv_nm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.medi_qty).append("</td>");
		sb.append("  <td>").append(curcommlistRec.mob_qty).append("</td>");
		sb.append("  <td>").append(curcommlistRec.extn_deptnm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.extn_nm).append("</td>");
		sb.append("  <td>").append(curcommlistRec.extn_medi_qty).append("</td>");
		sb.append("  <td>").append(curcommlistRec.extn_mob_qty).append("</td>");
		sb.append("  <td>").append(curcommlistRec.regcode).append("</td>");
		sb.append(" </tr>");
	
	}

	sb.append("</table>");
	sb.append("</body>");
	sb.append("</html>");


	byte[] filecont = sb.toString().getBytes();
	String filenm2  = new String("CRMDATA.xls".getBytes("KSC5601"),"8859_1");
	
	
	response.setContentLength((int)filecont.length);
	response.setContentType("application/smnet");
	response.setHeader("Content-Disposition", "attachment;filename=" + filenm2 );
	
	BufferedInputStream  fin  = new BufferedInputStream(new ByteArrayInputStream(filecont));
	BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());
	
	byte[] buf= new byte[1024];
	
	for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
		outs.write( buf, 0, count );
	}
	outs.close();
	fin.close();

%>