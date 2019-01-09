/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class TN_LNK_1151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tcnt;
	public String cnt1;
	public String cnt24;
	public String cnt3;
	public String file_nm;
	public String dept_idx;
	public String excl_type;
	public String title;
	public String upload;
	public String file_yn;

	public TN_LNK_1151_LDataSet(){}
	public TN_LNK_1151_LDataSet(String errcode, String errmsg, String tcnt, String cnt1, String cnt24, String cnt3, String file_nm, String dept_idx, String excl_type, String title, String upload, String file_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tcnt = tcnt;
		this.cnt1 = cnt1;
		this.cnt24 = cnt24;
		this.cnt3 = cnt3;
		this.file_nm = file_nm;
		this.dept_idx = dept_idx;
		this.excl_type = excl_type;
		this.title = title;
		this.upload = upload;
		this.file_yn = file_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTcnt(String tcnt){
		this.tcnt = tcnt;
	}

	public void setCnt1(String cnt1){
		this.cnt1 = cnt1;
	}

	public void setCnt24(String cnt24){
		this.cnt24 = cnt24;
	}

	public void setCnt3(String cnt3){
		this.cnt3 = cnt3;
	}

	public void setFile_nm(String file_nm){
		this.file_nm = file_nm;
	}

	public void setDept_idx(String dept_idx){
		this.dept_idx = dept_idx;
	}

	public void setExcl_type(String excl_type){
		this.excl_type = excl_type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setUpload(String upload){
		this.upload = upload;
	}

	public void setFile_yn(String file_yn){
		this.file_yn = file_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTcnt(){
		return this.tcnt;
	}

	public String getCnt1(){
		return this.cnt1;
	}

	public String getCnt24(){
		return this.cnt24;
	}

	public String getCnt3(){
		return this.cnt3;
	}

	public String getFile_nm(){
		return this.file_nm;
	}

	public String getDept_idx(){
		return this.dept_idx;
	}

	public String getExcl_type(){
		return this.excl_type;
	}

	public String getTitle(){
		return this.title;
	}

	public String getUpload(){
		return this.upload;
	}

	public String getFile_yn(){
		return this.file_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tcnt = Util.checkString(cstmt.getString(5));
		this.cnt1 = Util.checkString(cstmt.getString(6));
		this.cnt24 = Util.checkString(cstmt.getString(7));
		this.cnt3 = Util.checkString(cstmt.getString(8));
		this.file_nm = Util.checkString(cstmt.getString(9));
		this.dept_idx = Util.checkString(cstmt.getString(10));
		this.excl_type = Util.checkString(cstmt.getString(11));
		this.title = Util.checkString(cstmt.getString(12));
		this.upload = Util.checkString(cstmt.getString(13));
		this.file_yn = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			TN_LNK_1151_LCURLISTRecord rec = new TN_LNK_1151_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.inpt_type = Util.checkString(rset0.getString("inpt_type"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.fund_idx = Util.checkString(rset0.getString("fund_idx"));
			rec.suprt_idx = Util.checkString(rset0.getString("suprt_idx"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.prms_cd = Util.checkString(rset0.getString("prms_cd"));
			rec.prms_amt = Util.checkString(rset0.getString("prms_amt"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1151_LDataSet ds = (TN_LNK_1151_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1151_LCURLISTRecord curlistRec = (TN_LNK_1151_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTcnt()%>
<%= ds.getCnt1()%>
<%= ds.getCnt24()%>
<%= ds.getCnt3()%>
<%= ds.getFile_nm()%>
<%= ds.getDept_idx()%>
<%= ds.getExcl_type()%>
<%= ds.getTitle()%>
<%= ds.getUpload()%>
<%= ds.getFile_yn()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.inpt_type%>
<%= curlistRec.name%>
<%= curlistRec.fund_idx%>
<%= curlistRec.suprt_idx%>
<%= curlistRec.memb_cd%>
<%= curlistRec.prms_cd%>
<%= curlistRec.prms_amt%>
<%= curlistRec.pay_dt%>
<%= curlistRec.pay_amt%>
<%= curlistRec.status%>
<%= curlistRec.memo%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 18 14:36:24 KST 2016 */