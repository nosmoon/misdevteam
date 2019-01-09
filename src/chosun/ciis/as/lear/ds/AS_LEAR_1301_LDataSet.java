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


package chosun.ciis.as.lear.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAR_1301_LDataSet(){}
	public AS_LEAR_1301_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_LEAR_1301_LCURLISTRecord rec = new AS_LEAR_1301_LCURLISTRecord();
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.ser_no = Util.checkString(rset0.getString("ser_no"));
			rec.leas_size = Util.checkString(rset0.getString("leas_size"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.day_fr = Util.checkString(rset0.getString("day_fr"));
			rec.day_to2 = Util.checkString(rset0.getString("day_to2"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.gurt_int_amt = Util.checkString(rset0.getString("gurt_int_amt"));
			rec.mon_clam_amt = Util.checkString(rset0.getString("mon_clam_amt"));
			rec.out_date = Util.checkString(rset0.getString("out_date"));
			rec.tax_cnt = Util.checkString(rset0.getString("tax_cnt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.leas_clam_cycl = Util.checkString(rset0.getString("leas_clam_cycl"));
			rec.mang_clam_cycl = Util.checkString(rset0.getString("mang_clam_cycl"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAR_1301_LDataSet ds = (AS_LEAR_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAR_1301_LCURLISTRecord curlistRec = (AS_LEAR_1301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bldg_nm%>
<%= curlistRec.ser_no%>
<%= curlistRec.leas_size%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.day_fr%>
<%= curlistRec.day_to2%>
<%= curlistRec.cntr_gurt_amt%>
<%= curlistRec.cntr_leas_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.gurt_int_amt%>
<%= curlistRec.mon_clam_amt%>
<%= curlistRec.out_date%>
<%= curlistRec.tax_cnt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.bldg_cd%>
<%= curlistRec.cntr_yy%>
<%= curlistRec.cntr_seq%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.leas_clam_cycl%>
<%= curlistRec.mang_clam_cycl%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 17:44:15 KST 2009 */