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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2035_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long new_cnt;
	public long chg_cnt;
	public long rgn_cnt;
	public long tmprgn_cnt;
	public long tot_cnt;
	public long cmsidx;

	public TN_LNK_2035_ADataSet(){}
	public TN_LNK_2035_ADataSet(String errcode, String errmsg, long new_cnt, long chg_cnt, long rgn_cnt, long tmprgn_cnt, long tot_cnt, long cmsidx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.new_cnt = new_cnt;
		this.chg_cnt = chg_cnt;
		this.rgn_cnt = rgn_cnt;
		this.tmprgn_cnt = tmprgn_cnt;
		this.tot_cnt = tot_cnt;
		this.cmsidx  = cmsidx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNew_cnt(long new_cnt){
		this.new_cnt = new_cnt;
	}

	public void setChg_cnt(long chg_cnt){
		this.chg_cnt = chg_cnt;
	}

	public void setRgn_cnt(long rgn_cnt){
		this.rgn_cnt = rgn_cnt;
	}

	public void setTmprgn_cnt(long tmprgn_cnt){
		this.tmprgn_cnt = tmprgn_cnt;
	}

	public void setTot_cnt(long tot_cnt){
		this.tot_cnt = tot_cnt;
	}
	
	public void setCmsidx(long cmsidx){
		this.cmsidx = cmsidx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getNew_cnt(){
		return this.new_cnt;
	}

	public long getChg_cnt(){
		return this.chg_cnt;
	}

	public long getRgn_cnt(){
		return this.rgn_cnt;
	}

	public long getTmprgn_cnt(){
		return this.tmprgn_cnt;
	}

	public long getTot_cnt(){
		return this.tot_cnt;
	}
	
	public long getCmsidx(){
		return this.cmsidx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.new_cnt = cstmt.getLong(8);
		this.chg_cnt = cstmt.getLong(9);
		this.rgn_cnt = cstmt.getLong(10);
		this.tmprgn_cnt = cstmt.getLong(11);
		this.tot_cnt = cstmt.getLong(12);
		this.cmsidx  = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			TN_LNK_2035_ACURLISTRecord rec = new TN_LNK_2035_ACURLISTRecord();
			rec.file_data = Util.checkString(rset0.getString("file_data"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_2035_ADataSet ds = (TN_LNK_2035_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_2035_ACURLISTRecord curlistRec = (TN_LNK_2035_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNew_cnt()%>
<%= ds.getChg_cnt()%>
<%= ds.getRgn_cnt()%>
<%= ds.getTmprgn_cnt()%>
<%= ds.getTot_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.file_data%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 18 17:14:01 KST 2016 */