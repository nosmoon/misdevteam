<%@ page contentType="application/vnd.ms-excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"%>
<%@ page buffer="none"%>
	
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : tn_rpt_1650_l.jsp
* 기능 : 모금보고-약정명단-엑셀다운로드
* 작성일자 : 2017-01-05
* 작성자 : 봉은정
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm 대응.
	//content type이 text/html, text/xml이 아닌 경우 자동으로 download 전환이라고 하나 아래와 같이 이름 지정하지 않으면 제대로 동작하지 않음.
	//response.reset();  //엑셀열리는게이상함
	//response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
	response.setHeader("Content-Disposition","attachment; filename=promiselist.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
	//response.setHeader("Content-Transfer-Encoding", "binary;");
    //response.setHeader("Pragma", "no-cache;");
    //response.setHeader("Expires", "-1;");

    TN_RPT_1600_LDataSet ds = (TN_RPT_1600_LDataSet)request.getAttribute("ds");
%>
<%--
    int Csize = 477;
    //System.out.print(">>>>>>>>>bong시작::");
    //System.out.print(">>>>>>>>>bong::"+ds.curlist.getBytes());
     //System.out.print(">>>>>>>>>bong::"+ds.curlist.length);
     //int stringByteLength = ds.curlist.getBytes();
    //System.out.print(">>>>>>>>>stringByteLength::"+stringByteLength);
	//Csize = stringByteLength + 517;
	
	response.setHeader("Accept-Ranges", "bytes");

	for(int i=0; i<ds.curlist.size(); i++){
	 TN_RPT_1600_LCURLISTRecord curlistRec = (TN_RPT_1600_LCURLISTRecord)ds.curlist.get(i); 
	 Csize = Csize + curlistRec.membercode.getBytes().length;
	 Csize = Csize + curlistRec.name.getBytes().length;
	 Csize = Csize + curlistRec.promisecode.getBytes().length;
	 Csize = Csize + curlistRec.promisedate.getBytes().length;
	 Csize = Csize + curlistRec.promiseprice.getBytes().length;
	 Csize = Csize + curlistRec.paymethodnm.getBytes().length;
	 Csize = Csize + curlistRec.partitiontype.getBytes().length;
	 Csize = Csize + curlistRec.paystartdate.getBytes().length;
	 Csize = Csize + curlistRec.payenddate.getBytes().length;
	 Csize = Csize + curlistRec.monthlypayday.getBytes().length;
	 Csize = Csize + curlistRec.monthlypayprice.getBytes().length;
	 Csize = Csize + curlistRec.partitioncount.getBytes().length;
	 Csize = Csize + curlistRec.onlineproyn.getBytes().length;
	 Csize = Csize + curlistRec.writedate.getBytes().length;
	 Csize = Csize + curlistRec.fund2.getBytes().length;
	 Csize = Csize + 274;	
	}	
	
	Csize = Csize + 26;
	System.out.println(":::"+Csize);
	response.setContentLength(Csize);	
			
	//System.out.print(">>>>>>>>>>>rt_length::"+Csize);
   
--%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" /></head>
<body>
<table border="1">
<tr> 
<td> 회원코드 </td>
<td> 이름 </td>
<td> 약정코드 </td>
<td> 약정일자 </td>
<td> 약정금액 </td>
<td> 납입방식 </td>
<td> 분납방식 </td>
<td> 납입시작일 </td>
<td> 납입종료일 </td>
<td> 월납입일 </td>
<td> 분납액 </td>
<td> 분납횟수 </td>
<td> 온라인약정여부 </td>
<td> 약정등록일 </td>
<td> 기금2차 </td>
</tr>
<%
for(int j=0; j<ds.curlist.size(); j++){
 TN_RPT_1600_LCURLISTRecord curlistRec = (TN_RPT_1600_LCURLISTRecord)ds.curlist.get(j); 
%>
<tr>
<td><%= curlistRec.membercode%>&nbsp;</td>
<td><%= curlistRec.name%>&nbsp;</td>
<td><%= curlistRec.promisecode%>&nbsp;</td>
<td><%= curlistRec.promisedate%>&nbsp;</td>
<td><%= curlistRec.promiseprice%>&nbsp;</td>
<td><%= curlistRec.paymethodnm%>&nbsp;</td>
<td><%= curlistRec.partitiontype%>&nbsp;</td>
<td><%= curlistRec.paystartdate%>&nbsp;</td>	
<td><%= curlistRec.payenddate%>&nbsp;</td>
<td><%= curlistRec.monthlypayday%>&nbsp;</td>
<td><%= curlistRec.monthlypayprice%>&nbsp;</td>
<td><%= curlistRec.partitioncount%>&nbsp;</td>
<td><%= curlistRec.onlineproyn%>&nbsp;</td>
<td><%= curlistRec.writedate%>&nbsp;</td>
<td><%= curlistRec.fund2%>&nbsp;</td>
</tr>
<%
}
%>
</table>
</body>
</html>