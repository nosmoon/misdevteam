/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_EVLU_5903_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_evlu;
	public String evlu_proc_stat;

	public HD_EVLU_5903_LDataSet(){}
	public HD_EVLU_5903_LDataSet(String errcode, String errmsg, String tot_evlu, String evlu_proc_stat){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_evlu = tot_evlu;
		this.evlu_proc_stat = evlu_proc_stat;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_evlu(String tot_evlu){
		this.tot_evlu = tot_evlu;
	}

	public void setEvlu_proc_stat(String evlu_proc_stat){
		this.evlu_proc_stat = evlu_proc_stat;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_evlu(){
		return this.tot_evlu;
	}

	public String getEvlu_proc_stat(){
		return this.evlu_proc_stat;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_evlu = Util.checkString(cstmt.getString(9));
		this.evlu_proc_stat = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			HD_EVLU_5903_LCURLISTRecord rec = new HD_EVLU_5903_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			rec.tgt_evlu_pers_emp_no = Util.checkString(rset0.getString("tgt_evlu_pers_emp_no"));
			rec.evlu_subj_cd = Util.checkString(rset0.getString("evlu_subj_cd"));
			rec.evlu_subj_nm = Util.checkString(rset0.getString("evlu_subj_nm"));
			rec.evlu_item_cd = Util.checkString(rset0.getString("evlu_item_cd"));
			rec.evlu_item_nm = Util.checkString(rset0.getString("evlu_item_nm"));
			rec.viewpoint = Util.checkString(rset0.getString("viewpoint"));
			rec.t1_cd = Util.checkString(rset0.getString("t1_cd"));
			rec.t1_scor = Util.checkString(rset0.getString("t1_scor"));
			rec.t1_chk = Util.checkString(rset0.getString("t1_chk"));
			rec.t2_cd = Util.checkString(rset0.getString("t2_cd"));
			rec.t2_scor = Util.checkString(rset0.getString("t2_scor"));
			rec.t2_chk = Util.checkString(rset0.getString("t2_chk"));
			rec.t3_cd = Util.checkString(rset0.getString("t3_cd"));
			rec.t3_scor = Util.checkString(rset0.getString("t3_scor"));
			rec.t3_chk = Util.checkString(rset0.getString("t3_chk"));
			rec.t4_cd = Util.checkString(rset0.getString("t4_cd"));
			rec.t4_scor = Util.checkString(rset0.getString("t4_scor"));
			rec.t4_chk = Util.checkString(rset0.getString("t4_chk"));
			rec.t5_cd = Util.checkString(rset0.getString("t5_cd"));
			rec.t5_scor = Util.checkString(rset0.getString("t5_scor"));
			rec.t5_chk = Util.checkString(rset0.getString("t5_chk"));
			rec.t6_cd = Util.checkString(rset0.getString("t6_cd"));
			rec.t6_scor = Util.checkString(rset0.getString("t6_scor"));
			rec.t6_chk = Util.checkString(rset0.getString("t6_chk"));
			rec.t7_cd = Util.checkString(rset0.getString("t7_cd"));
			rec.t7_scor = Util.checkString(rset0.getString("t7_scor"));
			rec.t7_chk = Util.checkString(rset0.getString("t7_chk"));
			rec.t_opn = Util.checkString(rset0.getString("t_opn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_5903_LDataSet ds = (HD_EVLU_5903_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_5903_LCURLISTRecord curlistRec = (HD_EVLU_5903_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_evlu()%>
<%= ds.getEvlu_proc_stat()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
<%= curlistRec.tgt_evlu_pers_emp_no%>
<%= curlistRec.evlu_subj_cd%>
<%= curlistRec.evlu_subj_nm%>
<%= curlistRec.evlu_item_cd%>
<%= curlistRec.evlu_item_nm%>
<%= curlistRec.viewpoint%>
<%= curlistRec.t1_cd%>
<%= curlistRec.t1_scor%>
<%= curlistRec.t1_chk%>
<%= curlistRec.t2_cd%>
<%= curlistRec.t2_scor%>
<%= curlistRec.t2_chk%>
<%= curlistRec.t3_cd%>
<%= curlistRec.t3_scor%>
<%= curlistRec.t3_chk%>
<%= curlistRec.t4_cd%>
<%= curlistRec.t4_scor%>
<%= curlistRec.t4_chk%>
<%= curlistRec.t5_cd%>
<%= curlistRec.t5_scor%>
<%= curlistRec.t5_chk%>
<%= curlistRec.t6_cd%>
<%= curlistRec.t6_scor%>
<%= curlistRec.t6_chk%>
<%= curlistRec.t7_cd%>
<%= curlistRec.t7_scor%>
<%= curlistRec.t7_chk%>
<%= curlistRec.t_opn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 09 15:39:14 KST 2015 */