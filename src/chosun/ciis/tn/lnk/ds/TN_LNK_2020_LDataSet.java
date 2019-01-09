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


public class TN_LNK_2020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long new_cnt;
	public long new_ok_cnt;
	public long new_err_cnt;
	public long chg_cnt;
	public long chg_ok_cnt;
	public long chg_err_cnt;
	public long rgn_cnt;
	public long rgn_ok_cnt;
	public long rgn_err_cnt;
	public long tot_cnt;

	public TN_LNK_2020_LDataSet(){}
	public TN_LNK_2020_LDataSet(String errcode, String errmsg, long new_cnt, long new_ok_cnt, long new_err_cnt, long chg_cnt, long chg_ok_cnt, long chg_err_cnt, long rgn_cnt, long rgn_ok_cnt, long rgn_err_cnt, long tot_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.new_cnt = new_cnt;
		this.new_ok_cnt = new_ok_cnt;
		this.new_err_cnt = new_err_cnt;
		this.chg_cnt = chg_cnt;
		this.chg_ok_cnt = chg_ok_cnt;
		this.chg_err_cnt = chg_err_cnt;
		this.rgn_cnt = rgn_cnt;
		this.rgn_ok_cnt = rgn_ok_cnt;
		this.rgn_err_cnt = rgn_err_cnt;
		this.tot_cnt = tot_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNew_cnt(long new_cnt){
		this.new_cnt = new_cnt;
	}

	public void setNew_ok_cnt(long new_ok_cnt){
		this.new_ok_cnt = new_ok_cnt;
	}

	public void setNew_err_cnt(long new_err_cnt){
		this.new_err_cnt = new_err_cnt;
	}

	public void setChg_cnt(long chg_cnt){
		this.chg_cnt = chg_cnt;
	}

	public void setChg_ok_cnt(long chg_ok_cnt){
		this.chg_ok_cnt = chg_ok_cnt;
	}

	public void setChg_err_cnt(long chg_err_cnt){
		this.chg_err_cnt = chg_err_cnt;
	}

	public void setRgn_cnt(long rgn_cnt){
		this.rgn_cnt = rgn_cnt;
	}

	public void setRgn_ok_cnt(long rgn_ok_cnt){
		this.rgn_ok_cnt = rgn_ok_cnt;
	}

	public void setRgn_err_cnt(long rgn_err_cnt){
		this.rgn_err_cnt = rgn_err_cnt;
	}

	public void setTot_cnt(long tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getNew_cnt(){
		return this.new_cnt;
	}

	public long getNew_ok_cnt(){
		return this.new_ok_cnt;
	}

	public long getNew_err_cnt(){
		return this.new_err_cnt;
	}

	public long getChg_cnt(){
		return this.chg_cnt;
	}

	public long getChg_ok_cnt(){
		return this.chg_ok_cnt;
	}

	public long getChg_err_cnt(){
		return this.chg_err_cnt;
	}

	public long getRgn_cnt(){
		return this.rgn_cnt;
	}

	public long getRgn_ok_cnt(){
		return this.rgn_ok_cnt;
	}

	public long getRgn_err_cnt(){
		return this.rgn_err_cnt;
	}

	public long getTot_cnt(){
		return this.tot_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.new_cnt = cstmt.getLong(15);
		this.new_ok_cnt = cstmt.getLong(16);
		this.new_err_cnt = cstmt.getLong(17);
		this.chg_cnt = cstmt.getLong(18);
		this.chg_ok_cnt = cstmt.getLong(19);
		this.chg_err_cnt = cstmt.getLong(20);
		this.rgn_cnt = cstmt.getLong(21);
		this.rgn_ok_cnt = cstmt.getLong(22);
		this.rgn_err_cnt = cstmt.getLong(23);
		this.tot_cnt = cstmt.getLong(24);
		ResultSet rset0 = (ResultSet) cstmt.getObject(25);
		while(rset0.next()){
			TN_LNK_2020_LCURLISTRecord rec = new TN_LNK_2020_LCURLISTRecord();
			rec.requestdate = Util.checkString(rset0.getString("requestdate"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.aplc_path = Util.checkString(rset0.getString("aplc_path"));
			rec.support = Util.checkString(rset0.getString("support"));
			rec.aplc_clsf = Util.checkString(rset0.getString("aplc_clsf"));
			rec.cmsstatus = Util.checkString(rset0.getString("cmsstatus"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.bankaccountowner = Util.checkString(rset0.getString("bankaccountowner"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.bankaccount = Util.checkString(rset0.getString("bankaccount"));
			rec.isdelete = Util.checkString(rset0.getString("isdelete"));
			rec.proof_stat = Util.checkString(rset0.getString("proof_stat"));
			rec.result_stat = Util.checkString(rset0.getString("result_stat"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.cmsidx = Util.checkString(rset0.getString("cmsidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_2020_LDataSet ds = (TN_LNK_2020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_2020_LCURLISTRecord curlistRec = (TN_LNK_2020_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNew_cnt()%>
<%= ds.getNew_ok_cnt()%>
<%= ds.getNew_err_cnt()%>
<%= ds.getChg_cnt()%>
<%= ds.getChg_ok_cnt()%>
<%= ds.getChg_err_cnt()%>
<%= ds.getRgn_cnt()%>
<%= ds.getRgn_ok_cnt()%>
<%= ds.getRgn_err_cnt()%>
<%= ds.getTot_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.requestdate%>
<%= curlistRec.paydate%>
<%= curlistRec.aplc_path%>
<%= curlistRec.support%>
<%= curlistRec.aplc_clsf%>
<%= curlistRec.cmsstatus%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.pymt_cd%>
<%= curlistRec.bankaccountowner%>
<%= curlistRec.banknm%>
<%= curlistRec.bankaccount%>
<%= curlistRec.isdelete%>
<%= curlistRec.proof_stat%>
<%= curlistRec.result_stat%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.cmsidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 13 15:18:18 KST 2016 */