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


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1010_LDataSet(){}
	public SE_BNS_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_BNS_1010_LCURLISTRecord rec = new SE_BNS_1010_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bns_item_cd = Util.checkString(rset0.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset0.getString("bns_item_nm"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.compen_divn_amt = Util.checkString(rset0.getString("compen_divn_amt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			rec.cyov_compen_divn_amt = Util.checkString(rset0.getString("cyov_compen_divn_amt"));
			rec.cyov_qunt = Util.checkString(rset0.getString("cyov_qunt"));
			rec.cyov_rcpm_amt = Util.checkString(rset0.getString("cyov_rcpm_amt"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_1010_LDataSet ds = (SE_BNS_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1010_LCURLISTRecord curlistRec = (SE_BNS_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.basi_yymm%>
<%= curlistRec.compen_divn_amt%>
<%= curlistRec.qunt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.bal%>
<%= curlistRec.cyov_compen_divn_amt%>
<%= curlistRec.cyov_qunt%>
<%= curlistRec.cyov_rcpm_amt%>
<%= curlistRec.cyov_bal%>
<%= curlistRec.rcpm_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 31 11:07:52 KST 2017 */