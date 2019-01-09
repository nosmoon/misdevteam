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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1500_LDataSet(){}
	public HD_SALY_1500_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1500_LCURLISTRecord rec = new HD_SALY_1500_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.base_saly_be = Util.checkString(rset0.getString("base_saly_be"));
			rec.base_saly_nw = Util.checkString(rset0.getString("base_saly_nw"));
			rec.posk_saly_be = Util.checkString(rset0.getString("posk_saly_be"));
			rec.posk_saly_nw = Util.checkString(rset0.getString("posk_saly_nw"));
			rec.rgla_saly_be = Util.checkString(rset0.getString("rgla_saly_be"));
			rec.rgla_saly_nw = Util.checkString(rset0.getString("rgla_saly_nw"));
			rec.dty_alon_be = Util.checkString(rset0.getString("dty_alon_be"));
			rec.dty_alon_nw = Util.checkString(rset0.getString("dty_alon_nw"));
			rec.posk_alon_be = Util.checkString(rset0.getString("posk_alon_be"));
			rec.posk_alon_nw = Util.checkString(rset0.getString("posk_alon_nw"));
			rec.food_alon_be = Util.checkString(rset0.getString("food_alon_be"));
			rec.food_alon_nw = Util.checkString(rset0.getString("food_alon_nw"));
			rec.care_alon_be = Util.checkString(rset0.getString("care_alon_be"));
			rec.care_alon_nw = Util.checkString(rset0.getString("care_alon_nw"));
			rec.evngt_saly_be = Util.checkString(rset0.getString("evngt_saly_be"));
			rec.evngt_saly_nw = Util.checkString(rset0.getString("evngt_saly_nw"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1500_LDataSet ds = (HD_SALY_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1500_LCURLISTRecord curlistRec = (HD_SALY_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.dept_nm%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.base_saly_be%>
<%= curlistRec.base_saly_nw%>
<%= curlistRec.posk_saly_be%>
<%= curlistRec.posk_saly_nw%>
<%= curlistRec.rgla_saly_be%>
<%= curlistRec.rgla_saly_nw%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 11:12:22 KST 2009 */