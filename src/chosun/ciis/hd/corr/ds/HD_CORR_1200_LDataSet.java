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


package chosun.ciis.hd.corr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.rec.*;

/**
 * 
 */


public class HD_CORR_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_CORR_1200_LDataSet(){}
	public HD_CORR_1200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_CORR_1200_LCURLISTRecord rec = new HD_CORR_1200_LCURLISTRecord();
			rec.pay_yymm = Util.checkString(rset0.getString("pay_yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.duty_area = Util.checkString(rset0.getString("duty_area"));
			rec.duty_area_nm = Util.checkString(rset0.getString("duty_area_nm"));
			rec.total_sum = Util.checkString(rset0.getString("total_sum"));
			rec.cd_10 = Util.checkString(rset0.getString("cd_10"));
			rec.cd_12 = Util.checkString(rset0.getString("cd_12"));
			rec.cd_14 = Util.checkString(rset0.getString("cd_14"));
			rec.cd_16 = Util.checkString(rset0.getString("cd_16"));
			rec.cd_18 = Util.checkString(rset0.getString("cd_18"));
			rec.cd_20 = Util.checkString(rset0.getString("cd_20"));
			rec.cd_22 = Util.checkString(rset0.getString("cd_22"));
			rec.cd_24 = Util.checkString(rset0.getString("cd_24"));
			rec.cd_26 = Util.checkString(rset0.getString("cd_26"));
			rec.cd_28 = Util.checkString(rset0.getString("cd_28"));
			rec.cd_30 = Util.checkString(rset0.getString("cd_30"));
			rec.cd_32 = Util.checkString(rset0.getString("cd_32"));
			rec.cd_34 = Util.checkString(rset0.getString("cd_34"));
			rec.cd_36 = Util.checkString(rset0.getString("cd_36"));
			rec.cd_38 = Util.checkString(rset0.getString("cd_38"));
			rec.cd_40 = Util.checkString(rset0.getString("cd_40"));
			rec.cd_42 = Util.checkString(rset0.getString("cd_42"));
			rec.cd_44 = Util.checkString(rset0.getString("cd_44"));
			rec.cd_46 = Util.checkString(rset0.getString("cd_46"));
			rec.cd_48 = Util.checkString(rset0.getString("cd_48"));
			rec.cd_50 = Util.checkString(rset0.getString("cd_50"));
			rec.cd_52 = Util.checkString(rset0.getString("cd_52"));
			rec.cd_54 = Util.checkString(rset0.getString("cd_54"));
			rec.cd_56 = Util.checkString(rset0.getString("cd_56"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_CORR_1200_LDataSet ds = (HD_CORR_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_CORR_1200_LCURLISTRecord curlistRec = (HD_CORR_1200_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.natn_cd%>
<%= curlistRec.natn_nm%>
<%= curlistRec.duty_area%>
<%= curlistRec.duty_area_nm%>
<%= curlistRec.total_sum%>
<%= curlistRec.cd_10%>
<%= curlistRec.cd_12%>
<%= curlistRec.cd_14%>
<%= curlistRec.cd_16%>
<%= curlistRec.cd_18%>
<%= curlistRec.cd_20%>
<%= curlistRec.cd_22%>
<%= curlistRec.cd_24%>
<%= curlistRec.cd_26%>
<%= curlistRec.cd_28%>
<%= curlistRec.cd_30%>
<%= curlistRec.cd_32%>
<%= curlistRec.cd_34%>
<%= curlistRec.cd_36%>
<%= curlistRec.cd_38%>
<%= curlistRec.cd_40%>
<%= curlistRec.cd_42%>
<%= curlistRec.cd_44%>
<%= curlistRec.cd_46%>
<%= curlistRec.cd_48%>
<%= curlistRec.cd_50%>
<%= curlistRec.cd_52%>
<%= curlistRec.cd_54%>
<%= curlistRec.cd_56%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 10:02:19 KST 2009 */