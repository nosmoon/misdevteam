<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*, chosun.ciis.ss.sls.brmgr.ds.*, chosun.ciis.ss.sls.brmgr.rec.*, somo.framework.util.*"%><%

	StringBuffer sb = new StringBuffer("");
	
    SS_P_BOSENDPCONDDataSet ds = (SS_P_BOSENDPCONDDataSet)request.getAttribute("ds");
    
sb.append("<html>");
sb.append("<body>");
sb.append("<table border=1 cellpadding=0 cellspacing=0 width=6000>");
sb.append(" <tr height=18 style='height:13.5pt'>");
sb.append("  <td height=18>부서명</td>");
sb.append("  <td>파트명</td>");
sb.append("  <td>지역명</td>");
sb.append("  <td>지국명</td>");
sb.append("  <td>지국지사코드</td>");
sb.append("  <td>년월</td>");
sb.append("  <td>매체코드</td>");
sb.append("  <td>확장신청</td>");
sb.append("  <td>확장직원</td>");
sb.append("  <td>확장요원</td>");
sb.append("  <td>확장이전</td>");
sb.append("  <td>확장본사</td>");
sb.append("  <td>확장품앗이</td>");
sb.append("  <td>확장권유</td>");
sb.append("  <td>확장기타</td>");
sb.append("  <td>확장율</td>");
sb.append("  <td>중지이사</td>");
sb.append("  <td>중지거절</td>");
sb.append("  <td>중지타지</td>");
sb.append("  <td>중지기타</td>");
sb.append("  <td>중지기타1</td>");
sb.append("  <td>중지기타2</td>");
sb.append("  <td>중지기타3</td>");
sb.append("  <td>중지기타4</td>");
sb.append("  <td>중지율</td>");
sb.append("  <td>중지신청</td>");
sb.append("  <td>중지직원</td>");
sb.append("  <td>중지요원</td>");
sb.append("  <td>중지이전</td>");
sb.append("  <td>중지본사</td>");
sb.append("  <td>중지품앗이</td>");
sb.append("  <td>중지권유확장</td>");
sb.append("  <td>중지기타확장</td>");
sb.append("  <td>당월발송부수</td>");
sb.append("  <td>당월유가부수</td>");
sb.append("  <td>후수1</td>");
sb.append("  <td>후수2</td>");
sb.append("  <td>후수3</td>");
sb.append("  <td>후수4</td>");
sb.append("  <td>후수5</td>");
sb.append("  <td>후수6</td>");
sb.append("  <td>후수6초과</td>");
sb.append("  <td>아파트부수</td>");
sb.append("  <td>빌라부수</td>");
sb.append("  <td>주택부수</td>");
sb.append("  <td>사무실부수</td>");
sb.append("  <td>상가부수</td>");
sb.append("  <td>기타부수</td>");
sb.append("  <td>홍보지</td>");
sb.append("  <td>본사기증지</td>");
sb.append("  <td>지국기증지</td>");
sb.append("  <td>강투지</td>");
sb.append("  <td>기타무료지</td>");
sb.append("  <td>예비지</td>");
sb.append("  <td>쿠폰</td>");
sb.append("  <td>당월무가부수</td>");
sb.append("  <td>당월부수</td>");
sb.append("  <td>현미수부수</td>");
sb.append("  <td>조정부수</td>");
sb.append("  <td>재무부수</td>");
sb.append("  <td>결손부수</td>");
sb.append("  <td>선불부수</td>");
sb.append("  <td>휴독부수</td>");
sb.append("  <td>현미수금</td>");
sb.append("  <td>당월금액</td>");
sb.append("  <td>당월할인금액</td>");
sb.append("  <td>당월우송료</td>");
sb.append("  <td>조정액</td>");
sb.append("  <td>재무금액</td>");
sb.append("  <td>결손금액</td>");
sb.append("  <td>선불금액</td>");
sb.append("  <td>휴독금액</td>");
sb.append("  <td>지로수금액</td>");
sb.append("  <td>방문수금액</td>");
sb.append("  <td>지로자동이체수금액</td>");
sb.append("  <td>신한카드이체수금액</td>");
sb.append("  <td>일반카드이체수금액</td>");
sb.append("  <td>온라인결제수금액</td>");
sb.append("  <td>기타수금액</td>");
sb.append("  <td>미수입금</td>");
sb.append("  <td>신수입금</td>");
sb.append("  <td>선입금</td>");
sb.append("  <td>지역전단수금액</td>");
sb.append("  <td>조선IS전단수금액</td>");
sb.append("  <td>입력자</td>");
sb.append("  <td>입력일자</td>");
sb.append("  <td>변경자</td>");
sb.append("  <td>변경일자</td>");
sb.append("  <td>자동이체할인부수</td>");
sb.append("  <td>일반할인부수</td>");
sb.append(" </tr>");

