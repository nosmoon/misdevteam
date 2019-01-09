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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2451_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String spcl_plus_point;
	public String spcl_minus_point;
	public String sum;

	public HD_EVLU_2451_LDataSet(){}
	public HD_EVLU_2451_LDataSet(String errcode, String errmsg, String spcl_plus_point, String spcl_minus_point, String sum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.spcl_plus_point = spcl_plus_point;
		this.spcl_minus_point = spcl_minus_point;
		this.sum = sum;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSpcl_plus_point(String spcl_plus_point){
		this.spcl_plus_point = spcl_plus_point;
	}

	public void setSpcl_minus_point(String spcl_minus_point){
		this.spcl_minus_point = spcl_minus_point;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSpcl_plus_point(){
		return this.spcl_plus_point;
	}

	public String getSpcl_minus_point(){
		return this.spcl_minus_point;
	}

	public String getSum(){
		return this.sum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.spcl_plus_point = Util.checkString(cstmt.getString(7));
		this.spcl_minus_point = Util.checkString(cstmt.getString(8));
		this.sum = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_EVLU_2451_LCURLISTRecord rec = new HD_EVLU_2451_LCURLISTRecord();
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.prz_pnsh_cd = Util.checkString(rset0.getString("prz_pnsh_cd"));
			rec.prz_pnsh_nm = Util.checkString(rset0.getString("prz_pnsh_nm"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.point = Util.checkString(rset0.getString("point"));
			rec.spc_psdo_redu_scorcnt = Util.checkString(rset0.getString("spc_psdo_redu_scorcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2451_LDataSet ds = (HD_EVLU_2451_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2451_LCURLISTRecord curlistRec = (HD_EVLU_2451_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSpcl_plus_point()%>
<%= ds.getSpcl_minus_point()%>
<%= ds.getSum()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.seq%>
<%= curlistRec.prz_pnsh_cd%>
<%= curlistRec.prz_pnsh_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.point%>
<%= curlistRec.spc_psdo_redu_scorcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 27 15:05:48 KST 2014 */