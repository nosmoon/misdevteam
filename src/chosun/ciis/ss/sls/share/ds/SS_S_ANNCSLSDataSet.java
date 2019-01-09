/***************************************************************************************************
* 파일명 : SS_S_ANNCSLSDataSet.java
* 기능 : 정보공유-실시간 판매국공지-상세를 위한 DataSet
* 작성일자 : 2004-07-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간 판매국공지-상세를 위한 DataSet
 */


public class SS_S_ANNCSLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long seq;
	public String makepersid;
	public String makepersnm;
	public String posicd;
	public String posinm;
	public String deptcd;
	public String deptnm;
	public String rmsgclsf;
	public String rmsgdept;
	public String rmsgdeptnm;
	public String anncbgntm_date;
	public String anncbgntm_time;
	public String anncendtm_date;
	public String anncendtm_time;
	public String annctitl;
	public String annccont;

	public SS_S_ANNCSLSDataSet(){}
	public SS_S_ANNCSLSDataSet(String errcode, String errmsg, long seq, String makepersid, String makepersnm, String posicd, String posinm, String deptcd, String deptnm, String rmsgclsf, String rmsgdept, String rmsgdeptnm, String anncbgntm_date, String anncbgntm_time, String anncendtm_date, String anncendtm_time, String annctitl, String annccont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.posicd = posicd;
		this.posinm = posinm;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.rmsgclsf = rmsgclsf;
		this.rmsgdept = rmsgdept;
		this.rmsgdeptnm = rmsgdeptnm;
		this.anncbgntm_date = anncbgntm_date;
		this.anncbgntm_time = anncbgntm_time;
		this.anncendtm_date = anncendtm_date;
		this.anncendtm_time = anncendtm_time;
		this.annctitl = annctitl;
		this.annccont = annccont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setPosicd(String posicd){
		this.posicd = posicd;
	}

	public void setPosinm(String posinm){
		this.posinm = posinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setRmsgclsf(String rmsgclsf){
		this.rmsgclsf = rmsgclsf;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgdeptnm(String rmsgdeptnm){
		this.rmsgdeptnm = rmsgdeptnm;
	}

	public void setAnncbgntm_date(String anncbgntm_date){
		this.anncbgntm_date = anncbgntm_date;
	}

	public void setAnncbgntm_time(String anncbgntm_time){
		this.anncbgntm_time = anncbgntm_time;
	}

	public void setAnncendtm_date(String anncendtm_date){
		this.anncendtm_date = anncendtm_date;
	}

	public void setAnncendtm_time(String anncendtm_time){
		this.anncendtm_time = anncendtm_time;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getPosicd(){
		return this.posicd;
	}

	public String getPosinm(){
		return this.posinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getRmsgclsf(){
		return this.rmsgclsf;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgdeptnm(){
		return this.rmsgdeptnm;
	}

	public String getAnncbgntm_date(){
		return this.anncbgntm_date;
	}

	public String getAnncbgntm_time(){
		return this.anncbgntm_time;
	}

	public String getAnncendtm_date(){
		return this.anncendtm_date;
	}

	public String getAnncendtm_time(){
		return this.anncendtm_time;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(4);
		this.makepersid = Util.checkString(cstmt.getString(5));
		this.makepersnm = Util.checkString(cstmt.getString(6));
		this.posicd = Util.checkString(cstmt.getString(7));
		this.posinm = Util.checkString(cstmt.getString(8));
		this.deptcd = Util.checkString(cstmt.getString(9));
		this.deptnm = Util.checkString(cstmt.getString(10));
		this.rmsgclsf = Util.checkString(cstmt.getString(11));
		this.rmsgdept = Util.checkString(cstmt.getString(12));
		this.rmsgdeptnm = Util.checkString(cstmt.getString(13));
		this.anncbgntm_date = Util.checkString(cstmt.getString(14));
		this.anncbgntm_time = Util.checkString(cstmt.getString(15));
		this.anncendtm_date = Util.checkString(cstmt.getString(16));
		this.anncendtm_time = Util.checkString(cstmt.getString(17));
		this.annctitl = Util.checkString(cstmt.getString(18));
		this.annccont = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_ANNCSLSDataSet ds = (SS_S_ANNCSLSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getMakepersid()%>
<%= ds.getMakepersnm()%>
<%= ds.getPosicd()%>
<%= ds.getPosinm()%>
<%= ds.getDeptcd()%>
<%= ds.getDeptnm()%>
<%= ds.getRmsgclsf()%>
<%= ds.getRmsgdept()%>
<%= ds.getRmsgdeptnm()%>
<%= ds.getAnncbgntm_date()%>
<%= ds.getAnncbgntm_time()%>
<%= ds.getAnncendtm_date()%>
<%= ds.getAnncendtm_time()%>
<%= ds.getAnnctitl()%>
<%= ds.getAnnccont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 20 19:34:37 KST 2004 */