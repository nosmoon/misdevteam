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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1042_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1042_LDataSet(){}
	public HD_INFO_1042_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_1042_LCURLISTRecord rec = new HD_INFO_1042_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.army_clsf_cd = Util.checkString(rset0.getString("army_clsf_cd"));
			rec.forc_clsi_cd = Util.checkString(rset0.getString("forc_clsi_cd"));
			rec.army_svc_cd = Util.checkString(rset0.getString("army_svc_cd"));
			rec.cmmd_army_part_cd = Util.checkString(rset0.getString("cmmd_army_part_cd"));
			rec.cmmd_army_part_nm = Util.checkString(rset0.getString("cmmd_army_part_nm"));
			rec.sold_main_spc_cd = Util.checkString(rset0.getString("sold_main_spc_cd"));
			rec.sold_main_spc_nm = Util.checkString(rset0.getString("sold_main_spc_nm"));
			rec.army_cd  = Util.checkString(rset0.getString("army_cd"));
			rec.crps_spc_cd = Util.checkString(rset0.getString("crps_spc_cd"));
			rec.cls_cd = Util.checkString(rset0.getString("cls_cd"));
			rec.forc_no = Util.checkString(rset0.getString("forc_no"));
			rec.in_army_dt = Util.checkString(rset0.getString("in_army_dt"));
			rec.out_army_dt = Util.checkString(rset0.getString("out_army_dt"));
			rec.out_army_clsf_cd = Util.checkString(rset0.getString("out_army_clsf_cd"));
			rec.army_un_finsh_resn_cd = Util.checkString(rset0.getString("army_un_finsh_resn_cd"));
			rec.rsv_forc_form_cd = Util.checkString(rset0.getString("rsv_forc_form_cd"));
			rec.rsv_forc_form_dt = Util.checkString(rset0.getString("rsv_forc_form_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1042_LDataSet ds = (HD_INFO_1042_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1042_LCURLISTRecord curlistRec = (HD_INFO_1042_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.army_clsf_cd%>
<%= curlistRec.forc_clsi_cd%>
<%= curlistRec.army_svc_cd%>
<%= curlistRec.cmmd_army_part_cd%>
<%= curlistRec.cmmd_army_part_nm%>
<%= curlistRec.sold_main_spc_cd%>
<%= curlistRec.sold_main_spc_nm%>
<%= curlistRec.crps_spc_cd%>
<%= curlistRec.cls_cd%>
<%= curlistRec.forc_no%>
<%= curlistRec.in_army_dt%>
<%= curlistRec.out_army_dt%>
<%= curlistRec.out_army_clsf_cd%>
<%= curlistRec.army_un_finsh_resn_cd%>
<%= curlistRec.rsv_forc_form_cd%>
<%= curlistRec.rsv_forc_form_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 13 13:22:12 KST 2009 */