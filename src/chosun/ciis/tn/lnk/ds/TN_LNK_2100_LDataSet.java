/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String deptidx;
	public String deptnm;
	public String organcode;
	public String organpayaccount;
	public String organrootaccount;
	public String description;
	public String uselink;
	public String linktest;
	public String aplcfile_path;
	public String payfile_path;
	public String paydate;

	public TN_LNK_2100_LDataSet(){}
	public TN_LNK_2100_LDataSet(String errcode, String errmsg, String deptidx, String deptnm, String organcode, String organpayaccount, String organrootaccount, String description, String uselink, String linktest, String aplcfile_path, String payfile_path, String paydate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.deptidx = deptidx;
		this.deptnm = deptnm;
		this.organcode = organcode;
		this.organpayaccount = organpayaccount;
		this.organrootaccount = organrootaccount;
		this.description = description;
		this.uselink = uselink;
		this.linktest = linktest;
		this.aplcfile_path = aplcfile_path;
		this.payfile_path = payfile_path;
		this.paydate = paydate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setOrgancode(String organcode){
		this.organcode = organcode;
	}

	public void setOrganpayaccount(String organpayaccount){
		this.organpayaccount = organpayaccount;
	}

	public void setOrganrootaccount(String organrootaccount){
		this.organrootaccount = organrootaccount;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setUselink(String uselink){
		this.uselink = uselink;
	}

	public void setLinktest(String linktest){
		this.linktest = linktest;
	}

	public void setAplcfile_path(String aplcfile_path){
		this.aplcfile_path = aplcfile_path;
	}

	public void setPayfile_path(String payfile_path){
		this.payfile_path = payfile_path;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getOrgancode(){
		return this.organcode;
	}

	public String getOrganpayaccount(){
		return this.organpayaccount;
	}

	public String getOrganrootaccount(){
		return this.organrootaccount;
	}

	public String getDescription(){
		return this.description;
	}

	public String getUselink(){
		return this.uselink;
	}

	public String getLinktest(){
		return this.linktest;
	}

	public String getAplcfile_path(){
		return this.aplcfile_path;
	}

	public String getPayfile_path(){
		return this.payfile_path;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.deptidx = Util.checkString(cstmt.getString(4));
		this.deptnm = Util.checkString(cstmt.getString(5));
		this.organcode = Util.checkString(cstmt.getString(6));
		this.organpayaccount = Util.checkString(cstmt.getString(7));
		this.organrootaccount = Util.checkString(cstmt.getString(8));
		this.description = Util.checkString(cstmt.getString(9));
		this.uselink = Util.checkString(cstmt.getString(10));
		this.linktest = Util.checkString(cstmt.getString(11));
		this.aplcfile_path = Util.checkString(cstmt.getString(12));
		this.payfile_path = Util.checkString(cstmt.getString(13));
		this.paydate = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_2100_LDataSet ds = (TN_LNK_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptidx()%>
<%= ds.getDeptnm()%>
<%= ds.getOrgancode()%>
<%= ds.getOrganpayaccount()%>
<%= ds.getOrganrootaccount()%>
<%= ds.getDescription()%>
<%= ds.getUselink()%>
<%= ds.getLinktest()%>
<%= ds.getAplcpath()%>
<%= ds.getPaypath()%>
<%= ds.getPaydate()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 19 16:46:26 KST 2016 */