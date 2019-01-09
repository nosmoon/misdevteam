/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매지국-통신실-아파트 투입현황(매체약어팝업)
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */

public class SS_S_ASREQDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bonm;
	public String eqpno;
	public String computernm;
	public String modlcd;
	public String kndcd;
	public String makecmpy;
	public String os;
	public String memolicapa;
	public String hddcapa;
	public String monitormakecmpy;
	public String monitormodl;
	public String monitorsize;
	public String printerkind;
	public String printermakecmpy;
	public String printermodl;
	public String as_stat;
	public String remk;
	public String req_rmk;

	public SS_S_ASREQDataSet(){}
	public SS_S_ASREQDataSet(String errcode, String errmsg, String bonm, String eqpno, String computernm, String modlcd, String kndcd, String makecmpy, String os, String memolicapa, String hddcapa, String monitormakecmpy, String monitormodl, String monitorsize, String printerkind, String printermakecmpy, String printermodl, String as_stat, String remk, String req_rmk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bonm = bonm;
		this.eqpno = eqpno;
		this.computernm = computernm;
		this.modlcd = modlcd;
		this.kndcd = kndcd;
		this.makecmpy = makecmpy;
		this.os = os;
		this.memolicapa = memolicapa;
		this.hddcapa = hddcapa;
		this.monitormakecmpy = monitormakecmpy;
		this.monitormodl = monitormodl;
		this.monitorsize = monitorsize;
		this.printerkind = printerkind;
		this.printermakecmpy = printermakecmpy;
		this.printermodl = printermodl;
		this.as_stat = as_stat;
		this.remk = remk;
		this.req_rmk = req_rmk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setEqpno(String eqpno){
		this.eqpno = eqpno;
	}

	public void setComputernm(String computernm){
		this.computernm = computernm;
	}

	public void setModlcd(String modlcd){
		this.modlcd = modlcd;
	}

	public void setKndcd(String kndcd){
		this.kndcd = kndcd;
	}

	public void setMakecmpy(String makecmpy){
		this.makecmpy = makecmpy;
	}

	public void setOs(String os){
		this.os = os;
	}

	public void setMemolicapa(String memolicapa){
		this.memolicapa = memolicapa;
	}

	public void setHddcapa(String hddcapa){
		this.hddcapa = hddcapa;
	}

	public void setMonitormakecmpy(String monitormakecmpy){
		this.monitormakecmpy = monitormakecmpy;
	}

	public void setMonitormodl(String monitormodl){
		this.monitormodl = monitormodl;
	}

	public void setMonitorsize(String monitorsize){
		this.monitorsize = monitorsize;
	}

	public void setPrinterkind(String printerkind){
		this.printerkind = printerkind;
	}

	public void setPrintermakecmpy(String printermakecmpy){
		this.printermakecmpy = printermakecmpy;
	}

	public void setPrintermodl(String printermodl){
		this.printermodl = printermodl;
	}

	public void setAs_stat(String as_stat){
		this.as_stat = as_stat;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setReq_rmk(String req_rmk){
		this.req_rmk = req_rmk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getEqpno(){
		return this.eqpno;
	}

	public String getComputernm(){
		return this.computernm;
	}

	public String getModlcd(){
		return this.modlcd;
	}

	public String getKndcd(){
		return this.kndcd;
	}

	public String getMakecmpy(){
		return this.makecmpy;
	}

	public String getOs(){
		return this.os;
	}

	public String getMemolicapa(){
		return this.memolicapa;
	}

	public String getHddcapa(){
		return this.hddcapa;
	}

	public String getMonitormakecmpy(){
		return this.monitormakecmpy;
	}

	public String getMonitormodl(){
		return this.monitormodl;
	}

	public String getMonitorsize(){
		return this.monitorsize;
	}

	public String getPrinterkind(){
		return this.printerkind;
	}

	public String getPrintermakecmpy(){
		return this.printermakecmpy;
	}

	public String getPrintermodl(){
		return this.printermodl;
	}

	public String getAs_stat(){
		return this.as_stat;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getReq_rmk(){
		return this.req_rmk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bonm = Util.checkString(cstmt.getString(8));
		this.eqpno = Util.checkString(cstmt.getString(9));
		this.computernm = Util.checkString(cstmt.getString(10));
		this.modlcd = Util.checkString(cstmt.getString(11));
		this.kndcd = Util.checkString(cstmt.getString(12));
		this.makecmpy = Util.checkString(cstmt.getString(13));
		this.os = Util.checkString(cstmt.getString(14));
		this.memolicapa = Util.checkString(cstmt.getString(15));
		this.hddcapa = Util.checkString(cstmt.getString(16));
		this.monitormakecmpy = Util.checkString(cstmt.getString(17));
		this.monitormodl = Util.checkString(cstmt.getString(18));
		this.monitorsize = Util.checkString(cstmt.getString(19));
		this.printerkind = Util.checkString(cstmt.getString(20));
		this.printermakecmpy = Util.checkString(cstmt.getString(21));
		this.printermodl = Util.checkString(cstmt.getString(22));
		this.as_stat = Util.checkString(cstmt.getString(23));
		this.remk = Util.checkString(cstmt.getString(24));
		this.req_rmk = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_ASREQDataSet ds = (SS_S_ASREQDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBonm()%>
<%= ds.getEqpno()%>
<%= ds.getComputernm()%>
<%= ds.getModlcd()%>
<%= ds.getKndcd()%>
<%= ds.getMakecmpy()%>
<%= ds.getOs()%>
<%= ds.getMemolicapa()%>
<%= ds.getHddcapa()%>
<%= ds.getMonitormakecmpy()%>
<%= ds.getMonitormodl()%>
<%= ds.getMonitorsize()%>
<%= ds.getPrinterkind()%>
<%= ds.getPrintermakecmpy()%>
<%= ds.getPrintermodl()%>
<%= ds.getAs_stat()%>
<%= ds.getRemk()%>
<%= ds.getReq_rmk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 16 17:36:09 KST 2004 */