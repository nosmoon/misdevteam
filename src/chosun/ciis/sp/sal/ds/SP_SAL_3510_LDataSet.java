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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_cnt;
	public String suc_cnt;
	public String dlco_cnt;
	public String dmang_cnt;
	public String is_cnt;
	public String sale_amt;

	public SP_SAL_3510_LDataSet(){}
	public SP_SAL_3510_LDataSet(String errcode, String errmsg, String tot_cnt, String suc_cnt, String dlco_cnt, String dmang_cnt, String is_cnt, String sale_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_cnt = tot_cnt;
		this.suc_cnt = suc_cnt;
		this.dlco_cnt = dlco_cnt;
		this.dmang_cnt = dmang_cnt;
		this.is_cnt = is_cnt;
		this.sale_amt = sale_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setSuc_cnt(String suc_cnt){
		this.suc_cnt = suc_cnt;
	}

	public void setDlco_cnt(String dlco_cnt){
		this.dlco_cnt = dlco_cnt;
	}

	public void setDmang_cnt(String dmang_cnt){
		this.dmang_cnt = dmang_cnt;
	}

	public void setIs_cnt(String is_cnt){
		this.is_cnt = is_cnt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getSuc_cnt(){
		return this.suc_cnt;
	}

	public String getDlco_cnt(){
		return this.dlco_cnt;
	}

	public String getDmang_cnt(){
		return this.dmang_cnt;
	}

	public String getIs_cnt(){
		return this.is_cnt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_cnt = Util.checkString(cstmt.getString(5));
		this.suc_cnt = Util.checkString(cstmt.getString(6));
		this.dlco_cnt = Util.checkString(cstmt.getString(7));
		this.dmang_cnt = Util.checkString(cstmt.getString(8));
		this.is_cnt = Util.checkString(cstmt.getString(9));
		this.sale_amt = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SP_SAL_3510_LCURLISTRecord rec = new SP_SAL_3510_LCURLISTRecord();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suc_cnt = Util.checkString(rset0.getString("suc_cnt"));
			rec.fal_cnt = Util.checkString(rset0.getString("fal_cnt"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_3510_LDataSet ds = (SP_SAL_3510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_3510_LCURLISTRecord curlistRec = (SP_SAL_3510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_cnt()%>
<%= ds.getSuc_cnt()%>
<%= ds.getDlco_cnt()%>
<%= ds.getDmang_cnt()%>
<%= ds.getIs_cnt()%>
<%= ds.getSale_amt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.suc_cnt%>
<%= curlistRec.fal_cnt%>
<%= curlistRec.tot_cnt%>
<%= curlistRec.sale_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 19 20:50:40 KST 2012 */