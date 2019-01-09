<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1665_p.jsp
* 기능 : 확장현황-사이버확장-수당-인쇄
* 작성일자 : 2004-09-14
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOCLOS_2DataSet ds = (SS_L_BOCLOS_2DataSet)request.getAttribute("ds");
%>

<html>
<head>
<style>
<!--

.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}

-->
</style>
</head>

<body>

<table>
 <tr>
	<td class=xl26 style='border-top:none;border-left:none'>부서</td>
	<td class=xl26 style='border-top:none;border-left:none'>파트</td>
	<td class=xl26 style='border-top:none;border-left:none'>지역</td>
	<td class=xl26 style='border-top:none;border-left:none'>지국명</td>
	<td class=xl26 style='border-top:none;border-left:none'>대행여부</td>
	<td class=xl26 style='border-top:none;border-left:none'>판매망구분</td>
	<td class=xl26 style='border-top:none;border-left:none'>구역코드</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장신청</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장직원</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장요원</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장이전</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장본사</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장품앗이</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장권유</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장기타</td>
	<td class=xl26 style='border-top:none;border-left:none'>확장율</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지이사</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지거절</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지타지</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타1</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타2</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타3</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타4</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지율</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지신청</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지직원</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지요원</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지이전</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지본사</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지품앗이</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지권유확장</td>
	<td class=xl26 style='border-top:none;border-left:none'>중지기타확장</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월발송부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월유가부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수1</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수2</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수3</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수4</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수5</td>
	<td class=xl26 style='border-top:none;border-left:none'>후수6</td>
	<td class=xl26 style='border-top:none;border-left:none'>초과후수6</td>
	<td class=xl26 style='border-top:none;border-left:none'>아파트부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>연립부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>주택부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>사무실부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>상가부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>기타부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>홍보지</td>
	<td class=xl26 style='border-top:none;border-left:none'>본사기증지</td>
	<td class=xl26 style='border-top:none;border-left:none'>지국기증지</td>
	<td class=xl26 style='border-top:none;border-left:none'>강투지</td>
	<td class=xl26 style='border-top:none;border-left:none'>기타무료지</td>
	<td class=xl26 style='border-top:none;border-left:none'>예비지</td>
	<td class=xl26 style='border-top:none;border-left:none'>쿠폰</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월무가부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>현미수부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>조정부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>재무부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>결손부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>선불부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>휴독부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>현미수금</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월할인금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월우송료</td>
	<td class=xl26 style='border-top:none;border-left:none'>조정액</td>
	<td class=xl26 style='border-top:none;border-left:none'>재무금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>결손금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>선불금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>휴독금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>지로수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>방문수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>지로자동이체수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>신한카드이체수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>일반카드이체수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>온라인결제수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>기타수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>미수입금</td>
	<td class=xl26 style='border-top:none;border-left:none'>신수입금</td>
	<td class=xl26 style='border-top:none;border-left:none'>선입금</td>
	<td class=xl26 style='border-top:none;border-left:none'>지역전단수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>조선IS전단수금액</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월자동이체할인부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>당월일반할인부수</td>
	<td class=xl26 style='border-top:none;border-left:none'>미수</td>
 </tr>
 
<%	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOCLOS_2CURCOMMLISTRecord curcommlistRec = (SS_L_BOCLOS_2CURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr>
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.partnm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>               
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.oprenvclsfcd%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.sellnetclsf%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.dstccd%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnaplc%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnemp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnstaf%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnrdr_movm%></td>   
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnhdqt%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnexg%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extncnvs%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnetc%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnrate%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspmovm%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprefu%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspothnwsp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc1%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc2%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc3%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc4%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprate%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspaplc%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspemp%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspstaf%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprdr_movm%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susphdqt%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspexg%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspcnvsrdr_extn%></td>   
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetcrdr_extn%></td>    
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmsendqty%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmvalqty%></td>         
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt1%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt2%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt3%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt4%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt5%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt6%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.excsaftcnt6%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aptqty%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.villaqty%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.housqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.offi_roomqty%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.shopqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.etcqty%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.pub_infonwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.hdqt_dntnwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bodntnwsp%></td>          
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.frc_thrwnwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.etcfreenwsp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resvnwsp%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cupn%></td>               
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmno_valqty%></td>      
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.nowun_recpqty%></td>      
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medaqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.re_freeqty%></td>         
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.lossqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.ppymqty%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.temp_stopqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.misu%></td>
 </tr>
<%}%> 
</table>

</body>

</html>
