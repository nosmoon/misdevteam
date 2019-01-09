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


package chosun.ciis.as.mach.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_MACH_1010_LDataSet(){}
	public AS_MACH_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AS_MACH_1010_LCURLISTRecord rec = new AS_MACH_1010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mach_seq = Util.checkString(rset0.getString("mach_seq"));
			rec.work_clsf = Util.checkString(rset0.getString("work_clsf"));
			rec.work_clsf_nm = Util.checkString(rset0.getString("work_clsf_nm"));
			rec.mach_clsf = Util.checkString(rset0.getString("mach_clsf"));
			rec.mach_clsf_nm = Util.checkString(rset0.getString("mach_clsf_nm"));
			rec.bldg_clsf = Util.checkString(rset0.getString("bldg_clsf"));
			rec.bldg_clsf_nm = Util.checkString(rset0.getString("bldg_clsf_nm"));
			rec.mach_name = Util.checkString(rset0.getString("mach_name"));
			rec.model_name = Util.checkString(rset0.getString("model_name"));
			rec.stnd = Util.checkString(rset0.getString("stnd"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.loca = Util.checkString(rset0.getString("loca"));
			rec.life_year = Util.checkString(rset0.getString("life_year"));
			rec.make_comp = Util.checkString(rset0.getString("make_comp"));
			rec.inst_comp = Util.checkString(rset0.getString("inst_comp"));
			rec.inst_fee = rset0.getInt("inst_fee");
			rec.inst_dt = Util.checkString(rset0.getString("inst_dt"));
			rec.exp_dt = Util.checkString(rset0.getString("exp_dt"));
			rec.as_comp = Util.checkString(rset0.getString("as_comp"));
			rec.as_fee = rset0.getInt("as_fee");
			rec.as_tel = Util.checkString(rset0.getString("as_tel"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_MACH_1010_LDataSet ds = (AS_MACH_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_MACH_1010_LCURLISTRecord curlistRec = (AS_MACH_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.mach_seq%>
<%= curlistRec.work_clsf%>
<%= curlistRec.work_clsf_nm%>
<%= curlistRec.mach_clsf%>
<%= curlistRec.mach_clsf_nm%>
<%= curlistRec.bldg_clsf%>
<%= curlistRec.bldg_clsf_nm%>
<%= curlistRec.mach_name%>
<%= curlistRec.model_name%>
<%= curlistRec.stnd%>
<%= curlistRec.usag%>
<%= curlistRec.loca%>
<%= curlistRec.life_year%>
<%= curlistRec.make_comp%>
<%= curlistRec.inst_comp%>
<%= curlistRec.inst_fee%>
<%= curlistRec.inst_dt%>
<%= curlistRec.exp_dt%>
<%= curlistRec.as_comp%>
<%= curlistRec.as_fee%>
<%= curlistRec.as_tel%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 13:59:12 KST 2015 */