for(int i=0; i<ds.curcommlist.size(); i++){
		SS_P_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);
 
sb.append(" <tr height=18 style='height:13.5pt'>");
sb.append("  <td height=18>").append(curcommlistRec.deptnm).append("</td>");
sb.append("  <td>").append(curcommlistRec.partnm).append("</td>");
sb.append("  <td>").append(curcommlistRec.areanm).append("</td>");
sb.append("  <td>").append(curcommlistRec.bonm).append("</td>");
sb.append("  <td style=mso-number-format:00000>").append(curcommlistRec.bocd).append("</td>");
sb.append("  <td>").append(curcommlistRec.yymm).append("</td>");
sb.append("  <td>").append(curcommlistRec.medicd).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnaplc).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnemp).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnstaf).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnrdr_movm).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnhdqt).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnexg).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extncnvs).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnetc).append("</td>");
sb.append("  <td>").append(curcommlistRec.rdr_extnrate).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspmovm).append("</td>");
sb.append("  <td>").append(curcommlistRec.susprefu).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspothnwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetc).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetc1).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetc2).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetc3).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetc4).append("</td>");
sb.append("  <td>").append(curcommlistRec.susprate).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspaplc).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspemp).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspstaf).append("</td>");
sb.append("  <td>").append(curcommlistRec.susprdr_movm).append("</td>");
sb.append("  <td>").append(curcommlistRec.susphdqt).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspexg).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspcnvsrdr_extn).append("</td>");
sb.append("  <td>").append(curcommlistRec.suspetcrdr_extn).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmsendqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmvalqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt1).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt2).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt3).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt4).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt5).append("</td>");
sb.append("  <td>").append(curcommlistRec.aftcnt6).append("</td>");
sb.append("  <td>").append(curcommlistRec.excsaftcnt6).append("</td>");
sb.append("  <td>").append(curcommlistRec.aptqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.villaqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.housqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.offi_roomqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.shopqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.etcqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.pub_infonwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.hdqt_dntnwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.bodntnwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.frc_thrwnwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.etcfreenwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.resvnwsp).append("</td>");
sb.append("  <td>").append(curcommlistRec.cupn).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmno_valqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.nowun_recpqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.medaqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.re_freeqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.lossqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.ppymqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.temp_stopqty).append("</td>");
sb.append("  <td>").append(curcommlistRec.now_un_recp_amt).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmm_amt).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmdscnamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmpost_dlvfee).append("</td>");
sb.append("  <td>").append(curcommlistRec.meda_amt).append("</td>");
sb.append("  <td>").append(curcommlistRec.re_freeamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.lossamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.ppymamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.temp_stopamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.giroclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.vistclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.giroauto_shiftclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.docard_shiftclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.gnrcard_shiftclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.onlsetlclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.etcclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.un_recp_repm).append("</td>");
sb.append("  <td>").append(curcommlistRec.new_repm).append("</td>");
sb.append("  <td>").append(curcommlistRec.pre_repm).append("</td>");
sb.append("  <td>").append(curcommlistRec.arealeafclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.teampreisleafclamt).append("</td>");
sb.append("  <td>").append(curcommlistRec.incmgpers).append("</td>");
sb.append("  <td>").append(curcommlistRec.incmgdt).append("</td>");
sb.append("  <td>").append(curcommlistRec.chgpers).append("</td>");
sb.append("  <td>").append(curcommlistRec.chgdt).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmval_adsc_qty).append("</td>");
sb.append("  <td>").append(curcommlistRec.thmmval_ndsc_qty).append("</td>");
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