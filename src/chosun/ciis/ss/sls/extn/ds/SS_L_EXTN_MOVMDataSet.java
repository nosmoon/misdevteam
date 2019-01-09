/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXTN_MOVMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String boextn;
	public String empextn;
	public String exgextn;
	public String rdrextn;
	public String cybextn;
	public String ccextn;
	public String campextn;
	public String movm;
	public String jmextn;
	public String movmtrsf;
	public long boextncnt;
	public long boisextncnt;
	public long boprvextncnt;
	public long boboextncnt;
	public long empextncnt;
	public long exgextncnt;
	public long rdrextncnt;
	public long cybextncnt;
	public long ccextncnt;
	public long campextncnt;
	public long movmcnt;
	public long jmextncnt;
	public long movmtrsfcnt;
	public long sumcnt;
	public long totalcnt;

	public SS_L_EXTN_MOVMDataSet(){}
	public SS_L_EXTN_MOVMDataSet(String errcode, String errmsg, String boextn, String empextn, String exgextn, String rdrextn, String cybextn, String ccextn, String campextn, String movm, String jmextn, String movmtrsf, long boextncnt, long boisextncnt, long boprvextncnt, long boboextncnt, long empextncnt, long exgextncnt, long rdrextncnt, long cybextncnt, long ccextncnt, long campextncnt, long movmcnt, long jmextncnt, long movmtrsfcnt, long sumcnt, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.boextn = boextn;
		this.empextn = empextn;
		this.exgextn = exgextn;
		this.rdrextn = rdrextn;
		this.cybextn = cybextn;
		this.ccextn = ccextn;
		this.campextn = campextn;
		this.movm = movm;
		this.jmextn = jmextn;
		this.movmtrsf = movmtrsf;
		this.boextncnt = boextncnt;
		this.boisextncnt = boisextncnt;
		this.boprvextncnt = boprvextncnt;
		this.boboextncnt = boboextncnt;
		this.empextncnt = empextncnt;
		this.exgextncnt = exgextncnt;
		this.rdrextncnt = rdrextncnt;
		this.cybextncnt = cybextncnt;
		this.ccextncnt = ccextncnt;
		this.campextncnt = campextncnt;
		this.movmcnt = movmcnt;
		this.jmextncnt = jmextncnt;
		this.movmtrsfcnt = movmtrsfcnt;
		this.sumcnt = sumcnt;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBoextn(String boextn){
		this.boextn = boextn;
	}

	public void setEmpextn(String empextn){
		this.empextn = empextn;
	}

	public void setExgextn(String exgextn){
		this.exgextn = exgextn;
	}

	public void setRdrextn(String rdrextn){
		this.rdrextn = rdrextn;
	}

	public void setCybextn(String cybextn){
		this.cybextn = cybextn;
	}

	public void setCcextn(String ccextn){
		this.ccextn = ccextn;
	}

	public void setCampextn(String campextn){
		this.campextn = campextn;
	}

	public void setMovm(String movm){
		this.movm = movm;
	}

	public void setJmextn(String jmextn){
		this.jmextn = jmextn;
	}

	public void setMovmtrsf(String movmtrsf){
		this.movmtrsf = movmtrsf;
	}

	public void setBoextncnt(long boextncnt){
		this.boextncnt = boextncnt;
	}

	public void setBoisextncnt(long boisextncnt){
		this.boisextncnt = boisextncnt;
	}

	public void setBoprvextncnt(long boprvextncnt){
		this.boprvextncnt = boprvextncnt;
	}

	public void setBoboextncnt(long boboextncnt){
		this.boboextncnt = boboextncnt;
	}

	public void setEmpextncnt(long empextncnt){
		this.empextncnt = empextncnt;
	}

	public void setExgextncnt(long exgextncnt){
		this.exgextncnt = exgextncnt;
	}

	public void setRdrextncnt(long rdrextncnt){
		this.rdrextncnt = rdrextncnt;
	}

	public void setCybextncnt(long cybextncnt){
		this.cybextncnt = cybextncnt;
	}

	public void setCcextncnt(long ccextncnt){
		this.ccextncnt = ccextncnt;
	}

	public void setCampextncnt(long campextncnt){
		this.campextncnt = campextncnt;
	}

	public void setMovmcnt(long movmcnt){
		this.movmcnt = movmcnt;
	}

	public void setJmextncnt(long jmextncnt){
		this.jmextncnt = jmextncnt;
	}

	public void setMovmtrsfcnt(long movmtrsfcnt){
		this.movmtrsfcnt = movmtrsfcnt;
	}

	public void setSumcnt(long sumcnt){
		this.sumcnt = sumcnt;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBoextn(){
		return this.boextn;
	}

	public String getEmpextn(){
		return this.empextn;
	}

	public String getExgextn(){
		return this.exgextn;
	}

	public String getRdrextn(){
		return this.rdrextn;
	}

	public String getCybextn(){
		return this.cybextn;
	}

	public String getCcextn(){
		return this.ccextn;
	}

	public String getCampextn(){
		return this.campextn;
	}

	public String getMovm(){
		return this.movm;
	}

	public String getJmextn(){
		return this.jmextn;
	}

	public String getMovmtrsf(){
		return this.movmtrsf;
	}

	public long getBoextncnt(){
		return this.boextncnt;
	}

	public long getBoisextncnt(){
		return this.boisextncnt;
	}

	public long getBoprvextncnt(){
		return this.boprvextncnt;
	}

	public long getBoboextncnt(){
		return this.boboextncnt;
	}

	public long getEmpextncnt(){
		return this.empextncnt;
	}

	public long getExgextncnt(){
		return this.exgextncnt;
	}

	public long getRdrextncnt(){
		return this.rdrextncnt;
	}

	public long getCybextncnt(){
		return this.cybextncnt;
	}

	public long getCcextncnt(){
		return this.ccextncnt;
	}

	public long getCampextncnt(){
		return this.campextncnt;
	}

	public long getMovmcnt(){
		return this.movmcnt;
	}

	public long getJmextncnt(){
		return this.jmextncnt;
	}

	public long getMovmtrsfcnt(){
		return this.movmtrsfcnt;
	}

	public long getSumcnt(){
		return this.sumcnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.boextn = Util.checkString(cstmt.getString(27));
		this.empextn = Util.checkString(cstmt.getString(28));
		this.exgextn = Util.checkString(cstmt.getString(29));
		this.rdrextn = Util.checkString(cstmt.getString(30));
		this.cybextn = Util.checkString(cstmt.getString(31));
		this.ccextn = Util.checkString(cstmt.getString(32));
		this.campextn = Util.checkString(cstmt.getString(33));
		this.movm = Util.checkString(cstmt.getString(34));
		this.jmextn = Util.checkString(cstmt.getString(35));
		this.movmtrsf = Util.checkString(cstmt.getString(36));
		ResultSet rset0 = (ResultSet) cstmt.getObject(37);
		while(rset0.next()){
			SS_L_EXTN_MOVMCURCOMMLISTRecord rec = new SS_L_EXTN_MOVMCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptcdnm = Util.checkString(rset0.getString("deptcdnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areacdnm = Util.checkString(rset0.getString("areacdnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bocdnm = Util.checkString(rset0.getString("bocdnm"));
			rec.boqty = rset0.getInt("boqty");
			rec.bo_isqty = rset0.getInt("bo_isqty");
			rec.bo_prvqty = rset0.getInt("bo_prvqty");
			rec.bo_boqty = rset0.getInt("bo_boqty");
			rec.empqty = rset0.getInt("empqty");
			rec.cmpyqty = rset0.getInt("cmpyqty");
			rec.exgqty = rset0.getInt("exgqty");
			rec.rdrqty = rset0.getInt("rdrqty");
			rec.cybqty = rset0.getInt("cybqty");
			rec.ccqty = rset0.getInt("ccqty");
			rec.camp_sm_qty = rset0.getInt("camp_sm_qty");
			rec.camp_etc_qty = rset0.getInt("camp_etc_qty");
			rec.campqty = rset0.getInt("campqty");
			rec.movmqty = rset0.getInt("movmqty");
			rec.jmextnqty = rset0.getInt("jmextnqty");
			rec.movmtrsfqty = rset0.getInt("movmtrsfqty");
			rec.nopayqty = rset0.getInt("nopayqty");
			rec.halfpayqty = rset0.getInt("halfpayqty");
			rec.sumqty = rset0.getInt("sumqty");
			rec.subsumqty = rset0.getInt("subsumqty");
			this.curcommlist.add(rec);
		}
		this.boextncnt = cstmt.getLong(38);
		this.boisextncnt = cstmt.getLong(39);
		this.boprvextncnt = cstmt.getLong(40);
		this.boboextncnt = cstmt.getLong(41);
		this.empextncnt = cstmt.getLong(42);
		this.exgextncnt = cstmt.getLong(43);
		this.rdrextncnt = cstmt.getLong(44);
		this.cybextncnt = cstmt.getLong(45);
		this.ccextncnt = cstmt.getLong(46);
		this.campextncnt = cstmt.getLong(47);
		this.movmcnt = cstmt.getLong(48);
		this.jmextncnt = cstmt.getLong(49);
		this.movmtrsfcnt = cstmt.getLong(50);
		this.sumcnt = cstmt.getLong(51);
		this.totalcnt = cstmt.getLong(52);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EXTN_MOVMDataSet ds = (SS_L_EXTN_MOVMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_EXTN_MOVMCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_MOVMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoextn()%>
<%= ds.getEmpextn()%>
<%= ds.getExgextn()%>
<%= ds.getRdrextn()%>
<%= ds.getCybextn()%>
<%= ds.getCcextn()%>
<%= ds.getCampextn()%>
<%= ds.getMovm()%>
<%= ds.getJmextn()%>
<%= ds.getMovmtrsf()%>
<%= ds.getCurcommlist()%>
<%= ds.getBoextncnt()%>
<%= ds.getBoisextncnt()%>
<%= ds.getBoprvextncnt()%>
<%= ds.getBoboextncnt()%>
<%= ds.getEmpextncnt()%>
<%= ds.getExgextncnt()%>
<%= ds.getRdrextncnt()%>
<%= ds.getCybextncnt()%>
<%= ds.getCcextncnt()%>
<%= ds.getCampextncnt()%>
<%= ds.getMovmcnt()%>
<%= ds.getJmextncnt()%>
<%= ds.getMovmtrsfcnt()%>
<%= ds.getSumcnt()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptcdnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areacdnm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bocdnm%>
<%= curcommlistRec.boqty%>
<%= curcommlistRec.bo_isqty%>
<%= curcommlistRec.bo_prvqty%>
<%= curcommlistRec.bo_boqty%>
<%= curcommlistRec.empqty%>
<%= curcommlistRec.exgqty%>
<%= curcommlistRec.rdrqty%>
<%= curcommlistRec.cybqty%>
<%= curcommlistRec.ccqty%>
<%= curcommlistRec.campqty%>
<%= curcommlistRec.movmqty%>
<%= curcommlistRec.jmextnqty%>
<%= curcommlistRec.movmtrsfqty%>
<%= curcommlistRec.nopayqty%>
<%= curcommlistRec.halfpayqty%>
<%= curcommlistRec.sumqty%>
<%= curcommlistRec.subsumqty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 12 11:00:43 KST 2016 */