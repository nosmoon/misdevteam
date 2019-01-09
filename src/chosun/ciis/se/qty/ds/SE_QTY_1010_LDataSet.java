/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2007-05-22
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rownum;
	public String title;
	public String qty_sell_net_clsf;

	public SE_QTY_1010_LDataSet(){}
	public SE_QTY_1010_LDataSet(String errcode, String errmsg, String rownum, String title, String qty_sell_net_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rownum = rownum;
		this.title = title;
		this.qty_sell_net_clsf = qty_sell_net_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRownum(String rownum){
		this.rownum = rownum;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setQty_sell_net_clsf(String qty_sell_net_clsf){
		this.qty_sell_net_clsf = qty_sell_net_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRownum(){
		return this.rownum;
	}

	public String getTitle(){
		return this.title;
	}

	public String getQty_sell_net_clsf(){
		return this.qty_sell_net_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_QTY_1010_LCURLISTRecord rec = new SE_QTY_1010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.cyov_dt = Util.checkString(rset0.getString("cyov_dt"));
			rec.send_basi_dt = Util.checkString(rset0.getString("send_basi_dt"));
			rec.val_meda_yn = Util.checkString(rset0.getString("val_meda_yn"));
			rec.val_aply_basi_clsf = Util.checkString(rset0.getString("val_aply_basi_clsf"));
			rec.val_rate = Util.checkString(rset0.getString("val_rate"));
			this.curlist.add(rec);
		}
		this.rownum = Util.checkString(cstmt.getString(10));
		this.title = Util.checkString(cstmt.getString(11));
		this.qty_sell_net_clsf = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_1010_LDataSet ds = (SE_QTY_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_1010_LCURLISTRecord curlistRec = (SE_QTY_1010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRownum()%>
<%= ds.getTitle()%>
<%= ds.getQty_sell_net_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.tms%>
<%= curlistRec.cyov_dt%>
<%= curlistRec.send_basi_dt%>
<%= curlistRec.val_meda_yn%>
<%= curlistRec.val_aply_basi_clsf%>
<%= curlistRec.val_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 14:15:29 KST 2009 */