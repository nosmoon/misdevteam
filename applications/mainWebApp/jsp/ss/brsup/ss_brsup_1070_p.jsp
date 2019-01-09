<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*, chosun.ciis.ss.sls.brsup.ds.*, chosun.ciis.ss.sls.brsup.rec.*, somo.framework.util.*"%><%

	StringBuffer sb = new StringBuffer("");
	
    SS_L_NWSPITEMSEND_PRINTDataSet ds = (SS_L_NWSPITEMSEND_PRINTDataSet)request.getAttribute("ds");
    String frdt = request.getParameter("frdt");
    String todt = request.getParameter("todt");

sb.append("<html>");
sb.append("<body>");
sb.append("<table border=0 cellpadding=0 cellspacing=0 width=1200>");
sb.append(" <tr height=18>");
sb.append("  <td height=18 class=xl24 width=98></td>");
sb.append("  <td width=104></td>");
sb.append("  <td width=88></td>");
sb.append("  <td width=110></td>");
sb.append("  <td width=88></td>");
sb.append("  <td width=86></td>");
sb.append("  <td width=92></td>");
sb.append("  <td width=88></td>");
sb.append("  <td width=96></td>");
sb.append("  <td width=106></td>");
sb.append("  <td width=84></td>");
sb.append("  <td width=160></td>");
sb.append(" </tr>");
sb.append(" <tr height=25>");
sb.append("  <td colspan=9 height=25>신문지원물품 발송현황</td>");
sb.append("  <td colspan=3></td>");
sb.append(" </tr>");
sb.append(" <tr height=25>");
sb.append("  <td height=25></td>");
sb.append("  <td colspan=11></td>");
sb.append(" </tr>");
sb.append(" <tr height=18>");
sb.append("  <td height=18 colspan=9></td>");
sb.append("  <td>신청일자 : ").append(Util.convertS(frdt)).append(" ~  ").append(Util.convertS(todt)).append("</td>");
sb.append(" </tr>");
sb.append(" <tr height=18>");
sb.append("  <td height=18 colspan=12></td>");
sb.append(" </tr>");
sb.append("</table>");
sb.append("<table border=1 cellpadding=0 cellspacing=0 width=1200>");
sb.append(" <tr height=18 style='height:13.5pt'>");
sb.append("  <td height=18>신청일자</td>");
sb.append("  <td>지역명</td>");
sb.append("  <td>지국명</td>");
sb.append("  <td>지국전화</td>");
sb.append("  <td>물품명</td>");
sb.append("  <td>단가</td>");
sb.append("  <td>발송수량</td>");
sb.append("  <td>사고수량</td>");
sb.append("  <td>산정수량</td>");
sb.append("  <td>금액</td>");
sb.append("  <td>인쇄처</td>");
sb.append("  <td>노선번호</td>");
sb.append("  <td>비고</td>");
sb.append(" </tr>");

for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);
 
sb.append(" <tr height=18 style='height:13.5pt'>");
sb.append("  <td height=18>").append(Util.convertS(curcommlistRec.aplcdt)).append("</td>");
sb.append("  <td>").append(curcommlistRec.areanm).append("</td>");
sb.append("  <td>").append(curcommlistRec.bonm).append("</td>");
sb.append("  <td>").append(curcommlistRec.botelno).append("</td>");
sb.append("  <td>").append(curcommlistRec.itemnm).append("</td>");
sb.append("  <td>").append(Util.comma(curcommlistRec.uprc)).append("</td>");
sb.append("  <td>").append(Util.comma(curcommlistRec.aplcqunt)).append("</td>");
sb.append("  <td>").append(Util.comma(curcommlistRec.accdqunt)).append("</td>");
sb.append("  <td>").append(Util.comma(curcommlistRec.aplcqunt - curcommlistRec.accdqunt)).append("</td>");
sb.append("  <td>").append(Util.comma(curcommlistRec.uprc * (curcommlistRec.aplcqunt - curcommlistRec.accdqunt))).append("</td>");
sb.append("  <td>").append(curcommlistRec.sendplacnm).append("</td>");
sb.append("  <td>").append(curcommlistRec.nbisc).append("</td>");
sb.append("  <td></td>");
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