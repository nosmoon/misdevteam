/***************************************************************************************************
* 파일명 : SS_S_LEASAMTDataSet.java
* 기능 : 지국Info-전세지원금-상세를 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-전세지원금-상세를 위한 DataSet
 */

public class SS_S_LEASAMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String seq;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String presinm;
	public long hdqtsplyamt;
	public long wholgurtamt;
	public String prvoffideciddocuyn;
	public String curroffideciddocuyn;
	public String prvhdqtdeciddocuyn;
	public String currhdqtdeciddocuyn;
	public String leascntrp;
	public String leasregi;
	public String leasexch_note;
	public String leasloandeed;
	public String bondregiconf;
	public String bondregi;
	public String bondwarrp;
	public long bondprsvamt;
	public String bondprsvkind;
	public String nowchrg;
	public String booffi_roomownr;
	public String booffi_roomrlesindc;
	public String bondprsvobjvolownr;
	public String bondprsvobjvolrlesindc;
	public String leascntrdt;
	public String leasexprdt;
	public String deciddocuno;
	public String remk;

	public SS_S_LEASAMTDataSet(){}
	public SS_S_LEASAMTDataSet(String errcode, String errmsg, String deptcd, String areacd, String bocd, String seq, String deptnm, String areanm, String bonm, String presinm, long hdqtsplyamt, long wholgurtamt, String prvoffideciddocuyn, String curroffideciddocuyn, String prvhdqtdeciddocuyn, String currhdqtdeciddocuyn, String leascntrp, String leasregi, String leasexch_note, String leasloandeed, String bondregiconf, String bondregi, String bondwarrp, long bondprsvamt, String bondprsvkind, String nowchrg, String booffi_roomownr, String booffi_roomrlesindc, String bondprsvobjvolownr, String bondprsvobjvolrlesindc, String leascntrdt, String leasexprdt, String deciddocuno, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.seq = seq;
		this.deptnm = deptnm;
		this.areanm = areanm;
		this.bonm = bonm;
		this.presinm = presinm;
		this.hdqtsplyamt = hdqtsplyamt;
		this.wholgurtamt = wholgurtamt;
		this.prvoffideciddocuyn = prvoffideciddocuyn;
		this.curroffideciddocuyn = curroffideciddocuyn;
		this.prvhdqtdeciddocuyn = prvhdqtdeciddocuyn;
		this.currhdqtdeciddocuyn = currhdqtdeciddocuyn;
		this.leascntrp = leascntrp;
		this.leasregi = leasregi;
		this.leasexch_note = leasexch_note;
		this.leasloandeed = leasloandeed;
		this.bondregiconf = bondregiconf;
		this.bondregi = bondregi;
		this.bondwarrp = bondwarrp;
		this.bondprsvamt = bondprsvamt;
		this.bondprsvkind = bondprsvkind;
		this.nowchrg = nowchrg;
		this.booffi_roomownr = booffi_roomownr;
		this.booffi_roomrlesindc = booffi_roomrlesindc;
		this.bondprsvobjvolownr = bondprsvobjvolownr;
		this.bondprsvobjvolrlesindc = bondprsvobjvolrlesindc;
		this.leascntrdt = leascntrdt;
		this.leasexprdt = leasexprdt;
		this.deciddocuno = deciddocuno;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPresinm(String presinm){
		this.presinm = presinm;
	}

	public void setHdqtsplyamt(long hdqtsplyamt){
		this.hdqtsplyamt = hdqtsplyamt;
	}

	public void setWholgurtamt(long wholgurtamt){
		this.wholgurtamt = wholgurtamt;
	}

	public void setPrvoffideciddocuyn(String prvoffideciddocuyn){
		this.prvoffideciddocuyn = prvoffideciddocuyn;
	}

	public void setCurroffideciddocuyn(String curroffideciddocuyn){
		this.curroffideciddocuyn = curroffideciddocuyn;
	}

	public void setPrvhdqtdeciddocuyn(String prvhdqtdeciddocuyn){
		this.prvhdqtdeciddocuyn = prvhdqtdeciddocuyn;
	}

	public void setCurrhdqtdeciddocuyn(String currhdqtdeciddocuyn){
		this.currhdqtdeciddocuyn = currhdqtdeciddocuyn;
	}

	public void setLeascntrp(String leascntrp){
		this.leascntrp = leascntrp;
	}

	public void setLeasregi(String leasregi){
		this.leasregi = leasregi;
	}

	public void setLeasexch_note(String leasexch_note){
		this.leasexch_note = leasexch_note;
	}

	public void setLeasloandeed(String leasloandeed){
		this.leasloandeed = leasloandeed;
	}

	public void setBondregiconf(String bondregiconf){
		this.bondregiconf = bondregiconf;
	}

	public void setBondregi(String bondregi){
		this.bondregi = bondregi;
	}

	public void setBondwarrp(String bondwarrp){
		this.bondwarrp = bondwarrp;
	}

	public void setBondprsvamt(long bondprsvamt){
		this.bondprsvamt = bondprsvamt;
	}

	public void setBondprsvkind(String bondprsvkind){
		this.bondprsvkind = bondprsvkind;
	}

	public void setNowchrg(String nowchrg){
		this.nowchrg = nowchrg;
	}

	public void setBooffi_roomownr(String booffi_roomownr){
		this.booffi_roomownr = booffi_roomownr;
	}

	public void setBooffi_roomrlesindc(String booffi_roomrlesindc){
		this.booffi_roomrlesindc = booffi_roomrlesindc;
	}

	public void setBondprsvobjvolownr(String bondprsvobjvolownr){
		this.bondprsvobjvolownr = bondprsvobjvolownr;
	}

	public void setBondprsvobjvolrlesindc(String bondprsvobjvolrlesindc){
		this.bondprsvobjvolrlesindc = bondprsvobjvolrlesindc;
	}

	public void setLeascntrdt(String leascntrdt){
		this.leascntrdt = leascntrdt;
	}

	public void setLeasexprdt(String leasexprdt){
		this.leasexprdt = leasexprdt;
	}

	public void setDeciddocuno(String deciddocuno){
		this.deciddocuno = deciddocuno;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPresinm(){
		return this.presinm;
	}

	public long getHdqtsplyamt(){
		return this.hdqtsplyamt;
	}

	public long getWholgurtamt(){
		return this.wholgurtamt;
	}

	public String getPrvoffideciddocuyn(){
		return this.prvoffideciddocuyn;
	}

	public String getCurroffideciddocuyn(){
		return this.curroffideciddocuyn;
	}

	public String getPrvhdqtdeciddocuyn(){
		return this.prvhdqtdeciddocuyn;
	}

	public String getCurrhdqtdeciddocuyn(){
		return this.currhdqtdeciddocuyn;
	}

	public String getLeascntrp(){
		return this.leascntrp;
	}

	public String getLeasregi(){
		return this.leasregi;
	}

	public String getLeasexch_note(){
		return this.leasexch_note;
	}

	public String getLeasloandeed(){
		return this.leasloandeed;
	}

	public String getBondregiconf(){
		return this.bondregiconf;
	}

	public String getBondregi(){
		return this.bondregi;
	}

	public String getBondwarrp(){
		return this.bondwarrp;
	}

	public long getBondprsvamt(){
		return this.bondprsvamt;
	}

	public String getBondprsvkind(){
		return this.bondprsvkind;
	}

	public String getNowchrg(){
		return this.nowchrg;
	}

	public String getBooffi_roomownr(){
		return this.booffi_roomownr;
	}

	public String getBooffi_roomrlesindc(){
		return this.booffi_roomrlesindc;
	}

	public String getBondprsvobjvolownr(){
		return this.bondprsvobjvolownr;
	}

	public String getBondprsvobjvolrlesindc(){
		return this.bondprsvobjvolrlesindc;
	}

	public String getLeascntrdt(){
		return this.leascntrdt;
	}

	public String getLeasexprdt(){
		return this.leasexprdt;
	}

	public String getDeciddocuno(){
		return this.deciddocuno;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.deptcd = Util.checkString(cstmt.getString(7));
		this.areacd = Util.checkString(cstmt.getString(8));
		this.bocd = Util.checkString(cstmt.getString(9));
		this.seq = Util.checkString(cstmt.getString(10));
		this.deptnm = Util.checkString(cstmt.getString(11));
		this.areanm = Util.checkString(cstmt.getString(12));
		this.bonm = Util.checkString(cstmt.getString(13));
		this.presinm = Util.checkString(cstmt.getString(14));
		this.hdqtsplyamt = cstmt.getLong(15);
		this.wholgurtamt = cstmt.getLong(16);
		this.prvoffideciddocuyn = Util.checkString(cstmt.getString(17));
		this.curroffideciddocuyn = Util.checkString(cstmt.getString(18));
		this.prvhdqtdeciddocuyn = Util.checkString(cstmt.getString(19));
		this.currhdqtdeciddocuyn = Util.checkString(cstmt.getString(20));
		this.leascntrp = Util.checkString(cstmt.getString(21));
		this.leasregi = Util.checkString(cstmt.getString(22));
		this.leasexch_note = Util.checkString(cstmt.getString(23));
		this.leasloandeed = Util.checkString(cstmt.getString(24));
		this.bondregiconf = Util.checkString(cstmt.getString(25));
		this.bondregi = Util.checkString(cstmt.getString(26));
		this.bondwarrp = Util.checkString(cstmt.getString(27));
		this.bondprsvamt = cstmt.getLong(28);
		this.bondprsvkind = Util.checkString(cstmt.getString(29));
		this.nowchrg = Util.checkString(cstmt.getString(30));
		this.booffi_roomownr = Util.checkString(cstmt.getString(31));
		this.booffi_roomrlesindc = Util.checkString(cstmt.getString(32));
		this.bondprsvobjvolownr = Util.checkString(cstmt.getString(33));
		this.bondprsvobjvolrlesindc = Util.checkString(cstmt.getString(34));
		this.leascntrdt = Util.checkString(cstmt.getString(35));
		this.leasexprdt = Util.checkString(cstmt.getString(36));
		this.deciddocuno = Util.checkString(cstmt.getString(37));
		this.remk = Util.checkString(cstmt.getString(38));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_LEASAMTDataSet ds = (SS_S_LEASAMTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptcd()%>
<%= ds.getAreacd()%>
<%= ds.getBocd()%>
<%= ds.getSeq()%>
<%= ds.getDeptnm()%>
<%= ds.getAreanm()%>
<%= ds.getBonm()%>
<%= ds.getPresinm()%>
<%= ds.getHdqtsplyamt()%>
<%= ds.getWholgurtamt()%>
<%= ds.getPrvoffideciddocuyn()%>
<%= ds.getCurroffideciddocuyn()%>
<%= ds.getPrvhdqtdeciddocuyn()%>
<%= ds.getCurrhdqtdeciddocuyn()%>
<%= ds.getLeascntrp()%>
<%= ds.getLeasregi()%>
<%= ds.getLeasexch_note()%>
<%= ds.getLeasloandeed()%>
<%= ds.getBondregiconf()%>
<%= ds.getBondregi()%>
<%= ds.getBondwarrp()%>
<%= ds.getBondprsvamt()%>
<%= ds.getBondprsvkind()%>
<%= ds.getNowchrg()%>
<%= ds.getBooffi_roomownr()%>
<%= ds.getBooffi_roomrlesindc()%>
<%= ds.getBondprsvobjvolownr()%>
<%= ds.getBondprsvobjvolrlesindc()%>
<%= ds.getLeascntrdt()%>
<%= ds.getLeasexprdt()%>
<%= ds.getDeciddocuno()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 18:07:45 KST 2004 */