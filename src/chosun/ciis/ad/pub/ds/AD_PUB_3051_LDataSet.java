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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3051_LDataSet(){}
	public AD_PUB_3051_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_PUB_3051_LCURLISTRecord rec = new AD_PUB_3051_LCURLISTRecord();
			rec.grp_cmpy_cd = Util.checkString(rset0.getString("grp_cmpy_cd"));
			rec.grp_cmpy_nm = Util.checkString(rset0.getString("grp_cmpy_nm"));
			rec.advt_fee_1 = Util.checkString(rset0.getString("advt_fee_1"));
			rec.advt_fee_2 = Util.checkString(rset0.getString("advt_fee_2"));
			rec.suply_amt_1 = Util.checkString(rset0.getString("suply_amt_1"));
			rec.suply_amt_2 = Util.checkString(rset0.getString("suply_amt_2"));
			rec.suply_amt_3 = Util.checkString(rset0.getString("suply_amt_3"));
			rec.suply_amt_4 = Util.checkString(rset0.getString("suply_amt_4"));
			rec.suply_amt_5 = Util.checkString(rset0.getString("suply_amt_5"));
			rec.suply_amt_6 = Util.checkString(rset0.getString("suply_amt_6"));
			rec.suply_amt_7 = Util.checkString(rset0.getString("suply_amt_7"));
			rec.hap1 = Util.checkString(rset0.getString("hap1"));
			rec.advt_fee_11 = Util.checkString(rset0.getString("advt_fee_11"));
			rec.advt_fee_22 = Util.checkString(rset0.getString("advt_fee_22"));
			rec.suply_amt_11 = Util.checkString(rset0.getString("suply_amt_11"));
			rec.suply_amt_22 = Util.checkString(rset0.getString("suply_amt_22"));
			rec.suply_amt_33 = Util.checkString(rset0.getString("suply_amt_33"));
			rec.suply_amt_44 = Util.checkString(rset0.getString("suply_amt_44"));
			rec.suply_amt_55 = Util.checkString(rset0.getString("suply_amt_55"));
			rec.suply_amt_66 = Util.checkString(rset0.getString("suply_amt_66"));
			rec.suply_amt_77 = Util.checkString(rset0.getString("suply_amt_77"));
			rec.hap2 = Util.checkString(rset0.getString("hap2"));
			rec.diff = Util.checkString(rset0.getString("diff"));
			rec.diff_ratio = Util.checkString(rset0.getString("diff_ratio"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3051_LDataSet ds = (AD_PUB_3051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3051_LCURLISTRecord curlistRec = (AD_PUB_3051_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.grp_cmpy_cd%>
<%= curlistRec.grp_cmpy_nm%>
<%= curlistRec.advt_fee_1%>
<%= curlistRec.advt_fee_2%>
<%= curlistRec.suply_amt_1%>
<%= curlistRec.suply_amt_2%>
<%= curlistRec.suply_amt_3%>
<%= curlistRec.suply_amt_4%>
<%= curlistRec.suply_amt_5%>
<%= curlistRec.suply_amt_6%>
<%= curlistRec.suply_amt_7%>
<%= curlistRec.hap1%>
<%= curlistRec.advt_fee_11%>
<%= curlistRec.advt_fee_22%>
<%= curlistRec.suply_amt_11%>
<%= curlistRec.suply_amt_22%>
<%= curlistRec.suply_amt_33%>
<%= curlistRec.suply_amt_44%>
<%= curlistRec.suply_amt_55%>
<%= curlistRec.suply_amt_66%>
<%= curlistRec.suply_amt_77%>
<%= curlistRec.hap2%>
<%= curlistRec.diff%>
<%= curlistRec.diff_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 15:45:25 KST 2017 */