/***************************************************************************************************
* 파일명 : SE_SND_2820_LDataSet.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-26
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2820_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2820_LDataSet(){}
	public SE_SND_2820_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_2820_LCURLISTRecord rec = new SE_SND_2820_LCURLISTRecord();
			rec.cmpy_cd 			= Util.checkString(rset0.getString("cmpy_cd"			));
			rec.issu_dt 			= Util.checkString(rset0.getString("issu_dt"			));
			rec.clos_tms 			= Util.checkString(rset0.getString("clos_tms"			));
			rec.route_clsf 			= Util.checkString(rset0.getString("route_clsf"			));
			rec.route_clsf_nm		= Util.checkString(rset0.getString("route_clsf_nm"		));
			rec.prt_dt 				= Util.checkString(rset0.getString("prt_dt"				));
			rec.medi_cd 			= Util.checkString(rset0.getString("medi_cd"			));
			rec.medi_nm 			= Util.checkString(rset0.getString("medi_nm"			));
			rec.sect_cd 			= Util.checkString(rset0.getString("sect_cd"			));
			rec.sect_nm 			= Util.checkString(rset0.getString("sect_nm"			));
			rec.pcnt 				= Util.checkString(rset0.getString("pcnt"				));
			rec.clr_pcnt 			= Util.checkString(rset0.getString("clr_pcnt"			));
			rec.add_prt_seq 		= Util.checkString(rset0.getString("add_prt_seq"		));
			rec.qty 				= Util.checkString(rset0.getString("qty"				));
			rec.send_yn 			= Util.checkString(rset0.getString("send_yn"			));
			rec.send_medi_cd 		= Util.checkString(rset0.getString("send_medi_cd"		));
			rec.clos_dt_tm	 		= Util.checkString(rset0.getString("clos_dt_tm"			));
			rec.send_clos_grp_clsf	= Util.checkString(rset0.getString("send_clos_grp_clsf"	));
			rec.clos_dt				= Util.checkString(rset0.getString("clos_dt"			));
			rec.clos_tm				= Util.checkString(rset0.getString("clos_tm"			));
			rec.yn					= Util.checkString(rset0.getString("yn"					));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2820_LDataSet ds = (SE_SND_2820_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2820_LCURLISTRecord curlistRec = (SE_SND_2820_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.issu_dt%>
<%= curlistRec.clos_tms%>
<%= curlistRec.route_clsf%>
<%= curlistRec.prt_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.add_prt_seq%>
<%= curlistRec.qty%>
<%= curlistRec.send_yn%>
<%= curlistRec.send_medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 15:04:40 KST 2009 */